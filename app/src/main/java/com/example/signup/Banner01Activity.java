package com.example.signup;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.KeyEvent;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Banner01Activity extends AppCompatActivity {

    private WebView WebView_Banner_01;
    private String URL_Banner_01 = "https://ediya.com/";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_banner01);

        WebView_Banner_01 = (WebView) findViewById(R.id.WebView_Banner_01);
        WebView_Banner_01.getSettings().setJavaScriptEnabled(true);
        WebView_Banner_01.loadUrl(URL_Banner_01);
        WebView_Banner_01.setWebChromeClient(new WebChromeClient());
        WebView_Banner_01.setWebViewClient(new WebViewClientClass());

    }
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if ((keyCode == KeyEvent.KEYCODE_BACK) && WebView_Banner_01.canGoBack()) {
            WebView_Banner_01.goBack();
            return true;
        }

        return super.onKeyDown(keyCode, event);
    }

    static class WebViewClientClass extends WebViewClient {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            view.loadUrl(url);
            return true;
        }
    }
}