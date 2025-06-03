package p6;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.Intrinsics;
import u.AbstractC1997b;

/* renamed from: p6.b0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1839b0 extends AbstractC1841c0 implements S {

    /* renamed from: t, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f18523t = AtomicReferenceFieldUpdater.newUpdater(AbstractC1839b0.class, Object.class, "_queue");

    /* renamed from: u, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f18524u = AtomicReferenceFieldUpdater.newUpdater(AbstractC1839b0.class, Object.class, "_delayed");

    /* renamed from: v, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f18525v = AtomicIntegerFieldUpdater.newUpdater(AbstractC1839b0.class, "_isCompleted");
    private volatile Object _delayed;
    private volatile int _isCompleted = 0;
    private volatile Object _queue;

    /* renamed from: p6.b0$a */
    public static final class a extends u6.L {
    }

    private final boolean Z() {
        return f18525v.get(this) != 0;
    }

    @Override // p6.F
    public final void E(X5.g gVar, Runnable runnable) {
        X(runnable);
    }

    @Override // p6.AbstractC1837a0
    public long L() {
        u6.F f7;
        if (super.L() == 0) {
            return 0L;
        }
        Object obj = f18523t.get(this);
        if (obj != null) {
            if (!(obj instanceof u6.s)) {
                f7 = AbstractC1845e0.f18530b;
                return obj == f7 ? Long.MAX_VALUE : 0L;
            }
            if (!((u6.s) obj).g()) {
                return 0L;
            }
        }
        return Long.MAX_VALUE;
    }

    @Override // p6.AbstractC1837a0
    public long Q() {
        if (R()) {
            return 0L;
        }
        Runnable W6 = W();
        if (W6 == null) {
            return L();
        }
        W6.run();
        return 0L;
    }

    public final void V() {
        u6.F f7;
        u6.F f8;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f18523t;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f18523t;
                f7 = AbstractC1845e0.f18530b;
                if (AbstractC1997b.a(atomicReferenceFieldUpdater2, this, null, f7)) {
                    return;
                }
            } else {
                if (obj instanceof u6.s) {
                    ((u6.s) obj).d();
                    return;
                }
                f8 = AbstractC1845e0.f18530b;
                if (obj == f8) {
                    return;
                }
                u6.s sVar = new u6.s(8, true);
                Intrinsics.c(obj, "null cannot be cast to non-null type java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }");
                sVar.a((Runnable) obj);
                if (AbstractC1997b.a(f18523t, this, obj, sVar)) {
                    return;
                }
            }
        }
    }

    public final Runnable W() {
        u6.F f7;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f18523t;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                return null;
            }
            if (obj instanceof u6.s) {
                Intrinsics.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeTaskQueueCore<java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }>{ kotlinx.coroutines.EventLoop_commonKt.Queue<java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }> }");
                u6.s sVar = (u6.s) obj;
                Object j7 = sVar.j();
                if (j7 != u6.s.f20006h) {
                    return (Runnable) j7;
                }
                AbstractC1997b.a(f18523t, this, obj, sVar.i());
            } else {
                f7 = AbstractC1845e0.f18530b;
                if (obj == f7) {
                    return null;
                }
                if (AbstractC1997b.a(f18523t, this, obj, null)) {
                    Intrinsics.c(obj, "null cannot be cast to non-null type java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }");
                    return (Runnable) obj;
                }
            }
        }
    }

    public void X(Runnable runnable) {
        if (Y(runnable)) {
            U();
        } else {
            N.f18504w.X(runnable);
        }
    }

    public final boolean Y(Runnable runnable) {
        u6.F f7;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f18523t;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (Z()) {
                return false;
            }
            if (obj == null) {
                if (AbstractC1997b.a(f18523t, this, null, runnable)) {
                    return true;
                }
            } else if (obj instanceof u6.s) {
                Intrinsics.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeTaskQueueCore<java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }>{ kotlinx.coroutines.EventLoop_commonKt.Queue<java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }> }");
                u6.s sVar = (u6.s) obj;
                int a7 = sVar.a(runnable);
                if (a7 == 0) {
                    return true;
                }
                if (a7 == 1) {
                    AbstractC1997b.a(f18523t, this, obj, sVar.i());
                } else if (a7 == 2) {
                    return false;
                }
            } else {
                f7 = AbstractC1845e0.f18530b;
                if (obj == f7) {
                    return false;
                }
                u6.s sVar2 = new u6.s(8, true);
                Intrinsics.c(obj, "null cannot be cast to non-null type java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }");
                sVar2.a((Runnable) obj);
                sVar2.a(runnable);
                if (AbstractC1997b.a(f18523t, this, obj, sVar2)) {
                    return true;
                }
            }
        }
    }

    public boolean a0() {
        u6.F f7;
        if (!P()) {
            return false;
        }
        Object obj = f18523t.get(this);
        if (obj != null) {
            if (obj instanceof u6.s) {
                return ((u6.s) obj).g();
            }
            f7 = AbstractC1845e0.f18530b;
            if (obj != f7) {
                return false;
            }
        }
        return true;
    }

    public final void b0() {
        AbstractC1840c.a();
        System.nanoTime();
    }

    public final void c0() {
        f18523t.set(this, null);
        f18524u.set(this, null);
    }

    public final void d0(boolean z7) {
        f18525v.set(this, z7 ? 1 : 0);
    }

    @Override // p6.AbstractC1837a0
    public void shutdown() {
        L0.f18501a.c();
        d0(true);
        V();
        while (Q() <= 0) {
        }
        b0();
    }
}
