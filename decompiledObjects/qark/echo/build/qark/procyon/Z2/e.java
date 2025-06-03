// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package Z2;

import W2.m;
import java.math.RoundingMode;

public abstract class e
{
    public static final byte[] a;
    public static final long[] b;
    public static final long[] c;
    public static final long[] d;
    public static final int[] e;
    public static final int[] f;
    public static final long[][] g;
    
    static {
        a = new byte[] { 19, 18, 18, 18, 18, 17, 17, 17, 16, 16, 16, 15, 15, 15, 15, 14, 14, 14, 13, 13, 13, 12, 12, 12, 12, 11, 11, 11, 10, 10, 10, 9, 9, 9, 9, 8, 8, 8, 7, 7, 7, 6, 6, 6, 6, 5, 5, 5, 4, 4, 4, 3, 3, 3, 3, 2, 2, 2, 1, 1, 1, 0, 0, 0 };
        b = new long[] { 1L, 10L, 100L, 1000L, 10000L, 100000L, 1000000L, 10000000L, 100000000L, 1000000000L, 10000000000L, 100000000000L, 1000000000000L, 10000000000000L, 100000000000000L, 1000000000000000L, 10000000000000000L, 100000000000000000L, 1000000000000000000L };
        c = new long[] { 3L, 31L, 316L, 3162L, 31622L, 316227L, 3162277L, 31622776L, 316227766L, 3162277660L, 31622776601L, 316227766016L, 3162277660168L, 31622776601683L, 316227766016837L, 3162277660168379L, 31622776601683793L, 316227766016837933L, 3162277660168379331L };
        d = new long[] { 1L, 1L, 2L, 6L, 24L, 120L, 720L, 5040L, 40320L, 362880L, 3628800L, 39916800L, 479001600L, 6227020800L, 87178291200L, 1307674368000L, 20922789888000L, 355687428096000L, 6402373705728000L, 121645100408832000L, 2432902008176640000L };
        e = new int[] { Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, 3810779, 121977, 16175, 4337, 1733, 887, 534, 361, 265, 206, 169, 143, 125, 111, 101, 94, 88, 83, 79, 76, 74, 72, 70, 69, 68, 67, 67, 66, 66, 66, 66 };
        f = new int[] { Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, 2642246, 86251, 11724, 3218, 1313, 684, 419, 287, 214, 169, 139, 119, 105, 95, 87, 81, 76, 73, 70, 68, 66, 64, 63, 62, 62, 61, 61, 61 };
        g = new long[][] { { 291830L, 126401071349994536L }, { 885594168L, 725270293939359937L, 3569819667048198375L }, { 273919523040L, 15L, 7363882082L, 992620450144556L }, { 47636622961200L, 2L, 2570940L, 211991001L, 3749873356L }, { 7999252175582850L, 2L, 4130806001517L, 149795463772692060L, 186635894390467037L, 3967304179347715805L }, { 585226005592931976L, 2L, 123635709730000L, 9233062284813009L, 43835965440333360L, 761179012939631437L, 1263739024124850375L }, { Long.MAX_VALUE, 2L, 325L, 9375L, 28178L, 450775L, 9780504L, 1795265022L } };
    }
    
    public static long a(final long n, final long n2) {
        final long n3 = n + n2;
        boolean b = false;
        final boolean b2 = (n ^ n2) < 0L;
        if ((n ^ n3) >= 0L) {
            b = true;
        }
        Z2.f.c(b2 | b, "checkedAdd", n, n2);
        return n3;
    }
    
    public static long b(long abs, final long a, final RoundingMode roundingMode) {
        m.j(roundingMode);
        final long n = abs / a;
        final long a2 = abs - a * n;
        final long n2 = lcmp(a2, 0L);
        if (n2 == 0) {
            return n;
        }
        final int n3 = (int)((abs ^ a) >> 63);
        boolean b = true;
        final int n4 = n3 | 0x1;
        switch (e$a.a[roundingMode.ordinal()]) {
            default: {
                throw new AssertionError();
            }
            case 6:
            case 7:
            case 8: {
                abs = Math.abs(a2);
                final long n5 = lcmp(abs - (Math.abs(a) - abs), 0L);
                if (n5 == 0) {
                    if (roundingMode == RoundingMode.HALF_UP) {
                        return n + n4;
                    }
                    if (roundingMode == RoundingMode.HALF_EVEN && (0x1L & n) != 0x0L) {
                        return n + n4;
                    }
                    return n;
                }
                else {
                    if (n5 > 0) {
                        return n + n4;
                    }
                    return n;
                }
                break;
            }
            case 5: {
                if (n4 > 0) {
                    return n + n4;
                }
                return n;
            }
            case 3: {
                if (n4 < 0) {
                    return n + n4;
                }
                return n;
            }
            case 4: {
                return n + n4;
            }
            case 1: {
                if (n2 != 0) {
                    b = false;
                }
                Z2.f.e(b);
            }
            case 2: {
                return n;
            }
        }
    }
    
    public static long c(long i, long j) {
        Z2.f.d("a", i);
        Z2.f.d("b", j);
        if (i == 0L) {
            return j;
        }
        if (j == 0L) {
            return i;
        }
        final int numberOfTrailingZeros = Long.numberOfTrailingZeros(i);
        final long n = i >> numberOfTrailingZeros;
        final int numberOfTrailingZeros2 = Long.numberOfTrailingZeros(j);
        long n2;
        long k;
        for (i = j >> numberOfTrailingZeros2, j = n; j != i; j = (n2 >> 63 & n2), k = n2 - j - j, i += j, j = k >> Long.numberOfTrailingZeros(k)) {
            n2 = j - i;
        }
        return j << Math.min(numberOfTrailingZeros, numberOfTrailingZeros2);
    }
    
    public static long d(final long n, final long n2) {
        final int n3 = Long.numberOfLeadingZeros(n) + Long.numberOfLeadingZeros(n) + Long.numberOfLeadingZeros(n2) + Long.numberOfLeadingZeros(n2);
        if (n3 > 65) {
            return n * n2;
        }
        final long n4 = ((n ^ n2) >>> 63) + Long.MAX_VALUE;
        boolean b = false;
        final boolean b2 = n3 < 64;
        final long n5 = lcmp(n, 0L);
        final boolean b3 = n5 < 0;
        if (n2 == Long.MIN_VALUE) {
            b = true;
        }
        if (b2 | (b & b3)) {
            return n4;
        }
        final long n6 = n * n2;
        if (n5 == 0) {
            return n6;
        }
        if (n6 / n == n2) {
            return n6;
        }
        return n4;
    }
}
