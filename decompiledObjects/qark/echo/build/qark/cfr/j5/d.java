/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Enum
 *  java.lang.Object
 *  java.lang.String
 */
package j5;

import j5.b;
import j5.c;
import j5.e;

public final class d
extends Enum {
    public static final /* enum */ d q = new d(new b(), 1);
    public static final /* enum */ d r = new d(new c(), 23);
    public static final /* synthetic */ d[] s;
    public final e o;
    public final int p;

    static {
        s = d.c();
    }

    public d(e e8, int n9) {
        this.o = e8;
        this.p = n9;
    }

    public static /* synthetic */ d[] c() {
        return new d[]{q, r};
    }

    public static d valueOf(String string2) {
        return (d)Enum.valueOf(d.class, (String)string2);
    }

    public static d[] values() {
        return (d[])s.clone();
    }
}

