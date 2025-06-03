/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.annotation.SuppressLint
 *  android.content.Intent
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
 *  java.util.regex.Matcher
 *  java.util.regex.Pattern
 */
package com.hintsolutions.raintv.profile;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;
import androidx.appcompat.widget.Toolbar;
import butterknife.BindView;
import com.hintsolutions.raintv.common.BaseActivity;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MailAuthActivity
extends BaseActivity {
    public static final String DATA_ERROR = "error";
    public static final String DATA_TOKEN = "token";
    public static final int RESULT_ERROR = 0;
    public static final int RESULT_OK = 1;
    @BindView(value=2131296679)
    public ProgressBar horizontalProgressBar;
    @BindView(value=2131297244)
    public Toolbar toolbar;
    @BindView(value=2131297346)
    public WebView webView;

    @SuppressLint(value={"SetJavaScriptEnabled"})
    private void initWebView(String string) {
        this.webView.getSettings().setJavaScriptEnabled(true);
        this.webView.setWebChromeClient(new WebChromeClient(this){
            public final MailAuthActivity this$0;
            {
                this.this$0 = mailAuthActivity;
            }

            public void onProgressChanged(WebView webView, int n4) {
                super.onProgressChanged(webView, n4);
                try {
                    this.this$0.horizontalProgressBar.setProgress(n4);
                }
                catch (Exception exception) {
                    exception.printStackTrace();
                }
            }
        });
        this.webView.setWebViewClient(new WebViewClient(this){
            public final MailAuthActivity this$0;
            {
                this.this$0 = mailAuthActivity;
            }

            public void onPageFinished(WebView webView, String string) {
                super.onPageFinished(webView, string);
            }

            public void onPageStarted(WebView webView, String string, Bitmap bitmap) {
                if (string.contains((CharSequence)"error=")) {
                    Matcher matcher = Pattern.compile((String)"success\\.html#.*?error=([^&]+)").matcher((CharSequence)string);
                    if (matcher.find()) {
                        webView = new Intent();
                        webView.putExtra("error", matcher.group(1));
                        this.this$0.setResult(0, (Intent)webView);
                        this.this$0.finish();
                        return;
                    }
                } else {
                    Matcher matcher = Pattern.compile((String)"success\\.html#.*?access_token=([^&]+)").matcher((CharSequence)string);
                    if (matcher.find()) {
                        webView = new Intent();
                        webView.putExtra("token", matcher.group(1));
                        this.this$0.setResult(1, (Intent)webView);
                        this.this$0.finish();
                        return;
                    }
                }
                super.onPageStarted(webView, string, bitmap);
            }
        });
        this.webView.loadUrl(string);
    }

    private void setupToolbar() {
        this.toolbar.setTitle((CharSequence)"\u0410\u0432\u0442\u043e\u0440\u0438\u0437\u0430\u0446\u0438\u044f Mail.Ru");
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
        this.setupToolbar();
        this.initWebView("https://connect.mail.ru/oauth/authorize?client_id=765213&response_type=token&redirect_uri=http%3A%2F%2Fconnect.mail.ru%2Foauth%2Fsuccess.html");
    }
}

