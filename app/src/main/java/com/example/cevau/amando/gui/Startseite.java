package com.example.cevau.amando.gui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;

import com.example.cevau.amando.R;

public class Startseite extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.startseite);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        /* just a comment */
        Log.d("tag","CV Message");
        getMenuInflater().inflate(R.menu.hauptmenue, menu);
        return super.onCreateOptionsMenu(menu);
    }

}
