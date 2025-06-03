/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.Log
 *  androidx.annotation.NonNull
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 */
package com.yandex.authsdk.internal;

import android.util.Log;
import androidx.annotation.NonNull;
import com.yandex.authsdk.YandexAuthOptions;

public class Logger {
    public static void d(@NonNull YandexAuthOptions yandexAuthOptions, @NonNull String string2, @NonNull String string3) {
        if (yandexAuthOptions.isLoggingEnabled()) {
            Log.d((String)string2, (String)string3);
        }
    }

    public static void e(@NonNull YandexAuthOptions yandexAuthOptions, @NonNull String string2, @NonNull String string3, @NonNull Throwable throwable) {
        if (yandexAuthOptions.isLoggingEnabled()) {
            Log.e((String)string2, (String)string3, (Throwable)throwable);
        }
    }
}

