// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package l1;

import java.util.List;
import d0.q;
import g0.M;
import F0.t;
import g0.a;
import F0.T;
import g0.y;
import g0.z;

public final class u implements m
{
    public final z a;
    public final y b;
    public final z c;
    public int d;
    public String e;
    public T f;
    public double g;
    public double h;
    public boolean i;
    public boolean j;
    public int k;
    public int l;
    public boolean m;
    public int n;
    public int o;
    public v.b p;
    public int q;
    public int r;
    public int s;
    public long t;
    public boolean u;
    
    public u() {
        this.d = 0;
        this.a = new z(new byte[15], 2);
        this.b = new y();
        this.c = new z();
        this.p = new v.b();
        this.q = -2147483647;
        this.r = -1;
        this.t = -1L;
        this.j = true;
        this.m = true;
        this.g = -9.223372036854776E18;
        this.h = -9.223372036854776E18;
    }
    
    private boolean k(final z z) {
        final int k = this.k;
        if ((k & 0x2) == 0x0) {
            z.T(z.g());
            return false;
        }
        if ((k & 0x4) == 0x0) {
            while (z.a() > 0) {
                final int l = this.l << 8;
                this.l = l;
                final int i = l | z.G();
                this.l = i;
                if (v.e(i)) {
                    z.T(z.f() - 3);
                    this.l = 0;
                    return true;
                }
            }
            return false;
        }
        return true;
    }
    
    @Override
    public void a(final z z) {
        g0.a.h(this.f);
        while (z.a() > 0) {
            final int d = this.d;
            if (d != 0) {
                if (d == 1) {
                    this.f(z, this.a, false);
                    if (this.a.a() == 0) {
                        if (this.i()) {
                            this.a.T(0);
                            final T f = this.f;
                            final z a = this.a;
                            f.e(a, a.g());
                            this.a.P(2);
                            this.c.P(this.p.c);
                            this.m = true;
                            this.d = 2;
                            continue;
                        }
                        if (this.a.g() >= 15) {
                            continue;
                        }
                        final z a2 = this.a;
                        a2.S(a2.g() + 1);
                    }
                    this.m = false;
                    continue;
                }
                if (d != 2) {
                    throw new IllegalStateException();
                }
                if (this.j(this.p.a)) {
                    this.f(z, this.c, true);
                }
                this.l(z);
                final int n = this.n;
                final v.b p = this.p;
                if (n != p.c) {
                    continue;
                }
                final int a3 = p.a;
                if (a3 == 1) {
                    this.h(new y(this.c.e()));
                }
                else if (a3 == 17) {
                    this.s = v.f(new y(this.c.e()));
                }
                else if (a3 == 2) {
                    this.g();
                }
            }
            else if (!this.k(z)) {
                continue;
            }
            this.d = 1;
        }
    }
    
    @Override
    public void b() {
        this.d = 0;
        this.l = 0;
        this.a.P(2);
        this.n = 0;
        this.o = 0;
        this.q = -2147483647;
        this.r = -1;
        this.s = 0;
        this.t = -1L;
        this.u = false;
        this.i = false;
        this.m = true;
        this.j = true;
        this.g = -9.223372036854776E18;
        this.h = -9.223372036854776E18;
    }
    
    @Override
    public void c(final boolean b) {
    }
    
    @Override
    public void d(final long n, final int k) {
        this.k = k;
        if (!this.j && (this.o != 0 || !this.m)) {
            this.i = true;
        }
        if (n != -9223372036854775807L) {
            final boolean i = this.i;
            final double n2 = (double)n;
            if (i) {
                this.h = n2;
                return;
            }
            this.g = n2;
        }
    }
    
    @Override
    public void e(final t t, final K.d d) {
        d.a();
        this.e = d.b();
        this.f = t.a(d.c(), 1);
    }
    
    public final void f(final z z, final z z2, final boolean b) {
        final int f = z.f();
        final int min = Math.min(z.a(), z2.a());
        z.l(z2.e(), z2.f(), min);
        z2.U(min);
        if (b) {
            z.T(f);
        }
    }
    
    public final void g() {
        int n;
        if (this.u) {
            this.j = false;
            n = 1;
        }
        else {
            n = 0;
        }
        final double n2 = (this.r - this.s) * 1000000.0 / this.q;
        final long round = Math.round(this.g);
        if (this.i) {
            this.i = false;
            this.g = this.h;
        }
        else {
            this.g += n2;
        }
        this.f.b(round, n, this.o, 0, null);
        this.u = false;
        this.s = 0;
        this.o = 0;
    }
    
    public final void h(final y y) {
        final v.c h = v.h(y);
        this.q = h.b;
        this.r = h.c;
        final long t = this.t;
        final long b = this.p.b;
        if (t != b) {
            this.t = b;
            final int a = h.a;
            String string = "mhm1";
            if (a != -1) {
                final StringBuilder sb = new StringBuilder();
                sb.append("mhm1");
                sb.append(String.format(".%02X", h.a));
                string = sb.toString();
            }
            final byte[] d = h.d;
            X2.v a2;
            if (d != null && d.length > 0) {
                a2 = X2.v.a0(M.f, d);
            }
            else {
                a2 = null;
            }
            this.f.d(new q.b().a0(this.e).o0("audio/mhm1").p0(this.q).O(string).b0(a2).K());
        }
        this.u = true;
    }
    
    public final boolean i() {
        final int g = this.a.g();
        this.b.o(this.a.e(), g);
        final boolean g2 = v.g(this.b, this.p);
        if (g2) {
            this.n = 0;
            this.o += this.p.c + g;
        }
        return g2;
    }
    
    public final boolean j(final int n) {
        boolean b = true;
        if (n != 1) {
            if (n == 17) {
                return true;
            }
            b = false;
        }
        return b;
    }
    
    public final void l(final z z) {
        final int min = Math.min(z.a(), this.p.c - this.n);
        this.f.e(z, min);
        this.n += min;
    }
}
