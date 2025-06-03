/*
 * Decompiled with CFR 0_124.
 */
package c5;

import c5.m;

public abstract class a
extends m {
    public static final char[] a = "0123456789-$:/.+ABCD".toCharArray();
    public static final int[] b = new int[]{3, 6, 9, 96, 18, 66, 33, 36, 48, 72, 12, 24, 69, 81, 84, 21, 26, 41, 11, 14};
    public static final char[] c = new char[]{'A', 'B', 'C', 'D'};

    public static boolean a(char[] arrc, char c8) {
        if (arrc != null) {
            int n8 = arrc.length;
            for (int i8 = 0; i8 < n8; ++i8) {
                if (arrc[i8] != c8) continue;
                return true;
            }
        }
        return false;
    }
}

