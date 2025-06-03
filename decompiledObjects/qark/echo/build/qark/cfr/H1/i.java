/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.System
 *  java.lang.Throwable
 */
package H1;

import H1.a;
import H1.j;
import kotlin.jvm.internal.Intrinsics;

public final class i {
    public static final i a = new i();

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public static final void a(a var0, a var1_2) {
        if (T1.a.d(i.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(var0, "x");
            Intrinsics.checkNotNullParameter(var1_2, "b");
            var8_3 = var0.b(0);
            var9_4 = var0.b(1);
            var10_5 = var0.b(2);
            var0 = var0.a();
            var1_2 = var1_2.a();
            if (var8_3 <= 0) return;
            var2_6 = 0;
            ** GOTO lbl31
        }
        catch (Throwable var0_1) {}
        T1.a.b(var0_1, i.class);
        return;
lbl-1000: // 2 sources:
        {
            var7_11 = var4_8 + 1;
            var11_12 = var2_6 * var9_4 * var10_5 + var3_7 * var10_5 + var4_8;
            var0[var11_12] = var0[var11_12] + var1_2[var4_8];
            if (var7_11 < var10_5) {
                var4_8 = var7_11;
                continue;
            }
            do {
                if (var6_10 < var9_4) {
                    var3_7 = var6_10;
                } else {
                    do {
                        if (var5_9 >= var8_3) {
                            return;
                        }
                        var2_6 = var5_9;
lbl31: // 2 sources:
                        var5_9 = var2_6 + 1;
                    } while (var9_4 <= 0);
                    var3_7 = 0;
                }
                var6_10 = var3_7 + 1;
            } while (var10_5 <= 0);
            var4_8 = 0;
            ** while (true)
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public static final a b(a[] var0) {
        if (T1.a.d(i.class)) {
            return null;
        }
        try {
            block14 : {
                Intrinsics.checkNotNullParameter(var0, "tensors");
                var7_2 = var0[0].b(0);
                var4_3 = var0.length - 1;
                if (var4_3 >= 0) break block14;
                var1_4 = 0;
                ** GOTO lbl18
            }
            var2_5 = var1_4 = 0;
        }
        catch (Throwable var0_1) {}
        do {
            block15 : {
                var3_6 = var1_4 + 1;
                var2_5 += var0[var1_4].b(1);
                if (var3_6 <= var4_3) break block15;
                var1_4 = var2_5;
lbl18: // 2 sources:
                var9_7 = new a(new int[]{var7_2, var1_4});
                var10_8 = var9_7.a();
                if (var7_2 <= 0) return var9_7;
                var2_5 = 0;
                break;
            }
            var1_4 = var3_6;
            continue;
            break;
        } while (true);
        do {
            block13 : {
                var5_9 = var2_5 + 1;
                var3_6 = var2_5 * var1_4;
                var8_11 = var0.length - 1;
                if (var8_11 < 0) break block13;
                var4_3 = 0;
                do {
                    var6_10 = var4_3 + 1;
                    var11_12 = var0[var4_3].a();
                    var4_3 = var0[var4_3].b(1);
                    System.arraycopy((Object)var11_12, (int)(var2_5 * var4_3), (Object)var10_8, (int)var3_6, (int)var4_3);
                    var3_6 += var4_3;
                    if (var6_10 > var8_11) break;
                    var4_3 = var6_10;
                    continue;
                    break;
                } while (true);
            }
            if (var5_9 >= var7_2) {
                return var9_7;
            }
            var2_5 = var5_9;
        } while (true);
        T1.a.b(var0_1, i.class);
        return null;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public static final a c(a var0, a var1_2) {
        var20_3 = i.class;
        if (T1.a.d(i.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(var0, "x");
            Intrinsics.checkNotNullParameter(var1_2, "w");
            var14_4 = var0.b(0);
            var15_5 = var0.b(1);
            var16_6 = var0.b(2);
            var17_7 = var1_2.b(0);
        }
        catch (Throwable var0_1) {
            T1.a.b(var0_1, i.class);
            return null;
        }
        var18_8 = var15_5 - var17_7 + 1;
        var19_9 = var1_2.b(2);
        var21_10 = new a(new int[]{var14_4, var18_8, var19_9});
        var22_11 = var0.a();
        var23_12 = var21_10.a();
        var24_13 = var1_2.a();
        if (var14_4 <= 0) return var21_10;
        var4_14 = 0;
        var1_2 = var21_10;
        var0 = var20_3;
        block3 : do {
            block16 : {
                var9_21 = var4_14 + 1;
                if (var19_9 > 0) break block16;
                var20_3 = var0;
                var0 = var1_2;
                ** GOTO lbl75
            }
            var5_17 = 0;
            block4 : do {
                block17 : {
                    var10_22 = var5_17 + 1;
                    if (var18_8 > 0) break block17;
                    var20_3 = var0;
                    var0 = var1_2;
                    ** GOTO lbl70
                }
                var6_18 = 0;
                block5 : do {
                    block18 : {
                        var11_23 = var6_18 + 1;
                        var3_16 = 0.0f;
                        var2_15 = 0.0f;
                        if (var17_7 > 0) break block18;
                        var2_15 = var3_16;
                        ** GOTO lbl62
                    }
                    var7_19 = 0;
                    do {
                        block19 : {
                            var12_24 = var7_19 + 1;
                            if (var16_6 > 0) {
                                var8_20 = 0;
                                do {
                                    var13_25 = var8_20 + 1;
                                    var2_15 += var22_11[var15_5 * var16_6 * var4_14 + (var7_19 + var6_18) * var16_6 + var8_20] * var24_13[(var7_19 * var16_6 + var8_20) * var19_9 + var5_17];
                                    if (var13_25 >= var16_6) break;
                                    var8_20 = var13_25;
                                } while (true);
                            }
                            if (var12_24 < var17_7) break block19;
lbl62: // 2 sources:
                            var23_12[var18_8 * var19_9 * var4_14 + var6_18 * var19_9 + var5_17] = var2_15;
                            if (var11_23 >= var18_8) {
                                var20_3 = var0;
                                var0 = var1_2;
                            } else {
                                var6_18 = var11_23;
                                continue block5;
                            }
lbl70: // 2 sources:
                            if (var10_22 < var19_9) {
                                var5_17 = var10_22;
                                var1_2 = var0;
                                var0 = var20_3;
                                continue block4;
                            }
lbl75: // 3 sources:
                            if (var9_21 >= var14_4) {
                                return var0;
                            }
                            var4_14 = var9_21;
                            var1_2 = var0;
                            var0 = var20_3;
                            continue block3;
                        }
                        var7_19 = var12_24;
                    } while (true);
                    break;
                } while (true);
                break;
            } while (true);
            break;
        } while (true);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public static final a d(a var0, a var1_2, a var2_3) {
        if (T1.a.d(i.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(var0, "x");
            Intrinsics.checkNotNullParameter(var1_2, "w");
            Intrinsics.checkNotNullParameter(var2_3, "b");
            var7_4 = var0.b(0);
            var8_5 = var2_3.b(0);
            var0 = i.h(var0, (a)var1_2);
            var1_2 = var2_3.a();
            var2_3 = var0.a();
            if (var7_4 <= 0) return var0;
            var3_6 = 0;
            ** GOTO lbl28
        }
        catch (Throwable var0_1) {}
        T1.a.b(var0_1, i.class);
        return null;
lbl-1000: // 2 sources:
        {
            var6_9 = var4_7 + 1;
            var9_10 = var3_6 * var8_5 + var4_7;
            var2_3[var9_10] = var2_3[var9_10] + var1_2[var4_7];
            if (var6_9 < var8_5) {
                var4_7 = var6_9;
                continue;
            }
            do {
                if (var5_8 >= var7_4) {
                    return var0;
                }
                var3_6 = var5_8;
lbl28: // 2 sources:
                var5_8 = var3_6 + 1;
            } while (var8_5 <= 0);
            var4_7 = 0;
            ** while (true)
        }
    }

    public static final a e(String[] arrstring, int n8, a arrf) {
        Throwable throwable2;
        block11 : {
            a a8;
            block9 : {
                if (T1.a.d(i.class)) {
                    return null;
                }
                Intrinsics.checkNotNullParameter(arrstring, "texts");
                Intrinsics.checkNotNullParameter(arrf, "w");
                int n9 = arrstring.length;
                int n10 = arrf.b(1);
                a8 = new a(new int[]{n9, n8, n10});
                float[] arrf2 = a8.a();
                arrf = arrf.a();
                if (n9 <= 0) break block9;
                int n11 = 0;
                do {
                    int n12;
                    block10 : {
                        int[] arrn;
                        int n13;
                        n12 = n11 + 1;
                        try {
                            arrn = j.a.d(arrstring[n11], n8);
                            if (n8 <= 0) break block10;
                            n13 = 0;
                        }
                        catch (Throwable throwable2) {}
                        do {
                            int n14 = n13 + 1;
                            System.arraycopy((Object)arrf, (int)(arrn[n13] * n10), (Object)arrf2, (int)(n10 * n8 * n11 + n13 * n10), (int)n10);
                            if (n14 < n8) {
                                n13 = n14;
                                continue;
                            }
                            break block10;
                            break;
                        } while (true);
                        break block11;
                    }
                    if (n12 >= n9) {
                        return a8;
                    }
                    n11 = n12;
                } while (true);
            }
            return a8;
        }
        T1.a.b(throwable2, i.class);
        return null;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public static final void f(a var0, int var1_2) {
        if (T1.a.d(i.class)) {
            return;
        }
        Intrinsics.checkNotNullParameter(var0, "x");
        if (var1_2 >= var0.c()) {
            return;
        }
        var5_3 = var0.c();
        var2_4 = 1;
        var4_5 = 1;
        if (var1_2 >= var5_3) ** GOTO lbl18
        var3_6 = var1_2;
        var2_4 = var4_5;
        do {
            block13 : {
                var4_5 = var3_6 + 1;
                var2_4 *= var0.b(var3_6);
                if (var4_5 < var5_3) break block13;
lbl18: // 2 sources:
                var6_7 = new int[var1_2 + 1];
                if (var1_2 > 0) {
                    var3_6 = 0;
                    break;
                }
                ** GOTO lbl32
            }
            var3_6 = var4_5;
            continue;
            break;
        } while (true);
        do {
            block12 : {
                var4_5 = var3_6 + 1;
                try {
                    var6_7[var3_6] = var0.b(var3_6);
                    if (var4_5 < var1_2) break block12;
                }
                catch (Throwable var0_1) {}
lbl32: // 2 sources:
                var6_7[var1_2] = var2_4;
                var0.d(var6_7);
                return;
                T1.a.b(var0_1, i.class);
                return;
            }
            var3_6 = var4_5;
        } while (true);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public static final a g(a var0, int var1_2) {
        if (T1.a.d(i.class)) {
            return null;
        }
        Intrinsics.checkNotNullParameter(var0, "x");
        var11_3 = var0.b(0);
        var2_4 = var0.b(1);
        var12_5 = var0.b(2);
        var13_6 = var2_4 - var1_2 + 1;
        var16_7 = new a(new int[]{var11_3, var13_6, var12_5});
        var0 = var0.a();
        var17_8 = var16_7.a();
        if (var11_3 <= 0) return var16_7;
        var4_9 = 0;
        ** GOTO lbl40
lbl-1000: // 2 sources:
        {
            block15 : {
                var10_16 = var6_12 + 1;
                try {
                    var17_8[var15_18] = Math.max((float)var17_8[var15_18], (float)var0[var4_9 * var2_4 * var12_5 + var14_17 + var5_11 + var6_12 * var12_5]);
                    if (var10_16 >= var1_2) {
                        var2_4 = var3_10;
                        break block15;
                    }
                    var6_12 = var10_16;
                    continue;
                }
                catch (Throwable var0_1) {}
                T1.a.b(var0_1, i.class);
                return null;
            }
            do {
                if (var9_15 < var13_6) {
                    var3_10 = var9_15;
                } else {
                    do {
                        if (var8_14 < var12_5) {
                            var5_11 = var8_14;
                        } else {
                            do {
                                if (var7_13 >= var11_3) {
                                    return var16_7;
                                }
                                var4_9 = var7_13;
lbl40: // 2 sources:
                                var7_13 = var4_9 + 1;
                            } while (var12_5 <= 0);
                            var5_11 = 0;
                        }
                        var8_14 = var5_11 + 1;
                    } while (var13_6 <= 0);
                    var3_10 = 0;
                }
                var9_15 = var3_10 + 1;
                var14_17 = var3_10 * var12_5;
                var15_18 = var4_9 * var13_6 * var12_5 + var14_17 + var5_11;
                var17_8[var15_18] = Float.MIN_VALUE;
            } while (var1_2 <= 0);
            var6_12 = 0;
            var3_10 = var2_4;
            ** while (true)
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public static final a h(a var0, a var1_2) {
        if (T1.a.d(i.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(var0, "x");
            Intrinsics.checkNotNullParameter(var1_2, "w");
            var8_3 = var0.b(0);
            var9_4 = var1_2.b(0);
            var10_5 = var1_2.b(1);
            var12_6 = new a(new int[]{var8_3, var10_5});
            var0 = var0.a();
            var1_2 = var1_2.a();
            var13_7 = var12_6.a();
            if (var8_3 <= 0) return var12_6;
            var2_8 = 0;
            ** GOTO lbl32
        }
        catch (Throwable var0_1) {}
        T1.a.b(var0_1, i.class);
        return null;
lbl-1000: // 2 sources:
        {
            var7_13 = var4_10 + 1;
            var13_7[var11_14] = var13_7[var11_14] + var0[var2_8 * var9_4 + var4_10] * var1_2[var4_10 * var10_5 + var3_9];
            if (var7_13 < var9_4) {
                var4_10 = var7_13;
                continue;
            }
            do {
                if (var6_12 < var10_5) {
                    var3_9 = var6_12;
                } else {
                    do {
                        if (var5_11 >= var8_3) {
                            return var12_6;
                        }
                        var2_8 = var5_11;
lbl32: // 2 sources:
                        var5_11 = var2_8 + 1;
                    } while (var10_5 <= 0);
                    var3_9 = 0;
                }
                var6_12 = var3_9 + 1;
                var11_14 = var2_8 * var10_5 + var3_9;
                var13_7[var11_14] = 0.0f;
            } while (var9_4 <= 0);
            var4_10 = 0;
            ** while (true)
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final void i(a arrf) {
        int n8;
        int n9;
        block7 : {
            Throwable throwable2;
            block8 : {
                block6 : {
                    if (T1.a.d(i.class)) {
                        return;
                    }
                    try {
                        Intrinsics.checkNotNullParameter(arrf, "x");
                        arrf = arrf.a();
                        n9 = arrf.length - 1;
                        if (n9 < 0) break block6;
                        n8 = 0;
                        break block7;
                    }
                    catch (Throwable throwable2) {
                        break block8;
                    }
                }
                return;
            }
            T1.a.b(throwable2, i.class);
            return;
        }
        do {
            int n10 = n8 + 1;
            if (arrf[n8] < 0.0f) {
                arrf[n8] = 0.0f;
            }
            if (n10 > n9) {
                return;
            }
            n8 = n10;
        } while (true);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public static final void j(a var0) {
        if (T1.a.d(i.class)) {
            return;
        }
        Intrinsics.checkNotNullParameter(var0, "x");
        var4_2 = 0;
        var8_3 = var0.b(0);
        var9_4 = var0.b(1);
        var0 = var0.a();
        if (var8_3 <= 0) return;
        ** GOTO lbl33
lbl11: // 2 sources:
        var7_10 = var5_8 + 1;
        ** try [egrp 1[TRYBLOCK] [2 : 51->63)] { 
lbl13: // 1 sources:
        var0[var5_8] = var3_7 = (float)Math.exp((double)(var0[var5_8] - var1_5));
        var2_6 += var3_7;
        if (var7_10 >= var10_11) ** GOTO lbl55
        var5_8 = var7_10;
        ** GOTO lbl11
lbl-1000: // 2 sources:
        {
            block13 : {
                var5_8 = var4_2 + 1;
                try {
                    var0[var4_2] = var0[var4_2] / var2_6;
                    if (var5_8 < var10_11) {
                        var4_2 = var5_8;
                        continue;
                    }
                    break block13;
                }
lbl25: // 3 sources:
                catch (Throwable var0_1) {}
                T1.a.b(var0_1, i.class);
                return;
            }
            do {
                if (var6_9 >= var8_3) {
                    return;
                }
                var4_2 = var6_9;
lbl33: // 2 sources:
                var6_9 = var4_2 + 1;
                var10_11 = (var4_2 *= var9_4) + var9_4;
                var1_5 = Float.MIN_VALUE;
                var2_6 = Float.MIN_VALUE;
                if (var4_2 < var10_11) {
                    var5_8 = var4_2;
                    do {
                        var7_10 = var5_8 + 1;
                        var3_7 = var0[var5_8];
                        var1_5 = var2_6;
                        if (var3_7 > var2_6) {
                            var1_5 = var3_7;
                        }
                        if (var7_10 >= var10_11) break;
                        var5_8 = var7_10;
                        var2_6 = var1_5;
                    } while (true);
                }
                var2_6 = 0.0f;
                var3_7 = 0.0f;
                if (var4_2 >= var10_11) continue;
                var5_8 = var4_2;
                var2_6 = var3_7;
                ** GOTO lbl11
lbl55: // 2 sources:
            } while (var4_2 >= var10_11);
            ** while (true)
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public static final a k(a var0) {
        if (T1.a.d(i.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(var0, "x");
            var5_2 = var0.b(0);
            var6_3 = var0.b(1);
            var7_4 = new a(new int[]{var6_3, var5_2});
            var0 = var0.a();
            var8_5 = var7_4.a();
            if (var5_2 <= 0) return var7_4;
            var1_6 = 0;
            ** GOTO lbl25
        }
        catch (Throwable var0_1) {}
        T1.a.b(var0_1, i.class);
        return null;
lbl-1000: // 2 sources:
        {
            var4_9 = var2_7 + 1;
            var8_5[var2_7 * var5_2 + var1_6] = var0[var1_6 * var6_3 + var2_7];
            if (var4_9 < var6_3) {
                var2_7 = var4_9;
                continue;
            }
            do {
                if (var3_8 >= var5_2) {
                    return var7_4;
                }
                var1_6 = var3_8;
lbl25: // 2 sources:
                var3_8 = var1_6 + 1;
            } while (var6_3 <= 0);
            var2_7 = 0;
            ** while (true)
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public static final a l(a var0) {
        if (T1.a.d(i.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(var0, "x");
            var7_2 = var0.b(0);
            var8_3 = var0.b(1);
            var9_4 = var0.b(2);
            var10_5 = new a(new int[]{var9_4, var8_3, var7_2});
            var0 = var0.a();
            var11_6 = var10_5.a();
            if (var7_2 <= 0) return var10_5;
            var1_7 = 0;
            ** GOTO lbl30
        }
        catch (Throwable var0_1) {}
        T1.a.b(var0_1, i.class);
        return null;
lbl-1000: // 2 sources:
        {
            var6_12 = var3_9 + 1;
            var11_6[var3_9 * var7_2 * var8_3 + var2_8 * var7_2 + var1_7] = var0[var1_7 * var8_3 * var9_4 + var2_8 * var9_4 + var3_9];
            if (var6_12 < var9_4) {
                var3_9 = var6_12;
                continue;
            }
            do {
                if (var5_11 < var8_3) {
                    var2_8 = var5_11;
                } else {
                    do {
                        if (var4_10 >= var7_2) {
                            return var10_5;
                        }
                        var1_7 = var4_10;
lbl30: // 2 sources:
                        var4_10 = var1_7 + 1;
                    } while (var8_3 <= 0);
                    var2_8 = 0;
                }
                var5_11 = var2_8 + 1;
            } while (var9_4 <= 0);
            var3_9 = 0;
            ** while (true)
        }
    }
}

