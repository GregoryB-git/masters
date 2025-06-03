/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Character
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Map
 */
package c5;

import V4.a;
import Y4.b;
import c5.n;
import java.util.Map;

public final class l
extends n {
    public static final int[] a = new int[]{1, 1, 1, 1};
    public static final int[] b = new int[]{3, 1, 1};
    public static final int[][] c;

    static {
        int[] arrn = new int[]{1, 3, 1, 1, 3};
        int[] arrn2 = new int[]{1, 1, 3, 1, 3};
        int[] arrn3 = new int[]{3, 1, 3, 1, 1};
        int[] arrn4 = new int[]{1, 3, 3, 1, 1};
        int[] arrn5 = new int[]{1, 1, 1, 3, 3};
        int[] arrn6 = new int[]{3, 1, 1, 3, 1};
        int[] arrn7 = new int[]{1, 3, 1, 3, 1};
        c = new int[][]{{1, 1, 3, 3, 1}, {3, 1, 1, 1, 3}, arrn, {3, 3, 1, 1, 1}, arrn2, arrn3, arrn4, arrn5, arrn6, arrn7};
    }

    @Override
    public b a(String string2, a a8, int n8, int n9, Map map) {
        if (a8 == a.w) {
            return super.a(string2, a8, n8, n9, map);
        }
        throw new IllegalArgumentException("Can only encode ITF, but got ".concat(String.valueOf((Object)((Object)a8))));
    }

    @Override
    public boolean[] c(String string2) {
        int n8 = string2.length();
        if (n8 % 2 == 0) {
            if (n8 <= 80) {
                boolean[] arrbl = new boolean[n8 * 9 + 9];
                int n9 = n.b(arrbl, 0, a, true);
                for (int i8 = 0; i8 < n8; i8 += 2) {
                    int n10 = Character.digit((char)string2.charAt(i8), (int)10);
                    int n11 = Character.digit((char)string2.charAt(i8 + 1), (int)10);
                    int[] arrn = new int[10];
                    for (int i9 = 0; i9 < 5; ++i9) {
                        int n12 = i9 * 2;
                        int[][] arrn2 = c;
                        arrn[n12] = arrn2[n10][i9];
                        arrn[n12 + 1] = arrn2[n11][i9];
                    }
                    n9 += n.b(arrbl, n9, arrn, true);
                }
                n.b(arrbl, n9, b, true);
                return arrbl;
            }
            throw new IllegalArgumentException("Requested contents should be less than 80 digits long, but got ".concat(String.valueOf((int)n8)));
        }
        throw new IllegalArgumentException("The length of the input should be even");
    }
}

