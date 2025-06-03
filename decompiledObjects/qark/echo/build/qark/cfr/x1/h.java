/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Enum
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Arrays
 */
package x1;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

public final class h
extends Enum {
    public static final /* enum */ h A;
    public static final /* synthetic */ h[] B;
    public static final /* enum */ h p;
    public static final /* enum */ h q;
    public static final /* enum */ h r;
    public static final /* enum */ h s;
    public static final /* enum */ h t;
    public static final /* enum */ h u;
    public static final /* enum */ h v;
    public static final /* enum */ h w;
    public static final /* enum */ h x;
    public static final /* enum */ h y;
    public static final /* enum */ h z;
    public final boolean o;

    static {
        p = new h(false);
        q = new h(true);
        r = new h(true);
        s = new h(true);
        t = new h(true);
        u = new h(true);
        v = new h(true);
        w = new h(true);
        x = new h(true);
        y = new h(true);
        z = new h(true);
        A = new h(true);
        B = h.c();
    }

    public h(boolean bl) {
        this.o = bl;
    }

    public static final /* synthetic */ h[] c() {
        return new h[]{p, q, r, s, t, u, v, w, x, y, z, A};
    }

    public static h valueOf(String string2) {
        Intrinsics.checkNotNullParameter(string2, "value");
        return (h)Enum.valueOf(h.class, (String)string2);
    }

    public static h[] values() {
        h[] arrh = B;
        return (h[])Arrays.copyOf((Object[])arrh, (int)arrh.length);
    }

    public final boolean e() {
        return this.o;
    }
}

