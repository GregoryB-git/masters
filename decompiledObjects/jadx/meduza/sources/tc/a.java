package tc;

import d2.h0;
import ec.s;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import nc.g0;
import sc.r;

/* loaded from: classes.dex */
public final class a implements Executor, Closeable {

    /* renamed from: p, reason: collision with root package name */
    public static final AtomicLongFieldUpdater f14742p = AtomicLongFieldUpdater.newUpdater(a.class, "parkedWorkersStack");

    /* renamed from: q, reason: collision with root package name */
    public static final AtomicLongFieldUpdater f14743q = AtomicLongFieldUpdater.newUpdater(a.class, "controlState");

    /* renamed from: r, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f14744r = AtomicIntegerFieldUpdater.newUpdater(a.class, "_isTerminated");

    /* renamed from: s, reason: collision with root package name */
    public static final h0 f14745s = new h0("NOT_IN_STACK", 9);
    private volatile int _isTerminated;

    /* renamed from: a, reason: collision with root package name */
    public final int f14746a;

    /* renamed from: b, reason: collision with root package name */
    public final int f14747b;

    /* renamed from: c, reason: collision with root package name */
    public final long f14748c;
    private volatile long controlState;

    /* renamed from: d, reason: collision with root package name */
    public final String f14749d;

    /* renamed from: e, reason: collision with root package name */
    public final d f14750e;
    public final d f;

    /* renamed from: o, reason: collision with root package name */
    public final r<C0238a> f14751o;
    private volatile long parkedWorkersStack;

    /* renamed from: tc.a$a, reason: collision with other inner class name */
    public final class C0238a extends Thread {

        /* renamed from: q, reason: collision with root package name */
        public static final AtomicIntegerFieldUpdater f14752q = AtomicIntegerFieldUpdater.newUpdater(C0238a.class, "workerCtl");

        /* renamed from: a, reason: collision with root package name */
        public final l f14753a;

        /* renamed from: b, reason: collision with root package name */
        public final s<g> f14754b;

        /* renamed from: c, reason: collision with root package name */
        public int f14755c;

        /* renamed from: d, reason: collision with root package name */
        public long f14756d;

        /* renamed from: e, reason: collision with root package name */
        public long f14757e;
        public int f;
        private volatile int indexInArray;
        private volatile Object nextParkedWorker;

        /* renamed from: o, reason: collision with root package name */
        public boolean f14758o;
        private volatile int workerCtl;

        public C0238a() {
            throw null;
        }

        public C0238a(int i10) {
            setDaemon(true);
            this.f14753a = new l();
            this.f14754b = new s<>();
            this.f14755c = 4;
            this.nextParkedWorker = a.f14745s;
            this.f = gc.c.f7002a.a();
            f(i10);
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x0038  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x007f  */
        /* JADX WARN: Removed duplicated region for block: B:57:0x00d0  */
        /* JADX WARN: Removed duplicated region for block: B:62:? A[RETURN, SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final tc.g a(boolean r11) {
            /*
                Method dump skipped, instructions count: 226
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: tc.a.C0238a.a(boolean):tc.g");
        }

        public final int b() {
            return this.indexInArray;
        }

        public final Object c() {
            return this.nextParkedWorker;
        }

        public final int d(int i10) {
            int i11 = this.f;
            int i12 = i11 ^ (i11 << 13);
            int i13 = i12 ^ (i12 >> 17);
            int i14 = i13 ^ (i13 << 5);
            this.f = i14;
            int i15 = i10 - 1;
            return (i15 & i10) == 0 ? i14 & i15 : (i14 & Integer.MAX_VALUE) % i10;
        }

        public final g e() {
            d dVar;
            if (d(2) == 0) {
                g d10 = a.this.f14750e.d();
                if (d10 != null) {
                    return d10;
                }
                dVar = a.this.f;
            } else {
                g d11 = a.this.f.d();
                if (d11 != null) {
                    return d11;
                }
                dVar = a.this.f14750e;
            }
            return dVar.d();
        }

        public final void f(int i10) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(a.this.f14749d);
            sb2.append("-worker-");
            sb2.append(i10 == 0 ? "TERMINATED" : String.valueOf(i10));
            setName(sb2.toString());
            this.indexInArray = i10;
        }

        public final void g(Object obj) {
            this.nextParkedWorker = obj;
        }

        public final boolean h(int i10) {
            int i11 = this.f14755c;
            boolean z10 = i11 == 1;
            if (z10) {
                a.f14743q.addAndGet(a.this, 4398046511104L);
            }
            if (i11 != i10) {
                this.f14755c = i10;
            }
            return z10;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:22:0x00d8  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x00ce A[SYNTHETIC] */
        /* JADX WARN: Type inference failed for: r7v4 */
        /* JADX WARN: Type inference failed for: r7v5, types: [tc.g] */
        /* JADX WARN: Type inference failed for: r7v9, types: [tc.g] */
        /* JADX WARN: Type inference failed for: r8v3, types: [T, java.lang.Object, tc.g] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final tc.g i(int r22) {
            /*
                Method dump skipped, instructions count: 264
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: tc.a.C0238a.i(int):tc.g");
        }

        /* JADX WARN: Code restructure failed: missing block: B:100:0x0044, code lost:
        
            r0 = r20.f14759p;
         */
        /* JADX WARN: Code restructure failed: missing block: B:101:0x004a, code lost:
        
            if (r0.I() == false) goto L24;
         */
        /* JADX WARN: Code restructure failed: missing block: B:103:0x0057, code lost:
        
            if (r0.H(tc.a.f14743q.get(r0)) == false) goto L27;
         */
        /* JADX WARN: Code restructure failed: missing block: B:104:0x005a, code lost:
        
            r0.I();
         */
        /* JADX WARN: Code restructure failed: missing block: B:105:0x005d, code lost:
        
            r20.f14759p.getClass();
         */
        /* JADX WARN: Code restructure failed: missing block: B:107:0x0062, code lost:
        
            r4.run();
         */
        /* JADX WARN: Code restructure failed: missing block: B:108:0x0073, code lost:
        
            if (r2 == 0) goto L125;
         */
        /* JADX WARN: Code restructure failed: missing block: B:110:0x0076, code lost:
        
            tc.a.f14743q.addAndGet(r20.f14759p, -2097152);
         */
        /* JADX WARN: Code restructure failed: missing block: B:111:0x007f, code lost:
        
            if (r20.f14755c != 5) goto L121;
         */
        /* JADX WARN: Code restructure failed: missing block: B:113:0x0081, code lost:
        
            r20.f14755c = 4;
         */
        /* JADX WARN: Code restructure failed: missing block: B:118:0x0066, code lost:
        
            r0 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:94:0x002a, code lost:
        
            r20.f14757e = 0;
            r2 = r4.f14766b.c();
            r20.f14756d = 0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:95:0x0037, code lost:
        
            if (r20.f14755c != 3) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:96:0x0039, code lost:
        
            r20.f14755c = 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:97:0x003b, code lost:
        
            if (r2 != 0) goto L19;
         */
        /* JADX WARN: Code restructure failed: missing block: B:99:0x0042, code lost:
        
            if (h(2) == false) goto L28;
         */
        @Override // java.lang.Thread, java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void run() {
            /*
                Method dump skipped, instructions count: 438
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: tc.a.C0238a.run():void");
        }
    }

    public a(int i10, int i11, long j10, String str) {
        this.f14746a = i10;
        this.f14747b = i11;
        this.f14748c = j10;
        this.f14749d = str;
        if (!(i10 >= 1)) {
            throw new IllegalArgumentException(a0.j.h("Core pool size ", i10, " should be at least 1").toString());
        }
        if (!(i11 >= i10)) {
            throw new IllegalArgumentException(defpackage.f.i("Max pool size ", i11, " should be greater than or equals to core pool size ", i10).toString());
        }
        if (!(i11 <= 2097150)) {
            throw new IllegalArgumentException(a0.j.h("Max pool size ", i11, " should not exceed maximal supported number of threads 2097150").toString());
        }
        if (!(j10 > 0)) {
            throw new IllegalArgumentException(("Idle worker keep alive time " + j10 + " must be positive").toString());
        }
        this.f14750e = new d();
        this.f = new d();
        this.f14751o = new r<>((i10 + 1) * 2);
        this.controlState = i10 << 42;
        this._isTerminated = 0;
    }

    public final void C(C0238a c0238a, int i10, int i11) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f14742p;
        while (true) {
            long j10 = atomicLongFieldUpdater.get(this);
            int i12 = (int) (2097151 & j10);
            long j11 = (2097152 + j10) & (-2097152);
            if (i12 == i10) {
                if (i11 == 0) {
                    C0238a c0238a2 = c0238a;
                    while (true) {
                        Object c10 = c0238a2.c();
                        if (c10 == f14745s) {
                            i12 = -1;
                            break;
                        }
                        if (c10 == null) {
                            i12 = 0;
                            break;
                        }
                        c0238a2 = (C0238a) c10;
                        int b10 = c0238a2.b();
                        if (b10 != 0) {
                            i12 = b10;
                            break;
                        }
                    }
                } else {
                    i12 = i11;
                }
            }
            if (i12 >= 0 && f14742p.compareAndSet(this, j10, j11 | i12)) {
                return;
            }
        }
    }

    public final boolean H(long j10) {
        int i10 = ((int) (2097151 & j10)) - ((int) ((j10 & 4398044413952L) >> 21));
        if (i10 < 0) {
            i10 = 0;
        }
        if (i10 < this.f14746a) {
            int f = f();
            if (f == 1 && this.f14746a > 1) {
                f();
            }
            if (f > 0) {
                return true;
            }
        }
        return false;
    }

    public final boolean I() {
        C0238a b10;
        h0 h0Var;
        int i10;
        do {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f14742p;
            while (true) {
                long j10 = atomicLongFieldUpdater.get(this);
                b10 = this.f14751o.b((int) (2097151 & j10));
                if (b10 != null) {
                    long j11 = (2097152 + j10) & (-2097152);
                    C0238a c0238a = b10;
                    while (true) {
                        Object c10 = c0238a.c();
                        h0Var = f14745s;
                        if (c10 == h0Var) {
                            i10 = -1;
                            break;
                        }
                        if (c10 == null) {
                            i10 = 0;
                            break;
                        }
                        c0238a = (C0238a) c10;
                        i10 = c0238a.b();
                        if (i10 != 0) {
                            break;
                        }
                    }
                    if (i10 >= 0 && f14742p.compareAndSet(this, j10, i10 | j11)) {
                        b10.g(h0Var);
                        break;
                    }
                } else {
                    b10 = null;
                    break;
                }
            }
            if (b10 == null) {
                return false;
            }
        } while (!C0238a.f14752q.compareAndSet(b10, -1, 0));
        LockSupport.unpark(b10);
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x008a, code lost:
    
        if (r1 == null) goto L40;
     */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void close() {
        /*
            r9 = this;
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = tc.a.f14744r
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r9, r1, r2)
            if (r0 != 0) goto Lc
            goto Lb2
        Lc:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            boolean r3 = r0 instanceof tc.a.C0238a
            r4 = 0
            if (r3 == 0) goto L18
            tc.a$a r0 = (tc.a.C0238a) r0
            goto L19
        L18:
            r0 = r4
        L19:
            if (r0 == 0) goto L24
            tc.a r3 = tc.a.this
            boolean r3 = ec.i.a(r3, r9)
            if (r3 == 0) goto L24
            goto L25
        L24:
            r0 = r4
        L25:
            sc.r<tc.a$a> r3 = r9.f14751o
            monitor-enter(r3)
            java.util.concurrent.atomic.AtomicLongFieldUpdater r5 = tc.a.f14743q     // Catch: java.lang.Throwable -> Lc6
            long r5 = r5.get(r9)     // Catch: java.lang.Throwable -> Lc6
            r7 = 2097151(0x1fffff, double:1.0361303E-317)
            long r5 = r5 & r7
            int r5 = (int) r5
            monitor-exit(r3)
            if (r2 > r5) goto L7a
            r3 = r2
        L37:
            sc.r<tc.a$a> r6 = r9.f14751o
            java.lang.Object r6 = r6.b(r3)
            ec.i.b(r6)
            tc.a$a r6 = (tc.a.C0238a) r6
            if (r6 == r0) goto L75
        L44:
            boolean r7 = r6.isAlive()
            if (r7 == 0) goto L53
            java.util.concurrent.locks.LockSupport.unpark(r6)
            r7 = 10000(0x2710, double:4.9407E-320)
            r6.join(r7)
            goto L44
        L53:
            tc.l r6 = r6.f14753a
            tc.d r7 = r9.f
            r6.getClass()
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r8 = tc.l.f14776b
            java.lang.Object r8 = r8.getAndSet(r6, r4)
            tc.g r8 = (tc.g) r8
            if (r8 == 0) goto L67
            r7.a(r8)
        L67:
            tc.g r8 = r6.b()
            if (r8 != 0) goto L6f
            r8 = r1
            goto L73
        L6f:
            r7.a(r8)
            r8 = r2
        L73:
            if (r8 != 0) goto L67
        L75:
            if (r3 == r5) goto L7a
            int r3 = r3 + 1
            goto L37
        L7a:
            tc.d r1 = r9.f
            r1.b()
            tc.d r1 = r9.f14750e
            r1.b()
        L84:
            if (r0 == 0) goto L8c
            tc.g r1 = r0.a(r2)
            if (r1 != 0) goto Lb3
        L8c:
            tc.d r1 = r9.f14750e
            java.lang.Object r1 = r1.d()
            tc.g r1 = (tc.g) r1
            if (r1 != 0) goto Lb3
            tc.d r1 = r9.f
            java.lang.Object r1 = r1.d()
            tc.g r1 = (tc.g) r1
            if (r1 != 0) goto Lb3
            if (r0 == 0) goto La6
            r1 = 5
            r0.h(r1)
        La6:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = tc.a.f14742p
            r1 = 0
            r0.set(r9, r1)
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = tc.a.f14743q
            r0.set(r9, r1)
        Lb2:
            return
        Lb3:
            r1.run()     // Catch: java.lang.Throwable -> Lb7
            goto L84
        Lb7:
            r1 = move-exception
            java.lang.Thread r3 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> Lc4
            java.lang.Thread$UncaughtExceptionHandler r4 = r3.getUncaughtExceptionHandler()     // Catch: java.lang.Throwable -> Lc4
            r4.uncaughtException(r3, r1)     // Catch: java.lang.Throwable -> Lc4
            goto L84
        Lc4:
            r0 = move-exception
            throw r0
        Lc6:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: tc.a.close():void");
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        g(runnable, j.f14773g, false);
    }

    public final int f() {
        synchronized (this.f14751o) {
            if (f14744r.get(this) != 0) {
                return -1;
            }
            AtomicLongFieldUpdater atomicLongFieldUpdater = f14743q;
            long j10 = atomicLongFieldUpdater.get(this);
            int i10 = (int) (j10 & 2097151);
            int i11 = i10 - ((int) ((j10 & 4398044413952L) >> 21));
            if (i11 < 0) {
                i11 = 0;
            }
            if (i11 >= this.f14746a) {
                return 0;
            }
            if (i10 >= this.f14747b) {
                return 0;
            }
            int i12 = ((int) (atomicLongFieldUpdater.get(this) & 2097151)) + 1;
            if (!(i12 > 0 && this.f14751o.b(i12) == null)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            C0238a c0238a = new C0238a(i12);
            this.f14751o.c(i12, c0238a);
            if (!(i12 == ((int) (2097151 & atomicLongFieldUpdater.incrementAndGet(this))))) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            int i13 = i11 + 1;
            c0238a.start();
            return i13;
        }
    }

    public final void g(Runnable runnable, h hVar, boolean z10) {
        g iVar;
        j.f.getClass();
        long nanoTime = System.nanoTime();
        if (runnable instanceof g) {
            iVar = (g) runnable;
            iVar.f14765a = nanoTime;
            iVar.f14766b = hVar;
        } else {
            iVar = new i(runnable, nanoTime, hVar);
        }
        boolean z11 = false;
        boolean z12 = iVar.f14766b.c() == 1;
        long addAndGet = z12 ? f14743q.addAndGet(this, 2097152L) : 0L;
        Thread currentThread = Thread.currentThread();
        C0238a c0238a = currentThread instanceof C0238a ? (C0238a) currentThread : null;
        if (c0238a == null || !ec.i.a(a.this, this)) {
            c0238a = null;
        }
        if (c0238a != null && c0238a.f14755c != 5 && (iVar.f14766b.c() != 0 || c0238a.f14755c != 2)) {
            c0238a.f14758o = true;
            l lVar = c0238a.f14753a;
            if (z10) {
                iVar = lVar.a(iVar);
            } else {
                lVar.getClass();
                g gVar = (g) l.f14776b.getAndSet(lVar, iVar);
                iVar = gVar == null ? null : lVar.a(gVar);
            }
        }
        if (iVar != null) {
            if (!(iVar.f14766b.c() == 1 ? this.f : this.f14750e).a(iVar)) {
                throw new RejectedExecutionException(defpackage.g.f(new StringBuilder(), this.f14749d, " was terminated"));
            }
        }
        if (z10 && c0238a != null) {
            z11 = true;
        }
        if (z12) {
            if (z11 || I() || H(addAndGet)) {
                return;
            }
            I();
            return;
        }
        if (z11 || I() || H(f14743q.get(this))) {
            return;
        }
        I();
    }

    public final String toString() {
        StringBuilder sb2;
        char c10;
        ArrayList arrayList = new ArrayList();
        int a10 = this.f14751o.a();
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        for (int i15 = 1; i15 < a10; i15++) {
            C0238a b10 = this.f14751o.b(i15);
            if (b10 != null) {
                l lVar = b10.f14753a;
                lVar.getClass();
                int i16 = l.f14776b.get(lVar) != null ? (l.f14777c.get(lVar) - l.f14778d.get(lVar)) + 1 : l.f14777c.get(lVar) - l.f14778d.get(lVar);
                int c11 = q0.g.c(b10.f14755c);
                if (c11 == 0) {
                    i10++;
                    sb2 = new StringBuilder();
                    sb2.append(i16);
                    c10 = 'c';
                } else if (c11 == 1) {
                    i11++;
                    sb2 = new StringBuilder();
                    sb2.append(i16);
                    c10 = 'b';
                } else if (c11 == 2) {
                    i12++;
                } else if (c11 == 3) {
                    i13++;
                    if (i16 > 0) {
                        sb2 = new StringBuilder();
                        sb2.append(i16);
                        c10 = 'd';
                    }
                } else if (c11 == 4) {
                    i14++;
                }
                sb2.append(c10);
                arrayList.add(sb2.toString());
            }
        }
        long j10 = f14743q.get(this);
        return this.f14749d + '@' + g0.b(this) + "[Pool Size {core = " + this.f14746a + ", max = " + this.f14747b + "}, Worker States {CPU = " + i10 + ", blocking = " + i11 + ", parked = " + i12 + ", dormant = " + i13 + ", terminated = " + i14 + "}, running workers queues = " + arrayList + ", global CPU queue size = " + this.f14750e.c() + ", global blocking queue size = " + this.f.c() + ", Control State {created workers= " + ((int) (2097151 & j10)) + ", blocking tasks = " + ((int) ((4398044413952L & j10) >> 21)) + ", CPUs acquired = " + (this.f14746a - ((int) ((j10 & 9223367638808264704L) >> 42))) + "}]";
    }
}
