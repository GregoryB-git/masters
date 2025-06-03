package gb;

import gb.r1;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class x2 {

    /* renamed from: a, reason: collision with root package name */
    public final ScheduledExecutorService f6891a;

    /* renamed from: b, reason: collision with root package name */
    public final Executor f6892b;

    /* renamed from: c, reason: collision with root package name */
    public final Runnable f6893c;

    /* renamed from: d, reason: collision with root package name */
    public final n7.p f6894d;

    /* renamed from: e, reason: collision with root package name */
    public long f6895e;
    public boolean f;

    /* renamed from: g, reason: collision with root package name */
    public ScheduledFuture<?> f6896g;

    public final class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            x2 x2Var = x2.this;
            if (!x2Var.f) {
                x2Var.f6896g = null;
                return;
            }
            n7.p pVar = x2Var.f6894d;
            TimeUnit timeUnit = TimeUnit.NANOSECONDS;
            long a10 = pVar.a(timeUnit);
            x2 x2Var2 = x2.this;
            long j10 = x2Var2.f6895e - a10;
            if (j10 > 0) {
                x2Var2.f6896g = x2Var2.f6891a.schedule(x2Var2.new b(), j10, timeUnit);
                return;
            }
            x2Var2.f = false;
            x2Var2.f6896g = null;
            x2Var2.f6893c.run();
        }
    }

    public final class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            x2 x2Var = x2.this;
            x2Var.f6892b.execute(x2Var.new a());
        }
    }

    public x2(r1.j jVar, eb.h1 h1Var, ScheduledExecutorService scheduledExecutorService, n7.p pVar) {
        this.f6893c = jVar;
        this.f6892b = h1Var;
        this.f6891a = scheduledExecutorService;
        this.f6894d = pVar;
        pVar.b();
    }
}
