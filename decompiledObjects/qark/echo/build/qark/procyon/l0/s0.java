// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package l0;

import java.util.Collection;
import android.os.Handler$Callback;
import android.os.Looper;
import d0.w;
import d0.x;
import java.io.IOException;
import d0.l;
import java.util.List;
import m0.z;
import d0.P;
import f0.b;
import d0.L;
import d0.K;
import d0.q;
import d0.B;
import k0.o;
import x0.u;
import x0.r;
import d0.C;
import d0.p;
import g0.M;
import g0.k;
import d0.D;
import g0.n;
import android.util.SparseArray;
import d0.I;
import g0.c;

public class s0 implements l0.a
{
    public final g0.c a;
    public final I.b b;
    public final I.c c;
    public final a d;
    public final SparseArray e;
    public n f;
    public D g;
    public k h;
    public boolean i;
    
    public s0(final g0.c c) {
        this.a = (g0.c)g0.a.e(c);
        this.f = new n(M.U(), c, (n.b)new A());
        final I.b b = new I.b();
        this.b = b;
        this.c = new I.c();
        this.d = new a(b);
        this.e = new SparseArray();
    }
    
    @Override
    public final void A(final o o) {
        final l0.c.a m1 = this.M1();
        this.c3(m1, 1007, new o0(m1, o));
    }
    
    @Override
    public final void B(final int n) {
        final l0.c.a g1 = this.G1();
        this.c3(g1, 6, new s(g1, n));
    }
    
    @Override
    public final void C(final boolean b, final int n) {
        final l0.c.a g1 = this.G1();
        this.c3(g1, -1, new l0.l(g1, b, n));
    }
    
    @Override
    public void D(final K k) {
        final l0.c.a g1 = this.G1();
        this.c3(g1, 19, new h0(g1, k));
    }
    
    @Override
    public void E(final B b) {
        final l0.c.a n1 = this.N1(b);
        this.c3(n1, 10, new l0.v(n1, b));
    }
    
    @Override
    public final void F(final d0.b b) {
        final l0.c.a m1 = this.M1();
        this.c3(m1, 20, new m(m1, b));
    }
    
    @Override
    public void G(final boolean b) {
    }
    
    public final l0.c.a G1() {
        return this.I1(this.d.d());
    }
    
    @Override
    public void H(final int n) {
    }
    
    public final l0.c.a H1(final I i, final int n, x0.x.b b) {
        if (i.q()) {
            b = null;
        }
        final long b2 = this.a.b();
        final boolean b3 = i.equals(this.g.L()) && n == this.g.E();
        final long n2 = 0L;
        long n3;
        if (b != null && b.b()) {
            n3 = n2;
            if (b3) {
                n3 = n2;
                if (this.g.D() == b.b) {
                    n3 = n2;
                    if (this.g.H() == b.c) {
                        n3 = this.g.P();
                    }
                }
            }
        }
        else if (b3) {
            n3 = this.g.p();
        }
        else if (i.q()) {
            n3 = n2;
        }
        else {
            n3 = i.n(n, this.c).b();
        }
        return new l0.c.a(b2, i, n, b, n3, this.g.L(), this.g.E(), this.d.d(), this.g.P(), this.g.r());
    }
    
    @Override
    public void I(final w w) {
        final l0.c.a g1 = this.G1();
        this.c3(g1, 14, new W(g1, w));
    }
    
    public final l0.c.a I1(final x0.x.b b) {
        g0.a.e(this.g);
        I f;
        if (b == null) {
            f = null;
        }
        else {
            f = this.d.f(b);
        }
        if (b != null && f != null) {
            return this.H1(f, f.h(b.a, this.b).c, b);
        }
        final int e = this.g.E();
        I i = this.g.L();
        if (e >= i.p()) {
            i = I.a;
        }
        return this.H1(i, e, null);
    }
    
    @Override
    public void J(final L l) {
        final l0.c.a g1 = this.G1();
        this.c3(g1, 2, new l0.o(g1, l));
    }
    
    public final l0.c.a J1() {
        return this.I1(this.d.e());
    }
    
    @Override
    public final void K(final int n, final x0.x.b b, final r r, final u u) {
        final l0.c.a k1 = this.K1(n, b);
        this.c3(k1, 1000, new r0(k1, r, u));
    }
    
    public final l0.c.a K1(final int n, final x0.x.b b) {
        g0.a.e(this.g);
        if (b == null) {
            I i = this.g.L();
            if (n >= i.p()) {
                i = I.a;
            }
            return this.H1(i, n, null);
        }
        if (this.d.f(b) != null) {
            return this.I1(b);
        }
        return this.H1(I.a, n, b);
    }
    
    @Override
    public final void L(final List list, final x0.x.b b) {
        this.d.k(list, b, (D)g0.a.e(this.g));
    }
    
    public final l0.c.a L1() {
        return this.I1(this.d.g());
    }
    
    @Override
    public final void M(final int n, final x0.x.b b, final int n2) {
        final l0.c.a k1 = this.K1(n, b);
        this.c3(k1, 1022, new e0(k1, n2));
    }
    
    public final l0.c.a M1() {
        return this.I1(this.d.h());
    }
    
    @Override
    public void N(final l0.c c) {
        g0.a.e(c);
        this.f.c(c);
    }
    
    public final l0.c.a N1(final B b) {
        if (b instanceof k0.u) {
            final x0.x.b c = ((k0.u)b).C;
            if (c != null) {
                return this.I1(c);
            }
        }
        return this.G1();
    }
    
    @Override
    public final void O(final d0.u u, final int n) {
        final l0.c.a g1 = this.G1();
        this.c3(g1, 1, new g(g1, u, n));
    }
    
    @Override
    public final void P(final I i, final int n) {
        this.d.l((D)g0.a.e(this.g));
        final l0.c.a g1 = this.G1();
        this.c3(g1, 0, new f(g1, n));
    }
    
    @Override
    public final void Q(final boolean b) {
        final l0.c.a g1 = this.G1();
        this.c3(g1, 3, new p0(g1, b));
    }
    
    @Override
    public void R() {
    }
    
    @Override
    public final void S(final int n, final x0.x.b b) {
        final l0.c.a k1 = this.K1(n, b);
        this.c3(k1, 1023, new n0(k1));
    }
    
    @Override
    public final void T(final int n, final x0.x.b b) {
        final l0.c.a k1 = this.K1(n, b);
        this.c3(k1, 1027, new k0(k1));
    }
    
    @Override
    public final void U(final float n) {
        final l0.c.a m1 = this.M1();
        this.c3(m1, 22, new i(m1, n));
    }
    
    @Override
    public void V(final l l) {
        final l0.c.a g1 = this.G1();
        this.c3(g1, 29, new F(g1, l));
    }
    
    @Override
    public final void W(final int n, final x0.x.b b, final u u) {
        final l0.c.a k1 = this.K1(n, b);
        this.c3(k1, 1004, new U(k1, u));
    }
    
    @Override
    public final void X(final int n) {
        final l0.c.a g1 = this.G1();
        this.c3(g1, 4, new l0.E(g1, n));
    }
    
    @Override
    public final void Y(final boolean b, final int n) {
        final l0.c.a g1 = this.G1();
        this.c3(g1, 5, new l0.x(g1, b, n));
    }
    
    @Override
    public final void Z(final int n, final x0.x.b b, final u u) {
        final l0.c.a k1 = this.K1(n, b);
        this.c3(k1, 1005, new a0(k1, u));
    }
    
    @Override
    public void a(final z.a a) {
        final l0.c.a m1 = this.M1();
        this.c3(m1, 1031, new i0(m1, a));
    }
    
    @Override
    public final void a0(final int n, final x0.x.b b, final r r, final u u, final IOException ex, final boolean b2) {
        final l0.c.a k1 = this.K1(n, b);
        this.c3(k1, 1003, new c0(k1, r, u, ex, b2));
    }
    
    @Override
    public final void b(final P p) {
        final l0.c.a m1 = this.M1();
        this.c3(m1, 25, new Y(m1, p));
    }
    
    public final void b3() {
        final l0.c.a g1 = this.G1();
        this.c3(g1, 1028, new V(g1));
        this.f.j();
    }
    
    @Override
    public final void c(final boolean b) {
        final l0.c.a m1 = this.M1();
        this.c3(m1, 23, new h(m1, b));
    }
    
    @Override
    public final void c0(final int n, final long n2, final long n3) {
        final l0.c.a j1 = this.J1();
        this.c3(j1, 1006, new b0(j1, n, n2, n3));
    }
    
    public final void c3(final l0.c.a a, final int n, final n.a a2) {
        this.e.put(n, (Object)a);
        this.f.k(n, a2);
    }
    
    @Override
    public final void d(final Exception ex) {
        final l0.c.a m1 = this.M1();
        this.c3(m1, 1014, new Q(m1, ex));
    }
    
    @Override
    public final void d0(final int n, final x0.x.b b, final Exception ex) {
        final l0.c.a k1 = this.K1(n, b);
        this.c3(k1, 1024, new f0(k1, ex));
    }
    
    @Override
    public void e(final z.a a) {
        final l0.c.a m1 = this.M1();
        this.c3(m1, 1032, new j0(m1, a));
    }
    
    @Override
    public final void e0(final B b) {
        final l0.c.a n1 = this.N1(b);
        this.c3(n1, 10, new l0.C(n1, b));
    }
    
    @Override
    public final void f(final o o) {
        final l0.c.a l1 = this.L1();
        this.c3(l1, 1013, new l0.D(l1, o));
    }
    
    @Override
    public final void f0() {
        if (!this.i) {
            final l0.c.a g1 = this.G1();
            this.i = true;
            this.c3(g1, -1, new H(g1));
        }
    }
    
    @Override
    public final void g(final String s) {
        final l0.c.a m1 = this.M1();
        this.c3(m1, 1019, new t(m1, s));
    }
    
    @Override
    public final void g0(final int n, final x0.x.b b) {
        final l0.c.a k1 = this.K1(n, b);
        this.c3(k1, 1026, new l0(k1));
    }
    
    @Override
    public final void h(final Object o, final long n) {
        final l0.c.a m1 = this.M1();
        this.c3(m1, 26, new Z(m1, o, n));
    }
    
    @Override
    public final void h0(final boolean b) {
        final l0.c.a g1 = this.G1();
        this.c3(g1, 9, new S(g1, b));
    }
    
    @Override
    public final void i(final String s, final long n, final long n2) {
        final l0.c.a m1 = this.M1();
        this.c3(m1, 1016, new l0.P(m1, s, n2, n));
    }
    
    @Override
    public final void i0(final int n, final int n2) {
        final l0.c.a m1 = this.M1();
        this.c3(m1, 24, new T(m1, n, n2));
    }
    
    @Override
    public final void j(final C c) {
        final l0.c.a g1 = this.G1();
        this.c3(g1, 12, new l0.d(g1, c));
    }
    
    @Override
    public void j0(final b b) {
        final l0.c.a g1 = this.G1();
        this.c3(g1, 13, new e(g1, b));
    }
    
    @Override
    public void k(final List list) {
        final l0.c.a g1 = this.G1();
        this.c3(g1, 27, new y(g1, list));
    }
    
    @Override
    public final void k0(final D.e e, final D.e e2, final int n) {
        if (n == 1) {
            this.i = false;
        }
        this.d.j((D)g0.a.e(this.g));
        final l0.c.a g1 = this.G1();
        this.c3(g1, 11, new J(g1, n, e, e2));
    }
    
    @Override
    public final void l(final long n) {
        final l0.c.a m1 = this.M1();
        this.c3(m1, 1010, new l0.p(m1, n));
    }
    
    @Override
    public final void l0(final int n, final x0.x.b b) {
        final l0.c.a k1 = this.K1(n, b);
        this.c3(k1, 1025, new m0(k1));
    }
    
    @Override
    public final void m(final int n) {
        final l0.c.a g1 = this.G1();
        this.c3(g1, 8, new N(g1, n));
    }
    
    @Override
    public final void m0(final int n, final x0.x.b b, final r r, final u u) {
        final l0.c.a k1 = this.K1(n, b);
        this.c3(k1, 1001, new g0(k1, r, u));
    }
    
    @Override
    public final void n(final o o) {
        final l0.c.a m1 = this.M1();
        this.c3(m1, 1015, new l0.L(m1, o));
    }
    
    @Override
    public void n0(final D d, final c c) {
    }
    
    @Override
    public final void o(final o o) {
        final l0.c.a l1 = this.L1();
        this.c3(l1, 1020, new l0.z(l1, o));
    }
    
    @Override
    public void o0(final D d, final Looper looper) {
        g0.a.f(this.g == null || s0.a.a(this.d).isEmpty());
        this.g = (D)g0.a.e(d);
        this.h = this.a.e(looper, null);
        this.f = this.f.e(looper, (n.b)new l0.k(this, d));
    }
    
    @Override
    public final void p(final Exception ex) {
        final l0.c.a m1 = this.M1();
        this.c3(m1, 1029, new O(m1, ex));
    }
    
    @Override
    public final void p0(final int n, final x0.x.b b, final r r, final u u) {
        final l0.c.a k1 = this.K1(n, b);
        this.c3(k1, 1002, new d0(k1, r, u));
    }
    
    @Override
    public final void q(final Exception ex) {
        final l0.c.a m1 = this.M1();
        this.c3(m1, 1030, new j(m1, ex));
    }
    
    @Override
    public void q0(final int n, final boolean b) {
        final l0.c.a g1 = this.G1();
        this.c3(g1, 30, new l0.w(g1, n, b));
    }
    
    @Override
    public void r(final f0.b b) {
        final l0.c.a g1 = this.G1();
        this.c3(g1, 27, new l0.K(g1, b));
    }
    
    @Override
    public void r0(final boolean b) {
        final l0.c.a g1 = this.G1();
        this.c3(g1, 7, new l0.q(g1, b));
    }
    
    @Override
    public void release() {
        ((k)g0.a.h(this.h)).j(new l0.M(this));
    }
    
    @Override
    public final void s(final String s) {
        final l0.c.a m1 = this.M1();
        this.c3(m1, 1012, new q0(m1, s));
    }
    
    @Override
    public final void t(final String s, final long n, final long n2) {
        final l0.c.a m1 = this.M1();
        this.c3(m1, 1008, new l0.r(m1, s, n2, n));
    }
    
    @Override
    public final void u(final q q, final k0.p p2) {
        final l0.c.a m1 = this.M1();
        this.c3(m1, 1017, new G(m1, q, p2));
    }
    
    @Override
    public final void v(final int n, final long n2, final long n3) {
        final l0.c.a m1 = this.M1();
        this.c3(m1, 1011, new X(m1, n, n2, n3));
    }
    
    @Override
    public final void w(final int n, final long n2) {
        final l0.c.a l1 = this.L1();
        this.c3(l1, 1018, new l0.u(l1, n, n2));
    }
    
    @Override
    public final void x(final x x) {
        final l0.c.a g1 = this.G1();
        this.c3(g1, 28, new l0.n(g1, x));
    }
    
    @Override
    public final void y(final long n, final int n2) {
        final l0.c.a l1 = this.L1();
        this.c3(l1, 1021, new l0.B(l1, n, n2));
    }
    
    @Override
    public final void z(final q q, final k0.p p2) {
        final l0.c.a m1 = this.M1();
        this.c3(m1, 1009, new l0.I(m1, q, p2));
    }
    
    public static final class a
    {
        public final I.b a;
        public X2.v b;
        public X2.w c;
        public x0.x.b d;
        public x0.x.b e;
        public x0.x.b f;
        
        public a(final I.b a) {
            this.a = a;
            this.b = X2.v.Y();
            this.c = X2.w.j();
        }
        
        public static /* synthetic */ X2.v a(final a a) {
            return a.b;
        }
        
        public static x0.x.b c(final D d, final X2.v v, final x0.x.b b, final I.b b2) {
            final I l = d.L();
            final int c = d.C();
            Object m;
            if (l.q()) {
                m = null;
            }
            else {
                m = l.m(c);
            }
            int d2;
            if (!d.o() && !l.q()) {
                d2 = l.f(c, b2).d(M.J0(d.P()) - b2.n());
            }
            else {
                d2 = -1;
            }
            for (int i = 0; i < v.size(); ++i) {
                final x0.x.b b3 = v.get(i);
                if (i(b3, m, d.o(), d.D(), d.H(), d2)) {
                    return b3;
                }
            }
            if (v.isEmpty() && b != null && i(b, m, d.o(), d.D(), d.H(), d2)) {
                return b;
            }
            return null;
        }
        
        public static boolean i(final x0.x.b b, final Object obj, final boolean b2, final int n, final int n2, final int n3) {
            final boolean equals = b.a.equals(obj);
            final boolean b3 = false;
            if (!equals) {
                return false;
            }
            if (!b2 || b.b != n || b.c != n2) {
                boolean b4 = b3;
                if (b2) {
                    return b4;
                }
                b4 = b3;
                if (b.b != -1) {
                    return b4;
                }
                b4 = b3;
                if (b.e != n3) {
                    return b4;
                }
            }
            return true;
        }
        
        public final void b(final X2.w.a a, final x0.x.b b, I i) {
            if (b == null) {
                return;
            }
            if (i.b(b.a) == -1) {
                i = (I)this.c.get(b);
                if (i == null) {
                    return;
                }
            }
            a.f(b, i);
        }
        
        public x0.x.b d() {
            return this.d;
        }
        
        public x0.x.b e() {
            if (this.b.isEmpty()) {
                return null;
            }
            return (x0.x.b)X2.B.d(this.b);
        }
        
        public I f(final x0.x.b b) {
            return (I)this.c.get(b);
        }
        
        public x0.x.b g() {
            return this.e;
        }
        
        public x0.x.b h() {
            return this.f;
        }
        
        public void j(final D d) {
            this.d = c(d, this.b, this.e, this.a);
        }
        
        public void k(final List list, final x0.x.b b, final D d) {
            this.b = X2.v.U(list);
            if (!list.isEmpty()) {
                this.e = list.get(0);
                this.f = (x0.x.b)g0.a.e(b);
            }
            if (this.d == null) {
                this.d = c(d, this.b, this.e, this.a);
            }
            this.m(d.L());
        }
        
        public void l(final D d) {
            this.d = c(d, this.b, this.e, this.a);
            this.m(d.L());
        }
        
        public final void m(final I i) {
            final X2.w.a a = X2.w.a();
            Label_0145: {
                if (this.b.isEmpty()) {
                    this.b(a, this.e, i);
                    if (!W2.k.a(this.f, this.e)) {
                        this.b(a, this.f, i);
                    }
                    if (W2.k.a(this.d, this.e) || W2.k.a(this.d, this.f)) {
                        break Label_0145;
                    }
                }
                else {
                    for (int j = 0; j < this.b.size(); ++j) {
                        this.b(a, (x0.x.b)this.b.get(j), i);
                    }
                    if (this.b.contains(this.d)) {
                        break Label_0145;
                    }
                }
                this.b(a, this.d, i);
            }
            this.c = a.c();
        }
    }
}
