/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Enum
 *  java.lang.Object
 *  java.lang.String
 */
package r6;

public final class a
extends Enum {
    public static final /* enum */ a o = new a();
    public static final /* enum */ a p = new a();
    public static final /* enum */ a q = new a();
    public static final /* synthetic */ a[] r;

    static {
        r = a.c();
    }

    public static final /* synthetic */ a[] c() {
        return new a[]{o, p, q};
    }

    public static a valueOf(String string2) {
        return (a)Enum.valueOf(a.class, (String)string2);
    }

    public static a[] values() {
        return (a[])r.clone();
    }
}

