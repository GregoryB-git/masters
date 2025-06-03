/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 */
package a3;

import W2.m;

public abstract class b {
    public static char a(long l8) {
        char c8 = (char)l8;
        boolean bl = (long)c8 == l8;
        m.g(bl, "Out of range: %s", l8);
        return c8;
    }

    public static boolean b(char[] arrc, char c8) {
        int n8 = arrc.length;
        for (int i8 = 0; i8 < n8; ++i8) {
            if (arrc[i8] != c8) continue;
            return true;
        }
        return false;
    }

    public static char c(byte by, byte by2) {
        return (char)(by << 8 | by2 & 255);
    }
}

