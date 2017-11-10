package com.example.fengjian.mypreference;

import android.content.SharedPreferences;
import android.preference.EditTextPreference;
import android.preference.Preference;
import android.preference.PreferenceActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends PreferenceActivity implements SharedPreferences.OnSharedPreferenceChangeListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.layout);

        addPreferencesFromResource(R.xml.layout);

        Preference ratePref=findPreference("pref_rate");
    }

    @Override
    protected void onResume() {
        super.onResume();

        getPreferenceScreen().getSharedPreferences().registerOnSharedPreferenceChangeListener(this);
    }

    @Override
    protected void onPause() {
        super.onPause();

        getPreferenceScreen().getSharedPreferences().unregisterOnSharedPreferenceChangeListener(this);
    }

    @Override
    public void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String s) {
        if(s.equals("pref_username")) {
            updateUserText();
        }
    }

    private void updateUserText(){
        EditTextPreference pref;
        pref=(EditTextPreference)findPreference("pref_username");
        String user=pref.getText();
        if(user==null){
            user="?";
        }
        pref.setSummary(String.format("Username: %s,user"));
    }

}
