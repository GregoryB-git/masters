/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 *  java.lang.Object
 *  java.lang.String
 */
package x0;

import android.net.Uri;
import d0.I;
import d0.u;
import g0.a;

public final class V
extends I {
    public static final Object r = new Object();
    public static final u s = new u.c().b("SinglePeriodTimeline").e(Uri.EMPTY).a();
    public final long e;
    public final long f;
    public final long g;
    public final long h;
    public final long i;
    public final long j;
    public final long k;
    public final boolean l;
    public final boolean m;
    public final boolean n;
    public final Object o;
    public final u p;
    public final u.g q;

    public V(long l8, long l9, long l10, long l11, long l12, long l13, long l14, boolean bl, boolean bl2, boolean bl3, Object object, u u8, u.g g8) {
        this.e = l8;
        this.f = l9;
        this.g = l10;
        this.h = l11;
        this.i = l12;
        this.j = l13;
        this.k = l14;
        this.l = bl;
        this.m = bl2;
        this.n = bl3;
        this.o = object;
        this.p = (u)a.e(u8);
        this.q = g8;
    }

    public V(long l8, long l9, long l10, long l11, boolean bl, boolean bl2, boolean bl3, Object object, u u8) {
        u.g g8 = bl3 ? u8.d : null;
        this(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, l8, l9, l10, l11, bl, bl2, false, object, u8, g8);
    }

    public V(long l8, boolean bl, boolean bl2, boolean bl3, Object object, u u8) {
        this(l8, l8, 0L, 0L, bl, bl2, bl3, object, u8);
    }

    @Override
    public int b(Object object) {
        if (r.equals(object)) {
            return 0;
        }
        return -1;
    }

    @Override
    public I.b g(int n8, I.b b8, boolean bl) {
        Object object;
        a.c(n8, 0, 1);
        object = bl ? r : null;
        return b8.s(null, object, 0, this.h, - this.j);
    }

    @Override
    public int i() {
        return 1;
    }

    @Override
    public Object m(int n8) {
        a.c(n8, 0, 1);
        return r;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public I.c o(int n8, I.c c8, long l8) {
        a.c(n8, 0, 1);
        long l9 = this.k;
        boolean bl = this.m;
        long l10 = l9;
        if (!bl) return c8.g(I.c.q, this.p, this.o, this.e, this.f, this.g, this.l, bl, this.q, l10, this.i, 0, 0, this.j);
        l10 = l9;
        if (this.n) return c8.g(I.c.q, this.p, this.o, this.e, this.f, this.g, this.l, bl, this.q, l10, this.i, 0, 0, this.j);
        l10 = l9;
        if (l8 == 0L) return c8.g(I.c.q, this.p, this.o, this.e, this.f, this.g, this.l, bl, this.q, l10, this.i, 0, 0, this.j);
        long l11 = this.i;
        if (l11 != -9223372036854775807L) {
            l10 = l8 = l9 + l8;
            if (l8 <= l11) return c8.g(I.c.q, this.p, this.o, this.e, this.f, this.g, this.l, bl, this.q, l10, this.i, 0, 0, this.j);
        }
        l10 = -9223372036854775807L;
        return c8.g(I.c.q, this.p, this.o, this.e, this.f, this.g, this.l, bl, this.q, l10, this.i, 0, 0, this.j);
    }

    @Override
    public int p() {
        return 1;
    }
}

