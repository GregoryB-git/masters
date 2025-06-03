/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Enum
 *  java.lang.Object
 */
package o6;

import kotlin.jvm.internal.Intrinsics;
import o6.a;
import o6.d;
import o6.e;

public abstract class c {
    public static final /* synthetic */ long a(long l8, int n8) {
        return c.h(l8, n8);
    }

    public static final /* synthetic */ long b(long l8) {
        return c.i(l8);
    }

    public static final /* synthetic */ long c(long l8) {
        return c.j(l8);
    }

    public static final /* synthetic */ long d(long l8) {
        return c.k(l8);
    }

    public static final /* synthetic */ long e(long l8) {
        return c.l(l8);
    }

    public static final /* synthetic */ long f(long l8) {
        return c.m(l8);
    }

    public static final /* synthetic */ long g(long l8) {
        return c.n(l8);
    }

    public static final long h(long l8, int n8) {
        return a.m((l8 << 1) + (long)n8);
    }

    public static final long i(long l8) {
        return a.m((l8 << 1) + 1L);
    }

    public static final long j(long l8) {
        if (-4611686018426L <= l8 && l8 < 4611686018427L) {
            return c.k(c.m(l8));
        }
        return c.i(l6.d.e(l8, -4611686018427387903L, 0x3FFFFFFFFFFFFFFFL));
    }

    public static final long k(long l8) {
        return a.m(l8 << 1);
    }

    public static final long l(long l8) {
        if (-4611686018426999999L <= l8 && l8 < 4611686018427000000L) {
            return c.k(l8);
        }
        return c.i(c.n(l8));
    }

    public static final long m(long l8) {
        return l8 * (long)1000000;
    }

    public static final long n(long l8) {
        return l8 / (long)1000000;
    }

    public static final long o(int n8, d d8) {
        Intrinsics.checkNotNullParameter((Object)d8, "unit");
        if (d8.compareTo((Enum)d.s) <= 0) {
            return c.k(e.b(n8, d8, d.p));
        }
        return c.p(n8, d8);
    }

    public static final long p(long l8, d d8) {
        Intrinsics.checkNotNullParameter((Object)d8, "unit");
        d d9 = d.p;
        long l9 = e.b(4611686018426999999L, d9, d8);
        if (- l9 <= l8 && l8 <= l9) {
            return c.k(e.b(l8, d8, d9));
        }
        return c.i(l6.d.e(e.a(l8, d8, d.r), -4611686018427387903L, 0x3FFFFFFFFFFFFFFFL));
    }
}

