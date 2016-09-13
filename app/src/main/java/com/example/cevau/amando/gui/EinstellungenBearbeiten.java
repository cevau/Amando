package com.example.cevau.amando.gui;

import android.os.Bundle;
import android.preference.PreferenceActivity;

import com.example.cevau.amando.R;

/**
 * Created by cevau on 9/13/2016.
 */
public class EinstellungenBearbeiten extends PreferenceActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        this.addPreferencesFromResource(R.xml.amando_einstellungen);
        //https://developer.android.com/reference/android/preference/PreferenceActivity.html
    }
}
