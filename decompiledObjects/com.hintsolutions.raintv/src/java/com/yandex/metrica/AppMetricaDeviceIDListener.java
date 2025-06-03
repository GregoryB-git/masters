/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  java.lang.Object
 *  java.lang.String
 */
package com.yandex.metrica;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public interface AppMetricaDeviceIDListener {
    public void onError(@NonNull Reason var1);

    public void onLoaded(@Nullable String var1);

    public static enum Reason {
        UNKNOWN,
        NETWORK,
        INVALID_RESPONSE;

    }
}

