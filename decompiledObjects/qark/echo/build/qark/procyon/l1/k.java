// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package l1;

import a3.f;
import g0.M;
import F0.t;
import F0.p;
import g0.a;
import d0.q;
import F0.T;
import java.util.concurrent.atomic.AtomicInteger;
import g0.z;

public final class k implements m
{
    public final z a;
    public final AtomicInteger b;
    public final String c;
    public final int d;
    public String e;
    public T f;
    public int g;
    public int h;
    public int i;
    public long j;
    public q k;
    public int l;
    public int m;
    public int n;
    public int o;
    public long p;
    
    public k(final String c, final int d, final int n) {
        this.a = new z(new byte[n]);
        this.g = 0;
        this.p = -9223372036854775807L;
        this.b = new AtomicInteger();
        this.n = -1;
        this.o = -1;
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
    
    @Override
    public void a(final z z) {
        g0.a.h(this.f);
        while (z.a() > 0) {
            int g = 0;
            Label_0338: {
                Label_0263: {
                    T t = null;
                    z z2 = null;
                    int n2 = 0;
                    switch (this.g) {
                        default: {
                            throw new IllegalStateException();
                        }
                        case 6: {
                            final int min = Math.min(z.a(), this.l - this.h);
                            this.f.e(z, min);
                            final int h = this.h + min;
                            this.h = h;
                            if (h == this.l) {
                                g0.a.f(this.p != -9223372036854775807L);
                                final T f = this.f;
                                final long p = this.p;
                                int n;
                                if (this.m == 4) {
                                    n = 0;
                                }
                                else {
                                    n = 1;
                                }
                                f.b(p, n, this.l, 0, null);
                                this.p += this.j;
                                this.g = 0;
                                continue;
                            }
                            continue;
                        }
                        case 5: {
                            if (this.f(z, this.a.e(), this.o)) {
                                this.i();
                                this.a.T(0);
                                t = this.f;
                                z2 = this.a;
                                n2 = this.o;
                                break;
                            }
                            continue;
                        }
                        case 4: {
                            if (this.f(z, this.a.e(), 6)) {
                                final int l = F0.p.l(this.a.e());
                                this.o = l;
                                final int h2 = this.h;
                                if (h2 > l) {
                                    final int n3 = h2 - l;
                                    this.h = h2 - n3;
                                    z.T(z.f() - n3);
                                }
                                g = 5;
                                break Label_0338;
                            }
                            continue;
                        }
                        case 3: {
                            if (this.f(z, this.a.e(), this.n)) {
                                this.h();
                                this.a.T(0);
                                t = this.f;
                                z2 = this.a;
                                n2 = this.n;
                                break;
                            }
                            continue;
                        }
                        case 2: {
                            if (this.f(z, this.a.e(), 7)) {
                                this.n = F0.p.j(this.a.e());
                                this.g = 3;
                                continue;
                            }
                            continue;
                        }
                        case 1: {
                            if (this.f(z, this.a.e(), 18)) {
                                this.g();
                                this.a.T(0);
                                this.f.e(this.a, 18);
                                break Label_0263;
                            }
                            continue;
                        }
                        case 0: {
                            if (!this.j(z)) {
                                continue;
                            }
                            final int m = this.m;
                            if (m == 3 || m == 4) {
                                this.g = 4;
                                continue;
                            }
                            if (m == 1) {
                                this.g = 1;
                                continue;
                            }
                            g = 2;
                            break Label_0338;
                        }
                    }
                    t.e(z2, n2);
                }
                this.g = 6;
                continue;
            }
            this.g = g;
        }
    }
    
    @Override
    public void b() {
        this.g = 0;
        this.h = 0;
        this.i = 0;
        this.p = -9223372036854775807L;
        this.b.set(0);
    }
    
    @Override
    public void c(final boolean b) {
    }
    
    @Override
    public void d(final long p2, final int n) {
        this.p = p2;
    }
    
    @Override
    public void e(final t t, final K.d d) {
        d.a();
        this.e = d.b();
        this.f = t.a(d.c(), 1);
    }
    
    public final void g() {
        final byte[] e = this.a.e();
        if (this.k == null) {
            final q h = F0.p.h(e, this.e, this.c, this.d, null);
            this.k = h;
            this.f.d(h);
        }
        this.l = F0.p.b(e);
        this.j = a3.f.d(M.V0(F0.p.g(e), this.k.C));
    }
    
    public final void h() {
        final p.b i = F0.p.i(this.a.e());
        this.k(i);
        this.l = i.d;
        long e;
        if ((e = i.e) == -9223372036854775807L) {
            e = 0L;
        }
        this.j = e;
    }
    
    public final void i() {
        final p.b k = F0.p.k(this.a.e(), this.b);
        if (this.m == 3) {
            this.k(k);
        }
        this.l = k.d;
        long e;
        if ((e = k.e) == -9223372036854775807L) {
            e = 0L;
        }
        this.j = e;
    }
    
    public final boolean j(final z z) {
        while (z.a() > 0) {
            final int i = this.i << 8;
            this.i = i;
            final int j = i | z.G();
            this.i = j;
            if ((this.m = F0.p.c(j)) != 0) {
                final byte[] e = this.a.e();
                final int k = this.i;
                e[0] = (byte)(k >> 24 & 0xFF);
                e[1] = (byte)(k >> 16 & 0xFF);
                e[2] = (byte)(k >> 8 & 0xFF);
                e[3] = (byte)(k & 0xFF);
                this.h = 4;
                this.i = 0;
                return true;
            }
        }
        return false;
    }
    
    public final void k(final p.b b) {
        final int b2 = b.b;
        if (b2 != -2147483647) {
            final int c = b.c;
            if (c == -1) {
                return;
            }
            final q k = this.k;
            if (k == null || c != k.B || b2 != k.C || !M.c(b.a, k.n)) {
                final q i = this.k;
                Object a;
                if (i == null) {
                    a = new q.b();
                }
                else {
                    a = i.a();
                }
                final q j = ((q.b)a).a0(this.e).o0(b.a).N(b.c).p0(b.b).e0(this.c).m0(this.d).K();
                this.k = j;
                this.f.d(j);
            }
        }
    }
}
