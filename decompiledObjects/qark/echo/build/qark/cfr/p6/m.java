/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.lang.UnsupportedOperationException
 *  java.lang.Void
 *  java.util.concurrent.CancellationException
 *  java.util.concurrent.atomic.AtomicIntegerFieldUpdater
 *  java.util.concurrent.atomic.AtomicReferenceFieldUpdater
 */
package p6;

import V5.e;
import X5.g;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.Intrinsics;
import p6.C;
import p6.D;
import p6.D0;
import p6.E0;
import p6.H;
import p6.M;
import p6.P0;
import p6.U;
import p6.V;
import p6.X;
import p6.d;
import p6.j;
import p6.l;
import p6.n;
import p6.n0;
import p6.p;
import p6.q;
import p6.q0;
import p6.y;
import p6.z;
import u.b;
import u6.F;

public class m
extends U
implements l,
Z5.e,
P0 {
    public static final AtomicIntegerFieldUpdater t = AtomicIntegerFieldUpdater.newUpdater(m.class, (String)"_decisionAndIndex");
    public static final AtomicReferenceFieldUpdater u = AtomicReferenceFieldUpdater.newUpdater(m.class, Object.class, (String)"_state");
    public static final AtomicReferenceFieldUpdater v = AtomicReferenceFieldUpdater.newUpdater(m.class, Object.class, (String)"_parentHandle");
    private volatile int _decisionAndIndex;
    private volatile Object _parentHandle;
    private volatile Object _state;
    public final X5.d r;
    public final g s;

    public m(X5.d d8, int n8) {
        super(n8);
        this.r = d8;
        this.s = d8.getContext();
        this._decisionAndIndex = 536870911;
        this._state = d.o;
    }

    private final boolean D() {
        if (V.c(this.q)) {
            X5.d d8 = this.r;
            Intrinsics.c(d8, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
            if (((u6.j)d8).n()) {
                return true;
            }
        }
        return false;
    }

    public static /* synthetic */ void L(m m8, Object object, int n8, g6.l l8, int n9, Object object2) {
        if (object2 == null) {
            if ((n9 & 4) != 0) {
                l8 = null;
            }
            m8.K(object, n8, l8);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: resumeImpl");
    }

    public final X A() {
        Object object = (q0)this.getContext().b(q0.n);
        if (object == null) {
            return null;
        }
        object = q0.a.d((q0)object, true, false, new q(this), 2, null);
        b.a(v, this, null, object);
        return object;
    }

    public final void B(Object object) {
        Object object2 = u;
        do {
            Object object3;
            y y8;
            if ((object3 = object2.get((Object)this)) instanceof d) {
                if (!b.a(u, this, object3, object)) continue;
                return;
            }
            if (object3 instanceof j || object3 instanceof u6.C) {
                this.F(object, object3);
                continue;
            }
            boolean bl = object3 instanceof z;
            if (bl) {
                object2 = (z)object3;
                if (!object2.b()) {
                    this.F(object, object3);
                }
                if (object3 instanceof p) {
                    object3 = null;
                    if (!bl) {
                        object2 = null;
                    }
                    if (object2 != null) {
                        object3 = object2.a;
                    }
                    if (object instanceof j) {
                        this.l((j)object, (Throwable)object3);
                        return;
                    }
                    Intrinsics.c(object, "null cannot be cast to non-null type kotlinx.coroutines.internal.Segment<*>");
                    this.n((u6.C)object, (Throwable)object3);
                }
                return;
            }
            if (object3 instanceof y) {
                y8 = (y)object3;
                if (y8.b != null) {
                    this.F(object, object3);
                }
                if (object instanceof u6.C) {
                    return;
                }
                Intrinsics.c(object, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
                j j8 = (j)object;
                if (y8.c()) {
                    this.l(j8, y8.e);
                    return;
                }
                if (!b.a(u, this, object3, y8 = y.b(y8, null, j8, null, null, null, 29, null))) continue;
                return;
            }
            if (object instanceof u6.C) {
                return;
            }
            Intrinsics.c(object, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
            y8 = new y(object3, (j)object, null, null, null, 28, null);
            if (b.a(u, this, object3, y8)) break;
        } while (true);
    }

    public boolean C() {
        return this.x() instanceof E0 ^ true;
    }

    public final j E(g6.l l8) {
        if (l8 instanceof j) {
            return (j)l8;
        }
        return new n0(l8);
    }

    public final void F(Object object, Object object2) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("It's prohibited to register multiple handlers, tried to register ");
        stringBuilder.append(object);
        stringBuilder.append(", already has ");
        stringBuilder.append(object2);
        throw new IllegalStateException(stringBuilder.toString().toString());
    }

    public String G() {
        return "CancellableContinuation";
    }

    public final void H(Throwable throwable) {
        if (this.q(throwable)) {
            return;
        }
        this.o(throwable);
        this.s();
    }

    public final void I() {
        X5.d d8 = this.r;
        d8 = d8 instanceof u6.j ? (u6.j)d8 : null;
        if (d8 != null) {
            if ((d8 = d8.s(this)) == null) {
                return;
            }
            this.r();
            this.o((Throwable)d8);
        }
    }

    public final boolean J() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = u;
        Object object = atomicReferenceFieldUpdater.get((Object)this);
        if (object instanceof y && ((y)object).d != null) {
            this.r();
            return false;
        }
        t.set((Object)this, 536870911);
        atomicReferenceFieldUpdater.set((Object)this, (Object)d.o);
        return true;
    }

    public final void K(Object object, int n8, g6.l l8) {
        Object object2;
        Object object3 = u;
        while ((object2 = object3.get((Object)this)) instanceof E0) {
            Object object4 = this.M((E0)object2, object, n8, l8, null);
            if (!b.a(u, this, object2, object4)) continue;
            this.s();
            this.t(n8);
            return;
        }
        if (object2 instanceof p && (object3 = (p)object2).c()) {
            if (l8 != null) {
                this.m(l8, object3.a);
            }
            return;
        }
        this.k(object);
        throw new e();
    }

    public final Object M(E0 e02, Object object, int n8, g6.l l8, Object object2) {
        Object object3;
        block6 : {
            block5 : {
                if (object instanceof z) {
                    return object;
                }
                if (!V.b(n8) && object2 == null) {
                    return object;
                }
                if (l8 != null || e02 instanceof j) break block5;
                object3 = object;
                if (object2 == null) break block6;
            }
            e02 = e02 instanceof j ? (j)e02 : null;
            object3 = new y(object, (j)e02, l8, object2, null, 16, null);
        }
        return object3;
    }

    public final boolean N() {
        int n8;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = t;
        do {
            int n9;
            if ((n9 = (n8 = atomicIntegerFieldUpdater.get((Object)this)) >> 29) == 0) continue;
            if (n9 == 1) {
                return false;
            }
            throw new IllegalStateException("Already resumed".toString());
        } while (!t.compareAndSet((Object)this, n8, 1073741824 + (536870911 & n8)));
        return true;
    }

    public final F O(Object object, Object object2, g6.l l8) {
        Object object3;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = u;
        while ((object3 = atomicReferenceFieldUpdater.get((Object)this)) instanceof E0) {
            Object object4 = this.M((E0)object3, object, this.q, l8, object2);
            if (!b.a(u, this, object3, object4)) continue;
            this.s();
            return n.a;
        }
        boolean bl = object3 instanceof y;
        l8 = null;
        object = l8;
        if (bl) {
            object = l8;
            if (object2 != null) {
                object = l8;
                if (((y)object3).d == object2) {
                    object = n.a;
                }
            }
        }
        return object;
    }

    public final boolean P() {
        int n8;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = t;
        do {
            int n9;
            if ((n9 = (n8 = atomicIntegerFieldUpdater.get((Object)this)) >> 29) == 0) continue;
            if (n9 == 2) {
                return false;
            }
            throw new IllegalStateException("Already suspended".toString());
        } while (!t.compareAndSet((Object)this, n8, 536870912 + (536870911 & n8)));
        return true;
    }

    @Override
    public void a(u6.C c8, int n8) {
        int n9;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = t;
        while (((n9 = atomicIntegerFieldUpdater.get((Object)this)) & 536870911) == 536870911) {
            if (!atomicIntegerFieldUpdater.compareAndSet((Object)this, n9, (n9 >> 29 << 29) + n8)) continue;
            this.B(c8);
            return;
        }
        throw new IllegalStateException("invokeOnCancellation should be called at most once".toString());
    }

    @Override
    public void b(Object object, Throwable throwable) {
        Object object2;
        object = u;
        while (!((object2 = object.get((Object)this)) instanceof E0)) {
            if (object2 instanceof z) {
                return;
            }
            if (object2 instanceof y) {
                y y8 = (y)object2;
                if (y8.c() ^ true) {
                    y y9 = y.b(y8, null, null, null, null, throwable, 15, null);
                    if (!b.a(u, this, object2, y9)) continue;
                    y8.d(this, throwable);
                    return;
                }
                throw new IllegalStateException("Must be called at most once".toString());
            }
            if (!b.a(u, this, object2, new y(object2, null, null, null, throwable, 14, null))) continue;
            return;
        }
        throw new IllegalStateException("Not completed".toString());
    }

    @Override
    public final X5.d c() {
        return this.r;
    }

    @Override
    public void d(g6.l l8) {
        this.B(this.E(l8));
    }

    @Override
    public Throwable e(Object object) {
        if ((object = super.e(object)) != null) {
            return object;
        }
        return null;
    }

    @Override
    public Object f(Object object) {
        Object object2 = object;
        if (object instanceof y) {
            object2 = ((y)object).a;
        }
        return object2;
    }

    @Override
    public Object g(Object object, Object object2, g6.l l8) {
        return this.O(object, object2, l8);
    }

    @Override
    public Z5.e getCallerFrame() {
        X5.d d8 = this.r;
        if (d8 instanceof Z5.e) {
            return (Z5.e)((Object)d8);
        }
        return null;
    }

    @Override
    public g getContext() {
        return this.s;
    }

    @Override
    public Object i() {
        return this.x();
    }

    @Override
    public void j(Object object, g6.l l8) {
        this.K(object, this.q, l8);
    }

    public final Void k(Object object) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Already resumed, but proposed with update ");
        stringBuilder.append(object);
        throw new IllegalStateException(stringBuilder.toString().toString());
    }

    public final void l(j j8, Throwable object) {
        try {
            j8.a((Throwable)object);
            return;
        }
        catch (Throwable throwable) {
            object = this.getContext();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Exception in invokeOnCancellation handler for ");
            stringBuilder.append((Object)this);
            H.a((g)object, (Throwable)new C(stringBuilder.toString(), throwable));
            return;
        }
    }

    public final void m(g6.l l8, Throwable object) {
        try {
            l8.invoke(object);
            return;
        }
        catch (Throwable throwable) {
            object = this.getContext();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Exception in resume onCancellation handler for ");
            stringBuilder.append((Object)this);
            H.a((g)object, (Throwable)new C(stringBuilder.toString(), throwable));
            return;
        }
    }

    public final void n(u6.C c8, Throwable object) {
        int n8 = t.get((Object)this) & 536870911;
        if (n8 != 536870911) {
            try {
                c8.o(n8, (Throwable)object, this.getContext());
                return;
            }
            catch (Throwable throwable) {
                object = this.getContext();
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Exception in invokeOnCancellation handler for ");
                stringBuilder.append((Object)this);
                H.a((g)object, (Throwable)new C(stringBuilder.toString(), throwable));
                return;
            }
        }
        throw new IllegalStateException("The index for Segment.onCancellation(..) is broken".toString());
    }

    @Override
    public boolean o(Throwable throwable) {
        Object object;
        p p8;
        boolean bl;
        Object object2 = u;
        do {
            object = object2.get((Object)this);
            boolean bl2 = object instanceof E0;
            bl = false;
            if (!bl2) {
                return false;
            }
            if (!(object instanceof j) && !(object instanceof u6.C)) continue;
            bl = true;
        } while (!b.a(u, this, object, p8 = new p(this, throwable, bl)));
        object2 = (E0)object;
        if (object2 instanceof j) {
            this.l((j)object, throwable);
        } else if (object2 instanceof u6.C) {
            this.n((u6.C)object, throwable);
        }
        this.s();
        this.t(this.q);
        return true;
    }

    @Override
    public void p(Object object) {
        this.t(this.q);
    }

    public final boolean q(Throwable throwable) {
        if (!this.D()) {
            return false;
        }
        X5.d d8 = this.r;
        Intrinsics.c(d8, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
        return ((u6.j)d8).q(throwable);
    }

    public final void r() {
        X x8 = this.v();
        if (x8 == null) {
            return;
        }
        x8.b();
        v.set((Object)this, (Object)D0.o);
    }

    @Override
    public void resumeWith(Object object) {
        m.L(this, D.c(object, this), this.q, null, 4, null);
    }

    public final void s() {
        if (!this.D()) {
            this.r();
        }
    }

    public final void t(int n8) {
        if (this.N()) {
            return;
        }
        V.a(this, n8);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.G());
        stringBuilder.append('(');
        stringBuilder.append(M.c(this.r));
        stringBuilder.append("){");
        stringBuilder.append(this.y());
        stringBuilder.append("}@");
        stringBuilder.append(M.b(this));
        return stringBuilder.toString();
    }

    public Throwable u(q0 q02) {
        return q02.s();
    }

    public final X v() {
        return (X)v.get((Object)this);
    }

    public final Object w() {
        Object object;
        boolean bl = this.D();
        if (this.P()) {
            if (this.v() == null) {
                this.A();
            }
            if (bl) {
                this.I();
            }
            return Y5.b.c();
        }
        if (bl) {
            this.I();
        }
        if (!((object = this.x()) instanceof z)) {
            q0 q02;
            if (V.b(this.q) && (q02 = (q0)this.getContext().b(q0.n)) != null && !q02.a()) {
                q02 = q02.s();
                this.b(object, (Throwable)q02);
                throw q02;
            }
            return this.f(object);
        }
        throw ((z)object).a;
    }

    public final Object x() {
        return u.get((Object)this);
    }

    public final String y() {
        Object object = this.x();
        if (object instanceof E0) {
            return "Active";
        }
        if (object instanceof p) {
            return "Cancelled";
        }
        return "Completed";
    }

    public void z() {
        X x8 = this.A();
        if (x8 == null) {
            return;
        }
        if (this.C()) {
            x8.b();
            v.set((Object)this, (Object)D0.o);
        }
    }
}

