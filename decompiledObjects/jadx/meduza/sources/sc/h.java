package sc;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import nc.a0;
import nc.c0;
import nc.e2;
import nc.i0;
import nc.l0;
import nc.t0;

/* loaded from: classes.dex */
public final class h extends a0 implements l0 {

    /* renamed from: p, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f14340p = AtomicIntegerFieldUpdater.newUpdater(h.class, "runningWorkers");

    /* renamed from: c, reason: collision with root package name */
    public final a0 f14341c;

    /* renamed from: d, reason: collision with root package name */
    public final int f14342d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l0 f14343e;
    public final k<Runnable> f;

    /* renamed from: o, reason: collision with root package name */
    public final Object f14344o;
    private volatile int runningWorkers;

    public final class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public Runnable f14345a;

        public a(Runnable runnable) {
            this.f14345a = runnable;
        }

        @Override // java.lang.Runnable
        public final void run() {
            int i10 = 0;
            while (true) {
                try {
                    this.f14345a.run();
                } catch (Throwable th) {
                    c0.a(ub.i.f15164a, th);
                }
                Runnable C0 = h.this.C0();
                if (C0 == null) {
                    return;
                }
                this.f14345a = C0;
                i10++;
                if (i10 >= 16 && h.this.f14341c.B0()) {
                    h hVar = h.this;
                    hVar.f14341c.z0(hVar, this);
                    return;
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public h(tc.k kVar, int i10) {
        this.f14341c = kVar;
        this.f14342d = i10;
        l0 l0Var = kVar instanceof l0 ? (l0) kVar : null;
        this.f14343e = l0Var == null ? i0.f11506a : l0Var;
        this.f = new k<>();
        this.f14344o = new Object();
    }

    @Override // nc.a0
    public final void A0(ub.h hVar, Runnable runnable) {
        boolean z10;
        Runnable C0;
        this.f.a(runnable);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f14340p;
        if (atomicIntegerFieldUpdater.get(this) < this.f14342d) {
            synchronized (this.f14344o) {
                if (atomicIntegerFieldUpdater.get(this) >= this.f14342d) {
                    z10 = false;
                } else {
                    atomicIntegerFieldUpdater.incrementAndGet(this);
                    z10 = true;
                }
            }
            if (!z10 || (C0 = C0()) == null) {
                return;
            }
            this.f14341c.A0(this, new a(C0));
        }
    }

    public final Runnable C0() {
        while (true) {
            Runnable d10 = this.f.d();
            if (d10 != null) {
                return d10;
            }
            synchronized (this.f14344o) {
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f14340p;
                atomicIntegerFieldUpdater.decrementAndGet(this);
                if (this.f.c() == 0) {
                    return null;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
            }
        }
    }

    @Override // nc.l0
    public final void f(long j10, nc.l lVar) {
        this.f14343e.f(j10, lVar);
    }

    @Override // nc.l0
    public final t0 q0(long j10, e2 e2Var, ub.h hVar) {
        return this.f14343e.q0(j10, e2Var, hVar);
    }

    @Override // nc.a0
    public final void z0(ub.h hVar, Runnable runnable) {
        boolean z10;
        Runnable C0;
        this.f.a(runnable);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f14340p;
        if (atomicIntegerFieldUpdater.get(this) < this.f14342d) {
            synchronized (this.f14344o) {
                if (atomicIntegerFieldUpdater.get(this) >= this.f14342d) {
                    z10 = false;
                } else {
                    atomicIntegerFieldUpdater.incrementAndGet(this);
                    z10 = true;
                }
            }
            if (!z10 || (C0 = C0()) == null) {
                return;
            }
            this.f14341c.z0(this, new a(C0));
        }
    }
}
