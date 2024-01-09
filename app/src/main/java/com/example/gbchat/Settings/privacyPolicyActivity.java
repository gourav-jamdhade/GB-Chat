package com.example.gbchat.Settings;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

import com.example.gbchat.R;

public class privacyPolicyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_privacy_policy);

        WebView webView = findViewById(R.id.webViewPrivacyPolicy);
        webView.loadDataWithBaseURL(null, getString(R.string.privacy_policy_content), "text/html", "utf-8", null);
    }
}