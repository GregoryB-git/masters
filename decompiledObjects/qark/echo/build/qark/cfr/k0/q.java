/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.SystemClock
 *  java.lang.Math
 *  java.lang.Object
 */
package k0;

import a3.h;
import android.os.SystemClock;
import d0.u;
import g0.M;
import g0.a;
import k0.w0;

public final class q
implements w0 {
    public final float a;
    public final float b;
    public final long c;
    public final float d;
    public final long e;
    public final long f;
    public final float g;
    public long h;
    public long i;
    public long j;
    public long k;
    public long l;
    public long m;
    public float n;
    public float o;
    public float p;
    public long q;
    public long r;
    public long s;

    public q(float f8, float f9, long l8, float f10, long l9, long l10, float f11) {
        this.a = f8;
        this.b = f9;
        this.c = l8;
        this.d = f10;
        this.e = l9;
        this.f = l10;
        this.g = f11;
        this.h = -9223372036854775807L;
        this.i = -9223372036854775807L;
        this.k = -9223372036854775807L;
        this.l = -9223372036854775807L;
        this.o = f8;
        this.n = f9;
        this.p = 1.0f;
        this.q = -9223372036854775807L;
        this.j = -9223372036854775807L;
        this.m = -9223372036854775807L;
        this.r = -9223372036854775807L;
        this.s = -9223372036854775807L;
    }

    public /* synthetic */ q(float f8, float f9, long l8, float f10, long l9, long l10, float f11,  a8) {
        this(f8, f9, l8, f10, l9, l10, f11);
    }

    public static long h(long l8, long l9, float f8) {
        return (long)((float)l8 * f8 + (1.0f - f8) * (float)l9);
    }

    @Override
    public void a() {
        long l8 = this.m;
        if (l8 == -9223372036854775807L) {
            return;
        }
        this.m = l8 += this.f;
        long l9 = this.l;
        if (l9 != -9223372036854775807L && l8 > l9) {
            this.m = l9;
        }
        this.q = -9223372036854775807L;
    }

    @Override
    public void b(u.g g8) {
        this.h = M.J0(g8.a);
        this.k = M.J0(g8.b);
        this.l = M.J0(g8.c);
        float f8 = g8.d;
        if (f8 == -3.4028235E38f) {
            f8 = this.a;
        }
        this.o = f8;
        float f9 = g8.e;
        if (f9 == -3.4028235E38f) {
            f9 = this.b;
        }
        this.n = f9;
        if (f8 == 1.0f && f9 == 1.0f) {
            this.h = -9223372036854775807L;
        }
        this.g();
    }

    @Override
    public float c(long l8, long l9) {
        if (this.h == -9223372036854775807L) {
            return 1.0f;
        }
        this.i(l8, l9);
        if (this.q != -9223372036854775807L && SystemClock.elapsedRealtime() - this.q < this.c) {
            return this.p;
        }
        this.q = SystemClock.elapsedRealtime();
        this.f(l8);
        this.p = Math.abs((long)(l8 -= this.m)) < this.e ? 1.0f : M.o(this.d * (float)l8 + 1.0f, this.o, this.n);
        return this.p;
    }

    @Override
    public void d(long l8) {
        this.i = l8;
        this.g();
    }

    @Override
    public long e() {
        return this.m;
    }

    public final void f(long l8) {
        long l9 = this.r + this.s * 3L;
        if (this.m > l9) {
            l8 = M.J0(this.c);
            float f8 = this.p;
            float f9 = l8;
            l8 = (long)((f8 - 1.0f) * f9);
            long l10 = (long)((this.n - 1.0f) * f9);
            this.m = h.c(l9, this.j, this.m - (l8 + l10));
            return;
        }
        this.m = l8 = M.q(l8 - (long)(Math.max((float)0.0f, (float)(this.p - 1.0f)) / this.d), this.m, l9);
        l9 = this.l;
        if (l9 != -9223372036854775807L && l8 > l9) {
            this.m = l9;
        }
    }

    public final void g() {
        long l8;
        long l9 = this.h;
        if (l9 != -9223372036854775807L) {
            l8 = this.i;
            if (l8 == -9223372036854775807L) {
                long l10 = this.k;
                l8 = l9;
                if (l10 != -9223372036854775807L) {
                    l8 = l9;
                    if (l9 < l10) {
                        l8 = l10;
                    }
                }
                if ((l9 = this.l) != -9223372036854775807L && l8 > l9) {
                    l8 = l9;
                }
            }
        } else {
            l8 = -9223372036854775807L;
        }
        if (this.j == l8) {
            return;
        }
        this.j = l8;
        this.m = l8;
        this.r = -9223372036854775807L;
        this.s = -9223372036854775807L;
        this.q = -9223372036854775807L;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void i(long l8, long l9) {
        l8 -= l9;
        l9 = this.r;
        if (l9 == -9223372036854775807L) {
            this.r = l8;
            l8 = 0L;
        } else {
            this.r = l9 = Math.max((long)l8, (long)q.h(l9, l8, this.g));
            l8 = Math.abs((long)(l8 - l9));
            l8 = q.h(this.s, l8, this.g);
        }
        this.s = l8;
    }

    public static final class b {
        public float a = 0.97f;
        public float b = 1.03f;
        public long c = 1000L;
        public float d = 1.0E-7f;
        public long e = M.J0(20L);
        public long f = M.J0(500L);
        public float g = 0.999f;

        public q a() {
            return new q(this.a, this.b, this.c, this.d, this.e, this.f, this.g, null);
        }

        public b b(float f8) {
            boolean bl = f8 >= 1.0f;
            a.a(bl);
            this.b = f8;
            return this;
        }

        public b c(float f8) {
            boolean bl = 0.0f < f8 && f8 <= 1.0f;
            a.a(bl);
            this.a = f8;
            return this;
        }

        public b d(long l8) {
            boolean bl = l8 > 0L;
            a.a(bl);
            this.e = M.J0(l8);
            return this;
        }

        public b e(float f8) {
            boolean bl = f8 >= 0.0f && f8 < 1.0f;
            a.a(bl);
            this.g = f8;
            return this;
        }

        public b f(long l8) {
            boolean bl = l8 > 0L;
            a.a(bl);
            this.c = l8;
            return this;
        }

        public b g(float f8) {
            boolean bl = f8 > 0.0f;
            a.a(bl);
            this.d = f8 / 1000000.0f;
            return this;
        }

        public b h(long l8) {
            boolean bl = l8 >= 0L;
            a.a(bl);
            this.f = M.J0(l8);
            return this;
        }
    }

}

