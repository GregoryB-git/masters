package e7;

import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class e2 extends d3 {
    public static final AtomicLong t = new AtomicLong(Long.MIN_VALUE);

    /* renamed from: d, reason: collision with root package name */
    public h2 f4158d;

    /* renamed from: e, reason: collision with root package name */
    public h2 f4159e;
    public final PriorityBlockingQueue<i2<?>> f;

    /* renamed from: o, reason: collision with root package name */
    public final LinkedBlockingQueue f4160o;

    /* renamed from: p, reason: collision with root package name */
    public final g2 f4161p;

    /* renamed from: q, reason: collision with root package name */
    public final g2 f4162q;

    /* renamed from: r, reason: collision with root package name */
    public final Object f4163r;

    /* renamed from: s, reason: collision with root package name */
    public final Semaphore f4164s;

    public e2(j2 j2Var) {
        super(j2Var);
        this.f4163r = new Object();
        this.f4164s = new Semaphore(2);
        this.f = new PriorityBlockingQueue<>();
        this.f4160o = new LinkedBlockingQueue();
        this.f4161p = new g2(this, "Thread death: Uncaught exception on worker thread");
        this.f4162q = new g2(this, "Thread death: Uncaught exception on network thread");
    }

    @Override // d2.q
    public final void l() {
        if (Thread.currentThread() != this.f4158d) {
            throw new IllegalStateException("Call expected from worker thread");
        }
    }

    @Override // e7.d3
    public final boolean o() {
        return false;
    }

    public final i2 p(Callable callable) {
        m();
        i2<?> i2Var = new i2<>(this, callable, false);
        if (Thread.currentThread() == this.f4158d) {
            if (!this.f.isEmpty()) {
                zzj().f4063r.b("Callable skipped the worker queue.");
            }
            i2Var.run();
        } else {
            r(i2Var);
        }
        return i2Var;
    }

    public final <T> T q(AtomicReference<T> atomicReference, long j10, String str, Runnable runnable) {
        synchronized (atomicReference) {
            zzl().u(runnable);
            try {
                atomicReference.wait(j10);
            } catch (InterruptedException unused) {
                zzj().f4063r.b("Interrupted waiting for " + str);
                return null;
            }
        }
        T t10 = atomicReference.get();
        if (t10 == null) {
            zzj().f4063r.b("Timed out waiting for " + str);
        }
        return t10;
    }

    public final void r(i2<?> i2Var) {
        synchronized (this.f4163r) {
            this.f.add(i2Var);
            h2 h2Var = this.f4158d;
            if (h2Var == null) {
                h2 h2Var2 = new h2(this, "Measurement Worker", this.f);
                this.f4158d = h2Var2;
                h2Var2.setUncaughtExceptionHandler(this.f4161p);
                this.f4158d.start();
            } else {
                synchronized (h2Var.f4290a) {
                    h2Var.f4290a.notifyAll();
                }
            }
        }
    }

    public final void s(Runnable runnable) {
        m();
        i2 i2Var = new i2(this, runnable, false, "Task exception on network thread");
        synchronized (this.f4163r) {
            this.f4160o.add(i2Var);
            h2 h2Var = this.f4159e;
            if (h2Var == null) {
                h2 h2Var2 = new h2(this, "Measurement Network", this.f4160o);
                this.f4159e = h2Var2;
                h2Var2.setUncaughtExceptionHandler(this.f4162q);
                this.f4159e.start();
            } else {
                synchronized (h2Var.f4290a) {
                    h2Var.f4290a.notifyAll();
                }
            }
        }
    }

    public final i2 t(Callable callable) {
        m();
        i2<?> i2Var = new i2<>(this, callable, true);
        if (Thread.currentThread() == this.f4158d) {
            i2Var.run();
        } else {
            r(i2Var);
        }
        return i2Var;
    }

    public final void u(Runnable runnable) {
        m();
        m6.j.i(runnable);
        r(new i2<>(this, runnable, false, "Task exception on worker thread"));
    }

    public final void v(Runnable runnable) {
        m();
        r(new i2<>(this, runnable, true, "Task exception on worker thread"));
    }

    public final boolean w() {
        return Thread.currentThread() == this.f4158d;
    }

    public final void x() {
        if (Thread.currentThread() != this.f4159e) {
            throw new IllegalStateException("Call expected from network thread");
        }
    }
}
