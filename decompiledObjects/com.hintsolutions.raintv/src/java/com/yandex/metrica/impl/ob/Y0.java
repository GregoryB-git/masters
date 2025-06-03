/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  java.lang.Enum
 *  java.lang.Object
 *  java.lang.String
 */
package com.yandex.metrica.impl.ob;

import androidx.annotation.NonNull;

public final class y0
extends Enum<y0> {
    public static final /* enum */ y0 b;
    public static final /* enum */ y0 c;
    private static final y0[] d;
    public final int a;

    static {
        y0 y02;
        y0 y03;
        b = y03 = new y0(0);
        c = y02 = new y0(1);
        d = new y0[]{y03, y02};
    }

    private y0(int n8) {
        this.a = n8;
    }

    @NonNull
    public static y0 a(int n7) {
        y0[] y0Array = y0.values();
        for (int i3 = 0; i3 < 2; ++i3) {
            y0 y02 = y0Array[i3];
            if (y02.a != n7) continue;
            return y02;
        }
        return b;
    }

    public static y0 valueOf(String string) {
        return (y0)Enum.valueOf(y0.class, (String)string);
    }

    public static y0[] values() {
        return (y0[])d.clone();
    }
}

