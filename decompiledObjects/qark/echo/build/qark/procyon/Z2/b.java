// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package Z2;

import java.math.RoundingMode;

public abstract class b
{
    public static final double a;
    public static final double[] b;
    
    static {
        a = Math.log(2.0);
        b = new double[] { 1.0, 2.0922789888E13, 2.631308369336935E35, 1.2413915592536073E61, 1.2688693218588417E89, 7.156945704626381E118, 9.916779348709496E149, 1.974506857221074E182, 3.856204823625804E215, 5.5502938327393044E249, 4.7147236359920616E284 };
    }
    
    public static boolean a(final double d) {
        return c.b(d) && (d == 0.0 || 52 - Long.numberOfTrailingZeros(c.a(d)) <= Math.getExponent(d));
    }
    
    public static double b(final double n, final RoundingMode roundingMode) {
        if (!c.b(n)) {
            throw new ArithmeticException("input is infinite or NaN");
        }
        double n2 = n;
        switch (b$a.a[roundingMode.ordinal()]) {
            default: {
                throw new AssertionError();
            }
            case 8: {
                final double rint = Math.rint(n);
                if (Math.abs(n - rint) == 0.5) {
                    return n;
                }
                return rint;
            }
            case 7: {
                final double rint2 = Math.rint(n);
                if (Math.abs(n - rint2) == 0.5) {
                    return n + Math.copySign(0.5, n);
                }
                return rint2;
            }
            case 6: {
                return Math.rint(n);
            }
            case 5: {
                if (a(n)) {
                    return n;
                }
                final long n3 = (long)n;
                int n4;
                if (n > 0.0) {
                    n4 = 1;
                }
                else {
                    n4 = -1;
                }
                n2 = (double)(n3 + n4);
                return n2;
            }
            case 4: {
                return n2;
            }
            case 3: {
                double n5 = n;
                if (n > 0.0) {
                    if (a(n)) {
                        return n;
                    }
                    n5 = (double)((long)n + 1L);
                }
                return n5;
            }
            case 2: {
                double n6 = n;
                if (n < 0.0) {
                    if (a(n)) {
                        return n;
                    }
                    n6 = (double)((long)n - 1L);
                }
                return n6;
            }
            case 1: {
                f.e(a(n));
                return n;
            }
        }
    }
    
    public static long c(final double n, final RoundingMode roundingMode) {
        final double b = b(n, roundingMode);
        boolean b2 = false;
        final boolean b3 = -9.223372036854776E18 - b < 1.0;
        if (b < 9.223372036854776E18) {
            b2 = true;
        }
        f.a(b3 & b2, n, roundingMode);
        return (long)b;
    }
}
