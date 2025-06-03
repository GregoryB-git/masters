package p6;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.Intrinsics;
import p6.InterfaceC1869q0;
import u.AbstractC1997b;
import u6.C2040j;

/* renamed from: p6.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1860m extends U implements InterfaceC1858l, Z5.e, P0 {

    /* renamed from: t, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f18537t = AtomicIntegerFieldUpdater.newUpdater(C1860m.class, "_decisionAndIndex");

    /* renamed from: u, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f18538u = AtomicReferenceFieldUpdater.newUpdater(C1860m.class, Object.class, "_state");

    /* renamed from: v, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f18539v = AtomicReferenceFieldUpdater.newUpdater(C1860m.class, Object.class, "_parentHandle");
    private volatile int _decisionAndIndex;
    private volatile Object _parentHandle;
    private volatile Object _state;

    /* renamed from: r, reason: collision with root package name */
    public final X5.d f18540r;

    /* renamed from: s, reason: collision with root package name */
    public final X5.g f18541s;

    public C1860m(X5.d dVar, int i7) {
        super(i7);
        this.f18540r = dVar;
        this.f18541s = dVar.getContext();
        this._decisionAndIndex = 536870911;
        this._state = C1842d.f18526o;
    }

    private final boolean D() {
        if (V.c(this.f18512q)) {
            X5.d dVar = this.f18540r;
            Intrinsics.c(dVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
            if (((C2040j) dVar).n()) {
                return true;
            }
        }
        return false;
    }

    public static /* synthetic */ void L(C1860m c1860m, Object obj, int i7, g6.l lVar, int i8, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: resumeImpl");
        }
        if ((i8 & 4) != 0) {
            lVar = null;
        }
        c1860m.K(obj, i7, lVar);
    }

    public final X A() {
        InterfaceC1869q0 interfaceC1869q0 = (InterfaceC1869q0) getContext().b(InterfaceC1869q0.f18550n);
        if (interfaceC1869q0 == null) {
            return null;
        }
        X d7 = InterfaceC1869q0.a.d(interfaceC1869q0, true, false, new C1868q(this), 2, null);
        AbstractC1997b.a(f18539v, this, null, d7);
        return d7;
    }

    public final void B(Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f18538u;
        while (true) {
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof C1842d) {
                if (AbstractC1997b.a(f18538u, this, obj2, obj)) {
                    return;
                }
            } else if ((obj2 instanceof AbstractC1854j) || (obj2 instanceof u6.C)) {
                F(obj, obj2);
            } else {
                boolean z7 = obj2 instanceof C1877z;
                if (z7) {
                    C1877z c1877z = (C1877z) obj2;
                    if (!c1877z.b()) {
                        F(obj, obj2);
                    }
                    if (obj2 instanceof C1866p) {
                        if (!z7) {
                            c1877z = null;
                        }
                        Throwable th = c1877z != null ? c1877z.f18582a : null;
                        if (obj instanceof AbstractC1854j) {
                            l((AbstractC1854j) obj, th);
                            return;
                        } else {
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.Segment<*>");
                            n((u6.C) obj, th);
                            return;
                        }
                    }
                    return;
                }
                if (obj2 instanceof C1876y) {
                    C1876y c1876y = (C1876y) obj2;
                    if (c1876y.f18570b != null) {
                        F(obj, obj2);
                    }
                    if (obj instanceof u6.C) {
                        return;
                    }
                    Intrinsics.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
                    AbstractC1854j abstractC1854j = (AbstractC1854j) obj;
                    if (c1876y.c()) {
                        l(abstractC1854j, c1876y.f18573e);
                        return;
                    } else {
                        if (AbstractC1997b.a(f18538u, this, obj2, C1876y.b(c1876y, null, abstractC1854j, null, null, null, 29, null))) {
                            return;
                        }
                    }
                } else {
                    if (obj instanceof u6.C) {
                        return;
                    }
                    Intrinsics.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
                    if (AbstractC1997b.a(f18538u, this, obj2, new C1876y(obj2, (AbstractC1854j) obj, null, null, null, 28, null))) {
                        return;
                    }
                }
            }
        }
    }

    public boolean C() {
        return !(x() instanceof E0);
    }

    public final AbstractC1854j E(g6.l lVar) {
        return lVar instanceof AbstractC1854j ? (AbstractC1854j) lVar : new C1863n0(lVar);
    }

    public final void F(Object obj, Object obj2) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + obj + ", already has " + obj2).toString());
    }

    public String G() {
        return "CancellableContinuation";
    }

    public final void H(Throwable th) {
        if (q(th)) {
            return;
        }
        o(th);
        s();
    }

    public final void I() {
        Throwable s7;
        X5.d dVar = this.f18540r;
        C2040j c2040j = dVar instanceof C2040j ? (C2040j) dVar : null;
        if (c2040j == null || (s7 = c2040j.s(this)) == null) {
            return;
        }
        r();
        o(s7);
    }

    public final boolean J() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f18538u;
        Object obj = atomicReferenceFieldUpdater.get(this);
        if ((obj instanceof C1876y) && ((C1876y) obj).f18572d != null) {
            r();
            return false;
        }
        f18537t.set(this, 536870911);
        atomicReferenceFieldUpdater.set(this, C1842d.f18526o);
        return true;
    }

    public final void K(Object obj, int i7, g6.l lVar) {
        Object obj2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f18538u;
        do {
            obj2 = atomicReferenceFieldUpdater.get(this);
            if (!(obj2 instanceof E0)) {
                if (obj2 instanceof C1866p) {
                    C1866p c1866p = (C1866p) obj2;
                    if (c1866p.c()) {
                        if (lVar != null) {
                            m(lVar, c1866p.f18582a);
                            return;
                        }
                        return;
                    }
                }
                k(obj);
                throw new V5.e();
            }
        } while (!AbstractC1997b.a(f18538u, this, obj2, M((E0) obj2, obj, i7, lVar, null)));
        s();
        t(i7);
    }

    public final Object M(E0 e02, Object obj, int i7, g6.l lVar, Object obj2) {
        if (obj instanceof C1877z) {
            return obj;
        }
        if (!V.b(i7) && obj2 == null) {
            return obj;
        }
        if (lVar == null && !(e02 instanceof AbstractC1854j) && obj2 == null) {
            return obj;
        }
        return new C1876y(obj, e02 instanceof AbstractC1854j ? (AbstractC1854j) e02 : null, lVar, obj2, null, 16, null);
    }

    public final boolean N() {
        int i7;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f18537t;
        do {
            i7 = atomicIntegerFieldUpdater.get(this);
            int i8 = i7 >> 29;
            if (i8 != 0) {
                if (i8 == 1) {
                    return false;
                }
                throw new IllegalStateException("Already resumed".toString());
            }
        } while (!f18537t.compareAndSet(this, i7, 1073741824 + (536870911 & i7)));
        return true;
    }

    public final u6.F O(Object obj, Object obj2, g6.l lVar) {
        Object obj3;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f18538u;
        do {
            obj3 = atomicReferenceFieldUpdater.get(this);
            if (!(obj3 instanceof E0)) {
                if ((obj3 instanceof C1876y) && obj2 != null && ((C1876y) obj3).f18572d == obj2) {
                    return AbstractC1862n.f18543a;
                }
                return null;
            }
        } while (!AbstractC1997b.a(f18538u, this, obj3, M((E0) obj3, obj, this.f18512q, lVar, obj2)));
        s();
        return AbstractC1862n.f18543a;
    }

    public final boolean P() {
        int i7;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f18537t;
        do {
            i7 = atomicIntegerFieldUpdater.get(this);
            int i8 = i7 >> 29;
            if (i8 != 0) {
                if (i8 == 2) {
                    return false;
                }
                throw new IllegalStateException("Already suspended".toString());
            }
        } while (!f18537t.compareAndSet(this, i7, 536870912 + (536870911 & i7)));
        return true;
    }

    @Override // p6.P0
    public void a(u6.C c7, int i7) {
        int i8;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f18537t;
        do {
            i8 = atomicIntegerFieldUpdater.get(this);
            if ((i8 & 536870911) != 536870911) {
                throw new IllegalStateException("invokeOnCancellation should be called at most once".toString());
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i8, ((i8 >> 29) << 29) + i7));
        B(c7);
    }

    @Override // p6.U
    public void b(Object obj, Throwable th) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f18538u;
        while (true) {
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof E0) {
                throw new IllegalStateException("Not completed".toString());
            }
            if (obj2 instanceof C1877z) {
                return;
            }
            if (obj2 instanceof C1876y) {
                C1876y c1876y = (C1876y) obj2;
                if (!(!c1876y.c())) {
                    throw new IllegalStateException("Must be called at most once".toString());
                }
                if (AbstractC1997b.a(f18538u, this, obj2, C1876y.b(c1876y, null, null, null, null, th, 15, null))) {
                    c1876y.d(this, th);
                    return;
                }
            } else if (AbstractC1997b.a(f18538u, this, obj2, new C1876y(obj2, null, null, null, th, 14, null))) {
                return;
            }
        }
    }

    @Override // p6.U
    public final X5.d c() {
        return this.f18540r;
    }

    @Override // p6.InterfaceC1858l
    public void d(g6.l lVar) {
        B(E(lVar));
    }

    @Override // p6.U
    public Throwable e(Object obj) {
        Throwable e7 = super.e(obj);
        if (e7 != null) {
            return e7;
        }
        return null;
    }

    @Override // p6.U
    public Object f(Object obj) {
        return obj instanceof C1876y ? ((C1876y) obj).f18569a : obj;
    }

    @Override // p6.InterfaceC1858l
    public Object g(Object obj, Object obj2, g6.l lVar) {
        return O(obj, obj2, lVar);
    }

    @Override // Z5.e
    public Z5.e getCallerFrame() {
        X5.d dVar = this.f18540r;
        if (dVar instanceof Z5.e) {
            return (Z5.e) dVar;
        }
        return null;
    }

    @Override // X5.d
    public X5.g getContext() {
        return this.f18541s;
    }

    @Override // p6.U
    public Object i() {
        return x();
    }

    @Override // p6.InterfaceC1858l
    public void j(Object obj, g6.l lVar) {
        K(obj, this.f18512q, lVar);
    }

    public final Void k(Object obj) {
        throw new IllegalStateException(("Already resumed, but proposed with update " + obj).toString());
    }

    public final void l(AbstractC1854j abstractC1854j, Throwable th) {
        try {
            abstractC1854j.a(th);
        } catch (Throwable th2) {
            H.a(getContext(), new C("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    public final void m(g6.l lVar, Throwable th) {
        try {
            lVar.invoke(th);
        } catch (Throwable th2) {
            H.a(getContext(), new C("Exception in resume onCancellation handler for " + this, th2));
        }
    }

    public final void n(u6.C c7, Throwable th) {
        int i7 = f18537t.get(this) & 536870911;
        if (i7 == 536870911) {
            throw new IllegalStateException("The index for Segment.onCancellation(..) is broken".toString());
        }
        try {
            c7.o(i7, th, getContext());
        } catch (Throwable th2) {
            H.a(getContext(), new C("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    @Override // p6.InterfaceC1858l
    public boolean o(Throwable th) {
        Object obj;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f18538u;
        do {
            obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof E0)) {
                return false;
            }
        } while (!AbstractC1997b.a(f18538u, this, obj, new C1866p(this, th, (obj instanceof AbstractC1854j) || (obj instanceof u6.C))));
        E0 e02 = (E0) obj;
        if (e02 instanceof AbstractC1854j) {
            l((AbstractC1854j) obj, th);
        } else if (e02 instanceof u6.C) {
            n((u6.C) obj, th);
        }
        s();
        t(this.f18512q);
        return true;
    }

    @Override // p6.InterfaceC1858l
    public void p(Object obj) {
        t(this.f18512q);
    }

    public final boolean q(Throwable th) {
        if (!D()) {
            return false;
        }
        X5.d dVar = this.f18540r;
        Intrinsics.c(dVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
        return ((C2040j) dVar).q(th);
    }

    public final void r() {
        X v7 = v();
        if (v7 == null) {
            return;
        }
        v7.b();
        f18539v.set(this, D0.f18485o);
    }

    @Override // X5.d
    public void resumeWith(Object obj) {
        L(this, D.c(obj, this), this.f18512q, null, 4, null);
    }

    public final void s() {
        if (D()) {
            return;
        }
        r();
    }

    public final void t(int i7) {
        if (N()) {
            return;
        }
        V.a(this, i7);
    }

    public String toString() {
        return G() + '(' + M.c(this.f18540r) + "){" + y() + "}@" + M.b(this);
    }

    public Throwable u(InterfaceC1869q0 interfaceC1869q0) {
        return interfaceC1869q0.s();
    }

    public final X v() {
        return (X) f18539v.get(this);
    }

    public final Object w() {
        InterfaceC1869q0 interfaceC1869q0;
        Object c7;
        boolean D7 = D();
        if (P()) {
            if (v() == null) {
                A();
            }
            if (D7) {
                I();
            }
            c7 = Y5.d.c();
            return c7;
        }
        if (D7) {
            I();
        }
        Object x7 = x();
        if (x7 instanceof C1877z) {
            throw ((C1877z) x7).f18582a;
        }
        if (!V.b(this.f18512q) || (interfaceC1869q0 = (InterfaceC1869q0) getContext().b(InterfaceC1869q0.f18550n)) == null || interfaceC1869q0.a()) {
            return f(x7);
        }
        CancellationException s7 = interfaceC1869q0.s();
        b(x7, s7);
        throw s7;
    }

    public final Object x() {
        return f18538u.get(this);
    }

    public final String y() {
        Object x7 = x();
        return x7 instanceof E0 ? "Active" : x7 instanceof C1866p ? "Cancelled" : "Completed";
    }

    public void z() {
        X A7 = A();
        if (A7 != null && C()) {
            A7.b();
            f18539v.set(this, D0.f18485o);
        }
    }
}
