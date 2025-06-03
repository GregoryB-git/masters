// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package io.flutter.plugins.urllauncher;

import android.os.BaseBundle;
import android.webkit.WebView$WebViewTransport;
import android.os.Message;
import android.view.KeyEvent;
import x.a;
import android.webkit.WebChromeClient;
import android.view.View;
import java.util.Iterator;
import java.util.HashMap;
import java.util.Collections;
import java.util.Map;
import android.os.Bundle;
import android.webkit.WebResourceRequest;
import android.content.Intent;
import android.content.Context;
import android.content.IntentFilter;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.content.BroadcastReceiver;
import android.app.Activity;

public class WebViewActivity extends Activity
{
    public final BroadcastReceiver o;
    public final WebViewClient p;
    public WebView q;
    public final IntentFilter r;
    
    public WebViewActivity() {
        this.o = new BroadcastReceiver() {
            public void onReceive(final Context context, final Intent intent) {
                if ("close action".equals(intent.getAction())) {
                    WebViewActivity.this.finish();
                }
            }
        };
        this.p = new WebViewClient() {
            public boolean shouldOverrideUrlLoading(final WebView webView, final WebResourceRequest webResourceRequest) {
                webView.loadUrl(webResourceRequest.getUrl().toString());
                return false;
            }
            
            public boolean shouldOverrideUrlLoading(final WebView webView, final String s) {
                return super.shouldOverrideUrlLoading(webView, s);
            }
        };
        this.r = new IntentFilter("close action");
    }
    
    public static Intent a(final Context context, final String s, final boolean b, final boolean b2, final Bundle bundle) {
        return new Intent(context, (Class)WebViewActivity.class).putExtra("url", s).putExtra("enableJavaScript", b).putExtra("enableDomStorage", b2).putExtra("com.android.browser.headers", bundle);
    }
    
    public static Map b(final Bundle bundle) {
        if (bundle == null) {
            return Collections.emptyMap();
        }
        final HashMap<String, String> hashMap = new HashMap<String, String>();
        for (final String s : ((BaseBundle)bundle).keySet()) {
            hashMap.put(s, ((BaseBundle)bundle).getString(s));
        }
        return hashMap;
    }
    
    public void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        this.setContentView((View)(this.q = new WebView((Context)this)));
        final Intent intent = this.getIntent();
        final String stringExtra = intent.getStringExtra("url");
        final boolean booleanExtra = intent.getBooleanExtra("enableJavaScript", false);
        final boolean booleanExtra2 = intent.getBooleanExtra("enableDomStorage", false);
        this.q.loadUrl(stringExtra, b(intent.getBundleExtra("com.android.browser.headers")));
        this.q.getSettings().setJavaScriptEnabled(booleanExtra);
        this.q.getSettings().setDomStorageEnabled(booleanExtra2);
        this.q.setWebViewClient(this.p);
        this.q.getSettings().setSupportMultipleWindows(true);
        this.q.setWebChromeClient((WebChromeClient)new c());
        a.h((Context)this, this.o, this.r, 2);
    }
    
    public void onDestroy() {
        super.onDestroy();
        ((Context)this).unregisterReceiver(this.o);
    }
    
    public boolean onKeyDown(final int n, final KeyEvent keyEvent) {
        if (n == 4 && this.q.canGoBack()) {
            this.q.goBack();
            return true;
        }
        return super.onKeyDown(n, keyEvent);
    }
    
    public class c extends WebChromeClient
    {
        public boolean onCreateWindow(final WebView webView, final boolean b, final boolean b2, final Message message) {
            final WebViewClient webViewClient = new WebViewClient() {
                public boolean shouldOverrideUrlLoading(final WebView webView, final WebResourceRequest webResourceRequest) {
                    WebViewActivity.this.q.loadUrl(webResourceRequest.getUrl().toString());
                    return true;
                }
                
                public boolean shouldOverrideUrlLoading(final WebView webView, final String s) {
                    WebViewActivity.this.q.loadUrl(s);
                    return true;
                }
            };
            final WebView webView2 = new WebView(((View)WebViewActivity.this.q).getContext());
            webView2.setWebViewClient((WebViewClient)webViewClient);
            ((WebView$WebViewTransport)message.obj).setWebView(webView2);
            message.sendToTarget();
            return true;
        }
    }
}
