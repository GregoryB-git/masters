package nc;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import nc.j1;

/* loaded from: classes.dex */
public class l<T> extends p0<T> implements k<T>, wb.d, i2 {
    public static final AtomicIntegerFieldUpdater f = AtomicIntegerFieldUpdater.newUpdater(l.class, "_decisionAndIndex");

    /* renamed from: o, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f11513o = AtomicReferenceFieldUpdater.newUpdater(l.class, Object.class, "_state");

    /* renamed from: p, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f11514p = AtomicReferenceFieldUpdater.newUpdater(l.class, Object.class, "_parentHandle");
    private volatile int _decisionAndIndex;
    private volatile Object _parentHandle;
    private volatile Object _state;

    /* renamed from: d, reason: collision with root package name */
    public final ub.e<T> f11515d;

    /* renamed from: e, reason: collision with root package name */
    public final ub.h f11516e;

    public l(int i10, ub.e eVar) {
        super(i10);
        this.f11515d = eVar;
        this.f11516e = eVar.getContext();
        this._decisionAndIndex = 536870911;
        this._state = b.f11470a;
    }

    public static Object C(v1 v1Var, Object obj, int i10, dc.l lVar) {
        if (obj instanceof u) {
            return obj;
        }
        boolean z10 = true;
        if (i10 != 1 && i10 != 2) {
            z10 = false;
        }
        if (!z10) {
            return obj;
        }
        if (lVar != null || (v1Var instanceof i)) {
            return new t(obj, v1Var instanceof i ? (i) v1Var : null, lVar, (CancellationException) null, 16);
        }
        return obj;
    }

    public static void y(Object obj, Object obj2) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + obj + ", already has " + obj2).toString());
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0045, code lost:
    
        if (r2 != null) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0048, code lost:
    
        p();
        cancel(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004e, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:?, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A() {
        /*
            r8 = this;
            ub.e<T> r0 = r8.f11515d
            boolean r1 = r0 instanceof sc.g
            r2 = 0
            if (r1 == 0) goto La
            sc.g r0 = (sc.g) r0
            goto Lb
        La:
            r0 = r2
        Lb:
            if (r0 == 0) goto L76
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = sc.g.f14336p
        Lf:
            java.lang.Object r3 = r1.get(r0)
            d2.h0 r4 = b.a0.Z
            r5 = 0
            r6 = 1
            if (r3 != r4) goto L2c
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r7 = sc.g.f14336p
        L1b:
            boolean r3 = r7.compareAndSet(r0, r4, r8)
            if (r3 == 0) goto L23
            r5 = r6
            goto L29
        L23:
            java.lang.Object r3 = r7.get(r0)
            if (r3 == r4) goto L1b
        L29:
            if (r5 == 0) goto Lf
            goto L45
        L2c:
            boolean r1 = r3 instanceof java.lang.Throwable
            if (r1 == 0) goto L5b
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = sc.g.f14336p
        L32:
            boolean r4 = r1.compareAndSet(r0, r3, r2)
            if (r4 == 0) goto L3a
            r5 = r6
            goto L40
        L3a:
            java.lang.Object r4 = r1.get(r0)
            if (r4 == r3) goto L32
        L40:
            if (r5 == 0) goto L4f
            r2 = r3
            java.lang.Throwable r2 = (java.lang.Throwable) r2
        L45:
            if (r2 != 0) goto L48
            goto L76
        L48:
            r8.p()
            r8.cancel(r2)
            return
        L4f:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Failed requirement."
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L5b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Inconsistent state "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L76:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: nc.l.A():void");
    }

    public final void B(Object obj, int i10, dc.l<? super Throwable, rb.h> lVar) {
        boolean z10;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f11513o;
        do {
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            z10 = false;
            if (!(obj2 instanceof v1)) {
                if (obj2 instanceof m) {
                    m mVar = (m) obj2;
                    mVar.getClass();
                    if (m.f11517c.compareAndSet(mVar, 0, 1)) {
                        if (lVar != null) {
                            m(lVar, mVar.f11555a);
                            return;
                        }
                        return;
                    }
                }
                throw new IllegalStateException(("Already resumed, but proposed with update " + obj).toString());
            }
            Object C = C((v1) obj2, obj, i10, lVar);
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f11513o;
            while (true) {
                if (atomicReferenceFieldUpdater2.compareAndSet(this, obj2, C)) {
                    z10 = true;
                    break;
                } else if (atomicReferenceFieldUpdater2.get(this) != obj2) {
                    break;
                }
            }
        } while (!z10);
        if (!x()) {
            p();
        }
        q(i10);
    }

    public final d2.h0 D(Object obj, dc.l lVar) {
        boolean z10;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f11513o;
        do {
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (!(obj2 instanceof v1)) {
                boolean z11 = obj2 instanceof t;
                return null;
            }
            Object C = C((v1) obj2, obj, this.f11542c, lVar);
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f11513o;
            while (true) {
                if (atomicReferenceFieldUpdater2.compareAndSet(this, obj2, C)) {
                    z10 = true;
                    break;
                }
                if (atomicReferenceFieldUpdater2.get(this) != obj2) {
                    z10 = false;
                    break;
                }
            }
        } while (!z10);
        if (!x()) {
            p();
        }
        return p2.m0.f12896q;
    }

    @Override // nc.p0
    public final void a(Object obj, CancellationException cancellationException) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f11513o;
        while (true) {
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof v1) {
                throw new IllegalStateException("Not completed".toString());
            }
            if (obj2 instanceof u) {
                return;
            }
            boolean z10 = true;
            if (obj2 instanceof t) {
                t tVar = (t) obj2;
                if (!(!(tVar.f11553e != null))) {
                    throw new IllegalStateException("Must be called at most once".toString());
                }
                t a10 = t.a(tVar, null, cancellationException, 15);
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f11513o;
                while (true) {
                    if (atomicReferenceFieldUpdater2.compareAndSet(this, obj2, a10)) {
                        break;
                    } else if (atomicReferenceFieldUpdater2.get(this) != obj2) {
                        z10 = false;
                        break;
                    }
                }
                if (z10) {
                    i iVar = tVar.f11550b;
                    if (iVar != null) {
                        l(iVar, cancellationException);
                    }
                    dc.l<Throwable, rb.h> lVar = tVar.f11551c;
                    if (lVar != null) {
                        m(lVar, cancellationException);
                        return;
                    }
                    return;
                }
            } else {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = f11513o;
                t tVar2 = new t(obj2, (i) null, (dc.l) null, cancellationException, 14);
                while (true) {
                    if (atomicReferenceFieldUpdater3.compareAndSet(this, obj2, tVar2)) {
                        break;
                    } else if (atomicReferenceFieldUpdater3.get(this) != obj2) {
                        z10 = false;
                        break;
                    }
                }
                if (z10) {
                    return;
                }
            }
        }
    }

    @Override // nc.k
    public final void b(T t, dc.l<? super Throwable, rb.h> lVar) {
        B(t, this.f11542c, lVar);
    }

    @Override // nc.i2
    public final void c(sc.t<?> tVar, int i10) {
        int i11;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f;
        do {
            i11 = atomicIntegerFieldUpdater.get(this);
            if (!((i11 & 536870911) == 536870911)) {
                throw new IllegalStateException("invokeOnCancellation should be called at most once".toString());
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i11, ((i11 >> 29) << 29) + i10));
        w(tVar);
    }

    @Override // nc.k
    public final boolean cancel(Throwable th) {
        Object obj;
        boolean z10;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f11513o;
        do {
            obj = atomicReferenceFieldUpdater.get(this);
            z10 = false;
            if (!(obj instanceof v1)) {
                return false;
            }
            m mVar = new m(this, th, (obj instanceof i) || (obj instanceof sc.t));
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f11513o;
            while (true) {
                if (atomicReferenceFieldUpdater2.compareAndSet(this, obj, mVar)) {
                    z10 = true;
                    break;
                }
                if (atomicReferenceFieldUpdater2.get(this) != obj) {
                    break;
                }
            }
        } while (!z10);
        v1 v1Var = (v1) obj;
        if (v1Var instanceof i) {
            l((i) obj, th);
        } else if (v1Var instanceof sc.t) {
            o((sc.t) obj, th);
        }
        if (!x()) {
            p();
        }
        q(this.f11542c);
        return true;
    }

    @Override // nc.p0
    public final ub.e<T> d() {
        return this.f11515d;
    }

    @Override // nc.k
    public final d2.h0 e(Throwable th) {
        return D(new u(th, false), null);
    }

    @Override // nc.p0
    public final Throwable f(Object obj) {
        Throwable f10 = super.f(obj);
        if (f10 != null) {
            return f10;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // nc.p0
    public final <T> T g(Object obj) {
        return obj instanceof t ? (T) ((t) obj).f11549a : obj;
    }

    @Override // wb.d
    public final wb.d getCallerFrame() {
        ub.e<T> eVar = this.f11515d;
        if (eVar instanceof wb.d) {
            return (wb.d) eVar;
        }
        return null;
    }

    @Override // ub.e
    public final ub.h getContext() {
        return this.f11516e;
    }

    @Override // nc.k
    public final void h(a0 a0Var, rb.h hVar) {
        ub.e<T> eVar = this.f11515d;
        sc.g gVar = eVar instanceof sc.g ? (sc.g) eVar : null;
        B(hVar, (gVar != null ? gVar.f14337d : null) == a0Var ? 4 : this.f11542c, null);
    }

    @Override // nc.k
    public final d2.h0 j(Object obj, dc.l lVar) {
        return D(obj, lVar);
    }

    @Override // nc.p0
    public final Object k() {
        return f11513o.get(this);
    }

    public final void l(i iVar, Throwable th) {
        try {
            iVar.h(th);
        } catch (Throwable th2) {
            c0.a(this.f11516e, new n7.w("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    public final void m(dc.l<? super Throwable, rb.h> lVar, Throwable th) {
        try {
            lVar.invoke(th);
        } catch (Throwable th2) {
            c0.a(this.f11516e, new n7.w("Exception in resume onCancellation handler for " + this, th2));
        }
    }

    @Override // nc.k
    public final void n(Object obj) {
        q(this.f11542c);
    }

    public final void o(sc.t<?> tVar, Throwable th) {
        int i10 = f.get(this) & 536870911;
        if (!(i10 != 536870911)) {
            throw new IllegalStateException("The index for Segment.onCancellation(..) is broken".toString());
        }
        try {
            tVar.g(i10, this.f11516e);
        } catch (Throwable th2) {
            c0.a(this.f11516e, new n7.w("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    public final void p() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f11514p;
        t0 t0Var = (t0) atomicReferenceFieldUpdater.get(this);
        if (t0Var == null) {
            return;
        }
        t0Var.dispose();
        atomicReferenceFieldUpdater.set(this, u1.f11557a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002f, code lost:
    
        r0 = r7.f11515d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0032, code lost:
    
        if (r8 != 4) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0034, code lost:
    
        r1 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0037, code lost:
    
        if (r1 != false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003b, code lost:
    
        if ((r0 instanceof sc.g) == false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003e, code lost:
    
        if (r8 == 1) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0040, code lost:
    
        if (r8 != 2) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0043, code lost:
    
        r8 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0046, code lost:
    
        r5 = r7.f11542c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0048, code lost:
    
        if (r5 == 1) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004a, code lost:
    
        if (r5 != 2) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004d, code lost:
    
        if (r8 != r4) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004f, code lost:
    
        r8 = ((sc.g) r0).f14337d;
        r0 = r0.getContext();
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005c, code lost:
    
        if (r8.B0() == false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005e, code lost:
    
        r8.z0(r0, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0062, code lost:
    
        r8 = nc.c2.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x006a, code lost:
    
        if (r8.F0() == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x006c, code lost:
    
        r8.D0(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0070, code lost:
    
        r8.E0(true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0073, code lost:
    
        p2.m0.Z(r7, r7.f11515d, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x007c, code lost:
    
        if (r8.H0() != false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x007f, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x008c, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x004c, code lost:
    
        r4 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0045, code lost:
    
        r8 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x008d, code lost:
    
        p2.m0.Z(r7, r0, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0090, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0036, code lost:
    
        r1 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x002c, code lost:
    
        if (r0 == false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002e, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void q(int r8) {
        /*
            r7 = this;
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = nc.l.f
        L2:
            int r1 = r0.get(r7)
            int r2 = r1 >> 29
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L1c
            if (r2 != r3) goto L10
            r0 = r4
            goto L2c
        L10:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "Already resumed"
            java.lang.String r0 = r0.toString()
            r8.<init>(r0)
            throw r8
        L1c:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r2 = nc.l.f
            r5 = 536870911(0x1fffffff, float:1.0842021E-19)
            r5 = r5 & r1
            r6 = 1073741824(0x40000000, float:2.0)
            int r5 = r5 + r6
            boolean r1 = r2.compareAndSet(r7, r1, r5)
            if (r1 == 0) goto L2
            r0 = r3
        L2c:
            if (r0 == 0) goto L2f
            return
        L2f:
            ub.e<T> r0 = r7.f11515d
            r1 = 4
            if (r8 != r1) goto L36
            r1 = r3
            goto L37
        L36:
            r1 = r4
        L37:
            if (r1 != 0) goto L8d
            boolean r2 = r0 instanceof sc.g
            if (r2 == 0) goto L8d
            r2 = 2
            if (r8 == r3) goto L45
            if (r8 != r2) goto L43
            goto L45
        L43:
            r8 = r4
            goto L46
        L45:
            r8 = r3
        L46:
            int r5 = r7.f11542c
            if (r5 == r3) goto L4c
            if (r5 != r2) goto L4d
        L4c:
            r4 = r3
        L4d:
            if (r8 != r4) goto L8d
            r8 = r0
            sc.g r8 = (sc.g) r8
            nc.a0 r8 = r8.f14337d
            ub.h r0 = r0.getContext()
            boolean r1 = r8.B0()
            if (r1 == 0) goto L62
            r8.z0(r0, r7)
            goto L90
        L62:
            nc.x0 r8 = nc.c2.a()
            boolean r0 = r8.F0()
            if (r0 == 0) goto L70
            r8.D0(r7)
            goto L90
        L70:
            r8.E0(r3)
            ub.e<T> r0 = r7.f11515d     // Catch: java.lang.Throwable -> L7f
            p2.m0.Z(r7, r0, r3)     // Catch: java.lang.Throwable -> L7f
        L78:
            boolean r0 = r8.H0()     // Catch: java.lang.Throwable -> L7f
            if (r0 != 0) goto L78
            goto L84
        L7f:
            r0 = move-exception
            r1 = 0
            r7.i(r0, r1)     // Catch: java.lang.Throwable -> L88
        L84:
            r8.C0(r3)
            goto L90
        L88:
            r0 = move-exception
            r8.C0(r3)
            throw r0
        L8d:
            p2.m0.Z(r7, r0, r1)
        L90:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: nc.l.q(int):void");
    }

    public Throwable r(o1 o1Var) {
        return o1Var.getCancellationException();
    }

    @Override // ub.e
    public final void resumeWith(Object obj) {
        Throwable a10 = rb.e.a(obj);
        if (a10 != null) {
            obj = new u(a10, false);
        }
        B(obj, this.f11542c, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003b, code lost:
    
        if (((nc.t0) nc.l.f11514p.get(r9)) != null) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x003d, code lost:
    
        u();
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0040, code lost:
    
        if (r0 == false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0042, code lost:
    
        A();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0047, code lost:
    
        return vb.a.f16085a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0048, code lost:
    
        if (r0 == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004a, code lost:
    
        A();
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004d, code lost:
    
        r0 = nc.l.f11513o.get(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0055, code lost:
    
        if ((r0 instanceof nc.u) != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0057, code lost:
    
        r1 = r9.f11542c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0059, code lost:
    
        if (r1 == 1) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x005b, code lost:
    
        if (r1 != 2) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005e, code lost:
    
        if (r4 == false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0060, code lost:
    
        r1 = (nc.j1) r9.f11516e.get(nc.j1.b.f11509a);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x006a, code lost:
    
        if (r1 == null) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0070, code lost:
    
        if (r1.isActive() == false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0073, code lost:
    
        r1 = r1.getCancellationException();
        a(r0, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x007a, code lost:
    
        throw r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x007f, code lost:
    
        return g(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x005d, code lost:
    
        r4 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0084, code lost:
    
        throw ((nc.u) r0).f11555a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0031, code lost:
    
        if (r1 == false) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object s() {
        /*
            r9 = this;
            boolean r0 = r9.x()
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r1 = nc.l.f
        L6:
            int r2 = r1.get(r9)
            int r3 = r2 >> 29
            r4 = 0
            r5 = 1
            r6 = 2
            if (r3 == 0) goto L21
            if (r3 != r6) goto L15
            r1 = r4
            goto L31
        L15:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Already suspended"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L21:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r3 = nc.l.f
            r7 = 536870911(0x1fffffff, float:1.0842021E-19)
            r7 = r7 & r2
            r8 = 536870912(0x20000000, float:1.0842022E-19)
            int r7 = r7 + r8
            boolean r2 = r3.compareAndSet(r9, r2, r7)
            if (r2 == 0) goto L6
            r1 = r5
        L31:
            if (r1 == 0) goto L48
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = nc.l.f11514p
            java.lang.Object r1 = r1.get(r9)
            nc.t0 r1 = (nc.t0) r1
            if (r1 != 0) goto L40
            r9.u()
        L40:
            if (r0 == 0) goto L45
            r9.A()
        L45:
            vb.a r0 = vb.a.f16085a
            return r0
        L48:
            if (r0 == 0) goto L4d
            r9.A()
        L4d:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = nc.l.f11513o
            java.lang.Object r0 = r0.get(r9)
            boolean r1 = r0 instanceof nc.u
            if (r1 != 0) goto L80
            int r1 = r9.f11542c
            if (r1 == r5) goto L5d
            if (r1 != r6) goto L5e
        L5d:
            r4 = r5
        L5e:
            if (r4 == 0) goto L7b
            ub.h r1 = r9.f11516e
            nc.j1$b r2 = nc.j1.b.f11509a
            ub.h$b r1 = r1.get(r2)
            nc.j1 r1 = (nc.j1) r1
            if (r1 == 0) goto L7b
            boolean r2 = r1.isActive()
            if (r2 == 0) goto L73
            goto L7b
        L73:
            java.util.concurrent.CancellationException r1 = r1.getCancellationException()
            r9.a(r0, r1)
            throw r1
        L7b:
            java.lang.Object r0 = r9.g(r0)
            return r0
        L80:
            nc.u r0 = (nc.u) r0
            java.lang.Throwable r0 = r0.f11555a
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: nc.l.s():java.lang.Object");
    }

    public final void t() {
        t0 u10 = u();
        if (u10 != null && (!(f11513o.get(this) instanceof v1))) {
            u10.dispose();
            f11514p.set(this, u1.f11557a);
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(z());
        sb2.append('(');
        sb2.append(g0.c(this.f11515d));
        sb2.append("){");
        Object obj = f11513o.get(this);
        sb2.append(obj instanceof v1 ? "Active" : obj instanceof m ? "Cancelled" : "Completed");
        sb2.append("}@");
        sb2.append(g0.b(this));
        return sb2.toString();
    }

    public final t0 u() {
        j1 j1Var = (j1) this.f11516e.get(j1.b.f11509a);
        if (j1Var == null) {
            return null;
        }
        t0 a10 = j1.a.a(j1Var, true, new n(this), 2);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f11514p;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, null, a10) && atomicReferenceFieldUpdater.get(this) == null) {
        }
        return a10;
    }

    public final void v(dc.l<? super Throwable, rb.h> lVar) {
        w(lVar instanceof i ? (i) lVar : new h(lVar, 1));
    }

    public final void w(Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f11513o;
        while (true) {
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            boolean z10 = true;
            if (obj2 instanceof b) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f11513o;
                while (true) {
                    if (atomicReferenceFieldUpdater2.compareAndSet(this, obj2, obj)) {
                        break;
                    } else if (atomicReferenceFieldUpdater2.get(this) != obj2) {
                        z10 = false;
                        break;
                    }
                }
                if (z10) {
                    return;
                }
            } else {
                if (obj2 instanceof i ? true : obj2 instanceof sc.t) {
                    y(obj, obj2);
                    throw null;
                }
                boolean z11 = obj2 instanceof u;
                if (z11) {
                    u uVar = (u) obj2;
                    uVar.getClass();
                    if (!u.f11554b.compareAndSet(uVar, 0, 1)) {
                        y(obj, obj2);
                        throw null;
                    }
                    if (obj2 instanceof m) {
                        if (!z11) {
                            uVar = null;
                        }
                        Throwable th = uVar != null ? uVar.f11555a : null;
                        if (obj instanceof i) {
                            l((i) obj, th);
                            return;
                        } else {
                            ec.i.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.Segment<*>");
                            o((sc.t) obj, th);
                            return;
                        }
                    }
                    return;
                }
                if (obj2 instanceof t) {
                    t tVar = (t) obj2;
                    if (tVar.f11550b != null) {
                        y(obj, obj2);
                        throw null;
                    }
                    if (obj instanceof sc.t) {
                        return;
                    }
                    ec.i.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
                    i iVar = (i) obj;
                    Throwable th2 = tVar.f11553e;
                    if (th2 != null) {
                        l(iVar, th2);
                        return;
                    }
                    t a10 = t.a(tVar, iVar, null, 29);
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = f11513o;
                    while (true) {
                        if (atomicReferenceFieldUpdater3.compareAndSet(this, obj2, a10)) {
                            break;
                        } else if (atomicReferenceFieldUpdater3.get(this) != obj2) {
                            z10 = false;
                            break;
                        }
                    }
                    if (z10) {
                        return;
                    }
                } else {
                    if (obj instanceof sc.t) {
                        return;
                    }
                    ec.i.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
                    t tVar2 = new t(obj2, (i) obj, (dc.l) null, (CancellationException) null, 28);
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4 = f11513o;
                    while (true) {
                        if (atomicReferenceFieldUpdater4.compareAndSet(this, obj2, tVar2)) {
                            break;
                        } else if (atomicReferenceFieldUpdater4.get(this) != obj2) {
                            z10 = false;
                            break;
                        }
                    }
                    if (z10) {
                        return;
                    }
                }
            }
        }
    }

    public final boolean x() {
        if (this.f11542c == 2) {
            ub.e<T> eVar = this.f11515d;
            ec.i.c(eVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
            if (sc.g.f14336p.get((sc.g) eVar) != null) {
                return true;
            }
        }
        return false;
    }

    public String z() {
        return "CancellableContinuation";
    }
}
