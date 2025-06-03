/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.content.Intent
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.util.ArrayList
 */
package com.yandex.authsdk.internal.strategy;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.authsdk.YandexAuthException;
import com.yandex.authsdk.YandexAuthOptions;
import com.yandex.authsdk.YandexAuthToken;
import com.yandex.authsdk.internal.WebViewLoginActivity;
import com.yandex.authsdk.internal.strategy.LoginStrategy;
import com.yandex.authsdk.internal.strategy.LoginType;
import java.util.ArrayList;

class WebViewLoginStrategy
extends LoginStrategy {
    @NonNull
    public static LoginStrategy get() {
        return new WebViewLoginStrategy();
    }

    @Override
    @NonNull
    public LoginType getType() {
        return LoginType.WEBVIEW;
    }

    @Override
    public void login(@NonNull Activity activity, @NonNull YandexAuthOptions yandexAuthOptions, @NonNull ArrayList<String> arrayList, @Nullable Long l, @Nullable String string2) {
        Intent intent = new Intent((Context)activity, WebViewLoginActivity.class);
        LoginStrategy.putExtras(intent, arrayList, yandexAuthOptions, l, string2);
        activity.startActivityForResult(intent, 312);
    }

    public static class ResultExtractor
    implements LoginStrategy.ResultExtractor {
        @Override
        @Nullable
        public YandexAuthException tryExtractError(@NonNull Intent intent) {
            return (YandexAuthException)intent.getSerializableExtra("com.yandex.authsdk.EXTRA_ERROR");
        }

        @Override
        @Nullable
        public YandexAuthToken tryExtractToken(@NonNull Intent intent) {
            return (YandexAuthToken)intent.getParcelableExtra("com.yandex.authsdk.EXTRA_TOKEN");
        }
    }
}

