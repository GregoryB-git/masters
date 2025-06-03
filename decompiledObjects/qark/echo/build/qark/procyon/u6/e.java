// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package u6;

import u.b;
import kotlin.jvm.internal.Intrinsics;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

public abstract class e
{
    public static final AtomicReferenceFieldUpdater o;
    public static final AtomicReferenceFieldUpdater p;
    private volatile Object _next;
    private volatile Object _prev;
    
    static {
        o = AtomicReferenceFieldUpdater.newUpdater(e.class, Object.class, "_next");
        p = AtomicReferenceFieldUpdater.newUpdater(e.class, Object.class, "_prev");
    }
    
    public e(final e prev) {
        this._prev = prev;
    }
    
    public final void b() {
        e.p.lazySet(this, null);
    }
    
    public final e c() {
        e g;
        for (g = this.g(); g != null && g.h(); g = (e)e.p.get(g)) {}
        return g;
    }
    
    public final e d() {
        e e = this.e();
        Intrinsics.b(e);
        while (e.h()) {
            final e e2 = e.e();
            if (e2 == null) {
                return e;
            }
            e = e2;
        }
        return e;
    }
    
    public final e e() {
        final Object a = this.f();
        if (a == d.a()) {
            return null;
        }
        return (e)a;
    }
    
    public final Object f() {
        return e.o.get(this);
    }
    
    public final e g() {
        return e.p.get(this);
    }
    
    public abstract boolean h();
    
    public final boolean i() {
        return this.e() == null;
    }
    
    public final boolean j() {
        return b.a(e.o, this, null, d.a());
    }
    
    public final void k() {
        if (this.i()) {
            return;
        }
        e d;
        e c;
        do {
            c = this.c();
            d = this.d();
            final AtomicReferenceFieldUpdater p = e.p;
            e value;
            Object o;
            do {
                value = p.get(d);
                if (value == null) {
                    o = null;
                }
                else {
                    o = c;
                }
            } while (!b.a(p, d, value, o));
            if (c != null) {
                e.o.set(c, d);
            }
        } while ((d.h() && !d.i()) || (c != null && c.h()));
    }
    
    public final boolean l(final e e) {
        return b.a(e.o, this, null, e);
    }
}
