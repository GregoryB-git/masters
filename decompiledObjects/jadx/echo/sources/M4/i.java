package M4;

import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    public long f3548a;

    /* renamed from: b, reason: collision with root package name */
    public long f3549b;

    /* renamed from: c, reason: collision with root package name */
    public TimeUnit f3550c;

    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f3551a;

        static {
            int[] iArr = new int[TimeUnit.values().length];
            f3551a = iArr;
            try {
                iArr[TimeUnit.NANOSECONDS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3551a[TimeUnit.MICROSECONDS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3551a[TimeUnit.MILLISECONDS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public i(long j7, long j8, TimeUnit timeUnit) {
        this.f3548a = j7;
        this.f3549b = j8;
        this.f3550c = timeUnit;
    }

    public double a() {
        int i7 = a.f3551a[this.f3550c.ordinal()];
        return i7 != 1 ? i7 != 2 ? i7 != 3 ? this.f3548a / this.f3550c.toSeconds(this.f3549b) : (this.f3548a / this.f3549b) * TimeUnit.SECONDS.toMillis(1L) : (this.f3548a / this.f3549b) * TimeUnit.SECONDS.toMicros(1L) : (this.f3548a / this.f3549b) * TimeUnit.SECONDS.toNanos(1L);
    }
}
