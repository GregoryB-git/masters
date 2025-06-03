package K4;

import android.os.Process;
import android.system.Os;
import android.system.OsConstants;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class c {

    /* renamed from: g, reason: collision with root package name */
    public static final F4.a f3194g = F4.a.e();

    /* renamed from: h, reason: collision with root package name */
    public static final long f3195h = TimeUnit.SECONDS.toMicros(1);

    /* renamed from: e, reason: collision with root package name */
    public ScheduledFuture f3200e = null;

    /* renamed from: f, reason: collision with root package name */
    public long f3201f = -1;

    /* renamed from: a, reason: collision with root package name */
    public final ConcurrentLinkedQueue f3196a = new ConcurrentLinkedQueue();

    /* renamed from: b, reason: collision with root package name */
    public final ScheduledExecutorService f3197b = Executors.newSingleThreadScheduledExecutor();

    /* renamed from: c, reason: collision with root package name */
    public final String f3198c = "/proc/" + Integer.toString(Process.myPid()) + "/stat";

    /* renamed from: d, reason: collision with root package name */
    public final long f3199d = e();

    public static boolean f(long j7) {
        return j7 <= 0;
    }

    public void c(M4.l lVar) {
        i(lVar);
    }

    public final long d(long j7) {
        return Math.round((j7 / this.f3199d) * f3195h);
    }

    public final long e() {
        return Os.sysconf(OsConstants._SC_CLK_TCK);
    }

    public final /* synthetic */ void g(M4.l lVar) {
        N4.e m7 = m(lVar);
        if (m7 != null) {
            this.f3196a.add(m7);
        }
    }

    public final /* synthetic */ void h(M4.l lVar) {
        N4.e m7 = m(lVar);
        if (m7 != null) {
            this.f3196a.add(m7);
        }
    }

    public final synchronized void i(final M4.l lVar) {
        try {
            this.f3197b.schedule(new Runnable() { // from class: K4.b
                @Override // java.lang.Runnable
                public final void run() {
                    c.this.g(lVar);
                }
            }, 0L, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e7) {
            f3194g.j("Unable to collect Cpu Metric: " + e7.getMessage());
        }
    }

    public final synchronized void j(long j7, final M4.l lVar) {
        this.f3201f = j7;
        try {
            this.f3200e = this.f3197b.scheduleAtFixedRate(new Runnable() { // from class: K4.a
                @Override // java.lang.Runnable
                public final void run() {
                    c.this.h(lVar);
                }
            }, 0L, j7, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e7) {
            f3194g.j("Unable to start collecting Cpu Metrics: " + e7.getMessage());
        }
    }

    public void k(long j7, M4.l lVar) {
        long j8 = this.f3199d;
        if (j8 == -1 || j8 == 0 || f(j7)) {
            return;
        }
        if (this.f3200e == null) {
            j(j7, lVar);
        } else if (this.f3201f != j7) {
            l();
            j(j7, lVar);
        }
    }

    public void l() {
        ScheduledFuture scheduledFuture = this.f3200e;
        if (scheduledFuture == null) {
            return;
        }
        scheduledFuture.cancel(false);
        this.f3200e = null;
        this.f3201f = -1L;
    }

    public final N4.e m(M4.l lVar) {
        F4.a aVar;
        StringBuilder sb;
        String str;
        if (lVar == null) {
            return null;
        }
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(this.f3198c));
            try {
                long b7 = lVar.b();
                String[] split = bufferedReader.readLine().split(" ");
                long parseLong = Long.parseLong(split[13]);
                long parseLong2 = Long.parseLong(split[15]);
                N4.e eVar = (N4.e) N4.e.X().D(b7).E(d(Long.parseLong(split[14]) + Long.parseLong(split[16]))).F(d(parseLong + parseLong2)).v();
                bufferedReader.close();
                return eVar;
            } catch (Throwable th) {
                try {
                    bufferedReader.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException e7) {
            e = e7;
            aVar = f3194g;
            sb = new StringBuilder();
            str = "Unable to read 'proc/[pid]/stat' file: ";
            sb.append(str);
            sb.append(e.getMessage());
            aVar.j(sb.toString());
            return null;
        } catch (ArrayIndexOutOfBoundsException e8) {
            e = e8;
            aVar = f3194g;
            sb = new StringBuilder();
            str = "Unexpected '/proc/[pid]/stat' file format encountered: ";
            sb.append(str);
            sb.append(e.getMessage());
            aVar.j(sb.toString());
            return null;
        } catch (NullPointerException e9) {
            e = e9;
            aVar = f3194g;
            sb = new StringBuilder();
            str = "Unexpected '/proc/[pid]/stat' file format encountered: ";
            sb.append(str);
            sb.append(e.getMessage());
            aVar.j(sb.toString());
            return null;
        } catch (NumberFormatException e10) {
            e = e10;
            aVar = f3194g;
            sb = new StringBuilder();
            str = "Unexpected '/proc/[pid]/stat' file format encountered: ";
            sb.append(str);
            sb.append(e.getMessage());
            aVar.j(sb.toString());
            return null;
        }
    }
}
