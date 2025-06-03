/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Enum
 *  java.lang.Object
 *  java.lang.String
 */
package c2;

public final class d
extends Enum {
    public static final /* enum */ d o;
    public static final /* enum */ d p;
    public static final /* enum */ d q;
    public static final /* synthetic */ d[] r;

    static {
        d d8;
        d d9;
        d d10;
        o = d10 = new d();
        p = d9 = new d();
        q = d8 = new d();
        r = new d[]{d10, d9, d8};
    }

    public static d valueOf(String string2) {
        return (d)Enum.valueOf(d.class, (String)string2);
    }

    public static d[] values() {
        return (d[])r.clone();
    }
}

