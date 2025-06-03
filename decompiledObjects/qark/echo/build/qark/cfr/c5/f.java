/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.Map
 */
package c5;

import V4.a;
import Y4.b;
import c5.e;
import c5.n;
import java.util.Map;

public final class f
extends n {
    public static void f(int n8, int[] arrn) {
        for (int i8 = 0; i8 < 9; ++i8) {
            int n9 = 1;
            if ((1 << 8 - i8 & n8) != 0) {
                n9 = 2;
            }
            arrn[i8] = n9;
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public static String g(String var0) {
        var5_1 = var0.length();
        var7_2 = new StringBuilder();
        var4_3 = 0;
        while (var4_3 < var5_1) {
            block18 : {
                block19 : {
                    block10 : {
                        block12 : {
                            block13 : {
                                block11 : {
                                    block15 : {
                                        block17 : {
                                            block16 : {
                                                block14 : {
                                                    var2_5 = var0.charAt(var4_3);
                                                    if (var2_5 == '\u0000') break block10;
                                                    var1_4 = var2_5;
                                                    if (var2_5 == ' ') break block11;
                                                    if (var2_5 == '@') break block12;
                                                    if (var2_5 == '`') break block13;
                                                    var1_4 = var2_5;
                                                    if (var2_5 == '-') break block11;
                                                    var1_4 = var2_5;
                                                    if (var2_5 == '.') break block11;
                                                    if (var2_5 > '\u001a') break block14;
                                                    var7_2.append('$');
                                                    var3_6 = var2_5 + 64;
                                                    break block15;
                                                }
                                                if (var2_5 >= ' ') break block16;
                                                var7_2.append('%');
                                                var3_6 = var2_5 + 38;
                                                break block15;
                                            }
                                            if (var2_5 <= ',' || var2_5 == '/' || var2_5 == ':') break block17;
                                            if (var2_5 <= '9') ** GOTO lbl-1000
                                            if (var2_5 <= '?') {
                                                var7_2.append('%');
                                                var3_6 = var2_5 + 11;
                                            } else if (var2_5 <= 'Z') lbl-1000: // 2 sources:
                                            {
                                                var3_6 = var2_5;
                                            } else if (var2_5 <= '_') {
                                                var7_2.append('%');
                                                var3_6 = var2_5 - 16;
                                            } else if (var2_5 <= 'z') {
                                                var7_2.append('+');
                                                var3_6 = var2_5 - 32;
                                            } else {
                                                if (var2_5 > '') {
                                                    var6_7 = new StringBuilder("Requested content contains a non-encodable character: '");
                                                    var6_7.append(var0.charAt(var4_3));
                                                    var6_7.append("'");
                                                    throw new IllegalArgumentException(var6_7.toString());
                                                }
                                                var7_2.append('%');
                                                var3_6 = var2_5 - 43;
                                            }
                                            break block15;
                                        }
                                        var7_2.append('/');
                                        var3_6 = var2_5 + 32;
                                    }
                                    var1_4 = (char)var3_6;
                                }
                                var7_2.append(var1_4);
                                break block18;
                            }
                            var6_7 = "%W";
                            break block19;
                        }
                        var6_7 = "%V";
                        break block19;
                    }
                    var6_7 = "%U";
                }
                var7_2.append(var6_7);
            }
            ++var4_3;
        }
        return var7_2.toString();
    }

    @Override
    public b a(String string2, a a8, int n8, int n9, Map map) {
        if (a8 == a.q) {
            return super.a(string2, a8, n8, n9, map);
        }
        throw new IllegalArgumentException("Can only encode CODE_39, but got ".concat(String.valueOf((Object)((Object)a8))));
    }

    @Override
    public boolean[] c(String stringBuilder) {
        int n8 = stringBuilder.length();
        if (n8 <= 80) {
            int n9;
            int n10;
            Object object;
            int n11 = 0;
            do {
                n9 = n8;
                object = stringBuilder;
                if (n11 >= n8) break;
                if ("0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".indexOf((int)stringBuilder.charAt(n11)) < 0) {
                    object = f.g((String)stringBuilder);
                    n9 = object.length();
                    if (n9 <= 80) break;
                    stringBuilder = new StringBuilder("Requested contents should be less than 80 digits long, but got ");
                    stringBuilder.append(n9);
                    stringBuilder.append(" (extended full ASCII mode)");
                    throw new IllegalArgumentException(stringBuilder.toString());
                }
                ++n11;
            } while (true);
            stringBuilder = new int[9];
            n8 = n9 + 25;
            for (n11 = 0; n11 < n9; ++n11) {
                n10 = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".indexOf((int)object.charAt(n11));
                f.f(e.a[n10], (int[])stringBuilder);
                for (n10 = 0; n10 < 9; ++n10) {
                    n8 += stringBuilder[n10];
                }
            }
            boolean[] arrbl = new boolean[n8];
            f.f(148, (int[])stringBuilder);
            n11 = n.b(arrbl, 0, (int[])stringBuilder, true);
            int[] arrn = new int[]{1};
            n8 = n11 + n.b(arrbl, n11, arrn, false);
            for (n11 = 0; n11 < n9; ++n11) {
                n10 = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".indexOf((int)object.charAt(n11));
                f.f(e.a[n10], (int[])stringBuilder);
                n8 += n.b(arrbl, n8, (int[])stringBuilder, true);
                n8 += n.b(arrbl, n8, arrn, false);
            }
            f.f(148, (int[])stringBuilder);
            n.b(arrbl, n8, (int[])stringBuilder, true);
            return arrbl;
        }
        throw new IllegalArgumentException("Requested contents should be less than 80 digits long, but got ".concat(String.valueOf((int)n8)));
    }
}

