/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Intent
 *  android.os.Bundle
 *  android.webkit.WebView
 *  android.widget.ProgressBar
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 */
package com.twitter.sdk.android.core.identity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebView;
import android.widget.ProgressBar;
import com.twitter.sdk.android.core.R;
import com.twitter.sdk.android.core.TwitterAuthConfig;
import com.twitter.sdk.android.core.TwitterAuthException;
import com.twitter.sdk.android.core.TwitterCore;
import com.twitter.sdk.android.core.identity.OAuthController;
import com.twitter.sdk.android.core.internal.TwitterApi;
import com.twitter.sdk.android.core.internal.oauth.OAuth1aService;

public class OAuthActivity
extends Activity
implements OAuthController.Listener {
    public static final String EXTRA_AUTH_CONFIG = "auth_config";
    private static final String STATE_PROGRESS = "progress";
    public OAuthController oAuthController;
    private ProgressBar spinner;
    private WebView webView;

    public void onBackPressed() {
        this.oAuthController.handleAuthError(0, new TwitterAuthException("Authorization failed, request was canceled."));
    }

    @Override
    public void onComplete(int n, Intent intent) {
        this.setResult(n, intent);
        this.finish();
    }

    public void onCreate(Bundle object) {
        super.onCreate((Bundle)object);
        this.setContentView(R.layout.tw__activity_oauth);
        this.spinner = (ProgressBar)this.findViewById(R.id.tw__spinner);
        this.webView = (WebView)this.findViewById(R.id.tw__web_view);
        int n = 0;
        boolean bl = object != null ? object.getBoolean(STATE_PROGRESS, false) : true;
        object = this.spinner;
        if (!bl) {
            n = 8;
        }
        object.setVisibility(n);
        object = TwitterCore.getInstance();
        object = new OAuthController(this.spinner, this.webView, (TwitterAuthConfig)this.getIntent().getParcelableExtra(EXTRA_AUTH_CONFIG), new OAuth1aService((TwitterCore)object, new TwitterApi()), this);
        this.oAuthController = object;
        ((OAuthController)object).startAuth();
    }

    public void onSaveInstanceState(Bundle bundle) {
        if (this.spinner.getVisibility() == 0) {
            bundle.putBoolean(STATE_PROGRESS, true);
        }
        super.onSaveInstanceState(bundle);
    }
}

