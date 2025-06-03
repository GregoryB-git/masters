package q8;

import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;
import defpackage.f;
import h3.e;
import h3.h;
import h3.j;
import j8.e0;
import j8.u;
import java.util.Locale;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import l.l;
import m8.f0;
import x0.q0;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final double f13354a;

    /* renamed from: b, reason: collision with root package name */
    public final double f13355b;

    /* renamed from: c, reason: collision with root package name */
    public final long f13356c;

    /* renamed from: d, reason: collision with root package name */
    public final long f13357d;

    /* renamed from: e, reason: collision with root package name */
    public final int f13358e;
    public final ArrayBlockingQueue f;

    /* renamed from: g, reason: collision with root package name */
    public final ThreadPoolExecutor f13359g;

    /* renamed from: h, reason: collision with root package name */
    public final h<f0> f13360h;

    /* renamed from: i, reason: collision with root package name */
    public final l f13361i;

    /* renamed from: j, reason: collision with root package name */
    public int f13362j;

    /* renamed from: k, reason: collision with root package name */
    public long f13363k;

    public final class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final u f13364a;

        /* renamed from: b, reason: collision with root package name */
        public final TaskCompletionSource<u> f13365b;

        public a(u uVar, TaskCompletionSource taskCompletionSource) {
            this.f13364a = uVar;
            this.f13365b = taskCompletionSource;
        }

        @Override // java.lang.Runnable
        public final void run() {
            c.this.b(this.f13364a, this.f13365b);
            ((AtomicInteger) c.this.f13361i.f9391c).set(0);
            c cVar = c.this;
            double min = Math.min(3600000.0d, Math.pow(cVar.f13355b, cVar.a()) * (60000.0d / cVar.f13354a));
            StringBuilder l10 = f.l("Delay for: ");
            l10.append(String.format(Locale.US, "%.2f", Double.valueOf(min / 1000.0d)));
            l10.append(" s for report: ");
            l10.append(this.f13364a.c());
            String sb2 = l10.toString();
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", sb2, null);
            }
            try {
                Thread.sleep((long) min);
            } catch (InterruptedException unused) {
            }
        }
    }

    public c(h<f0> hVar, r8.c cVar, l lVar) {
        double d10 = cVar.f13788d;
        double d11 = cVar.f13789e;
        this.f13354a = d10;
        this.f13355b = d11;
        this.f13356c = cVar.f * 1000;
        this.f13360h = hVar;
        this.f13361i = lVar;
        this.f13357d = SystemClock.elapsedRealtime();
        int i10 = (int) d10;
        this.f13358e = i10;
        ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue(i10);
        this.f = arrayBlockingQueue;
        this.f13359g = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, arrayBlockingQueue);
        this.f13362j = 0;
        this.f13363k = 0L;
    }

    public final int a() {
        if (this.f13363k == 0) {
            this.f13363k = System.currentTimeMillis();
        }
        int currentTimeMillis = (int) ((System.currentTimeMillis() - this.f13363k) / this.f13356c);
        int min = this.f.size() == this.f13358e ? Math.min(100, this.f13362j + currentTimeMillis) : Math.max(0, this.f13362j - currentTimeMillis);
        if (this.f13362j != min) {
            this.f13362j = min;
            this.f13363k = System.currentTimeMillis();
        }
        return min;
    }

    public final void b(final u uVar, final TaskCompletionSource<u> taskCompletionSource) {
        StringBuilder l10 = f.l("Sending report through Google DataTransport: ");
        l10.append(uVar.c());
        String sb2 = l10.toString();
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", sb2, null);
        }
        final boolean z10 = SystemClock.elapsedRealtime() - this.f13357d < 2000;
        ((k3.u) this.f13360h).a(new h3.a(uVar.a(), e.HIGHEST, null), new j() { // from class: q8.b
            @Override // h3.j
            public final void a(Exception exc) {
                c cVar = c.this;
                TaskCompletionSource taskCompletionSource2 = taskCompletionSource;
                boolean z11 = z10;
                u uVar2 = uVar;
                cVar.getClass();
                if (exc != null) {
                    taskCompletionSource2.trySetException(exc);
                    return;
                }
                if (z11) {
                    boolean z12 = true;
                    CountDownLatch countDownLatch = new CountDownLatch(1);
                    new Thread(new q0(10, cVar, countDownLatch)).start();
                    TimeUnit timeUnit = TimeUnit.SECONDS;
                    ExecutorService executorService = e0.f8575a;
                    boolean z13 = false;
                    try {
                        long nanos = timeUnit.toNanos(2L);
                        long nanoTime = System.nanoTime() + nanos;
                        while (true) {
                            try {
                                try {
                                    countDownLatch.await(nanos, TimeUnit.NANOSECONDS);
                                    break;
                                } catch (InterruptedException unused) {
                                    nanos = nanoTime - System.nanoTime();
                                    z13 = true;
                                }
                            } catch (Throwable th) {
                                th = th;
                                if (z12) {
                                    Thread.currentThread().interrupt();
                                }
                                throw th;
                            }
                        }
                        if (z13) {
                            Thread.currentThread().interrupt();
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        z12 = z13;
                    }
                }
                taskCompletionSource2.trySetResult(uVar2);
            }
        });
    }
}
