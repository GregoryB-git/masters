// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package l1;

import java.util.List;
import java.util.Collections;
import d0.A;
import F0.t;
import g0.a;
import d0.q;
import F0.T;
import g0.y;
import g0.z;

public final class s implements m
{
    public final String a;
    public final int b;
    public final z c;
    public final y d;
    public T e;
    public String f;
    public q g;
    public int h;
    public int i;
    public int j;
    public int k;
    public long l;
    public boolean m;
    public int n;
    public int o;
    public int p;
    public boolean q;
    public long r;
    public int s;
    public long t;
    public int u;
    public String v;
    
    public s(final String a, final int b) {
        this.a = a;
        this.b = b;
        final z c = new z(1024);
        this.c = c;
        this.d = new y(c.e());
        this.l = -9223372036854775807L;
    }
    
    public static long f(final y y) {
        return y.h((y.h(2) + 1) * 8);
    }
    
    @Override
    public void a(final z z) {
        g0.a.h(this.e);
        while (z.a() > 0) {
            final int h = this.h;
            if (h != 0) {
                if (h != 1) {
                    if (h == 2) {
                        if ((this.j = ((this.k & 0xFFFFFF1F) << 8 | z.G())) > this.c.e().length) {
                            this.m(this.j);
                        }
                        this.i = 0;
                        this.h = 3;
                        continue;
                    }
                    if (h != 3) {
                        throw new IllegalStateException();
                    }
                    final int min = Math.min(z.a(), this.j - this.i);
                    z.l(this.d.a, this.i, min);
                    if ((this.i += min) != this.j) {
                        continue;
                    }
                    this.d.p(0);
                    this.g(this.d);
                }
                else {
                    final int g = z.G();
                    if ((g & 0xE0) == 0xE0) {
                        this.k = g;
                        this.h = 2;
                        continue;
                    }
                    if (g == 86) {
                        continue;
                    }
                }
                this.h = 0;
            }
            else {
                if (z.G() != 86) {
                    continue;
                }
                this.h = 1;
            }
        }
    }
    
    @Override
    public void b() {
        this.h = 0;
        this.l = -9223372036854775807L;
        this.m = false;
    }
    
    @Override
    public void c(final boolean b) {
    }
    
    @Override
    public void d(final long l, final int n) {
        this.l = l;
    }
    
    @Override
    public void e(final t t, final K.d d) {
        d.a();
        this.e = t.a(d.c(), 1);
        this.f = d.b();
    }
    
    public final void g(final y y) {
        if (!y.g()) {
            this.m = true;
            this.l(y);
        }
        else if (!this.m) {
            return;
        }
        if (this.n != 0) {
            throw A.a(null, null);
        }
        if (this.o == 0) {
            this.k(y, this.j(y));
            if (this.q) {
                y.r((int)this.r);
            }
            return;
        }
        throw A.a(null, null);
    }
    
    public final int h(final y y) {
        final int b = y.b();
        final F0.a.b d = F0.a.d(y, true);
        this.v = d.c;
        this.s = d.a;
        this.u = d.b;
        return b - y.b();
    }
    
    public final void i(final y y) {
        final int h = y.h(3);
        this.p = h;
        int n;
        if (h != 0) {
            if (h != 1) {
                if (h == 3 || h == 4 || h == 5) {
                    y.r(6);
                    return;
                }
                if (h != 6 && h != 7) {
                    throw new IllegalStateException();
                }
                y.r(1);
                return;
            }
            else {
                n = 9;
            }
        }
        else {
            n = 8;
        }
        y.r(n);
    }
    
    public final int j(final y y) {
        if (this.p == 0) {
            int n = 0;
            int i;
            do {
                i = y.h(8);
                n += i;
            } while (i == 255);
            return n;
        }
        throw A.a(null, null);
    }
    
    public final void k(final y y, final int n) {
        final int e = y.e();
        boolean b = false;
        if ((e & 0x7) == 0x0) {
            this.c.T(e >> 3);
        }
        else {
            y.i(this.c.e(), 0, n * 8);
            this.c.T(0);
        }
        this.e.e(this.c, n);
        if (this.l != -9223372036854775807L) {
            b = true;
        }
        g0.a.f(b);
        this.e.b(this.l, 1, n, 0, null);
        this.l += this.t;
    }
    
    public final void l(final y y) {
        final int h = y.h(1);
        int h2;
        if (h == 1) {
            h2 = y.h(1);
        }
        else {
            h2 = 0;
        }
        this.n = h2;
        if (h2 != 0) {
            throw A.a(null, null);
        }
        if (h == 1) {
            f(y);
        }
        if (!y.g()) {
            throw A.a(null, null);
        }
        this.o = y.h(6);
        final int h3 = y.h(4);
        final int h4 = y.h(3);
        if (h3 == 0 && h4 == 0) {
            if (h == 0) {
                final int e = y.e();
                final int h5 = this.h(y);
                y.p(e);
                final byte[] o = new byte[(h5 + 7) / 8];
                y.i(o, 0, h5);
                final q k = new q.b().a0(this.f).o0("audio/mp4a-latm").O(this.v).N(this.u).p0(this.s).b0(Collections.singletonList(o)).e0(this.a).m0(this.b).K();
                if (!k.equals(this.g)) {
                    this.g = k;
                    this.t = 1024000000L / k.C;
                    this.e.d(k);
                }
            }
            else {
                y.r((int)f(y) - this.h(y));
            }
            this.i(y);
            final boolean g = y.g();
            this.q = g;
            this.r = 0L;
            if (g) {
                if (h == 1) {
                    this.r = f(y);
                }
                else {
                    boolean g2;
                    do {
                        g2 = y.g();
                        this.r = (this.r << 8) + y.h(8);
                    } while (g2);
                }
            }
            if (y.g()) {
                y.r(8);
            }
            return;
        }
        throw A.a(null, null);
    }
    
    public final void m(final int n) {
        this.c.P(n);
        this.d.n(this.c.e());
    }
}
