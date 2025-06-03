/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Intent
 *  android.os.Bundle
 *  android.webkit.WebChromeClient
 *  android.webkit.WebSettings
 *  android.webkit.WebView
 *  android.webkit.WebViewClient
 *  android.widget.ProgressBar
 *  com.twitter.sdk.android.core.identity.OAuthController$1
 *  com.twitter.sdk.android.core.identity.OAuthController$2
 *  java.io.Serializable
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 */
package com.twitter.sdk.android.core.identity;

import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;
import com.twitter.sdk.android.core.Callback;
import com.twitter.sdk.android.core.Logger;
import com.twitter.sdk.android.core.Twitter;
import com.twitter.sdk.android.core.TwitterAuthConfig;
import com.twitter.sdk.android.core.TwitterAuthException;
import com.twitter.sdk.android.core.TwitterAuthToken;
import com.twitter.sdk.android.core.identity.OAuthController;
import com.twitter.sdk.android.core.identity.OAuthWebViewClient;
import com.twitter.sdk.android.core.identity.WebViewException;
import com.twitter.sdk.android.core.internal.oauth.OAuth1aService;
import com.twitter.sdk.android.core.internal.oauth.OAuthResponse;
import java.io.Serializable;

class OAuthController
implements OAuthWebViewClient.Listener {
    private final TwitterAuthConfig authConfig;
    public final Listener listener;
    private final OAuth1aService oAuth1aService;
    public TwitterAuthToken requestToken;
    private final ProgressBar spinner;
    private final WebView webView;

    public OAuthController(ProgressBar progressBar, WebView webView, TwitterAuthConfig twitterAuthConfig, OAuth1aService oAuth1aService, Listener listener) {
        this.spinner = progressBar;
        this.webView = webView;
        this.authConfig = twitterAuthConfig;
        this.oAuth1aService = oAuth1aService;
        this.listener = listener;
    }

    public static /* synthetic */ OAuth1aService access$000(OAuthController oAuthController) {
        return oAuthController.oAuth1aService;
    }

    public static /* synthetic */ WebView access$100(OAuthController oAuthController) {
        return oAuthController.webView;
    }

    public static /* synthetic */ TwitterAuthConfig access$200(OAuthController oAuthController) {
        return oAuthController.authConfig;
    }

    private void dismissSpinner() {
        this.spinner.setVisibility(8);
    }

    private void dismissWebView() {
        this.webView.stopLoading();
        this.dismissSpinner();
    }

    private void handleWebViewError(WebViewException webViewException) {
        Twitter.getLogger().e("Twitter", "OAuth web view completed with an error", (Throwable)webViewException);
        this.handleAuthError(1, new TwitterAuthException("OAuth web view completed with an error"));
    }

    private void handleWebViewSuccess(Bundle bundle) {
        String string2;
        Twitter.getLogger().d("Twitter", "OAuth web view completed successfully");
        if (bundle != null && (string2 = bundle.getString("oauth_verifier")) != null) {
            Twitter.getLogger().d("Twitter", "Converting the request token to an access token.");
            this.oAuth1aService.requestAccessToken(this.newRequestAccessTokenCallback(), this.requestToken, string2);
            return;
        }
        Logger logger = Twitter.getLogger();
        string2 = new StringBuilder();
        string2.append("Failed to get authorization, bundle incomplete ");
        string2.append((Object)bundle);
        logger.e("Twitter", string2.toString(), null);
        this.handleAuthError(1, new TwitterAuthException("Failed to get authorization, bundle incomplete"));
    }

    public void handleAuthError(int n, TwitterAuthException twitterAuthException) {
        Intent intent = new Intent();
        intent.putExtra("auth_error", (Serializable)twitterAuthException);
        this.listener.onComplete(n, intent);
    }

    public Callback<OAuthResponse> newRequestAccessTokenCallback() {
        return new 2(this);
    }

    public Callback<OAuthResponse> newRequestTempTokenCallback() {
        return new 1(this);
    }

    @Override
    public void onError(WebViewException webViewException) {
        this.handleWebViewError(webViewException);
        this.dismissWebView();
    }

    @Override
    public void onPageFinished(WebView webView, String string2) {
        this.dismissSpinner();
        webView.setVisibility(0);
    }

    @Override
    public void onSuccess(Bundle bundle) {
        this.handleWebViewSuccess(bundle);
        this.dismissWebView();
    }

    public void setUpWebView(WebView webView, WebViewClient webViewClient, String string2, WebChromeClient webChromeClient) {
        WebSettings webSettings = webView.getSettings();
        webSettings.setAllowFileAccess(false);
        webSettings.setJavaScriptEnabled(false);
        webSettings.setSaveFormData(false);
        webView.setVerticalScrollBarEnabled(false);
        webView.setHorizontalScrollBarEnabled(false);
        webView.setWebViewClient(webViewClient);
        webView.loadUrl(string2);
        webView.setVisibility(4);
        webView.setWebChromeClient(webChromeClient);
    }

    public void startAuth() {
        Twitter.getLogger().d("Twitter", "Obtaining request token to start the sign in flow");
        this.oAuth1aService.requestTempToken(this.newRequestTempTokenCallback());
    }
}

