/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Deprecated
 *  java.lang.Enum
 *  java.lang.Object
 *  java.lang.String
 */
package com.yandex.metrica;

@Deprecated
public final class b
extends Enum<b> {
    public static final /* enum */ b b;
    public static final /* enum */ b c;
    public static final /* enum */ b d;
    private static final b[] e;
    private final String a;

    static {
        b b4;
        b b6;
        b b7;
        b = b7 = new b("phone");
        c = b6 = new b("tablet");
        d = b4 = new b("tv");
        e = new b[]{b7, b6, b4};
    }

    private b(String string3) {
        this.a = string3;
    }

    public static b a(String string2) {
        b[] bArray = com.yandex.metrica.b.values();
        for (int j = 0; j < 3; ++j) {
            b b4 = bArray[j];
            if (!b4.a.equals((Object)string2)) continue;
            return b4;
        }
        return null;
    }

    public static b valueOf(String string2) {
        return (b)Enum.valueOf(b.class, (String)string2);
    }

    public static b[] values() {
        return (b[])e.clone();
    }

    public String a() {
        return this.a;
    }
}

