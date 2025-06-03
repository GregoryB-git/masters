package y6;

import V5.t;
import g6.l;
import g6.p;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.j;
import p6.InterfaceC1858l;
import p6.P0;
import r6.h;
import u.AbstractC1997b;
import u6.AbstractC2034d;
import u6.C;
import u6.D;
import u6.F;

/* loaded from: classes.dex */
public class d {

    /* renamed from: c, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f21532c = AtomicReferenceFieldUpdater.newUpdater(d.class, Object.class, "head");

    /* renamed from: d, reason: collision with root package name */
    public static final AtomicLongFieldUpdater f21533d = AtomicLongFieldUpdater.newUpdater(d.class, "deqIdx");

    /* renamed from: e, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f21534e = AtomicReferenceFieldUpdater.newUpdater(d.class, Object.class, "tail");

    /* renamed from: f, reason: collision with root package name */
    public static final AtomicLongFieldUpdater f21535f = AtomicLongFieldUpdater.newUpdater(d.class, "enqIdx");

    /* renamed from: g, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f21536g = AtomicIntegerFieldUpdater.newUpdater(d.class, "_availablePermits");
    private volatile int _availablePermits;

    /* renamed from: a, reason: collision with root package name */
    public final int f21537a;

    /* renamed from: b, reason: collision with root package name */
    public final l f21538b;
    private volatile long deqIdx;
    private volatile long enqIdx;
    private volatile Object head;
    private volatile Object tail;

    public /* synthetic */ class a extends j implements p {

        /* renamed from: o, reason: collision with root package name */
        public static final a f21539o = new a();

        public a() {
            super(2, e.class, "createSegment", "createSegment(JLkotlinx/coroutines/sync/SemaphoreSegment;)Lkotlinx/coroutines/sync/SemaphoreSegment;", 1);
        }

        public final f b(long j7, f fVar) {
            f h7;
            h7 = e.h(j7, fVar);
            return h7;
        }

        @Override // g6.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return b(((Number) obj).longValue(), (f) obj2);
        }
    }

    public static final class b extends kotlin.jvm.internal.l implements l {
        public b() {
            super(1);
        }

        public final void a(Throwable th) {
            d.this.i();
        }

        @Override // g6.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Throwable) obj);
            return t.f6803a;
        }
    }

    public /* synthetic */ class c extends j implements p {

        /* renamed from: o, reason: collision with root package name */
        public static final c f21541o = new c();

        public c() {
            super(2, e.class, "createSegment", "createSegment(JLkotlinx/coroutines/sync/SemaphoreSegment;)Lkotlinx/coroutines/sync/SemaphoreSegment;", 1);
        }

        public final f b(long j7, f fVar) {
            f h7;
            h7 = e.h(j7, fVar);
            return h7;
        }

        @Override // g6.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return b(((Number) obj).longValue(), (f) obj2);
        }
    }

    public d(int i7, int i8) {
        this.f21537a = i7;
        if (i7 <= 0) {
            throw new IllegalArgumentException(("Semaphore should have at least 1 permit, but had " + i7).toString());
        }
        if (i8 < 0 || i8 > i7) {
            throw new IllegalArgumentException(("The number of acquired permits should be in 0.." + i7).toString());
        }
        f fVar = new f(0L, null, 2);
        this.head = fVar;
        this.tail = fVar;
        this._availablePermits = i7 - i8;
        this.f21538b = new b();
    }

    public final void d(InterfaceC1858l interfaceC1858l) {
        while (g() <= 0) {
            Intrinsics.c(interfaceC1858l, "null cannot be cast to non-null type kotlinx.coroutines.Waiter");
            if (e((P0) interfaceC1858l)) {
                return;
            }
        }
        interfaceC1858l.j(t.f6803a, this.f21538b);
    }

    public final boolean e(P0 p02) {
        int i7;
        Object c7;
        int i8;
        F f7;
        F f8;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f21534e;
        f fVar = (f) atomicReferenceFieldUpdater.get(this);
        long andIncrement = f21535f.getAndIncrement(this);
        a aVar = a.f21539o;
        i7 = e.f21547f;
        long j7 = andIncrement / i7;
        loop0: while (true) {
            c7 = AbstractC2034d.c(fVar, j7, aVar);
            if (!D.c(c7)) {
                C b7 = D.b(c7);
                while (true) {
                    C c8 = (C) atomicReferenceFieldUpdater.get(this);
                    if (c8.f19955q >= b7.f19955q) {
                        break loop0;
                    }
                    if (!b7.q()) {
                        break;
                    }
                    if (AbstractC1997b.a(atomicReferenceFieldUpdater, this, c8, b7)) {
                        if (c8.m()) {
                            c8.k();
                        }
                    } else if (b7.m()) {
                        b7.k();
                    }
                }
            } else {
                break;
            }
        }
        f fVar2 = (f) D.b(c7);
        i8 = e.f21547f;
        int i9 = (int) (andIncrement % i8);
        if (h.a(fVar2.r(), i9, null, p02)) {
            p02.a(fVar2, i9);
            return true;
        }
        f7 = e.f21543b;
        f8 = e.f21544c;
        if (!h.a(fVar2.r(), i9, f7, f8)) {
            return false;
        }
        if (p02 instanceof InterfaceC1858l) {
            Intrinsics.c(p02, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
            ((InterfaceC1858l) p02).j(t.f6803a, this.f21538b);
            return true;
        }
        throw new IllegalStateException(("unexpected: " + p02).toString());
    }

    public final void f() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i7;
        int i8;
        do {
            atomicIntegerFieldUpdater = f21536g;
            i7 = atomicIntegerFieldUpdater.get(this);
            i8 = this.f21537a;
            if (i7 <= i8) {
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i7, i8));
    }

    public final int g() {
        int andDecrement;
        do {
            andDecrement = f21536g.getAndDecrement(this);
        } while (andDecrement > this.f21537a);
        return andDecrement;
    }

    public int h() {
        return Math.max(f21536g.get(this), 0);
    }

    public void i() {
        do {
            int andIncrement = f21536g.getAndIncrement(this);
            if (andIncrement >= this.f21537a) {
                f();
                throw new IllegalStateException(("The number of released permits cannot be greater than " + this.f21537a).toString());
            }
            if (andIncrement >= 0) {
                return;
            }
        } while (!l());
    }

    public boolean j() {
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f21536g;
            int i7 = atomicIntegerFieldUpdater.get(this);
            if (i7 > this.f21537a) {
                f();
            } else {
                if (i7 <= 0) {
                    return false;
                }
                if (atomicIntegerFieldUpdater.compareAndSet(this, i7, i7 - 1)) {
                    return true;
                }
            }
        }
    }

    public final boolean k(Object obj) {
        if (!(obj instanceof InterfaceC1858l)) {
            throw new IllegalStateException(("unexpected: " + obj).toString());
        }
        Intrinsics.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
        InterfaceC1858l interfaceC1858l = (InterfaceC1858l) obj;
        Object g7 = interfaceC1858l.g(t.f6803a, null, this.f21538b);
        if (g7 == null) {
            return false;
        }
        interfaceC1858l.p(g7);
        return true;
    }

    public final boolean l() {
        int i7;
        Object c7;
        int i8;
        F f7;
        F f8;
        int i9;
        F f9;
        F f10;
        F f11;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f21532c;
        f fVar = (f) atomicReferenceFieldUpdater.get(this);
        long andIncrement = f21533d.getAndIncrement(this);
        i7 = e.f21547f;
        long j7 = andIncrement / i7;
        c cVar = c.f21541o;
        loop0: while (true) {
            c7 = AbstractC2034d.c(fVar, j7, cVar);
            if (D.c(c7)) {
                break;
            }
            C b7 = D.b(c7);
            while (true) {
                C c8 = (C) atomicReferenceFieldUpdater.get(this);
                if (c8.f19955q >= b7.f19955q) {
                    break loop0;
                }
                if (!b7.q()) {
                    break;
                }
                if (AbstractC1997b.a(atomicReferenceFieldUpdater, this, c8, b7)) {
                    if (c8.m()) {
                        c8.k();
                    }
                } else if (b7.m()) {
                    b7.k();
                }
            }
        }
        f fVar2 = (f) D.b(c7);
        fVar2.b();
        if (fVar2.f19955q > j7) {
            return false;
        }
        i8 = e.f21547f;
        int i10 = (int) (andIncrement % i8);
        f7 = e.f21543b;
        Object andSet = fVar2.r().getAndSet(i10, f7);
        if (andSet != null) {
            f8 = e.f21546e;
            if (andSet == f8) {
                return false;
            }
            return k(andSet);
        }
        i9 = e.f21542a;
        for (int i11 = 0; i11 < i9; i11++) {
            Object obj = fVar2.r().get(i10);
            f11 = e.f21544c;
            if (obj == f11) {
                return true;
            }
        }
        f9 = e.f21543b;
        f10 = e.f21545d;
        return !h.a(fVar2.r(), i10, f9, f10);
    }
}
