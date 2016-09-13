package com.example.cevau.amando.gui;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.example.cevau.amando.R;

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
        sendToast("ReadEinstellungen");


    }

    private void sendToast(String msg){
        final Toast hinweis = Toast.makeText(this,msg,Toast.LENGTH_LONG);
        hinweis.show();
    }

}
