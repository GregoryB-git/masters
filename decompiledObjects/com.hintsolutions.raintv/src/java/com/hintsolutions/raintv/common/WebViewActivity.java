/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.annotation.SuppressLint
 *  android.graphics.Bitmap
 *  android.os.Bundle
 *  android.webkit.WebChromeClient
 *  android.webkit.WebView
 *  android.webkit.WebViewClient
 *  android.widget.ProgressBar
 *  androidx.appcompat.widget.Toolbar
 *  butterknife.BindView
 *  java.lang.CharSequence
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 */
package com.hintsolutions.raintv.common;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;
import androidx.appcompat.widget.Toolbar;
import butterknife.BindView;
import com.hintsolutions.raintv.common.BaseActivity;

public class WebViewActivity
extends BaseActivity {
    @BindView(value=2131296679)
    public ProgressBar horizontalProgressBar;
    private String title;
    @BindView(value=2131297244)
    public Toolbar toolbar;
    private String url;
    @BindView(value=2131297346)
    public WebView webView;

    @SuppressLint(value={"SetJavaScriptEnabled"})
    private void initViews() {
        this.webView.getSettings().setJavaScriptEnabled(true);
        this.webView.setWebChromeClient(new WebChromeClient(this){
            public final WebViewActivity this$0;
            {
                this.this$0 = webViewActivity;
            }

            public void onProgressChanged(WebView webView, int n2) {
                super.onProgressChanged(webView, n2);
                try {
                    this.this$0.horizontalProgressBar.setProgress(n2);
                }
                catch (Exception exception) {
                    exception.printStackTrace();
                }
            }
        });
        this.webView.setWebViewClient(new WebViewClient(this){
            public final WebViewActivity this$0;
            {
                this.this$0 = webViewActivity;
            }

            public void onPageFinished(WebView webView, String string) {
                super.onPageFinished(webView, string);
            }

            public void onPageStarted(WebView webView, String string, Bitmap bitmap) {
                super.onPageStarted(webView, string, bitmap);
            }
        });
        this.webView.loadUrl(this.url);
    }

    private void parseIntent() {
        try {
            this.url = this.getIntent().getStringExtra("url");
        }
        catch (Exception exception) {
            this.url = null;
        }
        try {
            this.title = this.getIntent().getStringExtra("title");
        }
        catch (Exception exception) {
            this.title = this.url;
        }
        if (this.url == null) {
            this.finish();
        }
    }

    private void setupToolbar() {
        this.toolbar.setTitle((CharSequence)this.title);
        this.setSupportActionBar(this.toolbar);
        if (this.getSupportActionBar() != null) {
            this.getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            this.getSupportActionBar().setDisplayUseLogoEnabled(false);
        }
    }

    @Override
    public int getLayoutResource() {
        return 2131492916;
    }

    @Override
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.parseIntent();
        this.setupToolbar();
        this.initViews();
    }
}

