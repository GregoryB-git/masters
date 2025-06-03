/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.BroadcastReceiver
 *  android.content.Context
 *  android.content.Intent
 *  android.content.IntentFilter
 *  android.net.Uri
 *  android.os.Bundle
 *  android.os.Message
 *  android.view.KeyEvent
 *  android.view.View
 *  android.webkit.WebChromeClient
 *  android.webkit.WebResourceRequest
 *  android.webkit.WebSettings
 *  android.webkit.WebView
 *  android.webkit.WebView$WebViewTransport
 *  android.webkit.WebViewClient
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Collections
 *  java.util.HashMap
 *  java.util.Map
 *  java.util.Set
 */
package io.flutter.plugins.urllauncher;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Bundle;
import android.os.Message;
import android.view.KeyEvent;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import x.a;

public class WebViewActivity
extends Activity {
    public final BroadcastReceiver o;
    public final WebViewClient p;
    public WebView q;
    public final IntentFilter r;

    public WebViewActivity() {
        this.o = new BroadcastReceiver(){

            public void onReceive(Context context, Intent intent) {
                if ("close action".equals((Object)intent.getAction())) {
                    WebViewActivity.this.finish();
                }
            }
        };
        this.p = new WebViewClient(){

            public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
                webView.loadUrl(webResourceRequest.getUrl().toString());
                return false;
            }

            public boolean shouldOverrideUrlLoading(WebView webView, String string2) {
                return super.shouldOverrideUrlLoading(webView, string2);
            }
        };
        this.r = new IntentFilter("close action");
    }

    public static Intent a(Context context, String string2, boolean bl, boolean bl2, Bundle bundle) {
        return new Intent(context, WebViewActivity.class).putExtra("url", string2).putExtra("enableJavaScript", bl).putExtra("enableDomStorage", bl2).putExtra("com.android.browser.headers", bundle);
    }

    public static Map b(Bundle bundle) {
        if (bundle == null) {
            return Collections.emptyMap();
        }
        HashMap hashMap = new HashMap();
        for (String string2 : bundle.keySet()) {
            hashMap.put((Object)string2, (Object)bundle.getString(string2));
        }
        return hashMap;
    }

    public void onCreate(Bundle object) {
        super.onCreate((Bundle)object);
        object = new WebView((Context)this);
        this.q = object;
        this.setContentView((View)object);
        Intent intent = this.getIntent();
        object = intent.getStringExtra("url");
        boolean bl = intent.getBooleanExtra("enableJavaScript", false);
        boolean bl2 = intent.getBooleanExtra("enableDomStorage", false);
        intent = WebViewActivity.b(intent.getBundleExtra("com.android.browser.headers"));
        this.q.loadUrl((String)object, (Map)intent);
        this.q.getSettings().setJavaScriptEnabled(bl);
        this.q.getSettings().setDomStorageEnabled(bl2);
        this.q.setWebViewClient(this.p);
        this.q.getSettings().setSupportMultipleWindows(true);
        this.q.setWebChromeClient((WebChromeClient)new c());
        a.h((Context)this, this.o, this.r, 2);
    }

    public void onDestroy() {
        super.onDestroy();
        this.unregisterReceiver(this.o);
    }

    public boolean onKeyDown(int n8, KeyEvent keyEvent) {
        if (n8 == 4 && this.q.canGoBack()) {
            this.q.goBack();
            return true;
        }
        return super.onKeyDown(n8, keyEvent);
    }

    public class c
    extends WebChromeClient {
        public boolean onCreateWindow(WebView object, boolean bl, boolean bl2, Message message) {
            object = new WebViewClient(){

                public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
                    WebViewActivity.this.q.loadUrl(webResourceRequest.getUrl().toString());
                    return true;
                }

                public boolean shouldOverrideUrlLoading(WebView webView, String string2) {
                    WebViewActivity.this.q.loadUrl(string2);
                    return true;
                }
            };
            WebView webView = new WebView(WebViewActivity.this.q.getContext());
            webView.setWebViewClient((WebViewClient)object);
            ((WebView.WebViewTransport)message.obj).setWebView(webView);
            message.sendToTarget();
            return true;
        }

    }

}

