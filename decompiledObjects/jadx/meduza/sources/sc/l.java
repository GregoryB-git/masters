package sc;

import d2.h0;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class l<E> {

    /* renamed from: e, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f14353e = AtomicReferenceFieldUpdater.newUpdater(l.class, Object.class, "_next");
    public static final AtomicLongFieldUpdater f = AtomicLongFieldUpdater.newUpdater(l.class, "_state");

    /* renamed from: g, reason: collision with root package name */
    public static final h0 f14354g = new h0("REMOVE_FROZEN", 9);
    private volatile Object _next;
    private volatile long _state;

    /* renamed from: a, reason: collision with root package name */
    public final int f14355a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f14356b;

    /* renamed from: c, reason: collision with root package name */
    public final int f14357c;

    /* renamed from: d, reason: collision with root package name */
    public final AtomicReferenceArray f14358d;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f14359a;

        public a(int i10) {
            this.f14359a = i10;
        }
    }

    public l(int i10, boolean z10) {
        this.f14355a = i10;
        this.f14356b = z10;
        int i11 = i10 - 1;
        this.f14357c = i11;
        this.f14358d = new AtomicReferenceArray(i10);
        if (!(i11 <= 1073741823)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        if (!((i10 & i11) == 0)) {
            throw new IllegalStateException("Check failed.".toString());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0056, code lost:
    
        return 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int a(E r17) {
        /*
            r16 = this;
            r6 = r16
            r7 = r17
            java.util.concurrent.atomic.AtomicLongFieldUpdater r8 = sc.l.f
        L6:
            long r2 = r8.get(r6)
            r0 = 3458764513820540928(0x3000000000000000, double:1.727233711018889E-77)
            long r0 = r0 & r2
            r9 = 0
            int r0 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            r1 = 1
            if (r0 == 0) goto L1d
            r4 = 2305843009213693952(0x2000000000000000, double:1.4916681462400413E-154)
            long r2 = r2 & r4
            int r0 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r0 == 0) goto L1c
            r1 = 2
        L1c:
            return r1
        L1d:
            r4 = 1073741823(0x3fffffff, double:5.304989472E-315)
            long r4 = r4 & r2
            r11 = 0
            long r4 = r4 >> r11
            int r0 = (int) r4
            r4 = 1152921503533105152(0xfffffffc0000000, double:1.2882296003504729E-231)
            long r4 = r4 & r2
            r12 = 30
            long r4 = r4 >> r12
            int r13 = (int) r4
            int r14 = r6.f14357c
            int r4 = r13 + 2
            r4 = r4 & r14
            r5 = r0 & r14
            if (r4 != r5) goto L38
            return r1
        L38:
            boolean r4 = r6.f14356b
            r5 = 1073741823(0x3fffffff, float:1.9999999)
            if (r4 != 0) goto L57
            java.util.concurrent.atomic.AtomicReferenceArray r4 = r6.f14358d
            r15 = r13 & r14
            java.lang.Object r4 = r4.get(r15)
            if (r4 == 0) goto L57
            int r2 = r6.f14355a
            r3 = 1024(0x400, float:1.435E-42)
            if (r2 < r3) goto L56
            int r13 = r13 - r0
            r0 = r13 & r5
            int r2 = r2 >> 1
            if (r0 <= r2) goto L6
        L56:
            return r1
        L57:
            int r0 = r13 + 1
            r0 = r0 & r5
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = sc.l.f
            r4 = -1152921503533105153(0xf00000003fffffff, double:-3.1050369248997324E231)
            long r4 = r4 & r2
            long r9 = (long) r0
            long r9 = r9 << r12
            long r4 = r4 | r9
            r0 = r1
            r1 = r16
            boolean r0 = r0.compareAndSet(r1, r2, r4)
            if (r0 == 0) goto L6
            java.util.concurrent.atomic.AtomicReferenceArray r0 = r6.f14358d
            r1 = r13 & r14
            r0.set(r1, r7)
            r0 = r6
        L76:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = sc.l.f
            long r1 = r1.get(r0)
            r3 = 1152921504606846976(0x1000000000000000, double:1.2882297539194267E-231)
            long r1 = r1 & r3
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 == 0) goto La8
            sc.l r0 = r0.c()
            java.util.concurrent.atomic.AtomicReferenceArray r1 = r0.f14358d
            int r2 = r0.f14357c
            r2 = r2 & r13
            java.lang.Object r1 = r1.get(r2)
            boolean r2 = r1 instanceof sc.l.a
            if (r2 == 0) goto La5
            sc.l$a r1 = (sc.l.a) r1
            int r1 = r1.f14359a
            if (r1 != r13) goto La5
            java.util.concurrent.atomic.AtomicReferenceArray r1 = r0.f14358d
            int r2 = r0.f14357c
            r2 = r2 & r13
            r1.set(r2, r7)
            goto La6
        La5:
            r0 = 0
        La6:
            if (r0 != 0) goto L76
        La8:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: sc.l.a(java.lang.Object):int");
    }

    public final boolean b() {
        long j10;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f;
        do {
            j10 = atomicLongFieldUpdater.get(this);
            if ((j10 & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & j10) != 0) {
                return false;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j10, j10 | 2305843009213693952L));
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final l<E> c() {
        long j10;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f;
        while (true) {
            j10 = atomicLongFieldUpdater.get(this);
            if ((j10 & 1152921504606846976L) != 0) {
                break;
            }
            long j11 = j10 | 1152921504606846976L;
            if (atomicLongFieldUpdater.compareAndSet(this, j10, j11)) {
                j10 = j11;
                break;
            }
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f14353e;
        while (true) {
            l<E> lVar = (l) atomicReferenceFieldUpdater.get(this);
            if (lVar != null) {
                return lVar;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f14353e;
            l lVar2 = new l(this.f14355a * 2, this.f14356b);
            int i10 = (int) ((1073741823 & j10) >> 0);
            int i11 = (int) ((1152921503533105152L & j10) >> 30);
            while (true) {
                int i12 = this.f14357c;
                int i13 = i10 & i12;
                if (i13 == (i12 & i11)) {
                    break;
                }
                Object obj = this.f14358d.get(i13);
                if (obj == null) {
                    obj = new a(i10);
                }
                lVar2.f14358d.set(lVar2.f14357c & i10, obj);
                i10++;
            }
            f.set(lVar2, (-1152921504606846977L) & j10);
            while (!atomicReferenceFieldUpdater2.compareAndSet(this, null, lVar2) && atomicReferenceFieldUpdater2.get(this) == null) {
            }
        }
    }

    public final Object d() {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f;
        while (true) {
            long j10 = atomicLongFieldUpdater.get(this);
            if ((j10 & 1152921504606846976L) != 0) {
                return f14354g;
            }
            int i10 = (int) ((j10 & 1073741823) >> 0);
            int i11 = this.f14357c;
            int i12 = ((int) ((1152921503533105152L & j10) >> 30)) & i11;
            int i13 = i11 & i10;
            if (i12 == i13) {
                return null;
            }
            Object obj = this.f14358d.get(i13);
            if (obj == null) {
                if (this.f14356b) {
                    return null;
                }
            } else {
                if (obj instanceof a) {
                    return null;
                }
                long j11 = ((i10 + 1) & 1073741823) << 0;
                if (f.compareAndSet(this, j10, (j10 & (-1073741824)) | j11)) {
                    this.f14358d.set(this.f14357c & i10, null);
                    return obj;
                }
                if (this.f14356b) {
                    l<E> lVar = this;
                    do {
                        AtomicLongFieldUpdater atomicLongFieldUpdater2 = f;
                        while (true) {
                            long j12 = atomicLongFieldUpdater2.get(lVar);
                            int i14 = (int) ((j12 & 1073741823) >> 0);
                            if ((j12 & 1152921504606846976L) != 0) {
                                lVar = lVar.c();
                                break;
                            }
                            if (f.compareAndSet(lVar, j12, (j12 & (-1073741824)) | j11)) {
                                lVar.f14358d.set(lVar.f14357c & i14, null);
                                lVar = null;
                                break;
                            }
                        }
                    } while (lVar != null);
                    return obj;
                }
            }
        }
    }
}
