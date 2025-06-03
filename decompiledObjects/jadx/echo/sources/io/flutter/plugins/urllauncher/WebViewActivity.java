package io.flutter.plugins.urllauncher;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Message;
import android.view.KeyEvent;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import x.AbstractC2112a;

/* loaded from: classes.dex */
public class WebViewActivity extends Activity {

    /* renamed from: q, reason: collision with root package name */
    public WebView f15150q;

    /* renamed from: o, reason: collision with root package name */
    public final BroadcastReceiver f15148o = new a();

    /* renamed from: p, reason: collision with root package name */
    public final WebViewClient f15149p = new b();

    /* renamed from: r, reason: collision with root package name */
    public final IntentFilter f15151r = new IntentFilter("close action");

    public class a extends BroadcastReceiver {
        public a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if ("close action".equals(intent.getAction())) {
                WebViewActivity.this.finish();
            }
        }
    }

    public class b extends WebViewClient {
        public b() {
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            webView.loadUrl(webResourceRequest.getUrl().toString());
            return false;
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            return super.shouldOverrideUrlLoading(webView, str);
        }
    }

    public class c extends WebChromeClient {

        public class a extends WebViewClient {
            public a() {
            }

            @Override // android.webkit.WebViewClient
            public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
                WebViewActivity.this.f15150q.loadUrl(webResourceRequest.getUrl().toString());
                return true;
            }

            @Override // android.webkit.WebViewClient
            public boolean shouldOverrideUrlLoading(WebView webView, String str) {
                WebViewActivity.this.f15150q.loadUrl(str);
                return true;
            }
        }

        public c() {
        }

        @Override // android.webkit.WebChromeClient
        public boolean onCreateWindow(WebView webView, boolean z7, boolean z8, Message message) {
            a aVar = new a();
            WebView webView2 = new WebView(WebViewActivity.this.f15150q.getContext());
            webView2.setWebViewClient(aVar);
            ((WebView.WebViewTransport) message.obj).setWebView(webView2);
            message.sendToTarget();
            return true;
        }
    }

    public static Intent a(Context context, String str, boolean z7, boolean z8, Bundle bundle) {
        return new Intent(context, (Class<?>) WebViewActivity.class).putExtra("url", str).putExtra("enableJavaScript", z7).putExtra("enableDomStorage", z8).putExtra("com.android.browser.headers", bundle);
    }

    public static Map b(Bundle bundle) {
        if (bundle == null) {
            return Collections.emptyMap();
        }
        HashMap hashMap = new HashMap();
        for (String str : bundle.keySet()) {
            hashMap.put(str, bundle.getString(str));
        }
        return hashMap;
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        WebView webView = new WebView(this);
        this.f15150q = webView;
        setContentView(webView);
        Intent intent = getIntent();
        String stringExtra = intent.getStringExtra("url");
        boolean booleanExtra = intent.getBooleanExtra("enableJavaScript", false);
        boolean booleanExtra2 = intent.getBooleanExtra("enableDomStorage", false);
        this.f15150q.loadUrl(stringExtra, b(intent.getBundleExtra("com.android.browser.headers")));
        this.f15150q.getSettings().setJavaScriptEnabled(booleanExtra);
        this.f15150q.getSettings().setDomStorageEnabled(booleanExtra2);
        this.f15150q.setWebViewClient(this.f15149p);
        this.f15150q.getSettings().setSupportMultipleWindows(true);
        this.f15150q.setWebChromeClient(new c());
        AbstractC2112a.h(this, this.f15148o, this.f15151r, 2);
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        unregisterReceiver(this.f15148o);
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i7, KeyEvent keyEvent) {
        if (i7 != 4 || !this.f15150q.canGoBack()) {
            return super.onKeyDown(i7, keyEvent);
        }
        this.f15150q.goBack();
        return true;
    }
}
