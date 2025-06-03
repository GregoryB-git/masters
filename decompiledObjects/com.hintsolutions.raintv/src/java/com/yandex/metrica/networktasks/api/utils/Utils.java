/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 */
package com.yandex.metrica.networktasks.api.utils;

public final class Utils {
    public static final Utils INSTANCE = new Utils();

    private Utils() {
    }

    public static final boolean isBadRequest(int n7) {
        boolean bl = n7 == 400;
        return bl;
    }
}

