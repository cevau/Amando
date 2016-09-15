package com.example.cevau.amando.gui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.example.cevau.amando.R;

/**
 * Created by cevau on 9/15/2016.
 */
public class PositionSenden extends Activity {

    private long mGeoKontaktId;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.position_senden);

        //neue Intent diesmal als Sub Activity Aufruf = Explizieter Intent an die Activity
        final Intent intent = new Intent(this,GeoKontakteAuflisten.class);
        intent.putExtra(GeoKontakteAuflisten.SELECT_KONTAKT, true);
        startActivityForResult(intent,0);
    }

    /**
     * Dispatch incoming result to the correct fragment.
     *
     * @param requestCode
     * @param resultCode
     * @param data
     */
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        switch (resultCode){
            case Activity.RESULT_OK:
                mGeoKontaktId = data.getExtras().getLong(GeoKontakteAuflisten.IN_PARAM_KONTAKT_ID);
                break;
            case Activity.RESULT_CANCELED:
                finish();
                break;
            default:
                //Fehlerbehandlung
                break;
        }
        super.onActivityResult(requestCode, resultCode, data);
    }


    @Override
    protected void onStart(){
        //TODO Lade Geokontakt aus der Datenbank und zeige ihn an.
        //die ID ist in : mGeoKontaktId
        super.onStart();
    }

}
