// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package Z2;

import W2.m;
import java.math.RoundingMode;

public abstract class d
{
    public static final byte[] a;
    public static final int[] b;
    public static final int[] c;
    public static final int[] d;
    public static int[] e;
    
    static {
        a = new byte[] { 9, 9, 9, 8, 8, 8, 7, 7, 7, 6, 6, 6, 6, 5, 5, 5, 4, 4, 4, 3, 3, 3, 3, 2, 2, 2, 1, 1, 1, 0, 0, 0, 0 };
        b = new int[] { 1, 10, 100, 1000, 10000, 100000, 1000000, 10000000, 100000000, 1000000000 };
        c = new int[] { 3, 31, 316, 3162, 31622, 316227, 3162277, 31622776, 316227766, Integer.MAX_VALUE };
        d = new int[] { 1, 1, 2, 6, 24, 120, 720, 5040, 40320, 362880, 3628800, 39916800, 479001600 };
        Z2.d.e = new int[] { Integer.MAX_VALUE, Integer.MAX_VALUE, 65536, 2345, 477, 193, 110, 75, 58, 49, 43, 39, 37, 35, 34, 34, 33 };
    }
    
    public static int a(final int n, final int n2) {
        final long n3 = n + (long)n2;
        final int n4 = (int)n3;
        f.b(n3 == n4, "checkedAdd", n, n2);
        return n4;
    }
    
    public static int b(int abs, int a, final RoundingMode roundingMode) {
        m.j(roundingMode);
        if (a == 0) {
            throw new ArithmeticException("/ by zero");
        }
        final int n = abs / a;
        final int a2 = abs - a * n;
        if (a2 == 0) {
            return n;
        }
        boolean b = true;
        final int n2 = 1;
        final int n3 = (abs ^ a) >> 31 | 0x1;
        switch (d$a.a[roundingMode.ordinal()]) {
            default: {
                throw new AssertionError();
            }
            case 6:
            case 7:
            case 8: {
                abs = Math.abs(a2);
                abs -= Math.abs(a) - abs;
                if (abs == 0) {
                    if (roundingMode == RoundingMode.HALF_UP) {
                        return n + n3;
                    }
                    if (roundingMode == RoundingMode.HALF_EVEN) {
                        abs = 1;
                    }
                    else {
                        abs = 0;
                    }
                    if ((n & 0x1) != 0x0) {
                        a = n2;
                    }
                    else {
                        a = 0;
                    }
                    if ((abs & a) != 0x0) {
                        return n + n3;
                    }
                    return n;
                }
                else {
                    if (abs > 0) {
                        return n + n3;
                    }
                    return n;
                }
                break;
            }
            case 5: {
                if (n3 > 0) {
                    return n + n3;
                }
                return n;
            }
            case 3: {
                if (n3 < 0) {
                    return n + n3;
                }
                return n;
            }
            case 4: {
                return n + n3;
            }
            case 1: {
                if (a2 != 0) {
                    b = false;
                }
                f.e(b);
            }
            case 2: {
                return n;
            }
        }
    }
    
    public static int c(final int n, final int n2) {
        return a3.f.m(n * (long)n2);
    }
}
