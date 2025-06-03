// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package x0;

import l0.y1;
import B0.k;
import p0.l;
import p0.A;
import android.os.Looper;
import g0.M;
import B0.b;
import d0.I;
import d0.u;
import i0.y;
import B0.m;
import p0.x;
import i0.g;

public final class L extends a implements K.c
{
    public final i0.g.a h;
    public final F.a i;
    public final p0.x j;
    public final m k;
    public final int l;
    public boolean m;
    public long n;
    public boolean o;
    public boolean p;
    public y q;
    public u r;
    
    public L(final u r, final i0.g.a h, final F.a i, final p0.x j, final m k, final int l) {
        this.r = r;
        this.h = h;
        this.i = i;
        this.j = j;
        this.k = k;
        this.l = l;
        this.m = true;
        this.n = -9223372036854775807L;
    }
    
    @Override
    public void B() {
        this.j.release();
    }
    
    public final u.h C() {
        return (u.h)g0.a.e(this.a().b);
    }
    
    public final void D() {
        I i;
        final V v = (V)(i = new V(this.n, this.o, (boolean)(0 != 0), this.p, null, this.a()));
        if (this.m) {
            i = new p(v) {
                @Override
                public I.b g(final int n, final I.b b, final boolean b2) {
                    super.g(n, b, b2);
                    b.f = true;
                    return b;
                }
                
                @Override
                public I.c o(final int n, final I.c c, final long n2) {
                    super.o(n, c, n2);
                    c.k = true;
                    return c;
                }
            };
        }
        this.A(i);
    }
    
    @Override
    public u a() {
        synchronized (this) {
            return this.r;
        }
    }
    
    @Override
    public void e(final v v) {
        ((K)v).g0();
    }
    
    @Override
    public v f(final x.b b, final B0.b b2, final long n) {
        final i0.g a = this.h.a();
        final y q = this.q;
        if (q != null) {
            a.c(q);
        }
        final u.h c = this.C();
        return new K(c.a, a, this.i.a(this.x()), this.j, this.s(b), this.k, this.u(b), (K.c)this, b2, c.e, this.l, g0.M.J0(c.i));
    }
    
    @Override
    public void h() {
    }
    
    @Override
    public void l(final u r) {
        synchronized (this) {
            this.r = r;
        }
    }
    
    @Override
    public void q(final long n, final boolean o, final boolean p3) {
        long n2 = n;
        if (n == -9223372036854775807L) {
            n2 = this.n;
        }
        if (!this.m && this.n == n2 && this.o == o && this.p == p3) {
            return;
        }
        this.n = n2;
        this.o = o;
        this.p = p3;
        this.m = false;
        this.D();
    }
    
    @Override
    public void z(final y q) {
        this.q = q;
        this.j.a((Looper)g0.a.e(Looper.myLooper()), this.x());
        this.j.g();
        this.D();
    }
    
    public static final class b implements x.a
    {
        public final i0.g.a a;
        public F.a b;
        public A c;
        public m d;
        public int e;
        
        public b(final i0.g.a a, final F0.x x) {
            this(a, new x0.M(x));
        }
        
        public b(final i0.g.a a, final F.a a2) {
            this(a, a2, new l(), new k(), 1048576);
        }
        
        public b(final i0.g.a a, final F.a b, final A c, final m d, final int e) {
            this.a = a;
            this.b = b;
            this.c = c;
            this.d = d;
            this.e = e;
        }
        
        public L b(final u u) {
            g0.a.e(u.b);
            return new L(u, this.a, this.b, this.c.a(u), this.d, this.e, null);
        }
    }
}
