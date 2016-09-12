package com.example.cevau.amando.gui;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import com.example.cevau.amando.R;

import java.util.Arrays;

/**
 * Created by cevau on 9/5/2016.
 */
public class GeoKontakteAuflisten extends ListActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.geokontakte_auflisten);
        zeigeGeokontakte();
        ((Spinner)this.findViewById(R.id.sp_sortierung)).setOnItemSelectedListener(mSpinnerItemAuswahlListener);
    }

    private String[] NAMEN = new String[5];
    private ArrayAdapter<String> mKontaktAdapter;

    private void initialisiereNamen() {
        NAMEN[0] = "Christoph Voigt";
        NAMEN[1] = "Wayne Schlegel";
        NAMEN[2] = "Knut Hoppenstädt";
        NAMEN[3] = "Mickey Mouse";
        NAMEN[4] = "Bad Man";

    }

    private void zeigeGeokontakte() {
        initialisiereNamen();
        mKontaktAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, NAMEN);
        setListAdapter(mKontaktAdapter);
    }


    private AdapterView.OnItemSelectedListener mSpinnerItemAuswahlListener =
            new AdapterView.OnItemSelectedListener() {

                @Override
                public void onItemSelected(AdapterView<?> arg0, View arg1, int position, long id) {

                    switch(position){
                        case 0: //Standard
                            initialisiereNamen();
                            mKontaktAdapter.notifyDataSetChanged();
                            break;
                        case 2: //Namen
                            Arrays.sort(NAMEN);
                            mKontaktAdapter.notifyDataSetChanged();
                            break;
                        default:
                            break;
                    }
                }


                @Override
                public void onNothingSelected(AdapterView<?> arg0) {

                }

            };


}
