// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal.measurement;

public abstract class F5
{
    public abstract int a(final int p0, final byte[] p1, final int p2, final int p3);
    
    public abstract int b(final CharSequence p0, final byte[] p1, final int p2, final int p3);
    
    public abstract String c(final byte[] p0, final int p1, final int p2);
    
    public final boolean d(final byte[] array, final int n, final int n2) {
        return this.a(0, array, n, n2) == 0;
    }
}
