/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 *  android.os.Looper
 *  java.lang.Object
 *  java.util.ArrayList
 *  java.util.HashSet
 *  java.util.Iterator
 */
package x0;

import android.os.Handler;
import android.os.Looper;
import d0.I;
import d0.u;
import i0.y;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import l0.y1;
import p0.v;
import x0.E;
import x0.w;
import x0.x;

public abstract class a
implements x {
    public final ArrayList a = new ArrayList(1);
    public final HashSet b = new HashSet(1);
    public final E.a c = new E.a();
    public final v.a d = new v.a();
    public Looper e;
    public I f;
    public y1 g;

    public final void A(I i8) {
        this.f = i8;
        Iterator iterator = this.a.iterator();
        while (iterator.hasNext()) {
            ((x.c)iterator.next()).a(this, i8);
        }
    }

    public abstract void B();

    @Override
    public final void c(E e8) {
        this.c.B(e8);
    }

    @Override
    public final void d(x.c c8) {
        boolean bl = this.b.isEmpty();
        this.b.remove((Object)c8);
        if (bl ^ true && this.b.isEmpty()) {
            this.v();
        }
    }

    @Override
    public final void g(x.c c8, y y8, y1 object) {
        Looper looper = Looper.myLooper();
        Looper looper2 = this.e;
        boolean bl = looper2 == null || looper2 == looper;
        g0.a.a(bl);
        this.g = object;
        object = this.f;
        this.a.add((Object)c8);
        if (this.e == null) {
            this.e = looper;
            this.b.add((Object)c8);
            this.z(y8);
            return;
        }
        if (object != null) {
            this.n(c8);
            c8.a(this, (I)object);
        }
    }

    @Override
    public /* synthetic */ boolean i() {
        return w.b(this);
    }

    @Override
    public /* synthetic */ I j() {
        return w.a(this);
    }

    @Override
    public final void k(Handler handler, v v8) {
        g0.a.e((Object)handler);
        g0.a.e(v8);
        this.d.g(handler, v8);
    }

    @Override
    public /* synthetic */ void l(u u8) {
        w.c(this, u8);
    }

    @Override
    public final void m(x.c c8) {
        this.a.remove((Object)c8);
        if (this.a.isEmpty()) {
            this.e = null;
            this.f = null;
            this.g = null;
            this.b.clear();
            this.B();
            return;
        }
        this.d(c8);
    }

    @Override
    public final void n(x.c c8) {
        g0.a.e((Object)this.e);
        boolean bl = this.b.isEmpty();
        this.b.add((Object)c8);
        if (bl) {
            this.w();
        }
    }

    @Override
    public final void o(v v8) {
        this.d.t(v8);
    }

    @Override
    public final void p(Handler handler, E e8) {
        g0.a.e((Object)handler);
        g0.a.e(e8);
        this.c.g(handler, e8);
    }

    public final v.a r(int n8, x.b b8) {
        return this.d.u(n8, b8);
    }

    public final v.a s(x.b b8) {
        return this.d.u(0, b8);
    }

    public final E.a t(int n8, x.b b8) {
        return this.c.E(n8, b8);
    }

    public final E.a u(x.b b8) {
        return this.c.E(0, b8);
    }

    public void v() {
    }

    public void w() {
    }

    public final y1 x() {
        return (y1)g0.a.h(this.g);
    }

    public final boolean y() {
        return this.b.isEmpty() ^ true;
    }

    public abstract void z(y var1);
}

