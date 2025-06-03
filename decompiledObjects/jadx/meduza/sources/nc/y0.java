package nc;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import nc.l0;

/* loaded from: classes.dex */
public abstract class y0 extends z0 implements l0 {

    /* renamed from: o, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f11569o = AtomicReferenceFieldUpdater.newUpdater(y0.class, Object.class, "_queue");

    /* renamed from: p, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f11570p = AtomicReferenceFieldUpdater.newUpdater(y0.class, Object.class, "_delayed");

    /* renamed from: q, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f11571q = AtomicIntegerFieldUpdater.newUpdater(y0.class, "_isCompleted");
    private volatile Object _delayed;
    private volatile int _isCompleted = 0;
    private volatile Object _queue;

    public final class a extends c {

        /* renamed from: c, reason: collision with root package name */
        public final k<rb.h> f11572c;

        public a(long j10, l lVar) {
            super(j10);
            this.f11572c = lVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f11572c.h(y0.this, rb.h.f13851a);
        }

        @Override // nc.y0.c
        public final String toString() {
            return super.toString() + this.f11572c;
        }
    }

    public static final class b extends c {

        /* renamed from: c, reason: collision with root package name */
        public final Runnable f11574c;

        public b(e2 e2Var, long j10) {
            super(j10);
            this.f11574c = e2Var;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f11574c.run();
        }

        @Override // nc.y0.c
        public final String toString() {
            return super.toString() + this.f11574c;
        }
    }

    public static abstract class c implements Runnable, Comparable<c>, t0, sc.y {
        private volatile Object _heap;

        /* renamed from: a, reason: collision with root package name */
        public long f11575a;

        /* renamed from: b, reason: collision with root package name */
        public int f11576b = -1;

        public c(long j10) {
            this.f11575a = j10;
        }

        @Override // java.lang.Comparable
        public final int compareTo(c cVar) {
            long j10 = this.f11575a - cVar.f11575a;
            if (j10 > 0) {
                return 1;
            }
            return j10 < 0 ? -1 : 0;
        }

        @Override // nc.t0
        public final void dispose() {
            synchronized (this) {
                Object obj = this._heap;
                d2.h0 h0Var = p2.m0.f12897r;
                if (obj == h0Var) {
                    return;
                }
                d dVar = obj instanceof d ? (d) obj : null;
                if (dVar != null) {
                    synchronized (dVar) {
                        Object obj2 = this._heap;
                        if ((obj2 instanceof sc.x ? (sc.x) obj2 : null) != null) {
                            dVar.c(this.f11576b);
                        }
                    }
                }
                this._heap = h0Var;
                rb.h hVar = rb.h.f13851a;
            }
        }

        @Override // sc.y
        public final void f(d dVar) {
            if (!(this._heap != p2.m0.f12897r)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            this._heap = dVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:26:0x0034, code lost:
        
            if ((r8 - r10.f11577c) > 0) goto L26;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final int h(long r8, nc.y0.d r10, nc.y0 r11) {
            /*
                r7 = this;
                monitor-enter(r7)
                java.lang.Object r0 = r7._heap     // Catch: java.lang.Throwable -> L4c
                d2.h0 r1 = p2.m0.f12897r     // Catch: java.lang.Throwable -> L4c
                r2 = 0
                if (r0 != r1) goto La
                r2 = 2
                goto L47
            La:
                monitor-enter(r10)     // Catch: java.lang.Throwable -> L4c
                T extends sc.y & java.lang.Comparable<? super T>[] r0 = r10.f14378a     // Catch: java.lang.Throwable -> L49
                if (r0 == 0) goto L12
                r0 = r0[r2]     // Catch: java.lang.Throwable -> L49
                goto L13
            L12:
                r0 = 0
            L13:
                nc.y0$c r0 = (nc.y0.c) r0     // Catch: java.lang.Throwable -> L49
                boolean r11 = nc.y0.K0(r11)     // Catch: java.lang.Throwable -> L49
                if (r11 == 0) goto L1f
                r8 = 1
                monitor-exit(r10)     // Catch: java.lang.Throwable -> L4c
                monitor-exit(r7)
                return r8
            L1f:
                r3 = 0
                if (r0 != 0) goto L24
                goto L36
            L24:
                long r0 = r0.f11575a     // Catch: java.lang.Throwable -> L49
                long r5 = r0 - r8
                int r11 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
                if (r11 < 0) goto L2d
                goto L2e
            L2d:
                r8 = r0
            L2e:
                long r0 = r10.f11577c     // Catch: java.lang.Throwable -> L49
                long r0 = r8 - r0
                int r11 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
                if (r11 <= 0) goto L38
            L36:
                r10.f11577c = r8     // Catch: java.lang.Throwable -> L49
            L38:
                long r8 = r7.f11575a     // Catch: java.lang.Throwable -> L49
                long r0 = r10.f11577c     // Catch: java.lang.Throwable -> L49
                long r8 = r8 - r0
                int r8 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
                if (r8 >= 0) goto L43
                r7.f11575a = r0     // Catch: java.lang.Throwable -> L49
            L43:
                r10.a(r7)     // Catch: java.lang.Throwable -> L49
                monitor-exit(r10)     // Catch: java.lang.Throwable -> L4c
            L47:
                monitor-exit(r7)
                return r2
            L49:
                r8 = move-exception
                monitor-exit(r10)     // Catch: java.lang.Throwable -> L4c
                throw r8     // Catch: java.lang.Throwable -> L4c
            L4c:
                r8 = move-exception
                monitor-exit(r7)
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: nc.y0.c.h(long, nc.y0$d, nc.y0):int");
        }

        @Override // sc.y
        public final void setIndex(int i10) {
            this.f11576b = i10;
        }

        public String toString() {
            StringBuilder l10 = defpackage.f.l("Delayed[nanos=");
            l10.append(this.f11575a);
            l10.append(']');
            return l10.toString();
        }
    }

    public static final class d extends sc.x<c> {

        /* renamed from: c, reason: collision with root package name */
        public long f11577c;

        public d(long j10) {
            this.f11577c = j10;
        }
    }

    public static final boolean K0(y0 y0Var) {
        y0Var.getClass();
        return f11571q.get(y0Var) != 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:108:0x008c, code lost:
    
        r8 = null;
     */
    @Override // nc.x0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long G0() {
        /*
            Method dump skipped, instructions count: 284
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: nc.y0.G0():long");
    }

    public void L0(Runnable runnable) {
        if (!M0(runnable)) {
            h0.f11502r.L0(runnable);
            return;
        }
        Thread I0 = I0();
        if (Thread.currentThread() != I0) {
            LockSupport.unpark(I0);
        }
    }

    public final boolean M0(Runnable runnable) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f11569o;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            boolean z10 = false;
            if (f11571q.get(this) != 0) {
                return false;
            }
            if (obj == null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f11569o;
                while (true) {
                    if (atomicReferenceFieldUpdater2.compareAndSet(this, null, runnable)) {
                        z10 = true;
                        break;
                    }
                    if (atomicReferenceFieldUpdater2.get(this) != null) {
                        break;
                    }
                }
                if (z10) {
                    return true;
                }
            } else if (obj instanceof sc.l) {
                sc.l lVar = (sc.l) obj;
                int a10 = lVar.a(runnable);
                if (a10 == 0) {
                    return true;
                }
                if (a10 == 1) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = f11569o;
                    sc.l c10 = lVar.c();
                    while (!atomicReferenceFieldUpdater3.compareAndSet(this, obj, c10) && atomicReferenceFieldUpdater3.get(this) == obj) {
                    }
                } else if (a10 == 2) {
                    return false;
                }
            } else {
                if (obj == p2.m0.f12898s) {
                    return false;
                }
                sc.l lVar2 = new sc.l(8, true);
                lVar2.a((Runnable) obj);
                lVar2.a(runnable);
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4 = f11569o;
                while (true) {
                    if (atomicReferenceFieldUpdater4.compareAndSet(this, obj, lVar2)) {
                        z10 = true;
                        break;
                    }
                    if (atomicReferenceFieldUpdater4.get(this) != obj) {
                        break;
                    }
                }
                if (z10) {
                    return true;
                }
            }
        }
    }

    public final boolean N0() {
        sb.i<p0<?>> iVar = this.f11564e;
        if (!(iVar != null ? iVar.isEmpty() : true)) {
            return false;
        }
        d dVar = (d) f11570p.get(this);
        if (dVar != null) {
            if (!(dVar.b() == 0)) {
                return false;
            }
        }
        Object obj = f11569o.get(this);
        if (obj == null) {
            return true;
        }
        if (obj instanceof sc.l) {
            long j10 = sc.l.f.get((sc.l) obj);
            if (((int) ((1073741823 & j10) >> 0)) == ((int) ((j10 & 1152921503533105152L) >> 30))) {
                return true;
            }
        } else if (obj == p2.m0.f12898s) {
            return true;
        }
        return false;
    }

    public final void O0(long j10, c cVar) {
        int h10;
        Thread I0;
        if (f11571q.get(this) != 0) {
            h10 = 1;
        } else {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f11570p;
            d dVar = (d) atomicReferenceFieldUpdater.get(this);
            if (dVar == null) {
                d dVar2 = new d(j10);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, null, dVar2) && atomicReferenceFieldUpdater.get(this) == null) {
                }
                Object obj = f11570p.get(this);
                ec.i.b(obj);
                dVar = (d) obj;
            }
            h10 = cVar.h(j10, dVar, this);
        }
        if (h10 != 0) {
            if (h10 == 1) {
                J0(j10, cVar);
                return;
            } else {
                if (h10 != 2) {
                    throw new IllegalStateException("unexpected result".toString());
                }
                return;
            }
        }
        d dVar3 = (d) f11570p.get(this);
        if (dVar3 != null) {
            synchronized (dVar3) {
                Object[] objArr = dVar3.f14378a;
                r3 = objArr != null ? objArr[0] : null;
            }
            r3 = (c) r3;
        }
        if (!(r3 == cVar) || Thread.currentThread() == (I0 = I0())) {
            return;
        }
        LockSupport.unpark(I0);
    }

    @Override // nc.l0
    public final void f(long j10, l lVar) {
        long j11 = j10 > 0 ? j10 >= 9223372036854L ? Long.MAX_VALUE : 1000000 * j10 : 0L;
        if (j11 < 4611686018427387903L) {
            long nanoTime = System.nanoTime();
            a aVar = new a(j11 + nanoTime, lVar);
            O0(nanoTime, aVar);
            lVar.v(new u0(aVar));
        }
    }

    public t0 q0(long j10, e2 e2Var, ub.h hVar) {
        return l0.a.a(j10, e2Var, hVar);
    }

    @Override // nc.x0
    public void shutdown() {
        boolean z10;
        c c10;
        boolean z11;
        ThreadLocal<x0> threadLocal = c2.f11479a;
        c2.f11479a.set(null);
        f11571q.set(this, 1);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f11569o;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f11569o;
                d2.h0 h0Var = p2.m0.f12898s;
                while (true) {
                    if (atomicReferenceFieldUpdater2.compareAndSet(this, null, h0Var)) {
                        z10 = true;
                        break;
                    } else if (atomicReferenceFieldUpdater2.get(this) != null) {
                        z10 = false;
                        break;
                    }
                }
                if (z10) {
                    break;
                }
            } else {
                if (obj instanceof sc.l) {
                    ((sc.l) obj).b();
                    break;
                }
                if (obj == p2.m0.f12898s) {
                    break;
                }
                sc.l lVar = new sc.l(8, true);
                lVar.a((Runnable) obj);
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = f11569o;
                while (true) {
                    if (atomicReferenceFieldUpdater3.compareAndSet(this, obj, lVar)) {
                        z11 = true;
                        break;
                    } else if (atomicReferenceFieldUpdater3.get(this) != obj) {
                        z11 = false;
                        break;
                    }
                }
                if (z11) {
                    break;
                }
            }
        }
        while (G0() <= 0) {
        }
        long nanoTime = System.nanoTime();
        while (true) {
            d dVar = (d) f11570p.get(this);
            if (dVar == null) {
                return;
            }
            synchronized (dVar) {
                c10 = dVar.b() > 0 ? dVar.c(0) : null;
            }
            c cVar = c10;
            if (cVar == null) {
                return;
            } else {
                J0(nanoTime, cVar);
            }
        }
    }

    @Override // nc.a0
    public final void z0(ub.h hVar, Runnable runnable) {
        L0(runnable);
    }
}
