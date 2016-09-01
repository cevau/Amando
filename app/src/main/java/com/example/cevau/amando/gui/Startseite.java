package com.example.cevau.amando.gui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.example.cevau.amando.R;

public class Startseite extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        //Startseite festlegen
        setContentView(R.layout.startseite);

        //Kontextmenue hinzufügen für einzelne View = button starte geokontakte
        registerForContextMenu(findViewById(R.id.sf_starte_geokontakte));

        super.onCreate(savedInstanceState);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        /* just a debug demo */
        Log.d("tag","CV Message");

        //include the option-menu
        getMenuInflater().inflate(R.menu.hauptmenue, menu);

        return super.onCreateOptionsMenu(menu);
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.opt_einstellungenBearbeiten:
                Log.i("menu","opt_einstellungenBearbeiten");
                return false;
            case R.id.opt_hilfe:
                Log.i("menu","opt_hilfe");
                return false;
            case R.id.opt_amandoBeenden:
                Log.i("menu","opt_amandoBeenden");
                finish();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }


    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {

        //include context menu for each button which should have a context menu:
        switch (v.getId()){
            case R.id.sf_starte_geokontakte:
                getMenuInflater().inflate(R.menu.startseite_contextmenue,menu);
                return;
        }


        super.onCreateContextMenu(menu, v, menuInfo);
    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.opt_geokontakt_verwalten_hilfe:
                //todo rufe hilfeseite auf...
                return true;
        }
        return super.onContextItemSelected(item);
    }

    //OnClick auf die startseite auswerten:
    public void onClickPositionSenden(final View sfNormal) {
    //todo
        Log.i("click","PositionSenden");
    }

    public void onClickGeokontakteVerwalten(final View sfNormal) {
        //todo
        Log.i("click","GeokontakteVerwalten");
    }
    public void onClickKarteAnzeigen(final View sfNormal) {
        //todo
        Log.i("click","KarteAnzeigen");
    }
    public void onClickSimulationStarten(final View sfNormal) {
        //todo
        Log.i("click","SimulationStarten");
    }



}
