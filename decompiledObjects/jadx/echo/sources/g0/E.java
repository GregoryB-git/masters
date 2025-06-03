package g0;

import android.os.SystemClock;
import java.util.concurrent.TimeoutException;

/* loaded from: classes.dex */
public final class E {

    /* renamed from: a, reason: collision with root package name */
    public long f14256a;

    /* renamed from: b, reason: collision with root package name */
    public long f14257b;

    /* renamed from: c, reason: collision with root package name */
    public long f14258c;

    /* renamed from: d, reason: collision with root package name */
    public final ThreadLocal f14259d = new ThreadLocal();

    public E(long j7) {
        i(j7);
    }

    public static long h(long j7) {
        return (j7 * 1000000) / 90000;
    }

    public static long k(long j7) {
        return (j7 * 90000) / 1000000;
    }

    public static long l(long j7) {
        return k(j7) % 8589934592L;
    }

    public synchronized long a(long j7) {
        if (j7 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            if (!g()) {
                long j8 = this.f14256a;
                if (j8 == 9223372036854775806L) {
                    j8 = ((Long) AbstractC1297a.e((Long) this.f14259d.get())).longValue();
                }
                this.f14257b = j8 - j7;
                notifyAll();
            }
            this.f14258c = j7;
            return j7 + this.f14257b;
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized long b(long j7) {
        if (j7 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            long j8 = this.f14258c;
            if (j8 != -9223372036854775807L) {
                long k7 = k(j8);
                long j9 = (4294967296L + k7) / 8589934592L;
                long j10 = ((j9 - 1) * 8589934592L) + j7;
                j7 += j9 * 8589934592L;
                if (Math.abs(j10 - k7) < Math.abs(j7 - k7)) {
                    j7 = j10;
                }
            }
            return a(h(j7));
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized long c(long j7) {
        if (j7 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        long j8 = this.f14258c;
        if (j8 != -9223372036854775807L) {
            long k7 = k(j8);
            long j9 = k7 / 8589934592L;
            Long.signum(j9);
            long j10 = (j9 * 8589934592L) + j7;
            j7 += (j9 + 1) * 8589934592L;
            if (j10 >= k7) {
                j7 = j10;
            }
        }
        return a(h(j7));
    }

    public synchronized long d() {
        long j7;
        j7 = this.f14256a;
        if (j7 == Long.MAX_VALUE || j7 == 9223372036854775806L) {
            j7 = -9223372036854775807L;
        }
        return j7;
    }

    public synchronized long e() {
        long j7;
        try {
            j7 = this.f14258c;
        } catch (Throwable th) {
            throw th;
        }
        return j7 != -9223372036854775807L ? j7 + this.f14257b : d();
    }

    public synchronized long f() {
        return this.f14257b;
    }

    public synchronized boolean g() {
        return this.f14257b != -9223372036854775807L;
    }

    public synchronized void i(long j7) {
        this.f14256a = j7;
        this.f14257b = j7 == Long.MAX_VALUE ? 0L : -9223372036854775807L;
        this.f14258c = -9223372036854775807L;
    }

    public synchronized void j(boolean z7, long j7, long j8) {
        try {
            AbstractC1297a.f(this.f14256a == 9223372036854775806L);
            if (g()) {
                return;
            }
            if (z7) {
                this.f14259d.set(Long.valueOf(j7));
            } else {
                long j9 = 0;
                long j10 = j8;
                while (!g()) {
                    if (j8 == 0) {
                        wait();
                    } else {
                        AbstractC1297a.f(j10 > 0);
                        long elapsedRealtime = SystemClock.elapsedRealtime();
                        wait(j10);
                        j9 += SystemClock.elapsedRealtime() - elapsedRealtime;
                        if (j9 >= j8 && !g()) {
                            throw new TimeoutException("TimestampAdjuster failed to initialize in " + j8 + " milliseconds");
                        }
                        j10 = j8 - j9;
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
