// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package l1;

import d0.q;
import g0.a;
import F0.T;
import F0.I;
import g0.z;

public final class t implements m
{
    public final z a;
    public final I.a b;
    public final String c;
    public final int d;
    public T e;
    public String f;
    public int g;
    public int h;
    public boolean i;
    public boolean j;
    public long k;
    public int l;
    public long m;
    
    public t() {
        this(null, 0);
    }
    
    public t(final String c, final int d) {
        this.g = 0;
        final z a = new z(4);
        this.a = a;
        a.e()[0] = -1;
        this.b = new I.a();
        this.m = -9223372036854775807L;
        this.c = c;
        this.d = d;
    }
    
    @Override
    public void a(final z z) {
        g0.a.h(this.e);
        while (z.a() > 0) {
            final int g = this.g;
            if (g != 0) {
                if (g != 1) {
                    if (g != 2) {
                        throw new IllegalStateException();
                    }
                    this.g(z);
                }
                else {
                    this.h(z);
                }
            }
            else {
                this.f(z);
            }
        }
    }
    
    @Override
    public void b() {
        this.g = 0;
        this.h = 0;
        this.j = false;
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
    public void e(final F0.t t, final K.d d) {
        d.a();
        this.f = d.b();
        this.e = t.a(d.c(), 1);
    }
    
    public final void f(final z z) {
        final byte[] e = z.e();
        int i;
        int g;
        for (i = z.f(), g = z.g(); i < g; ++i) {
            final byte b = e[i];
            final boolean j = (b & 0xFF) == 0xFF;
            final boolean b2 = this.j && (b & 0xE0) == 0xE0;
            this.j = j;
            if (b2) {
                z.T(i + 1);
                this.j = false;
                this.a.e()[1] = e[i];
                this.h = 2;
                this.g = 1;
                return;
            }
        }
        z.T(g);
    }
    
    public final void g(final z z) {
        final int min = Math.min(z.a(), this.l - this.h);
        this.e.e(z, min);
        final int h = this.h + min;
        this.h = h;
        if (h < this.l) {
            return;
        }
        g0.a.f(this.m != -9223372036854775807L);
        this.e.b(this.m, 1, this.l, 0, null);
        this.m += this.k;
        this.h = 0;
        this.g = 0;
    }
    
    public final void h(final z z) {
        final int min = Math.min(z.a(), 4 - this.h);
        z.l(this.a.e(), this.h, min);
        final int h = this.h + min;
        this.h = h;
        if (h < 4) {
            return;
        }
        this.a.T(0);
        if (!this.b.a(this.a.p())) {
            this.h = 0;
            this.g = 1;
            return;
        }
        final I.a b = this.b;
        this.l = b.c;
        if (!this.i) {
            this.k = b.g * 1000000L / b.d;
            this.e.d(new q.b().a0(this.f).o0(this.b.b).f0(4096).N(this.b.e).p0(this.b.d).e0(this.c).m0(this.d).K());
            this.i = true;
        }
        this.a.T(0);
        this.e.e(this.a, 4);
        this.g = 2;
    }
}
