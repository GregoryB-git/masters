/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Enum
 *  java.lang.Object
 *  java.lang.String
 */
package l5;

public final class a
extends Enum {
    public static final /* enum */ a o = new a();
    public static final /* enum */ a p = new a();
    public static final /* enum */ a q = new a();
    public static final /* enum */ a r = new a();
    public static final /* enum */ a s = new a();
    public static final /* enum */ a t = new a();
    public static final /* synthetic */ a[] u;

    static {
        u = a.c();
    }

    public static /* synthetic */ a[] c() {
        return new a[]{o, p, q, r, s, t};
    }

    public static a valueOf(String string2) {
        return (a)Enum.valueOf(a.class, (String)string2);
    }

    public static a[] values() {
        return (a[])u.clone();
    }
}

