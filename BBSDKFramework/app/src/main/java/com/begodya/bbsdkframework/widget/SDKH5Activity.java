package com.begodya.bbsdkframework.widget;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.begodya.bbsdkframework.R;

public class SDKH5Activity extends AppCompatActivity {
    private WebView webView;
    private Bundle bundle;
    private String htmlData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sdkh5);
    }

    private void setupWebView() {
        bundle = getIntent().getExtras();
        boolean loadData = bundle.getBoolean("load_data");
        htmlData = bundle.getString("data");
        String title = bundle.getString("title");


        webView = (WebView) findViewById(R.id.h5_webView);
        String URL = bundle.getString("url");
        webView.loadUrl(URL);
        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webSettings.setJavaScriptCanOpenWindowsAutomatically(true);
        webSettings.setBuiltInZoomControls(true);
        webSettings.supportMultipleWindows();
        webSettings.setAppCacheEnabled(false);

        if (!loadData && !(htmlData != null && htmlData.length() > 0)) {
            webView.setWebViewClient(new WebViewClient() {
                @Override
                public boolean shouldOverrideUrlLoading(WebView view, String url) {
                    view.loadUrl(url);
                    return true;
                }
            });
        } else {
            if (htmlData != null && htmlData.length() > 0) {
                webView.loadData(htmlData, "text/html; charset=UTF-8", null);
            }
        }
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if ((keyCode == KeyEvent.KEYCODE_BACK) && webView.canGoBack()) {
            webView.goBack();
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }
}
