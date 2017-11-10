package com.example.fengjian.mypreference;

import android.content.Context;
import android.content.DialogInterface;
import android.content.pm.LauncherApps;
import android.preference.DialogPreference;
import android.util.AttributeSet;
import android.widget.Toast;

/**
 * Created by fengjian on 11/10/17.
 */

public class EmailDialog extends DialogPreference {
    public EmailDialog(Context context) {
        this(context,null);
    }

    public EmailDialog(Context context, AttributeSet attrs){
        this(context,attrs,0);
    }

    public EmailDialog(Context context,AttributeSet attrs,int defStyle) {
        super(context,attrs,defStyle);
    }

    @Override
    public void onClick(DialogInterface dialog, int which) {
        super.onClick(dialog, which);

        if(DialogInterface.BUTTON_POSITIVE==which){
            Toast.makeText(getContext(),"OK",Toast.LENGTH_LONG);
        }
    }
}
