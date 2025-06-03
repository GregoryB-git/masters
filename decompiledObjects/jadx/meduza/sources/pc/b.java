package pc;

import b.a0;
import d2.h0;
import ec.v;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import n7.w;
import nc.i2;
import p2.m0;
import pc.j;
import pc.o;
import uc.g;

/* loaded from: classes.dex */
public class b<E> implements f<E> {

    /* renamed from: c, reason: collision with root package name */
    public static final AtomicLongFieldUpdater f13117c = AtomicLongFieldUpdater.newUpdater(b.class, "sendersAndCloseStatus");

    /* renamed from: d, reason: collision with root package name */
    public static final AtomicLongFieldUpdater f13118d = AtomicLongFieldUpdater.newUpdater(b.class, "receivers");

    /* renamed from: e, reason: collision with root package name */
    public static final AtomicLongFieldUpdater f13119e = AtomicLongFieldUpdater.newUpdater(b.class, "bufferEnd");
    public static final AtomicLongFieldUpdater f = AtomicLongFieldUpdater.newUpdater(b.class, "completedExpandBuffersAndPauseFlag");

    /* renamed from: o, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f13120o = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "sendSegment");

    /* renamed from: p, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f13121p = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "receiveSegment");

    /* renamed from: q, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f13122q = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "bufferEndSegment");

    /* renamed from: r, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f13123r = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "_closeCause");

    /* renamed from: s, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f13124s = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "closeHandler");
    private volatile Object _closeCause;

    /* renamed from: a, reason: collision with root package name */
    public final int f13125a;

    /* renamed from: b, reason: collision with root package name */
    public final dc.l<E, rb.h> f13126b;
    private volatile long bufferEnd;
    private volatile Object bufferEndSegment;
    private volatile Object closeHandler;
    private volatile long completedExpandBuffersAndPauseFlag;
    private volatile Object receiveSegment;
    private volatile long receivers;
    private volatile Object sendSegment;
    private volatile long sendersAndCloseStatus;

    public final class a implements h<E>, i2 {

        /* renamed from: a, reason: collision with root package name */
        public Object f13127a = pc.e.f13155p;

        /* renamed from: b, reason: collision with root package name */
        public nc.l<? super Boolean> f13128b;

        public a() {
        }

        @Override // pc.h
        public final Object a(qc.g gVar) {
            k<E> kVar;
            Boolean bool;
            k<E> kVar2;
            b<E> bVar = b.this;
            k<E> kVar3 = (k) b.f13121p.get(bVar);
            while (!bVar.x()) {
                long andIncrement = b.f13118d.getAndIncrement(bVar);
                long j10 = pc.e.f13142b;
                long j11 = andIncrement / j10;
                int i10 = (int) (andIncrement % j10);
                if (kVar3.f14367c != j11) {
                    k<E> o10 = bVar.o(j11, kVar3);
                    if (o10 == null) {
                        continue;
                    } else {
                        kVar = o10;
                    }
                } else {
                    kVar = kVar3;
                }
                Object I = bVar.I(kVar, i10, andIncrement, null);
                h0 h0Var = pc.e.f13152m;
                if (I == h0Var) {
                    throw new IllegalStateException("unreachable".toString());
                }
                h0 h0Var2 = pc.e.f13154o;
                if (I != h0Var2) {
                    if (I != pc.e.f13153n) {
                        kVar.a();
                        this.f13127a = I;
                        return Boolean.TRUE;
                    }
                    b<E> bVar2 = b.this;
                    nc.l<? super Boolean> u10 = a0.u(m0.P(gVar));
                    try {
                        this.f13128b = u10;
                        Object I2 = bVar2.I(kVar, i10, andIncrement, this);
                        if (I2 == h0Var) {
                            c(kVar, i10);
                        } else {
                            sc.o oVar = null;
                            if (I2 == h0Var2) {
                                if (andIncrement < bVar2.u()) {
                                    kVar.a();
                                }
                                k<E> kVar4 = (k) b.f13121p.get(bVar2);
                                while (true) {
                                    if (bVar2.x()) {
                                        nc.l<? super Boolean> lVar = this.f13128b;
                                        ec.i.b(lVar);
                                        this.f13128b = null;
                                        this.f13127a = pc.e.f13151l;
                                        Throwable q10 = b.this.q();
                                        lVar.resumeWith(q10 == null ? Boolean.FALSE : rb.f.a(q10));
                                    } else {
                                        long andIncrement2 = b.f13118d.getAndIncrement(bVar2);
                                        long j12 = pc.e.f13142b;
                                        long j13 = andIncrement2 / j12;
                                        int i11 = (int) (andIncrement2 % j12);
                                        if (kVar4.f14367c != j13) {
                                            k<E> o11 = bVar2.o(j13, kVar4);
                                            if (o11 != null) {
                                                kVar2 = o11;
                                            }
                                        } else {
                                            kVar2 = kVar4;
                                        }
                                        Object I3 = bVar2.I(kVar2, i11, andIncrement2, this);
                                        if (I3 == pc.e.f13152m) {
                                            c(kVar2, i11);
                                            break;
                                        }
                                        if (I3 == pc.e.f13154o) {
                                            if (andIncrement2 < bVar2.u()) {
                                                kVar2.a();
                                            }
                                            kVar4 = kVar2;
                                        } else {
                                            if (I3 == pc.e.f13153n) {
                                                throw new IllegalStateException("unexpected".toString());
                                            }
                                            kVar2.a();
                                            this.f13127a = I3;
                                            this.f13128b = null;
                                            bool = Boolean.TRUE;
                                            dc.l<E, rb.h> lVar2 = bVar2.f13126b;
                                            if (lVar2 != null) {
                                                oVar = new sc.o(lVar2, I3, u10.f11516e);
                                            }
                                        }
                                    }
                                }
                            } else {
                                kVar.a();
                                this.f13127a = I2;
                                this.f13128b = null;
                                bool = Boolean.TRUE;
                                dc.l<E, rb.h> lVar3 = bVar2.f13126b;
                                if (lVar3 != null) {
                                    oVar = new sc.o(lVar3, I2, u10.f11516e);
                                }
                            }
                            u10.b(bool, oVar);
                        }
                        Object s10 = u10.s();
                        vb.a aVar = vb.a.f16085a;
                        return s10;
                    } catch (Throwable th) {
                        u10.A();
                        throw th;
                    }
                }
                if (andIncrement < bVar.u()) {
                    kVar.a();
                }
                kVar3 = kVar;
            }
            this.f13127a = pc.e.f13151l;
            Throwable q11 = b.this.q();
            if (q11 == null) {
                return Boolean.FALSE;
            }
            int i12 = sc.u.f14368a;
            throw q11;
        }

        @Override // nc.i2
        public final void c(sc.t<?> tVar, int i10) {
            nc.l<? super Boolean> lVar = this.f13128b;
            if (lVar != null) {
                lVar.c(tVar, i10);
            }
        }

        @Override // pc.h
        public final E next() {
            E e10 = (E) this.f13127a;
            h0 h0Var = pc.e.f13155p;
            if (!(e10 != h0Var)) {
                throw new IllegalStateException("`hasNext()` has not been invoked".toString());
            }
            this.f13127a = h0Var;
            if (e10 != pc.e.f13151l) {
                return e10;
            }
            b<E> bVar = b.this;
            AtomicLongFieldUpdater atomicLongFieldUpdater = b.f13117c;
            Throwable r10 = bVar.r();
            int i10 = sc.u.f14368a;
            throw r10;
        }
    }

    /* renamed from: pc.b$b, reason: collision with other inner class name */
    public static final class C0197b implements i2 {
        @Override // nc.i2
        public final void c(sc.t<?> tVar, int i10) {
            throw null;
        }
    }

    public static final class c extends ec.j implements dc.q<uc.f<?>, Object, Object, dc.l<? super Throwable, ? extends rb.h>> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b<E> f13130a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(b<E> bVar) {
            super(3);
            this.f13130a = bVar;
        }

        @Override // dc.q
        public final Object f(qc.f fVar, Object obj, Object obj2) {
            return new pc.c(obj2, this.f13130a, (uc.f) fVar);
        }
    }

    @wb.e(c = "kotlinx.coroutines.channels.BufferedChannel", f = "BufferedChannel.kt", l = {739}, m = "receiveCatching-JP2dKIU$suspendImpl")
    public static final class d<E> extends wb.c {

        /* renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f13131a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ b<E> f13132b;

        /* renamed from: c, reason: collision with root package name */
        public int f13133c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(b<E> bVar, ub.e<? super d> eVar) {
            super(eVar);
            this.f13132b = bVar;
        }

        @Override // wb.a
        public final Object invokeSuspend(Object obj) {
            this.f13131a = obj;
            this.f13133c |= Integer.MIN_VALUE;
            Object D = b.D(this.f13132b, this);
            return D == vb.a.f16085a ? D : new j(D);
        }
    }

    @wb.e(c = "kotlinx.coroutines.channels.BufferedChannel", f = "BufferedChannel.kt", l = {3056}, m = "receiveCatchingOnNoWaiterSuspend-GKJJFZk")
    public static final class e extends wb.c {

        /* renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f13134a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ b<E> f13135b;

        /* renamed from: c, reason: collision with root package name */
        public int f13136c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(b<E> bVar, ub.e<? super e> eVar) {
            super(eVar);
            this.f13135b = bVar;
        }

        @Override // wb.a
        public final Object invokeSuspend(Object obj) {
            this.f13134a = obj;
            this.f13136c |= Integer.MIN_VALUE;
            b<E> bVar = this.f13135b;
            AtomicLongFieldUpdater atomicLongFieldUpdater = b.f13117c;
            Object E = bVar.E(null, 0, 0L, this);
            return E == vb.a.f16085a ? E : new j(E);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b(int i10, dc.l<? super E, rb.h> lVar) {
        this.f13125a = i10;
        this.f13126b = lVar;
        if (!(i10 >= 0)) {
            throw new IllegalArgumentException(a0.j.h("Invalid channel capacity: ", i10, ", should be >=0").toString());
        }
        k<Object> kVar = pc.e.f13141a;
        this.bufferEnd = i10 != 0 ? i10 != Integer.MAX_VALUE ? i10 : Long.MAX_VALUE : 0L;
        this.completedExpandBuffersAndPauseFlag = p();
        k<Object> kVar2 = new k<>(0L, null, this, 3);
        this.sendSegment = kVar2;
        this.receiveSegment = kVar2;
        if (z()) {
            kVar2 = pc.e.f13141a;
            ec.i.c(kVar2, "null cannot be cast to non-null type kotlinx.coroutines.channels.ChannelSegment<E of kotlinx.coroutines.channels.BufferedChannel>");
        }
        this.bufferEndSegment = kVar2;
        if (lVar != 0) {
            new c(this);
        }
        this._closeCause = pc.e.f13158s;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static <E> java.lang.Object D(pc.b<E> r14, ub.e<? super pc.j<? extends E>> r15) {
        /*
            boolean r0 = r15 instanceof pc.b.d
            if (r0 == 0) goto L13
            r0 = r15
            pc.b$d r0 = (pc.b.d) r0
            int r1 = r0.f13133c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f13133c = r1
            goto L18
        L13:
            pc.b$d r0 = new pc.b$d
            r0.<init>(r14, r15)
        L18:
            r6 = r0
            java.lang.Object r15 = r6.f13131a
            vb.a r0 = vb.a.f16085a
            int r1 = r6.f13133c
            r2 = 1
            if (r1 == 0) goto L35
            if (r1 != r2) goto L2d
            rb.f.b(r15)
            pc.j r15 = (pc.j) r15
            java.lang.Object r14 = r15.f13164a
            goto L9d
        L2d:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r15)
            throw r14
        L35:
            rb.f.b(r15)
            r15 = 0
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = pc.b.f13121p
            java.lang.Object r1 = r1.get(r14)
            pc.k r1 = (pc.k) r1
        L41:
            boolean r3 = r14.x()
            if (r3 == 0) goto L51
            java.lang.Throwable r14 = r14.q()
            pc.j$a r15 = new pc.j$a
            r15.<init>(r14)
            goto La3
        L51:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r3 = pc.b.f13118d
            long r4 = r3.getAndIncrement(r14)
            int r3 = pc.e.f13142b
            long r7 = (long) r3
            long r7 = r4 / r7
            long r9 = (long) r3
            long r9 = r4 % r9
            int r3 = (int) r9
            long r9 = r1.f14367c
            int r9 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r9 == 0) goto L6f
            pc.k r7 = r14.o(r7, r1)
            if (r7 != 0) goto L6d
            goto L41
        L6d:
            r13 = r7
            goto L70
        L6f:
            r13 = r1
        L70:
            r7 = r14
            r8 = r13
            r9 = r3
            r10 = r4
            r12 = r15
            java.lang.Object r1 = r7.I(r8, r9, r10, r12)
            d2.h0 r7 = pc.e.f13152m
            if (r1 == r7) goto La4
            d2.h0 r7 = pc.e.f13154o
            if (r1 != r7) goto L8e
            long r7 = r14.u()
            int r1 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r1 >= 0) goto L8c
            r13.a()
        L8c:
            r1 = r13
            goto L41
        L8e:
            d2.h0 r15 = pc.e.f13153n
            if (r1 != r15) goto L9f
            r6.f13133c = r2
            r1 = r14
            r2 = r13
            java.lang.Object r14 = r1.E(r2, r3, r4, r6)
            if (r14 != r0) goto L9d
            return r0
        L9d:
            r15 = r14
            goto La3
        L9f:
            r13.a()
            r15 = r1
        La3:
            return r15
        La4:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r15 = "unexpected"
            java.lang.String r15 = r15.toString()
            r14.<init>(r15)
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: pc.b.D(pc.b, ub.e):java.lang.Object");
    }

    public static final k b(b bVar, long j10, k kVar) {
        Object F;
        long j11;
        long j12;
        boolean z10;
        bVar.getClass();
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f13120o;
        k<Object> kVar2 = pc.e.f13141a;
        pc.d dVar = pc.d.f13140a;
        do {
            F = m0.F(kVar, j10, dVar);
            if (m0.R(F)) {
                break;
            }
            sc.t L = m0.L(F);
            while (true) {
                sc.t tVar = (sc.t) atomicReferenceFieldUpdater.get(bVar);
                z10 = false;
                if (tVar.f14367c >= L.f14367c) {
                    break;
                }
                if (!L.i()) {
                    break;
                }
                while (true) {
                    if (atomicReferenceFieldUpdater.compareAndSet(bVar, tVar, L)) {
                        z10 = true;
                        break;
                    }
                    if (atomicReferenceFieldUpdater.get(bVar) != tVar) {
                        break;
                    }
                }
                if (z10) {
                    if (tVar.e()) {
                        tVar.d();
                    }
                } else if (L.e()) {
                    L.d();
                }
            }
            z10 = true;
        } while (!z10);
        if (m0.R(F)) {
            bVar.m();
            if (kVar.f14367c * pc.e.f13142b >= bVar.s()) {
                return null;
            }
        } else {
            kVar = (k) m0.L(F);
            long j13 = kVar.f14367c;
            if (j13 <= j10) {
                return kVar;
            }
            long j14 = j13 * pc.e.f13142b;
            AtomicLongFieldUpdater atomicLongFieldUpdater = f13117c;
            do {
                j11 = atomicLongFieldUpdater.get(bVar);
                j12 = 1152921504606846975L & j11;
                if (j12 >= j14) {
                    break;
                }
                k<Object> kVar3 = pc.e.f13141a;
            } while (!f13117c.compareAndSet(bVar, j11, (((int) (j11 >> 60)) << 60) + j12));
            if (kVar.f14367c * pc.e.f13142b >= bVar.s()) {
                return null;
            }
        }
        kVar.a();
        return null;
    }

    public static final int e(b bVar, k kVar, int i10, Object obj, long j10, Object obj2, boolean z10) {
        bVar.getClass();
        kVar.n(i10, obj);
        if (!z10) {
            Object k10 = kVar.k(i10);
            if (k10 == null) {
                if (bVar.f(j10)) {
                    if (kVar.j(i10, null, pc.e.f13144d)) {
                        return 1;
                    }
                } else {
                    if (obj2 == null) {
                        return 3;
                    }
                    if (kVar.j(i10, null, obj2)) {
                        return 2;
                    }
                }
            } else if (k10 instanceof i2) {
                kVar.n(i10, null);
                if (bVar.G(k10, obj)) {
                    kVar.o(i10, pc.e.f13148i);
                    return 0;
                }
                h0 h0Var = pc.e.f13150k;
                if (kVar.f.getAndSet((i10 * 2) + 1, h0Var) != h0Var) {
                    kVar.l(i10, true);
                }
                return 5;
            }
        }
        return bVar.J(kVar, i10, obj, j10, obj2, z10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0055, code lost:
    
        r1 = true;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A(long r5, pc.k<E> r7) {
        /*
            r4 = this;
        L0:
            long r0 = r7.f14367c
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 >= 0) goto L11
            sc.c r0 = r7.b()
            pc.k r0 = (pc.k) r0
            if (r0 != 0) goto Lf
            goto L11
        Lf:
            r7 = r0
            goto L0
        L11:
            boolean r5 = r7.c()
            if (r5 == 0) goto L22
            sc.c r5 = r7.b()
            pc.k r5 = (pc.k) r5
            if (r5 != 0) goto L20
            goto L22
        L20:
            r7 = r5
            goto L11
        L22:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = pc.b.f13122q
        L24:
            java.lang.Object r6 = r5.get(r4)
            sc.t r6 = (sc.t) r6
            long r0 = r6.f14367c
            long r2 = r7.f14367c
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r1 = 0
            r2 = 1
            if (r0 < 0) goto L35
            goto L55
        L35:
            boolean r0 = r7.i()
            if (r0 != 0) goto L3c
            goto L56
        L3c:
            boolean r0 = r5.compareAndSet(r4, r6, r7)
            if (r0 == 0) goto L44
            r1 = r2
            goto L4a
        L44:
            java.lang.Object r0 = r5.get(r4)
            if (r0 == r6) goto L3c
        L4a:
            if (r1 == 0) goto L59
            boolean r5 = r6.e()
            if (r5 == 0) goto L55
            r6.d()
        L55:
            r1 = r2
        L56:
            if (r1 == 0) goto L11
            return
        L59:
            boolean r6 = r7.e()
            if (r6 == 0) goto L24
            r7.d()
            goto L24
        */
        throw new UnsupportedOperationException("Method not decompiled: pc.b.A(long, pc.k):void");
    }

    public final Object B(E e10, ub.e<? super rb.h> eVar) {
        Throwable t;
        nc.l lVar = new nc.l(1, m0.P(eVar));
        lVar.t();
        dc.l<E, rb.h> lVar2 = this.f13126b;
        if (lVar2 == null || (t = m0.k(lVar2, e10, null)) == null) {
            t = t();
        } else {
            x6.b.e(t, t());
        }
        lVar.resumeWith(rb.f.a(t));
        Object s10 = lVar.s();
        return s10 == vb.a.f16085a ? s10 : rb.h.f13851a;
    }

    public final Object C(ub.e<? super E> eVar) {
        sc.o oVar;
        k<E> kVar = (k) f13121p.get(this);
        while (!x()) {
            long andIncrement = f13118d.getAndIncrement(this);
            long j10 = pc.e.f13142b;
            long j11 = andIncrement / j10;
            int i10 = (int) (andIncrement % j10);
            if (kVar.f14367c != j11) {
                k<E> o10 = o(j11, kVar);
                if (o10 == null) {
                    continue;
                } else {
                    kVar = o10;
                }
            }
            Object I = I(kVar, i10, andIncrement, null);
            h0 h0Var = pc.e.f13152m;
            if (I == h0Var) {
                throw new IllegalStateException("unexpected".toString());
            }
            h0 h0Var2 = pc.e.f13154o;
            if (I != h0Var2) {
                if (I != pc.e.f13153n) {
                    kVar.a();
                    return I;
                }
                nc.l u10 = a0.u(m0.P(eVar));
                try {
                    Object I2 = I(kVar, i10, andIncrement, u10);
                    if (I2 == h0Var) {
                        u10.c(kVar, i10);
                    } else {
                        sc.o oVar2 = null;
                        if (I2 == h0Var2) {
                            if (andIncrement < u()) {
                                kVar.a();
                            }
                            k<E> kVar2 = (k) f13121p.get(this);
                            while (true) {
                                if (x()) {
                                    u10.resumeWith(rb.f.a(r()));
                                    break;
                                }
                                long andIncrement2 = f13118d.getAndIncrement(this);
                                long j12 = pc.e.f13142b;
                                long j13 = andIncrement2 / j12;
                                int i11 = (int) (andIncrement2 % j12);
                                if (kVar2.f14367c != j13) {
                                    k<E> o11 = o(j13, kVar2);
                                    if (o11 != null) {
                                        kVar2 = o11;
                                    }
                                }
                                I2 = I(kVar2, i11, andIncrement2, u10);
                                if (I2 == pc.e.f13152m) {
                                    u10.c(kVar2, i11);
                                    break;
                                }
                                if (I2 == pc.e.f13154o) {
                                    if (andIncrement2 < u()) {
                                        kVar2.a();
                                    }
                                } else {
                                    if (I2 == pc.e.f13153n) {
                                        throw new IllegalStateException("unexpected".toString());
                                    }
                                    kVar2.a();
                                    dc.l<E, rb.h> lVar = this.f13126b;
                                    if (lVar != null) {
                                        oVar = new sc.o(lVar, I2, u10.f11516e);
                                    }
                                }
                            }
                        } else {
                            kVar.a();
                            dc.l<E, rb.h> lVar2 = this.f13126b;
                            if (lVar2 != null) {
                                oVar = new sc.o(lVar2, I2, u10.f11516e);
                                oVar2 = oVar;
                            }
                            u10.b(I2, oVar2);
                        }
                    }
                    Object s10 = u10.s();
                    vb.a aVar = vb.a.f16085a;
                    return s10;
                } catch (Throwable th) {
                    u10.A();
                    throw th;
                }
            }
            if (andIncrement < u()) {
                kVar.a();
            }
        }
        Throwable r10 = r();
        int i12 = sc.u.f14368a;
        throw r10;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object E(pc.k<E> r10, int r11, long r12, ub.e<? super pc.j<? extends E>> r14) {
        /*
            Method dump skipped, instructions count: 277
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: pc.b.E(pc.k, int, long, ub.e):java.lang.Object");
    }

    public final void F(i2 i2Var, boolean z10) {
        ub.e eVar;
        Object jVar;
        if (i2Var instanceof C0197b) {
            ((C0197b) i2Var).getClass();
            throw null;
        }
        if (i2Var instanceof nc.k) {
            eVar = (ub.e) i2Var;
            jVar = rb.f.a(z10 ? r() : t());
        } else {
            if (!(i2Var instanceof r)) {
                if (!(i2Var instanceof a)) {
                    if (i2Var instanceof uc.f) {
                        ((uc.f) i2Var).e(this, pc.e.f13151l);
                        return;
                    }
                    throw new IllegalStateException(("Unexpected waiter: " + i2Var).toString());
                }
                a aVar = (a) i2Var;
                nc.l<? super Boolean> lVar = aVar.f13128b;
                ec.i.b(lVar);
                aVar.f13128b = null;
                aVar.f13127a = pc.e.f13151l;
                Throwable q10 = b.this.q();
                lVar.resumeWith(q10 == null ? Boolean.FALSE : rb.f.a(q10));
                return;
            }
            eVar = ((r) i2Var).f13172a;
            jVar = new j(new j.a(q()));
        }
        eVar.resumeWith(jVar);
    }

    public final boolean G(Object obj, E e10) {
        if (obj instanceof uc.f) {
            return ((uc.f) obj).e(this, e10);
        }
        if (obj instanceof r) {
            ec.i.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.channels.ReceiveCatching<E of kotlinx.coroutines.channels.BufferedChannel>");
            nc.l<j<? extends E>> lVar = ((r) obj).f13172a;
            j jVar = new j(e10);
            dc.l<E, rb.h> lVar2 = this.f13126b;
            return pc.e.a(lVar, jVar, lVar2 != null ? new sc.o(lVar2, e10, lVar.f11516e) : null);
        }
        if (obj instanceof a) {
            ec.i.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.channels.BufferedChannel.BufferedChannelIterator<E of kotlinx.coroutines.channels.BufferedChannel>");
            a aVar = (a) obj;
            nc.l<? super Boolean> lVar3 = aVar.f13128b;
            ec.i.b(lVar3);
            aVar.f13128b = null;
            aVar.f13127a = e10;
            Boolean bool = Boolean.TRUE;
            dc.l<E, rb.h> lVar4 = b.this.f13126b;
            return pc.e.a(lVar3, bool, lVar4 != null ? new sc.o(lVar4, e10, lVar3.f11516e) : null);
        }
        if (obj instanceof nc.k) {
            ec.i.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<E of kotlinx.coroutines.channels.BufferedChannel>");
            nc.k kVar = (nc.k) obj;
            dc.l<E, rb.h> lVar5 = this.f13126b;
            return pc.e.a(kVar, e10, lVar5 != null ? new sc.o(lVar5, e10, kVar.getContext()) : null);
        }
        throw new IllegalStateException(("Unexpected receiver type: " + obj).toString());
    }

    public final boolean H(Object obj, k<E> kVar, int i10) {
        if (obj instanceof nc.k) {
            ec.i.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
            return pc.e.a((nc.k) obj, rb.h.f13851a, null);
        }
        if (!(obj instanceof uc.f)) {
            if (obj instanceof C0197b) {
                ((C0197b) obj).getClass();
                pc.e.a(null, Boolean.TRUE, null);
                throw null;
            }
            throw new IllegalStateException(("Unexpected waiter: " + obj).toString());
        }
        ec.i.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectImplementation<*>");
        rb.h hVar = rb.h.f13851a;
        int i11 = ((uc.e) obj).i(this);
        g.a aVar = uc.g.f15175a;
        char c10 = 3;
        if (i11 == 0) {
            c10 = 1;
        } else if (i11 == 1) {
            c10 = 2;
        } else if (i11 != 2) {
            if (i11 != 3) {
                throw new IllegalStateException(("Unexpected internal result: " + i11).toString());
            }
            c10 = 4;
        }
        if (c10 == 2) {
            kVar.n(i10, null);
        }
        return c10 == 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00a6, code lost:
    
        n();
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:?, code lost:
    
        return pc.e.f13154o;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0081, code lost:
    
        n();
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:?, code lost:
    
        return r6.m(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0090, code lost:
    
        if (r8 != false) goto L56;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object I(pc.k<E> r6, int r7, long r8, java.lang.Object r10) {
        /*
            r5 = this;
            java.lang.Object r0 = r6.k(r7)
            r1 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            if (r0 != 0) goto L27
            java.util.concurrent.atomic.AtomicLongFieldUpdater r3 = pc.b.f13117c
            long r3 = r3.get(r5)
            long r3 = r3 & r1
            int r3 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r3 < 0) goto L3b
            if (r10 != 0) goto L1b
            d2.h0 r6 = pc.e.f13153n
            return r6
        L1b:
            boolean r0 = r6.j(r7, r0, r10)
            if (r0 == 0) goto L3b
            r5.n()
            d2.h0 r6 = pc.e.f13152m
            return r6
        L27:
            d2.h0 r3 = pc.e.f13144d
            if (r0 != r3) goto L3b
            d2.h0 r3 = pc.e.f13148i
            boolean r0 = r6.j(r7, r0, r3)
            if (r0 == 0) goto L3b
            r5.n()
            java.lang.Object r6 = r6.m(r7)
            return r6
        L3b:
            java.lang.Object r0 = r6.k(r7)
            if (r0 == 0) goto L93
            d2.h0 r3 = pc.e.f13145e
            if (r0 != r3) goto L46
            goto L93
        L46:
            d2.h0 r3 = pc.e.f13144d
            if (r0 != r3) goto L53
            d2.h0 r3 = pc.e.f13148i
            boolean r0 = r6.j(r7, r0, r3)
            if (r0 == 0) goto L3b
            goto L81
        L53:
            d2.h0 r3 = pc.e.f13149j
            if (r0 != r3) goto L58
            goto La9
        L58:
            d2.h0 r4 = pc.e.f13147h
            if (r0 != r4) goto L5d
            goto La9
        L5d:
            d2.h0 r4 = pc.e.f13151l
            if (r0 != r4) goto L62
            goto La6
        L62:
            d2.h0 r4 = pc.e.f13146g
            if (r0 == r4) goto L3b
            d2.h0 r4 = pc.e.f
            boolean r4 = r6.j(r7, r0, r4)
            if (r4 == 0) goto L3b
            boolean r8 = r0 instanceof pc.u
            if (r8 == 0) goto L76
            pc.u r0 = (pc.u) r0
            nc.i2 r0 = r0.f13173a
        L76:
            boolean r9 = r5.H(r0, r6, r7)
            if (r9 == 0) goto L89
            d2.h0 r8 = pc.e.f13148i
            r6.o(r7, r8)
        L81:
            r5.n()
            java.lang.Object r6 = r6.m(r7)
            goto Lbc
        L89:
            r6.o(r7, r3)
            r9 = 0
            r6.l(r7, r9)
            if (r8 == 0) goto La9
            goto La6
        L93:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r3 = pc.b.f13117c
            long r3 = r3.get(r5)
            long r3 = r3 & r1
            int r3 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r3 >= 0) goto Lac
            d2.h0 r3 = pc.e.f13147h
            boolean r0 = r6.j(r7, r0, r3)
            if (r0 == 0) goto L3b
        La6:
            r5.n()
        La9:
            d2.h0 r6 = pc.e.f13154o
            goto Lbc
        Lac:
            if (r10 != 0) goto Lb1
            d2.h0 r6 = pc.e.f13153n
            goto Lbc
        Lb1:
            boolean r0 = r6.j(r7, r0, r10)
            if (r0 == 0) goto L3b
            r5.n()
            d2.h0 r6 = pc.e.f13152m
        Lbc:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: pc.b.I(pc.k, int, long, java.lang.Object):java.lang.Object");
    }

    public final int J(k<E> kVar, int i10, E e10, long j10, Object obj, boolean z10) {
        while (true) {
            Object k10 = kVar.k(i10);
            if (k10 == null) {
                if (!f(j10) || z10) {
                    if (z10) {
                        if (kVar.j(i10, null, pc.e.f13149j)) {
                            kVar.l(i10, false);
                            return 4;
                        }
                    } else {
                        if (obj == null) {
                            return 3;
                        }
                        if (kVar.j(i10, null, obj)) {
                            return 2;
                        }
                    }
                } else if (kVar.j(i10, null, pc.e.f13144d)) {
                    return 1;
                }
            } else {
                if (k10 != pc.e.f13145e) {
                    h0 h0Var = pc.e.f13150k;
                    if (k10 == h0Var) {
                        kVar.n(i10, null);
                        return 5;
                    }
                    if (k10 == pc.e.f13147h) {
                        kVar.n(i10, null);
                        return 5;
                    }
                    if (k10 == pc.e.f13151l) {
                        kVar.n(i10, null);
                        m();
                        return 4;
                    }
                    kVar.n(i10, null);
                    if (k10 instanceof u) {
                        k10 = ((u) k10).f13173a;
                    }
                    if (G(k10, e10)) {
                        kVar.o(i10, pc.e.f13148i);
                        return 0;
                    }
                    if (kVar.f.getAndSet((i10 * 2) + 1, h0Var) != h0Var) {
                        kVar.l(i10, true);
                    }
                    return 5;
                }
                if (kVar.j(i10, k10, pc.e.f13144d)) {
                    return 1;
                }
            }
        }
    }

    public final void K(long j10) {
        long j11;
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j12;
        if (z()) {
            return;
        }
        while (p() <= j10) {
        }
        int i10 = pc.e.f13143c;
        for (int i11 = 0; i11 < i10; i11++) {
            long p10 = p();
            if (p10 == (f.get(this) & 4611686018427387903L) && p10 == p()) {
                return;
            }
        }
        AtomicLongFieldUpdater atomicLongFieldUpdater2 = f;
        do {
            j11 = atomicLongFieldUpdater2.get(this);
        } while (!atomicLongFieldUpdater2.compareAndSet(this, j11, 4611686018427387904L + (j11 & 4611686018427387903L)));
        while (true) {
            long p11 = p();
            atomicLongFieldUpdater = f;
            long j13 = atomicLongFieldUpdater.get(this);
            long j14 = j13 & 4611686018427387903L;
            boolean z10 = (j13 & 4611686018427387904L) != 0;
            if (p11 == j14 && p11 == p()) {
                break;
            } else if (!z10) {
                atomicLongFieldUpdater.compareAndSet(this, j13, j14 + 4611686018427387904L);
            }
        }
        do {
            j12 = atomicLongFieldUpdater.get(this);
        } while (!atomicLongFieldUpdater.compareAndSet(this, j12, 0 + (j12 & 4611686018427387903L)));
    }

    @Override // pc.t
    public final void a(o.b bVar) {
        boolean z10;
        boolean z11;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f13124s;
        while (true) {
            if (atomicReferenceFieldUpdater.compareAndSet(this, null, bVar)) {
                z10 = true;
                break;
            } else if (atomicReferenceFieldUpdater.get(this) != null) {
                z10 = false;
                break;
            }
        }
        if (z10) {
            return;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f13124s;
        do {
            Object obj = atomicReferenceFieldUpdater2.get(this);
            h0 h0Var = pc.e.f13156q;
            if (obj != h0Var) {
                if (obj == pc.e.f13157r) {
                    throw new IllegalStateException("Another handler was already registered and successfully invoked".toString());
                }
                throw new IllegalStateException(("Another handler is already registered: " + obj).toString());
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = f13124s;
            h0 h0Var2 = pc.e.f13157r;
            while (true) {
                if (atomicReferenceFieldUpdater3.compareAndSet(this, h0Var, h0Var2)) {
                    z11 = true;
                    break;
                } else if (atomicReferenceFieldUpdater3.get(this) != h0Var) {
                    z11 = false;
                    break;
                }
            }
        } while (!z11);
        bVar.invoke(q());
    }

    @Override // pc.s
    public final Object c() {
        k<E> kVar;
        long j10 = f13118d.get(this);
        long j11 = f13117c.get(this);
        if (w(j11, true)) {
            return new j.a(q());
        }
        if (j10 >= (j11 & 1152921504606846975L)) {
            return j.f13163b;
        }
        i9.d dVar = pc.e.f13150k;
        k<E> kVar2 = (k) f13121p.get(this);
        while (!x()) {
            long andIncrement = f13118d.getAndIncrement(this);
            long j12 = pc.e.f13142b;
            long j13 = andIncrement / j12;
            int i10 = (int) (andIncrement % j12);
            if (kVar2.f14367c != j13) {
                k<E> o10 = o(j13, kVar2);
                if (o10 == null) {
                    continue;
                } else {
                    kVar = o10;
                }
            } else {
                kVar = kVar2;
            }
            Object I = I(kVar, i10, andIncrement, dVar);
            if (I == pc.e.f13152m) {
                i2 i2Var = dVar instanceof i2 ? (i2) dVar : null;
                if (i2Var != null) {
                    i2Var.c(kVar, i10);
                }
                K(andIncrement);
                kVar.h();
                return j.f13163b;
            }
            if (I != pc.e.f13154o) {
                if (I == pc.e.f13153n) {
                    throw new IllegalStateException("unexpected".toString());
                }
                kVar.a();
                return I;
            }
            if (andIncrement < u()) {
                kVar.a();
            }
            kVar2 = kVar;
        }
        return new j.a(q());
    }

    @Override // pc.s
    public final void cancel(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new CancellationException("Channel was cancelled");
        }
        g(cancellationException, true);
    }

    @Override // pc.t
    public final boolean d(Throwable th) {
        return g(th, false);
    }

    public final boolean f(long j10) {
        return j10 < p() || j10 < s() + ((long) this.f13125a);
    }

    public final boolean g(Throwable th, boolean z10) {
        boolean z11;
        long j10;
        long j11;
        int i10;
        Object obj;
        boolean z12;
        long j12;
        long j13;
        if (z10) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f13117c;
            do {
                j13 = atomicLongFieldUpdater.get(this);
                if (((int) (j13 >> 60)) != 0) {
                    break;
                }
                k<Object> kVar = pc.e.f13141a;
            } while (!atomicLongFieldUpdater.compareAndSet(this, j13, (1 << 60) + (j13 & 1152921504606846975L)));
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f13123r;
        h0 h0Var = pc.e.f13158s;
        while (true) {
            if (atomicReferenceFieldUpdater.compareAndSet(this, h0Var, th)) {
                z11 = true;
                break;
            }
            if (atomicReferenceFieldUpdater.get(this) != h0Var) {
                z11 = false;
                break;
            }
        }
        if (z10) {
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = f13117c;
            do {
                j12 = atomicLongFieldUpdater2.get(this);
                k<Object> kVar2 = pc.e.f13141a;
            } while (!atomicLongFieldUpdater2.compareAndSet(this, j12, (3 << 60) + (j12 & 1152921504606846975L)));
        } else {
            AtomicLongFieldUpdater atomicLongFieldUpdater3 = f13117c;
            do {
                j10 = atomicLongFieldUpdater3.get(this);
                int i11 = (int) (j10 >> 60);
                if (i11 == 0) {
                    j11 = j10 & 1152921504606846975L;
                    i10 = 2;
                    k<Object> kVar3 = pc.e.f13141a;
                } else {
                    if (i11 != 1) {
                        break;
                    }
                    j11 = j10 & 1152921504606846975L;
                    k<Object> kVar4 = pc.e.f13141a;
                    i10 = 3;
                }
            } while (!atomicLongFieldUpdater3.compareAndSet(this, j10, (i10 << 60) + j11));
        }
        m();
        if (z11) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f13124s;
            do {
                obj = atomicReferenceFieldUpdater2.get(this);
                h0 h0Var2 = obj == null ? pc.e.f13156q : pc.e.f13157r;
                while (true) {
                    if (atomicReferenceFieldUpdater2.compareAndSet(this, obj, h0Var2)) {
                        z12 = true;
                        break;
                    }
                    if (atomicReferenceFieldUpdater2.get(this) != obj) {
                        z12 = false;
                        break;
                    }
                }
            } while (!z12);
            if (obj != null) {
                v.a(1, obj);
                ((dc.l) obj).invoke(q());
            }
        }
        return z11;
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x0095, code lost:
    
        r1 = (pc.k) ((sc.c) sc.c.f14332b.get(r1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x00e5, code lost:
    
        r5 = b.a0.z(r5, r6);
        r1.l(r3, true);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final pc.k<E> h(long r13) {
        /*
            Method dump skipped, instructions count: 299
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: pc.b.h(long):pc.k");
    }

    @Override // pc.s
    public final Object i(rc.j jVar) {
        return D(this, jVar);
    }

    @Override // pc.s
    public final h<E> iterator() {
        return new a();
    }

    public final void j(long j10) {
        w k10;
        k<E> kVar = (k) f13121p.get(this);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f13118d;
            long j11 = atomicLongFieldUpdater.get(this);
            if (j10 < Math.max(this.f13125a + j11, p())) {
                return;
            }
            if (atomicLongFieldUpdater.compareAndSet(this, j11, j11 + 1)) {
                long j12 = pc.e.f13142b;
                long j13 = j11 / j12;
                int i10 = (int) (j11 % j12);
                if (kVar.f14367c != j13) {
                    k<E> o10 = o(j13, kVar);
                    if (o10 == null) {
                        continue;
                    } else {
                        kVar = o10;
                    }
                }
                Object I = I(kVar, i10, j11, null);
                if (I != pc.e.f13154o) {
                    kVar.a();
                    dc.l<E, rb.h> lVar = this.f13126b;
                    if (lVar != null && (k10 = m0.k(lVar, I, null)) != null) {
                        throw k10;
                    }
                } else if (j11 < u()) {
                    kVar.a();
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x019a, code lost:
    
        return rb.h.f13851a;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:77:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:79:? A[RETURN, SYNTHETIC] */
    @Override // pc.t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object k(E r24, ub.e<? super rb.h> r25) {
        /*
            Method dump skipped, instructions count: 411
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: pc.b.k(java.lang.Object, ub.e):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x00d8, code lost:
    
        return rb.h.f13851a;
     */
    @Override // pc.t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object l(E r21) {
        /*
            Method dump skipped, instructions count: 217
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: pc.b.l(java.lang.Object):java.lang.Object");
    }

    @Override // pc.t
    public final boolean m() {
        return w(f13117c.get(this), false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0153, code lost:
    
        r12 = r2;
     */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0011 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x019f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0011 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void n() {
        /*
            Method dump skipped, instructions count: 416
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: pc.b.n():void");
    }

    public final k<E> o(long j10, k<E> kVar) {
        Object F;
        long j11;
        boolean z10;
        boolean z11;
        boolean z12;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f13121p;
        k<Object> kVar2 = pc.e.f13141a;
        pc.d dVar = pc.d.f13140a;
        do {
            F = m0.F(kVar, j10, dVar);
            if (m0.R(F)) {
                break;
            }
            sc.t L = m0.L(F);
            while (true) {
                sc.t tVar = (sc.t) atomicReferenceFieldUpdater.get(this);
                if (tVar.f14367c >= L.f14367c) {
                    break;
                }
                if (!L.i()) {
                    z11 = false;
                    break;
                }
                while (true) {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, tVar, L)) {
                        z12 = true;
                        break;
                    }
                    if (atomicReferenceFieldUpdater.get(this) != tVar) {
                        z12 = false;
                        break;
                    }
                }
                if (z12) {
                    if (tVar.e()) {
                        tVar.d();
                    }
                } else if (L.e()) {
                    L.d();
                }
            }
            z11 = true;
        } while (!z11);
        if (m0.R(F)) {
            m();
            if (kVar.f14367c * pc.e.f13142b >= u()) {
                return null;
            }
        } else {
            kVar = (k) m0.L(F);
            if (!z() && j10 <= p() / pc.e.f13142b) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f13122q;
                while (true) {
                    sc.t tVar2 = (sc.t) atomicReferenceFieldUpdater2.get(this);
                    if (tVar2.f14367c >= kVar.f14367c || !kVar.i()) {
                        break;
                    }
                    while (true) {
                        if (atomicReferenceFieldUpdater2.compareAndSet(this, tVar2, kVar)) {
                            z10 = true;
                            break;
                        }
                        if (atomicReferenceFieldUpdater2.get(this) != tVar2) {
                            z10 = false;
                            break;
                        }
                    }
                    if (z10) {
                        if (tVar2.e()) {
                            tVar2.d();
                        }
                    } else if (kVar.e()) {
                        kVar.d();
                    }
                }
            }
            long j12 = kVar.f14367c;
            if (j12 <= j10) {
                return kVar;
            }
            long j13 = j12 * pc.e.f13142b;
            AtomicLongFieldUpdater atomicLongFieldUpdater = f13118d;
            do {
                j11 = atomicLongFieldUpdater.get(this);
                if (j11 >= j13) {
                    break;
                }
            } while (!f13118d.compareAndSet(this, j11, j13));
            if (kVar.f14367c * pc.e.f13142b >= u()) {
                return null;
            }
        }
        kVar.a();
        return null;
    }

    public final long p() {
        return f13119e.get(this);
    }

    public final Throwable q() {
        return (Throwable) f13123r.get(this);
    }

    public final Throwable r() {
        Throwable q10 = q();
        return q10 == null ? new l() : q10;
    }

    public final long s() {
        return f13118d.get(this);
    }

    public final Throwable t() {
        Throwable q10 = q();
        return q10 == null ? new m("Channel was closed") : q10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:117:0x01bb, code lost:
    
        r2 = (pc.k) r2.b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x01c2, code lost:
    
        if (r2 != null) goto L111;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0069  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String toString() {
        /*
            Method dump skipped, instructions count: 515
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: pc.b.toString():java.lang.String");
    }

    public final long u() {
        return f13117c.get(this) & 1152921504606846975L;
    }

    public final void v(long j10) {
        if ((f.addAndGet(this, j10) & 4611686018427387904L) != 0) {
            do {
            } while ((f.get(this) & 4611686018427387904L) != 0);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:143:0x0131, code lost:
    
        r12 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00b0, code lost:
    
        r12.h();
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00a4, code lost:
    
        r12.n(r4, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x00b7, code lost:
    
        r12 = (pc.k) ((sc.c) sc.c.f14332b.get(r12));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean w(long r12, boolean r14) {
        /*
            Method dump skipped, instructions count: 401
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: pc.b.w(long, boolean):boolean");
    }

    public final boolean x() {
        return w(f13117c.get(this), true);
    }

    public boolean y() {
        return false;
    }

    public final boolean z() {
        long p10 = p();
        return p10 == 0 || p10 == Long.MAX_VALUE;
    }
}
