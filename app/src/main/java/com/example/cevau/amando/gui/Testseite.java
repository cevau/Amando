package com.example.cevau.amando.gui;

import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresPermission;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.example.cevau.amando.R;

import java.util.Map;
import java.util.jar.Manifest;

/**
 * Created by cevau on 9/13/2016.
 */
public class Testseite extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.testseite);
    }

    public void onClickReadEinstellungen(final View sfNormal) {

        //SharedPreferences einstellungen = this.getPreferences(MODE_PRIVATE);      //holt die preferences für diese Activity !!!
        //SharedPreferences einstellungen = this.getSharedPreferences("com.example.cevau.amando_preferences",MODE_PRIVATE);  //klappt !!!
        SharedPreferences einstellungen = PreferenceManager.getDefaultSharedPreferences(this);      //holt die app übergreifenden einstellungen.

        Map<String, ?> allEntries = einstellungen.getAll();
        for (Map.Entry<String, ?> entry : allEntries.entrySet()) {
            Log.d("map values", entry.getKey() + ": " + entry.getValue().toString());
        }

        String nickname = einstellungen.getString("nickname","nothing found");
        sendToast(nickname);
    }

    public void onClickWriteEinstellungen(final View sfNormal) {
        SharedPreferences einstellungen = PreferenceManager.getDefaultSharedPreferences(this);      //holt die app übergreifenden einstellungen.
        SharedPreferences.Editor editor = einstellungen.edit();
        editor.putBoolean("nutzeVerschlüsselung",true);
        editor.commit();
    }

    public void onClickMakePhoneCall(final View sfNormal){
        sendToast("MakePhoneCall");
        Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:(+49) 15234542904"));
        //Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:(+49) 15234542904"));
        startActivity(intent);
    }


    private void sendToast(String msg){
        final Toast hinweis = Toast.makeText(this,msg,Toast.LENGTH_LONG);
        hinweis.show();
    }

}
