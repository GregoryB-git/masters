/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Looper
 *  java.lang.AssertionError
 *  java.lang.IllegalArgumentException
 *  java.lang.IllegalStateException
 *  java.lang.NullPointerException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Thread
 */
package com.jakewharton.rxbinding.internal;

import android.os.Looper;

public final class Preconditions {
    private Preconditions() {
        throw new AssertionError((Object)"No instances.");
    }

    public static void checkArgument(boolean bl, String string2) {
        if (bl) {
            return;
        }
        throw new IllegalArgumentException(string2);
    }

    public static <T> T checkNotNull(T t, String string2) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(string2);
    }

    public static void checkUiThread() {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            return;
        }
        StringBuilder stringBuilder = z2.t("Must be called from the main thread. Was: ");
        stringBuilder.append((Object)Thread.currentThread());
        throw new IllegalStateException(stringBuilder.toString());
    }
}

