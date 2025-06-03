package u6;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.Intrinsics;
import p6.AbstractC1837a0;
import p6.C1860m;
import p6.InterfaceC1858l;
import p6.L0;
import p6.U;
import u.AbstractC1997b;

/* renamed from: u6.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2040j extends U implements Z5.e, X5.d {

    /* renamed from: v, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f19981v = AtomicReferenceFieldUpdater.newUpdater(C2040j.class, Object.class, "_reusableCancellableContinuation");
    private volatile Object _reusableCancellableContinuation;

    /* renamed from: r, reason: collision with root package name */
    public final p6.F f19982r;

    /* renamed from: s, reason: collision with root package name */
    public final X5.d f19983s;

    /* renamed from: t, reason: collision with root package name */
    public Object f19984t;

    /* renamed from: u, reason: collision with root package name */
    public final Object f19985u;

    public C2040j(p6.F f7, X5.d dVar) {
        super(-1);
        F f8;
        this.f19982r = f7;
        this.f19983s = dVar;
        f8 = AbstractC2041k.f19986a;
        this.f19984t = f8;
        this.f19985u = J.b(getContext());
    }

    @Override // p6.U
    public void b(Object obj, Throwable th) {
        if (obj instanceof p6.A) {
            ((p6.A) obj).f18483b.invoke(th);
        }
    }

    @Override // Z5.e
    public Z5.e getCallerFrame() {
        X5.d dVar = this.f19983s;
        if (dVar instanceof Z5.e) {
            return (Z5.e) dVar;
        }
        return null;
    }

    @Override // X5.d
    public X5.g getContext() {
        return this.f19983s.getContext();
    }

    @Override // p6.U
    public Object i() {
        F f7;
        Object obj = this.f19984t;
        f7 = AbstractC2041k.f19986a;
        this.f19984t = f7;
        return obj;
    }

    public final void k() {
        while (f19981v.get(this) == AbstractC2041k.f19987b) {
        }
    }

    public final C1860m l() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f19981v;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                f19981v.set(this, AbstractC2041k.f19987b);
                return null;
            }
            if (obj instanceof C1860m) {
                if (AbstractC1997b.a(f19981v, this, obj, AbstractC2041k.f19987b)) {
                    return (C1860m) obj;
                }
            } else if (obj != AbstractC2041k.f19987b && !(obj instanceof Throwable)) {
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        }
    }

    public final C1860m m() {
        Object obj = f19981v.get(this);
        if (obj instanceof C1860m) {
            return (C1860m) obj;
        }
        return null;
    }

    public final boolean n() {
        return f19981v.get(this) != null;
    }

    public final boolean q(Throwable th) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f19981v;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            F f7 = AbstractC2041k.f19987b;
            if (Intrinsics.a(obj, f7)) {
                if (AbstractC1997b.a(f19981v, this, f7, th)) {
                    return true;
                }
            } else {
                if (obj instanceof Throwable) {
                    return true;
                }
                if (AbstractC1997b.a(f19981v, this, obj, null)) {
                    return false;
                }
            }
        }
    }

    public final void r() {
        k();
        C1860m m7 = m();
        if (m7 != null) {
            m7.r();
        }
    }

    @Override // X5.d
    public void resumeWith(Object obj) {
        X5.g context = this.f19983s.getContext();
        Object d7 = p6.D.d(obj, null, 1, null);
        if (this.f19982r.F(context)) {
            this.f19984t = d7;
            this.f18512q = 0;
            this.f19982r.E(context, this);
            return;
        }
        AbstractC1837a0 b7 = L0.f18501a.b();
        if (b7.O()) {
            this.f19984t = d7;
            this.f18512q = 0;
            b7.K(this);
            return;
        }
        b7.M(true);
        try {
            X5.g context2 = getContext();
            Object c7 = J.c(context2, this.f19985u);
            try {
                this.f19983s.resumeWith(obj);
                V5.t tVar = V5.t.f6803a;
                while (b7.R()) {
                }
            } finally {
                J.a(context2, c7);
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    public final Throwable s(InterfaceC1858l interfaceC1858l) {
        F f7;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f19981v;
        do {
            Object obj = atomicReferenceFieldUpdater.get(this);
            f7 = AbstractC2041k.f19987b;
            if (obj != f7) {
                if (obj instanceof Throwable) {
                    if (AbstractC1997b.a(f19981v, this, obj, null)) {
                        return (Throwable) obj;
                    }
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        } while (!AbstractC1997b.a(f19981v, this, f7, interfaceC1858l));
        return null;
    }

    public String toString() {
        return "DispatchedContinuation[" + this.f19982r + ", " + p6.M.c(this.f19983s) + ']';
    }

    @Override // p6.U
    public X5.d c() {
        return this;
    }
}
