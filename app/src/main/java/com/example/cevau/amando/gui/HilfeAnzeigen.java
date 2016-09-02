package com.example.cevau.amando.gui;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.webkit.WebView;

import com.example.cevau.amando.R;

import java.io.IOException;
import java.io.InputStream;

/**
 * Created by cevau on 9/2/2016.
 */
public class HilfeAnzeigen extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hilfe_anzeigen);

        final WebView view =(WebView)findViewById(R.id.webview);
        view.getSettings().setJavaScriptEnabled(true);
        intitialisiereWebKit(view,this);
        view.bringToFront();
    }

    private void intitialisiereWebKit(WebView view, Context context){
        final String mimetiype ="text/html";
        final String encoding ="UTF-8";
        String htmldata;
        int contextMenueId = R.raw.hilfe_komplett;
        InputStream is = context.getResources().openRawResource(contextMenueId);
        try{
            if(is!=null && is.available() >0){
                final byte[] bytes = new byte[is.available()];
                is.read(bytes);
                htmldata=new String(bytes);
                view.loadDataWithBaseURL(null, htmldata, mimetiype, encoding, null);
            }
        }
        catch (IOException e){}

    }


}
