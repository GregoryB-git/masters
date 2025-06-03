/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.ArithmeticException
 *  java.lang.AssertionError
 *  java.lang.Math
 *  java.lang.NoSuchFieldError
 *  java.lang.Object
 *  java.lang.String
 *  java.math.RoundingMode
 */
package Z2;

import W2.m;
import Z2.f;
import java.math.RoundingMode;

public abstract class d {
    public static final byte[] a = new byte[]{9, 9, 9, 8, 8, 8, 7, 7, 7, 6, 6, 6, 6, 5, 5, 5, 4, 4, 4, 3, 3, 3, 3, 2, 2, 2, 1, 1, 1, 0, 0, 0, 0};
    public static final int[] b = new int[]{1, 10, 100, 1000, 10000, 100000, 1000000, 10000000, 100000000, 1000000000};
    public static final int[] c = new int[]{3, 31, 316, 3162, 31622, 316227, 3162277, 31622776, 316227766, Integer.MAX_VALUE};
    public static final int[] d = new int[]{1, 1, 2, 6, 24, 120, 720, 5040, 40320, 362880, 3628800, 39916800, 479001600};
    public static int[] e = new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE, 65536, 2345, 477, 193, 110, 75, 58, 49, 43, 39, 37, 35, 34, 34, 33};

    public static int a(int n8, int n9) {
        long l8 = (long)n8 + (long)n9;
        int n10 = (int)l8;
        boolean bl = l8 == (long)n10;
        f.b(bl, "checkedAdd", n8, n9);
        return n10;
    }

    /*
     * Unable to fully structure code
     */
    public static int b(int var0, int var1_1, RoundingMode var2_2) {
        block13 : {
            m.j((Object)var2_2);
            if (var1_1 == 0) break block13;
            var4_3 = var0 / var1_1;
            var6_4 = var0 - var1_1 * var4_3;
            if (var6_4 == 0) {
                return var4_3;
            }
            var7_5 = true;
            var3_6 = 1;
            var5_7 = (var0 ^ var1_1) >> 31 | 1;
            switch (.a[var2_2.ordinal()]) {
                default: {
                    throw new AssertionError();
                }
                case 6: 
                case 7: 
                case 8: {
                    var0 = Math.abs((int)var6_4);
                    var0 -= Math.abs((int)var1_1) - var0;
                    if (var0 == 0) {
                        if (var2_2 != RoundingMode.HALF_UP) {
                            var0 = var2_2 == RoundingMode.HALF_EVEN ? 1 : 0;
                            var1_1 = (var4_3 & 1) != 0 ? var3_6 : 0;
                            if ((var0 & var1_1) == 0) break;
                        }
                    } else if (var0 <= 0) break;
                    ** GOTO lbl29
                }
                case 5: {
                    if (var5_7 <= 0) break;
                    ** GOTO lbl29
                }
                case 3: {
                    if (var5_7 >= 0) break;
                }
lbl29: // 5 sources:
                case 4: {
                    return var4_3 + var5_7;
                }
                case 1: {
                    if (var6_4 != 0) {
                        var7_5 = false;
                    }
                    f.e(var7_5);
                }
                case 2: 
            }
            return var4_3;
        }
        throw new ArithmeticException("/ by zero");
    }

    public static int c(int n8, int n9) {
        return a3.f.m((long)n8 * (long)n9);
    }

}

