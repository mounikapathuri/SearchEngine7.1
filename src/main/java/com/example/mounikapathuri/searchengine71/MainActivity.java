package com.example.mounikapathuri.searchengine71;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void Search(View v) {
        WebView myweb = (WebView) findViewById(R.id.Browesr);

        myweb.setWebViewClient(new WebViewClient());

        EditText text = (EditText) findViewById(R.id.etSearchhere);
        String url = "https://www.google.com/search?q=" + text.getText().toString();
        myweb.loadUrl(url);
    }
}



