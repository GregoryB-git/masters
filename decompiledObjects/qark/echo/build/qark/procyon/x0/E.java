// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package x0;

import android.os.Handler;
import g0.a;
import d0.q;
import java.util.Iterator;
import g0.M;
import java.util.concurrent.CopyOnWriteArrayList;
import java.io.IOException;

public interface E
{
    void K(final int p0, final x.b p1, final r p2, final u p3);
    
    void W(final int p0, final x.b p1, final u p2);
    
    void Z(final int p0, final x.b p1, final u p2);
    
    void a0(final int p0, final x.b p1, final r p2, final u p3, final IOException p4, final boolean p5);
    
    void m0(final int p0, final x.b p1, final r p2, final u p3);
    
    void p0(final int p0, final x.b p1, final r p2, final u p3);
    
    public static class a
    {
        public final int a;
        public final x.b b;
        public final CopyOnWriteArrayList c;
        
        public a() {
            this(new CopyOnWriteArrayList(), 0, null);
        }
        
        public a(final CopyOnWriteArrayList c, final int a, final x.b b) {
            this.c = c;
            this.a = a;
            this.b = b;
        }
        
        public void A(final r r, final u u) {
            for (final E.a.a a : this.c) {
                M.S0(a.a, new y(this, a.b, r, u));
            }
        }
        
        public void B(final E e) {
            for (final E.a.a o : this.c) {
                if (o.b == e) {
                    this.c.remove(o);
                }
            }
        }
        
        public void C(final int n, final long n2, final long n3) {
            this.D(new u(1, n, null, 3, null, M.i1(n2), M.i1(n3)));
        }
        
        public void D(final u u) {
            final x.b b = (x.b)g0.a.e(this.b);
            for (final E.a.a a : this.c) {
                M.S0(a.a, new A(this, a.b, b, u));
            }
        }
        
        public E.a E(final int n, final x.b b) {
            return new E.a(this.c, n, b);
        }
        
        public void g(final Handler handler, final E e) {
            g0.a.e(handler);
            g0.a.e(e);
            this.c.add(new E.a.a(handler, e));
        }
        
        public void h(final int n, final q q, final int n2, final Object o, final long n3) {
            this.i(new u(1, n, q, n2, o, M.i1(n3), -9223372036854775807L));
        }
        
        public void i(final u u) {
            for (final E.a.a a : this.c) {
                M.S0(a.a, new z(this, a.b, u));
            }
        }
        
        public void p(final r r, final int n) {
            this.q(r, n, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        }
        
        public void q(final r r, final int n, final int n2, final q q, final int n3, final Object o, final long n4, final long n5) {
            this.r(r, new u(n, n2, q, n3, o, M.i1(n4), M.i1(n5)));
        }
        
        public void r(final r r, final u u) {
            for (final E.a.a a : this.c) {
                M.S0(a.a, new D(this, a.b, r, u));
            }
        }
        
        public void s(final r r, final int n) {
            this.t(r, n, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        }
        
        public void t(final r r, final int n, final int n2, final q q, final int n3, final Object o, final long n4, final long n5) {
            this.u(r, new u(n, n2, q, n3, o, M.i1(n4), M.i1(n5)));
        }
        
        public void u(final r r, final u u) {
            for (final E.a.a a : this.c) {
                M.S0(a.a, new B(this, a.b, r, u));
            }
        }
        
        public void v(final r r, final int n, final int n2, final q q, final int n3, final Object o, final long n4, final long n5, final IOException ex, final boolean b) {
            this.x(r, new u(n, n2, q, n3, o, M.i1(n4), M.i1(n5)), ex, b);
        }
        
        public void w(final r r, final int n, final IOException ex, final boolean b) {
            this.v(r, n, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, ex, b);
        }
        
        public void x(final r r, final u u, final IOException ex, final boolean b) {
            for (final E.a.a a : this.c) {
                M.S0(a.a, new C(this, a.b, r, u, ex, b));
            }
        }
        
        public void y(final r r, final int n) {
            this.z(r, n, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        }
        
        public void z(final r r, final int n, final int n2, final q q, final int n3, final Object o, final long n4, final long n5) {
            this.A(r, new u(n, n2, q, n3, o, M.i1(n4), M.i1(n5)));
        }
        
        public static final class a
        {
            public Handler a;
            public E b;
            
            public a(final Handler a, final E b) {
                this.a = a;
                this.b = b;
            }
        }
    }
}
