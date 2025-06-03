/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.util.concurrent.atomic.AtomicReferenceFieldUpdater
 */
package u6;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.Intrinsics;
import u.b;
import u6.d;

public abstract class e {
    public static final AtomicReferenceFieldUpdater o = AtomicReferenceFieldUpdater.newUpdater(e.class, Object.class, (String)"_next");
    public static final AtomicReferenceFieldUpdater p = AtomicReferenceFieldUpdater.newUpdater(e.class, Object.class, (String)"_prev");
    private volatile Object _next;
    private volatile Object _prev;

    public e(e e8) {
        this._prev = e8;
    }

    public final void b() {
        p.lazySet((Object)this, (Object)null);
    }

    public final e c() {
        e e8 = this.g();
        while (e8 != null && e8.h()) {
            e8 = (e)p.get((Object)e8);
        }
        return e8;
    }

    public final e d() {
        e e8 = this.e();
        Intrinsics.b(e8);
        while (e8.h()) {
            e e9 = e8.e();
            if (e9 == null) {
                return e8;
            }
            e8 = e9;
        }
        return e8;
    }

    public final e e() {
        Object object = this.f();
        if (object == d.a()) {
            return null;
        }
        return (e)object;
    }

    public final Object f() {
        return o.get((Object)this);
    }

    public final e g() {
        return (e)p.get((Object)this);
    }

    public abstract boolean h();

    public final boolean i() {
        if (this.e() == null) {
            return true;
        }
        return false;
    }

    public final boolean j() {
        return b.a(o, this, null, d.a());
    }

    public final void k() {
        e e8;
        e e9;
        if (this.i()) {
            return;
        }
        do {
            e e10;
            Object object;
            e9 = this.c();
            e8 = this.d();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = p;
            while (!b.a(atomicReferenceFieldUpdater, e8, object, e10 = (e)(object = atomicReferenceFieldUpdater.get((Object)e8)) == null ? null : e9)) {
            }
            if (e9 == null) continue;
            o.set((Object)e9, (Object)e8);
        } while (e8.h() && !e8.i() || e9 != null && e9.h());
    }

    public final boolean l(e e8) {
        return b.a(o, this, null, e8);
    }
}

