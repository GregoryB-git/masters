/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.ArithmeticException
 *  java.lang.AssertionError
 *  java.lang.Long
 *  java.lang.Math
 *  java.lang.NoSuchFieldError
 *  java.lang.Object
 *  java.lang.String
 *  java.math.RoundingMode
 */
package Z2;

import Z2.c;
import Z2.f;
import java.math.RoundingMode;

public abstract class b {
    public static final double a = Math.log((double)2.0);
    public static final double[] b = new double[]{1.0, 2.0922789888E13, 2.631308369336935E35, 1.2413915592536073E61, 1.2688693218588417E89, 7.156945704626381E118, 9.916779348709496E149, 1.974506857221074E182, 3.856204823625804E215, 5.5502938327393044E249, 4.7147236359920616E284};

    public static boolean a(double d8) {
        if (c.b(d8) && (d8 == 0.0 || 52 - Long.numberOfTrailingZeros((long)c.a(d8)) <= Math.getExponent((double)d8))) {
            return true;
        }
        return false;
    }

    public static double b(double d8, RoundingMode roundingMode) {
        if (c.b(d8)) {
            double d9 = d8;
            switch (.a[roundingMode.ordinal()]) {
                default: {
                    throw new AssertionError();
                }
                case 8: {
                    d9 = Math.rint((double)d8);
                    if (Math.abs((double)(d8 - d9)) == 0.5) {
                        return d8;
                    }
                    return d9;
                }
                case 7: {
                    d9 = Math.rint((double)d8);
                    if (Math.abs((double)(d8 - d9)) == 0.5) {
                        return d8 + Math.copySign((double)0.5, (double)d8);
                    }
                    return d9;
                }
                case 6: {
                    return Math.rint((double)d8);
                }
                case 5: {
                    if (b.a(d8)) {
                        return d8;
                    }
                    long l8 = (long)d8;
                    int n8 = d8 > 0.0 ? 1 : -1;
                    d9 = l8 + (long)n8;
                }
                case 4: {
                    return d9;
                }
                case 3: {
                    d9 = d8;
                    if (d8 > 0.0) {
                        if (b.a(d8)) {
                            return d8;
                        }
                        d9 = (long)d8 + 1L;
                    }
                    return d9;
                }
                case 2: {
                    d9 = d8;
                    if (d8 < 0.0) {
                        if (b.a(d8)) {
                            return d8;
                        }
                        d9 = (long)d8 - 1L;
                    }
                    return d9;
                }
                case 1: 
            }
            f.e(b.a(d8));
            return d8;
        }
        throw new ArithmeticException("input is infinite or NaN");
    }

    public static long c(double d8, RoundingMode roundingMode) {
        double d9 = b.b(d8, roundingMode);
        boolean bl = false;
        boolean bl2 = -9.223372036854776E18 - d9 < 1.0;
        if (d9 < 9.223372036854776E18) {
            bl = true;
        }
        f.a(bl2 & bl, d8, roundingMode);
        return (long)d9;
    }

}

