package com.example.signup;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.KeyEvent;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Banner03Activity extends AppCompatActivity {

    private WebView WebView_Banner_03;
    private String URL_Banner_03 = "https://www.starbucks.co.kr/index.do";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_banner03);

        WebView_Banner_03 = (WebView) findViewById(R.id.WebView_Banner_03);
        WebView_Banner_03.getSettings().setJavaScriptEnabled(true);
        WebView_Banner_03.loadUrl(URL_Banner_03);
        WebView_Banner_03.setWebChromeClient(new WebChromeClient());
        WebView_Banner_03.setWebViewClient(new Banner03Activity.WebViewClientClass());
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if ((keyCode == KeyEvent.KEYCODE_BACK) && WebView_Banner_03.canGoBack()) {
            WebView_Banner_03.goBack();
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