/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.database.SQLException
 *  android.os.SystemClock
 *  java.lang.Exception
 *  java.lang.InterruptedException
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 *  java.lang.Thread
 *  java.lang.Throwable
 *  java.util.Locale
 *  java.util.concurrent.ArrayBlockingQueue
 *  java.util.concurrent.BlockingQueue
 *  java.util.concurrent.CountDownLatch
 *  java.util.concurrent.ThreadPoolExecutor
 *  java.util.concurrent.TimeUnit
 */
package N3;

import E3.f;
import H3.H;
import H3.c0;
import H3.v;
import J3.B;
import N3.c;
import N3.d;
import V2.k;
import android.database.SQLException;
import android.os.SystemClock;
import c2.h;
import f2.l;
import java.util.Locale;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public final class e {
    public final double a;
    public final double b;
    public final long c;
    public final long d;
    public final int e;
    public final BlockingQueue f;
    public final ThreadPoolExecutor g;
    public final c2.f h;
    public final H i;
    public int j;
    public long k;

    public e(double d8, double d9, long l8, c2.f f8, H h8) {
        int n8;
        this.a = d8;
        this.b = d9;
        this.c = l8;
        this.h = f8;
        this.i = h8;
        this.d = SystemClock.elapsedRealtime();
        this.e = n8 = (int)d8;
        f8 = new ArrayBlockingQueue(n8);
        this.f = f8;
        this.g = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, (BlockingQueue)f8);
        this.j = 0;
        this.k = 0L;
    }

    public e(c2.f f8, O3.d d8, H h8) {
        this(d8.f, d8.g, (long)d8.h * 1000L, f8, h8);
    }

    public static /* synthetic */ void a(e e8, k k8, boolean bl, v v8, Exception exception) {
        e8.n(k8, bl, v8, exception);
    }

    public static /* synthetic */ void b(e e8, CountDownLatch countDownLatch) {
        e8.m(countDownLatch);
    }

    public static void q(double d8) {
        long l8 = (long)d8;
        try {
            Thread.sleep((long)l8);
            return;
        }
        catch (InterruptedException interruptedException) {
            return;
        }
    }

    public final double g() {
        return Math.min((double)3600000.0, (double)(60000.0 / this.a * Math.pow((double)this.b, (double)this.h())));
    }

    public final int h() {
        if (this.k == 0L) {
            this.k = this.o();
        }
        int n8 = (int)((this.o() - this.k) / this.c);
        n8 = this.l() ? Math.min((int)100, (int)(this.j + n8)) : Math.max((int)0, (int)(this.j - n8));
        if (this.j != n8) {
            this.j = n8;
            this.k = this.o();
        }
        return n8;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public k i(v v8, boolean bl) {
        BlockingQueue blockingQueue = this.f;
        synchronized (blockingQueue) {
            try {
                k k8 = new k();
                if (!bl) {
                    this.p(v8, k8);
                    return k8;
                }
                this.i.d();
                if (this.k()) {
                    f f8 = f.f();
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Enqueueing report: ");
                    stringBuilder.append(v8.d());
                    f8.b(stringBuilder.toString());
                    f8 = f.f();
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("Queue size: ");
                    stringBuilder.append(this.f.size());
                    f8.b(stringBuilder.toString());
                    this.g.execute((Runnable)new b(v8, k8, null));
                    f8 = f.f();
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("Closing task for report: ");
                    stringBuilder.append(v8.d());
                    f8.b(stringBuilder.toString());
                    k8.e(v8);
                    return k8;
                }
                this.h();
                f f9 = f.f();
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Dropping report due to queue being full: ");
                stringBuilder.append(v8.d());
                f9.b(stringBuilder.toString());
                this.i.c();
                k8.e(v8);
                return k8;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public void j() {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        new Thread((Runnable)new d(this, countDownLatch)).start();
        c0.g(countDownLatch, 2L, TimeUnit.SECONDS);
    }

    public final boolean k() {
        if (this.f.size() < this.e) {
            return true;
        }
        return false;
    }

    public final boolean l() {
        if (this.f.size() == this.e) {
            return true;
        }
        return false;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final /* synthetic */ void m(CountDownLatch countDownLatch) {
        try {
            l.a(this.h, c2.d.q);
        }
        catch (SQLException sQLException) {}
        countDownLatch.countDown();
    }

    public final /* synthetic */ void n(k k8, boolean bl, v v8, Exception exception) {
        if (exception != null) {
            k8.d(exception);
            return;
        }
        if (bl) {
            this.j();
        }
        k8.e(v8);
    }

    public final long o() {
        return System.currentTimeMillis();
    }

    public final void p(v v8, k k8) {
        f f8 = f.f();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Sending report through Google DataTransport: ");
        stringBuilder.append(v8.d());
        f8.b(stringBuilder.toString());
        boolean bl = SystemClock.elapsedRealtime() - this.d < 2000L;
        this.h.a(c2.c.e(v8.b()), new c(this, k8, bl, v8));
    }

    public final class b
    implements Runnable {
        public final v o;
        public final k p;

        public b(v v8, k k8) {
            this.o = v8;
            this.p = k8;
        }

        public /* synthetic */ b(v v8, k k8,  a8) {
            this(v8, k8);
        }

        public void run() {
            e.this.p(this.o, this.p);
            e.this.i.e();
            double d8 = e.this.g();
            f f8 = f.f();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Delay for: ");
            stringBuilder.append(String.format((Locale)Locale.US, (String)"%.2f", (Object[])new Object[]{d8 / 1000.0}));
            stringBuilder.append(" s for report: ");
            stringBuilder.append(this.o.d());
            f8.b(stringBuilder.toString());
            e.q(d8);
        }
    }

}

