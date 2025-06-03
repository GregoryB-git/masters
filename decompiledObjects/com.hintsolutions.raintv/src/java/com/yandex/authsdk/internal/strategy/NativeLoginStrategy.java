/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
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
import android.content.Intent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.authsdk.YandexAuthException;
import com.yandex.authsdk.YandexAuthOptions;
import com.yandex.authsdk.YandexAuthToken;
import com.yandex.authsdk.internal.PackageManagerHelper;
import com.yandex.authsdk.internal.strategy.LoginStrategy;
import com.yandex.authsdk.internal.strategy.LoginType;
import java.util.ArrayList;

class NativeLoginStrategy
extends LoginStrategy {
    public static final String ACTION_YA_SDK_LOGIN = "com.yandex.auth.action.YA_SDK_LOGIN";
    public static final String EXTRA_OAUTH_TOKEN = "com.yandex.auth.EXTRA_OAUTH_TOKEN";
    public static final String EXTRA_OAUTH_TOKEN_EXPIRES = "com.yandex.auth.OAUTH_TOKEN_EXPIRES";
    public static final String EXTRA_OAUTH_TOKEN_TYPE = "com.yandex.auth.EXTRA_OAUTH_TOKEN_TYPE";
    public static final String OAUTH_TOKEN_ERROR = "com.yandex.auth.OAUTH_TOKEN_ERROR";
    public static final String OAUTH_TOKEN_ERROR_MESSAGES = "com.yandex.auth.OAUTH_TOKEN_ERROR_MESSAGES";
    private static int VERSION = 1;
    @NonNull
    private final Intent packagedIntent;

    private NativeLoginStrategy(@NonNull Intent intent) {
        this.packagedIntent = intent;
    }

    @Nullable
    public static LoginStrategy getIfPossible(@NonNull PackageManagerHelper packageManagerHelper) {
        PackageManagerHelper.YandexApplicationInfo yandexApplicationInfo = packageManagerHelper.findLatestApplication();
        if (yandexApplicationInfo != null) {
            packageManagerHelper = new Intent(ACTION_YA_SDK_LOGIN);
            packageManagerHelper.setPackage(yandexApplicationInfo.packageName);
            return new NativeLoginStrategy((Intent)packageManagerHelper);
        }
        return null;
    }

    @Override
    @NonNull
    public LoginType getType() {
        return LoginType.NATIVE;
    }

    @Override
    public void login(@NonNull Activity activity, @NonNull YandexAuthOptions yandexAuthOptions, @NonNull ArrayList<String> arrayList, @Nullable Long l, @Nullable String string2) {
        activity.startActivityForResult(LoginStrategy.putExtras(this.packagedIntent, arrayList, yandexAuthOptions.getClientId(), l, string2), 312);
    }

    public static class ResultExtractor
    implements LoginStrategy.ResultExtractor {
        @Override
        @Nullable
        public YandexAuthException tryExtractError(@NonNull Intent object) {
            if (!object.getBooleanExtra(NativeLoginStrategy.OAUTH_TOKEN_ERROR, false)) {
                return null;
            }
            object = (object = object.getStringArrayExtra(NativeLoginStrategy.OAUTH_TOKEN_ERROR_MESSAGES)) == null ? new YandexAuthException("connection.error") : new YandexAuthException((String[])object);
            return object;
        }

        @Override
        @Nullable
        public YandexAuthToken tryExtractToken(@NonNull Intent object) {
            String string2 = object.getStringExtra(NativeLoginStrategy.EXTRA_OAUTH_TOKEN);
            long l = object.getLongExtra(NativeLoginStrategy.EXTRA_OAUTH_TOKEN_EXPIRES, 0L);
            object = string2 != null ? new YandexAuthToken(string2, l) : null;
            return object;
        }
    }
}

