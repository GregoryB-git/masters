// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package l0;

import g0.a;
import android.util.SparseArray;
import W2.k;
import d0.I;
import d0.C;
import java.util.List;
import d0.K;
import d0.w;
import d0.x;
import java.io.IOException;
import m0.z;
import d0.L;
import k0.p;
import d0.q;
import f0.b;
import d0.P;
import d0.l;
import d0.D;
import x0.r;
import d0.u;
import d0.B;
import k0.o;

public interface c
{
    void A(final a p0, final Exception p1);
    
    void B(final a p0, final o p1);
    
    void C(final a p0, final B p1);
    
    void D(final a p0, final String p1);
    
    void E(final a p0, final int p1);
    
    void F(final a p0, final u p1, final int p2);
    
    void G(final a p0, final boolean p1, final int p2);
    
    void H(final a p0, final boolean p1, final int p2);
    
    void I(final a p0, final String p1);
    
    void J(final a p0, final r p1, final x0.u p2);
    
    void K(final a p0, final x0.u p1);
    
    void L(final a p0, final B p1);
    
    void M(final a p0, final D.b p1);
    
    void N(final a p0, final x0.u p1);
    
    void O(final D p0, final b p1);
    
    void P(final a p0);
    
    void Q(final a p0, final String p1, final long p2);
    
    void R(final a p0, final l p1);
    
    void S(final a p0, final int p1);
    
    void T(final a p0, final P p1);
    
    void V(final a p0, final f0.b p1);
    
    void W(final a p0, final q p1, final p p2);
    
    void X(final a p0, final int p1, final long p2, final long p3);
    
    void Y(final a p0);
    
    void Z(final a p0, final int p1);
    
    void a(final a p0, final int p1, final long p2);
    
    void a0(final a p0);
    
    void b(final a p0);
    
    void c(final a p0, final int p1, final boolean p2);
    
    void c0(final a p0, final long p1);
    
    void d(final a p0, final boolean p1);
    
    void d0(final a p0, final Exception p1);
    
    void e(final a p0, final Exception p1);
    
    void e0(final a p0, final L p1);
    
    void f0(final a p0, final long p1, final int p2);
    
    void g(final a p0, final o p1);
    
    void g0(final a p0, final z.a p1);
    
    void h(final a p0, final int p1, final int p2);
    
    void h0(final a p0, final q p1, final p p2);
    
    void i(final a p0, final r p1, final x0.u p2);
    
    void i0(final a p0, final boolean p1);
    
    void j(final a p0, final boolean p1);
    
    void j0(final a p0, final int p1, final int p2, final int p3, final float p4);
    
    void k(final a p0, final float p1);
    
    void k0(final a p0, final D.e p1, final D.e p2, final int p3);
    
    void l(final a p0, final o p1);
    
    void l0(final a p0, final boolean p1);
    
    void m(final a p0, final r p1, final x0.u p2, final IOException p3, final boolean p4);
    
    void m0(final a p0, final Exception p1);
    
    void n(final a p0);
    
    void n0(final a p0, final int p1);
    
    void o(final a p0, final x p1);
    
    void o0(final a p0, final o p1);
    
    void p(final a p0, final d0.b p1);
    
    void q(final a p0, final r p1, final x0.u p2);
    
    void q0(final a p0, final w p1);
    
    void r(final a p0, final K p1);
    
    void r0(final a p0);
    
    void s(final a p0);
    
    void s0(final a p0, final List p1);
    
    void t(final a p0, final Object p1, final long p2);
    
    void t0(final a p0, final boolean p1);
    
    void u(final a p0, final String p1, final long p2);
    
    void u0(final a p0, final int p1, final long p2, final long p3);
    
    void v(final a p0, final String p1, final long p2, final long p3);
    
    void v0(final a p0, final C p1);
    
    void w(final a p0, final z.a p1);
    
    void x(final a p0, final int p1);
    
    void y(final a p0, final int p1);
    
    void z(final a p0, final String p1, final long p2, final long p3);
    
    public static final class a
    {
        public final long a;
        public final I b;
        public final int c;
        public final x0.x.b d;
        public final long e;
        public final I f;
        public final int g;
        public final x0.x.b h;
        public final long i;
        public final long j;
        
        public a(final long a, final I b, final int c, final x0.x.b d, final long e, final I f, final int g, final x0.x.b h, final long i, final long j) {
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
        }
        
        @Override
        public boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (o == null) {
                return false;
            }
            if (a.class != o.getClass()) {
                return false;
            }
            final a a = (a)o;
            return this.a == a.a && this.c == a.c && this.e == a.e && this.g == a.g && this.i == a.i && this.j == a.j && k.a(this.b, a.b) && k.a(this.d, a.d) && k.a(this.f, a.f) && k.a(this.h, a.h);
        }
        
        @Override
        public int hashCode() {
            return k.b(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j);
        }
    }
    
    public static final class b
    {
        public final d0.p a;
        public final SparseArray b;
        
        public b(final d0.p a, final SparseArray sparseArray) {
            this.a = a;
            final SparseArray b = new SparseArray(a.c());
            for (int i = 0; i < a.c(); ++i) {
                final int b2 = a.b(i);
                b.append(b2, (Object)g0.a.e(sparseArray.get(b2)));
            }
            this.b = b;
        }
        
        public boolean a(final int n) {
            return this.a.a(n);
        }
        
        public int b(final int n) {
            return this.a.b(n);
        }
        
        public a c(final int n) {
            return (a)g0.a.e(this.b.get(n));
        }
        
        public int d() {
            return this.a.c();
        }
    }
}
