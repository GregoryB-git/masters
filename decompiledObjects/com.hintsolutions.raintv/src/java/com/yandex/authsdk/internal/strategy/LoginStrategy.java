/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Intent
 *  android.os.Parcelable
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  java.io.Serializable
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 */
package com.yandex.authsdk.internal.strategy;

import android.app.Activity;
import android.content.Intent;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.authsdk.YandexAuthException;
import com.yandex.authsdk.YandexAuthOptions;
import com.yandex.authsdk.YandexAuthToken;
import com.yandex.authsdk.internal.strategy.LoginType;
import java.io.Serializable;
import java.util.ArrayList;

public abstract class LoginStrategy {
    @NonNull
    public static Intent putExtras(@NonNull Intent intent, @NonNull ArrayList<String> arrayList, @NonNull YandexAuthOptions yandexAuthOptions, @Nullable Long l2, @Nullable String string2) {
        intent.putExtra("com.yandex.auth.SCOPES", arrayList);
        intent.putExtra("com.yandex.authsdk.EXTRA_OPTIONS", (Parcelable)yandexAuthOptions);
        if (l2 != null) {
            intent.putExtra("com.yandex.auth.UID_VALUE", (Serializable)l2);
        }
        if (string2 != null) {
            intent.putExtra("com.yandex.auth.LOGIN_HINT", string2);
        }
        return intent;
    }

    @NonNull
    public static Intent putExtras(@NonNull Intent intent, @NonNull ArrayList<String> arrayList, @NonNull String string2, @Nullable Long l2, @Nullable String string3) {
        intent.putExtra("com.yandex.auth.SCOPES", arrayList);
        intent.putExtra("com.yandex.auth.CLIENT_ID", string2);
        if (l2 != null) {
            intent.putExtra("com.yandex.auth.UID_VALUE", (Serializable)l2);
        }
        if (string3 != null) {
            intent.putExtra("com.yandex.auth.LOGIN_HINT", string3);
        }
        return intent;
    }

    @NonNull
    public abstract LoginType getType();

    public abstract void login(@NonNull Activity var1, @NonNull YandexAuthOptions var2, @NonNull ArrayList<String> var3, @Nullable Long var4, @Nullable String var5);

    public static interface ResultExtractor {
        @Nullable
        public YandexAuthException tryExtractError(@NonNull Intent var1);

        @Nullable
        public YandexAuthToken tryExtractToken(@NonNull Intent var1);
    }
}

