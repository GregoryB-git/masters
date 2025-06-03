package u6;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.Intrinsics;
import u.AbstractC1997b;

/* renamed from: u6.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2035e {

    /* renamed from: o, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f19976o = AtomicReferenceFieldUpdater.newUpdater(AbstractC2035e.class, Object.class, "_next");

    /* renamed from: p, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f19977p = AtomicReferenceFieldUpdater.newUpdater(AbstractC2035e.class, Object.class, "_prev");
    private volatile Object _next;
    private volatile Object _prev;

    public AbstractC2035e(AbstractC2035e abstractC2035e) {
        this._prev = abstractC2035e;
    }

    public final void b() {
        f19977p.lazySet(this, null);
    }

    public final AbstractC2035e c() {
        AbstractC2035e g7 = g();
        while (g7 != null && g7.h()) {
            g7 = (AbstractC2035e) f19977p.get(g7);
        }
        return g7;
    }

    public final AbstractC2035e d() {
        AbstractC2035e e7 = e();
        Intrinsics.b(e7);
        while (e7.h()) {
            AbstractC2035e e8 = e7.e();
            if (e8 == null) {
                return e7;
            }
            e7 = e8;
        }
        return e7;
    }

    public final AbstractC2035e e() {
        Object f7 = f();
        if (f7 == AbstractC2034d.f19975a) {
            return null;
        }
        return (AbstractC2035e) f7;
    }

    public final Object f() {
        return f19976o.get(this);
    }

    public final AbstractC2035e g() {
        return (AbstractC2035e) f19977p.get(this);
    }

    public abstract boolean h();

    public final boolean i() {
        return e() == null;
    }

    public final boolean j() {
        return AbstractC1997b.a(f19976o, this, null, AbstractC2034d.f19975a);
    }

    public final void k() {
        Object obj;
        if (i()) {
            return;
        }
        while (true) {
            AbstractC2035e c7 = c();
            AbstractC2035e d7 = d();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f19977p;
            do {
                obj = atomicReferenceFieldUpdater.get(d7);
            } while (!AbstractC1997b.a(atomicReferenceFieldUpdater, d7, obj, ((AbstractC2035e) obj) == null ? null : c7));
            if (c7 != null) {
                f19976o.set(c7, d7);
            }
            if (!d7.h() || d7.i()) {
                if (c7 == null || !c7.h()) {
                    return;
                }
            }
        }
    }

    public final boolean l(AbstractC2035e abstractC2035e) {
        return AbstractC1997b.a(f19976o, this, null, abstractC2035e);
    }
}
