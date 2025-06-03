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
import c5.g;
import c5.n;
import java.util.Map;

public class h
extends n {
    public static int f(boolean[] arrbl, int n8, int[] arrn) {
        int n9 = arrn.length;
        int n10 = 0;
        while (n10 < n9) {
            boolean bl = arrn[n10] != 0;
            arrbl[n8] = bl;
            ++n10;
            ++n8;
        }
        return 9;
    }

    public static int g(String string2, int n8) {
        int n9 = 0;
        int n10 = 1;
        for (int i8 = string2.length() - 1; i8 >= 0; --i8) {
            int n11;
            n9 += "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".indexOf((int)string2.charAt(i8)) * n10;
            n10 = n11 = n10 + 1;
            if (n11 <= n8) continue;
            n10 = 1;
        }
        return n9 % 47;
    }

    private static void h(int n8, int[] arrn) {
        for (int i8 = 0; i8 < 9; ++i8) {
            int n9 = 1;
            if ((1 << 8 - i8 & n8) == 0) {
                n9 = 0;
            }
            arrn[i8] = n9;
        }
    }

    @Override
    public b a(String string2, a a8, int n8, int n9, Map map) {
        if (a8 == a.r) {
            return super.a(string2, a8, n8, n9, map);
        }
        throw new IllegalArgumentException("Can only encode CODE_93, but got ".concat(String.valueOf((Object)((Object)a8))));
    }

    @Override
    public boolean[] c(String string2) {
        int n8 = string2.length();
        if (n8 <= 80) {
            int n9;
            int[] arrn = new int[9];
            int n10 = string2.length();
            h.h(g.b[47], arrn);
            boolean[] arrbl = new boolean[(n10 + 4) * 9 + 1];
            n10 = h.f(arrbl, 0, arrn);
            for (n9 = 0; n9 < n8; ++n9) {
                int n11 = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".indexOf((int)string2.charAt(n9));
                h.h(g.b[n11], arrn);
                n10 += h.f(arrbl, n10, arrn);
            }
            n9 = h.g(string2, 20);
            int[] arrn2 = g.b;
            h.h(arrn2[n9], arrn);
            n10 += h.f(arrbl, n10, arrn);
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(string2);
            stringBuilder.append("0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".charAt(n9));
            h.h(arrn2[h.g(stringBuilder.toString(), 15)], arrn);
            n10 += h.f(arrbl, n10, arrn);
            h.h(arrn2[47], arrn);
            arrbl[n10 + h.f((boolean[])arrbl, (int)n10, (int[])arrn)] = true;
            return arrbl;
        }
        throw new IllegalArgumentException("Requested contents should be less than 80 digits long, but got ".concat(String.valueOf((int)n8)));
    }
}

