/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.ArrayIndexOutOfBoundsException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.System
 *  java.lang.Throwable
 *  java.util.Collections
 *  java.util.List
 */
package F0;

import d0.A;
import g0.z;
import h0.d;
import java.util.Collections;
import java.util.List;

public final class F {
    public final List a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final float j;
    public final int k;
    public final String l;

    public F(List list, int n8, int n9, int n10, int n11, int n12, int n13, int n14, int n15, float f8, int n16, String string2) {
        this.a = list;
        this.b = n8;
        this.c = n9;
        this.d = n10;
        this.e = n11;
        this.f = n12;
        this.g = n13;
        this.h = n14;
        this.i = n15;
        this.j = f8;
        this.k = n16;
        this.l = string2;
    }

    /*
     * Unable to fully structure code
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static F a(z var0) {
        var0.U(21);
        var20_2 = var0.G();
        var15_3 = var0.G();
        var4_4 = var0.f();
        var8_6 = var2_5 = 0;
        block11 : do {
            block21 : {
                if (var2_5 < var15_3) {
                    var0.U(1);
                    var5_8 = var0.M();
                    var3_7 = 0;
                    do {
                        if (var3_7 < var5_8) {
                            var6_9 = var0.M();
                            var8_6 += var6_9 + 4;
                            var0.U(var6_9);
                            ++var3_7;
                            continue;
                        }
                        break block21;
                        break;
                    } while (true);
                }
                var0.T(var4_4);
                var22_10 = new byte[var8_6];
                var11_13 = var7_12 = (var6_9 = (var5_8 = (var4_4 = (var3_7 = (var2_5 = (var10_11 = -1))))));
                var1_14 = 1.0f;
                var21_15 = null;
                var16_17 = var14_16 = 0;
                var9_18 = var7_12;
                var13_19 = var5_8;
                var12_20 = var2_5;
                var2_5 = var14_16;
                var5_8 = var15_3;
lbl35: // 2 sources:
                if (var2_5 < var5_8) {
                    var17_21 = var0.G() & 63;
                    var18_22 = var0.M();
                    var19_23 = 0;
                    var7_12 = var11_13;
                    var11_13 = var6_9;
                    var15_3 = var4_4;
                    var14_16 = var3_7;
                    var6_9 = var19_23;
                    var3_7 = var18_22;
                    var4_4 = var17_21;
                    do {
                        block22 : {
                            if (var6_9 >= var3_7) break block11;
                            var17_21 = var0.M();
                            var23_24 = d.a;
                            System.arraycopy((Object)var23_24, (int)0, (Object)var22_10, (int)var16_17, (int)var23_24.length);
                            System.arraycopy((Object)var0.e(), (int)var0.f(), (Object)var22_10, (int)(var16_17 += var23_24.length), (int)var17_21);
                            if (var4_4 != 33 || var6_9 != 0) break block22;
                            var21_15 = d.h(var22_10, var16_17, var16_17 + var17_21);
                            var10_11 = var21_15.k;
                            var12_20 = var21_15.l;
                            var14_16 = var21_15.f + 8;
                            var15_3 = var21_15.g + 8;
                            var13_19 = var21_15.o;
                            var11_13 = var21_15.p;
                            var9_18 = var21_15.q;
                            var1_14 = var21_15.m;
                            var7_12 = var21_15.n;
                            var21_15 = g0.d.c(var21_15.a, var21_15.b, var21_15.c, var21_15.d, var21_15.h, var21_15.i);
                        }
                        var16_17 += var17_21;
                        var0.U(var17_21);
                        ++var6_9;
                    } while (true);
                }
                if (var8_6 != 0) ** GOTO lbl77
                try {
                    var0 = Collections.emptyList();
                    return new F((List)var0, (var20_2 & 3) + 1, var10_11, var12_20, var3_7, var4_4, var13_19, var6_9, var9_18, var1_14, var11_13, (String)var21_15);
lbl77: // 1 sources:
                    var0 = Collections.singletonList((Object)var22_10);
                    return new F((List)var0, (var20_2 & 3) + 1, var10_11, var12_20, var3_7, var4_4, var13_19, var6_9, var9_18, var1_14, var11_13, (String)var21_15);
                }
                catch (ArrayIndexOutOfBoundsException var0_1) {
                    throw A.a("Error parsing HEVC config", (Throwable)var0_1);
                }
            }
            ++var2_5;
        } while (true);
        ++var2_5;
        var3_7 = var14_16;
        var4_4 = var15_3;
        var6_9 = var11_13;
        var11_13 = var7_12;
        ** GOTO lbl35
    }
}

