package u6;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import u.AbstractC1997b;

/* loaded from: classes.dex */
public final class s {

    /* renamed from: e, reason: collision with root package name */
    public static final a f20003e = new a(null);

    /* renamed from: f, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f20004f = AtomicReferenceFieldUpdater.newUpdater(s.class, Object.class, "_next");

    /* renamed from: g, reason: collision with root package name */
    public static final AtomicLongFieldUpdater f20005g = AtomicLongFieldUpdater.newUpdater(s.class, "_state");

    /* renamed from: h, reason: collision with root package name */
    public static final F f20006h = new F("REMOVE_FROZEN");
    private volatile Object _next;
    private volatile long _state;

    /* renamed from: a, reason: collision with root package name */
    public final int f20007a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f20008b;

    /* renamed from: c, reason: collision with root package name */
    public final int f20009c;

    /* renamed from: d, reason: collision with root package name */
    public final AtomicReferenceArray f20010d;

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }

        public final int a(long j7) {
            return (j7 & 2305843009213693952L) != 0 ? 2 : 1;
        }

        public final long b(long j7, int i7) {
            return d(j7, 1073741823L) | i7;
        }

        public final long c(long j7, int i7) {
            return d(j7, 1152921503533105152L) | (i7 << 30);
        }

        public final long d(long j7, long j8) {
            return j7 & (~j8);
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final int f20011a;

        public b(int i7) {
            this.f20011a = i7;
        }
    }

    public s(int i7, boolean z7) {
        this.f20007a = i7;
        this.f20008b = z7;
        int i8 = i7 - 1;
        this.f20009c = i8;
        this.f20010d = new AtomicReferenceArray(i7);
        if (i8 > 1073741823) {
            throw new IllegalStateException("Check failed.".toString());
        }
        if ((i7 & i8) != 0) {
            throw new IllegalStateException("Check failed.".toString());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x004e, code lost:
    
        return 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int a(java.lang.Object r13) {
        /*
            r12 = this;
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = u6.s.f20005g
        L2:
            long r3 = r0.get(r12)
            r1 = 3458764513820540928(0x3000000000000000, double:1.727233711018889E-77)
            long r1 = r1 & r3
            r7 = 0
            int r1 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r1 == 0) goto L16
            u6.s$a r13 = u6.s.f20003e
            int r13 = r13.a(r3)
            return r13
        L16:
            r1 = 1073741823(0x3fffffff, double:5.304989472E-315)
            long r1 = r1 & r3
            int r1 = (int) r1
            r5 = 1152921503533105152(0xfffffffc0000000, double:1.2882296003504729E-231)
            long r5 = r5 & r3
            r2 = 30
            long r5 = r5 >> r2
            int r9 = (int) r5
            int r10 = r12.f20009c
            int r2 = r9 + 2
            r2 = r2 & r10
            r5 = r1 & r10
            r6 = 1
            if (r2 != r5) goto L30
            return r6
        L30:
            boolean r2 = r12.f20008b
            r5 = 1073741823(0x3fffffff, float:1.9999999)
            if (r2 != 0) goto L4f
            java.util.concurrent.atomic.AtomicReferenceArray r2 = r12.f20010d
            r11 = r9 & r10
            java.lang.Object r2 = r2.get(r11)
            if (r2 == 0) goto L4f
            int r2 = r12.f20007a
            r3 = 1024(0x400, float:1.435E-42)
            if (r2 < r3) goto L4e
            int r9 = r9 - r1
            r1 = r9 & r5
            int r2 = r2 >> 1
            if (r1 <= r2) goto L2
        L4e:
            return r6
        L4f:
            int r1 = r9 + 1
            r1 = r1 & r5
            java.util.concurrent.atomic.AtomicLongFieldUpdater r2 = u6.s.f20005g
            u6.s$a r5 = u6.s.f20003e
            long r5 = r5.c(r3, r1)
            r1 = r2
            r2 = r12
            boolean r1 = r1.compareAndSet(r2, r3, r5)
            if (r1 == 0) goto L2
            java.util.concurrent.atomic.AtomicReferenceArray r0 = r12.f20010d
            r1 = r9 & r10
            r0.set(r1, r13)
            r0 = r12
        L6a:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = u6.s.f20005g
            long r1 = r1.get(r0)
            r3 = 1152921504606846976(0x1000000000000000, double:1.2882297539194267E-231)
            long r1 = r1 & r3
            int r1 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r1 == 0) goto L81
            u6.s r0 = r0.i()
            u6.s r0 = r0.e(r9, r13)
            if (r0 != 0) goto L6a
        L81:
            r13 = 0
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: u6.s.a(java.lang.Object):int");
    }

    public final s b(long j7) {
        s sVar = new s(this.f20007a * 2, this.f20008b);
        int i7 = (int) (1073741823 & j7);
        int i8 = (int) ((1152921503533105152L & j7) >> 30);
        while (true) {
            int i9 = this.f20009c;
            if ((i7 & i9) == (i8 & i9)) {
                f20005g.set(sVar, f20003e.d(j7, 1152921504606846976L));
                return sVar;
            }
            Object obj = this.f20010d.get(i9 & i7);
            if (obj == null) {
                obj = new b(i7);
            }
            sVar.f20010d.set(sVar.f20009c & i7, obj);
            i7++;
        }
    }

    public final s c(long j7) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f20004f;
        while (true) {
            s sVar = (s) atomicReferenceFieldUpdater.get(this);
            if (sVar != null) {
                return sVar;
            }
            AbstractC1997b.a(f20004f, this, null, b(j7));
        }
    }

    public final boolean d() {
        long j7;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f20005g;
        do {
            j7 = atomicLongFieldUpdater.get(this);
            if ((j7 & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & j7) != 0) {
                return false;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j7, j7 | 2305843009213693952L));
        return true;
    }

    public final s e(int i7, Object obj) {
        Object obj2 = this.f20010d.get(this.f20009c & i7);
        if (!(obj2 instanceof b) || ((b) obj2).f20011a != i7) {
            return null;
        }
        this.f20010d.set(i7 & this.f20009c, obj);
        return this;
    }

    public final int f() {
        long j7 = f20005g.get(this);
        return (((int) ((j7 & 1152921503533105152L) >> 30)) - ((int) (1073741823 & j7))) & 1073741823;
    }

    public final boolean g() {
        long j7 = f20005g.get(this);
        return ((int) (1073741823 & j7)) == ((int) ((j7 & 1152921503533105152L) >> 30));
    }

    public final long h() {
        long j7;
        long j8;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f20005g;
        do {
            j7 = atomicLongFieldUpdater.get(this);
            if ((j7 & 1152921504606846976L) != 0) {
                return j7;
            }
            j8 = j7 | 1152921504606846976L;
        } while (!atomicLongFieldUpdater.compareAndSet(this, j7, j8));
        return j8;
    }

    public final s i() {
        return c(h());
    }

    public final Object j() {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f20005g;
        while (true) {
            long j7 = atomicLongFieldUpdater.get(this);
            if ((1152921504606846976L & j7) != 0) {
                return f20006h;
            }
            int i7 = (int) (1073741823 & j7);
            int i8 = this.f20009c;
            if ((((int) ((1152921503533105152L & j7) >> 30)) & i8) == (i7 & i8)) {
                return null;
            }
            Object obj = this.f20010d.get(i8 & i7);
            if (obj == null) {
                if (this.f20008b) {
                    return null;
                }
            } else {
                if (obj instanceof b) {
                    return null;
                }
                int i9 = (i7 + 1) & 1073741823;
                if (f20005g.compareAndSet(this, j7, f20003e.b(j7, i9))) {
                    this.f20010d.set(this.f20009c & i7, null);
                    return obj;
                }
                if (this.f20008b) {
                    s sVar = this;
                    do {
                        sVar = sVar.k(i7, i9);
                    } while (sVar != null);
                    return obj;
                }
            }
        }
    }

    public final s k(int i7, int i8) {
        long j7;
        int i9;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f20005g;
        do {
            j7 = atomicLongFieldUpdater.get(this);
            i9 = (int) (1073741823 & j7);
            if ((1152921504606846976L & j7) != 0) {
                return i();
            }
        } while (!f20005g.compareAndSet(this, j7, f20003e.b(j7, i8)));
        this.f20010d.set(this.f20009c & i9, null);
        return null;
    }
}
