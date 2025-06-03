/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.IllegalArgumentException
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.String
 */
package h5;

import h5.b;

public abstract class d {
    public static int a(b b8) {
        return d.b(b8, true) + d.b(b8, false);
    }

    public static int b(b arrby, boolean bl) {
        int n8;
        int n9 = bl ? arrby.d() : arrby.e();
        int n10 = bl ? arrby.e() : arrby.d();
        arrby = arrby.c();
        int n11 = n8 = 0;
        while (n8 < n9) {
            int n12;
            int n13 = -1;
            int n14 = n12 = 0;
            while (n12 < n10) {
                int n15 = bl ? arrby[n8][n12] : arrby[n12][n8];
                if (n15 == n13) {
                    n15 = n14 + 1;
                    n14 = n13;
                } else {
                    n13 = n11;
                    if (n14 >= 5) {
                        n13 = n11 + (n14 - 2);
                    }
                    n11 = 1;
                    n14 = n15;
                    n15 = n11;
                    n11 = n13;
                }
                ++n12;
                n13 = n14;
                n14 = n15;
            }
            n13 = n11;
            if (n14 >= 5) {
                n13 = n11 + (n14 - 2);
            }
            ++n8;
            n11 = n13;
        }
        return n11;
    }

    public static int c(b arrby) {
        int n8;
        byte[][] arrby2 = arrby.c();
        int n9 = arrby.e();
        int n10 = arrby.d();
        int n11 = n8 = 0;
        while (n8 < n10 - 1) {
            arrby = arrby2[n8];
            int n12 = 0;
            while (n12 < n9 - 1) {
                byte by = arrby[n12];
                int n13 = n12 + 1;
                int n14 = n11;
                if (by == arrby[n13]) {
                    byte[] arrby3 = arrby2[n8 + 1];
                    n14 = n11;
                    if (by == arrby3[n12]) {
                        n14 = n11;
                        if (by == arrby3[n13]) {
                            n14 = n11 + 1;
                        }
                    }
                }
                n12 = n13;
                n11 = n14;
            }
            ++n8;
        }
        return n11 * 3;
    }

    public static int d(b arrby) {
        int n8;
        byte[][] arrby2 = arrby.c();
        int n9 = arrby.e();
        int n10 = arrby.d();
        int n11 = n8 = 0;
        while (n8 < n10) {
            for (int i8 = 0; i8 < n9; ++i8) {
                int n12;
                int n13;
                block6 : {
                    block7 : {
                        arrby = arrby2[n8];
                        n13 = i8 + 6;
                        n12 = n11;
                        if (n13 >= n9) break block6;
                        n12 = n11;
                        if (arrby[i8] != 1) break block6;
                        n12 = n11;
                        if (arrby[i8 + 1] != 0) break block6;
                        n12 = n11;
                        if (arrby[i8 + 2] != 1) break block6;
                        n12 = n11;
                        if (arrby[i8 + 3] != 1) break block6;
                        n12 = n11;
                        if (arrby[i8 + 4] != 1) break block6;
                        n12 = n11;
                        if (arrby[i8 + 5] != 0) break block6;
                        n12 = n11;
                        if (arrby[n13] != 1) break block6;
                        if (d.g(arrby, i8 - 4, i8)) break block7;
                        n12 = n11;
                        if (!d.g(arrby, i8 + 7, i8 + 11)) break block6;
                    }
                    n12 = n11 + 1;
                }
                n13 = n8 + 6;
                n11 = n12;
                if (n13 >= n10) continue;
                n11 = n12;
                if (arrby2[n8][i8] != 1) continue;
                n11 = n12;
                if (arrby2[n8 + 1][i8] != 0) continue;
                n11 = n12;
                if (arrby2[n8 + 2][i8] != 1) continue;
                n11 = n12;
                if (arrby2[n8 + 3][i8] != 1) continue;
                n11 = n12;
                if (arrby2[n8 + 4][i8] != 1) continue;
                n11 = n12;
                if (arrby2[n8 + 5][i8] != 0) continue;
                n11 = n12;
                if (arrby2[n13][i8] != 1) continue;
                if (!d.h(arrby2, i8, n8 - 4, n8)) {
                    n11 = n12;
                    if (!d.h(arrby2, i8, n8 + 7, n8 + 11)) continue;
                }
                n11 = n12 + 1;
            }
            ++n8;
        }
        return n11 * 40;
    }

    public static int e(b b8) {
        int n8;
        byte[][] arrby = b8.c();
        int n9 = b8.e();
        int n10 = b8.d();
        int n11 = n8 = 0;
        while (n8 < n10) {
            byte[] arrby2 = arrby[n8];
            for (int i8 = 0; i8 < n9; ++i8) {
                int n12 = n11;
                if (arrby2[i8] == 1) {
                    n12 = n11 + 1;
                }
                n11 = n12;
            }
            ++n8;
        }
        n8 = b8.d() * b8.e();
        return Math.abs((int)((n11 << 1) - n8)) * 10 / n8 * 10;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public static boolean f(int var0, int var1_1, int var2_2) {
        var4_3 = var1_1;
        var3_4 = var2_2;
        var5_5 = var2_2;
        switch (var0) {
            default: {
                throw new IllegalArgumentException("Invalid mask pattern: ".concat(String.valueOf((int)var0)));
            }
            case 7: {
                var0 = var2_2 * var1_1 % 3 + (var2_2 + var1_1 & 1);
                ** GOTO lbl13
            }
            case 6: {
                var0 = var2_2 * var1_1;
                var0 = (var0 & 1) + var0 % 3;
lbl13: // 2 sources:
                var0 &= 1;
                ** break;
            }
            case 5: {
                var0 = var2_2 * var1_1;
                var0 = (var0 & 1) + var0 % 3;
                ** break;
            }
            case 4: {
                var3_4 = var2_2 / 2;
                var4_3 = var1_1 / 3;
            }
            case 0: {
                var5_5 = var3_4 + var4_3;
            }
            case 1: {
                var0 = var5_5 & 1;
                ** break;
            }
            case 3: {
                var0 = (var2_2 + var1_1) % 3;
                ** break;
            }
            case 2: 
        }
        var0 = var1_1 % 3;
lbl32: // 5 sources:
        if (var0 != 0) return false;
        return true;
    }

    public static boolean g(byte[] arrby, int n8, int n9) {
        n9 = Math.min((int)n9, (int)arrby.length);
        for (n8 = Math.max((int)n8, (int)0); n8 < n9; ++n8) {
            if (arrby[n8] != 1) continue;
            return false;
        }
        return true;
    }

    public static boolean h(byte[][] arrby, int n8, int n9, int n10) {
        n10 = Math.min((int)n10, (int)arrby.length);
        for (n9 = Math.max((int)n9, (int)0); n9 < n10; ++n9) {
            if (arrby[n9][n8] != 1) continue;
            return false;
        }
        return true;
    }
}

