package Z2;

import java.math.RoundingMode;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final double f7834a = Math.log(2.0d);

    /* renamed from: b, reason: collision with root package name */
    public static final double[] f7835b = {1.0d, 2.0922789888E13d, 2.631308369336935E35d, 1.2413915592536073E61d, 1.2688693218588417E89d, 7.156945704626381E118d, 9.916779348709496E149d, 1.974506857221074E182d, 3.856204823625804E215d, 5.5502938327393044E249d, 4.7147236359920616E284d};

    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f7836a;

        static {
            int[] iArr = new int[RoundingMode.values().length];
            f7836a = iArr;
            try {
                iArr[RoundingMode.UNNECESSARY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f7836a[RoundingMode.FLOOR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f7836a[RoundingMode.CEILING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f7836a[RoundingMode.DOWN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f7836a[RoundingMode.UP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f7836a[RoundingMode.HALF_EVEN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f7836a[RoundingMode.HALF_UP.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f7836a[RoundingMode.HALF_DOWN.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public static boolean a(double d7) {
        return c.b(d7) && (d7 == 0.0d || 52 - Long.numberOfTrailingZeros(c.a(d7)) <= Math.getExponent(d7));
    }

    public static double b(double d7, RoundingMode roundingMode) {
        if (!c.b(d7)) {
            throw new ArithmeticException("input is infinite or NaN");
        }
        switch (a.f7836a[roundingMode.ordinal()]) {
            case 1:
                f.e(a(d7));
                return d7;
            case 2:
                return (d7 >= 0.0d || a(d7)) ? d7 : ((long) d7) - 1;
            case 3:
                return (d7 <= 0.0d || a(d7)) ? d7 : ((long) d7) + 1;
            case 4:
                return d7;
            case 5:
                if (a(d7)) {
                    return d7;
                }
                return ((long) d7) + (d7 > 0.0d ? 1 : -1);
            case 6:
                return Math.rint(d7);
            case 7:
                double rint = Math.rint(d7);
                return Math.abs(d7 - rint) == 0.5d ? d7 + Math.copySign(0.5d, d7) : rint;
            case 8:
                double rint2 = Math.rint(d7);
                return Math.abs(d7 - rint2) == 0.5d ? d7 : rint2;
            default:
                throw new AssertionError();
        }
    }

    public static long c(double d7, RoundingMode roundingMode) {
        double b7 = b(d7, roundingMode);
        f.a(((-9.223372036854776E18d) - b7 < 1.0d) & (b7 < 9.223372036854776E18d), d7, roundingMode);
        return (long) b7;
    }
}
