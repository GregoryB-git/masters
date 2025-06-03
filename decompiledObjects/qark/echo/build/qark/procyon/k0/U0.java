// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package k0;

import g0.M;
import android.os.SystemClock;
import X2.v;
import d0.C;
import java.util.List;
import A0.E;
import x0.Z;
import d0.I;
import x0.x;

public final class U0
{
    public static final x.b u;
    public final I a;
    public final x.b b;
    public final long c;
    public final long d;
    public final int e;
    public final u f;
    public final boolean g;
    public final Z h;
    public final E i;
    public final List j;
    public final x.b k;
    public final boolean l;
    public final int m;
    public final int n;
    public final C o;
    public final boolean p;
    public volatile long q;
    public volatile long r;
    public volatile long s;
    public volatile long t;
    
    static {
        u = new x.b(new Object());
    }
    
    public U0(final I a, final x.b b, final long c, final long d, final int e, final u f, final boolean g, final Z h, final E i, final List j, final x.b k, final boolean l, final int m, final int n, final C o, final long q, final long r, final long s, final long t, final boolean p20) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
        this.k = k;
        this.l = l;
        this.m = m;
        this.n = n;
        this.o = o;
        this.q = q;
        this.r = r;
        this.s = s;
        this.t = t;
        this.p = p20;
    }
    
    public static U0 k(final E e) {
        final I a = I.a;
        final x.b u = U0.u;
        return new U0(a, u, -9223372036854775807L, 0L, 1, null, false, Z.d, e, v.Y(), u, false, 1, 0, C.d, 0L, 0L, 0L, 0L, false);
    }
    
    public static x.b l() {
        return U0.u;
    }
    
    public U0 a() {
        return new U0(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.q, this.r, this.m(), SystemClock.elapsedRealtime(), this.p);
    }
    
    public U0 b(final boolean b) {
        return new U0(this.a, this.b, this.c, this.d, this.e, this.f, b, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.q, this.r, this.s, this.t, this.p);
    }
    
    public U0 c(final x.b b) {
        return new U0(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, b, this.l, this.m, this.n, this.o, this.q, this.r, this.s, this.t, this.p);
    }
    
    public U0 d(final x.b b, final long n, final long n2, final long n3, final long n4, final Z z, final E e, final List list) {
        return new U0(this.a, b, n2, n3, this.e, this.f, this.g, z, e, list, this.k, this.l, this.m, this.n, this.o, this.q, n4, n, SystemClock.elapsedRealtime(), this.p);
    }
    
    public U0 e(final boolean b, final int n, final int n2) {
        return new U0(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, b, n, n2, this.o, this.q, this.r, this.s, this.t, this.p);
    }
    
    public U0 f(final u u) {
        return new U0(this.a, this.b, this.c, this.d, this.e, u, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.q, this.r, this.s, this.t, this.p);
    }
    
    public U0 g(final C c) {
        return new U0(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, c, this.q, this.r, this.s, this.t, this.p);
    }
    
    public U0 h(final int n) {
        return new U0(this.a, this.b, this.c, this.d, n, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.q, this.r, this.s, this.t, this.p);
    }
    
    public U0 i(final boolean b) {
        return new U0(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.q, this.r, this.s, this.t, b);
    }
    
    public U0 j(final I i) {
        return new U0(i, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.q, this.r, this.s, this.t, this.p);
    }
    
    public long m() {
        if (!this.n()) {
            return this.s;
        }
        long t;
        long s;
        do {
            t = this.t;
            s = this.s;
        } while (t != this.t);
        return M.J0(M.i1(s) + (long)((SystemClock.elapsedRealtime() - t) * this.o.a));
    }
    
    public boolean n() {
        return this.e == 3 && this.l && this.n == 0;
    }
    
    public void o(final long s) {
        this.s = s;
        this.t = SystemClock.elapsedRealtime();
    }
}
