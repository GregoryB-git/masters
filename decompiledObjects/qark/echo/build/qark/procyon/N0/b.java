// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package N0;

import d0.x;
import F0.L;
import java.util.List;
import F0.M;
import F0.q;
import Z0.m;
import F0.s;
import U0.a;
import F0.t;
import g0.z;
import F0.r;

public final class b implements r
{
    public final z a;
    public t b;
    public int c;
    public int d;
    public int e;
    public long f;
    public a g;
    public s h;
    public d i;
    public m j;
    
    public b() {
        this.a = new z(6);
        this.f = -1L;
    }
    
    public static a h(final String s, final long n) {
        if (n == -1L) {
            return null;
        }
        final c a = f.a(s);
        if (a == null) {
            return null;
        }
        return a.a(n);
    }
    
    private void m(final s s) {
        if (this.d == 65505) {
            final z z = new z(this.e);
            s.readFully(z.e(), 0, this.e);
            if (this.g == null && "http://ns.adobe.com/xap/1.0/".equals(z.A())) {
                final String a = z.A();
                if (a != null) {
                    final a h = h(a, s.a());
                    if ((this.g = h) != null) {
                        this.f = h.r;
                    }
                }
            }
        }
        else {
            s.i(this.e);
        }
        this.c = 0;
    }
    
    @Override
    public void a(final long n, final long n2) {
        if (n == 0L) {
            this.c = 0;
            this.j = null;
            return;
        }
        if (this.c == 5) {
            ((m)g0.a.e(this.j)).a(n, n2);
        }
    }
    
    @Override
    public void b(final t b) {
        this.b = b;
    }
    
    public final void c(final s s) {
        this.a.P(2);
        s.n(this.a.e(), 0, 2);
        s.o(this.a.M() - 2);
    }
    
    @Override
    public boolean e(final s s) {
        final int k = this.k(s);
        final boolean b = false;
        if (k != 65496) {
            return false;
        }
        if ((this.d = this.k(s)) == 65504) {
            this.c(s);
            this.d = this.k(s);
        }
        if (this.d != 65505) {
            return false;
        }
        s.o(2);
        this.a.P(6);
        s.n(this.a.e(), 0, 6);
        boolean b2 = b;
        if (this.a.I() == 1165519206L) {
            b2 = b;
            if (this.a.M() == 0) {
                b2 = true;
            }
        }
        return b2;
    }
    
    public final void f() {
        ((t)g0.a.e(this.b)).j();
        this.b.e(new M.b(-9223372036854775807L));
        this.c = 6;
    }
    
    @Override
    public int i(final s h, final L l) {
        final int c = this.c;
        if (c == 0) {
            this.l(h);
            return 0;
        }
        if (c == 1) {
            this.n(h);
            return 0;
        }
        if (c == 2) {
            this.m(h);
            return 0;
        }
        if (c != 4) {
            if (c == 5) {
                if (this.i == null || h != this.h) {
                    this.h = h;
                    this.i = new d(h, this.f);
                }
                final int i = ((m)g0.a.e(this.j)).i(this.i, l);
                if (i == 1) {
                    l.a += this.f;
                }
                return i;
            }
            if (c == 6) {
                return -1;
            }
            throw new IllegalStateException();
        }
        else {
            final long p2 = h.p();
            final long f = this.f;
            if (p2 != f) {
                l.a = f;
                return 1;
            }
            this.o(h);
            return 0;
        }
    }
    
    public final void j(final a a) {
        ((t)g0.a.e(this.b)).a(1024, 4).d(new d0.q.b().Q("image/jpeg").h0(new x(new x.b[] { a })).K());
    }
    
    public final int k(final s s) {
        this.a.P(2);
        s.n(this.a.e(), 0, 2);
        return this.a.M();
    }
    
    public final void l(final s s) {
        this.a.P(2);
        s.readFully(this.a.e(), 0, 2);
        final int m = this.a.M();
        this.d = m;
        int c;
        if (m == 65498) {
            if (this.f == -1L) {
                this.f();
                return;
            }
            c = 4;
        }
        else {
            if ((m >= 65488 && m <= 65497) || m == 65281) {
                return;
            }
            c = 1;
        }
        this.c = c;
    }
    
    public final void n(final s s) {
        this.a.P(2);
        s.readFully(this.a.e(), 0, 2);
        this.e = this.a.M() - 2;
        this.c = 2;
    }
    
    public final void o(final s s) {
        if (s.l(this.a.e(), 0, 1, true)) {
            s.h();
            if (this.j == null) {
                this.j = new m(c1.t.a.a, 8);
            }
            final d i = new d(s, this.f);
            this.i = i;
            if (this.j.e(i)) {
                this.j.b(new e(this.f, (t)g0.a.e(this.b)));
                this.p();
                return;
            }
        }
        this.f();
    }
    
    public final void p() {
        this.j((a)g0.a.e(this.g));
        this.c = 5;
    }
    
    @Override
    public void release() {
        final m j = this.j;
        if (j != null) {
            j.release();
        }
    }
}
