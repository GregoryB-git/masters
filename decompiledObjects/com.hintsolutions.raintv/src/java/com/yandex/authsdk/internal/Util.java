/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  java.lang.NullPointerException
 *  java.lang.Object
 *  java.lang.String
 */
package com.yandex.authsdk.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class Util {
    private static final String TAG = "Util";

    @NonNull
    public static <T> T checkNotNull(@Nullable T t2) {
        if (t2 != null) {
            return t2;
        }
        throw new NullPointerException("Argument should not be null");
    }
}

