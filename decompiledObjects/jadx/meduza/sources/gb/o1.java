package gb;

import gb.u;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class o1 {

    /* renamed from: l, reason: collision with root package name */
    public static final long f6605l = TimeUnit.SECONDS.toNanos(10);

    /* renamed from: a, reason: collision with root package name */
    public final ScheduledExecutorService f6606a;

    /* renamed from: b, reason: collision with root package name */
    public final n7.p f6607b;

    /* renamed from: c, reason: collision with root package name */
    public final d f6608c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f6609d;

    /* renamed from: e, reason: collision with root package name */
    public int f6610e;
    public ScheduledFuture<?> f;

    /* renamed from: g, reason: collision with root package name */
    public ScheduledFuture<?> f6611g;

    /* renamed from: h, reason: collision with root package name */
    public final p1 f6612h;

    /* renamed from: i, reason: collision with root package name */
    public final p1 f6613i;

    /* renamed from: j, reason: collision with root package name */
    public final long f6614j;

    /* renamed from: k, reason: collision with root package name */
    public final long f6615k;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            o1 o1Var;
            boolean z10;
            synchronized (o1.this) {
                o1Var = o1.this;
                if (o1Var.f6610e != 6) {
                    o1Var.f6610e = 6;
                    z10 = true;
                } else {
                    z10 = false;
                }
            }
            if (z10) {
                o1Var.f6608c.a();
            }
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            boolean z10;
            synchronized (o1.this) {
                o1 o1Var = o1.this;
                o1Var.f6611g = null;
                int i10 = o1Var.f6610e;
                if (i10 == 2) {
                    z10 = true;
                    o1Var.f6610e = 4;
                    o1Var.f = o1Var.f6606a.schedule(o1Var.f6612h, o1Var.f6615k, TimeUnit.NANOSECONDS);
                } else {
                    if (i10 == 3) {
                        ScheduledExecutorService scheduledExecutorService = o1Var.f6606a;
                        p1 p1Var = o1Var.f6613i;
                        long j10 = o1Var.f6614j;
                        n7.p pVar = o1Var.f6607b;
                        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                        o1Var.f6611g = scheduledExecutorService.schedule(p1Var, j10 - pVar.a(timeUnit), timeUnit);
                        o1.this.f6610e = 2;
                    }
                    z10 = false;
                }
            }
            if (z10) {
                o1.this.f6608c.b();
            }
        }
    }

    public static final class c implements d {

        /* renamed from: a, reason: collision with root package name */
        public final x f6618a;

        public class a implements u.a {
            public a() {
            }

            @Override // gb.u.a
            public final void i() {
                c.this.f6618a.h(eb.e1.f5078n.g("Keepalive failed. The connection is likely gone"));
            }

            @Override // gb.u.a
            public final void k() {
            }
        }

        public c(x xVar) {
            this.f6618a = xVar;
        }

        @Override // gb.o1.d
        public final void a() {
            this.f6618a.h(eb.e1.f5078n.g("Keepalive failed. The connection is likely gone"));
        }

        @Override // gb.o1.d
        public final void b() {
            this.f6618a.e(new a());
        }
    }

    public interface d {
        void a();

        void b();
    }

    static {
        TimeUnit.MILLISECONDS.toNanos(10L);
    }

    public o1(c cVar, ScheduledExecutorService scheduledExecutorService, long j10, long j11, boolean z10) {
        n7.p pVar = new n7.p();
        this.f6610e = 1;
        this.f6612h = new p1(new a());
        this.f6613i = new p1(new b());
        this.f6608c = cVar;
        x6.b.y(scheduledExecutorService, "scheduler");
        this.f6606a = scheduledExecutorService;
        this.f6607b = pVar;
        this.f6614j = j10;
        this.f6615k = j11;
        this.f6609d = z10;
        pVar.f11309b = false;
        pVar.b();
    }

    public final synchronized void a() {
        n7.p pVar = this.f6607b;
        pVar.f11309b = false;
        pVar.b();
        int i10 = this.f6610e;
        if (i10 == 2) {
            this.f6610e = 3;
        } else if (i10 == 4 || i10 == 5) {
            ScheduledFuture<?> scheduledFuture = this.f;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
            }
            if (this.f6610e == 5) {
                this.f6610e = 1;
            } else {
                this.f6610e = 2;
                x6.b.I(this.f6611g == null, "There should be no outstanding pingFuture");
                this.f6611g = this.f6606a.schedule(this.f6613i, this.f6614j, TimeUnit.NANOSECONDS);
            }
        }
    }

    public final synchronized void b() {
        int i10 = this.f6610e;
        if (i10 == 1) {
            this.f6610e = 2;
            if (this.f6611g == null) {
                ScheduledExecutorService scheduledExecutorService = this.f6606a;
                p1 p1Var = this.f6613i;
                long j10 = this.f6614j;
                n7.p pVar = this.f6607b;
                TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                this.f6611g = scheduledExecutorService.schedule(p1Var, j10 - pVar.a(timeUnit), timeUnit);
            }
        } else if (i10 == 5) {
            this.f6610e = 4;
        }
    }
}
