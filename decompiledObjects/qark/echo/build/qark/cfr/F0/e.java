/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.String
 */
package F0;

import F0.L;
import F0.M;
import F0.N;
import F0.s;

public abstract class e {
    public final a a;
    public final f b;
    public c c;
    public final int d;

    public e(d d8, f f8, long l8, long l9, long l10, long l11, long l12, long l13, int n8) {
        this.b = f8;
        this.d = n8;
        this.a = new a(d8, l8, l9, l10, l11, l12, l13);
    }

    public c a(long l8) {
        return new c(l8, this.a.i(l8), this.a.c, this.a.d, this.a.e, this.a.f, this.a.g);
    }

    public final M b() {
        return this.a;
    }

    public int c(s s8, L l8) {
        long l9;
        do {
            c c8 = (c)g0.a.h(this.c);
            long l10 = c8.j();
            long l11 = c8.i();
            l9 = c8.k();
            if (l11 - l10 <= (long)this.d) {
                this.e(false, l10);
                return this.g(s8, l10, l8);
            }
            if (!this.i(s8, l9)) {
                return this.g(s8, l9, l8);
            }
            s8.h();
            e e8 = this.b.a(s8, c8.m());
            int n8 = e8.a;
            if (n8 == -3) break;
            if (n8 != -2) {
                if (n8 != -1) {
                    if (n8 == 0) {
                        this.i(s8, e8.c);
                        this.e(true, e8.c);
                        return this.g(s8, e8.c, l8);
                    }
                    throw new IllegalStateException("Invalid case");
                }
                c8.o(e8.b, e8.c);
                continue;
            }
            c8.p(e8.b, e8.c);
        } while (true);
        this.e(false, l9);
        return this.g(s8, l9, l8);
    }

    public final boolean d() {
        if (this.c != null) {
            return true;
        }
        return false;
    }

    public final void e(boolean bl, long l8) {
        this.c = null;
        this.b.b();
        this.f(bl, l8);
    }

    public void f(boolean bl, long l8) {
    }

    public final int g(s s8, long l8, L l9) {
        if (l8 == s8.p()) {
            return 0;
        }
        l9.a = l8;
        return 1;
    }

    public final void h(long l8) {
        c c8 = this.c;
        if (c8 != null && c8.l() == l8) {
            return;
        }
        this.c = this.a(l8);
    }

    public final boolean i(s s8, long l8) {
        if ((l8 -= s8.p()) >= 0L && l8 <= 262144L) {
            s8.i((int)l8);
            return true;
        }
        return false;
    }

    public static class a
    implements M {
        public final d a;
        public final long b;
        public final long c;
        public final long d;
        public final long e;
        public final long f;
        public final long g;

        public a(d d8, long l8, long l9, long l10, long l11, long l12, long l13) {
            this.a = d8;
            this.b = l8;
            this.c = l9;
            this.d = l10;
            this.e = l11;
            this.f = l12;
            this.g = l13;
        }

        @Override
        public boolean h() {
            return true;
        }

        public long i(long l8) {
            return this.a.a(l8);
        }

        @Override
        public M.a j(long l8) {
            return new M.a(new N(l8, c.h(this.a.a(l8), this.c, this.d, this.e, this.f, this.g)));
        }

        @Override
        public long l() {
            return this.b;
        }
    }

    public static final class b
    implements d {
        @Override
        public long a(long l8) {
            return l8;
        }
    }

    public static class c {
        public final long a;
        public final long b;
        public final long c;
        public long d;
        public long e;
        public long f;
        public long g;
        public long h;

        public c(long l8, long l9, long l10, long l11, long l12, long l13, long l14) {
            this.a = l8;
            this.b = l9;
            this.d = l10;
            this.e = l11;
            this.f = l12;
            this.g = l13;
            this.c = l14;
            this.h = c.h(l9, l10, l11, l12, l13, l14);
        }

        public static long h(long l8, long l9, long l10, long l11, long l12, long l13) {
            if (l11 + 1L < l12) {
                if (l9 + 1L >= l10) {
                    return l11;
                }
                float f8 = (float)(l12 - l11) / (float)(l10 - l9);
                l8 = (long)((float)(l8 - l9) * f8);
                return g0.M.q(l8 + l11 - l13 - l8 / 20L, l11, l12 - 1L);
            }
            return l11;
        }

        public final long i() {
            return this.g;
        }

        public final long j() {
            return this.f;
        }

        public final long k() {
            return this.h;
        }

        public final long l() {
            return this.a;
        }

        public final long m() {
            return this.b;
        }

        public final void n() {
            this.h = c.h(this.b, this.d, this.e, this.f, this.g, this.c);
        }

        public final void o(long l8, long l9) {
            this.e = l8;
            this.g = l9;
            this.n();
        }

        public final void p(long l8, long l9) {
            this.d = l8;
            this.f = l9;
            this.n();
        }
    }

    public static interface d {
        public long a(long var1);
    }

    public static final class e {
        public static final e d = new e(-3, -9223372036854775807L, -1L);
        public final int a;
        public final long b;
        public final long c;

        public e(int n8, long l8, long l9) {
            this.a = n8;
            this.b = l8;
            this.c = l9;
        }

        public static e d(long l8, long l9) {
            return new e(-1, l8, l9);
        }

        public static e e(long l8) {
            return new e(0, -9223372036854775807L, l8);
        }

        public static e f(long l8, long l9) {
            return new e(-2, l8, l9);
        }
    }

    public static interface f {
        public e a(s var1, long var2);

        public void b();
    }

}

