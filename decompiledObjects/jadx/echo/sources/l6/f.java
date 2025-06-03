package l6;

/* loaded from: classes.dex */
public abstract class f extends e {
    public static int a(int i7, int i8) {
        return i7 < i8 ? i8 : i7;
    }

    public static int b(int i7, int i8) {
        return i7 > i8 ? i8 : i7;
    }

    public static long c(long j7, long j8) {
        return j7 > j8 ? j8 : j7;
    }

    public static int d(int i7, int i8, int i9) {
        if (i8 <= i9) {
            return i7 < i8 ? i8 : i7 > i9 ? i9 : i7;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + i9 + " is less than minimum " + i8 + '.');
    }

    public static long e(long j7, long j8, long j9) {
        if (j8 <= j9) {
            return j7 < j8 ? j8 : j7 > j9 ? j9 : j7;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + j9 + " is less than minimum " + j8 + '.');
    }

    public static a f(int i7, int i8) {
        return a.f17297r.a(i7, i8, -1);
    }

    public static c g(int i7, int i8) {
        return i8 <= Integer.MIN_VALUE ? c.f17305s.a() : new c(i7, i8 - 1);
    }
}
