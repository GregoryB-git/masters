package R2;

import A2.AbstractC0328n;
import android.content.Context;
import java.lang.Thread;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class G2 extends AbstractC0550l3 {

    /* renamed from: l, reason: collision with root package name */
    public static final AtomicLong f4678l = new AtomicLong(Long.MIN_VALUE);

    /* renamed from: c, reason: collision with root package name */
    public K2 f4679c;

    /* renamed from: d, reason: collision with root package name */
    public K2 f4680d;

    /* renamed from: e, reason: collision with root package name */
    public final PriorityBlockingQueue f4681e;

    /* renamed from: f, reason: collision with root package name */
    public final BlockingQueue f4682f;

    /* renamed from: g, reason: collision with root package name */
    public final Thread.UncaughtExceptionHandler f4683g;

    /* renamed from: h, reason: collision with root package name */
    public final Thread.UncaughtExceptionHandler f4684h;

    /* renamed from: i, reason: collision with root package name */
    public final Object f4685i;

    /* renamed from: j, reason: collision with root package name */
    public final Semaphore f4686j;

    /* renamed from: k, reason: collision with root package name */
    public volatile boolean f4687k;

    public G2(N2 n22) {
        super(n22);
        this.f4685i = new Object();
        this.f4686j = new Semaphore(2);
        this.f4681e = new PriorityBlockingQueue();
        this.f4682f = new LinkedBlockingQueue();
        this.f4683g = new J2(this, "Thread death: Uncaught exception on worker thread");
        this.f4684h = new J2(this, "Thread death: Uncaught exception on network thread");
    }

    public final Future B(Callable callable) {
        o();
        AbstractC0328n.i(callable);
        L2 l22 = new L2(this, callable, true, "Task exception on worker thread");
        if (Thread.currentThread() == this.f4679c) {
            l22.run();
        } else {
            y(l22);
        }
        return l22;
    }

    public final void D(Runnable runnable) {
        o();
        AbstractC0328n.i(runnable);
        y(new L2(this, runnable, false, "Task exception on worker thread"));
    }

    public final void G(Runnable runnable) {
        o();
        AbstractC0328n.i(runnable);
        y(new L2(this, runnable, true, "Task exception on worker thread"));
    }

    public final boolean J() {
        return Thread.currentThread() == this.f4679c;
    }

    @Override // R2.AbstractC0557m3, R2.InterfaceC0571o3
    public final /* bridge */ /* synthetic */ Context a() {
        return super.a();
    }

    @Override // R2.AbstractC0557m3, R2.InterfaceC0571o3
    public final /* bridge */ /* synthetic */ E2.e b() {
        return super.b();
    }

    @Override // R2.AbstractC0557m3, R2.InterfaceC0571o3
    public final /* bridge */ /* synthetic */ C0504f d() {
        return super.d();
    }

    @Override // R2.AbstractC0557m3, R2.InterfaceC0571o3
    public final /* bridge */ /* synthetic */ G2 e() {
        return super.e();
    }

    @Override // R2.AbstractC0557m3
    public final /* bridge */ /* synthetic */ C0511g f() {
        return super.f();
    }

    @Override // R2.AbstractC0557m3
    public final /* bridge */ /* synthetic */ C g() {
        return super.g();
    }

    @Override // R2.AbstractC0557m3
    public final /* bridge */ /* synthetic */ X1 h() {
        return super.h();
    }

    @Override // R2.AbstractC0557m3
    public final /* bridge */ /* synthetic */ C0549l2 i() {
        return super.i();
    }

    @Override // R2.AbstractC0557m3, R2.InterfaceC0571o3
    public final /* bridge */ /* synthetic */ Y1 j() {
        return super.j();
    }

    @Override // R2.AbstractC0557m3
    public final /* bridge */ /* synthetic */ S5 k() {
        return super.k();
    }

    @Override // R2.AbstractC0557m3
    public final void l() {
        if (Thread.currentThread() != this.f4680d) {
            throw new IllegalStateException("Call expected from network thread");
        }
    }

    @Override // R2.AbstractC0557m3
    public final /* bridge */ /* synthetic */ void m() {
        super.m();
    }

    @Override // R2.AbstractC0557m3
    public final void n() {
        if (Thread.currentThread() != this.f4679c) {
            throw new IllegalStateException("Call expected from worker thread");
        }
    }

    @Override // R2.AbstractC0550l3
    public final boolean s() {
        return false;
    }

    public final Object v(AtomicReference atomicReference, long j7, String str, Runnable runnable) {
        synchronized (atomicReference) {
            e().D(runnable);
            try {
                atomicReference.wait(j7);
            } catch (InterruptedException unused) {
                j().L().a("Interrupted waiting for " + str);
                return null;
            }
        }
        Object obj = atomicReference.get();
        if (obj == null) {
            j().L().a("Timed out waiting for " + str);
        }
        return obj;
    }

    public final Future w(Callable callable) {
        o();
        AbstractC0328n.i(callable);
        L2 l22 = new L2(this, callable, false, "Task exception on worker thread");
        if (Thread.currentThread() == this.f4679c) {
            if (!this.f4681e.isEmpty()) {
                j().L().a("Callable skipped the worker queue.");
            }
            l22.run();
        } else {
            y(l22);
        }
        return l22;
    }

    public final void y(L2 l22) {
        synchronized (this.f4685i) {
            try {
                this.f4681e.add(l22);
                K2 k22 = this.f4679c;
                if (k22 == null) {
                    K2 k23 = new K2(this, "Measurement Worker", this.f4681e);
                    this.f4679c = k23;
                    k23.setUncaughtExceptionHandler(this.f4683g);
                    this.f4679c.start();
                } else {
                    k22.a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void z(Runnable runnable) {
        o();
        AbstractC0328n.i(runnable);
        L2 l22 = new L2(this, runnable, false, "Task exception on network thread");
        synchronized (this.f4685i) {
            try {
                this.f4682f.add(l22);
                K2 k22 = this.f4680d;
                if (k22 == null) {
                    K2 k23 = new K2(this, "Measurement Network", this.f4682f);
                    this.f4680d = k23;
                    k23.setUncaughtExceptionHandler(this.f4684h);
                    this.f4680d.start();
                } else {
                    k22.a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
