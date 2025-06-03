// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package Z2;

import W2.m;

public abstract class c
{
    public static long a(final double d) {
        m.e(b(d), "not a normal value");
        final int exponent = Math.getExponent(d);
        final long n = Double.doubleToRawLongBits(d) & 0xFFFFFFFFFFFFFL;
        if (exponent == -1023) {
            return n << 1;
        }
        return n | 0x10000000000000L;
    }
    
    public static boolean b(final double d) {
        return Math.getExponent(d) <= 1023;
    }
}
