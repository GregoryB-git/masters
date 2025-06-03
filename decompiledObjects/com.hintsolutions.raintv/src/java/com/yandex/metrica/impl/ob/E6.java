/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Enum
 *  java.lang.Object
 *  java.lang.String
 */
package com.yandex.metrica.impl.ob;

public final class e6
extends Enum<e6> {
    public static final /* enum */ e6 b;
    public static final /* enum */ e6 c;
    private static final e6[] d;
    private final int a;

    static {
        e6 e62;
        e6 e63;
        b = e63 = new e6(0);
        c = e62 = new e6(1);
        d = new e6[]{e63, e62};
    }

    private e6(int n5) {
        this.a = n5;
    }

    public static e6 valueOf(String string) {
        return (e6)Enum.valueOf(e6.class, (String)string);
    }

    public static e6[] values() {
        return (e6[])d.clone();
    }

    public int a() {
        return this.a;
    }
}

