// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package a3;

import W2.m;

public abstract class i
{
    public static byte a(final long n) {
        m.g(n >> 8 == 0L, "out of range: %s", n);
        return (byte)n;
    }
    
    public static int b(final byte b) {
        return b & 0xFF;
    }
}
