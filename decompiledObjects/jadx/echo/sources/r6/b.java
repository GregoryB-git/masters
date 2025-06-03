package r6;

import V5.n;
import V5.t;
import g6.p;
import g6.q;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.Intrinsics;
import p6.AbstractC1864o;
import p6.C1860m;
import p6.InterfaceC1858l;
import p6.P0;
import u.AbstractC1997b;
import u6.AbstractC2034d;
import u6.AbstractC2035e;
import u6.C;
import u6.D;
import u6.E;
import u6.F;
import u6.O;
import u6.x;

/* loaded from: classes.dex */
public class b implements d {

    /* renamed from: e, reason: collision with root package name */
    public static final AtomicLongFieldUpdater f19086e = AtomicLongFieldUpdater.newUpdater(b.class, "sendersAndCloseStatus");

    /* renamed from: f, reason: collision with root package name */
    public static final AtomicLongFieldUpdater f19087f = AtomicLongFieldUpdater.newUpdater(b.class, "receivers");

    /* renamed from: g, reason: collision with root package name */
    public static final AtomicLongFieldUpdater f19088g = AtomicLongFieldUpdater.newUpdater(b.class, "bufferEnd");

    /* renamed from: h, reason: collision with root package name */
    public static final AtomicLongFieldUpdater f19089h = AtomicLongFieldUpdater.newUpdater(b.class, "completedExpandBuffersAndPauseFlag");

    /* renamed from: i, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f19090i = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "sendSegment");

    /* renamed from: j, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f19091j = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "receiveSegment");

    /* renamed from: k, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f19092k = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "bufferEndSegment");

    /* renamed from: l, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f19093l = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "_closeCause");

    /* renamed from: m, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f19094m = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "closeHandler");
    private volatile Object _closeCause;

    /* renamed from: b, reason: collision with root package name */
    public final int f19095b;
    private volatile long bufferEnd;
    private volatile Object bufferEndSegment;

    /* renamed from: c, reason: collision with root package name */
    public final g6.l f19096c;
    private volatile Object closeHandler;
    private volatile long completedExpandBuffersAndPauseFlag;

    /* renamed from: d, reason: collision with root package name */
    public final q f19097d;
    private volatile Object receiveSegment;
    private volatile long receivers;
    private volatile Object sendSegment;
    private volatile long sendersAndCloseStatus;

    public final class a implements e, P0 {

        /* renamed from: o, reason: collision with root package name */
        public Object f19098o;

        /* renamed from: p, reason: collision with root package name */
        public C1860m f19099p;

        public a() {
            F f7;
            f7 = c.f19119p;
            this.f19098o = f7;
        }

        @Override // p6.P0
        public void a(C c7, int i7) {
            C1860m c1860m = this.f19099p;
            if (c1860m != null) {
                c1860m.a(c7, i7);
            }
        }

        @Override // r6.e
        public Object b(X5.d dVar) {
            boolean g7;
            i iVar;
            F f7;
            F f8;
            F f9;
            b bVar = b.this;
            i iVar2 = (i) b.f19091j.get(bVar);
            while (true) {
                if (bVar.P()) {
                    g7 = g();
                    break;
                }
                long andIncrement = b.f19087f.getAndIncrement(bVar);
                int i7 = c.f19105b;
                long j7 = andIncrement / i7;
                int i8 = (int) (andIncrement % i7);
                if (iVar2.f19955q != j7) {
                    i B7 = bVar.B(j7, iVar2);
                    if (B7 == null) {
                        continue;
                    } else {
                        iVar = B7;
                    }
                } else {
                    iVar = iVar2;
                }
                Object r02 = bVar.r0(iVar, i8, andIncrement, null);
                f7 = c.f19116m;
                if (r02 == f7) {
                    throw new IllegalStateException("unreachable".toString());
                }
                f8 = c.f19118o;
                if (r02 == f8) {
                    if (andIncrement < bVar.I()) {
                        iVar.b();
                    }
                    iVar2 = iVar;
                } else {
                    f9 = c.f19117n;
                    if (r02 == f9) {
                        return f(iVar, i8, andIncrement, dVar);
                    }
                    iVar.b();
                    this.f19098o = r02;
                    g7 = true;
                }
            }
            return Z5.b.a(g7);
        }

        public final Object f(i iVar, int i7, long j7, X5.d dVar) {
            X5.d b7;
            F f7;
            F f8;
            Boolean a7;
            F f9;
            F f10;
            F f11;
            Object c7;
            b bVar = b.this;
            b7 = Y5.c.b(dVar);
            C1860m b8 = AbstractC1864o.b(b7);
            try {
                this.f19099p = b8;
                Object r02 = bVar.r0(iVar, i7, j7, this);
                f7 = c.f19116m;
                if (r02 == f7) {
                    bVar.e0(this, iVar, i7);
                } else {
                    f8 = c.f19118o;
                    g6.l lVar = null;
                    if (r02 == f8) {
                        if (j7 < bVar.I()) {
                            iVar.b();
                        }
                        i iVar2 = (i) b.f19091j.get(bVar);
                        while (true) {
                            if (bVar.P()) {
                                h();
                                break;
                            }
                            long andIncrement = b.f19087f.getAndIncrement(bVar);
                            int i8 = c.f19105b;
                            long j8 = andIncrement / i8;
                            int i9 = (int) (andIncrement % i8);
                            if (iVar2.f19955q != j8) {
                                i B7 = bVar.B(j8, iVar2);
                                if (B7 != null) {
                                    iVar2 = B7;
                                }
                            }
                            Object r03 = bVar.r0(iVar2, i9, andIncrement, this);
                            f9 = c.f19116m;
                            if (r03 == f9) {
                                bVar.e0(this, iVar2, i9);
                                break;
                            }
                            f10 = c.f19118o;
                            if (r03 != f10) {
                                f11 = c.f19117n;
                                if (r03 == f11) {
                                    throw new IllegalStateException("unexpected".toString());
                                }
                                iVar2.b();
                                this.f19098o = r03;
                                this.f19099p = null;
                                a7 = Z5.b.a(true);
                                g6.l lVar2 = bVar.f19096c;
                                if (lVar2 != null) {
                                    lVar = x.a(lVar2, r03, b8.getContext());
                                }
                            } else if (andIncrement < bVar.I()) {
                                iVar2.b();
                            }
                        }
                    } else {
                        iVar.b();
                        this.f19098o = r02;
                        this.f19099p = null;
                        a7 = Z5.b.a(true);
                        g6.l lVar3 = bVar.f19096c;
                        if (lVar3 != null) {
                            lVar = x.a(lVar3, r02, b8.getContext());
                        }
                    }
                    b8.j(a7, lVar);
                }
                Object w7 = b8.w();
                c7 = Y5.d.c();
                if (w7 == c7) {
                    Z5.h.c(dVar);
                }
                return w7;
            } catch (Throwable th) {
                b8.I();
                throw th;
            }
        }

        public final boolean g() {
            this.f19098o = c.z();
            Throwable E6 = b.this.E();
            if (E6 == null) {
                return false;
            }
            throw E.a(E6);
        }

        public final void h() {
            Object a7;
            C1860m c1860m = this.f19099p;
            Intrinsics.b(c1860m);
            this.f19099p = null;
            this.f19098o = c.z();
            Throwable E6 = b.this.E();
            if (E6 == null) {
                n.a aVar = V5.n.f6797o;
                a7 = Boolean.FALSE;
            } else {
                n.a aVar2 = V5.n.f6797o;
                a7 = V5.o.a(E6);
            }
            c1860m.resumeWith(V5.n.a(a7));
        }

        public final boolean i(Object obj) {
            boolean B7;
            C1860m c1860m = this.f19099p;
            Intrinsics.b(c1860m);
            this.f19099p = null;
            this.f19098o = obj;
            Boolean bool = Boolean.TRUE;
            g6.l lVar = b.this.f19096c;
            B7 = c.B(c1860m, bool, lVar != null ? x.a(lVar, obj, c1860m.getContext()) : null);
            return B7;
        }

        public final void j() {
            Object a7;
            C1860m c1860m = this.f19099p;
            Intrinsics.b(c1860m);
            this.f19099p = null;
            this.f19098o = c.z();
            Throwable E6 = b.this.E();
            if (E6 == null) {
                n.a aVar = V5.n.f6797o;
                a7 = Boolean.FALSE;
            } else {
                n.a aVar2 = V5.n.f6797o;
                a7 = V5.o.a(E6);
            }
            c1860m.resumeWith(V5.n.a(a7));
        }

        @Override // r6.e
        public Object next() {
            F f7;
            F f8;
            Object obj = this.f19098o;
            f7 = c.f19119p;
            if (obj == f7) {
                throw new IllegalStateException("`hasNext()` has not been invoked".toString());
            }
            f8 = c.f19119p;
            this.f19098o = f8;
            if (obj != c.z()) {
                return obj;
            }
            throw E.a(b.this.F());
        }
    }

    /* renamed from: r6.b$b, reason: collision with other inner class name */
    public static final class C0261b extends kotlin.jvm.internal.l implements q {

        /* renamed from: r6.b$b$a */
        public static final class a extends kotlin.jvm.internal.l implements g6.l {

            /* renamed from: o, reason: collision with root package name */
            public final /* synthetic */ Object f19102o;

            /* renamed from: p, reason: collision with root package name */
            public final /* synthetic */ b f19103p;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Object obj, b bVar, x6.a aVar) {
                super(1);
                this.f19102o = obj;
                this.f19103p = bVar;
            }

            public final void a(Throwable th) {
                if (this.f19102o == c.z()) {
                    return;
                }
                g6.l lVar = this.f19103p.f19096c;
                throw null;
            }

            @Override // g6.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((Throwable) obj);
                return t.f6803a;
            }
        }

        public C0261b() {
            super(3);
        }

        public final g6.l a(x6.a aVar, Object obj, Object obj2) {
            return new a(obj2, b.this, aVar);
        }

        @Override // g6.q
        public /* bridge */ /* synthetic */ Object c(Object obj, Object obj2, Object obj3) {
            android.support.v4.media.a.a(obj);
            return a(null, obj2, obj3);
        }
    }

    public b(int i7, g6.l lVar) {
        long A7;
        F f7;
        this.f19095b = i7;
        this.f19096c = lVar;
        if (i7 < 0) {
            throw new IllegalArgumentException(("Invalid channel capacity: " + i7 + ", should be >=0").toString());
        }
        A7 = c.A(i7);
        this.bufferEnd = A7;
        this.completedExpandBuffersAndPauseFlag = D();
        i iVar = new i(0L, null, this, 3);
        this.sendSegment = iVar;
        this.receiveSegment = iVar;
        if (U()) {
            iVar = c.f19104a;
            Intrinsics.c(iVar, "null cannot be cast to non-null type kotlinx.coroutines.channels.ChannelSegment<E of kotlinx.coroutines.channels.BufferedChannel>");
        }
        this.bufferEndSegment = iVar;
        this.f19097d = lVar != null ? new C0261b() : null;
        f7 = c.f19122s;
        this._closeCause = f7;
    }

    public static /* synthetic */ void L(b bVar, long j7, int i7, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: incCompletedExpandBufferAttempts");
        }
        if ((i7 & 1) != 0) {
            j7 = 1;
        }
        bVar.K(j7);
    }

    public static /* synthetic */ Object g0(b bVar, X5.d dVar) {
        F f7;
        F f8;
        F f9;
        i iVar = (i) f19091j.get(bVar);
        while (!bVar.P()) {
            long andIncrement = f19087f.getAndIncrement(bVar);
            int i7 = c.f19105b;
            long j7 = andIncrement / i7;
            int i8 = (int) (andIncrement % i7);
            if (iVar.f19955q != j7) {
                i B7 = bVar.B(j7, iVar);
                if (B7 == null) {
                    continue;
                } else {
                    iVar = B7;
                }
            }
            Object r02 = bVar.r0(iVar, i8, andIncrement, null);
            f7 = c.f19116m;
            if (r02 == f7) {
                throw new IllegalStateException("unexpected".toString());
            }
            f8 = c.f19118o;
            if (r02 != f8) {
                f9 = c.f19117n;
                if (r02 == f9) {
                    return bVar.h0(iVar, i8, andIncrement, dVar);
                }
                iVar.b();
                return r02;
            }
            if (andIncrement < bVar.I()) {
                iVar.b();
            }
        }
        throw E.a(bVar.F());
    }

    public final i A(long j7, i iVar, long j8) {
        Object c7;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f19092k;
        p pVar = (p) c.y();
        loop0: while (true) {
            c7 = AbstractC2034d.c(iVar, j7, pVar);
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
        if (D.c(c7)) {
            x();
            Z(j7, iVar);
        } else {
            i iVar2 = (i) D.b(c7);
            long j9 = iVar2.f19955q;
            if (j9 <= j7) {
                return iVar2;
            }
            int i7 = c.f19105b;
            if (f19088g.compareAndSet(this, j8 + 1, i7 * j9)) {
                K((iVar2.f19955q * i7) - j8);
                return null;
            }
        }
        L(this, 0L, 1, null);
        return null;
    }

    public final i B(long j7, i iVar) {
        Object c7;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f19091j;
        p pVar = (p) c.y();
        loop0: while (true) {
            c7 = AbstractC2034d.c(iVar, j7, pVar);
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
        if (D.c(c7)) {
            x();
            if (iVar.f19955q * c.f19105b >= I()) {
                return null;
            }
        } else {
            iVar = (i) D.b(c7);
            if (!U() && j7 <= D() / c.f19105b) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f19092k;
                while (true) {
                    C c9 = (C) atomicReferenceFieldUpdater2.get(this);
                    if (c9.f19955q >= iVar.f19955q || !iVar.q()) {
                        break;
                    }
                    if (AbstractC1997b.a(atomicReferenceFieldUpdater2, this, c9, iVar)) {
                        if (c9.m()) {
                            c9.k();
                        }
                    } else if (iVar.m()) {
                        iVar.k();
                    }
                }
            }
            long j8 = iVar.f19955q;
            if (j8 <= j7) {
                return iVar;
            }
            int i7 = c.f19105b;
            v0(j8 * i7);
            if (iVar.f19955q * i7 >= I()) {
                return null;
            }
        }
        iVar.b();
        return null;
    }

    public final i C(long j7, i iVar) {
        Object c7;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f19090i;
        p pVar = (p) c.y();
        loop0: while (true) {
            c7 = AbstractC2034d.c(iVar, j7, pVar);
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
        if (D.c(c7)) {
            x();
            if (iVar.f19955q * c.f19105b >= G()) {
                return null;
            }
        } else {
            iVar = (i) D.b(c7);
            long j8 = iVar.f19955q;
            if (j8 <= j7) {
                return iVar;
            }
            int i7 = c.f19105b;
            w0(j8 * i7);
            if (iVar.f19955q * i7 >= G()) {
                return null;
            }
        }
        iVar.b();
        return null;
    }

    public final long D() {
        return f19088g.get(this);
    }

    public final Throwable E() {
        return (Throwable) f19093l.get(this);
    }

    public final Throwable F() {
        Throwable E6 = E();
        return E6 == null ? new j("Channel was closed") : E6;
    }

    public final long G() {
        return f19087f.get(this);
    }

    public final Throwable H() {
        Throwable E6 = E();
        return E6 == null ? new k("Channel was closed") : E6;
    }

    public final long I() {
        return f19086e.get(this) & 1152921504606846975L;
    }

    public final boolean J() {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f19091j;
            i iVar = (i) atomicReferenceFieldUpdater.get(this);
            long G6 = G();
            if (I() <= G6) {
                return false;
            }
            int i7 = c.f19105b;
            long j7 = G6 / i7;
            if (iVar.f19955q == j7 || (iVar = B(j7, iVar)) != null) {
                iVar.b();
                if (N(iVar, (int) (G6 % i7), G6)) {
                    return true;
                }
                f19087f.compareAndSet(this, G6, G6 + 1);
            } else if (((i) atomicReferenceFieldUpdater.get(this)).f19955q < j7) {
                return false;
            }
        }
    }

    public final void K(long j7) {
        if ((f19089h.addAndGet(this, j7) & 4611686018427387904L) != 0) {
            while ((f19089h.get(this) & 4611686018427387904L) != 0) {
            }
        }
    }

    public final void M() {
        Object obj;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f19094m;
        do {
            obj = atomicReferenceFieldUpdater.get(this);
        } while (!AbstractC1997b.a(atomicReferenceFieldUpdater, this, obj, obj == null ? c.f19120q : c.f19121r));
        if (obj == null) {
            return;
        }
        ((g6.l) obj).invoke(E());
    }

    public final boolean N(i iVar, int i7, long j7) {
        Object w7;
        F f7;
        F f8;
        F f9;
        F f10;
        F f11;
        F f12;
        F f13;
        do {
            w7 = iVar.w(i7);
            if (w7 != null) {
                f8 = c.f19108e;
                if (w7 != f8) {
                    if (w7 == c.f19107d) {
                        return true;
                    }
                    f9 = c.f19113j;
                    if (w7 == f9 || w7 == c.z()) {
                        return false;
                    }
                    f10 = c.f19112i;
                    if (w7 == f10) {
                        return false;
                    }
                    f11 = c.f19111h;
                    if (w7 == f11) {
                        return false;
                    }
                    f12 = c.f19110g;
                    if (w7 == f12) {
                        return true;
                    }
                    f13 = c.f19109f;
                    return w7 != f13 && j7 == G();
                }
            }
            f7 = c.f19111h;
        } while (!iVar.r(i7, w7, f7));
        z();
        return false;
    }

    public final boolean O(long j7, boolean z7) {
        int i7 = (int) (j7 >> 60);
        if (i7 == 0 || i7 == 1) {
            return false;
        }
        if (i7 == 2) {
            w(j7 & 1152921504606846975L);
            if (z7 && J()) {
                return false;
            }
        } else {
            if (i7 != 3) {
                throw new IllegalStateException(("unexpected close status: " + i7).toString());
            }
            v(j7 & 1152921504606846975L);
        }
        return true;
    }

    public boolean P() {
        return Q(f19086e.get(this));
    }

    public final boolean Q(long j7) {
        return O(j7, true);
    }

    public boolean R() {
        return S(f19086e.get(this));
    }

    public final boolean S(long j7) {
        return O(j7, false);
    }

    public boolean T() {
        return false;
    }

    public final boolean U() {
        long D7 = D();
        return D7 == 0 || D7 == Long.MAX_VALUE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x003c, code lost:
    
        r8 = (r6.i) r8.g();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long V(r6.i r8) {
        /*
            r7 = this;
        L0:
            int r0 = r6.c.f19105b
            int r0 = r0 + (-1)
        L4:
            r1 = -1
            r3 = -1
            if (r3 >= r0) goto L3c
            long r3 = r8.f19955q
            int r5 = r6.c.f19105b
            long r5 = (long) r5
            long r3 = r3 * r5
            long r5 = (long) r0
            long r3 = r3 + r5
            long r5 = r7.G()
            int r5 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r5 >= 0) goto L1a
            return r1
        L1a:
            java.lang.Object r1 = r8.w(r0)
            if (r1 == 0) goto L2c
            u6.F r2 = r6.c.k()
            if (r1 != r2) goto L27
            goto L2c
        L27:
            u6.F r2 = r6.c.f19107d
            if (r1 != r2) goto L39
            return r3
        L2c:
            u6.F r2 = r6.c.z()
            boolean r1 = r8.r(r0, r1, r2)
            if (r1 == 0) goto L1a
            r8.p()
        L39:
            int r0 = r0 + (-1)
            goto L4
        L3c:
            u6.e r8 = r8.g()
            r6.i r8 = (r6.i) r8
            if (r8 != 0) goto L0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: r6.b.V(r6.i):long");
    }

    public final void W() {
        long j7;
        long w7;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f19086e;
        do {
            j7 = atomicLongFieldUpdater.get(this);
            if (((int) (j7 >> 60)) != 0) {
                return;
            } else {
                w7 = c.w(1152921504606846975L & j7, 1);
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j7, w7));
    }

    public final void X() {
        long j7;
        long w7;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f19086e;
        do {
            j7 = atomicLongFieldUpdater.get(this);
            w7 = c.w(1152921504606846975L & j7, 3);
        } while (!atomicLongFieldUpdater.compareAndSet(this, j7, w7));
    }

    public final void Y() {
        long j7;
        long j8;
        int i7;
        long w7;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f19086e;
        do {
            j7 = atomicLongFieldUpdater.get(this);
            int i8 = (int) (j7 >> 60);
            if (i8 == 0) {
                j8 = j7 & 1152921504606846975L;
                i7 = 2;
            } else {
                if (i8 != 1) {
                    return;
                }
                j8 = j7 & 1152921504606846975L;
                i7 = 3;
            }
            w7 = c.w(j8, i7);
        } while (!atomicLongFieldUpdater.compareAndSet(this, j7, w7));
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0011, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void Z(long r5, r6.i r7) {
        /*
            r4 = this;
        L0:
            long r0 = r7.f19955q
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 >= 0) goto L11
            u6.e r0 = r7.e()
            r6.i r0 = (r6.i) r0
            if (r0 != 0) goto Lf
            goto L11
        Lf:
            r7 = r0
            goto L0
        L11:
            boolean r5 = r7.h()
            if (r5 == 0) goto L22
            u6.e r5 = r7.e()
            r6.i r5 = (r6.i) r5
            if (r5 != 0) goto L20
            goto L22
        L20:
            r7 = r5
            goto L11
        L22:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = r6.b.f19092k
        L24:
            java.lang.Object r6 = r5.get(r4)
            u6.C r6 = (u6.C) r6
            long r0 = r6.f19955q
            long r2 = r7.f19955q
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 < 0) goto L33
            goto L49
        L33:
            boolean r0 = r7.q()
            if (r0 != 0) goto L3a
            goto L11
        L3a:
            boolean r0 = u.AbstractC1997b.a(r5, r4, r6, r7)
            if (r0 == 0) goto L4a
            boolean r5 = r6.m()
            if (r5 == 0) goto L49
            r6.k()
        L49:
            return
        L4a:
            boolean r6 = r7.m()
            if (r6 == 0) goto L24
            r7.k()
            goto L24
        */
        throw new UnsupportedOperationException("Method not decompiled: r6.b.Z(long, r6.i):void");
    }

    @Override // r6.m
    public Object a(X5.d dVar) {
        return g0(this, dVar);
    }

    @Override // r6.n
    public boolean b(Throwable th) {
        return u(th, false);
    }

    public final void b0(InterfaceC1858l interfaceC1858l) {
        n.a aVar = V5.n.f6797o;
        interfaceC1858l.resumeWith(V5.n.a(V5.o.a(F())));
    }

    @Override // r6.m
    public Object c() {
        Object obj;
        i iVar;
        F f7;
        F f8;
        F f9;
        long j7 = f19087f.get(this);
        long j8 = f19086e.get(this);
        if (Q(j8)) {
            return g.f19127a.a(E());
        }
        if (j7 >= (j8 & 1152921504606846975L)) {
            return g.f19127a.b();
        }
        obj = c.f19114k;
        i iVar2 = (i) f19091j.get(this);
        while (!P()) {
            long andIncrement = f19087f.getAndIncrement(this);
            int i7 = c.f19105b;
            long j9 = andIncrement / i7;
            int i8 = (int) (andIncrement % i7);
            if (iVar2.f19955q != j9) {
                i B7 = B(j9, iVar2);
                if (B7 == null) {
                    continue;
                } else {
                    iVar = B7;
                }
            } else {
                iVar = iVar2;
            }
            Object r02 = r0(iVar, i8, andIncrement, obj);
            f7 = c.f19116m;
            if (r02 == f7) {
                P0 p02 = obj instanceof P0 ? (P0) obj : null;
                if (p02 != null) {
                    e0(p02, iVar, i8);
                }
                x0(andIncrement);
                iVar.p();
                return g.f19127a.b();
            }
            f8 = c.f19118o;
            if (r02 != f8) {
                f9 = c.f19117n;
                if (r02 == f9) {
                    throw new IllegalStateException("unexpected".toString());
                }
                iVar.b();
                return g.f19127a.c(r02);
            }
            if (andIncrement < I()) {
                iVar.b();
            }
            iVar2 = iVar;
        }
        return g.f19127a.a(E());
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:?, code lost:
    
        return r6.g.f19127a.c(V5.t.f6803a);
     */
    @Override // r6.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object d(java.lang.Object r15) {
        /*
            r14 = this;
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = r6.b.f19086e
            long r0 = r0.get(r14)
            boolean r0 = r14.m0(r0)
            if (r0 == 0) goto L13
            r6.g$b r15 = r6.g.f19127a
            java.lang.Object r15 = r15.b()
            return r15
        L13:
            u6.F r8 = r6.c.j()
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = j()
            java.lang.Object r0 = r0.get(r14)
            r6.i r0 = (r6.i) r0
        L21:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = k()
            long r1 = r1.getAndIncrement(r14)
            r3 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            long r9 = r1 & r3
            boolean r11 = l(r14, r1)
            int r1 = r6.c.f19105b
            long r2 = (long) r1
            long r2 = r9 / r2
            long r4 = (long) r1
            long r4 = r9 % r4
            int r12 = (int) r4
            long r4 = r0.f19955q
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r1 == 0) goto L59
            r6.i r1 = f(r14, r2, r0)
            if (r1 != 0) goto L57
            if (r11 == 0) goto L21
        L4b:
            r6.g$b r15 = r6.g.f19127a
            java.lang.Throwable r0 = r14.H()
            java.lang.Object r15 = r15.a(r0)
            goto Lbe
        L57:
            r13 = r1
            goto L5a
        L59:
            r13 = r0
        L5a:
            r0 = r14
            r1 = r13
            r2 = r12
            r3 = r15
            r4 = r9
            r6 = r8
            r7 = r11
            int r0 = q(r0, r1, r2, r3, r4, r6, r7)
            if (r0 == 0) goto Lba
            r1 = 1
            if (r0 == r1) goto Lb1
            r1 = 2
            if (r0 == r1) goto L94
            r1 = 3
            if (r0 == r1) goto L88
            r1 = 4
            if (r0 == r1) goto L7c
            r1 = 5
            if (r0 == r1) goto L77
            goto L7a
        L77:
            r13.b()
        L7a:
            r0 = r13
            goto L21
        L7c:
            long r0 = r14.G()
            int r15 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r15 >= 0) goto L4b
            r13.b()
            goto L4b
        L88:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "unexpected"
            java.lang.String r0 = r0.toString()
            r15.<init>(r0)
            throw r15
        L94:
            if (r11 == 0) goto L9a
            r13.p()
            goto L4b
        L9a:
            boolean r15 = r8 instanceof p6.P0
            if (r15 == 0) goto La1
            p6.P0 r8 = (p6.P0) r8
            goto La2
        La1:
            r8 = 0
        La2:
            if (r8 == 0) goto La7
            o(r14, r8, r13, r12)
        La7:
            r13.p()
            r6.g$b r15 = r6.g.f19127a
            java.lang.Object r15 = r15.b()
            goto Lbe
        Lb1:
            r6.g$b r15 = r6.g.f19127a
            V5.t r0 = V5.t.f6803a
            java.lang.Object r15 = r15.c(r0)
            goto Lbe
        Lba:
            r13.b()
            goto Lb1
        Lbe:
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: r6.b.d(java.lang.Object):java.lang.Object");
    }

    public final void e0(P0 p02, i iVar, int i7) {
        d0();
        p02.a(iVar, i7);
    }

    public final void f0(P0 p02, i iVar, int i7) {
        p02.a(iVar, i7 + c.f19105b);
    }

    public final Object h0(i iVar, int i7, long j7, X5.d dVar) {
        X5.d b7;
        F f7;
        F f8;
        F f9;
        F f10;
        F f11;
        Object c7;
        b7 = Y5.c.b(dVar);
        C1860m b8 = AbstractC1864o.b(b7);
        try {
            Object r02 = r0(iVar, i7, j7, b8);
            f7 = c.f19116m;
            if (r02 == f7) {
                e0(b8, iVar, i7);
            } else {
                f8 = c.f19118o;
                g6.l lVar = null;
                lVar = null;
                if (r02 == f8) {
                    if (j7 < I()) {
                        iVar.b();
                    }
                    i iVar2 = (i) f19091j.get(this);
                    while (true) {
                        if (P()) {
                            b0(b8);
                            break;
                        }
                        long andIncrement = f19087f.getAndIncrement(this);
                        int i8 = c.f19105b;
                        long j8 = andIncrement / i8;
                        int i9 = (int) (andIncrement % i8);
                        if (iVar2.f19955q != j8) {
                            i B7 = B(j8, iVar2);
                            if (B7 != null) {
                                iVar2 = B7;
                            }
                        }
                        r02 = r0(iVar2, i9, andIncrement, b8);
                        f9 = c.f19116m;
                        if (r02 == f9) {
                            C1860m c1860m = b8 instanceof P0 ? b8 : null;
                            if (c1860m != null) {
                                e0(c1860m, iVar2, i9);
                            }
                        } else {
                            f10 = c.f19118o;
                            if (r02 != f10) {
                                f11 = c.f19117n;
                                if (r02 == f11) {
                                    throw new IllegalStateException("unexpected".toString());
                                }
                                iVar2.b();
                                g6.l lVar2 = this.f19096c;
                                if (lVar2 != null) {
                                    lVar = x.a(lVar2, r02, b8.getContext());
                                }
                            } else if (andIncrement < I()) {
                                iVar2.b();
                            }
                        }
                    }
                } else {
                    iVar.b();
                    g6.l lVar3 = this.f19096c;
                    if (lVar3 != null) {
                        lVar = x.a(lVar3, r02, b8.getContext());
                    }
                }
                b8.j(r02, lVar);
            }
            Object w7 = b8.w();
            c7 = Y5.d.c();
            if (w7 == c7) {
                Z5.h.c(dVar);
            }
            return w7;
        } catch (Throwable th) {
            b8.I();
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:81:0x00aa, code lost:
    
        r12 = (r6.i) r12.g();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void i0(r6.i r12) {
        /*
            r11 = this;
            g6.l r0 = r11.f19096c
            r1 = 0
            r2 = 1
            java.lang.Object r3 = u6.AbstractC2042l.b(r1, r2, r1)
        L8:
            int r4 = r6.c.f19105b
            int r4 = r4 - r2
        Lb:
            r5 = -1
            if (r5 >= r4) goto Laa
            long r6 = r12.f19955q
            int r8 = r6.c.f19105b
            long r8 = (long) r8
            long r6 = r6 * r8
            long r8 = (long) r4
            long r6 = r6 + r8
        L16:
            java.lang.Object r8 = r12.w(r4)
            u6.F r9 = r6.c.f()
            if (r8 == r9) goto Lb2
            u6.F r9 = r6.c.f19107d
            if (r8 != r9) goto L47
            long r9 = r11.G()
            int r9 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r9 < 0) goto Lb2
            u6.F r9 = r6.c.z()
            boolean r8 = r12.r(r4, r8, r9)
            if (r8 == 0) goto L16
            if (r0 == 0) goto L40
            java.lang.Object r5 = r12.v(r4)
            u6.O r1 = u6.x.c(r0, r5, r1)
        L40:
            r12.s(r4)
        L43:
            r12.p()
            goto La6
        L47:
            u6.F r9 = r6.c.k()
            if (r8 == r9) goto L9b
            if (r8 != 0) goto L50
            goto L9b
        L50:
            boolean r9 = r8 instanceof p6.P0
            if (r9 != 0) goto L6d
            boolean r9 = r8 instanceof r6.o
            if (r9 == 0) goto L59
            goto L6d
        L59:
            u6.F r9 = r6.c.p()
            if (r8 == r9) goto Lb2
            u6.F r9 = r6.c.q()
            if (r8 != r9) goto L66
            goto Lb2
        L66:
            u6.F r9 = r6.c.p()
            if (r8 == r9) goto L16
            goto La6
        L6d:
            long r9 = r11.G()
            int r9 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r9 < 0) goto Lb2
            boolean r9 = r8 instanceof r6.o
            if (r9 == 0) goto L7f
            r9 = r8
            r6.o r9 = (r6.o) r9
            p6.P0 r9 = r9.f19134a
            goto L82
        L7f:
            r9 = r8
            p6.P0 r9 = (p6.P0) r9
        L82:
            u6.F r10 = r6.c.z()
            boolean r8 = r12.r(r4, r8, r10)
            if (r8 == 0) goto L16
            if (r0 == 0) goto L96
            java.lang.Object r5 = r12.v(r4)
            u6.O r1 = u6.x.c(r0, r5, r1)
        L96:
            java.lang.Object r3 = u6.AbstractC2042l.c(r3, r9)
            goto L40
        L9b:
            u6.F r9 = r6.c.z()
            boolean r8 = r12.r(r4, r8, r9)
            if (r8 == 0) goto L16
            goto L43
        La6:
            int r4 = r4 + (-1)
            goto Lb
        Laa:
            u6.e r12 = r12.g()
            r6.i r12 = (r6.i) r12
            if (r12 != 0) goto L8
        Lb2:
            if (r3 == 0) goto Ld8
            boolean r12 = r3 instanceof java.util.ArrayList
            if (r12 != 0) goto Lbe
            p6.P0 r3 = (p6.P0) r3
            r11.k0(r3)
            goto Ld8
        Lbe:
            java.lang.String r12 = "null cannot be cast to non-null type java.util.ArrayList<E of kotlinx.coroutines.internal.InlineList>{ kotlin.collections.TypeAliasesKt.ArrayList<E of kotlinx.coroutines.internal.InlineList> }"
            kotlin.jvm.internal.Intrinsics.c(r3, r12)
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            int r12 = r3.size()
            int r12 = r12 - r2
        Lca:
            if (r5 >= r12) goto Ld8
            java.lang.Object r0 = r3.get(r12)
            p6.P0 r0 = (p6.P0) r0
            r11.k0(r0)
            int r12 = r12 + (-1)
            goto Lca
        Ld8:
            if (r1 != 0) goto Ldb
            return
        Ldb:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: r6.b.i0(r6.i):void");
    }

    @Override // r6.m
    public e iterator() {
        return new a();
    }

    public final void j0(P0 p02) {
        l0(p02, true);
    }

    public final void k0(P0 p02) {
        l0(p02, false);
    }

    public final void l0(P0 p02, boolean z7) {
        if (p02 instanceof InterfaceC1858l) {
            X5.d dVar = (X5.d) p02;
            n.a aVar = V5.n.f6797o;
            dVar.resumeWith(V5.n.a(V5.o.a(z7 ? F() : H())));
        } else {
            if (p02 instanceof a) {
                ((a) p02).j();
                return;
            }
            throw new IllegalStateException(("Unexpected waiter: " + p02).toString());
        }
    }

    public final boolean m0(long j7) {
        if (S(j7)) {
            return false;
        }
        return !r(j7 & 1152921504606846975L);
    }

    public final boolean n0(Object obj, Object obj2) {
        boolean B7;
        if (obj instanceof a) {
            Intrinsics.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.channels.BufferedChannel.BufferedChannelIterator<E of kotlinx.coroutines.channels.BufferedChannel>");
            return ((a) obj).i(obj2);
        }
        if (!(obj instanceof InterfaceC1858l)) {
            throw new IllegalStateException(("Unexpected receiver type: " + obj).toString());
        }
        Intrinsics.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<E of kotlinx.coroutines.channels.BufferedChannel>");
        InterfaceC1858l interfaceC1858l = (InterfaceC1858l) obj;
        g6.l lVar = this.f19096c;
        B7 = c.B(interfaceC1858l, obj2, lVar != null ? x.a(lVar, obj2, interfaceC1858l.getContext()) : null);
        return B7;
    }

    public final boolean o0(Object obj, i iVar, int i7) {
        if (obj instanceof InterfaceC1858l) {
            Intrinsics.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
            return c.C((InterfaceC1858l) obj, t.f6803a, null, 2, null);
        }
        throw new IllegalStateException(("Unexpected waiter: " + obj).toString());
    }

    public final boolean p0(i iVar, int i7, long j7) {
        F f7;
        F f8;
        Object w7 = iVar.w(i7);
        if ((w7 instanceof P0) && j7 >= f19087f.get(this)) {
            f7 = c.f19110g;
            if (iVar.r(i7, w7, f7)) {
                if (o0(w7, iVar, i7)) {
                    iVar.A(i7, c.f19107d);
                    return true;
                }
                f8 = c.f19113j;
                iVar.A(i7, f8);
                iVar.x(i7, false);
                return false;
            }
        }
        return q0(iVar, i7, j7);
    }

    public final boolean q0(i iVar, int i7, long j7) {
        F f7;
        F f8;
        F f9;
        F f10;
        F f11;
        F f12;
        F f13;
        F f14;
        while (true) {
            Object w7 = iVar.w(i7);
            if (!(w7 instanceof P0)) {
                f9 = c.f19113j;
                if (w7 != f9) {
                    if (w7 != null) {
                        if (w7 != c.f19107d) {
                            f11 = c.f19111h;
                            if (w7 == f11) {
                                break;
                            }
                            f12 = c.f19112i;
                            if (w7 == f12) {
                                break;
                            }
                            f13 = c.f19114k;
                            if (w7 == f13 || w7 == c.z()) {
                                return true;
                            }
                            f14 = c.f19109f;
                            if (w7 != f14) {
                                throw new IllegalStateException(("Unexpected cell state: " + w7).toString());
                            }
                        } else {
                            return true;
                        }
                    } else {
                        f10 = c.f19108e;
                        if (iVar.r(i7, w7, f10)) {
                            return true;
                        }
                    }
                } else {
                    return false;
                }
            } else if (j7 >= f19087f.get(this)) {
                f7 = c.f19110g;
                if (iVar.r(i7, w7, f7)) {
                    if (o0(w7, iVar, i7)) {
                        iVar.A(i7, c.f19107d);
                        return true;
                    }
                    f8 = c.f19113j;
                    iVar.A(i7, f8);
                    iVar.x(i7, false);
                    return false;
                }
            } else if (iVar.r(i7, w7, new o((P0) w7))) {
                return true;
            }
        }
    }

    public final boolean r(long j7) {
        return j7 < D() || j7 < G() + ((long) this.f19095b);
    }

    public final Object r0(i iVar, int i7, long j7, Object obj) {
        F f7;
        F f8;
        F f9;
        Object w7 = iVar.w(i7);
        if (w7 == null) {
            if (j7 >= (f19086e.get(this) & 1152921504606846975L)) {
                if (obj == null) {
                    f9 = c.f19117n;
                    return f9;
                }
                if (iVar.r(i7, w7, obj)) {
                    z();
                    f8 = c.f19116m;
                    return f8;
                }
            }
        } else if (w7 == c.f19107d) {
            f7 = c.f19112i;
            if (iVar.r(i7, w7, f7)) {
                z();
                return iVar.y(i7);
            }
        }
        return s0(iVar, i7, j7, obj);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0039, code lost:
    
        r0 = u6.AbstractC2042l.c(r0, r4);
        r9.x(r3, true);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void s(r6.i r9, long r10) {
        /*
            r8 = this;
            r0 = 0
            r1 = 1
            java.lang.Object r0 = u6.AbstractC2042l.b(r0, r1, r0)
        L6:
            r2 = -1
            if (r9 == 0) goto L67
            int r3 = r6.c.f19105b
            int r3 = r3 - r1
        Lc:
            if (r2 >= r3) goto L60
            long r4 = r9.f19955q
            int r6 = r6.c.f19105b
            long r6 = (long) r6
            long r4 = r4 * r6
            long r6 = (long) r3
            long r4 = r4 + r6
            int r4 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r4 < 0) goto L67
        L1a:
            java.lang.Object r4 = r9.w(r3)
            if (r4 == 0) goto L50
            u6.F r5 = r6.c.k()
            if (r4 != r5) goto L27
            goto L50
        L27:
            boolean r5 = r4 instanceof r6.o
            if (r5 == 0) goto L41
            u6.F r5 = r6.c.z()
            boolean r5 = r9.r(r3, r4, r5)
            if (r5 == 0) goto L1a
            r6.o r4 = (r6.o) r4
            p6.P0 r4 = r4.f19134a
        L39:
            java.lang.Object r0 = u6.AbstractC2042l.c(r0, r4)
            r9.x(r3, r1)
            goto L5d
        L41:
            boolean r5 = r4 instanceof p6.P0
            if (r5 == 0) goto L5d
            u6.F r5 = r6.c.z()
            boolean r5 = r9.r(r3, r4, r5)
            if (r5 == 0) goto L1a
            goto L39
        L50:
            u6.F r5 = r6.c.z()
            boolean r4 = r9.r(r3, r4, r5)
            if (r4 == 0) goto L1a
            r9.p()
        L5d:
            int r3 = r3 + (-1)
            goto Lc
        L60:
            u6.e r9 = r9.g()
            r6.i r9 = (r6.i) r9
            goto L6
        L67:
            if (r0 == 0) goto L8d
            boolean r9 = r0 instanceof java.util.ArrayList
            if (r9 != 0) goto L73
            p6.P0 r0 = (p6.P0) r0
            r8.j0(r0)
            goto L8d
        L73:
            java.lang.String r9 = "null cannot be cast to non-null type java.util.ArrayList<E of kotlinx.coroutines.internal.InlineList>{ kotlin.collections.TypeAliasesKt.ArrayList<E of kotlinx.coroutines.internal.InlineList> }"
            kotlin.jvm.internal.Intrinsics.c(r0, r9)
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            int r9 = r0.size()
            int r9 = r9 - r1
        L7f:
            if (r2 >= r9) goto L8d
            java.lang.Object r10 = r0.get(r9)
            p6.P0 r10 = (p6.P0) r10
            r8.j0(r10)
            int r9 = r9 + (-1)
            goto L7f
        L8d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: r6.b.s(r6.i, long):void");
    }

    public final Object s0(i iVar, int i7, long j7, Object obj) {
        F f7;
        F f8;
        F f9;
        F f10;
        F f11;
        F f12;
        F f13;
        F f14;
        F f15;
        F f16;
        F f17;
        F f18;
        F f19;
        F f20;
        F f21;
        F f22;
        while (true) {
            Object w7 = iVar.w(i7);
            if (w7 != null) {
                f11 = c.f19108e;
                if (w7 != f11) {
                    if (w7 == c.f19107d) {
                        f12 = c.f19112i;
                        if (iVar.r(i7, w7, f12)) {
                            z();
                            return iVar.y(i7);
                        }
                    } else {
                        f13 = c.f19113j;
                        if (w7 == f13) {
                            f14 = c.f19118o;
                            return f14;
                        }
                        f15 = c.f19111h;
                        if (w7 == f15) {
                            f16 = c.f19118o;
                            return f16;
                        }
                        if (w7 == c.z()) {
                            z();
                            f17 = c.f19118o;
                            return f17;
                        }
                        f18 = c.f19110g;
                        if (w7 != f18) {
                            f19 = c.f19109f;
                            if (iVar.r(i7, w7, f19)) {
                                boolean z7 = w7 instanceof o;
                                if (z7) {
                                    w7 = ((o) w7).f19134a;
                                }
                                if (o0(w7, iVar, i7)) {
                                    f22 = c.f19112i;
                                    iVar.A(i7, f22);
                                    z();
                                    return iVar.y(i7);
                                }
                                f20 = c.f19113j;
                                iVar.A(i7, f20);
                                iVar.x(i7, false);
                                if (z7) {
                                    z();
                                }
                                f21 = c.f19118o;
                                return f21;
                            }
                        } else {
                            continue;
                        }
                    }
                }
            }
            if (j7 < (f19086e.get(this) & 1152921504606846975L)) {
                f7 = c.f19111h;
                if (iVar.r(i7, w7, f7)) {
                    z();
                    f8 = c.f19118o;
                    return f8;
                }
            } else {
                if (obj == null) {
                    f9 = c.f19117n;
                    return f9;
                }
                if (iVar.r(i7, w7, obj)) {
                    z();
                    f10 = c.f19116m;
                    return f10;
                }
            }
        }
    }

    public final i t() {
        Object obj = f19092k.get(this);
        i iVar = (i) f19090i.get(this);
        if (iVar.f19955q > ((i) obj).f19955q) {
            obj = iVar;
        }
        i iVar2 = (i) f19091j.get(this);
        if (iVar2.f19955q > ((i) obj).f19955q) {
            obj = iVar2;
        }
        return (i) AbstractC2034d.b((AbstractC2035e) obj);
    }

    public final int t0(i iVar, int i7, Object obj, long j7, Object obj2, boolean z7) {
        F f7;
        F f8;
        F f9;
        iVar.B(i7, obj);
        if (z7) {
            return u0(iVar, i7, obj, j7, obj2, z7);
        }
        Object w7 = iVar.w(i7);
        if (w7 == null) {
            if (r(j7)) {
                if (iVar.r(i7, null, c.f19107d)) {
                    return 1;
                }
            } else {
                if (obj2 == null) {
                    return 3;
                }
                if (iVar.r(i7, null, obj2)) {
                    return 2;
                }
            }
        } else if (w7 instanceof P0) {
            iVar.s(i7);
            if (n0(w7, obj)) {
                f9 = c.f19112i;
                iVar.A(i7, f9);
                c0();
                return 0;
            }
            f7 = c.f19114k;
            Object t7 = iVar.t(i7, f7);
            f8 = c.f19114k;
            if (t7 != f8) {
                iVar.x(i7, true);
            }
            return 5;
        }
        return u0(iVar, i7, obj, j7, obj2, z7);
    }

    /* JADX WARN: Code restructure failed: missing block: B:89:0x01a8, code lost:
    
        r3 = (r6.i) r3.e();
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01af, code lost:
    
        if (r3 != null) goto L84;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0072  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String toString() {
        /*
            Method dump skipped, instructions count: 474
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: r6.b.toString():java.lang.String");
    }

    public boolean u(Throwable th, boolean z7) {
        F f7;
        if (z7) {
            W();
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f19093l;
        f7 = c.f19122s;
        boolean a7 = AbstractC1997b.a(atomicReferenceFieldUpdater, this, f7, th);
        if (z7) {
            X();
        } else {
            Y();
        }
        x();
        a0();
        if (a7) {
            M();
        }
        return a7;
    }

    public final int u0(i iVar, int i7, Object obj, long j7, Object obj2, boolean z7) {
        F f7;
        F f8;
        F f9;
        F f10;
        F f11;
        F f12;
        F f13;
        while (true) {
            Object w7 = iVar.w(i7);
            if (w7 != null) {
                f8 = c.f19108e;
                if (w7 != f8) {
                    f9 = c.f19114k;
                    if (w7 == f9) {
                        iVar.s(i7);
                        return 5;
                    }
                    f10 = c.f19111h;
                    if (w7 == f10) {
                        iVar.s(i7);
                        return 5;
                    }
                    F z8 = c.z();
                    iVar.s(i7);
                    if (w7 == z8) {
                        x();
                        return 4;
                    }
                    if (w7 instanceof o) {
                        w7 = ((o) w7).f19134a;
                    }
                    if (n0(w7, obj)) {
                        f13 = c.f19112i;
                        iVar.A(i7, f13);
                        c0();
                        return 0;
                    }
                    f11 = c.f19114k;
                    Object t7 = iVar.t(i7, f11);
                    f12 = c.f19114k;
                    if (t7 != f12) {
                        iVar.x(i7, true);
                    }
                    return 5;
                }
                if (iVar.r(i7, w7, c.f19107d)) {
                    return 1;
                }
            } else if (!r(j7) || z7) {
                if (z7) {
                    f7 = c.f19113j;
                    if (iVar.r(i7, null, f7)) {
                        iVar.x(i7, false);
                        return 4;
                    }
                } else {
                    if (obj2 == null) {
                        return 3;
                    }
                    if (iVar.r(i7, null, obj2)) {
                        return 2;
                    }
                }
            } else if (iVar.r(i7, null, c.f19107d)) {
                return 1;
            }
        }
    }

    public final void v(long j7) {
        i0(w(j7));
    }

    public final void v0(long j7) {
        long j8;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f19087f;
        do {
            j8 = atomicLongFieldUpdater.get(this);
            if (j8 >= j7) {
                return;
            }
        } while (!f19087f.compareAndSet(this, j8, j7));
    }

    public final i w(long j7) {
        i t7 = t();
        if (T()) {
            long V6 = V(t7);
            if (V6 != -1) {
                y(V6);
            }
        }
        s(t7, j7);
        return t7;
    }

    public final void w0(long j7) {
        long j8;
        long w7;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f19086e;
        do {
            j8 = atomicLongFieldUpdater.get(this);
            long j9 = 1152921504606846975L & j8;
            if (j9 >= j7) {
                return;
            } else {
                w7 = c.w(j9, (int) (j8 >> 60));
            }
        } while (!f19086e.compareAndSet(this, j8, w7));
    }

    public final void x() {
        R();
    }

    public final void x0(long j7) {
        int i7;
        long j8;
        long v7;
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long v8;
        long j9;
        long v9;
        if (U()) {
            return;
        }
        while (D() <= j7) {
        }
        i7 = c.f19106c;
        for (int i8 = 0; i8 < i7; i8++) {
            long D7 = D();
            if (D7 == (4611686018427387903L & f19089h.get(this)) && D7 == D()) {
                return;
            }
        }
        AtomicLongFieldUpdater atomicLongFieldUpdater2 = f19089h;
        do {
            j8 = atomicLongFieldUpdater2.get(this);
            v7 = c.v(j8 & 4611686018427387903L, true);
        } while (!atomicLongFieldUpdater2.compareAndSet(this, j8, v7));
        while (true) {
            long D8 = D();
            atomicLongFieldUpdater = f19089h;
            long j10 = atomicLongFieldUpdater.get(this);
            long j11 = j10 & 4611686018427387903L;
            boolean z7 = (4611686018427387904L & j10) != 0;
            if (D8 == j11 && D8 == D()) {
                break;
            } else if (!z7) {
                v8 = c.v(j11, true);
                atomicLongFieldUpdater.compareAndSet(this, j10, v8);
            }
        }
        do {
            j9 = atomicLongFieldUpdater.get(this);
            v9 = c.v(j9 & 4611686018427387903L, false);
        } while (!atomicLongFieldUpdater.compareAndSet(this, j9, v9));
    }

    public final void y(long j7) {
        F f7;
        O d7;
        i iVar = (i) f19091j.get(this);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f19087f;
            long j8 = atomicLongFieldUpdater.get(this);
            if (j7 < Math.max(this.f19095b + j8, D())) {
                return;
            }
            if (atomicLongFieldUpdater.compareAndSet(this, j8, j8 + 1)) {
                int i7 = c.f19105b;
                long j9 = j8 / i7;
                int i8 = (int) (j8 % i7);
                if (iVar.f19955q != j9) {
                    i B7 = B(j9, iVar);
                    if (B7 == null) {
                        continue;
                    } else {
                        iVar = B7;
                    }
                }
                Object r02 = r0(iVar, i8, j8, null);
                f7 = c.f19118o;
                if (r02 != f7) {
                    iVar.b();
                    g6.l lVar = this.f19096c;
                    if (lVar != null && (d7 = x.d(lVar, r02, null, 2, null)) != null) {
                        throw d7;
                    }
                } else if (j8 < I()) {
                    iVar.b();
                }
            }
        }
    }

    public final void z() {
        if (U()) {
            return;
        }
        i iVar = (i) f19092k.get(this);
        while (true) {
            long andIncrement = f19088g.getAndIncrement(this);
            int i7 = c.f19105b;
            long j7 = andIncrement / i7;
            long I6 = I();
            long j8 = iVar.f19955q;
            if (I6 <= andIncrement) {
                if (j8 < j7 && iVar.e() != null) {
                    Z(j7, iVar);
                }
                L(this, 0L, 1, null);
                return;
            }
            if (j8 != j7) {
                i A7 = A(j7, iVar, andIncrement);
                if (A7 == null) {
                    continue;
                } else {
                    iVar = A7;
                }
            }
            boolean p02 = p0(iVar, (int) (andIncrement % i7), andIncrement);
            L(this, 0L, 1, null);
            if (p02) {
                return;
            }
        }
    }

    public void a0() {
    }

    public void c0() {
    }

    public void d0() {
    }
}
