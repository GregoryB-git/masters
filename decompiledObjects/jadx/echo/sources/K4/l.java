package K4;

import M4.o;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class l {

    /* renamed from: f, reason: collision with root package name */
    public static final F4.a f3217f = F4.a.e();

    /* renamed from: a, reason: collision with root package name */
    public final ScheduledExecutorService f3218a;

    /* renamed from: b, reason: collision with root package name */
    public final ConcurrentLinkedQueue f3219b;

    /* renamed from: c, reason: collision with root package name */
    public final Runtime f3220c;

    /* renamed from: d, reason: collision with root package name */
    public ScheduledFuture f3221d;

    /* renamed from: e, reason: collision with root package name */
    public long f3222e;

    public l() {
        this(Executors.newSingleThreadScheduledExecutor(), Runtime.getRuntime());
    }

    public static boolean e(long j7) {
        return j7 <= 0;
    }

    public void c(M4.l lVar) {
        h(lVar);
    }

    public final int d() {
        return o.c(M4.k.f3557t.c(this.f3220c.totalMemory() - this.f3220c.freeMemory()));
    }

    public final /* synthetic */ void f(M4.l lVar) {
        N4.b l7 = l(lVar);
        if (l7 != null) {
            this.f3219b.add(l7);
        }
    }

    public final /* synthetic */ void g(M4.l lVar) {
        N4.b l7 = l(lVar);
        if (l7 != null) {
            this.f3219b.add(l7);
        }
    }

    public final synchronized void h(final M4.l lVar) {
        try {
            this.f3218a.schedule(new Runnable() { // from class: K4.k
                @Override // java.lang.Runnable
                public final void run() {
                    l.this.f(lVar);
                }
            }, 0L, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e7) {
            f3217f.j("Unable to collect Memory Metric: " + e7.getMessage());
        }
    }

    public final synchronized void i(long j7, final M4.l lVar) {
        this.f3222e = j7;
        try {
            this.f3221d = this.f3218a.scheduleAtFixedRate(new Runnable() { // from class: K4.j
                @Override // java.lang.Runnable
                public final void run() {
                    l.this.g(lVar);
                }
            }, 0L, j7, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e7) {
            f3217f.j("Unable to start collecting Memory Metrics: " + e7.getMessage());
        }
    }

    public void j(long j7, M4.l lVar) {
        if (e(j7)) {
            return;
        }
        if (this.f3221d == null) {
            i(j7, lVar);
        } else if (this.f3222e != j7) {
            k();
            i(j7, lVar);
        }
    }

    public void k() {
        ScheduledFuture scheduledFuture = this.f3221d;
        if (scheduledFuture == null) {
            return;
        }
        scheduledFuture.cancel(false);
        this.f3221d = null;
        this.f3222e = -1L;
    }

    public final N4.b l(M4.l lVar) {
        if (lVar == null) {
            return null;
        }
        return (N4.b) N4.b.W().D(lVar.b()).E(d()).v();
    }

    public l(ScheduledExecutorService scheduledExecutorService, Runtime runtime) {
        this.f3221d = null;
        this.f3222e = -1L;
        this.f3218a = scheduledExecutorService;
        this.f3219b = new ConcurrentLinkedQueue();
        this.f3220c = runtime;
    }
}
