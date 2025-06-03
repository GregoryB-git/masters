/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Double
 *  java.lang.Math
 *  java.lang.Object
 */
package Z2;

import W2.m;

public abstract class c {
    public static long a(double d8) {
        m.e(c.b(d8), "not a normal value");
        int n8 = Math.getExponent((double)d8);
        long l8 = Double.doubleToRawLongBits((double)d8) & 0xFFFFFFFFFFFFFL;
        if (n8 == -1023) {
            return l8 << 1;
        }
        return l8 | 0x10000000000000L;
    }

    public static boolean b(double d8) {
        if (Math.getExponent((double)d8) <= 1023) {
            return true;
        }
        return false;
    }
}

