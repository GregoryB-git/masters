/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Enum
 *  java.lang.Object
 *  java.lang.String
 */
package com.yandex.metrica.billing_interface;

public final class b
extends Enum<b> {
    public static final /* enum */ b a;
    public static final /* enum */ b b;
    public static final /* enum */ b c;
    private static final b[] d;

    static {
        b b4;
        b b5;
        b b6;
        a = b6 = new b();
        b = b5 = new b();
        c = b4 = new b();
        d = new b[]{b6, b5, b4};
    }

    public static b valueOf(String string2) {
        return (b)Enum.valueOf(b.class, (String)string2);
    }

    public static b[] values() {
        return (b[])d.clone();
    }
}

