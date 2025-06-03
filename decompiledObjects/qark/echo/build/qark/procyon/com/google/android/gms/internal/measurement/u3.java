// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal.measurement;

public final class u3 extends A3
{
    public final int t;
    public final int u;
    
    public u3(final byte[] array, final int t, final int u) {
        super(array);
        q3.g(t, t + u, array.length);
        this.t = t;
        this.u = u;
    }
    
    @Override
    public final byte M(final int n) {
        return super.s[this.t + n];
    }
    
    @Override
    public final int S() {
        return this.u;
    }
    
    @Override
    public final int Y() {
        return this.t;
    }
    
    @Override
    public final byte a(final int n) {
        final int s = this.S();
        if ((s - (n + 1) | n) >= 0) {
            return super.s[this.t + n];
        }
        if (n < 0) {
            final StringBuilder sb = new StringBuilder("Index < 0: ");
            sb.append(n);
            throw new ArrayIndexOutOfBoundsException(sb.toString());
        }
        final StringBuilder sb2 = new StringBuilder("Index > length: ");
        sb2.append(n);
        sb2.append(", ");
        sb2.append(s);
        throw new ArrayIndexOutOfBoundsException(sb2.toString());
    }
}
