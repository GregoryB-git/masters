/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 *  java.io.IOException
 *  java.lang.Exception
 *  java.lang.Object
 *  java.util.Collection
 *  java.util.HashMap
 *  java.util.Iterator
 */
package x0;

import android.os.Handler;
import d0.I;
import d0.q;
import g0.M;
import i0.y;
import java.io.IOException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import l0.y1;
import p0.o;
import p0.v;
import x0.E;
import x0.g;
import x0.r;
import x0.u;
import x0.x;

public abstract class h
extends x0.a {
    public final HashMap h = new HashMap();
    public Handler i;
    public y j;

    public static /* synthetic */ void C(h h8, Object object, x x8, I i8) {
        h8.I(object, x8, i8);
    }

    @Override
    public void B() {
        for (b b8 : this.h.values()) {
            b8.a.m(b8.b);
            b8.a.c(b8.c);
            b8.a.o(b8.c);
        }
        this.h.clear();
    }

    public final void D(Object object) {
        object = (b)g0.a.e((b)this.h.get(object));
        object.a.d(object.b);
    }

    public final void E(Object object) {
        object = (b)g0.a.e((b)this.h.get(object));
        object.a.n(object.b);
    }

    public abstract x.b F(Object var1, x.b var2);

    public long G(Object object, long l8, x.b b8) {
        return l8;
    }

    public abstract int H(Object var1, int var2);

    public final /* synthetic */ void I(Object object, x x8, I i8) {
        this.J(object, x8, i8);
    }

    public abstract void J(Object var1, x var2, I var3);

    public final void K(Object object, x x8) {
        g0.a.a(this.h.containsKey(object) ^ true);
        g g8 = new g(this, object);
        a a8 = new a(object);
        this.h.put(object, (Object)new b(x8, g8, a8));
        x8.p((Handler)g0.a.e((Object)this.i), a8);
        x8.k((Handler)g0.a.e((Object)this.i), a8);
        x8.g(g8, this.j, this.x());
        if (!this.y()) {
            x8.d(g8);
        }
    }

    public final void L(Object object) {
        object = (b)g0.a.e((b)this.h.remove(object));
        object.a.m(object.b);
        object.a.c(object.c);
        object.a.o(object.c);
    }

    @Override
    public void h() {
        Iterator iterator = this.h.values().iterator();
        while (iterator.hasNext()) {
            ((b)iterator.next()).a.h();
        }
    }

    @Override
    public void v() {
        for (b b8 : this.h.values()) {
            b8.a.d(b8.b);
        }
    }

    @Override
    public void w() {
        for (b b8 : this.h.values()) {
            b8.a.n(b8.b);
        }
    }

    @Override
    public void z(y y8) {
        this.j = y8;
        this.i = M.A();
    }

    public final class a
    implements E,
    v {
        public final Object a;
        public E.a b;
        public v.a c;

        public a(Object object) {
            this.b = h.this.u(null);
            this.c = h.this.s(null);
            this.a = object;
        }

        @Override
        public void K(int n8, x.b b8, r r8, u u8) {
            if (this.b(n8, b8)) {
                this.b.A(r8, this.c(u8, b8));
            }
        }

        @Override
        public void M(int n8, x.b b8, int n9) {
            if (this.b(n8, b8)) {
                this.c.k(n9);
            }
        }

        @Override
        public void S(int n8, x.b b8) {
            if (this.b(n8, b8)) {
                this.c.h();
            }
        }

        @Override
        public void T(int n8, x.b b8) {
            if (this.b(n8, b8)) {
                this.c.m();
            }
        }

        @Override
        public void W(int n8, x.b b8, u u8) {
            if (this.b(n8, b8)) {
                this.b.i(this.c(u8, b8));
            }
        }

        @Override
        public void Z(int n8, x.b b8, u u8) {
            if (this.b(n8, b8)) {
                this.b.D(this.c(u8, b8));
            }
        }

        @Override
        public void a0(int n8, x.b b8, r r8, u u8, IOException iOException, boolean bl) {
            if (this.b(n8, b8)) {
                this.b.x(r8, this.c(u8, b8), iOException, bl);
            }
        }

        public final boolean b(int n8, x.b b8) {
            Object object;
            if (b8 != null) {
                object = h.this.F(this.a, b8);
                b8 = object;
                if (object == null) {
                    return false;
                }
            } else {
                b8 = null;
            }
            n8 = h.this.H(this.a, n8);
            object = this.b;
            if (object.a != n8 || !M.c(object.b, b8)) {
                this.b = h.this.t(n8, b8);
            }
            object = this.c;
            if (object.a != n8 || !M.c(object.b, b8)) {
                this.c = h.this.r(n8, b8);
            }
            return true;
        }

        @Override
        public /* synthetic */ void b0(int n8, x.b b8) {
            o.a(this, n8, b8);
        }

        public final u c(u u8, x.b b8) {
            long l8 = h.this.G(this.a, u8.f, b8);
            long l9 = h.this.G(this.a, u8.g, b8);
            if (l8 == u8.f && l9 == u8.g) {
                return u8;
            }
            return new u(u8.a, u8.b, u8.c, u8.d, u8.e, l8, l9);
        }

        @Override
        public void d0(int n8, x.b b8, Exception exception) {
            if (this.b(n8, b8)) {
                this.c.l(exception);
            }
        }

        @Override
        public void g0(int n8, x.b b8) {
            if (this.b(n8, b8)) {
                this.c.i();
            }
        }

        @Override
        public void l0(int n8, x.b b8) {
            if (this.b(n8, b8)) {
                this.c.j();
            }
        }

        @Override
        public void m0(int n8, x.b b8, r r8, u u8) {
            if (this.b(n8, b8)) {
                this.b.u(r8, this.c(u8, b8));
            }
        }

        @Override
        public void p0(int n8, x.b b8, r r8, u u8) {
            if (this.b(n8, b8)) {
                this.b.r(r8, this.c(u8, b8));
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

}

