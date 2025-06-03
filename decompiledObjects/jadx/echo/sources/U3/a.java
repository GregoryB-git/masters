package U3;

import c4.C0851c;
import c4.InterfaceC0852d;
import java.util.Random;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public final ScheduledExecutorService f6344a;

    /* renamed from: b, reason: collision with root package name */
    public final C0851c f6345b;

    /* renamed from: c, reason: collision with root package name */
    public final long f6346c;

    /* renamed from: d, reason: collision with root package name */
    public final long f6347d;

    /* renamed from: e, reason: collision with root package name */
    public final double f6348e;

    /* renamed from: f, reason: collision with root package name */
    public final double f6349f;

    /* renamed from: g, reason: collision with root package name */
    public final Random f6350g;

    /* renamed from: h, reason: collision with root package name */
    public ScheduledFuture f6351h;

    /* renamed from: i, reason: collision with root package name */
    public long f6352i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f6353j;

    /* renamed from: U3.a$a, reason: collision with other inner class name */
    public class RunnableC0107a implements Runnable {

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ Runnable f6354o;

        public RunnableC0107a(Runnable runnable) {
            this.f6354o = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            a.this.f6351h = null;
            this.f6354o.run();
        }
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public final ScheduledExecutorService f6356a;

        /* renamed from: b, reason: collision with root package name */
        public long f6357b = 1000;

        /* renamed from: c, reason: collision with root package name */
        public double f6358c = 0.5d;

        /* renamed from: d, reason: collision with root package name */
        public long f6359d = 30000;

        /* renamed from: e, reason: collision with root package name */
        public double f6360e = 1.3d;

        /* renamed from: f, reason: collision with root package name */
        public final C0851c f6361f;

        public b(ScheduledExecutorService scheduledExecutorService, InterfaceC0852d interfaceC0852d, String str) {
            this.f6356a = scheduledExecutorService;
            this.f6361f = new C0851c(interfaceC0852d, str);
        }

        public a a() {
            return new a(this.f6356a, this.f6361f, this.f6357b, this.f6359d, this.f6360e, this.f6358c, null);
        }

        public b b(double d7) {
            if (d7 >= 0.0d && d7 <= 1.0d) {
                this.f6358c = d7;
                return this;
            }
            throw new IllegalArgumentException("Argument out of range: " + d7);
        }

        public b c(long j7) {
            this.f6359d = j7;
            return this;
        }

        public b d(long j7) {
            this.f6357b = j7;
            return this;
        }

        public b e(double d7) {
            this.f6360e = d7;
            return this;
        }
    }

    public a(ScheduledExecutorService scheduledExecutorService, C0851c c0851c, long j7, long j8, double d7, double d8) {
        this.f6350g = new Random();
        this.f6353j = true;
        this.f6344a = scheduledExecutorService;
        this.f6345b = c0851c;
        this.f6346c = j7;
        this.f6347d = j8;
        this.f6349f = d7;
        this.f6348e = d8;
    }

    public void b() {
        if (this.f6351h != null) {
            this.f6345b.b("Cancelling existing retry attempt", new Object[0]);
            this.f6351h.cancel(false);
            this.f6351h = null;
        } else {
            this.f6345b.b("No existing retry attempt to cancel", new Object[0]);
        }
        this.f6352i = 0L;
    }

    public void c(Runnable runnable) {
        RunnableC0107a runnableC0107a = new RunnableC0107a(runnable);
        if (this.f6351h != null) {
            this.f6345b.b("Cancelling previous scheduled retry", new Object[0]);
            this.f6351h.cancel(false);
            this.f6351h = null;
        }
        long j7 = 0;
        if (!this.f6353j) {
            long j8 = this.f6352i;
            this.f6352i = j8 == 0 ? this.f6346c : Math.min((long) (j8 * this.f6349f), this.f6347d);
            double d7 = this.f6348e;
            long j9 = this.f6352i;
            j7 = (long) (((1.0d - d7) * j9) + (d7 * j9 * this.f6350g.nextDouble()));
        }
        this.f6353j = false;
        this.f6345b.b("Scheduling retry in %dms", Long.valueOf(j7));
        this.f6351h = this.f6344a.schedule(runnableC0107a, j7, TimeUnit.MILLISECONDS);
    }

    public void d() {
        this.f6352i = this.f6347d;
    }

    public void e() {
        this.f6353j = true;
        this.f6352i = 0L;
    }

    public /* synthetic */ a(ScheduledExecutorService scheduledExecutorService, C0851c c0851c, long j7, long j8, double d7, double d8, RunnableC0107a runnableC0107a) {
        this(scheduledExecutorService, c0851c, j7, j8, d7, d8);
    }
}
