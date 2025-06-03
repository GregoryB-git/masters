// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package x0;

import A0.y;
import k0.y0;
import k0.d1;
import g0.M;
import g0.a;
import B0.b;

public final class s implements v, a
{
    public final x.b o;
    public final long p;
    public final b q;
    public x r;
    public v s;
    public a t;
    public long u;
    
    public s(final x.b o, final b q, final long p3) {
        this.o = o;
        this.q = q;
        this.p = p3;
        this.u = -9223372036854775807L;
    }
    
    public void a(final x.b b) {
        final long t = this.t(this.p);
        final v f = ((x)g0.a.e(this.r)).f(b, this.q, t);
        this.s = f;
        if (this.t != null) {
            f.u((a)this, t);
        }
    }
    
    @Override
    public boolean b() {
        final v s = this.s;
        return s != null && s.b();
    }
    
    @Override
    public long c() {
        return ((v)M.i(this.s)).c();
    }
    
    @Override
    public long d(final long n, final d1 d1) {
        return ((v)M.i(this.s)).d(n, d1);
    }
    
    @Override
    public long f() {
        return ((v)M.i(this.s)).f();
    }
    
    @Override
    public boolean g(final y0 y0) {
        final v s = this.s;
        return s != null && s.g(y0);
    }
    
    @Override
    public void h(final long n) {
        ((v)M.i(this.s)).h(n);
    }
    
    @Override
    public long i(final y[] array, final boolean[] array2, final Q[] array3, final boolean[] array4, long n) {
        final long u = this.u;
        if (u != -9223372036854775807L && n == this.p) {
            n = u;
        }
        this.u = -9223372036854775807L;
        return ((v)M.i(this.s)).i(array, array2, array3, array4, n);
    }
    
    public long j() {
        return this.u;
    }
    
    @Override
    public void k(final v v) {
        ((a)M.i(this.t)).k(this);
    }
    
    @Override
    public long l() {
        return ((v)M.i(this.s)).l();
    }
    
    @Override
    public Z n() {
        return ((v)M.i(this.s)).n();
    }
    
    @Override
    public void p() {
        final v s = this.s;
        if (s != null) {
            s.p();
            return;
        }
        final x r = this.r;
        if (r != null) {
            r.h();
        }
    }
    
    @Override
    public void q(final long n, final boolean b) {
        ((v)M.i(this.s)).q(n, b);
    }
    
    public long r() {
        return this.p;
    }
    
    @Override
    public long s(final long n) {
        return ((v)M.i(this.s)).s(n);
    }
    
    public final long t(long n) {
        final long u = this.u;
        if (u != -9223372036854775807L) {
            n = u;
        }
        return n;
    }
    
    @Override
    public void u(final a t, final long n) {
        this.t = t;
        final v s = this.s;
        if (s != null) {
            s.u((a)this, this.t(this.p));
        }
    }
    
    public void v(final v v) {
        ((S.a)M.i(this.t)).e(this);
    }
    
    public void w(final long u) {
        this.u = u;
    }
    
    public void x() {
        if (this.s != null) {
            ((x)g0.a.e(this.r)).e(this.s);
        }
    }
    
    public void y(final x r) {
        g0.a.f(this.r == null);
        this.r = r;
    }
}
