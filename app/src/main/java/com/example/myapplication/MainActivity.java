package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        WebView w1 = (WebView) findViewById(R.id.webiview1);
        w1.loadUrl("file:///android_asset/good.html");
        WebSettings webSettings =w1.getSettings();
        webSettings.setJavaScriptEnabled(true);
    }
}