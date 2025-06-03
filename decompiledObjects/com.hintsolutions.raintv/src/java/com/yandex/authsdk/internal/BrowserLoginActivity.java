/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.content.Intent
 *  android.net.Uri
 *  android.os.Bundle
 *  android.os.Handler
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  com.yandex.authsdk.internal.BrowserLoginActivity$$Lambda$4
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.util.UUID
 */
package com.yandex.authsdk.internal;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.authsdk.YandexAuthOptions;
import com.yandex.authsdk.internal.BrowserLoginActivity$;
import com.yandex.authsdk.internal.BrowserLoginActivity$$Lambda$1;
import com.yandex.authsdk.internal.ExternalLoginHandler;
import com.yandex.authsdk.internal.PreferencesHelper;
import java.util.UUID;

public class BrowserLoginActivity
extends Activity {
    public static final String EXTRA_BROWSER_PACKAGE_NAME = "com.yandex.authsdk.internal.EXTRA_BROWSER_PACKAGE_NAME";
    private final Runnable finishRunnable;
    private final Handler handler = new Handler();
    @NonNull
    private ExternalLoginHandler loginHandler;

    public BrowserLoginActivity() {
        this.finishRunnable = BrowserLoginActivity$$Lambda$1.lambdaFactory$(this);
    }

    public static /* synthetic */ void lambda$new$0(BrowserLoginActivity browserLoginActivity) {
        browserLoginActivity.setResult(0);
        browserLoginActivity.finish();
    }

    public static /* synthetic */ String lambda$onCreate$1() {
        return UUID.randomUUID().toString();
    }

    private void parseTokenFromUri(@NonNull Uri uri) {
        this.setResult(-1, this.loginHandler.parseResult(uri));
        this.finish();
    }

    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        if ((YandexAuthOptions)this.getIntent().getParcelableExtra("com.yandex.authsdk.EXTRA_OPTIONS") == null) {
            this.finish();
            return;
        }
        this.loginHandler = new ExternalLoginHandler(new PreferencesHelper((Context)this), $Lambda$4.lambdaFactory$());
        if (bundle == null) {
            bundle = new Intent("android.intent.action.VIEW");
            bundle.setPackage(this.getIntent().getStringExtra(EXTRA_BROWSER_PACKAGE_NAME));
            bundle.setData(Uri.parse((String)this.loginHandler.getUrl(this.getIntent())));
            this.startActivity((Intent)bundle);
        }
    }

    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        this.parseTokenFromUri(intent.getData());
    }

    public void onPause() {
        this.handler.removeCallbacks(this.finishRunnable);
        super.onPause();
    }

    public void onResume() {
        super.onResume();
        this.handler.post(this.finishRunnable);
    }
}

