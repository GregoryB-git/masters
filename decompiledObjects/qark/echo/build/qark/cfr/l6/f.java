/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.IllegalArgumentException
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package l6;

import l6.a;
import l6.c;
import l6.e;

public abstract class f
extends e {
    public static int a(int n8, int n9) {
        int n10 = n8;
        if (n8 < n9) {
            n10 = n9;
        }
        return n10;
    }

    public static int b(int n8, int n9) {
        int n10 = n8;
        if (n8 > n9) {
            n10 = n9;
        }
        return n10;
    }

    public static long c(long l8, long l9) {
        long l10 = l8;
        if (l8 > l9) {
            l10 = l9;
        }
        return l10;
    }

    public static int d(int n8, int n9, int n10) {
        if (n9 <= n10) {
            if (n8 < n9) {
                return n9;
            }
            if (n8 > n10) {
                return n10;
            }
            return n8;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Cannot coerce value to an empty range: maximum ");
        stringBuilder.append(n10);
        stringBuilder.append(" is less than minimum ");
        stringBuilder.append(n9);
        stringBuilder.append('.');
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    public static long e(long l8, long l9, long l10) {
        if (l9 <= l10) {
            if (l8 < l9) {
                return l9;
            }
            if (l8 > l10) {
                return l10;
            }
            return l8;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Cannot coerce value to an empty range: maximum ");
        stringBuilder.append(l10);
        stringBuilder.append(" is less than minimum ");
        stringBuilder.append(l9);
        stringBuilder.append('.');
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    public static a f(int n8, int n9) {
        return a.r.a(n8, n9, -1);
    }

    public static c g(int n8, int n9) {
        if (n9 <= Integer.MIN_VALUE) {
            return c.s.a();
        }
        return new c(n8, n9 - 1);
    }
}

