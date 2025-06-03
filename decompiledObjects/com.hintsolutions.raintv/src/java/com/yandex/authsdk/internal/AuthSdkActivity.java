/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Intent
 *  android.os.Bundle
 *  android.os.Parcelable
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  java.io.Serializable
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 */
package com.yandex.authsdk.internal;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.authsdk.YandexAuthOptions;
import com.yandex.authsdk.internal.Logger;
import com.yandex.authsdk.internal.PackageManagerHelper;
import com.yandex.authsdk.internal.strategy.LoginStrategy;
import com.yandex.authsdk.internal.strategy.LoginStrategyResolver;
import com.yandex.authsdk.internal.strategy.LoginType;
import java.io.Serializable;
import java.util.ArrayList;

public class AuthSdkActivity
extends Activity {
    public static final int LOGIN_REQUEST_CODE = 312;
    private static final String STATE_LOGIN_TYPE = "com.yandex.authsdk.STATE_LOGIN_TYPE";
    private static final String TAG = "AuthSdkActivity";
    @NonNull
    private LoginStrategyResolver loginStrategyResolver;
    @NonNull
    private LoginType loginType;
    @NonNull
    private YandexAuthOptions options;

    public void onActivityResult(int n, int n3, @Nullable Intent intent) {
        if (intent != null && n3 == -1 && n == 312) {
            LoginStrategy.ResultExtractor resultExtractor = this.loginStrategyResolver.getResultExtractor(this.loginType);
            Object object = resultExtractor.tryExtractToken(intent);
            if (object != null) {
                Logger.d(this.options, TAG, "Token received");
                intent = new Intent();
                intent.putExtra("com.yandex.authsdk.EXTRA_TOKEN", (Parcelable)object);
                this.setResult(-1, intent);
                this.finish();
                return;
            }
            object = resultExtractor.tryExtractError(intent);
            if (object != null) {
                Logger.d(this.options, TAG, "Error received");
                intent = new Intent();
                intent.putExtra("com.yandex.authsdk.EXTRA_ERROR", (Serializable)object);
                this.setResult(-1, intent);
                this.finish();
                return;
            }
            Logger.d(this.options, TAG, "Nothing received");
            return;
        }
        this.finish();
    }

    public void onCreate(@Nullable Bundle object) {
        super.onCreate(object);
        this.options = (YandexAuthOptions)this.getIntent().getParcelableExtra("com.yandex.authsdk.EXTRA_OPTIONS");
        this.loginStrategyResolver = new LoginStrategyResolver(this.getApplicationContext(), new PackageManagerHelper(this.getPackageManager(), this.options));
        if (object == null) {
            ArrayList arrayList = this.getIntent().getStringArrayListExtra("com.yandex.auth.SCOPES");
            object = this.getIntent().hasExtra("com.yandex.auth.UID_VALUE") ? Long.valueOf((long)this.getIntent().getLongExtra("com.yandex.auth.UID_VALUE", 0L)) : null;
            String string2 = this.getIntent().getStringExtra("com.yandex.auth.LOGIN_HINT");
            LoginStrategy loginStrategy = this.loginStrategyResolver.getLoginStrategy();
            this.loginType = loginStrategy.getType();
            YandexAuthOptions yandexAuthOptions = this.options;
            ArrayList arrayList2 = arrayList;
            if (arrayList == null) {
                arrayList2 = new ArrayList();
            }
            loginStrategy.login(this, yandexAuthOptions, (ArrayList<String>)arrayList2, (Long)object, string2);
        } else {
            this.loginType = LoginType.values()[object.getInt(STATE_LOGIN_TYPE)];
        }
    }

    public void onSaveInstanceState(@NonNull Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt(STATE_LOGIN_TYPE, this.loginType.ordinal());
    }
}

