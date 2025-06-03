/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Enum
 *  java.lang.Object
 *  java.lang.String
 */
package e5;

public final class c
extends Enum {
    public static final /* enum */ c o;
    public static final /* enum */ c p;
    public static final /* enum */ c q;
    public static final /* enum */ c r;
    public static final /* synthetic */ c[] s;

    static {
        c c8;
        c c9;
        c c10;
        c c11;
        o = c10 = new c();
        p = c11 = new c();
        q = c8 = new c();
        r = c9 = new c();
        s = new c[]{c10, c11, c8, c9};
    }

    public static c valueOf(String string2) {
        return (c)Enum.valueOf(c.class, (String)string2);
    }

    public static c[] values() {
        return (c[])s.clone();
    }
}

