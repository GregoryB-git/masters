/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Enum
 *  java.lang.Object
 *  java.lang.String
 */
package com.yandex.metrica.impl.ob;

public final class b7
extends Enum<b7> {
    public static final /* enum */ b7 a;
    public static final /* enum */ b7 b;
    public static final /* enum */ b7 c;
    public static final /* enum */ b7 d;
    private static final b7[] e;

    static {
        b7 b72;
        b7 b73;
        b7 b74;
        b7 b75;
        a = b75 = new b7();
        b = b74 = new b7();
        c = b73 = new b7();
        d = b72 = new b7();
        e = new b7[]{b75, b74, b73, b72};
    }

    public static b7 valueOf(String string) {
        return (b7)Enum.valueOf(b7.class, (String)string);
    }

    public static b7[] values() {
        return (b7[])e.clone();
    }
}

