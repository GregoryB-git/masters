/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Enum
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Arrays
 */
package O1;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import x1.B;

public final class d
extends Enum {
    public static final /* enum */ d A;
    public static final /* enum */ d B;
    public static final /* enum */ d C;
    public static final /* enum */ d D;
    public static final /* enum */ d E;
    public static final /* enum */ d F;
    public static final /* synthetic */ d[] G;
    public static final /* enum */ d p;
    public static final /* enum */ d q;
    public static final /* enum */ d r;
    public static final /* enum */ d s;
    public static final /* enum */ d t;
    public static final /* enum */ d u;
    public static final /* enum */ d v;
    public static final /* enum */ d w;
    public static final /* enum */ d x;
    public static final /* enum */ d y;
    public static final /* enum */ d z;
    public final int o;

    static {
        p = new d(0);
        q = new d(1);
        r = new d(2);
        s = new d(3);
        t = new d(4);
        u = new d(5);
        v = new d(6);
        w = new d(7);
        x = new d(8);
        y = new d(9);
        z = new d(10);
        A = new d(11);
        B = new d(12);
        C = new d(13);
        D = new d(14);
        E = new d(15);
        F = new d(16);
        G = d.c();
    }

    public d(int n9) {
        this.o = n9;
    }

    public static final /* synthetic */ d[] c() {
        return new d[]{p, q, r, s, t, u, v, w, x, y, z, A, B, C, D, E, F};
    }

    public static d valueOf(String string2) {
        Intrinsics.checkNotNullParameter(string2, "value");
        return (d)Enum.valueOf(d.class, (String)string2);
    }

    public static d[] values() {
        d[] arrd = G;
        return (d[])Arrays.copyOf((Object[])arrd, (int)arrd.length);
    }

    public final int e() {
        return B.q() + this.o;
    }
}

