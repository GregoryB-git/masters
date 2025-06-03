/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.CharSequence
 *  java.lang.IllegalArgumentException
 *  java.lang.Integer
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.Arrays
 */
package b5;

import b5.a;
import b5.b;
import b5.c;
import b5.f;
import b5.g;
import b5.h;
import b5.k;
import b5.l;
import b5.m;
import b5.n;
import java.util.Arrays;

public abstract class j {
    public static int a(CharSequence charSequence, int n8) {
        int n9 = charSequence.length();
        int n10 = 0;
        int n11 = 0;
        if (n8 < n9) {
            int n12 = n8;
            n8 = n11;
            block0 : do {
                char c8 = charSequence.charAt(n12);
                do {
                    n10 = n8;
                    if (!j.f(c8)) break block0;
                    n10 = n8;
                    if (n12 >= n9) break block0;
                    n11 = n8 + 1;
                    n10 = n12 + 1;
                    n8 = n11;
                    n12 = n10;
                } while (n10 >= n9);
                n8 = n11;
                n12 = n10;
            } while (true);
        }
        return n10;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static String b(String string2, l l8, V4.b b8, V4.b b9) {
        int n8;
        h h8;
        m m8;
        a a8;
        int n9;
        b b10;
        f f8;
        c c8;
        n n10;
        block10 : {
            int n11;
            block9 : {
                block8 : {
                    a8 = new a();
                    c8 = new c();
                    m8 = new m();
                    n10 = new n();
                    f8 = new f();
                    b10 = new b();
                    n9 = 0;
                    h8 = new h(string2);
                    h8.n(l8);
                    h8.l(b8, b9);
                    if (!string2.startsWith("[)>\u001e05\u001d") || !string2.endsWith("\u001e\u0004")) break block8;
                    n11 = 236;
                    break block9;
                }
                n8 = n9;
                if (!string2.startsWith("[)>\u001e06\u001d")) break block10;
                n8 = n9;
                if (!string2.endsWith("\u001e\u0004")) break block10;
                n11 = 237;
            }
            h8.r((char)n11);
            h8.m(2);
            h8.d += 7;
            n8 = n9;
        }
        while (h8.i()) {
            new g[]{a8, c8, m8, n10, f8, b10}[n8].a(h8);
            if (h8.e() < 0) continue;
            n8 = h8.e();
            h8.j();
        }
        n9 = h8.a();
        h8.p();
        int n12 = h8.g().a();
        if (n9 < n12 && n8 != 0 && n8 != 5 && n8 != 4) {
            h8.r('\u00fe');
        }
        if ((string2 = h8.b()).length() < n12) {
            string2.append('\u0081');
        }
        while (string2.length() < n12) {
            string2.append(j.o('\u0081', string2.length() + 1));
        }
        return h8.b().toString();
    }

    public static int c(float[] arrf, int[] arrn, int n8, byte[] arrby) {
        Arrays.fill((byte[])arrby, (byte)0);
        int n9 = 0;
        int n10 = n8;
        for (n8 = n9; n8 < 6; ++n8) {
            int n11;
            arrn[n8] = n11 = (int)Math.ceil((double)arrf[n8]);
            n9 = n10;
            if (n10 > n11) {
                Arrays.fill((byte[])arrby, (byte)0);
                n9 = n11;
            }
            if (n9 == n11) {
                arrby[n8] = (byte)(arrby[n8] + 1);
            }
            n10 = n9;
        }
        return n10;
    }

    public static int d(byte[] arrby) {
        int n8 = 0;
        for (int i8 = 0; i8 < 6; ++i8) {
            n8 += arrby[i8];
        }
        return n8;
    }

    public static void e(char c8) {
        String string2 = Integer.toHexString((int)c8);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("0000".substring(0, 4 - string2.length()));
        stringBuilder.append(string2);
        string2 = stringBuilder.toString();
        stringBuilder = new StringBuilder("Illegal character: ");
        stringBuilder.append(c8);
        stringBuilder.append(" (0x");
        stringBuilder.append(string2);
        stringBuilder.append(')');
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    public static boolean f(char c8) {
        if (c8 >= '0' && c8 <= '9') {
            return true;
        }
        return false;
    }

    public static boolean g(char c8) {
        if (c8 >= '' && c8 <= '\u00ff') {
            return true;
        }
        return false;
    }

    public static boolean h(char c8) {
        if (!(c8 == ' ' || c8 >= '0' && c8 <= '9' || c8 >= 'A' && c8 <= 'Z')) {
            return false;
        }
        return true;
    }

    public static boolean i(char c8) {
        if (c8 >= ' ' && c8 <= '^') {
            return true;
        }
        return false;
    }

    public static boolean j(char c8) {
        if (!(c8 == ' ' || c8 >= '0' && c8 <= '9' || c8 >= 'a' && c8 <= 'z')) {
            return false;
        }
        return true;
    }

    public static boolean k(char c8) {
        if (!(j.m(c8) || c8 == ' ' || c8 >= '0' && c8 <= '9' || c8 >= 'A' && c8 <= 'Z')) {
            return false;
        }
        return true;
    }

    public static boolean l(char c8) {
        return false;
    }

    public static boolean m(char c8) {
        if (c8 != '\r' && c8 != '*' && c8 != '>') {
            return false;
        }
        return true;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public static int n(CharSequence var0, int var1_1, int var2_2) {
        if (var1_1 >= var0.length()) {
            return var2_2;
        }
        if (var2_2 == 0) {
            v0 = var12_3 = new float[6];
            v0[0] = 0.0f;
            v0[1] = 1.0f;
            v0[2] = 1.0f;
            v0[3] = 1.0f;
            v0[4] = 1.0f;
            v0[5] = 1.25f;
        } else {
            v1 = var12_3 = new float[6];
            v1[0] = 1.0f;
            v1[1] = 2.0f;
            v1[2] = 2.0f;
            v1[3] = 2.0f;
            v1[4] = 2.0f;
            v1[5] = 2.25f;
            var12_3[var2_2] = 0.0f;
        }
        var2_2 = 0;
        do lbl-1000: // 4 sources:
        {
            if ((var5_6 = var1_1 + var2_2) == var0.length()) {
                var0 = new byte[6];
                var13_13 = new int[6];
                var1_1 = j.c(var12_3, var13_13, Integer.MAX_VALUE, var0);
                var2_2 = j.d(var0);
                if (var13_13[0] == var1_1) {
                    return 0;
                }
                if (var2_2 == 1 && var0[5] > 0) {
                    return 5;
                }
                if (var2_2 == 1 && var0[4] > 0) {
                    return 4;
                }
                if (var2_2 == 1 && var0[2] > 0) {
                    return 2;
                }
                if (var2_2 != 1) return 1;
                if (var0[3] <= 0) return 1;
                return 3;
            }
            var3_4 = var0.charAt(var5_6);
            ++var2_2;
            if (j.f(var3_4)) {
                var12_3[0] = var12_3[0] + 0.5f;
            } else if (j.g(var3_4)) {
                var12_3[0] = var4_5 = (float)Math.ceil((double)var12_3[0]);
                var12_3[0] = var4_5 + 2.0f;
            } else {
                var12_3[0] = var4_5 = (float)Math.ceil((double)var12_3[0]);
                var12_3[0] = var4_5 + 1.0f;
            }
            var12_3[1] = j.h(var3_4) != false ? var12_3[1] + 0.6666667f : (j.g(var3_4) != false ? var12_3[1] + 2.6666667f : var12_3[1] + 1.3333334f);
            var12_3[2] = j.j(var3_4) != false ? var12_3[2] + 0.6666667f : (j.g(var3_4) != false ? var12_3[2] + 2.6666667f : var12_3[2] + 1.3333334f);
            var12_3[3] = j.k(var3_4) != false ? var12_3[3] + 0.6666667f : (j.g(var3_4) != false ? var12_3[3] + 4.3333335f : var12_3[3] + 3.3333333f);
            var12_3[4] = j.i(var3_4) != false ? var12_3[4] + 0.75f : (j.g(var3_4) != false ? var12_3[4] + 4.25f : var12_3[4] + 3.25f);
            var12_3[5] = j.l(var3_4) != false ? var12_3[5] + 4.0f : var12_3[5] + 1.0f;
            if (var2_2 < 4) ** GOTO lbl-1000
            var13_13 = new int[6];
            var14_14 = new byte[6];
            j.c(var12_3, var13_13, Integer.MAX_VALUE, var14_14);
            var7_8 = j.d(var14_14);
            var5_6 = var13_13[0];
            var6_7 = var13_13[5];
            if (var5_6 < var6_7 && var5_6 < var13_13[1] && var5_6 < var13_13[2] && var5_6 < var13_13[3] && var5_6 < var13_13[4]) {
                return 0;
            }
            if (var6_7 < var5_6) return 5;
            var8_9 = var14_14[1];
            var9_10 = var14_14[2];
            var10_11 = var14_14[3];
            var11_12 = var14_14[4];
            if (var8_9 + var9_10 + var10_11 + var11_12 == 0) {
                return 5;
            }
            if (var7_8 == 1 && var11_12 > 0) {
                return 4;
            }
            if (var7_8 == 1 && var9_10 > 0) {
                return 2;
            }
            if (var7_8 == 1 && var10_11 > 0) {
                return 3;
            }
            var7_8 = var13_13[1];
            if (var7_8 + 1 >= var5_6 || var7_8 + 1 >= var6_7 || var7_8 + 1 >= var13_13[4] || var7_8 + 1 >= var13_13[2]) ** GOTO lbl-1000
            var5_6 = var13_13[3];
            if (var7_8 >= var5_6) continue;
            return 1;
        } while (var7_8 != var5_6);
        var1_1 += var2_2;
        while (++var1_1 < var0.length()) {
            var3_4 = var0.charAt(var1_1);
            if (j.m(var3_4)) {
                return 3;
            }
            if (j.k(var3_4) == false) return 1;
        }
        return 1;
    }

    public static char o(char c8, int n8) {
        if ((c8 = (char)(c8 + (n8 * 149 % 253 + 1))) > '\u00fe') {
            c8 = (char)(c8 - 254);
        }
        return c8;
    }
}

