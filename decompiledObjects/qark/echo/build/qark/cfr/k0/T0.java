/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 *  android.util.Pair
 *  java.io.IOException
 *  java.lang.Exception
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.RuntimeException
 *  java.lang.Throwable
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.HashMap
 *  java.util.HashSet
 *  java.util.IdentityHashMap
 *  java.util.Iterator
 *  java.util.List
 *  java.util.Map
 *  java.util.Set
 */
package k0;

import android.os.Handler;
import android.util.Pair;
import d0.I;
import d0.u;
import g0.M;
import g0.k;
import g0.o;
import i0.y;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import k0.F0;
import k0.G0;
import k0.H0;
import k0.I0;
import k0.J0;
import k0.K0;
import k0.L0;
import k0.M0;
import k0.N0;
import k0.O0;
import k0.P0;
import k0.Q0;
import k0.R0;
import k0.S0;
import k0.W0;
import l0.y1;
import p0.v;
import x0.E;
import x0.T;
import x0.r;
import x0.s;
import x0.t;
import x0.x;

public final class T0 {
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

    public T0(d d8, l0.a a8, k k8, y1 y12) {
        this.a = y12;
        this.e = d8;
        this.j = new T.a(0);
        this.c = new IdentityHashMap();
        this.d = new HashMap();
        this.b = new ArrayList();
        this.h = a8;
        this.i = k8;
        this.f = new HashMap();
        this.g = new HashSet();
    }

    public static /* synthetic */ void a(T0 t02, x x8, I i8) {
        t02.u(x8, i8);
    }

    public static Object m(Object object) {
        return k0.a.v(object);
    }

    public static x.b n(c c8, x.b b8) {
        for (int i8 = 0; i8 < c8.c.size(); ++i8) {
            if (((x.b)c8.c.get((int)i8)).d != b8.d) continue;
            return b8.a(T0.p(c8, b8.a));
        }
        return null;
    }

    public static Object o(Object object) {
        return k0.a.w(object);
    }

    public static Object p(c c8, Object object) {
        return k0.a.y(c8.b, object);
    }

    public static int s(c c8, int n8) {
        return n8 + c8.d;
    }

    public I A(int n8, int n9, T t8) {
        boolean bl = n8 >= 0 && n8 <= n9 && n9 <= this.r();
        g0.a.a(bl);
        this.j = t8;
        this.B(n8, n9);
        return this.i();
    }

    public final void B(int n8, int n9) {
        --n9;
        while (n9 >= n8) {
            c c8 = (c)this.b.remove(n9);
            this.d.remove(c8.b);
            this.g(n9, - c8.a.Z().p());
            c8.e = true;
            if (this.k) {
                this.v(c8);
            }
            --n9;
        }
    }

    public I C(List list, T t8) {
        this.B(0, this.b.size());
        return this.f(this.b.size(), list, t8);
    }

    public I D(T t8) {
        int n8 = this.r();
        T t9 = t8;
        if (t8.a() != n8) {
            t9 = t8.h().d(0, n8);
        }
        this.j = t9;
        return this.i();
    }

    public I E(int n8, int n9, List list) {
        boolean bl = false;
        boolean bl2 = n8 >= 0 && n8 <= n9 && n9 <= this.r();
        g0.a.a(bl2);
        bl2 = bl;
        if (list.size() == n9 - n8) {
            bl2 = true;
        }
        g0.a.a(bl2);
        for (int i8 = n8; i8 < n9; ++i8) {
            ((c)this.b.get((int)i8)).a.l((u)list.get(i8 - n8));
        }
        return this.i();
    }

    /*
     * Enabled aggressive block sorting
     */
    public I f(int n8, List list, T object) {
        if (!list.isEmpty()) {
            this.j = object;
            for (int i8 = n8; i8 < list.size() + n8; ++i8) {
                int n9;
                object = (c)list.get(i8 - n8);
                if (i8 > 0) {
                    c c8 = (c)this.b.get(i8 - 1);
                    I i9 = c8.a.Z();
                    n9 = c8.d + i9.p();
                } else {
                    n9 = 0;
                }
                object.c(n9);
                this.g(i8, object.a.Z().p());
                this.b.add(i8, object);
                this.d.put(object.b, object);
                if (!this.k) continue;
                this.x((c)object);
                if (this.c.isEmpty()) {
                    this.g.add(object);
                    continue;
                }
                this.j((c)object);
            }
        }
        return this.i();
    }

    public final void g(int n8, int n9) {
        while (n8 < this.b.size()) {
            c c8 = (c)this.b.get(n8);
            c8.d += n9;
            ++n8;
        }
    }

    public x0.v h(x.b object, B0.b b8, long l8) {
        Object object2 = T0.o(object.a);
        object = object.a(T0.m(object.a));
        object2 = (c)g0.a.e((c)this.d.get(object2));
        this.l((c)object2);
        object2.c.add(object);
        object = object2.a.W((x.b)object, b8, l8);
        this.c.put(object, object2);
        this.k();
        return object;
    }

    public I i() {
        if (this.b.isEmpty()) {
            return I.a;
        }
        int n8 = 0;
        for (int i8 = 0; i8 < this.b.size(); ++i8) {
            c c8 = (c)this.b.get(i8);
            c8.d = n8;
            n8 += c8.a.Z().p();
        }
        return new W0((Collection)this.b, this.j);
    }

    public final void j(c object) {
        if ((object = (b)this.f.get(object)) != null) {
            object.a.d(object.b);
        }
    }

    public final void k() {
        Iterator iterator = this.g.iterator();
        while (iterator.hasNext()) {
            c c8 = (c)iterator.next();
            if (!c8.c.isEmpty()) continue;
            this.j(c8);
            iterator.remove();
        }
    }

    public final void l(c object) {
        this.g.add(object);
        object = (b)this.f.get(object);
        if (object != null) {
            object.a.n(object.b);
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

    public final /* synthetic */ void u(x x8, I i8) {
        this.e.b();
    }

    public final void v(c c8) {
        if (c8.e && c8.c.isEmpty()) {
            b b8 = (b)g0.a.e((b)this.f.remove((Object)c8));
            b8.a.m(b8.b);
            b8.a.c(b8.c);
            b8.a.o(b8.c);
            this.g.remove((Object)c8);
        }
    }

    public void w(y object) {
        g0.a.f(this.k ^ true);
        this.l = object;
        for (int i8 = 0; i8 < this.b.size(); ++i8) {
            object = (c)this.b.get(i8);
            this.x((c)object);
            this.g.add(object);
        }
        this.k = true;
    }

    public final void x(c c8) {
        t t8 = c8.a;
        G0 g02 = new G0(this);
        a a8 = new a(c8);
        this.f.put((Object)c8, (Object)new b(t8, g02, a8));
        t8.p(M.C(), a8);
        t8.k(M.C(), a8);
        t8.g(g02, this.l, this.a);
    }

    public void y() {
        for (b b8 : this.f.values()) {
            try {
                b8.a.m(b8.b);
            }
            catch (RuntimeException runtimeException) {
                o.d("MediaSourceList", "Failed to release child source.", (Throwable)runtimeException);
            }
            b8.a.c(b8.c);
            b8.a.o(b8.c);
        }
        this.f.clear();
        this.g.clear();
        this.k = false;
    }

    public void z(x0.v v8) {
        c c8 = (c)g0.a.e((c)this.c.remove((Object)v8));
        c8.a.e(v8);
        c8.c.remove((Object)((s)v8).o);
        if (!this.c.isEmpty()) {
            this.k();
        }
        this.v(c8);
    }

    public final class a
    implements E,
    v {
        public final c a;

        public a(c c8) {
            this.a = c8;
        }

        public static /* synthetic */ void B(a a8, Pair pair, r r8, x0.u u8, IOException iOException, boolean bl) {
            a8.X(pair, r8, u8, iOException, bl);
        }

        public static /* synthetic */ void C(a a8, Pair pair) {
            a8.O(pair);
        }

        public static /* synthetic */ void D(a a8, Pair pair) {
            a8.I(pair);
        }

        public static /* synthetic */ void E(a a8, Pair pair, Exception exception) {
            a8.Q(pair, exception);
        }

        public static /* synthetic */ void F(a a8, Pair pair, x0.u u8) {
            a8.H(pair, u8);
        }

        public static /* synthetic */ void b(a a8, Pair pair, int n8) {
            a8.P(pair, n8);
        }

        public static /* synthetic */ void c(a a8, Pair pair, r r8, x0.u u8) {
            a8.Y(pair, r8, u8);
        }

        public static /* synthetic */ void j(a a8, Pair pair) {
            a8.J(pair);
        }

        public static /* synthetic */ void k(a a8, Pair pair, r r8, x0.u u8) {
            a8.U(pair, r8, u8);
        }

        public static /* synthetic */ void m(a a8, Pair pair) {
            a8.R(pair);
        }

        public static /* synthetic */ void r(a a8, Pair pair, x0.u u8) {
            a8.c0(pair, u8);
        }

        public static /* synthetic */ void x(a a8, Pair pair, r r8, x0.u u8) {
            a8.V(pair, r8, u8);
        }

        public final Pair G(int n8, x.b b8) {
            x.b b9 = null;
            if (b8 != null && (b9 = T0.n(this.a, b8)) == null) {
                return null;
            }
            return Pair.create((Object)T0.s(this.a, n8), (Object)b9);
        }

        public final /* synthetic */ void H(Pair pair, x0.u u8) {
            T0.this.h.W((Integer)pair.first, (x.b)pair.second, u8);
        }

        public final /* synthetic */ void I(Pair pair) {
            T0.this.h.S((Integer)pair.first, (x.b)pair.second);
        }

        public final /* synthetic */ void J(Pair pair) {
            T0.this.h.g0((Integer)pair.first, (x.b)pair.second);
        }

        @Override
        public void K(int n8, x.b b8, r r8, x0.u u8) {
            if ((b8 = this.G(n8, b8)) != null) {
                T0.this.i.j(new K0(this, (Pair)b8, r8, u8));
            }
        }

        @Override
        public void M(int n8, x.b b8, int n9) {
            if ((b8 = this.G(n8, b8)) != null) {
                T0.this.i.j(new Q0(this, (Pair)b8, n9));
            }
        }

        public final /* synthetic */ void O(Pair pair) {
            T0.this.h.l0((Integer)pair.first, (x.b)pair.second);
        }

        public final /* synthetic */ void P(Pair pair, int n8) {
            T0.this.h.M((Integer)pair.first, (x.b)pair.second, n8);
        }

        public final /* synthetic */ void Q(Pair pair, Exception exception) {
            T0.this.h.d0((Integer)pair.first, (x.b)pair.second, exception);
        }

        public final /* synthetic */ void R(Pair pair) {
            T0.this.h.T((Integer)pair.first, (x.b)pair.second);
        }

        @Override
        public void S(int n8, x.b b8) {
            if ((b8 = this.G(n8, b8)) != null) {
                T0.this.i.j(new J0(this, (Pair)b8));
            }
        }

        @Override
        public void T(int n8, x.b b8) {
            if ((b8 = this.G(n8, b8)) != null) {
                T0.this.i.j(new O0(this, (Pair)b8));
            }
        }

        public final /* synthetic */ void U(Pair pair, r r8, x0.u u8) {
            T0.this.h.p0((Integer)pair.first, (x.b)pair.second, r8, u8);
        }

        public final /* synthetic */ void V(Pair pair, r r8, x0.u u8) {
            T0.this.h.m0((Integer)pair.first, (x.b)pair.second, r8, u8);
        }

        @Override
        public void W(int n8, x.b b8, x0.u u8) {
            if ((b8 = this.G(n8, b8)) != null) {
                T0.this.i.j(new L0(this, (Pair)b8, u8));
            }
        }

        public final /* synthetic */ void X(Pair pair, r r8, x0.u u8, IOException iOException, boolean bl) {
            T0.this.h.a0((Integer)pair.first, (x.b)pair.second, r8, u8, iOException, bl);
        }

        public final /* synthetic */ void Y(Pair pair, r r8, x0.u u8) {
            T0.this.h.K((Integer)pair.first, (x.b)pair.second, r8, u8);
        }

        @Override
        public void Z(int n8, x.b b8, x0.u u8) {
            if ((b8 = this.G(n8, b8)) != null) {
                T0.this.i.j(new H0(this, (Pair)b8, u8));
            }
        }

        @Override
        public void a0(int n8, x.b b8, r r8, x0.u u8, IOException iOException, boolean bl) {
            if ((b8 = this.G(n8, b8)) != null) {
                T0.this.i.j(new R0(this, (Pair)b8, r8, u8, iOException, bl));
            }
        }

        @Override
        public /* synthetic */ void b0(int n8, x.b b8) {
            p0.o.a(this, n8, b8);
        }

        public final /* synthetic */ void c0(Pair pair, x0.u u8) {
            T0.this.h.Z((Integer)pair.first, (x.b)g0.a.e((x.b)pair.second), u8);
        }

        @Override
        public void d0(int n8, x.b b8, Exception exception) {
            if ((b8 = this.G(n8, b8)) != null) {
                T0.this.i.j(new N0(this, (Pair)b8, exception));
            }
        }

        @Override
        public void g0(int n8, x.b b8) {
            if ((b8 = this.G(n8, b8)) != null) {
                T0.this.i.j(new S0(this, (Pair)b8));
            }
        }

        @Override
        public void l0(int n8, x.b b8) {
            if ((b8 = this.G(n8, b8)) != null) {
                T0.this.i.j(new I0(this, (Pair)b8));
            }
        }

        @Override
        public void m0(int n8, x.b b8, r r8, x0.u u8) {
            if ((b8 = this.G(n8, b8)) != null) {
                T0.this.i.j(new P0(this, (Pair)b8, r8, u8));
            }
        }

        @Override
        public void p0(int n8, x.b b8, r r8, x0.u u8) {
            if ((b8 = this.G(n8, b8)) != null) {
                T0.this.i.j(new M0(this, (Pair)b8, r8, u8));
            }
        }
    }

    public static final class b {
        public final x a;
        public final x.c b;
        public final a c;

        public b(x x8, x.c c8, a a8) {
            this.a = x8;
            this.b = c8;
            this.c = a8;
        }
    }

    public static final class c
    implements F0 {
        public final t a;
        public final Object b;
        public final List c;
        public int d;
        public boolean e;

        public c(x x8, boolean bl) {
            this.a = new t(x8, bl);
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

        public void c(int n8) {
            this.d = n8;
            this.e = false;
            this.c.clear();
        }
    }

    public static interface d {
        public void b();
    }

}

