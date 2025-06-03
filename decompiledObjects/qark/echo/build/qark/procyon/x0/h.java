// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package x0;

import p0.o;
import java.io.IOException;
import g0.M;
import java.util.Iterator;
import p0.v;
import d0.I;
import i0.y;
import android.os.Handler;
import java.util.HashMap;

public abstract class h extends x0.a
{
    public final HashMap h;
    public Handler i;
    public y j;
    
    public h() {
        this.h = new HashMap();
    }
    
    @Override
    public void B() {
        for (final b b : this.h.values()) {
            b.a.m(b.b);
            b.a.c(b.c);
            b.a.o(b.c);
        }
        this.h.clear();
    }
    
    public final void D(final Object key) {
        final b b = (b)g0.a.e(this.h.get(key));
        b.a.d(b.b);
    }
    
    public final void E(final Object key) {
        final b b = (b)g0.a.e(this.h.get(key));
        b.a.n(b.b);
    }
    
    public abstract x.b F(final Object p0, final x.b p1);
    
    public long G(final Object o, final long n, final x.b b) {
        return n;
    }
    
    public abstract int H(final Object p0, final int p1);
    
    public abstract void J(final Object p0, final x p1, final I p2);
    
    public final void K(final Object o, final x x) {
        g0.a.a(this.h.containsKey(o) ^ true);
        final g g = new g(this, o);
        final a a = new a(o);
        this.h.put(o, new b(x, g, a));
        x.p((Handler)g0.a.e(this.i), a);
        x.k((Handler)g0.a.e(this.i), a);
        x.g((x.c)g, this.j, this.x());
        if (!this.y()) {
            x.d((x.c)g);
        }
    }
    
    public final void L(final Object key) {
        final b b = (b)g0.a.e(this.h.remove(key));
        b.a.m(b.b);
        b.a.c(b.c);
        b.a.o(b.c);
    }
    
    @Override
    public void h() {
        final Iterator<b> iterator = this.h.values().iterator();
        while (iterator.hasNext()) {
            iterator.next().a.h();
        }
    }
    
    @Override
    public void v() {
        for (final b b : this.h.values()) {
            b.a.d(b.b);
        }
    }
    
    @Override
    public void w() {
        for (final b b : this.h.values()) {
            b.a.n(b.b);
        }
    }
    
    @Override
    public void z(final y j) {
        this.j = j;
        this.i = M.A();
    }
    
    public final class a implements E, v
    {
        public final Object a;
        public E.a b;
        public v.a c;
        
        public a(final Object a) {
            this.b = x0.h.this.u(null);
            this.c = x0.h.this.s(null);
            this.a = a;
        }
        
        @Override
        public void K(final int n, final x.b b, final r r, final u u) {
            if (this.b(n, b)) {
                this.b.A(r, this.c(u, b));
            }
        }
        
        @Override
        public void M(final int n, final x.b b, final int n2) {
            if (this.b(n, b)) {
                this.c.k(n2);
            }
        }
        
        @Override
        public void S(final int n, final x.b b) {
            if (this.b(n, b)) {
                this.c.h();
            }
        }
        
        @Override
        public void T(final int n, final x.b b) {
            if (this.b(n, b)) {
                this.c.m();
            }
        }
        
        @Override
        public void W(final int n, final x.b b, final u u) {
            if (this.b(n, b)) {
                this.b.i(this.c(u, b));
            }
        }
        
        @Override
        public void Z(final int n, final x.b b, final u u) {
            if (this.b(n, b)) {
                this.b.D(this.c(u, b));
            }
        }
        
        @Override
        public void a0(final int n, final x.b b, final r r, final u u, final IOException ex, final boolean b2) {
            if (this.b(n, b)) {
                this.b.x(r, this.c(u, b), ex, b2);
            }
        }
        
        public final boolean b(int h, x.b f) {
            if (f != null) {
                if ((f = h.this.F(this.a, f)) == null) {
                    return false;
                }
            }
            else {
                f = null;
            }
            h = h.this.H(this.a, h);
            final E.a b = this.b;
            if (b.a != h || !M.c(b.b, f)) {
                this.b = h.this.t(h, f);
            }
            final v.a c = this.c;
            if (c.a != h || !M.c(c.b, f)) {
                this.c = h.this.r(h, f);
            }
            return true;
        }
        
        public final u c(final u u, final x.b b) {
            final long g = x0.h.this.G(this.a, u.f, b);
            final long g2 = x0.h.this.G(this.a, u.g, b);
            if (g == u.f && g2 == u.g) {
                return u;
            }
            return new u(u.a, u.b, u.c, u.d, u.e, g, g2);
        }
        
        @Override
        public void d0(final int n, final x.b b, final Exception ex) {
            if (this.b(n, b)) {
                this.c.l(ex);
            }
        }
        
        @Override
        public void g0(final int n, final x.b b) {
            if (this.b(n, b)) {
                this.c.i();
            }
        }
        
        @Override
        public void l0(final int n, final x.b b) {
            if (this.b(n, b)) {
                this.c.j();
            }
        }
        
        @Override
        public void m0(final int n, final x.b b, final r r, final u u) {
            if (this.b(n, b)) {
                this.b.u(r, this.c(u, b));
            }
        }
        
        @Override
        public void p0(final int n, final x.b b, final r r, final u u) {
            if (this.b(n, b)) {
                this.b.r(r, this.c(u, b));
            }
        }
    }
    
    public static final class b
    {
        public final x a;
        public final c b;
        public final a c;
        
        public b(final x a, final c b, final a c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }
    }
}
