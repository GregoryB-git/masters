/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.IllegalStateException
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.String
 */
package D0;

import D0.q;
import d0.P;
import g0.D;

public final class t {
    public final a a;
    public final q b;
    public final q.a c;
    public final D d;
    public final D e;
    public final g0.q f;
    public P g;
    public P h;
    public long i;
    public long j;

    public t(a a8, q q8) {
        this.a = a8;
        this.b = q8;
        this.c = new q.a();
        this.d = new D();
        this.e = new D();
        this.f = new g0.q();
        this.h = P.e;
        this.j = -9223372036854775807L;
    }

    public static Object c(D d8) {
        boolean bl = d8.k() > 0;
        g0.a.a(bl);
        while (d8.k() > 1) {
            d8.h();
        }
        return g0.a.e(d8.h());
    }

    public final void a() {
        g0.a.h(this.f.d());
        this.a.d();
    }

    public void b() {
        this.f.a();
        this.j = -9223372036854775807L;
        if (this.e.k() > 0) {
            Long l8 = (Long)t.c(this.e);
            l8.longValue();
            this.e.a(0L, (Object)l8);
        }
        if (this.g == null) {
            if (this.d.k() > 0) {
                this.g = (P)t.c(this.d);
                return;
            }
        } else {
            this.d.c();
        }
    }

    public boolean d(long l8) {
        long l9 = this.j;
        if (l9 != -9223372036854775807L && l9 >= l8) {
            return true;
        }
        return false;
    }

    public boolean e() {
        return this.b.d(true);
    }

    public final boolean f(long l8) {
        Long l9 = (Long)this.e.i(l8);
        if (l9 != null && l9 != this.i) {
            this.i = l9;
            return true;
        }
        return false;
    }

    public final boolean g(long l8) {
        P p8 = (P)this.d.i(l8);
        if (p8 == null) {
            return false;
        }
        if (!p8.equals(P.e) && !p8.equals(this.h)) {
            this.h = p8;
            return true;
        }
        return false;
    }

    public void h(long l8, long l9) {
        while (!this.f.c()) {
            long l10 = this.f.b();
            if (this.f(l10)) {
                this.b.j();
            }
            int n8 = this.b.c(l10, l8, l9, this.i, false, this.c);
            boolean bl = true;
            if (n8 != 0 && n8 != 1) {
                if (n8 != 2 && n8 != 3 && n8 != 4) {
                    if (n8 == 5) {
                        return;
                    }
                    throw new IllegalStateException(String.valueOf((int)n8));
                }
                this.j = l10;
                this.a();
                continue;
            }
            this.j = l10;
            if (n8 != 0) {
                bl = false;
            }
            this.i(bl);
        }
    }

    public final void i(boolean bl) {
        long l8 = (Long)g0.a.h(this.f.d());
        if (this.g(l8)) {
            this.a.b(this.h);
        }
        long l9 = bl ? -1L : this.c.g();
        this.a.c(l9, l8, this.i, this.b.i());
    }

    public void j(float f8) {
        boolean bl = f8 > 0.0f;
        g0.a.a(bl);
        this.b.r(f8);
    }

    public static interface a {
        public void b(P var1);

        public void c(long var1, long var3, long var5, boolean var7);

        public void d();
    }

}

