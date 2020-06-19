package com.example.signup;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.KeyEvent;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.example.signup.Banner01Activity.WebViewClientClass;

public class Banner02Activity extends AppCompatActivity {

    private WebView WebView_Banner_02;
    private String URL_Banner_02 = "http://www.angelinus.com/";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_banner02);

        WebView_Banner_02 = (WebView) findViewById(R.id.WebView_Banner_02);
        WebView_Banner_02.getSettings().setJavaScriptEnabled(true);
        WebView_Banner_02.loadUrl(URL_Banner_02);
        WebView_Banner_02.setWebChromeClient(new WebChromeClient());
        WebView_Banner_02.setWebViewClient(new WebViewClientClass());
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if ((keyCode == KeyEvent.KEYCODE_BACK) && WebView_Banner_02.canGoBack()) {
            WebView_Banner_02.goBack();
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