/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  java.lang.Enum
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 */
package com.yandex.metrica.impl.ob;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public final class D0
extends Enum<D0> {
    public static final /* enum */ D0 b;
    public static final /* enum */ D0 c;
    public static final /* enum */ D0 d;
    private static final D0[] e;
    public final int a;

    static {
        D0 d0;
        D0 d02;
        D0 d03;
        b = d03 = new D0(0);
        c = d02 = new D0(1);
        d = d0 = new D0(2);
        e = new D0[]{d03, d02, d0};
    }

    private D0(int n3) {
        this.a = n3;
    }

    @NonNull
    public static D0 a(@Nullable Integer n2) {
        if (n2 != null) {
            D0[] d0Array = D0.values();
            for (int i2 = 0; i2 < 3; ++i2) {
                D0 d0 = d0Array[i2];
                if (d0.a != n2) continue;
                return d0;
            }
        }
        return b;
    }

    public static D0 valueOf(String string) {
        return (D0)Enum.valueOf(D0.class, (String)string);
    }

    public static D0[] values() {
        return (D0[])e.clone();
    }
}

