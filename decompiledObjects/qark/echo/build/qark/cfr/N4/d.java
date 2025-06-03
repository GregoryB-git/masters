/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Enum
 *  java.lang.Object
 *  java.lang.String
 */
package N4;

import com.google.protobuf.t;

public final class d
extends Enum
implements t.a {
    public static final /* enum */ d p;
    public static final /* enum */ d q;
    public static final /* enum */ d r;
    public static final /* enum */ d s;
    public static final t.b t;
    public static final /* synthetic */ d[] u;
    public final int o;

    static {
        d d8;
        d d9;
        d d10;
        d d11;
        p = d9 = new d(0);
        q = d10 = new d(1);
        r = d11 = new d(2);
        s = d8 = new d(3);
        u = new d[]{d9, d10, d11, d8};
        t = new t.b(){};
    }

    public d(int n9) {
        this.o = n9;
    }

    public static t.c c() {
        return b.a;
    }

    public static d valueOf(String string2) {
        return (d)Enum.valueOf(d.class, (String)string2);
    }

    public static d[] values() {
        return (d[])u.clone();
    }

    @Override
    public final int g() {
        return this.o;
    }

    public static final class b
    implements t.c {
        public static final t.c a = new b();
    }

}

