/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.http.SslError
 *  android.os.Bundle
 *  android.webkit.SslErrorHandler
 *  android.webkit.WebView
 *  android.webkit.WebViewClient
 *  java.lang.Object
 *  java.lang.String
 *  java.net.URI
 *  java.util.Map$Entry
 */
package com.twitter.sdk.android.core.identity;

import android.net.http.SslError;
import android.os.Bundle;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.twitter.sdk.android.core.identity.WebViewException;
import com.twitter.sdk.android.core.internal.network.UrlUtils;
import java.net.URI;
import java.util.Map;

class OAuthWebViewClient
extends WebViewClient {
    private final String completeUrl;
    private final Listener listener;

    public OAuthWebViewClient(String string2, Listener listener) {
        this.completeUrl = string2;
        this.listener = listener;
    }

    public void onPageFinished(WebView webView, String string2) {
        super.onPageFinished(webView, string2);
        this.listener.onPageFinished(webView, string2);
    }

    public void onReceivedError(WebView webView, int n, String string2, String string3) {
        super.onReceivedError(webView, n, string2, string3);
        this.listener.onError(new WebViewException(n, string2, string3));
    }

    public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        super.onReceivedSslError(webView, sslErrorHandler, sslError);
        this.listener.onError(new WebViewException(sslError.getPrimaryError(), null, null));
    }

    public boolean shouldOverrideUrlLoading(WebView webView, String entry2) {
        if (entry2.startsWith(this.completeUrl)) {
            entry2 = UrlUtils.getQueryParams(URI.create((String)entry2), false);
            webView = new Bundle(entry2.size());
            for (Map.Entry entry2 : entry2.entrySet()) {
                webView.putString((String)entry2.getKey(), (String)entry2.getValue());
            }
            this.listener.onSuccess((Bundle)webView);
            return true;
        }
        return super.shouldOverrideUrlLoading(webView, (String)entry2);
    }

    public static interface Listener {
        public void onError(WebViewException var1);

        public void onPageFinished(WebView var1, String var2);

        public void onSuccess(Bundle var1);
    }
}

