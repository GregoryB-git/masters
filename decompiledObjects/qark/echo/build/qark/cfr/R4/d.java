/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Enum
 *  java.lang.Object
 *  java.lang.String
 */
package R4;

import l4.f;

public final class d
extends Enum
implements f {
    public static final /* enum */ d p = new d(0);
    public static final /* enum */ d q = new d(1);
    public static final /* enum */ d r = new d(2);
    public static final /* enum */ d s = new d(3);
    public static final /* enum */ d t = new d(4);
    public static final /* enum */ d u = new d(5);
    public static final /* synthetic */ d[] v;
    public final int o;

    static {
        v = d.c();
    }

    public d(int n9) {
        this.o = n9;
    }

    public static final /* synthetic */ d[] c() {
        return new d[]{p, q, r, s, t, u};
    }

    public static d valueOf(String string2) {
        return (d)Enum.valueOf(d.class, (String)string2);
    }

    public static d[] values() {
        return (d[])v.clone();
    }

    @Override
    public int g() {
        return this.o;
    }
}

