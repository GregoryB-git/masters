package w6;

import V5.t;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.u;
import p6.AbstractC1840c;
import p6.M;
import u6.A;
import u6.F;

/* loaded from: classes.dex */
public final class a implements Executor, Closeable {

    /* renamed from: v, reason: collision with root package name */
    public static final C0291a f20448v = new C0291a(null);

    /* renamed from: w, reason: collision with root package name */
    public static final AtomicLongFieldUpdater f20449w = AtomicLongFieldUpdater.newUpdater(a.class, "parkedWorkersStack");

    /* renamed from: x, reason: collision with root package name */
    public static final AtomicLongFieldUpdater f20450x = AtomicLongFieldUpdater.newUpdater(a.class, "controlState");

    /* renamed from: y, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f20451y = AtomicIntegerFieldUpdater.newUpdater(a.class, "_isTerminated");

    /* renamed from: z, reason: collision with root package name */
    public static final F f20452z = new F("NOT_IN_STACK");
    private volatile int _isTerminated;
    private volatile long controlState;

    /* renamed from: o, reason: collision with root package name */
    public final int f20453o;

    /* renamed from: p, reason: collision with root package name */
    public final int f20454p;
    private volatile long parkedWorkersStack;

    /* renamed from: q, reason: collision with root package name */
    public final long f20455q;

    /* renamed from: r, reason: collision with root package name */
    public final String f20456r;

    /* renamed from: s, reason: collision with root package name */
    public final w6.d f20457s;

    /* renamed from: t, reason: collision with root package name */
    public final w6.d f20458t;

    /* renamed from: u, reason: collision with root package name */
    public final A f20459u;

    /* renamed from: w6.a$a, reason: collision with other inner class name */
    public static final class C0291a {
        public C0291a() {
        }

        public /* synthetic */ C0291a(kotlin.jvm.internal.g gVar) {
            this();
        }
    }

    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f20460a;

        static {
            int[] iArr = new int[d.values().length];
            try {
                iArr[d.PARKING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[d.BLOCKING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[d.CPU_ACQUIRED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[d.DORMANT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[d.TERMINATED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f20460a = iArr;
        }
    }

    public final class c extends Thread {

        /* renamed from: w, reason: collision with root package name */
        public static final AtomicIntegerFieldUpdater f20461w = AtomicIntegerFieldUpdater.newUpdater(c.class, "workerCtl");
        private volatile int indexInArray;
        private volatile Object nextParkedWorker;

        /* renamed from: o, reason: collision with root package name */
        public final n f20462o;

        /* renamed from: p, reason: collision with root package name */
        public final u f20463p;

        /* renamed from: q, reason: collision with root package name */
        public d f20464q;

        /* renamed from: r, reason: collision with root package name */
        public long f20465r;

        /* renamed from: s, reason: collision with root package name */
        public long f20466s;

        /* renamed from: t, reason: collision with root package name */
        public int f20467t;

        /* renamed from: u, reason: collision with root package name */
        public boolean f20468u;
        private volatile int workerCtl;

        public c() {
            setDaemon(true);
            this.f20462o = new n();
            this.f20463p = new u();
            this.f20464q = d.DORMANT;
            this.nextParkedWorker = a.f20452z;
            this.f20467t = j6.c.f15482o.c();
        }

        public static final AtomicIntegerFieldUpdater j() {
            return f20461w;
        }

        public final void b(int i7) {
            if (i7 == 0) {
                return;
            }
            a.f20450x.addAndGet(a.this, -2097152L);
            if (this.f20464q != d.TERMINATED) {
                this.f20464q = d.DORMANT;
            }
        }

        public final void c(int i7) {
            if (i7 != 0 && u(d.BLOCKING)) {
                a.this.u();
            }
        }

        public final void d(h hVar) {
            int b7 = hVar.f20486p.b();
            k(b7);
            c(b7);
            a.this.r(hVar);
            b(b7);
        }

        public final h e(boolean z7) {
            h o7;
            h o8;
            if (z7) {
                boolean z8 = m(a.this.f20453o * 2) == 0;
                if (z8 && (o8 = o()) != null) {
                    return o8;
                }
                h g7 = this.f20462o.g();
                if (g7 != null) {
                    return g7;
                }
                if (!z8 && (o7 = o()) != null) {
                    return o7;
                }
            } else {
                h o9 = o();
                if (o9 != null) {
                    return o9;
                }
            }
            return v(3);
        }

        public final h f() {
            h h7 = this.f20462o.h();
            if (h7 != null) {
                return h7;
            }
            h hVar = (h) a.this.f20458t.d();
            return hVar == null ? v(1) : hVar;
        }

        public final h g(boolean z7) {
            return s() ? e(z7) : f();
        }

        public final int h() {
            return this.indexInArray;
        }

        public final Object i() {
            return this.nextParkedWorker;
        }

        public final void k(int i7) {
            this.f20465r = 0L;
            if (this.f20464q == d.PARKING) {
                this.f20464q = d.BLOCKING;
            }
        }

        public final boolean l() {
            return this.nextParkedWorker != a.f20452z;
        }

        public final int m(int i7) {
            int i8 = this.f20467t;
            int i9 = i8 ^ (i8 << 13);
            int i10 = i9 ^ (i9 >> 17);
            int i11 = i10 ^ (i10 << 5);
            this.f20467t = i11;
            int i12 = i7 - 1;
            return (i12 & i7) == 0 ? i11 & i12 : (i11 & Integer.MAX_VALUE) % i7;
        }

        public final void n() {
            if (this.f20465r == 0) {
                this.f20465r = System.nanoTime() + a.this.f20455q;
            }
            LockSupport.parkNanos(a.this.f20455q);
            if (System.nanoTime() - this.f20465r >= 0) {
                this.f20465r = 0L;
                w();
            }
        }

        public final h o() {
            w6.d dVar;
            if (m(2) == 0) {
                h hVar = (h) a.this.f20457s.d();
                if (hVar != null) {
                    return hVar;
                }
                dVar = a.this.f20458t;
            } else {
                h hVar2 = (h) a.this.f20458t.d();
                if (hVar2 != null) {
                    return hVar2;
                }
                dVar = a.this.f20457s;
            }
            return (h) dVar.d();
        }

        public final void p() {
            loop0: while (true) {
                boolean z7 = false;
                while (!a.this.isTerminated() && this.f20464q != d.TERMINATED) {
                    h g7 = g(this.f20468u);
                    if (g7 != null) {
                        this.f20466s = 0L;
                        d(g7);
                    } else {
                        this.f20468u = false;
                        if (this.f20466s == 0) {
                            t();
                        } else if (z7) {
                            u(d.PARKING);
                            Thread.interrupted();
                            LockSupport.parkNanos(this.f20466s);
                            this.f20466s = 0L;
                        } else {
                            z7 = true;
                        }
                    }
                }
            }
            u(d.TERMINATED);
        }

        public final void q(int i7) {
            StringBuilder sb = new StringBuilder();
            sb.append(a.this.f20456r);
            sb.append("-worker-");
            sb.append(i7 == 0 ? "TERMINATED" : String.valueOf(i7));
            setName(sb.toString());
            this.indexInArray = i7;
        }

        public final void r(Object obj) {
            this.nextParkedWorker = obj;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            p();
        }

        public final boolean s() {
            long j7;
            if (this.f20464q == d.CPU_ACQUIRED) {
                return true;
            }
            a aVar = a.this;
            AtomicLongFieldUpdater atomicLongFieldUpdater = a.f20450x;
            do {
                j7 = atomicLongFieldUpdater.get(aVar);
                if (((int) ((9223367638808264704L & j7) >> 42)) == 0) {
                    return false;
                }
            } while (!a.f20450x.compareAndSet(aVar, j7, j7 - 4398046511104L));
            this.f20464q = d.CPU_ACQUIRED;
            return true;
        }

        public final void t() {
            if (!l()) {
                a.this.n(this);
                return;
            }
            f20461w.set(this, -1);
            while (l() && f20461w.get(this) == -1 && !a.this.isTerminated() && this.f20464q != d.TERMINATED) {
                u(d.PARKING);
                Thread.interrupted();
                n();
            }
        }

        public final boolean u(d dVar) {
            d dVar2 = this.f20464q;
            boolean z7 = dVar2 == d.CPU_ACQUIRED;
            if (z7) {
                a.f20450x.addAndGet(a.this, 4398046511104L);
            }
            if (dVar2 != dVar) {
                this.f20464q = dVar;
            }
            return z7;
        }

        public final h v(int i7) {
            int i8 = (int) (a.f20450x.get(a.this) & 2097151);
            if (i8 < 2) {
                return null;
            }
            int m7 = m(i8);
            a aVar = a.this;
            long j7 = Long.MAX_VALUE;
            for (int i9 = 0; i9 < i8; i9++) {
                m7++;
                if (m7 > i8) {
                    m7 = 1;
                }
                c cVar = (c) aVar.f20459u.b(m7);
                if (cVar != null && cVar != this) {
                    long n7 = cVar.f20462o.n(i7, this.f20463p);
                    if (n7 == -1) {
                        u uVar = this.f20463p;
                        h hVar = (h) uVar.f16230o;
                        uVar.f16230o = null;
                        return hVar;
                    }
                    if (n7 > 0) {
                        j7 = Math.min(j7, n7);
                    }
                }
            }
            if (j7 == Long.MAX_VALUE) {
                j7 = 0;
            }
            this.f20466s = j7;
            return null;
        }

        public final void w() {
            a aVar = a.this;
            synchronized (aVar.f20459u) {
                try {
                    if (aVar.isTerminated()) {
                        return;
                    }
                    if (((int) (a.f20450x.get(aVar) & 2097151)) <= aVar.f20453o) {
                        return;
                    }
                    if (f20461w.compareAndSet(this, -1, 1)) {
                        int i7 = this.indexInArray;
                        q(0);
                        aVar.q(this, i7, 0);
                        int andDecrement = (int) (a.f20450x.getAndDecrement(aVar) & 2097151);
                        if (andDecrement != i7) {
                            Object b7 = aVar.f20459u.b(andDecrement);
                            Intrinsics.b(b7);
                            c cVar = (c) b7;
                            aVar.f20459u.c(i7, cVar);
                            cVar.q(i7);
                            aVar.q(cVar, andDecrement, i7);
                        }
                        aVar.f20459u.c(andDecrement, null);
                        t tVar = t.f6803a;
                        this.f20464q = d.TERMINATED;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public c(a aVar, int i7) {
            this();
            q(i7);
        }
    }

    public enum d {
        CPU_ACQUIRED,
        BLOCKING,
        PARKING,
        DORMANT,
        TERMINATED
    }

    public a(int i7, int i8, long j7, String str) {
        this.f20453o = i7;
        this.f20454p = i8;
        this.f20455q = j7;
        this.f20456r = str;
        if (i7 < 1) {
            throw new IllegalArgumentException(("Core pool size " + i7 + " should be at least 1").toString());
        }
        if (i8 < i7) {
            throw new IllegalArgumentException(("Max pool size " + i8 + " should be greater than or equals to core pool size " + i7).toString());
        }
        if (i8 > 2097150) {
            throw new IllegalArgumentException(("Max pool size " + i8 + " should not exceed maximal supported number of threads 2097150").toString());
        }
        if (j7 <= 0) {
            throw new IllegalArgumentException(("Idle worker keep alive time " + j7 + " must be positive").toString());
        }
        this.f20457s = new w6.d();
        this.f20458t = new w6.d();
        this.f20459u = new A((i7 + 1) * 2);
        this.controlState = i7 << 42;
        this._isTerminated = 0;
    }

    public static /* synthetic */ void k(a aVar, Runnable runnable, i iVar, boolean z7, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            iVar = l.f20495g;
        }
        if ((i7 & 4) != 0) {
            z7 = false;
        }
        aVar.i(runnable, iVar, z7);
    }

    public static /* synthetic */ boolean x(a aVar, long j7, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            j7 = f20450x.get(aVar);
        }
        return aVar.w(j7);
    }

    public final boolean B() {
        c m7;
        do {
            m7 = m();
            if (m7 == null) {
                return false;
            }
        } while (!c.j().compareAndSet(m7, -1, 0));
        LockSupport.unpark(m7);
        return true;
    }

    public final boolean b(h hVar) {
        return (hVar.f20486p.b() == 1 ? this.f20458t : this.f20457s).a(hVar);
    }

    public final int c() {
        int a7;
        synchronized (this.f20459u) {
            try {
                if (isTerminated()) {
                    return -1;
                }
                AtomicLongFieldUpdater atomicLongFieldUpdater = f20450x;
                long j7 = atomicLongFieldUpdater.get(this);
                int i7 = (int) (j7 & 2097151);
                a7 = l6.f.a(i7 - ((int) ((j7 & 4398044413952L) >> 21)), 0);
                if (a7 >= this.f20453o) {
                    return 0;
                }
                if (i7 >= this.f20454p) {
                    return 0;
                }
                int i8 = ((int) (f20450x.get(this) & 2097151)) + 1;
                if (i8 <= 0 || this.f20459u.b(i8) != null) {
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
                c cVar = new c(this, i8);
                this.f20459u.c(i8, cVar);
                if (i8 != ((int) (2097151 & atomicLongFieldUpdater.incrementAndGet(this)))) {
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
                int i9 = a7 + 1;
                cVar.start();
                return i9;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        s(10000L);
    }

    public final h e(Runnable runnable, i iVar) {
        long a7 = l.f20494f.a();
        if (!(runnable instanceof h)) {
            return new k(runnable, a7, iVar);
        }
        h hVar = (h) runnable;
        hVar.f20485o = a7;
        hVar.f20486p = iVar;
        return hVar;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        k(this, runnable, null, false, 6, null);
    }

    public final c h() {
        Thread currentThread = Thread.currentThread();
        c cVar = currentThread instanceof c ? (c) currentThread : null;
        if (cVar == null || !Intrinsics.a(a.this, this)) {
            return null;
        }
        return cVar;
    }

    public final void i(Runnable runnable, i iVar, boolean z7) {
        AbstractC1840c.a();
        h e7 = e(runnable, iVar);
        boolean z8 = false;
        boolean z9 = e7.f20486p.b() == 1;
        long addAndGet = z9 ? f20450x.addAndGet(this, 2097152L) : 0L;
        c h7 = h();
        h v7 = v(h7, e7, z7);
        if (v7 != null && !b(v7)) {
            throw new RejectedExecutionException(this.f20456r + " was terminated");
        }
        if (z7 && h7 != null) {
            z8 = true;
        }
        if (z9) {
            t(addAndGet, z8);
        } else {
            if (z8) {
                return;
            }
            u();
        }
    }

    public final boolean isTerminated() {
        return f20451y.get(this) != 0;
    }

    public final int l(c cVar) {
        int h7;
        do {
            Object i7 = cVar.i();
            if (i7 == f20452z) {
                return -1;
            }
            if (i7 == null) {
                return 0;
            }
            cVar = (c) i7;
            h7 = cVar.h();
        } while (h7 == 0);
        return h7;
    }

    public final c m() {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f20449w;
        while (true) {
            long j7 = atomicLongFieldUpdater.get(this);
            c cVar = (c) this.f20459u.b((int) (2097151 & j7));
            if (cVar == null) {
                return null;
            }
            long j8 = (2097152 + j7) & (-2097152);
            int l7 = l(cVar);
            if (l7 >= 0 && f20449w.compareAndSet(this, j7, l7 | j8)) {
                cVar.r(f20452z);
                return cVar;
            }
        }
    }

    public final boolean n(c cVar) {
        long j7;
        int h7;
        if (cVar.i() != f20452z) {
            return false;
        }
        AtomicLongFieldUpdater atomicLongFieldUpdater = f20449w;
        do {
            j7 = atomicLongFieldUpdater.get(this);
            h7 = cVar.h();
            cVar.r(this.f20459u.b((int) (2097151 & j7)));
        } while (!f20449w.compareAndSet(this, j7, ((2097152 + j7) & (-2097152)) | h7));
        return true;
    }

    public final void q(c cVar, int i7, int i8) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f20449w;
        while (true) {
            long j7 = atomicLongFieldUpdater.get(this);
            int i9 = (int) (2097151 & j7);
            long j8 = (2097152 + j7) & (-2097152);
            if (i9 == i7) {
                i9 = i8 == 0 ? l(cVar) : i8;
            }
            if (i9 >= 0 && f20449w.compareAndSet(this, j7, j8 | i9)) {
                return;
            }
        }
    }

    public final void r(h hVar) {
        try {
            hVar.run();
        } finally {
            try {
            } finally {
            }
        }
    }

    public final void s(long j7) {
        int i7;
        h hVar;
        if (f20451y.compareAndSet(this, 0, 1)) {
            c h7 = h();
            synchronized (this.f20459u) {
                i7 = (int) (f20450x.get(this) & 2097151);
            }
            if (1 <= i7) {
                int i8 = 1;
                while (true) {
                    Object b7 = this.f20459u.b(i8);
                    Intrinsics.b(b7);
                    c cVar = (c) b7;
                    if (cVar != h7) {
                        while (cVar.isAlive()) {
                            LockSupport.unpark(cVar);
                            cVar.join(j7);
                        }
                        cVar.f20462o.f(this.f20458t);
                    }
                    if (i8 == i7) {
                        break;
                    } else {
                        i8++;
                    }
                }
            }
            this.f20458t.b();
            this.f20457s.b();
            while (true) {
                if (h7 != null) {
                    hVar = h7.g(true);
                    if (hVar != null) {
                        continue;
                        r(hVar);
                    }
                }
                hVar = (h) this.f20457s.d();
                if (hVar == null && (hVar = (h) this.f20458t.d()) == null) {
                    break;
                }
                r(hVar);
            }
            if (h7 != null) {
                h7.u(d.TERMINATED);
            }
            f20449w.set(this, 0L);
            f20450x.set(this, 0L);
        }
    }

    public final void t(long j7, boolean z7) {
        if (z7 || B() || w(j7)) {
            return;
        }
        B();
    }

    public String toString() {
        StringBuilder sb;
        char c7;
        ArrayList arrayList = new ArrayList();
        int a7 = this.f20459u.a();
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        for (int i12 = 1; i12 < a7; i12++) {
            c cVar = (c) this.f20459u.b(i12);
            if (cVar != null) {
                int e7 = cVar.f20462o.e();
                int i13 = b.f20460a[cVar.f20464q.ordinal()];
                if (i13 != 1) {
                    if (i13 == 2) {
                        i8++;
                        sb = new StringBuilder();
                        sb.append(e7);
                        c7 = 'b';
                    } else if (i13 == 3) {
                        i7++;
                        sb = new StringBuilder();
                        sb.append(e7);
                        c7 = 'c';
                    } else if (i13 == 4) {
                        i10++;
                        if (e7 > 0) {
                            sb = new StringBuilder();
                            sb.append(e7);
                            c7 = 'd';
                        }
                    } else if (i13 == 5) {
                        i11++;
                    }
                    sb.append(c7);
                    arrayList.add(sb.toString());
                } else {
                    i9++;
                }
            }
        }
        long j7 = f20450x.get(this);
        return this.f20456r + '@' + M.b(this) + "[Pool Size {core = " + this.f20453o + ", max = " + this.f20454p + "}, Worker States {CPU = " + i7 + ", blocking = " + i8 + ", parked = " + i9 + ", dormant = " + i10 + ", terminated = " + i11 + "}, running workers queues = " + arrayList + ", global CPU queue size = " + this.f20457s.c() + ", global blocking queue size = " + this.f20458t.c() + ", Control State {created workers= " + ((int) (2097151 & j7)) + ", blocking tasks = " + ((int) ((4398044413952L & j7) >> 21)) + ", CPUs acquired = " + (this.f20453o - ((int) ((9223367638808264704L & j7) >> 42))) + "}]";
    }

    public final void u() {
        if (B() || x(this, 0L, 1, null)) {
            return;
        }
        B();
    }

    public final h v(c cVar, h hVar, boolean z7) {
        if (cVar == null) {
            return hVar;
        }
        if (cVar.f20464q == d.TERMINATED) {
            return hVar;
        }
        if (hVar.f20486p.b() == 0 && cVar.f20464q == d.BLOCKING) {
            return hVar;
        }
        cVar.f20468u = true;
        return cVar.f20462o.a(hVar, z7);
    }

    public final boolean w(long j7) {
        int a7;
        a7 = l6.f.a(((int) (2097151 & j7)) - ((int) ((j7 & 4398044413952L) >> 21)), 0);
        if (a7 < this.f20453o) {
            int c7 = c();
            if (c7 == 1 && this.f20453o > 1) {
                c();
            }
            if (c7 > 0) {
                return true;
            }
        }
        return false;
    }
}
