// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package l1;

import F0.t;
import g0.a;
import F0.c;
import d0.q;
import F0.T;
import g0.z;
import g0.y;

public final class f implements m
{
    public final y a;
    public final z b;
    public final String c;
    public final int d;
    public String e;
    public T f;
    public int g;
    public int h;
    public boolean i;
    public boolean j;
    public long k;
    public q l;
    public int m;
    public long n;
    
    public f() {
        this(null, 0);
    }
    
    public f(final String c, final int d) {
        final y a = new y(new byte[16]);
        this.a = a;
        this.b = new z(a.a);
        this.g = 0;
        this.h = 0;
        this.i = false;
        this.j = false;
        this.n = -9223372036854775807L;
        this.c = c;
        this.d = d;
    }
    
    private boolean f(final z z, final byte[] array, final int n) {
        final int min = Math.min(z.a(), n - this.h);
        z.l(array, this.h, min);
        final int h = this.h + min;
        this.h = h;
        return h == n;
    }
    
    private void g() {
        this.a.p(0);
        final c.b d = F0.c.d(this.a);
        final q l = this.l;
        if (l == null || d.c != l.B || d.b != l.C || !"audio/ac4".equals(l.n)) {
            final q k = new q.b().a0(this.e).o0("audio/ac4").N(d.c).p0(d.b).e0(this.c).m0(this.d).K();
            this.l = k;
            this.f.d(k);
        }
        this.m = d.d;
        this.k = d.e * 1000000L / this.l.C;
    }
    
    private boolean h(final z z) {
        while (true) {
            final int a = z.a();
            final boolean b = false;
            boolean i = false;
            if (a <= 0) {
                return false;
            }
            if (!this.i) {
                if (z.G() == 172) {
                    i = true;
                }
                this.i = i;
            }
            else {
                final int g = z.G();
                this.i = (g == 172);
                if (g == 64 || g == 65) {
                    boolean j = b;
                    if (g == 65) {
                        j = true;
                    }
                    this.j = j;
                    return true;
                }
                continue;
            }
        }
    }
    
    @Override
    public void a(final z z) {
        g0.a.h(this.f);
        while (z.a() > 0) {
            final int g = this.g;
            boolean b = true;
            if (g != 0) {
                if (g != 1) {
                    if (g != 2) {
                        continue;
                    }
                    final int min = Math.min(z.a(), this.m - this.h);
                    this.f.e(z, min);
                    if ((this.h += min) != this.m) {
                        continue;
                    }
                    if (this.n == -9223372036854775807L) {
                        b = false;
                    }
                    g0.a.f(b);
                    this.f.b(this.n, 1, this.m, 0, null);
                    this.n += this.k;
                    this.g = 0;
                }
                else {
                    if (!this.f(z, this.b.e(), 16)) {
                        continue;
                    }
                    this.g();
                    this.b.T(0);
                    this.f.e(this.b, 16);
                    this.g = 2;
                }
            }
            else {
                if (!this.h(z)) {
                    continue;
                }
                this.g = 1;
                this.b.e()[0] = -84;
                final byte[] e = this.b.e();
                int n;
                if (this.j) {
                    n = 65;
                }
                else {
                    n = 64;
                }
                e[1] = (byte)n;
                this.h = 2;
            }
        }
    }
    
    @Override
    public void b() {
        this.g = 0;
        this.h = 0;
        this.i = false;
        this.j = false;
        this.n = -9223372036854775807L;
    }
    
    @Override
    public void c(final boolean b) {
    }
    
    @Override
    public void d(final long n, final int n2) {
        this.n = n;
    }
    
    @Override
    public void e(final t t, final K.d d) {
        d.a();
        this.e = d.b();
        this.f = t.a(d.c(), 1);
    }
}
