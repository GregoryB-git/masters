/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.graphics.Path
 *  android.util.Log
 *  java.lang.ArrayIndexOutOfBoundsException
 *  java.lang.Float
 *  java.lang.IllegalArgumentException
 *  java.lang.Math
 *  java.lang.NumberFormatException
 *  java.lang.Object
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 *  java.lang.Throwable
 *  java.util.ArrayList
 */
package A;

import android.graphics.Path;
import android.util.Log;
import java.util.ArrayList;

public abstract class g {
    public static void a(ArrayList arrayList, char c8, float[] arrf) {
        arrayList.add((Object)new b(c8, arrf));
    }

    public static boolean b(b[] arrb, b[] arrb2) {
        if (arrb != null) {
            if (arrb2 == null) {
                return false;
            }
            if (arrb.length != arrb2.length) {
                return false;
            }
            for (int i8 = 0; i8 < arrb.length; ++i8) {
                b b8 = arrb[i8];
                char c8 = b8.a;
                b b9 = arrb2[i8];
                if (c8 == b9.a) {
                    if (b8.b.length == b9.b.length) continue;
                    return false;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    public static float[] c(float[] arrf, int n8, int n9) {
        if (n8 <= n9) {
            int n10 = arrf.length;
            if (n8 >= 0 && n8 <= n10) {
                n10 = Math.min((int)(n9 -= n8), (int)(n10 - n8));
                float[] arrf2 = new float[n9];
                System.arraycopy((Object)arrf, (int)n8, (Object)arrf2, (int)0, (int)n10);
                return arrf2;
            }
            throw new ArrayIndexOutOfBoundsException();
        }
        throw new IllegalArgumentException();
    }

    public static b[] d(String string2) {
        if (string2 == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int n8 = 1;
        int n9 = 0;
        while (n8 < string2.length()) {
            String string3 = string2.substring(n9, n8 = g.i(string2, n8)).trim();
            if (string3.length() > 0) {
                float[] arrf = g.h(string3);
                g.a(arrayList, string3.charAt(0), arrf);
            }
            n9 = n8++;
        }
        if (n8 - n9 == 1 && n9 < string2.length()) {
            g.a(arrayList, string2.charAt(n9), new float[0]);
        }
        return (b[])arrayList.toArray((Object[])new b[arrayList.size()]);
    }

    public static Path e(String string2) {
        Path path = new Path();
        b[] arrb = g.d(string2);
        if (arrb != null) {
            try {
                b.e(arrb, path);
                return path;
            }
            catch (RuntimeException runtimeException) {
                arrb = new b[]();
                arrb.append("Error in parsing ");
                arrb.append(string2);
                throw new RuntimeException(arrb.toString(), (Throwable)runtimeException);
            }
        }
        return null;
    }

    public static b[] f(b[] arrb) {
        if (arrb == null) {
            return null;
        }
        b[] arrb2 = new b[arrb.length];
        for (int i8 = 0; i8 < arrb.length; ++i8) {
            arrb2[i8] = new b(arrb[i8]);
        }
        return arrb2;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public static void g(String var0, int var1_1, a var2_2) {
        var2_2.b = false;
        var5_6 = var3_5 = (var7_4 = '\u0000');
        var6_7 = var3_5;
        var3_5 = var7_4;
        for (var4_3 = var1_1; var4_3 < var0.length(); ++var4_3) {
            block8 : {
                block7 : {
                    block9 : {
                        block6 : {
                            var7_4 = var0.charAt(var4_3);
                            if (var7_4 == ' ') break block6;
                            if (var7_4 == 'E' || var7_4 == 'e') break block7;
                            switch (var7_4) {
                                default: {
                                    ** break;
                                }
                                case '.': {
                                    if (var6_7 != '\u0000') ** GOTO lbl19
                                    var3_5 = '\u0000';
                                    var6_7 = '\u0001';
                                    break block8;
                                }
                                case '-': {
                                    if (var4_3 == var1_1 || var3_5 != '\u0000') break block9;
lbl19: // 2 sources:
                                    var2_2.b = true;
                                }
                                case ',': 
                            }
                        }
                        var3_5 = '\u0000';
                        var5_6 = '\u0001';
                        break block8;
                    }
                    var3_5 = '\u0000';
                    break block8;
                }
                var3_5 = '\u0001';
            }
            if (var5_6 != '\u0000') break;
        }
        var2_2.a = var4_3;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive exception aggregation
     */
    public static float[] h(String var0) {
        block6 : {
            block7 : {
                block5 : {
                    if (var0.charAt(0) == 'z' || var0.charAt(0) == 'Z') break block7;
                    try {
                        var6_1 = new float[var0.length()];
                        var7_2 = new a();
                        var5_4 = var0.length();
                        var1_5 = 1;
                        var3_6 = 0;
lbl8: // 3 sources:
                        if (var1_5 >= var5_4) ** GOTO lbl23
                        g.g(var0, var1_5, var7_2);
                        var4_8 = var7_2.a;
                        var2_7 = var3_6;
                        if (var1_5 >= var4_8) break block5;
                        var6_1[var3_6] = Float.parseFloat((String)var0.substring(var1_5, var4_8));
                    }
                    catch (NumberFormatException var7_3) {
                        ** continue;
                    }
                    var2_7 = var3_6 + 1;
                }
                if (!var7_2.b) break block6;
                var1_5 = var4_8;
                var3_6 = var2_7;
                ** GOTO lbl8
lbl23: // 1 sources:
                var6_1 = g.c(var6_1, 0, var3_6);
                return var6_1;
lbl25: // 1 sources:
                do {
                    var6_1 = new float[]();
                    var6_1.append("error in parsing \"");
                    var6_1.append(var0);
                    var6_1.append("\"");
                    throw new RuntimeException(var6_1.toString(), (Throwable)var7_3);
                    break;
                } while (true);
            }
            return new float[0];
        }
        var1_5 = var4_8 + 1;
        var3_6 = var2_7;
        ** GOTO lbl8
    }

    public static int i(String string2, int n8) {
        while (n8 < string2.length()) {
            char c8 = string2.charAt(n8);
            if (((c8 - 65) * (c8 - 90) <= 0 || (c8 - 97) * (c8 - 122) <= 0) && c8 != 'e' && c8 != 'E') {
                return n8;
            }
            ++n8;
        }
        return n8;
    }

    public static void j(b[] arrb, b[] arrb2) {
        for (int i8 = 0; i8 < arrb2.length; ++i8) {
            float[] arrf;
            arrb[i8].a = arrb2[i8].a;
            for (int i9 = 0; i9 < (arrf = arrb2[i8].b).length; ++i9) {
                arrb[i8].b[i9] = arrf[i9];
            }
        }
    }

    public static class a {
        public int a;
        public boolean b;
    }

    public static class b {
        public char a;
        public float[] b;

        public b(char c8, float[] arrf) {
            this.a = c8;
            this.b = arrf;
        }

        public b(b arrf) {
            this.a = arrf.a;
            arrf = arrf.b;
            this.b = g.c(arrf, 0, arrf.length);
        }

        /*
         * Unable to fully structure code
         * Enabled aggressive block sorting
         * Lifted jumps to return sites
         */
        public static void a(Path var0, float[] var1_1, char var2_2, char var3_3, float[] var4_4) {
            var14_5 = var1_1[0];
            var13_6 = var1_1[1];
            var12_7 = var1_1[2];
            var11_8 = var1_1[3];
            var10_9 = var1_1[4];
            var9_10 = var1_1[5];
            var5_11 = var14_5;
            var6_12 = var13_6;
            var7_13 = var12_7;
            var8_14 = var11_8;
            switch (var3_3) {
                default: {
                    var8_14 = var11_8;
                    var7_13 = var12_7;
                    var6_12 = var13_6;
                    var5_11 = var14_5;
                    ** GOTO lbl23
                }
                case 90: 
                case 122: {
                    var0.close();
                    var0.moveTo(var10_9, var9_10);
                    var7_13 = var5_11 = var10_9;
                    var8_14 = var6_12 = var9_10;
                }
lbl23: // 3 sources:
                case 76: 
                case 77: 
                case 84: 
                case 108: 
                case 109: 
                case 116: {
                    var15_15 = 2;
                    ** break;
                }
                case 81: 
                case 83: 
                case 113: 
                case 115: {
                    var15_15 = 4;
                    var5_11 = var14_5;
                    var6_12 = var13_6;
                    var7_13 = var12_7;
                    var8_14 = var11_8;
                    ** break;
                }
                case 72: 
                case 86: 
                case 104: 
                case 118: {
                    var15_15 = 1;
                    var5_11 = var14_5;
                    var6_12 = var13_6;
                    var7_13 = var12_7;
                    var8_14 = var11_8;
                    ** break;
                }
                case 67: 
                case 99: {
                    var15_15 = 6;
                    break;
                }
                case 65: 
                case 97: {
                    var15_15 = 7;
                }
            }
            var5_11 = var14_5;
            var6_12 = var13_6;
            var7_13 = var12_7;
            var8_14 = var11_8;
            ** break;
lbl50: // 4 sources:
            var17_16 = 0;
            var16_17 = var2_2;
            var11_8 = var9_10;
            var12_7 = var10_9;
            var2_2 = var17_16;
            do {
                block47 : {
                    block52 : {
                        block23 : {
                            block24 : {
                                block25 : {
                                    block26 : {
                                        block27 : {
                                            block28 : {
                                                block40 : {
                                                    block50 : {
                                                        block41 : {
                                                            block29 : {
                                                                block30 : {
                                                                    block31 : {
                                                                        block44 : {
                                                                            block32 : {
                                                                                block33 : {
                                                                                    block43 : {
                                                                                        block51 : {
                                                                                            block34 : {
                                                                                                block49 : {
                                                                                                    block48 : {
                                                                                                        block35 : {
                                                                                                            block46 : {
                                                                                                                block45 : {
                                                                                                                    block36 : {
                                                                                                                        block37 : {
                                                                                                                            block42 : {
                                                                                                                                block38 : {
                                                                                                                                    block39 : {
                                                                                                                                        var17_16 = var3_3;
                                                                                                                                        if (var2_2 >= var4_4.length) {
                                                                                                                                            var1_1[0] = var5_11;
                                                                                                                                            var1_1[1] = var6_12;
                                                                                                                                            var1_1[2] = var7_13;
                                                                                                                                            var1_1[3] = var8_14;
                                                                                                                                            var1_1[4] = var12_7;
                                                                                                                                            var1_1[5] = var11_8;
                                                                                                                                            return;
                                                                                                                                        }
                                                                                                                                        if (var17_16 == 65) break block23;
                                                                                                                                        if (var17_16 == 67) break block24;
                                                                                                                                        if (var17_16 == 72) break block25;
                                                                                                                                        if (var17_16 == 81) break block26;
                                                                                                                                        if (var17_16 == 86) break block27;
                                                                                                                                        if (var17_16 == 97) break block28;
                                                                                                                                        if (var17_16 == 99) break block29;
                                                                                                                                        if (var17_16 == 104) break block30;
                                                                                                                                        if (var17_16 == 113) break block31;
                                                                                                                                        if (var17_16 == 118) break block32;
                                                                                                                                        if (var17_16 == 76) break block33;
                                                                                                                                        if (var17_16 == 77) break block34;
                                                                                                                                        if (var17_16 == 83) break block35;
                                                                                                                                        if (var17_16 == 84) break block36;
                                                                                                                                        if (var17_16 == 108) break block37;
                                                                                                                                        if (var17_16 == 109) break block38;
                                                                                                                                        if (var17_16 == 115) break block39;
                                                                                                                                        if (var17_16 == 116) {
                                                                                                                                            if (var16_17 != 113 && var16_17 != 116 && var16_17 != 81 && var16_17 != 84) {
                                                                                                                                                var8_14 = 0.0f;
                                                                                                                                                var7_13 = 0.0f;
                                                                                                                                            } else {
                                                                                                                                                var7_13 = var5_11 - var7_13;
                                                                                                                                                var8_14 = var6_12 - var8_14;
                                                                                                                                            }
                                                                                                                                            var9_10 = var4_4[var2_2];
                                                                                                                                            var16_17 = var2_2 + 1;
                                                                                                                                            var0.rQuadTo(var7_13, var8_14, var9_10, var4_4[var16_17]);
                                                                                                                                            var9_10 = var5_11 + var4_4[var2_2];
                                                                                                                                            var10_9 = var6_12 + var4_4[var16_17];
                                                                                                                                            var8_14 += var6_12;
                                                                                                                                            var7_13 += var5_11;
                                                                                                                                            var6_12 = var10_9;
                                                                                                                                            var5_11 = var9_10;
                                                                                                                                        }
                                                                                                                                        break block40;
                                                                                                                                    }
                                                                                                                                    if (var16_17 != 99 && var16_17 != 115 && var16_17 != 67 && var16_17 != 83) {
                                                                                                                                        var7_13 = 0.0f;
                                                                                                                                        var8_14 = 0.0f;
                                                                                                                                    } else {
                                                                                                                                        var8_14 = var6_12 - var8_14;
                                                                                                                                        var7_13 = var5_11 - var7_13;
                                                                                                                                    }
                                                                                                                                    var9_10 = var4_4[var2_2];
                                                                                                                                    var16_17 = var2_2 + 1;
                                                                                                                                    var10_9 = var4_4[var16_17];
                                                                                                                                    var17_16 = var2_2 + 2;
                                                                                                                                    var13_6 = var4_4[var17_16];
                                                                                                                                    var18_18 = var2_2 + 3;
                                                                                                                                    var0.rCubicTo(var7_13, var8_14, var9_10, var10_9, var13_6, var4_4[var18_18]);
                                                                                                                                    var10_9 = var4_4[var2_2] + var5_11;
                                                                                                                                    var7_13 = var4_4[var16_17] + var6_12;
                                                                                                                                    var8_14 = var5_11 + var4_4[var17_16];
                                                                                                                                    var9_10 = var4_4[var18_18];
                                                                                                                                    var5_11 = var10_9;
                                                                                                                                    break block41;
                                                                                                                                }
                                                                                                                                var9_10 = var4_4[var2_2];
                                                                                                                                var5_11 += var9_10;
                                                                                                                                var10_9 = var4_4[var2_2 + 1];
                                                                                                                                var6_12 += var10_9;
                                                                                                                                if (var2_2 <= 0) break block42;
                                                                                                                                var0.rLineTo(var9_10, var10_9);
                                                                                                                                break block40;
                                                                                                                            }
                                                                                                                            var0.rMoveTo(var9_10, var10_9);
                                                                                                                            break block43;
                                                                                                                        }
                                                                                                                        var9_10 = var4_4[var2_2];
                                                                                                                        var16_17 = var2_2 + 1;
                                                                                                                        var0.rLineTo(var9_10, var4_4[var16_17]);
                                                                                                                        var5_11 += var4_4[var2_2];
                                                                                                                        var9_10 = var4_4[var16_17];
                                                                                                                        break block44;
                                                                                                                    }
                                                                                                                    if (var16_17 == 113 || var16_17 == 116 || var16_17 == 81) break block45;
                                                                                                                    var10_9 = var6_12;
                                                                                                                    var9_10 = var5_11;
                                                                                                                    if (var16_17 != 84) break block46;
                                                                                                                }
                                                                                                                var9_10 = var5_11 * 2.0f - var7_13;
                                                                                                                var10_9 = var6_12 * 2.0f - var8_14;
                                                                                                            }
                                                                                                            var5_11 = var4_4[var2_2];
                                                                                                            var16_17 = var2_2 + 1;
                                                                                                            var0.quadTo(var9_10, var10_9, var5_11, var4_4[var16_17]);
                                                                                                            var5_11 = var4_4[var2_2];
                                                                                                            var6_12 = var4_4[var16_17];
                                                                                                            var8_14 = var10_9;
                                                                                                            var7_13 = var9_10;
                                                                                                            var9_10 = var11_8;
                                                                                                            break block47;
                                                                                                        }
                                                                                                        if (var16_17 == 99 || var16_17 == 115 || var16_17 == 67) break block48;
                                                                                                        var9_10 = var6_12;
                                                                                                        var10_9 = var5_11;
                                                                                                        if (var16_17 != 83) break block49;
                                                                                                    }
                                                                                                    var10_9 = var5_11 * 2.0f - var7_13;
                                                                                                    var9_10 = var6_12 * 2.0f - var8_14;
                                                                                                }
                                                                                                var5_11 = var4_4[var2_2];
                                                                                                var16_17 = var2_2 + 1;
                                                                                                var6_12 = var4_4[var16_17];
                                                                                                var17_16 = var2_2 + 2;
                                                                                                var7_13 = var4_4[var17_16];
                                                                                                var18_18 = var2_2 + 3;
                                                                                                var0.cubicTo(var10_9, var9_10, var5_11, var6_12, var7_13, var4_4[var18_18]);
                                                                                                var5_11 = var4_4[var2_2];
                                                                                                var7_13 = var4_4[var16_17];
                                                                                                var9_10 = var4_4[var17_16];
                                                                                                var6_12 = var4_4[var18_18];
                                                                                                break block50;
                                                                                            }
                                                                                            var5_11 = var4_4[var2_2];
                                                                                            var6_12 = var4_4[var2_2 + 1];
                                                                                            if (var2_2 <= 0) break block51;
                                                                                            var0.lineTo(var5_11, var6_12);
                                                                                            break block40;
                                                                                        }
                                                                                        var0.moveTo(var5_11, var6_12);
                                                                                    }
                                                                                    var9_10 = var6_12;
                                                                                    var12_7 = var5_11;
                                                                                    break block47;
                                                                                }
                                                                                var5_11 = var4_4[var2_2];
                                                                                var16_17 = var2_2 + 1;
                                                                                var0.lineTo(var5_11, var4_4[var16_17]);
                                                                                var5_11 = var4_4[var2_2];
                                                                                var6_12 = var4_4[var16_17];
                                                                                break block40;
                                                                            }
                                                                            var0.rLineTo(0.0f, var4_4[var2_2]);
                                                                            var9_10 = var4_4[var2_2];
                                                                        }
                                                                        var6_12 += var9_10;
                                                                        break block40;
                                                                    }
                                                                    var7_13 = var4_4[var2_2];
                                                                    var16_17 = var2_2 + 1;
                                                                    var8_14 = var4_4[var16_17];
                                                                    var17_16 = var2_2 + 2;
                                                                    var9_10 = var4_4[var17_16];
                                                                    var18_18 = var2_2 + 3;
                                                                    var0.rQuadTo(var7_13, var8_14, var9_10, var4_4[var18_18]);
                                                                    var10_9 = var4_4[var2_2] + var5_11;
                                                                    var7_13 = var4_4[var16_17] + var6_12;
                                                                    var8_14 = var5_11 + var4_4[var17_16];
                                                                    var9_10 = var4_4[var18_18];
                                                                    var5_11 = var10_9;
                                                                    break block41;
                                                                }
                                                                var0.rLineTo(var4_4[var2_2], 0.0f);
                                                                var5_11 += var4_4[var2_2];
                                                                break block40;
                                                            }
                                                            var7_13 = var4_4[var2_2];
                                                            var8_14 = var4_4[var2_2 + 1];
                                                            var16_17 = var2_2 + 2;
                                                            var9_10 = var4_4[var16_17];
                                                            var17_16 = var2_2 + 3;
                                                            var10_9 = var4_4[var17_16];
                                                            var18_18 = var2_2 + 4;
                                                            var13_6 = var4_4[var18_18];
                                                            var19_19 = var2_2 + 5;
                                                            var0.rCubicTo(var7_13, var8_14, var9_10, var10_9, var13_6, var4_4[var19_19]);
                                                            var10_9 = var4_4[var16_17] + var5_11;
                                                            var7_13 = var4_4[var17_16] + var6_12;
                                                            var8_14 = var5_11 + var4_4[var18_18];
                                                            var9_10 = var4_4[var19_19];
                                                            var5_11 = var10_9;
                                                        }
                                                        var6_12 += var9_10;
                                                        var9_10 = var8_14;
                                                    }
                                                    var8_14 = var7_13;
                                                    var7_13 = var5_11;
                                                    var5_11 = var9_10;
                                                }
                                                var9_10 = var11_8;
                                                break block47;
                                            }
                                            var16_17 = var2_2 + 5;
                                            var7_13 = var4_4[var16_17];
                                            var17_16 = var2_2 + 6;
                                            var8_14 = var4_4[var17_16];
                                            var9_10 = var4_4[var2_2];
                                            var10_9 = var4_4[var2_2 + 1];
                                            var13_6 = var4_4[var2_2 + 2];
                                            var20_20 = var4_4[var2_2 + 3] != 0.0f;
                                            var21_21 = var4_4[var2_2 + 4] != 0.0f;
                                            b.c(var0, var5_11, var6_12, var7_13 + var5_11, var8_14 + var6_12, var9_10, var10_9, var13_6, var20_20, var21_21);
                                            var5_11 += var4_4[var16_17];
                                            var6_12 += var4_4[var17_16];
                                            break block52;
                                        }
                                        var16_17 = var2_2;
                                        var0.lineTo(var5_11, var4_4[var16_17]);
                                        var6_12 = var4_4[var16_17];
                                        var9_10 = var11_8;
                                        break block47;
                                    }
                                    var16_17 = var2_2;
                                    var5_11 = var4_4[var16_17];
                                    var17_16 = var16_17 + 1;
                                    var6_12 = var4_4[var17_16];
                                    var18_18 = var16_17 + 2;
                                    var7_13 = var4_4[var18_18];
                                    var19_19 = var16_17 + 3;
                                    var0.quadTo(var5_11, var6_12, var7_13, var4_4[var19_19]);
                                    var7_13 = var4_4[var16_17];
                                    var8_14 = var4_4[var17_16];
                                    var5_11 = var4_4[var18_18];
                                    var6_12 = var4_4[var19_19];
                                    var9_10 = var11_8;
                                    break block47;
                                }
                                var16_17 = var2_2;
                                var0.lineTo(var4_4[var16_17], var6_12);
                                var5_11 = var4_4[var16_17];
                                var9_10 = var11_8;
                                break block47;
                            }
                            var16_17 = var2_2;
                            var5_11 = var4_4[var16_17];
                            var6_12 = var4_4[var16_17 + 1];
                            var17_16 = var16_17 + 2;
                            var7_13 = var4_4[var17_16];
                            var18_18 = var16_17 + 3;
                            var8_14 = var4_4[var18_18];
                            var19_19 = var16_17 + 4;
                            var9_10 = var4_4[var19_19];
                            var0.cubicTo(var5_11, var6_12, var7_13, var8_14, var9_10, var4_4[var16_17 += 5]);
                            var5_11 = var4_4[var19_19];
                            var6_12 = var4_4[var16_17];
                            var7_13 = var4_4[var17_16];
                            var8_14 = var4_4[var18_18];
                            var9_10 = var11_8;
                            break block47;
                        }
                        var16_17 = var2_2;
                        var17_16 = var16_17 + 5;
                        var7_13 = var4_4[var17_16];
                        var18_18 = var16_17 + 6;
                        var8_14 = var4_4[var18_18];
                        var9_10 = var4_4[var16_17];
                        var10_9 = var4_4[var16_17 + 1];
                        var13_6 = var4_4[var16_17 + 2];
                        var20_20 = var4_4[var16_17 + 3] != 0.0f;
                        var21_21 = var4_4[var16_17 + 4] != 0.0f;
                        b.c(var0, var5_11, var6_12, var7_13, var8_14, var9_10, var10_9, var13_6, var20_20, var21_21);
                        var5_11 = var4_4[var17_16];
                        var6_12 = var4_4[var18_18];
                    }
                    var8_14 = var6_12;
                    var7_13 = var5_11;
                    var9_10 = var11_8;
                }
                var2_2 += var15_15;
                var16_17 = var3_3;
                var11_8 = var9_10;
            } while (true);
        }

        public static void b(Path path, double d8, double d9, double d10, double d11, double d12, double d13, double d14, double d15, double d16) {
            int n8 = (int)Math.ceil((double)Math.abs((double)(d16 * 4.0 / 3.141592653589793)));
            double d17 = Math.cos((double)d14);
            double d18 = Math.sin((double)d14);
            double d19 = Math.cos((double)d15);
            double d20 = Math.sin((double)d15);
            d14 = - d10;
            double d21 = d14 * d17;
            double d22 = d11 * d18;
            double d23 = d11 * d17;
            double d24 = d16 / (double)n8;
            double d25 = d20 * (d14 *= d18) + d19 * d23;
            d19 = d21 * d20 - d22 * d19;
            int n9 = 0;
            d20 = d15;
            d16 = d13;
            d11 = d14;
            d15 = d12;
            d14 = d24;
            d13 = d18;
            d12 = d17;
            do {
                d17 = d10;
                if (n9 >= n8) break;
                d24 = d20 + d14;
                double d26 = Math.sin((double)d24);
                double d27 = Math.cos((double)d24);
                double d28 = d8 + d17 * d12 * d27 - d22 * d26;
                d17 = d9 + d17 * d13 * d27 + d23 * d26;
                d18 = d21 * d26 - d22 * d27;
                d26 = d26 * d11 + d27 * d23;
                d20 = d24 - d20;
                d27 = Math.tan((double)(d20 / 2.0));
                d20 = Math.sin((double)d20) * (Math.sqrt((double)(d27 * 3.0 * d27 + 4.0)) - 1.0) / 3.0;
                path.rLineTo(0.0f, 0.0f);
                path.cubicTo((float)(d15 + d19 * d20), (float)(d16 + d25 * d20), (float)(d28 - d20 * d18), (float)(d17 - d20 * d26), (float)d28, (float)d17);
                ++n9;
                d15 = d28;
                d20 = d24;
                d25 = d26;
                d19 = d18;
                d16 = d17;
            } while (true);
        }

        public static void c(Path path, float f8, float f9, float f10, float f11, float f12, float f13, float f14, boolean bl, boolean bl2) {
            double d8 = Math.toRadians((double)f14);
            double d9 = Math.cos((double)d8);
            double d10 = Math.sin((double)d8);
            double d11 = f8;
            double d12 = f9;
            double d13 = f12;
            double d14 = (d11 * d9 + d12 * d10) / d13;
            double d15 = - f8;
            double d16 = f13;
            double d17 = (d15 * d10 + d12 * d9) / d16;
            double d18 = f10;
            d15 = f11;
            double d19 = (d18 * d9 + d15 * d10) / d13;
            double d20 = ((double)(- f10) * d10 + d15 * d9) / d16;
            double d21 = d14 - d19;
            double d22 = d17 - d20;
            d18 = (d14 + d19) / 2.0;
            d15 = (d17 + d20) / 2.0;
            double d23 = d21 * d21 + d22 * d22;
            if (d23 == 0.0) {
                Log.w((String)"PathParser", (String)" Points are coincident");
                return;
            }
            double d24 = 1.0 / d23 - 0.25;
            if (d24 < 0.0) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Points are too far apart ");
                stringBuilder.append(d23);
                Log.w((String)"PathParser", (String)stringBuilder.toString());
                float f15 = (float)(Math.sqrt((double)d23) / 1.99999);
                b.c(path, f8, f9, f10, f11, f12 * f15, f13 * f15, f14, bl, bl2);
                return;
            }
            d23 = Math.sqrt((double)d24);
            d21 *= d23;
            d22 = d23 * d22;
            if (bl == bl2) {
                d18 -= d22;
                d15 += d21;
            } else {
                d18 += d22;
                d15 -= d21;
            }
            d22 = Math.atan2((double)(d17 - d15), (double)(d14 - d18));
            d17 = Math.atan2((double)(d20 - d15), (double)(d19 - d18)) - d22;
            double d25 = d17 DCMPL 0.0;
            bl = d25 >= 0;
            d14 = d17;
            if (bl2 != bl) {
                d14 = d25 > 0 ? d17 - 6.283185307179586 : d17 + 6.283185307179586;
            }
            b.b(path, d18 * d9 - d15 * d10, (d18 *= d13) * d10 + (d15 *= d16) * d9, d13, d16, d11, d12, d8, d22, d14);
        }

        public static void e(b[] arrb, Path path) {
            float[] arrf = new float[6];
            char c8 = 'm';
            for (int i8 = 0; i8 < arrb.length; ++i8) {
                b b8 = arrb[i8];
                b.a(path, arrf, c8, b8.a, b8.b);
                c8 = arrb[i8].a;
            }
        }

        public void d(b b8, b b9, float f8) {
            float[] arrf;
            this.a = b8.a;
            for (int i8 = 0; i8 < (arrf = b8.b).length; ++i8) {
                this.b[i8] = arrf[i8] * (1.0f - f8) + b9.b[i8] * f8;
            }
        }
    }

}

