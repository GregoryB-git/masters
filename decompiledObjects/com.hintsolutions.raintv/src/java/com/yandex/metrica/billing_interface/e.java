/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Enum
 *  java.lang.Object
 *  java.lang.String
 */
package com.yandex.metrica.billing_interface;

public final class e
extends Enum<e> {
    public static final /* enum */ e a;
    public static final /* enum */ e b;
    public static final /* enum */ e c;
    private static final e[] d;

    static {
        e e2;
        e e3;
        e e4;
        a = e4 = new e();
        b = e3 = new e();
        c = e2 = new e();
        d = new e[]{e4, e3, e2};
    }

    public static e valueOf(String string2) {
        return (e)Enum.valueOf(e.class, (String)string2);
    }

    public static e[] values() {
        return (e[])d.clone();
    }
}

