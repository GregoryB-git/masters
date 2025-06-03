// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package k0;

import java.io.IOException;
import x0.r;
import android.util.Pair;
import g0.o;
import x0.t;
import g0.M;
import x0.E;
import java.util.Iterator;
import java.util.Collection;
import x0.s;
import x0.v;
import B0.b;
import d0.u;
import d0.I;
import x0.x;
import java.util.HashSet;
import java.util.ArrayList;
import i0.y;
import x0.T;
import g0.k;
import l0.a;
import java.util.Set;
import java.util.HashMap;
import java.util.Map;
import java.util.IdentityHashMap;
import java.util.List;
import l0.y1;

public final class T0
{
    public final y1 a;
    public final List b;
    public final IdentityHashMap c;
    public final Map d;
    public final d e;
    public final HashMap f;
    public final Set g;
    public final l0.a h;
    public final k i;
    public T j;
    public boolean k;
    public y l;
    
    public T0(final d e, final l0.a h, final k i, final y1 a) {
        this.a = a;
        this.e = e;
        this.j = new T.a(0);
        this.c = new IdentityHashMap();
        this.d = new HashMap();
        this.b = new ArrayList();
        this.h = h;
        this.i = i;
        this.f = new HashMap();
        this.g = new HashSet();
    }
    
    public static /* synthetic */ k b(final T0 t0) {
        return t0.i;
    }
    
    public static Object m(final Object o) {
        return k0.a.v(o);
    }
    
    public static x.b n(final c c, final x.b b) {
        for (int i = 0; i < c.c.size(); ++i) {
            if (((x.b)c.c.get(i)).d == b.d) {
                return b.a(p(c, b.a));
            }
        }
        return null;
    }
    
    public static Object o(final Object o) {
        return k0.a.w(o);
    }
    
    public static Object p(final c c, final Object o) {
        return k0.a.y(c.b, o);
    }
    
    public static int s(final c c, final int n) {
        return n + c.d;
    }
    
    public I A(final int n, final int n2, final T j) {
        g0.a.a(n >= 0 && n <= n2 && n2 <= this.r());
        this.j = j;
        this.B(n, n2);
        return this.i();
    }
    
    public final void B(final int n, int i) {
        c c;
        for (--i; i >= n; --i) {
            c = this.b.remove(i);
            this.d.remove(c.b);
            this.g(i, -c.a.Z().p());
            c.e = true;
            if (this.k) {
                this.v(c);
            }
        }
    }
    
    public I C(final List list, final T t) {
        this.B(0, this.b.size());
        return this.f(this.b.size(), list, t);
    }
    
    public I D(final T t) {
        final int r = this.r();
        T d = t;
        if (t.a() != r) {
            d = t.h().d(0, r);
        }
        this.j = d;
        return this.i();
    }
    
    public I E(final int n, final int n2, final List list) {
        final boolean b = false;
        g0.a.a(n >= 0 && n <= n2 && n2 <= this.r());
        boolean b2 = b;
        if (list.size() == n2 - n) {
            b2 = true;
        }
        g0.a.a(b2);
        for (int i = n; i < n2; ++i) {
            ((c)this.b.get(i)).a.l(list.get(i - n));
        }
        return this.i();
    }
    
    public I f(final int n, final List list, final T j) {
        if (!list.isEmpty()) {
            this.j = j;
            for (int i = n; i < list.size() + n; ++i) {
                final c c = list.get(i - n);
                int n2;
                if (i > 0) {
                    final c c2 = this.b.get(i - 1);
                    n2 = c2.d + c2.a.Z().p();
                }
                else {
                    n2 = 0;
                }
                c.c(n2);
                this.g(i, c.a.Z().p());
                this.b.add(i, c);
                this.d.put(c.b, c);
                if (this.k) {
                    this.x(c);
                    if (this.c.isEmpty()) {
                        this.g.add(c);
                    }
                    else {
                        this.j(c);
                    }
                }
            }
        }
        return this.i();
    }
    
    public final void g(int i, final int n) {
        while (i < this.b.size()) {
            final c c = this.b.get(i);
            c.d += n;
            ++i;
        }
    }
    
    public v h(x.b a, final B0.b b, final long n) {
        final Object o = o(a.a);
        a = a.a(m(a.a));
        final c value = (c)g0.a.e(this.d.get(o));
        this.l(value);
        value.c.add(a);
        final s w = value.a.W(a, b, n);
        this.c.put(w, value);
        this.k();
        return w;
    }
    
    public I i() {
        if (this.b.isEmpty()) {
            return I.a;
        }
        int i = 0;
        int d = 0;
        while (i < this.b.size()) {
            final c c = this.b.get(i);
            c.d = d;
            d += c.a.Z().p();
            ++i;
        }
        return new W0(this.b, this.j);
    }
    
    public final void j(final c key) {
        final b b = this.f.get(key);
        if (b != null) {
            b.a.d(b.b);
        }
    }
    
    public final void k() {
        final Iterator<c> iterator = (Iterator<c>)this.g.iterator();
        while (iterator.hasNext()) {
            final c c = iterator.next();
            if (c.c.isEmpty()) {
                this.j(c);
                iterator.remove();
            }
        }
    }
    
    public final void l(final c key) {
        this.g.add(key);
        final b b = this.f.get(key);
        if (b != null) {
            b.a.n(b.b);
        }
    }
    
    public T q() {
        return this.j;
    }
    
    public int r() {
        return this.b.size();
    }
    
    public boolean t() {
        return this.k;
    }
    
    public final void v(final c key) {
        if (key.e && key.c.isEmpty()) {
            final b b = (b)g0.a.e(this.f.remove(key));
            b.a.m(b.b);
            b.a.c(b.c);
            b.a.o(b.c);
            this.g.remove(key);
        }
    }
    
    public void w(final y l) {
        g0.a.f(this.k ^ true);
        this.l = l;
        for (int i = 0; i < this.b.size(); ++i) {
            final c c = this.b.get(i);
            this.x(c);
            this.g.add(c);
        }
        this.k = true;
    }
    
    public final void x(final c key) {
        final t a = key.a;
        final G0 g0 = new G0(this);
        final a a2 = new a(key);
        this.f.put(key, new b(a, g0, a2));
        a.p(M.C(), a2);
        a.k(M.C(), a2);
        a.g((x.c)g0, this.l, this.a);
    }
    
    public void y() {
        for (final b b : this.f.values()) {
            try {
                b.a.m(b.b);
            }
            catch (RuntimeException ex) {
                o.d("MediaSourceList", "Failed to release child source.", ex);
            }
            b.a.c(b.c);
            b.a.o(b.c);
        }
        this.f.clear();
        this.g.clear();
        this.k = false;
    }
    
    public void z(final v key) {
        final c c = (c)g0.a.e(this.c.remove(key));
        c.a.e(key);
        c.c.remove(((s)key).o);
        if (!this.c.isEmpty()) {
            this.k();
        }
        this.v(c);
    }
    
    public final class a implements E, v
    {
        public final c a;
        
        public a(final c a) {
            this.a = a;
        }
        
        public final Pair G(final int n, final x.b b) {
            Object c = null;
            if (b != null) {
                c = n(this.a, b);
                if (c == null) {
                    return null;
                }
            }
            return Pair.create((Object)s(this.a, n), c);
        }
        
        @Override
        public void K(final int n, final x.b b, final r r, final x0.u u) {
            final Pair g = this.G(n, b);
            if (g != null) {
                T0.b(T0.this).j(new K0(this, g, r, u));
            }
        }
        
        @Override
        public void M(final int n, final x.b b, final int n2) {
            final Pair g = this.G(n, b);
            if (g != null) {
                T0.b(T0.this).j(new Q0(this, g, n2));
            }
        }
        
        @Override
        public void S(final int n, final x.b b) {
            final Pair g = this.G(n, b);
            if (g != null) {
                T0.b(T0.this).j(new J0(this, g));
            }
        }
        
        @Override
        public void T(final int n, final x.b b) {
            final Pair g = this.G(n, b);
            if (g != null) {
                T0.b(T0.this).j(new O0(this, g));
            }
        }
        
        @Override
        public void W(final int n, final x.b b, final x0.u u) {
            final Pair g = this.G(n, b);
            if (g != null) {
                T0.b(T0.this).j(new L0(this, g, u));
            }
        }
        
        @Override
        public void Z(final int n, final x.b b, final x0.u u) {
            final Pair g = this.G(n, b);
            if (g != null) {
                T0.b(T0.this).j(new H0(this, g, u));
            }
        }
        
        @Override
        public void a0(final int n, final x.b b, final r r, final x0.u u, final IOException ex, final boolean b2) {
            final Pair g = this.G(n, b);
            if (g != null) {
                T0.b(T0.this).j(new R0(this, g, r, u, ex, b2));
            }
        }
        
        @Override
        public void d0(final int n, final x.b b, final Exception ex) {
            final Pair g = this.G(n, b);
            if (g != null) {
                T0.b(T0.this).j(new N0(this, g, ex));
            }
        }
        
        @Override
        public void g0(final int n, final x.b b) {
            final Pair g = this.G(n, b);
            if (g != null) {
                T0.b(T0.this).j(new S0(this, g));
            }
        }
        
        @Override
        public void l0(final int n, final x.b b) {
            final Pair g = this.G(n, b);
            if (g != null) {
                T0.b(T0.this).j(new I0(this, g));
            }
        }
        
        @Override
        public void m0(final int n, final x.b b, final r r, final x0.u u) {
            final Pair g = this.G(n, b);
            if (g != null) {
                T0.b(T0.this).j(new P0(this, g, r, u));
            }
        }
        
        @Override
        public void p0(final int n, final x.b b, final r r, final x0.u u) {
            final Pair g = this.G(n, b);
            if (g != null) {
                T0.b(T0.this).j(new M0(this, g, r, u));
            }
        }
    }
    
    public static final class b
    {
        public final x a;
        public final x.c b;
        public final a c;
        
        public b(final x a, final x.c b, final a c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }
    }
    
    public static final class c implements F0
    {
        public final t a;
        public final Object b;
        public final List c;
        public int d;
        public boolean e;
        
        public c(final x x, final boolean b) {
            this.a = new t(x, b);
            this.c = new ArrayList();
            this.b = new Object();
        }
        
        @Override
        public Object a() {
            return this.b;
        }
        
        @Override
        public I b() {
            return this.a.Z();
        }
        
        public void c(final int d) {
            this.d = d;
            this.e = false;
            this.c.clear();
        }
    }
    
    public interface d
    {
        void b();
    }
}
