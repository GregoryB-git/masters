package n7;

import java.util.Locale;
import java.util.concurrent.TimeUnit;
import n7.v;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final v.a f11308a = v.f11320a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f11309b;

    /* renamed from: c, reason: collision with root package name */
    public long f11310c;

    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f11311a;

        static {
            int[] iArr = new int[TimeUnit.values().length];
            f11311a = iArr;
            try {
                iArr[TimeUnit.NANOSECONDS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f11311a[TimeUnit.MICROSECONDS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f11311a[TimeUnit.MILLISECONDS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f11311a[TimeUnit.SECONDS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f11311a[TimeUnit.MINUTES.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f11311a[TimeUnit.HOURS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f11311a[TimeUnit.DAYS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public final long a(TimeUnit timeUnit) {
        long j10 = 0;
        if (this.f11309b) {
            this.f11308a.getClass();
            j10 = 0 + (System.nanoTime() - this.f11310c);
        }
        return timeUnit.convert(j10, TimeUnit.NANOSECONDS);
    }

    public final void b() {
        x6.b.I(!this.f11309b, "This stopwatch is already running.");
        this.f11309b = true;
        this.f11308a.getClass();
        this.f11310c = System.nanoTime();
    }

    public final String toString() {
        long j10;
        String str;
        if (this.f11309b) {
            this.f11308a.getClass();
            j10 = (System.nanoTime() - this.f11310c) + 0;
        } else {
            j10 = 0;
        }
        TimeUnit timeUnit = TimeUnit.DAYS;
        TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
        if (timeUnit.convert(j10, timeUnit2) <= 0) {
            timeUnit = TimeUnit.HOURS;
            if (timeUnit.convert(j10, timeUnit2) <= 0) {
                timeUnit = TimeUnit.MINUTES;
                if (timeUnit.convert(j10, timeUnit2) <= 0) {
                    timeUnit = TimeUnit.SECONDS;
                    if (timeUnit.convert(j10, timeUnit2) <= 0) {
                        timeUnit = TimeUnit.MILLISECONDS;
                        if (timeUnit.convert(j10, timeUnit2) <= 0) {
                            timeUnit = TimeUnit.MICROSECONDS;
                            if (timeUnit.convert(j10, timeUnit2) <= 0) {
                                timeUnit = timeUnit2;
                            }
                        }
                    }
                }
            }
        }
        double convert = j10 / timeUnit2.convert(1L, timeUnit);
        StringBuilder sb2 = new StringBuilder();
        int i10 = i.f11295a;
        sb2.append(String.format(Locale.ROOT, "%.4g", Double.valueOf(convert)));
        sb2.append(" ");
        switch (a.f11311a[timeUnit.ordinal()]) {
            case 1:
                str = "ns";
                break;
            case 2:
                str = "μs";
                break;
            case 3:
                str = "ms";
                break;
            case 4:
                str = "s";
                break;
            case 5:
                str = "min";
                break;
            case 6:
                str = "h";
                break;
            case 7:
                str = "d";
                break;
            default:
                throw new AssertionError();
        }
        sb2.append(str);
        return sb2.toString();
    }
}
