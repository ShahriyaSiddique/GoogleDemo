package com.example.googledemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

import com.example.facebookdemo.R;

public class Google extends AppCompatActivity {

    WebView google;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_google);

        google = findViewById(R.id.google_webview);
        WebSettings webSettings = google.getSettings();
        webSettings.setJavaScriptEnabled(true);
        google.loadUrl("https://www.google.com/");
        google.setWebViewClient(new WebViewClient());

        }

    @Override
    public void onBackPressed() {
        if(google.canGoBack())
        {
            google.goBack();
        }
        else {
            Toast.makeText(this, "Exiting the app", Toast.LENGTH_SHORT).show();
            super.onBackPressed();

        }
    }
}
