package N3;

import H3.AbstractC0399v;
import H3.H;
import H3.c0;
import V2.C0660k;
import android.database.SQLException;
import android.os.SystemClock;
import c2.AbstractC0820c;
import c2.EnumC0821d;
import c2.f;
import c2.h;
import f2.l;
import java.util.Locale;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final double f3625a;

    /* renamed from: b, reason: collision with root package name */
    public final double f3626b;

    /* renamed from: c, reason: collision with root package name */
    public final long f3627c;

    /* renamed from: d, reason: collision with root package name */
    public final long f3628d;

    /* renamed from: e, reason: collision with root package name */
    public final int f3629e;

    /* renamed from: f, reason: collision with root package name */
    public final BlockingQueue f3630f;

    /* renamed from: g, reason: collision with root package name */
    public final ThreadPoolExecutor f3631g;

    /* renamed from: h, reason: collision with root package name */
    public final f f3632h;

    /* renamed from: i, reason: collision with root package name */
    public final H f3633i;

    /* renamed from: j, reason: collision with root package name */
    public int f3634j;

    /* renamed from: k, reason: collision with root package name */
    public long f3635k;

    public final class b implements Runnable {

        /* renamed from: o, reason: collision with root package name */
        public final AbstractC0399v f3636o;

        /* renamed from: p, reason: collision with root package name */
        public final C0660k f3637p;

        public b(AbstractC0399v abstractC0399v, C0660k c0660k) {
            this.f3636o = abstractC0399v;
            this.f3637p = c0660k;
        }

        @Override // java.lang.Runnable
        public void run() {
            e.this.p(this.f3636o, this.f3637p);
            e.this.f3633i.e();
            double g7 = e.this.g();
            E3.f.f().b("Delay for: " + String.format(Locale.US, "%.2f", Double.valueOf(g7 / 1000.0d)) + " s for report: " + this.f3636o.d());
            e.q(g7);
        }
    }

    public e(double d7, double d8, long j7, f fVar, H h7) {
        this.f3625a = d7;
        this.f3626b = d8;
        this.f3627c = j7;
        this.f3632h = fVar;
        this.f3633i = h7;
        this.f3628d = SystemClock.elapsedRealtime();
        int i7 = (int) d7;
        this.f3629e = i7;
        ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue(i7);
        this.f3630f = arrayBlockingQueue;
        this.f3631g = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, arrayBlockingQueue);
        this.f3634j = 0;
        this.f3635k = 0L;
    }

    public static void q(double d7) {
        try {
            Thread.sleep((long) d7);
        } catch (InterruptedException unused) {
        }
    }

    public final double g() {
        return Math.min(3600000.0d, (60000.0d / this.f3625a) * Math.pow(this.f3626b, h()));
    }

    public final int h() {
        if (this.f3635k == 0) {
            this.f3635k = o();
        }
        int o7 = (int) ((o() - this.f3635k) / this.f3627c);
        int min = l() ? Math.min(100, this.f3634j + o7) : Math.max(0, this.f3634j - o7);
        if (this.f3634j != min) {
            this.f3634j = min;
            this.f3635k = o();
        }
        return min;
    }

    public C0660k i(AbstractC0399v abstractC0399v, boolean z7) {
        synchronized (this.f3630f) {
            try {
                C0660k c0660k = new C0660k();
                if (!z7) {
                    p(abstractC0399v, c0660k);
                    return c0660k;
                }
                this.f3633i.d();
                if (!k()) {
                    h();
                    E3.f.f().b("Dropping report due to queue being full: " + abstractC0399v.d());
                    this.f3633i.c();
                    c0660k.e(abstractC0399v);
                    return c0660k;
                }
                E3.f.f().b("Enqueueing report: " + abstractC0399v.d());
                E3.f.f().b("Queue size: " + this.f3630f.size());
                this.f3631g.execute(new b(abstractC0399v, c0660k));
                E3.f.f().b("Closing task for report: " + abstractC0399v.d());
                c0660k.e(abstractC0399v);
                return c0660k;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void j() {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        new Thread(new Runnable() { // from class: N3.d
            @Override // java.lang.Runnable
            public final void run() {
                e.this.m(countDownLatch);
            }
        }).start();
        c0.g(countDownLatch, 2L, TimeUnit.SECONDS);
    }

    public final boolean k() {
        return this.f3630f.size() < this.f3629e;
    }

    public final boolean l() {
        return this.f3630f.size() == this.f3629e;
    }

    public final /* synthetic */ void m(CountDownLatch countDownLatch) {
        try {
            l.a(this.f3632h, EnumC0821d.HIGHEST);
        } catch (SQLException unused) {
        }
        countDownLatch.countDown();
    }

    public final /* synthetic */ void n(C0660k c0660k, boolean z7, AbstractC0399v abstractC0399v, Exception exc) {
        if (exc != null) {
            c0660k.d(exc);
            return;
        }
        if (z7) {
            j();
        }
        c0660k.e(abstractC0399v);
    }

    public final long o() {
        return System.currentTimeMillis();
    }

    public final void p(final AbstractC0399v abstractC0399v, final C0660k c0660k) {
        E3.f.f().b("Sending report through Google DataTransport: " + abstractC0399v.d());
        final boolean z7 = SystemClock.elapsedRealtime() - this.f3628d < 2000;
        this.f3632h.a(AbstractC0820c.e(abstractC0399v.b()), new h() { // from class: N3.c
            @Override // c2.h
            public final void a(Exception exc) {
                e.this.n(c0660k, z7, abstractC0399v, exc);
            }
        });
    }

    public e(f fVar, O3.d dVar, H h7) {
        this(dVar.f3981f, dVar.f3982g, dVar.f3983h * 1000, fVar, h7);
    }
}
