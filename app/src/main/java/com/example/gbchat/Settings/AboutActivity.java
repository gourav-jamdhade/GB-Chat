package com.example.gbchat.Settings;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

import com.example.gbchat.R;

public class AboutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        WebView webView = findViewById(R.id.webViewAboutDialog);
        webView.loadDataWithBaseURL(null, getString(R.string.about_content), "text/html", "utf-8", null);
    }
}