/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.annotation.SuppressLint
 *  android.app.Activity
 *  android.content.Context
 *  android.graphics.Bitmap
 *  android.net.Uri
 *  android.os.Bundle
 *  android.view.View
 *  android.webkit.CookieManager
 *  android.webkit.WebView
 *  android.webkit.WebViewClient
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  com.yandex.authsdk.internal.WebViewLoginActivity$$Lambda$1
 *  java.lang.Object
 *  java.lang.String
 *  java.util.UUID
 */
package com.yandex.authsdk.internal;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.webkit.CookieManager;
import android.webkit.WebView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.authsdk.YandexAuthOptions;
import com.yandex.authsdk.internal.ExternalLoginHandler;
import com.yandex.authsdk.internal.PreferencesHelper;
import com.yandex.authsdk.internal.WebViewLoginActivity$;
import java.util.UUID;

public class WebViewLoginActivity
extends Activity {
    @NonNull
    private ExternalLoginHandler loginHandler;
    @NonNull
    private YandexAuthOptions options;

    private void clearCookies() {
        CookieManager.getInstance().removeAllCookies(null);
        CookieManager.getInstance().flush();
    }

    public static /* synthetic */ String lambda$onCreate$0() {
        return UUID.randomUUID().toString();
    }

    private void parseTokenFromUrl(@NonNull String string2) {
        this.setResult(-1, this.loginHandler.parseResult(Uri.parse((String)string2)));
        this.finish();
    }

    @SuppressLint(value={"SetJavaScriptEnabled"})
    public void onCreate(@Nullable Bundle bundle) {
        YandexAuthOptions yandexAuthOptions;
        super.onCreate(bundle);
        this.options = yandexAuthOptions = (YandexAuthOptions)this.getIntent().getParcelableExtra("com.yandex.authsdk.EXTRA_OPTIONS");
        if (yandexAuthOptions == null) {
            this.finish();
            return;
        }
        this.loginHandler = new ExternalLoginHandler(new PreferencesHelper((Context)this), $Lambda$1.lambdaFactory$());
        if (bundle == null) {
            this.clearCookies();
        }
        bundle = new WebView((Context)this);
        bundle.setWebViewClient((android.webkit.WebViewClient)new WebViewClient(this, null));
        bundle.loadUrl(this.loginHandler.getUrl(this.getIntent()));
        bundle.getSettings().setJavaScriptEnabled(true);
        this.setContentView((View)bundle);
    }

    public class WebViewClient
    extends android.webkit.WebViewClient {
        public final WebViewLoginActivity this$0;

        private WebViewClient(WebViewLoginActivity webViewLoginActivity) {
            this.this$0 = webViewLoginActivity;
        }

        public /* synthetic */ WebViewClient(WebViewLoginActivity webViewLoginActivity, 1 var2_2) {
            this(webViewLoginActivity);
        }

        public void onPageStarted(@NonNull WebView webView, @NonNull String string2, @NonNull Bitmap bitmap) {
            if (this.this$0.loginHandler.isFinalUrl(string2, this.this$0.options.getClientId())) {
                this.this$0.parseTokenFromUrl(string2);
            } else {
                super.onPageStarted(webView, string2, bitmap);
            }
        }
    }
}

