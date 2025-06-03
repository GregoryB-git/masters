package v5;

/* loaded from: classes.dex */
public final class c0 {

    /* renamed from: a, reason: collision with root package name */
    public long f15873a;

    /* renamed from: b, reason: collision with root package name */
    public long f15874b;

    /* renamed from: c, reason: collision with root package name */
    public long f15875c;

    /* renamed from: d, reason: collision with root package name */
    public final ThreadLocal<Long> f15876d = new ThreadLocal<>();

    public c0(long j10) {
        d(j10);
    }

    public final synchronized long a(long j10) {
        if (j10 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        if (this.f15874b == -9223372036854775807L) {
            long j11 = this.f15873a;
            if (j11 == 9223372036854775806L) {
                Long l10 = this.f15876d.get();
                l10.getClass();
                j11 = l10.longValue();
            }
            this.f15874b = j11 - j10;
            notifyAll();
        }
        this.f15875c = j10;
        return j10 + this.f15874b;
    }

    public final synchronized long b(long j10) {
        if (j10 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        long j11 = this.f15875c;
        if (j11 != -9223372036854775807L) {
            long j12 = (j11 * 90000) / 1000000;
            long j13 = (4294967296L + j12) / 8589934592L;
            long j14 = ((j13 - 1) * 8589934592L) + j10;
            j10 += j13 * 8589934592L;
            if (Math.abs(j14 - j12) < Math.abs(j10 - j12)) {
                j10 = j14;
            }
        }
        return a((j10 * 1000000) / 90000);
    }

    public final synchronized long c() {
        long j10;
        j10 = this.f15873a;
        if (j10 == Long.MAX_VALUE || j10 == 9223372036854775806L) {
            j10 = -9223372036854775807L;
        }
        return j10;
    }

    public final synchronized void d(long j10) {
        this.f15873a = j10;
        this.f15874b = j10 == Long.MAX_VALUE ? 0L : -9223372036854775807L;
        this.f15875c = -9223372036854775807L;
    }
}
