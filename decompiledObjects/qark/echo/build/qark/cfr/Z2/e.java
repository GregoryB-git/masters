/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.AssertionError
 *  java.lang.Long
 *  java.lang.Math
 *  java.lang.NoSuchFieldError
 *  java.lang.Object
 *  java.math.RoundingMode
 */
package Z2;

import W2.m;
import Z2.f;
import java.math.RoundingMode;

public abstract class e {
    public static final byte[] a = new byte[]{19, 18, 18, 18, 18, 17, 17, 17, 16, 16, 16, 15, 15, 15, 15, 14, 14, 14, 13, 13, 13, 12, 12, 12, 12, 11, 11, 11, 10, 10, 10, 9, 9, 9, 9, 8, 8, 8, 7, 7, 7, 6, 6, 6, 6, 5, 5, 5, 4, 4, 4, 3, 3, 3, 3, 2, 2, 2, 1, 1, 1, 0, 0, 0};
    public static final long[] b = new long[]{1L, 10L, 100L, 1000L, 10000L, 100000L, 1000000L, 10000000L, 100000000L, 1000000000L, 10000000000L, 100000000000L, 1000000000000L, 10000000000000L, 100000000000000L, 1000000000000000L, 10000000000000000L, 100000000000000000L, 1000000000000000000L};
    public static final long[] c = new long[]{3L, 31L, 316L, 3162L, 31622L, 316227L, 3162277L, 31622776L, 316227766L, 3162277660L, 31622776601L, 316227766016L, 3162277660168L, 31622776601683L, 316227766016837L, 3162277660168379L, 31622776601683793L, 316227766016837933L, 3162277660168379331L};
    public static final long[] d = new long[]{1L, 1L, 2L, 6L, 24L, 120L, 720L, 5040L, 40320L, 362880L, 3628800L, 39916800L, 479001600L, 6227020800L, 87178291200L, 1307674368000L, 20922789888000L, 355687428096000L, 6402373705728000L, 121645100408832000L, 2432902008176640000L};
    public static final int[] e = new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, 3810779, 121977, 16175, 4337, 1733, 887, 534, 361, 265, 206, 169, 143, 125, 111, 101, 94, 88, 83, 79, 76, 74, 72, 70, 69, 68, 67, 67, 66, 66, 66, 66};
    public static final int[] f = new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, 2642246, 86251, 11724, 3218, 1313, 684, 419, 287, 214, 169, 139, 119, 105, 95, 87, 81, 76, 73, 70, 68, 66, 64, 63, 62, 62, 61, 61, 61};
    public static final long[][] g;

    static {
        long[] arrl = new long[]{885594168L, 725270293939359937L, 3569819667048198375L};
        long[] arrl2 = new long[]{273919523040L, 15L, 7363882082L, 992620450144556L};
        long[] arrl3 = new long[]{47636622961200L, 2L, 2570940L, 211991001L, 3749873356L};
        long[] arrl4 = new long[]{7999252175582850L, 2L, 4130806001517L, 149795463772692060L, 186635894390467037L, 3967304179347715805L};
        long[] arrl5 = new long[]{585226005592931976L, 2L, 123635709730000L, 9233062284813009L, 43835965440333360L, 761179012939631437L, 1263739024124850375L};
        long[] arrl6 = new long[]{Long.MAX_VALUE, 2L, 325L, 9375L, 28178L, 450775L, 9780504L, 1795265022L};
        g = new long[][]{{291830L, 126401071349994536L}, arrl, arrl2, arrl3, arrl4, arrl5, arrl6};
    }

    public static long a(long l8, long l9) {
        long l10 = l8 + l9;
        boolean bl = false;
        boolean bl2 = (l8 ^ l9) < 0L;
        if ((l8 ^ l10) >= 0L) {
            bl = true;
        }
        f.c(bl2 | bl, "checkedAdd", l8, l9);
        return l10;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public static long b(long var0, long var2_1, RoundingMode var4_2) {
        m.j((Object)var4_2);
        var7_3 = var0 / var2_1;
        var9_4 = var0 - var2_1 * var7_3;
        var5_5 = var9_4 LCMP 0L;
        if (var5_5 == false) {
            return var7_3;
        }
        var6_6 = (int)((var0 ^ var2_1) >> 63);
        var11_7 = true;
        var6_6 |= 1;
        switch (.a[var4_2.ordinal()]) {
            default: {
                throw new AssertionError();
            }
            case 6: 
            case 7: 
            case 8: {
                var0 = Math.abs((long)var9_4);
                var5_5 = var0 - (Math.abs((long)var2_1) - var0) LCMP 0L;
                if (var5_5 == false) {
                    if (var4_2 == RoundingMode.HALF_UP) return var7_3 + (long)var6_6;
                    if (var4_2 != RoundingMode.HALF_EVEN) return var7_3;
                    if ((1L & var7_3) == 0L) return var7_3;
                } else if (var5_5 <= 0) return var7_3;
                ** GOTO lbl28
            }
            case 5: {
                if (var6_6 <= 0) return var7_3;
                ** GOTO lbl28
            }
            case 3: {
                if (var6_6 >= 0) return var7_3;
            }
lbl28: // 5 sources:
            case 4: {
                return var7_3 + (long)var6_6;
            }
            case 1: {
                if (var5_5 != false) {
                    var11_7 = false;
                }
                f.e(var11_7);
            }
            case 2: 
        }
        return var7_3;
    }

    public static long c(long l8, long l9) {
        f.d("a", l8);
        f.d("b", l9);
        if (l8 == 0L) {
            return l9;
        }
        if (l9 == 0L) {
            return l8;
        }
        int n8 = Long.numberOfTrailingZeros((long)l8);
        long l10 = l8 >> n8;
        int n9 = Long.numberOfTrailingZeros((long)l9);
        l8 = l9 >> n9;
        l9 = l10;
        while (l9 != l8) {
            l10 = l9 - l8;
            l9 = l10 >> 63 & l10;
            l10 = l10 - l9 - l9;
            l8 += l9;
            l9 = l10 >> Long.numberOfTrailingZeros((long)l10);
        }
        return l9 << Math.min((int)n8, (int)n9);
    }

    public static long d(long l8, long l9) {
        int n8 = Long.numberOfLeadingZeros((long)l8) + Long.numberOfLeadingZeros((long)l8) + Long.numberOfLeadingZeros((long)l9) + Long.numberOfLeadingZeros((long)l9);
        if (n8 > 65) {
            return l8 * l9;
        }
        long l10 = ((l8 ^ l9) >>> 63) + Long.MAX_VALUE;
        boolean bl = false;
        n8 = n8 < 64 ? 1 : 0;
        long l11 = l8 LCMP 0L;
        boolean bl2 = l11 < 0;
        if (l9 == Long.MIN_VALUE) {
            bl = true;
        }
        if ((n8 | bl & bl2) != 0) {
            return l10;
        }
        long l12 = l8 * l9;
        if (l11 != false) {
            if (l12 / l8 == l9) {
                return l12;
            }
            return l10;
        }
        return l12;
    }

}

