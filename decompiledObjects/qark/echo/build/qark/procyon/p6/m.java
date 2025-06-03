// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package p6;

import java.util.concurrent.CancellationException;
import u6.F;
import u6.C;
import u.b;
import u6.j;
import kotlin.jvm.internal.Intrinsics;
import X5.g;
import X5.d;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import Z5.e;

public class m extends U implements l, e, P0
{
    public static final AtomicIntegerFieldUpdater t;
    public static final AtomicReferenceFieldUpdater u;
    public static final AtomicReferenceFieldUpdater v;
    private volatile int _decisionAndIndex;
    private volatile Object _parentHandle;
    private volatile Object _state;
    public final d r;
    public final g s;
    
    static {
        t = AtomicIntegerFieldUpdater.newUpdater(m.class, "_decisionAndIndex");
        u = AtomicReferenceFieldUpdater.newUpdater(m.class, Object.class, "_state");
        v = AtomicReferenceFieldUpdater.newUpdater(m.class, Object.class, "_parentHandle");
    }
    
    public m(final d r, final int n) {
        super(n);
        this.r = r;
        this.s = r.getContext();
        this._decisionAndIndex = 536870911;
        this._state = p6.d.o;
    }
    
    private final boolean D() {
        if (V.c(super.q)) {
            final d r = this.r;
            Intrinsics.c(r, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
            if (((j)r).n()) {
                return true;
            }
        }
        return false;
    }
    
    public static /* synthetic */ void L(final m m, final Object o, final int n, g6.l l, final int n2, final Object o2) {
        if (o2 == null) {
            if ((n2 & 0x4) != 0x0) {
                l = null;
            }
            m.K(o, n, l);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: resumeImpl");
    }
    
    public final X A() {
        final q0 q0 = (q0)this.getContext().b((g.c)p6.q0.n);
        if (q0 == null) {
            return null;
        }
        final X d = p6.q0.a.d(q0, true, false, new q(this), 2, null);
        b.a(m.v, this, null, d);
        return d;
    }
    
    public final void B(final Object o) {
        final AtomicReferenceFieldUpdater u = m.u;
        while (true) {
            final z value = u.get(this);
            if (value instanceof p6.d) {
                if (b.a(m.u, this, value, o)) {
                    return;
                }
                continue;
            }
            else {
                if (!(value instanceof p6.j)) {
                    if (!(value instanceof C)) {
                        final boolean b = value instanceof z;
                        if (b) {
                            z z = value;
                            if (!z.b()) {
                                this.F(o, value);
                            }
                            if (value instanceof p) {
                                Throwable a = null;
                                if (!b) {
                                    z = null;
                                }
                                if (z != null) {
                                    a = z.a;
                                }
                                if (o instanceof p6.j) {
                                    this.l((p6.j)o, a);
                                    return;
                                }
                                Intrinsics.c(o, "null cannot be cast to non-null type kotlinx.coroutines.internal.Segment<*>");
                                this.n((C)o, a);
                            }
                            return;
                        }
                        if (value instanceof y) {
                            final y y = (y)value;
                            if (y.b != null) {
                                this.F(o, value);
                            }
                            if (o instanceof C) {
                                return;
                            }
                            Intrinsics.c(o, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
                            final p6.j j = (p6.j)o;
                            if (y.c()) {
                                this.l(j, y.e);
                                return;
                            }
                            if (u.b.a(m.u, this, value, p6.y.b(y, null, j, null, null, null, 29, null))) {
                                return;
                            }
                            continue;
                        }
                        else {
                            if (o instanceof C) {
                                return;
                            }
                            Intrinsics.c(o, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
                            if (u.b.a(m.u, this, value, new y(value, (p6.j)o, null, null, null, 28, null))) {
                                return;
                            }
                            continue;
                        }
                    }
                }
                this.F(o, value);
            }
        }
    }
    
    public boolean C() {
        return this.x() instanceof E0 ^ true;
    }
    
    public final p6.j E(final g6.l l) {
        if (l instanceof p6.j) {
            return (p6.j)l;
        }
        return new n0(l);
    }
    
    public final void F(final Object obj, final Object obj2) {
        final StringBuilder sb = new StringBuilder();
        sb.append("It's prohibited to register multiple handlers, tried to register ");
        sb.append(obj);
        sb.append(", already has ");
        sb.append(obj2);
        throw new IllegalStateException(sb.toString().toString());
    }
    
    public String G() {
        return "CancellableContinuation";
    }
    
    public final void H(final Throwable t) {
        if (this.q(t)) {
            return;
        }
        this.o(t);
        this.s();
    }
    
    public final void I() {
        final d r = this.r;
        j j;
        if (r instanceof j) {
            j = (j)r;
        }
        else {
            j = null;
        }
        if (j != null) {
            final Throwable s = j.s(this);
            if (s == null) {
                return;
            }
            this.r();
            this.o(s);
        }
    }
    
    public final boolean J() {
        final AtomicReferenceFieldUpdater u = m.u;
        final y value = u.get(this);
        if (value instanceof y && value.d != null) {
            this.r();
            return false;
        }
        m.t.set(this, 536870911);
        u.set(this, p6.d.o);
        return true;
    }
    
    public final void K(final Object o, final int n, final g6.l l) {
        final AtomicReferenceFieldUpdater u = m.u;
        E0 value;
        do {
            value = u.get(this);
            if (value instanceof E0) {
                continue;
            }
            if (value instanceof p) {
                final p p3 = (p)value;
                if (p3.c()) {
                    if (l != null) {
                        this.m(l, p3.a);
                    }
                    return;
                }
            }
            this.k(o);
            throw new V5.e();
        } while (!b.a(m.u, this, value, this.M(value, o, n, l, null)));
        this.s();
        this.t(n);
    }
    
    public final Object M(final E0 e0, final Object o, final int n, final g6.l l, final Object o2) {
        if (o instanceof z) {
            return o;
        }
        if (!V.b(n) && o2 == null) {
            return o;
        }
        if (l == null && !(e0 instanceof p6.j)) {
            final Object o3 = o;
            if (o2 == null) {
                return o3;
            }
        }
        p6.j j;
        if (e0 instanceof p6.j) {
            j = (p6.j)e0;
        }
        else {
            j = null;
        }
        return new y(o, j, l, o2, null, 16, null);
    }
    
    public final boolean N() {
        final AtomicIntegerFieldUpdater t = m.t;
        int value;
        do {
            value = t.get(this);
            final int n = value >> 29;
            if (n != 0) {
                if (n == 1) {
                    return false;
                }
                throw new IllegalStateException("Already resumed".toString());
            }
        } while (!m.t.compareAndSet(this, value, 1073741824 + (0x1FFFFFFF & value)));
        return true;
    }
    
    public final F O(final Object o, final Object o2, final g6.l l) {
        final AtomicReferenceFieldUpdater u = m.u;
        E0 value;
        do {
            value = u.get(this);
            if (value instanceof E0) {
                continue;
            }
            final boolean b = value instanceof y;
            F a;
            final F f = a = null;
            if (b) {
                a = f;
                if (o2 != null) {
                    a = f;
                    if (((y)value).d == o2) {
                        a = n.a;
                    }
                }
            }
            return a;
        } while (!b.a(m.u, this, value, this.M(value, o, super.q, l, o2)));
        this.s();
        return n.a;
    }
    
    public final boolean P() {
        final AtomicIntegerFieldUpdater t = m.t;
        int value;
        do {
            value = t.get(this);
            final int n = value >> 29;
            if (n != 0) {
                if (n == 2) {
                    return false;
                }
                throw new IllegalStateException("Already suspended".toString());
            }
        } while (!m.t.compareAndSet(this, value, 536870912 + (0x1FFFFFFF & value)));
        return true;
    }
    
    @Override
    public void a(final C c, final int n) {
        final AtomicIntegerFieldUpdater t = m.t;
        int value;
        do {
            value = t.get(this);
            if ((value & 0x1FFFFFFF) == 0x1FFFFFFF) {
                continue;
            }
            throw new IllegalStateException("invokeOnCancellation should be called at most once".toString());
        } while (!t.compareAndSet(this, value, (value >> 29 << 29) + n));
        this.B(c);
    }
    
    @Override
    public void b(final Object o, final Throwable t) {
        final AtomicReferenceFieldUpdater u = m.u;
        while (true) {
            final y value = u.get(this);
            if (value instanceof E0) {
                throw new IllegalStateException("Not completed".toString());
            }
            if (value instanceof z) {
                return;
            }
            if (value instanceof y) {
                final y y = value;
                if (!(y.c() ^ true)) {
                    throw new IllegalStateException("Must be called at most once".toString());
                }
                if (b.a(m.u, this, value, p6.y.b(y, null, null, null, null, t, 15, null))) {
                    y.d(this, t);
                    return;
                }
                continue;
            }
            else {
                if (b.a(m.u, this, value, new y(value, null, null, null, t, 14, null))) {
                    return;
                }
                continue;
            }
        }
    }
    
    @Override
    public final d c() {
        return this.r;
    }
    
    @Override
    public void d(final g6.l l) {
        this.B(this.E(l));
    }
    
    @Override
    public Throwable e(final Object o) {
        final Throwable e = super.e(o);
        if (e != null) {
            return e;
        }
        return null;
    }
    
    @Override
    public Object f(final Object o) {
        Object a = o;
        if (o instanceof y) {
            a = ((y)o).a;
        }
        return a;
    }
    
    @Override
    public Object g(final Object o, final Object o2, final g6.l l) {
        return this.O(o, o2, l);
    }
    
    @Override
    public e getCallerFrame() {
        final d r = this.r;
        if (r instanceof e) {
            return (e)r;
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
    public void j(final Object o, final g6.l l) {
        this.K(o, super.q, l);
    }
    
    public final Void k(final Object obj) {
        final StringBuilder sb = new StringBuilder();
        sb.append("Already resumed, but proposed with update ");
        sb.append(obj);
        throw new IllegalStateException(sb.toString().toString());
    }
    
    public final void l(final p6.j j, final Throwable t) {
        try {
            j.a(t);
        }
        finally {
            final g context = this.getContext();
            final StringBuilder sb = new StringBuilder();
            sb.append("Exception in invokeOnCancellation handler for ");
            sb.append(this);
            final Throwable t2;
            H.a(context, new p6.C(sb.toString(), t2));
        }
    }
    
    public final void m(final g6.l l, final Throwable t) {
        try {
            l.invoke(t);
        }
        finally {
            final g context = this.getContext();
            final StringBuilder sb = new StringBuilder();
            sb.append("Exception in resume onCancellation handler for ");
            sb.append(this);
            final Throwable t2;
            H.a(context, new p6.C(sb.toString(), t2));
        }
    }
    
    public final void n(final C c, final Throwable t) {
        final int n = m.t.get(this) & 0x1FFFFFFF;
        if (n != 536870911) {
            try {
                c.o(n, t, this.getContext());
                return;
            }
            finally {
                final g context = this.getContext();
                final StringBuilder sb = new StringBuilder();
                sb.append("Exception in invokeOnCancellation handler for ");
                sb.append(this);
                final Throwable t2;
                H.a(context, new p6.C(sb.toString(), t2));
                return;
            }
        }
        throw new IllegalStateException("The index for Segment.onCancellation(..) is broken".toString());
    }
    
    @Override
    public boolean o(final Throwable t) {
        final AtomicReferenceFieldUpdater u = m.u;
        p6.j value;
        boolean b;
        do {
            value = u.get(this);
            final boolean b2 = value instanceof E0;
            b = false;
            if (!b2) {
                return false;
            }
            if (!(value instanceof p6.j) && !(value instanceof C)) {
                continue;
            }
            b = true;
        } while (!u.b.a(m.u, this, value, new p(this, t, b)));
        final p6.j j = value;
        if (j instanceof p6.j) {
            this.l(value, t);
        }
        else if (j instanceof C) {
            this.n((C)value, t);
        }
        this.s();
        this.t(super.q);
        return true;
    }
    
    @Override
    public void p(final Object o) {
        this.t(super.q);
    }
    
    public final boolean q(final Throwable t) {
        if (!this.D()) {
            return false;
        }
        final d r = this.r;
        Intrinsics.c(r, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
        return ((j)r).q(t);
    }
    
    public final void r() {
        final X v = this.v();
        if (v == null) {
            return;
        }
        v.b();
        m.v.set(this, D0.o);
    }
    
    @Override
    public void resumeWith(final Object o) {
        L(this, D.c(o, this), super.q, null, 4, null);
    }
    
    public final void s() {
        if (!this.D()) {
            this.r();
        }
    }
    
    public final void t(final int n) {
        if (this.N()) {
            return;
        }
        V.a(this, n);
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(this.G());
        sb.append('(');
        sb.append(M.c(this.r));
        sb.append("){");
        sb.append(this.y());
        sb.append("}@");
        sb.append(M.b(this));
        return sb.toString();
    }
    
    public Throwable u(final q0 q0) {
        return q0.s();
    }
    
    public final X v() {
        return m.v.get(this);
    }
    
    public final Object w() {
        final boolean d = this.D();
        if (this.P()) {
            if (this.v() == null) {
                this.A();
            }
            if (d) {
                this.I();
            }
            return Y5.b.c();
        }
        if (d) {
            this.I();
        }
        final Object x = this.x();
        if (!(x instanceof z)) {
            if (V.b(super.q)) {
                final q0 q0 = (q0)this.getContext().b((g.c)p6.q0.n);
                if (q0 != null) {
                    if (!q0.a()) {
                        final CancellationException s = q0.s();
                        this.b(x, s);
                        throw s;
                    }
                }
            }
            return this.f(x);
        }
        throw ((z)x).a;
    }
    
    public final Object x() {
        return m.u.get(this);
    }
    
    public final String y() {
        final Object x = this.x();
        if (x instanceof E0) {
            return "Active";
        }
        if (x instanceof p) {
            return "Cancelled";
        }
        return "Completed";
    }
    
    public void z() {
        final X a = this.A();
        if (a == null) {
            return;
        }
        if (this.C()) {
            a.b();
            m.v.set(this, D0.o);
        }
    }
}
