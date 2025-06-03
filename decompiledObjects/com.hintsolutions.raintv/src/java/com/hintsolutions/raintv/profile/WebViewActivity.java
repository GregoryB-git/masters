/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.annotation.SuppressLint
 *  android.app.Activity
 *  android.content.Intent
 *  android.net.Uri
 *  android.os.Bundle
 *  android.text.TextUtils
 *  android.util.Base64
 *  android.webkit.JavascriptInterface
 *  android.webkit.WebView
 *  android.webkit.WebViewClient
 *  butterknife.BindView
 *  butterknife.ButterKnife
 *  java.io.UnsupportedEncodingException
 *  java.lang.CharSequence
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 *  org.json.JSONObject
 *  org.jsoup.Jsoup
 *  org.jsoup.nodes.Element
 *  tvrain.utils.ConstsKt
 */
package com.hintsolutions.raintv.profile;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import butterknife.BindView;
import butterknife.ButterKnife;
import java.io.UnsupportedEncodingException;
import org.json.JSONObject;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Element;
import tvrain.utils.ConstsKt;

public class WebViewActivity
extends Activity {
    @BindView(value=2131296373)
    public WebView authWebView;

    private String getHeadersHash() {
        String string2 = String.format((String)"{\"X-User-Agent\":\"%s\",\"Accept\":\"%s\"}", (Object[])new Object[]{ConstsKt.getUserAgentHeader(), ConstsKt.getAcceptHeader()});
        try {
            string2 = Base64.encodeToString((byte[])string2.getBytes("UTF-8"), (int)2);
            return string2;
        }
        catch (UnsupportedEncodingException unsupportedEncodingException) {
            unsupportedEncodingException.printStackTrace();
            return null;
        }
    }

    @SuppressLint(value={"SetJavaScriptEnabled"})
    private void initWebView() {
        try {
            this.authWebView.getSettings().setJavaScriptEnabled(true);
            this.authWebView.getSettings().setDatabaseEnabled(true);
            this.authWebView.getSettings().setDomStorageEnabled(true);
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        this.authWebView.addJavascriptInterface((Object)new CustomJsInterface(this), "HtmlViewer");
        this.authWebView.setWebViewClient(new WebViewClient(this){
            public final WebViewActivity this$0;
            {
                this.this$0 = webViewActivity;
            }

            public void onPageFinished(WebView webView, String string2) {
                super.onPageFinished(webView, string2);
                try {
                    if (string2.contains((CharSequence)"device_token") && string2.contains((CharSequence)"user_id")) {
                        webView = Uri.parse((String)string2);
                        this.this$0.onResultReceived(webView.getQueryParameter("device_token"), webView.getQueryParameter("user_id"));
                    } else {
                        this.this$0.authWebView.loadUrl("javascript:window.HtmlViewer.showHTML('<html>'+document.getElementsByTagName('html')[0].innerHTML+'</html>');");
                    }
                }
                catch (Exception exception) {
                    exception.printStackTrace();
                }
            }
        });
        this.authWebView.loadUrl(this.getUrl());
    }

    private void onResultReceived(String string2, String string3) {
        Intent intent = new Intent();
        intent.putExtra("device_token", string2);
        intent.putExtra("user_id", string3);
        this.setResult(-1, intent);
        this.finish();
    }

    public String getUrl() {
        String string2 = this.getIntent().getStringExtra("social_network");
        return String.format((String)"%suser/socauth/%s/%s/", (Object[])new Object[]{this.getString(2131755529), string2, this.getHeadersHash()});
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.setContentView(2131492915);
        ButterKnife.bind((Activity)this);
        this.initWebView();
    }

    public class CustomJsInterface {
        public final WebViewActivity this$0;

        public CustomJsInterface(WebViewActivity webViewActivity) {
            this.this$0 = webViewActivity;
        }

        @JavascriptInterface
        public void showHTML(String string2) {
            if (!TextUtils.isEmpty((CharSequence)string2) && string2.contains((CharSequence)"user_id") && string2.contains((CharSequence)"device_token")) {
                try {
                    string2 = ((Element)Jsoup.parse((String)string2, (String)"UTF-8").body().children().get(0)).childNode(0).toString().replaceAll("&quot;", "\"").replaceAll("\n", "");
                    JSONObject jSONObject = new JSONObject(string2);
                    this.this$0.onResultReceived(jSONObject.getString("device_token"), jSONObject.getString("user_id"));
                }
                catch (Exception exception) {
                    exception.printStackTrace();
                }
            }
        }
    }
}

