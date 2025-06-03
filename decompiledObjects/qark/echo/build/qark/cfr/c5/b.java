/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Character
 *  java.lang.IllegalArgumentException
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package c5;

import c5.a;
import c5.n;

public final class b
extends n {
    public static final char[] a;
    public static final char[] b;
    public static final char[] c;
    public static final char d;

    static {
        char[] arrc;
        char[] arrc2 = arrc = new char[4];
        arrc2[0] = 65;
        arrc2[1] = 66;
        arrc2[2] = 67;
        arrc2[3] = 68;
        a = arrc;
        b = new char[]{'T', 'N', '*', 'E'};
        c = new char[]{'/', ':', '+', '.'};
        d = arrc[0];
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public boolean[] c(String var1_1) {
        block16 : {
            if (var1_1.length() >= 2) break block16;
            var13_2 = new StringBuilder();
            ** GOTO lbl22
        }
        var2_3 = Character.toUpperCase((char)var1_1.charAt(0));
        var3_4 = Character.toUpperCase((char)var1_1.charAt(var1_1.length() - 1));
        var13_2 = b.a;
        var9_5 = a.a((char[])var13_2, var2_3);
        var10_6 = a.a((char[])var13_2, var3_4);
        var13_2 = b.b;
        var11_7 = a.a((char[])var13_2, var2_3);
        var12_8 = a.a((char[])var13_2, var3_4);
        if (var9_5) {
            if (var10_6 == false) throw new IllegalArgumentException("Invalid start/end guards: ".concat(var1_1));
        } else if (var11_7) {
            if (var12_8 == false) throw new IllegalArgumentException("Invalid start/end guards: ".concat(var1_1));
        } else {
            if (var10_6 != false) throw new IllegalArgumentException("Invalid start/end guards: ".concat(var1_1));
            if (var12_8 != false) throw new IllegalArgumentException("Invalid start/end guards: ".concat(var1_1));
            var13_2 = new StringBuilder();
lbl22: // 2 sources:
            var2_3 = b.d;
            var13_2.append(var2_3);
            var13_2.append(var1_1);
            var13_2.append(var2_3);
            var1_1 = var13_2.toString();
        }
        var4_9 = 20;
        for (var5_10 = 1; var5_10 < var1_1.length() - 1; ++var5_10) {
            if (!Character.isDigit((char)var1_1.charAt(var5_10)) && var1_1.charAt(var5_10) != '-' && var1_1.charAt(var5_10) != '$') {
                if (!a.a(b.c, var1_1.charAt(var5_10))) {
                    var13_2 = new StringBuilder("Cannot encode : '");
                    var13_2.append(var1_1.charAt(var5_10));
                    var13_2.append('\'');
                    throw new IllegalArgumentException(var13_2.toString());
                }
                var4_9 += 10;
                continue;
            }
            var4_9 += 9;
        }
        var13_2 = new boolean[var4_9 + (var1_1.length() - 1)];
        var5_10 = var6_11 = 0;
        while (var6_11 < var1_1.length()) {
            block15 : {
                block18 : {
                    block17 : {
                        var7_12 = Character.toUpperCase((char)var1_1.charAt(var6_11));
                        if (var6_11 == 0) break block17;
                        var4_9 = var7_12;
                        if (var6_11 != var1_1.length() - 1) break block18;
                    }
                    var4_9 = var7_12 != 42 ? (var7_12 != 69 ? (var7_12 != 78 ? (var7_12 != 84 ? (int)var7_12 : 65) : 66) : 68) : 67;
                }
                for (var7_12 = 0; var7_12 < (var14_14 = a.a).length; ++var7_12) {
                    if (var4_9 != var14_14[var7_12]) continue;
                    var7_12 = a.b[var7_12];
                    break block15;
                }
                var7_12 = 0;
            }
            var4_9 = var8_13 = 0;
            var9_5 = true;
            while (var8_13 < 7) {
                var13_2[var5_10] = var9_5;
                ++var5_10;
                if ((var7_12 >> 6 - var8_13 & 1) != 0 && var4_9 != 1) {
                    ++var4_9;
                    continue;
                }
                var9_5 ^= true;
                ++var8_13;
                var4_9 = 0;
            }
            var4_9 = var5_10;
            if (var6_11 < var1_1.length() - 1) {
                var13_2[var5_10] = false;
                var4_9 = var5_10 + 1;
            }
            ++var6_11;
            var5_10 = var4_9;
        }
        return var13_2;
    }
}

