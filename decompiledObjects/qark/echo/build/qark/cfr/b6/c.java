/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.String
 */
package b6;

public abstract class c {
    public static final int a(int n8, int n9, int n10) {
        return c.c(c.c(n8, n10) - c.c(n9, n10), n10);
    }

    public static final int b(int n8, int n9, int n10) {
        if (n10 > 0) {
            if (n8 >= n9) {
                return n9;
            }
            return n9 - c.a(n9, n8, n10);
        }
        if (n10 < 0) {
            if (n8 <= n9) {
                return n9;
            }
            return n9 + c.a(n8, n9, - n10);
        }
        throw new IllegalArgumentException("Step is zero.");
    }

    public static final int c(int n8, int n9) {
        if ((n8 %= n9) >= 0) {
            return n8;
        }
        return n8 + n9;
    }
}

