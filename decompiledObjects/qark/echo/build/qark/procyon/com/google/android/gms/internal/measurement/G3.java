// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal.measurement;

public abstract class G3
{
    public static volatile int d = 100;
    public int a;
    public int b;
    public boolean c;
    
    public G3() {
        this.a = G3.d;
        this.b = Integer.MAX_VALUE;
        this.c = false;
    }
    
    public static long b(final long n) {
        return -(n & 0x1L) ^ n >>> 1;
    }
    
    public static G3 c(final byte[] array, final int n, final int n2, final boolean b) {
        final F3 f3 = new F3(array, 0, n2, false, null);
        try {
            f3.a(n2);
            return f3;
        }
        catch (k4 cause) {
            throw new IllegalArgumentException(cause);
        }
    }
    
    public static int e(final int n) {
        return -(n & 0x1) ^ n >>> 1;
    }
    
    public abstract int a(final int p0);
    
    public abstract int d();
}
