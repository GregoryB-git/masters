package u6;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import p6.S;

/* renamed from: u6.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2043m extends p6.F implements S {

    /* renamed from: v, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f19988v = AtomicIntegerFieldUpdater.newUpdater(C2043m.class, "runningWorkers");

    /* renamed from: q, reason: collision with root package name */
    public final p6.F f19989q;

    /* renamed from: r, reason: collision with root package name */
    public final int f19990r;
    private volatile int runningWorkers;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ S f19991s;

    /* renamed from: t, reason: collision with root package name */
    public final r f19992t;

    /* renamed from: u, reason: collision with root package name */
    public final Object f19993u;

    /* renamed from: u6.m$a */
    public final class a implements Runnable {

        /* renamed from: o, reason: collision with root package name */
        public Runnable f19994o;

        public a(Runnable runnable) {
            this.f19994o = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            int i7 = 0;
            while (true) {
                try {
                    this.f19994o.run();
                } catch (Throwable th) {
                    p6.H.a(X5.h.f7293o, th);
                }
                Runnable J6 = C2043m.this.J();
                if (J6 == null) {
                    return;
                }
                this.f19994o = J6;
                i7++;
                if (i7 >= 16 && C2043m.this.f19989q.F(C2043m.this)) {
                    C2043m.this.f19989q.E(C2043m.this, this);
                    return;
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C2043m(p6.F f7, int i7) {
        this.f19989q = f7;
        this.f19990r = i7;
        S s7 = f7 instanceof S ? (S) f7 : null;
        this.f19991s = s7 == null ? p6.O.a() : s7;
        this.f19992t = new r(false);
        this.f19993u = new Object();
    }

    @Override // p6.F
    public void E(X5.g gVar, Runnable runnable) {
        Runnable J6;
        this.f19992t.a(runnable);
        if (f19988v.get(this) >= this.f19990r || !K() || (J6 = J()) == null) {
            return;
        }
        this.f19989q.E(this, new a(J6));
    }

    public final Runnable J() {
        while (true) {
            Runnable runnable = (Runnable) this.f19992t.d();
            if (runnable != null) {
                return runnable;
            }
            synchronized (this.f19993u) {
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f19988v;
                atomicIntegerFieldUpdater.decrementAndGet(this);
                if (this.f19992t.c() == 0) {
                    return null;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
            }
        }
    }

    public final boolean K() {
        synchronized (this.f19993u) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f19988v;
            if (atomicIntegerFieldUpdater.get(this) >= this.f19990r) {
                return false;
            }
            atomicIntegerFieldUpdater.incrementAndGet(this);
            return true;
        }
    }
}
