package p6;

import X5.g;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.Intrinsics;
import p6.InterfaceC1869q0;
import u.AbstractC1997b;
import u6.q;

/* loaded from: classes.dex */
public class x0 implements InterfaceC1869q0, InterfaceC1871t, F0 {

    /* renamed from: o, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f18556o = AtomicReferenceFieldUpdater.newUpdater(x0.class, Object.class, "_state");

    /* renamed from: p, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f18557p = AtomicReferenceFieldUpdater.newUpdater(x0.class, Object.class, "_parentHandle");
    private volatile Object _parentHandle;
    private volatile Object _state;

    public static final class a extends C1860m {

        /* renamed from: w, reason: collision with root package name */
        public final x0 f18558w;

        public a(X5.d dVar, x0 x0Var) {
            super(dVar, 1);
            this.f18558w = x0Var;
        }

        @Override // p6.C1860m
        public String G() {
            return "AwaitContinuation";
        }

        @Override // p6.C1860m
        public Throwable u(InterfaceC1869q0 interfaceC1869q0) {
            Throwable e7;
            Object b02 = this.f18558w.b0();
            return (!(b02 instanceof c) || (e7 = ((c) b02).e()) == null) ? b02 instanceof C1877z ? ((C1877z) b02).f18582a : interfaceC1869q0.s() : e7;
        }
    }

    public static final class b extends w0 {

        /* renamed from: s, reason: collision with root package name */
        public final x0 f18559s;

        /* renamed from: t, reason: collision with root package name */
        public final c f18560t;

        /* renamed from: u, reason: collision with root package name */
        public final C1870s f18561u;

        /* renamed from: v, reason: collision with root package name */
        public final Object f18562v;

        public b(x0 x0Var, c cVar, C1870s c1870s, Object obj) {
            this.f18559s = x0Var;
            this.f18560t = cVar;
            this.f18561u = c1870s;
            this.f18562v = obj;
        }

        @Override // g6.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            v((Throwable) obj);
            return V5.t.f6803a;
        }

        @Override // p6.B
        public void v(Throwable th) {
            this.f18559s.Q(this.f18560t, this.f18561u, this.f18562v);
        }
    }

    public static final class c implements InterfaceC1859l0 {

        /* renamed from: p, reason: collision with root package name */
        public static final AtomicIntegerFieldUpdater f18563p = AtomicIntegerFieldUpdater.newUpdater(c.class, "_isCompleting");

        /* renamed from: q, reason: collision with root package name */
        public static final AtomicReferenceFieldUpdater f18564q = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "_rootCause");

        /* renamed from: r, reason: collision with root package name */
        public static final AtomicReferenceFieldUpdater f18565r = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "_exceptionsHolder");
        private volatile Object _exceptionsHolder;
        private volatile int _isCompleting;
        private volatile Object _rootCause;

        /* renamed from: o, reason: collision with root package name */
        public final C0 f18566o;

        public c(C0 c02, boolean z7, Throwable th) {
            this.f18566o = c02;
            this._isCompleting = z7 ? 1 : 0;
            this._rootCause = th;
        }

        @Override // p6.InterfaceC1859l0
        public boolean a() {
            return e() == null;
        }

        public final void b(Throwable th) {
            Throwable e7 = e();
            if (e7 == null) {
                m(th);
                return;
            }
            if (th == e7) {
                return;
            }
            Object d7 = d();
            if (d7 == null) {
                l(th);
                return;
            }
            if (d7 instanceof Throwable) {
                if (th == d7) {
                    return;
                }
                ArrayList c7 = c();
                c7.add(d7);
                c7.add(th);
                l(c7);
                return;
            }
            if (d7 instanceof ArrayList) {
                ((ArrayList) d7).add(th);
                return;
            }
            throw new IllegalStateException(("State is " + d7).toString());
        }

        public final ArrayList c() {
            return new ArrayList(4);
        }

        public final Object d() {
            return f18565r.get(this);
        }

        public final Throwable e() {
            return (Throwable) f18564q.get(this);
        }

        public final boolean f() {
            return e() != null;
        }

        @Override // p6.InterfaceC1859l0
        public C0 g() {
            return this.f18566o;
        }

        public final boolean h() {
            return f18563p.get(this) != 0;
        }

        public final boolean i() {
            u6.F f7;
            Object d7 = d();
            f7 = y0.f18578e;
            return d7 == f7;
        }

        public final List j(Throwable th) {
            ArrayList arrayList;
            u6.F f7;
            Object d7 = d();
            if (d7 == null) {
                arrayList = c();
            } else if (d7 instanceof Throwable) {
                ArrayList c7 = c();
                c7.add(d7);
                arrayList = c7;
            } else {
                if (!(d7 instanceof ArrayList)) {
                    throw new IllegalStateException(("State is " + d7).toString());
                }
                arrayList = (ArrayList) d7;
            }
            Throwable e7 = e();
            if (e7 != null) {
                arrayList.add(0, e7);
            }
            if (th != null && !Intrinsics.a(th, e7)) {
                arrayList.add(th);
            }
            f7 = y0.f18578e;
            l(f7);
            return arrayList;
        }

        public final void k(boolean z7) {
            f18563p.set(this, z7 ? 1 : 0);
        }

        public final void l(Object obj) {
            f18565r.set(this, obj);
        }

        public final void m(Throwable th) {
            f18564q.set(this, th);
        }

        public String toString() {
            return "Finishing[cancelling=" + f() + ", completing=" + h() + ", rootCause=" + e() + ", exceptions=" + d() + ", list=" + g() + ']';
        }
    }

    public static final class d extends q.a {

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ x0 f18567d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ Object f18568e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(u6.q qVar, x0 x0Var, Object obj) {
            super(qVar);
            this.f18567d = x0Var;
            this.f18568e = obj;
        }

        @Override // u6.AbstractC2032b
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public Object d(u6.q qVar) {
            if (this.f18567d.b0() == this.f18568e) {
                return null;
            }
            return u6.p.a();
        }
    }

    public x0(boolean z7) {
        this._state = z7 ? y0.f18580g : y0.f18579f;
    }

    public static /* synthetic */ CancellationException z0(x0 x0Var, Throwable th, String str, int i7, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: toCancellationException");
        }
        if ((i7 & 1) != 0) {
            str = null;
        }
        return x0Var.y0(th, str);
    }

    public final boolean A(Object obj, C0 c02, w0 w0Var) {
        int u7;
        d dVar = new d(w0Var, this, obj);
        do {
            u7 = c02.p().u(w0Var, c02, dVar);
            if (u7 == 1) {
                return true;
            }
        } while (u7 != 2);
        return false;
    }

    public final String A0() {
        return l0() + '{' + x0(b0()) + '}';
    }

    public final boolean B0(InterfaceC1859l0 interfaceC1859l0, Object obj) {
        if (!AbstractC1997b.a(f18556o, this, interfaceC1859l0, y0.g(obj))) {
            return false;
        }
        p0(null);
        q0(obj);
        P(interfaceC1859l0, obj);
        return true;
    }

    public final boolean C0(InterfaceC1859l0 interfaceC1859l0, Throwable th) {
        C0 Z6 = Z(interfaceC1859l0);
        if (Z6 == null) {
            return false;
        }
        if (!AbstractC1997b.a(f18556o, this, interfaceC1859l0, new c(Z6, false, th))) {
            return false;
        }
        n0(Z6, th);
        return true;
    }

    public final Object D0(Object obj, Object obj2) {
        u6.F f7;
        u6.F f8;
        if (!(obj instanceof InterfaceC1859l0)) {
            f8 = y0.f18574a;
            return f8;
        }
        if ((!(obj instanceof Z) && !(obj instanceof w0)) || (obj instanceof C1870s) || (obj2 instanceof C1877z)) {
            return E0((InterfaceC1859l0) obj, obj2);
        }
        if (B0((InterfaceC1859l0) obj, obj2)) {
            return obj2;
        }
        f7 = y0.f18576c;
        return f7;
    }

    public final void E(Throwable th, List list) {
        if (list.size() <= 1) {
            return;
        }
        Set newSetFromMap = Collections.newSetFromMap(new IdentityHashMap(list.size()));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Throwable th2 = (Throwable) it.next();
            if (th2 != th && th2 != th && !(th2 instanceof CancellationException) && newSetFromMap.add(th2)) {
                V5.b.a(th, th2);
            }
        }
    }

    public final Object E0(InterfaceC1859l0 interfaceC1859l0, Object obj) {
        u6.F f7;
        u6.F f8;
        u6.F f9;
        C0 Z6 = Z(interfaceC1859l0);
        if (Z6 == null) {
            f9 = y0.f18576c;
            return f9;
        }
        c cVar = interfaceC1859l0 instanceof c ? (c) interfaceC1859l0 : null;
        if (cVar == null) {
            cVar = new c(Z6, false, null);
        }
        kotlin.jvm.internal.u uVar = new kotlin.jvm.internal.u();
        synchronized (cVar) {
            if (cVar.h()) {
                f8 = y0.f18574a;
                return f8;
            }
            cVar.k(true);
            if (cVar != interfaceC1859l0 && !AbstractC1997b.a(f18556o, this, interfaceC1859l0, cVar)) {
                f7 = y0.f18576c;
                return f7;
            }
            boolean f10 = cVar.f();
            C1877z c1877z = obj instanceof C1877z ? (C1877z) obj : null;
            if (c1877z != null) {
                cVar.b(c1877z.f18582a);
            }
            Throwable e7 = true ^ f10 ? cVar.e() : null;
            uVar.f16230o = e7;
            V5.t tVar = V5.t.f6803a;
            if (e7 != null) {
                n0(Z6, e7);
            }
            C1870s T6 = T(interfaceC1859l0);
            return (T6 == null || !F0(cVar, T6, obj)) ? S(cVar, obj) : y0.f18575b;
        }
    }

    public final boolean F0(c cVar, C1870s c1870s, Object obj) {
        while (InterfaceC1869q0.a.d(c1870s.f18553s, false, false, new b(this, cVar, c1870s, obj), 1, null) == D0.f18485o) {
            c1870s = m0(c1870s);
            if (c1870s == null) {
                return false;
            }
        }
        return true;
    }

    public final Object G(X5.d dVar) {
        Object b02;
        do {
            b02 = b0();
            if (!(b02 instanceof InterfaceC1859l0)) {
                if (b02 instanceof C1877z) {
                    throw ((C1877z) b02).f18582a;
                }
                return y0.h(b02);
            }
        } while (w0(b02) < 0);
        return H(dVar);
    }

    public final Object H(X5.d dVar) {
        X5.d b7;
        Object c7;
        b7 = Y5.c.b(dVar);
        a aVar = new a(b7, this);
        aVar.z();
        AbstractC1864o.a(aVar, e(new G0(aVar)));
        Object w7 = aVar.w();
        c7 = Y5.d.c();
        if (w7 == c7) {
            Z5.h.c(dVar);
        }
        return w7;
    }

    public final boolean I(Throwable th) {
        return J(th);
    }

    public final boolean J(Object obj) {
        Object obj2;
        u6.F f7;
        u6.F f8;
        u6.F f9;
        obj2 = y0.f18574a;
        if (Y() && (obj2 = L(obj)) == y0.f18575b) {
            return true;
        }
        f7 = y0.f18574a;
        if (obj2 == f7) {
            obj2 = h0(obj);
        }
        f8 = y0.f18574a;
        if (obj2 == f8 || obj2 == y0.f18575b) {
            return true;
        }
        f9 = y0.f18577d;
        if (obj2 == f9) {
            return false;
        }
        F(obj2);
        return true;
    }

    public void K(Throwable th) {
        J(th);
    }

    public final Object L(Object obj) {
        u6.F f7;
        Object D02;
        u6.F f8;
        do {
            Object b02 = b0();
            if (!(b02 instanceof InterfaceC1859l0) || ((b02 instanceof c) && ((c) b02).h())) {
                f7 = y0.f18574a;
                return f7;
            }
            D02 = D0(b02, new C1877z(R(obj), false, 2, null));
            f8 = y0.f18576c;
        } while (D02 == f8);
        return D02;
    }

    public final boolean M(Throwable th) {
        if (g0()) {
            return true;
        }
        boolean z7 = th instanceof CancellationException;
        r a02 = a0();
        return (a02 == null || a02 == D0.f18485o) ? z7 : a02.d(th) || z7;
    }

    public String N() {
        return "Job was cancelled";
    }

    public boolean O(Throwable th) {
        if (th instanceof CancellationException) {
            return true;
        }
        return J(th) && X();
    }

    public final void P(InterfaceC1859l0 interfaceC1859l0, Object obj) {
        r a02 = a0();
        if (a02 != null) {
            a02.b();
            v0(D0.f18485o);
        }
        C1877z c1877z = obj instanceof C1877z ? (C1877z) obj : null;
        Throwable th = c1877z != null ? c1877z.f18582a : null;
        if (!(interfaceC1859l0 instanceof w0)) {
            C0 g7 = interfaceC1859l0.g();
            if (g7 != null) {
                o0(g7, th);
                return;
            }
            return;
        }
        try {
            ((w0) interfaceC1859l0).v(th);
        } catch (Throwable th2) {
            d0(new C("Exception in completion handler " + interfaceC1859l0 + " for " + this, th2));
        }
    }

    public final void Q(c cVar, C1870s c1870s, Object obj) {
        C1870s m02 = m0(c1870s);
        if (m02 == null || !F0(cVar, m02, obj)) {
            F(S(cVar, obj));
        }
    }

    public final Throwable R(Object obj) {
        if (obj == null || (obj instanceof Throwable)) {
            Throwable th = (Throwable) obj;
            return th == null ? new r0(N(), null, this) : th;
        }
        Intrinsics.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.ParentJob");
        return ((F0) obj).q();
    }

    public final Object S(c cVar, Object obj) {
        boolean f7;
        Throwable W6;
        C1877z c1877z = obj instanceof C1877z ? (C1877z) obj : null;
        Throwable th = c1877z != null ? c1877z.f18582a : null;
        synchronized (cVar) {
            f7 = cVar.f();
            List j7 = cVar.j(th);
            W6 = W(cVar, j7);
            if (W6 != null) {
                E(W6, j7);
            }
        }
        if (W6 != null && W6 != th) {
            obj = new C1877z(W6, false, 2, null);
        }
        if (W6 != null && (M(W6) || c0(W6))) {
            Intrinsics.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
            ((C1877z) obj).b();
        }
        if (!f7) {
            p0(W6);
        }
        q0(obj);
        AbstractC1997b.a(f18556o, this, cVar, y0.g(obj));
        P(cVar, obj);
        return obj;
    }

    public final C1870s T(InterfaceC1859l0 interfaceC1859l0) {
        C1870s c1870s = interfaceC1859l0 instanceof C1870s ? (C1870s) interfaceC1859l0 : null;
        if (c1870s != null) {
            return c1870s;
        }
        C0 g7 = interfaceC1859l0.g();
        if (g7 != null) {
            return m0(g7);
        }
        return null;
    }

    public final Object U() {
        Object b02 = b0();
        if (!(!(b02 instanceof InterfaceC1859l0))) {
            throw new IllegalStateException("This job has not completed yet".toString());
        }
        if (b02 instanceof C1877z) {
            throw ((C1877z) b02).f18582a;
        }
        return y0.h(b02);
    }

    public final Throwable V(Object obj) {
        C1877z c1877z = obj instanceof C1877z ? (C1877z) obj : null;
        if (c1877z != null) {
            return c1877z.f18582a;
        }
        return null;
    }

    public final Throwable W(c cVar, List list) {
        Object obj = null;
        if (list.isEmpty()) {
            if (cVar.f()) {
                return new r0(N(), null, this);
            }
            return null;
        }
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (!(((Throwable) next) instanceof CancellationException)) {
                obj = next;
                break;
            }
        }
        Throwable th = (Throwable) obj;
        return th != null ? th : (Throwable) list.get(0);
    }

    public boolean X() {
        return true;
    }

    public boolean Y() {
        return false;
    }

    public final C0 Z(InterfaceC1859l0 interfaceC1859l0) {
        C0 g7 = interfaceC1859l0.g();
        if (g7 != null) {
            return g7;
        }
        if (interfaceC1859l0 instanceof Z) {
            return new C0();
        }
        if (interfaceC1859l0 instanceof w0) {
            t0((w0) interfaceC1859l0);
            return null;
        }
        throw new IllegalStateException(("State should have list: " + interfaceC1859l0).toString());
    }

    @Override // p6.InterfaceC1869q0
    public boolean a() {
        Object b02 = b0();
        return (b02 instanceof InterfaceC1859l0) && ((InterfaceC1859l0) b02).a();
    }

    public final r a0() {
        return (r) f18557p.get(this);
    }

    @Override // X5.g.b, X5.g
    public g.b b(g.c cVar) {
        return InterfaceC1869q0.a.c(this, cVar);
    }

    public final Object b0() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f18556o;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof u6.y)) {
                return obj;
            }
            ((u6.y) obj).a(this);
        }
    }

    public boolean c0(Throwable th) {
        return false;
    }

    @Override // p6.InterfaceC1869q0
    public final X e(g6.l lVar) {
        return v(false, true, lVar);
    }

    public final void e0(InterfaceC1869q0 interfaceC1869q0) {
        if (interfaceC1869q0 == null) {
            v0(D0.f18485o);
            return;
        }
        interfaceC1869q0.start();
        r r7 = interfaceC1869q0.r(this);
        v0(r7);
        if (f0()) {
            r7.b();
            v0(D0.f18485o);
        }
    }

    public final boolean f0() {
        return !(b0() instanceof InterfaceC1859l0);
    }

    public boolean g0() {
        return false;
    }

    @Override // X5.g.b
    public final g.c getKey() {
        return InterfaceC1869q0.f18550n;
    }

    @Override // p6.InterfaceC1869q0
    public InterfaceC1869q0 getParent() {
        r a02 = a0();
        if (a02 != null) {
            return a02.getParent();
        }
        return null;
    }

    public final Object h0(Object obj) {
        u6.F f7;
        u6.F f8;
        u6.F f9;
        u6.F f10;
        u6.F f11;
        u6.F f12;
        Throwable th = null;
        while (true) {
            Object b02 = b0();
            if (b02 instanceof c) {
                synchronized (b02) {
                    if (((c) b02).i()) {
                        f8 = y0.f18577d;
                        return f8;
                    }
                    boolean f13 = ((c) b02).f();
                    if (obj != null || !f13) {
                        if (th == null) {
                            th = R(obj);
                        }
                        ((c) b02).b(th);
                    }
                    Throwable e7 = f13 ^ true ? ((c) b02).e() : null;
                    if (e7 != null) {
                        n0(((c) b02).g(), e7);
                    }
                    f7 = y0.f18574a;
                    return f7;
                }
            }
            if (!(b02 instanceof InterfaceC1859l0)) {
                f9 = y0.f18577d;
                return f9;
            }
            if (th == null) {
                th = R(obj);
            }
            InterfaceC1859l0 interfaceC1859l0 = (InterfaceC1859l0) b02;
            if (!interfaceC1859l0.a()) {
                Object D02 = D0(b02, new C1877z(th, false, 2, null));
                f11 = y0.f18574a;
                if (D02 == f11) {
                    throw new IllegalStateException(("Cannot happen in " + b02).toString());
                }
                f12 = y0.f18576c;
                if (D02 != f12) {
                    return D02;
                }
            } else if (C0(interfaceC1859l0, th)) {
                f10 = y0.f18574a;
                return f10;
            }
        }
    }

    public final boolean i0(Object obj) {
        Object D02;
        u6.F f7;
        u6.F f8;
        do {
            D02 = D0(b0(), obj);
            f7 = y0.f18574a;
            if (D02 == f7) {
                return false;
            }
            if (D02 == y0.f18575b) {
                return true;
            }
            f8 = y0.f18576c;
        } while (D02 == f8);
        F(D02);
        return true;
    }

    public final Object j0(Object obj) {
        Object D02;
        u6.F f7;
        u6.F f8;
        do {
            D02 = D0(b0(), obj);
            f7 = y0.f18574a;
            if (D02 == f7) {
                throw new IllegalStateException("Job " + this + " is already complete or completing, but is being completed with " + obj, V(obj));
            }
            f8 = y0.f18576c;
        } while (D02 == f8);
        return D02;
    }

    @Override // X5.g
    public X5.g k(X5.g gVar) {
        return InterfaceC1869q0.a.f(this, gVar);
    }

    public final w0 k0(g6.l lVar, boolean z7) {
        w0 w0Var;
        if (z7) {
            w0Var = lVar instanceof s0 ? (s0) lVar : null;
            if (w0Var == null) {
                w0Var = new C1865o0(lVar);
            }
        } else {
            w0Var = lVar instanceof w0 ? (w0) lVar : null;
            if (w0Var == null) {
                w0Var = new C1867p0(lVar);
            }
        }
        w0Var.x(this);
        return w0Var;
    }

    public String l0() {
        return M.a(this);
    }

    public final C1870s m0(u6.q qVar) {
        while (qVar.q()) {
            qVar = qVar.p();
        }
        while (true) {
            qVar = qVar.o();
            if (!qVar.q()) {
                if (qVar instanceof C1870s) {
                    return (C1870s) qVar;
                }
                if (qVar instanceof C0) {
                    return null;
                }
            }
        }
    }

    public final void n0(C0 c02, Throwable th) {
        p0(th);
        Object n7 = c02.n();
        Intrinsics.c(n7, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        C c7 = null;
        for (u6.q qVar = (u6.q) n7; !Intrinsics.a(qVar, c02); qVar = qVar.o()) {
            if (qVar instanceof s0) {
                w0 w0Var = (w0) qVar;
                try {
                    w0Var.v(th);
                } catch (Throwable th2) {
                    if (c7 != null) {
                        V5.b.a(c7, th2);
                    } else {
                        c7 = new C("Exception in completion handler " + w0Var + " for " + this, th2);
                        V5.t tVar = V5.t.f6803a;
                    }
                }
            }
        }
        if (c7 != null) {
            d0(c7);
        }
        M(th);
    }

    public final void o0(C0 c02, Throwable th) {
        Object n7 = c02.n();
        Intrinsics.c(n7, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        C c7 = null;
        for (u6.q qVar = (u6.q) n7; !Intrinsics.a(qVar, c02); qVar = qVar.o()) {
            if (qVar instanceof w0) {
                w0 w0Var = (w0) qVar;
                try {
                    w0Var.v(th);
                } catch (Throwable th2) {
                    if (c7 != null) {
                        V5.b.a(c7, th2);
                    } else {
                        c7 = new C("Exception in completion handler " + w0Var + " for " + this, th2);
                        V5.t tVar = V5.t.f6803a;
                    }
                }
            }
        }
        if (c7 != null) {
            d0(c7);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Throwable] */
    @Override // p6.F0
    public CancellationException q() {
        CancellationException cancellationException;
        Object b02 = b0();
        if (b02 instanceof c) {
            cancellationException = ((c) b02).e();
        } else if (b02 instanceof C1877z) {
            cancellationException = ((C1877z) b02).f18582a;
        } else {
            if (b02 instanceof InterfaceC1859l0) {
                throw new IllegalStateException(("Cannot be cancelling child in this state: " + b02).toString());
            }
            cancellationException = null;
        }
        CancellationException cancellationException2 = cancellationException instanceof CancellationException ? cancellationException : null;
        if (cancellationException2 != null) {
            return cancellationException2;
        }
        return new r0("Parent job is " + x0(b02), cancellationException, this);
    }

    @Override // p6.InterfaceC1869q0
    public final r r(InterfaceC1871t interfaceC1871t) {
        X d7 = InterfaceC1869q0.a.d(this, true, false, new C1870s(interfaceC1871t), 2, null);
        Intrinsics.c(d7, "null cannot be cast to non-null type kotlinx.coroutines.ChildHandle");
        return (r) d7;
    }

    @Override // p6.InterfaceC1869q0
    public final CancellationException s() {
        Object b02 = b0();
        if (!(b02 instanceof c)) {
            if (b02 instanceof InterfaceC1859l0) {
                throw new IllegalStateException(("Job is still new or active: " + this).toString());
            }
            if (b02 instanceof C1877z) {
                return z0(this, ((C1877z) b02).f18582a, null, 1, null);
            }
            return new r0(M.a(this) + " has completed normally", null, this);
        }
        Throwable e7 = ((c) b02).e();
        if (e7 != null) {
            CancellationException y02 = y0(e7, M.a(this) + " is cancelling");
            if (y02 != null) {
                return y02;
            }
        }
        throw new IllegalStateException(("Job is still new or active: " + this).toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [p6.k0] */
    public final void s0(Z z7) {
        C0 c02 = new C0();
        if (!z7.a()) {
            c02 = new C1857k0(c02);
        }
        AbstractC1997b.a(f18556o, this, z7, c02);
    }

    @Override // p6.InterfaceC1869q0
    public final boolean start() {
        int w02;
        do {
            w02 = w0(b0());
            if (w02 == 0) {
                return false;
            }
        } while (w02 != 1);
        return true;
    }

    @Override // p6.InterfaceC1871t
    public final void t(F0 f02) {
        J(f02);
    }

    public final void t0(w0 w0Var) {
        w0Var.j(new C0());
        AbstractC1997b.a(f18556o, this, w0Var, w0Var.o());
    }

    public String toString() {
        return A0() + '@' + M.b(this);
    }

    @Override // X5.g
    public Object u(Object obj, g6.p pVar) {
        return InterfaceC1869q0.a.b(this, obj, pVar);
    }

    public final void u0(w0 w0Var) {
        Object b02;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        Z z7;
        do {
            b02 = b0();
            if (!(b02 instanceof w0)) {
                if (!(b02 instanceof InterfaceC1859l0) || ((InterfaceC1859l0) b02).g() == null) {
                    return;
                }
                w0Var.r();
                return;
            }
            if (b02 != w0Var) {
                return;
            }
            atomicReferenceFieldUpdater = f18556o;
            z7 = y0.f18580g;
        } while (!AbstractC1997b.a(atomicReferenceFieldUpdater, this, b02, z7));
    }

    @Override // p6.InterfaceC1869q0
    public final X v(boolean z7, boolean z8, g6.l lVar) {
        w0 k02 = k0(lVar, z7);
        while (true) {
            Object b02 = b0();
            if (b02 instanceof Z) {
                Z z9 = (Z) b02;
                if (!z9.a()) {
                    s0(z9);
                } else if (AbstractC1997b.a(f18556o, this, b02, k02)) {
                    return k02;
                }
            } else {
                if (!(b02 instanceof InterfaceC1859l0)) {
                    if (z8) {
                        C1877z c1877z = b02 instanceof C1877z ? (C1877z) b02 : null;
                        lVar.invoke(c1877z != null ? c1877z.f18582a : null);
                    }
                    return D0.f18485o;
                }
                C0 g7 = ((InterfaceC1859l0) b02).g();
                if (g7 == null) {
                    Intrinsics.c(b02, "null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                    t0((w0) b02);
                } else {
                    X x7 = D0.f18485o;
                    if (z7 && (b02 instanceof c)) {
                        synchronized (b02) {
                            try {
                                r3 = ((c) b02).e();
                                if (r3 != null) {
                                    if ((lVar instanceof C1870s) && !((c) b02).h()) {
                                    }
                                    V5.t tVar = V5.t.f6803a;
                                }
                                if (A(b02, g7, k02)) {
                                    if (r3 == null) {
                                        return k02;
                                    }
                                    x7 = k02;
                                    V5.t tVar2 = V5.t.f6803a;
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                    if (r3 != null) {
                        if (z8) {
                            lVar.invoke(r3);
                        }
                        return x7;
                    }
                    if (A(b02, g7, k02)) {
                        return k02;
                    }
                }
            }
        }
    }

    public final void v0(r rVar) {
        f18557p.set(this, rVar);
    }

    @Override // p6.InterfaceC1869q0
    public void w(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new r0(N(), null, this);
        }
        K(cancellationException);
    }

    public final int w0(Object obj) {
        Z z7;
        if (!(obj instanceof Z)) {
            if (!(obj instanceof C1857k0)) {
                return 0;
            }
            if (!AbstractC1997b.a(f18556o, this, obj, ((C1857k0) obj).g())) {
                return -1;
            }
            r0();
            return 1;
        }
        if (((Z) obj).a()) {
            return 0;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f18556o;
        z7 = y0.f18580g;
        if (!AbstractC1997b.a(atomicReferenceFieldUpdater, this, obj, z7)) {
            return -1;
        }
        r0();
        return 1;
    }

    @Override // X5.g
    public X5.g x(g.c cVar) {
        return InterfaceC1869q0.a.e(this, cVar);
    }

    public final String x0(Object obj) {
        if (!(obj instanceof c)) {
            return obj instanceof InterfaceC1859l0 ? ((InterfaceC1859l0) obj).a() ? "Active" : "New" : obj instanceof C1877z ? "Cancelled" : "Completed";
        }
        c cVar = (c) obj;
        return cVar.f() ? "Cancelling" : cVar.h() ? "Completing" : "Active";
    }

    public final CancellationException y0(Throwable th, String str) {
        CancellationException cancellationException = th instanceof CancellationException ? (CancellationException) th : null;
        if (cancellationException == null) {
            if (str == null) {
                str = N();
            }
            cancellationException = new r0(str, th, this);
        }
        return cancellationException;
    }

    public void r0() {
    }

    public void F(Object obj) {
    }

    public void d0(Throwable th) {
        throw th;
    }

    public void p0(Throwable th) {
    }

    public void q0(Object obj) {
    }
}
