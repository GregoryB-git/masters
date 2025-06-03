// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package x0;

import d0.u;
import android.os.Handler;
import i0.y;
import java.util.Iterator;
import l0.y1;
import d0.I;
import android.os.Looper;
import p0.v;
import java.util.HashSet;
import java.util.ArrayList;

public abstract class a implements x
{
    public final ArrayList a;
    public final HashSet b;
    public final E.a c;
    public final v.a d;
    public Looper e;
    public I f;
    public y1 g;
    
    public a() {
        this.a = new ArrayList(1);
        this.b = new HashSet(1);
        this.c = new E.a();
        this.d = new v.a();
    }
    
    public final void A(final I f) {
        this.f = f;
        final Iterator<c> iterator = this.a.iterator();
        while (iterator.hasNext()) {
            iterator.next().a(this, f);
        }
    }
    
    public abstract void B();
    
    @Override
    public final void c(final E e) {
        this.c.B(e);
    }
    
    @Override
    public final void d(final c o) {
        final boolean empty = this.b.isEmpty();
        this.b.remove(o);
        if ((empty ^ true) && this.b.isEmpty()) {
            this.v();
        }
    }
    
    @Override
    public final void g(final c c, final y y, final y1 g) {
        final Looper myLooper = Looper.myLooper();
        final Looper e = this.e;
        g0.a.a(e == null || e == myLooper);
        this.g = g;
        final I f = this.f;
        this.a.add(c);
        if (this.e == null) {
            this.e = myLooper;
            this.b.add(c);
            this.z(y);
            return;
        }
        if (f != null) {
            this.n(c);
            c.a(this, f);
        }
    }
    
    @Override
    public final void k(final Handler handler, final v v) {
        g0.a.e(handler);
        g0.a.e(v);
        this.d.g(handler, v);
    }
    
    @Override
    public final void m(final c o) {
        this.a.remove(o);
        if (this.a.isEmpty()) {
            this.e = null;
            this.f = null;
            this.g = null;
            this.b.clear();
            this.B();
            return;
        }
        this.d(o);
    }
    
    @Override
    public final void n(final c e) {
        g0.a.e(this.e);
        final boolean empty = this.b.isEmpty();
        this.b.add(e);
        if (empty) {
            this.w();
        }
    }
    
    @Override
    public final void o(final v v) {
        this.d.t(v);
    }
    
    @Override
    public final void p(final Handler handler, final E e) {
        g0.a.e(handler);
        g0.a.e(e);
        this.c.g(handler, e);
    }
    
    public final v.a r(final int n, final b b) {
        return this.d.u(n, b);
    }
    
    public final v.a s(final b b) {
        return this.d.u(0, b);
    }
    
    public final E.a t(final int n, final b b) {
        return this.c.E(n, b);
    }
    
    public final E.a u(final b b) {
        return this.c.E(0, b);
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
    
    public abstract void z(final y p0);
}
