/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Enum
 *  java.lang.Object
 *  java.lang.String
 */
package z4;

public final class c
extends Enum {
    public static final /* enum */ c o;
    public static final /* enum */ c p;
    public static final /* synthetic */ c[] q;

    static {
        c c8;
        c c9;
        o = c8 = new c();
        p = c9 = new c();
        q = new c[]{c8, c9};
    }

    public static c valueOf(String string2) {
        return (c)Enum.valueOf(c.class, (String)string2);
    }

    public static c[] values() {
        return (c[])q.clone();
    }
}

