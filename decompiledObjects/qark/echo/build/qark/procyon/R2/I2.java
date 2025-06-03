// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package R2;

import java.util.Collection;
import java.util.ArrayList;
import android.text.TextUtils;
import A2.n;
import java.util.List;

public final class I2
{
    public long A;
    public long B;
    public long C;
    public long D;
    public long E;
    public long F;
    public long G;
    public String H;
    public boolean I;
    public long J;
    public long K;
    public final N2 a;
    public final String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public long g;
    public long h;
    public long i;
    public String j;
    public long k;
    public String l;
    public long m;
    public long n;
    public boolean o;
    public boolean p;
    public String q;
    public Boolean r;
    public long s;
    public List t;
    public String u;
    public boolean v;
    public long w;
    public long x;
    public int y;
    public boolean z;
    
    public I2(final N2 a, final String b) {
        A2.n.i(a);
        A2.n.e(b);
        this.a = a;
        this.b = b;
        a.e().n();
    }
    
    public final void A(final long j) {
        this.a.e().n();
        this.I |= (this.J != j);
        this.J = j;
    }
    
    public final void B(final String l) {
        this.a.e().n();
        this.I |= (h2.a(this.l, l) ^ true);
        this.l = l;
    }
    
    public final void C(final boolean v) {
        this.a.e().n();
        this.I |= (this.v != v);
        this.v = v;
    }
    
    public final long D() {
        this.a.e().n();
        return this.A;
    }
    
    public final void E(final long e) {
        this.a.e().n();
        this.I |= (this.E != e);
        this.E = e;
    }
    
    public final void F(final String j) {
        this.a.e().n();
        this.I |= (h2.a(this.j, j) ^ true);
        this.j = j;
    }
    
    public final void G(final boolean z) {
        this.a.e().n();
        this.I |= (this.z != z);
        this.z = z;
    }
    
    public final long H() {
        this.a.e().n();
        return this.J;
    }
    
    public final void I(final long f) {
        this.a.e().n();
        this.I |= (this.F != f);
        this.F = f;
    }
    
    public final void J(final String f) {
        this.a.e().n();
        this.I |= (h2.a(this.f, f) ^ true);
        this.f = f;
    }
    
    public final long K() {
        this.a.e().n();
        return this.E;
    }
    
    public final void L(final long d) {
        this.a.e().n();
        this.I |= (this.D != d);
        this.D = d;
    }
    
    public final void M(final String s) {
        this.a.e().n();
        String d = s;
        if (TextUtils.isEmpty((CharSequence)s)) {
            d = null;
        }
        this.I |= (h2.a(this.d, d) ^ true);
        this.d = d;
    }
    
    public final long N() {
        this.a.e().n();
        return this.F;
    }
    
    public final void O(final long c) {
        this.a.e().n();
        this.I |= (this.C != c);
        this.C = c;
    }
    
    public final void P(final String h) {
        this.a.e().n();
        this.I |= (h2.a(this.H, h) ^ true);
        this.H = h;
    }
    
    public final long Q() {
        this.a.e().n();
        return this.D;
    }
    
    public final void R(final long g) {
        this.a.e().n();
        this.I |= (this.G != g);
        this.G = g;
    }
    
    public final void S(final String e) {
        this.a.e().n();
        this.I |= (h2.a(this.e, e) ^ true);
        this.e = e;
    }
    
    public final long T() {
        this.a.e().n();
        return this.C;
    }
    
    public final void U(final long b) {
        this.a.e().n();
        this.I |= (this.B != b);
        this.B = b;
    }
    
    public final void V(final String u) {
        this.a.e().n();
        this.I |= (h2.a(this.u, u) ^ true);
        this.u = u;
    }
    
    public final long W() {
        this.a.e().n();
        return this.G;
    }
    
    public final void X(final long n) {
        this.a.e().n();
        this.I |= (this.n != n);
        this.n = n;
    }
    
    public final long Y() {
        this.a.e().n();
        return this.B;
    }
    
    public final void Z(final long s) {
        this.a.e().n();
        this.I |= (this.s != s);
        this.s = s;
    }
    
    public final int a() {
        this.a.e().n();
        return this.y;
    }
    
    public final long a0() {
        this.a.e().n();
        return this.n;
    }
    
    public final void b(final int y) {
        this.a.e().n();
        this.I |= (this.y != y);
        this.y = y;
    }
    
    public final void b0(final long k) {
        this.a.e().n();
        this.I |= (this.K != k);
        this.K = k;
    }
    
    public final void c(final long k) {
        this.a.e().n();
        this.I |= (this.k != k);
        this.k = k;
    }
    
    public final long c0() {
        this.a.e().n();
        return this.s;
    }
    
    public final void d(final Boolean r) {
        this.a.e().n();
        this.I |= (h2.a(this.r, r) ^ true);
        this.r = r;
    }
    
    public final void d0(final long m) {
        this.a.e().n();
        this.I |= (this.m != m);
        this.m = m;
    }
    
    public final void e(final String s) {
        this.a.e().n();
        String q = s;
        if (TextUtils.isEmpty((CharSequence)s)) {
            q = null;
        }
        this.I |= (h2.a(this.q, q) ^ true);
        this.q = q;
    }
    
    public final long e0() {
        this.a.e().n();
        return this.K;
    }
    
    public final void f(final List c) {
        this.a.e().n();
        if (!h2.a(this.t, c)) {
            this.I = true;
            ArrayList t;
            if (c != null) {
                t = new ArrayList(c);
            }
            else {
                t = null;
            }
            this.t = t;
        }
    }
    
    public final void f0(final long i) {
        this.a.e().n();
        this.I |= (this.i != i);
        this.i = i;
    }
    
    public final void g(final boolean p) {
        this.a.e().n();
        this.I |= (this.p != p);
        this.p = p;
    }
    
    public final long g0() {
        this.a.e().n();
        return this.m;
    }
    
    public final String h() {
        this.a.e().n();
        return this.j;
    }
    
    public final void h0(final long g) {
        boolean b = false;
        A2.n.a(g >= 0L);
        this.a.e().n();
        final boolean i = this.I;
        if (this.g != g) {
            b = true;
        }
        this.I = (i | b);
        this.g = g;
    }
    
    public final String i() {
        this.a.e().n();
        return this.f;
    }
    
    public final long i0() {
        this.a.e().n();
        return this.i;
    }
    
    public final String j() {
        this.a.e().n();
        return this.d;
    }
    
    public final void j0(final long h) {
        this.a.e().n();
        this.I |= (this.h != h);
        this.h = h;
    }
    
    public final String k() {
        this.a.e().n();
        return this.H;
    }
    
    public final long k0() {
        this.a.e().n();
        return this.g;
    }
    
    public final String l() {
        this.a.e().n();
        return this.e;
    }
    
    public final void l0(final long x) {
        this.a.e().n();
        this.I |= (this.x != x);
        this.x = x;
    }
    
    public final String m() {
        this.a.e().n();
        return this.u;
    }
    
    public final long m0() {
        this.a.e().n();
        return this.h;
    }
    
    public final List n() {
        this.a.e().n();
        return this.t;
    }
    
    public final void n0(final long w) {
        this.a.e().n();
        this.I |= (this.w != w);
        this.w = w;
    }
    
    public final void o() {
        this.a.e().n();
        this.I = false;
    }
    
    public final long o0() {
        this.a.e().n();
        return this.x;
    }
    
    public final void p() {
        this.a.e().n();
        long g;
        if ((g = this.g + 1L) > 2147483647L) {
            this.a.j().L().b("Bundle index overflow. appId", Y1.v(this.b));
            g = 0L;
        }
        this.I = true;
        this.g = g;
    }
    
    public final long p0() {
        this.a.e().n();
        return this.w;
    }
    
    public final boolean q() {
        this.a.e().n();
        return this.p;
    }
    
    public final Boolean q0() {
        this.a.e().n();
        return this.r;
    }
    
    public final boolean r() {
        this.a.e().n();
        return this.o;
    }
    
    public final String r0() {
        this.a.e().n();
        return this.q;
    }
    
    public final boolean s() {
        this.a.e().n();
        return this.I;
    }
    
    public final String s0() {
        this.a.e().n();
        final String h = this.H;
        this.P(null);
        return h;
    }
    
    public final boolean t() {
        this.a.e().n();
        return this.v;
    }
    
    public final String t0() {
        this.a.e().n();
        return this.b;
    }
    
    public final boolean u() {
        this.a.e().n();
        return this.z;
    }
    
    public final String u0() {
        this.a.e().n();
        return this.c;
    }
    
    public final long v() {
        this.a.e().n();
        return 0L;
    }
    
    public final String v0() {
        this.a.e().n();
        return this.l;
    }
    
    public final void w(final long a) {
        this.a.e().n();
        this.I |= (this.A != a);
        this.A = a;
    }
    
    public final void x(final String c) {
        this.a.e().n();
        this.I |= (h2.a(this.c, c) ^ true);
        this.c = c;
    }
    
    public final void y(final boolean o) {
        this.a.e().n();
        this.I |= (this.o != o);
        this.o = o;
    }
    
    public final long z() {
        this.a.e().n();
        return this.k;
    }
}
