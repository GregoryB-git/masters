/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.CharSequence
 *  java.lang.Character
 *  java.lang.Object
 *  java.lang.System
 */
package c5;

import V4.d;
import c5.m;

public abstract class p
extends m {
    public static final int[] a = new int[]{1, 1, 1};
    public static final int[] b = new int[]{1, 1, 1, 1, 1};
    public static final int[] c = new int[]{1, 1, 1, 1, 1, 1};
    public static final int[][] d;
    public static final int[][] e;

    static {
        int[][] arrarrn = new int[][]{{3, 2, 1, 1}, {2, 2, 2, 1}, {2, 1, 2, 2}, {1, 4, 1, 1}, {1, 1, 3, 2}, {1, 2, 3, 1}, {1, 1, 1, 4}, {1, 3, 1, 2}, {1, 2, 1, 3}, {3, 1, 1, 2}};
        d = arrarrn;
        int[][] arrarrn2 = new int[20][];
        e = arrarrn2;
        System.arraycopy((Object)arrarrn, (int)0, (Object)arrarrn2, (int)0, (int)10);
        for (int i8 = 10; i8 < 20; ++i8) {
            arrarrn = d[i8 - 10];
            arrarrn2 = new int[arrarrn.length];
            for (int i9 = 0; i9 < arrarrn.length; ++i9) {
                arrarrn2[i9] = arrarrn[arrarrn.length - i9 - 1];
            }
            p.e[i8] = arrarrn2;
        }
    }

    public static boolean a(CharSequence charSequence) {
        int n8 = charSequence.length();
        if (n8 == 0) {
            return false;
        }
        int n9 = Character.digit((char)charSequence.charAt(--n8), (int)10);
        if (p.b(charSequence.subSequence(0, n8)) == n9) {
            return true;
        }
        return false;
    }

    public static int b(CharSequence charSequence) {
        int n8;
        int n9 = charSequence.length();
        int n10 = 0;
        for (n8 = n9 - 1; n8 >= 0; n8 -= 2) {
            int n11 = charSequence.charAt(n8) - 48;
            if (n11 >= 0 && n11 <= 9) {
                n10 += n11;
                continue;
            }
            throw d.a();
        }
        n10 *= 3;
        for (n8 = n9 - 2; n8 >= 0; n8 -= 2) {
            n9 = charSequence.charAt(n8) - 48;
            if (n9 >= 0 && n9 <= 9) {
                n10 += n9;
                continue;
            }
            throw d.a();
        }
        return (1000 - n10) % 10;
    }
}

