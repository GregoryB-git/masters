// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package l1;

import g0.M;
import F0.b;
import F0.t;
import g0.a;
import d0.q;
import F0.T;
import g0.z;
import g0.y;

public final class c implements m
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
    public long j;
    public q k;
    public int l;
    public long m;
    
    public c() {
        this(null, 0);
    }
    
    public c(final String c, final int d) {
        final y a = new y(new byte[128]);
        this.a = a;
        this.b = new z(a.a);
        this.g = 0;
        this.m = -9223372036854775807L;
        this.c = c;
        this.d = d;
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
                    final int min = Math.min(z.a(), this.l - this.h);
                    this.f.e(z, min);
                    if ((this.h += min) != this.l) {
                        continue;
                    }
                    if (this.m == -9223372036854775807L) {
                        b = false;
                    }
                    g0.a.f(b);
                    this.f.b(this.m, 1, this.l, 0, null);
                    this.m += this.j;
                    this.g = 0;
                }
                else {
                    if (!this.f(z, this.b.e(), 128)) {
                        continue;
                    }
                    this.g();
                    this.b.T(0);
                    this.f.e(this.b, 128);
                    this.g = 2;
                }
            }
            else {
                if (!this.h(z)) {
                    continue;
                }
                this.g = 1;
                this.b.e()[0] = 11;
                this.b.e()[1] = 119;
                this.h = 2;
            }
        }
    }
    
    @Override
    public void b() {
        this.g = 0;
        this.h = 0;
        this.i = false;
        this.m = -9223372036854775807L;
    }
    
    @Override
    public void c(final boolean b) {
    }
    
    @Override
    public void d(final long m, final int n) {
        this.m = m;
    }
    
    @Override
    public void e(final t t, final K.d d) {
        d.a();
        this.e = d.b();
        this.f = t.a(d.c(), 1);
    }
    
    public final boolean f(final z z, final byte[] array, final int n) {
        final int min = Math.min(z.a(), n - this.h);
        z.l(array, this.h, min);
        final int h = this.h + min;
        this.h = h;
        return h == n;
    }
    
    public final void g() {
        this.a.p(0);
        final b.b f = F0.b.f(this.a);
        final q k = this.k;
        if (k == null || f.d != k.B || f.c != k.C || !M.c(f.a, k.n)) {
            final q.b j0 = new q.b().a0(this.e).o0(f.a).N(f.d).p0(f.c).e0(this.c).m0(this.d).j0(f.g);
            if ("audio/ac3".equals(f.a)) {
                j0.M(f.g);
            }
            final q i = j0.K();
            this.k = i;
            this.f.d(i);
        }
        this.l = f.e;
        this.j = f.f * 1000000L / this.k.C;
    }
    
    public final boolean h(final z z) {
        while (true) {
            final int a = z.a();
            boolean i = false;
            if (a <= 0) {
                return false;
            }
            Label_0029: {
                if (!this.i) {
                    if (z.G() != 11) {
                        break Label_0029;
                    }
                }
                else {
                    final int g = z.G();
                    if (g == 119) {
                        this.i = false;
                        return true;
                    }
                    if (g != 11) {
                        break Label_0029;
                    }
                }
                i = true;
            }
            this.i = i;
        }
    }
}
