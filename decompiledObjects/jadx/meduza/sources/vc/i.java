package vc;

import d2.h0;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p2.m0;
import sc.t;

/* loaded from: classes.dex */
public class i {

    /* renamed from: c, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f16107c = AtomicReferenceFieldUpdater.newUpdater(i.class, Object.class, "head");

    /* renamed from: d, reason: collision with root package name */
    public static final AtomicLongFieldUpdater f16108d = AtomicLongFieldUpdater.newUpdater(i.class, "deqIdx");

    /* renamed from: e, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f16109e = AtomicReferenceFieldUpdater.newUpdater(i.class, Object.class, "tail");
    public static final AtomicLongFieldUpdater f = AtomicLongFieldUpdater.newUpdater(i.class, "enqIdx");

    /* renamed from: g, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f16110g = AtomicIntegerFieldUpdater.newUpdater(i.class, "_availablePermits");
    private volatile int _availablePermits;

    /* renamed from: a, reason: collision with root package name */
    public final int f16111a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final g f16112b;
    private volatile long deqIdx;
    private volatile long enqIdx;
    private volatile Object head;
    private volatile Object tail;

    public i(int i10) {
        if (!(i10 >= 0 && i10 <= 1)) {
            throw new IllegalArgumentException("The number of acquired permits should be in 0..1".toString());
        }
        k kVar = new k(0L, null, 2);
        this.head = kVar;
        this.tail = kVar;
        this._availablePermits = 1 - i10;
        this.f16112b = new g(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x006d, code lost:
    
        r10 = true;
     */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0004 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(vc.d.a r17) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
        L4:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r2 = vc.i.f16110g
            int r2 = r2.getAndDecrement(r0)
            int r3 = r0.f16111a
            if (r2 > r3) goto L4
            if (r2 <= 0) goto L19
            rb.h r2 = rb.h.f13851a
            vc.g r3 = r0.f16112b
            r1.b(r2, r3)
            goto Lc1
        L19:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = vc.i.f16109e
            java.lang.Object r3 = r2.get(r0)
            vc.k r3 = (vc.k) r3
            java.util.concurrent.atomic.AtomicLongFieldUpdater r4 = vc.i.f
            long r4 = r4.getAndIncrement(r0)
            vc.f r6 = vc.f.f16104a
            int r7 = vc.j.f
            long r7 = (long) r7
            long r7 = r4 / r7
        L2e:
            java.lang.Object r9 = p2.m0.F(r3, r7, r6)
            boolean r10 = p2.m0.R(r9)
            if (r10 != 0) goto L7b
            sc.t r10 = p2.m0.L(r9)
        L3c:
            java.lang.Object r13 = r2.get(r0)
            sc.t r13 = (sc.t) r13
            long r14 = r13.f14367c
            long r11 = r10.f14367c
            int r11 = (r14 > r11 ? 1 : (r14 == r11 ? 0 : -1))
            if (r11 < 0) goto L4b
            goto L6d
        L4b:
            boolean r11 = r10.i()
            if (r11 != 0) goto L53
            r10 = 0
            goto L6e
        L53:
            boolean r11 = r2.compareAndSet(r0, r13, r10)
            if (r11 == 0) goto L5b
            r11 = 1
            goto L62
        L5b:
            java.lang.Object r11 = r2.get(r0)
            if (r11 == r13) goto L53
            r11 = 0
        L62:
            if (r11 == 0) goto L71
            boolean r10 = r13.e()
            if (r10 == 0) goto L6d
            r13.d()
        L6d:
            r10 = 1
        L6e:
            if (r10 == 0) goto L2e
            goto L7b
        L71:
            boolean r11 = r10.e()
            if (r11 == 0) goto L3c
            r10.d()
            goto L3c
        L7b:
            sc.t r2 = p2.m0.L(r9)
            vc.k r2 = (vc.k) r2
            int r3 = vc.j.f
            long r6 = (long) r3
            long r4 = r4 % r6
            int r3 = (int) r4
            r4 = 0
            java.util.concurrent.atomic.AtomicReferenceArray r5 = r2.f16118e
        L89:
            boolean r6 = r5.compareAndSet(r3, r4, r1)
            if (r6 == 0) goto L91
            r4 = 1
            goto L98
        L91:
            java.lang.Object r6 = r5.get(r3)
            if (r6 == 0) goto L89
            r4 = 0
        L98:
            if (r4 == 0) goto L9e
            r1.c(r2, r3)
            goto Lbc
        L9e:
            d2.h0 r6 = vc.j.f16114b
            d2.h0 r7 = vc.j.f16115c
            java.util.concurrent.atomic.AtomicReferenceArray r8 = r2.f16118e
        La4:
            boolean r2 = r8.compareAndSet(r3, r6, r7)
            if (r2 == 0) goto Lac
            r2 = 1
            goto Lb3
        Lac:
            java.lang.Object r2 = r8.get(r3)
            if (r2 == r6) goto La4
            r2 = 0
        Lb3:
            if (r2 == 0) goto Lbe
            rb.h r2 = rb.h.f13851a
            vc.g r3 = r0.f16112b
            r1.b(r2, r3)
        Lbc:
            r11 = 1
            goto Lbf
        Lbe:
            r11 = 0
        Lbf:
            if (r11 == 0) goto L4
        Lc1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: vc.i.c(vc.d$a):void");
    }

    public final void d() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i10;
        int i11;
        Object F;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        do {
            int andIncrement = f16110g.getAndIncrement(this);
            if (andIncrement >= this.f16111a) {
                do {
                    atomicIntegerFieldUpdater = f16110g;
                    i10 = atomicIntegerFieldUpdater.get(this);
                    i11 = this.f16111a;
                    if (i10 <= i11) {
                        break;
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i10, i11));
                StringBuilder l10 = defpackage.f.l("The number of released permits cannot be greater than ");
                l10.append(this.f16111a);
                throw new IllegalStateException(l10.toString().toString());
            }
            if (andIncrement >= 0) {
                return;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f16107c;
            k kVar = (k) atomicReferenceFieldUpdater.get(this);
            long andIncrement2 = f16108d.getAndIncrement(this);
            long j10 = andIncrement2 / j.f;
            h hVar = h.f16106a;
            do {
                F = m0.F(kVar, j10, hVar);
                if (m0.R(F)) {
                    break;
                }
                t L = m0.L(F);
                while (true) {
                    t tVar = (t) atomicReferenceFieldUpdater.get(this);
                    if (tVar.f14367c >= L.f14367c) {
                        break;
                    }
                    if (!L.i()) {
                        z13 = false;
                        break;
                    }
                    while (true) {
                        if (atomicReferenceFieldUpdater.compareAndSet(this, tVar, L)) {
                            z14 = true;
                            break;
                        } else if (atomicReferenceFieldUpdater.get(this) != tVar) {
                            z14 = false;
                            break;
                        }
                    }
                    if (z14) {
                        if (tVar.e()) {
                            tVar.d();
                        }
                    } else if (L.e()) {
                        L.d();
                    }
                }
                z13 = true;
            } while (!z13);
            k kVar2 = (k) m0.L(F);
            kVar2.a();
            if (kVar2.f14367c <= j10) {
                int i12 = (int) (andIncrement2 % j.f);
                Object andSet = kVar2.f16118e.getAndSet(i12, j.f16114b);
                if (andSet == null) {
                    int i13 = j.f16113a;
                    int i14 = 0;
                    while (true) {
                        if (i14 >= i13) {
                            h0 h0Var = j.f16114b;
                            h0 h0Var2 = j.f16116d;
                            AtomicReferenceArray atomicReferenceArray = kVar2.f16118e;
                            while (true) {
                                if (atomicReferenceArray.compareAndSet(i12, h0Var, h0Var2)) {
                                    z11 = true;
                                    z12 = true;
                                    break;
                                } else if (atomicReferenceArray.get(i12) != h0Var) {
                                    z11 = true;
                                    z12 = false;
                                    break;
                                }
                            }
                            z10 = z11 ^ z12;
                        } else {
                            if (kVar2.f16118e.get(i12) == j.f16115c) {
                                z10 = true;
                                break;
                            }
                            i14++;
                        }
                    }
                } else {
                    z10 = true;
                    if (andSet != j.f16117e) {
                        if (andSet instanceof nc.k) {
                            nc.k kVar3 = (nc.k) andSet;
                            h0 j11 = kVar3.j(rb.h.f13851a, this.f16112b);
                            if (j11 != null) {
                                kVar3.n(j11);
                            }
                        } else {
                            if (!(andSet instanceof uc.f)) {
                                throw new IllegalStateException(("unexpected: " + andSet).toString());
                            }
                            z10 = ((uc.f) andSet).e(this, rb.h.f13851a);
                        }
                    }
                }
            }
            z10 = false;
        } while (!z10);
    }
}
