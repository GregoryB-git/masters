// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal.measurement;

public final class z3
{
    public final J3 a;
    public final byte[] b;
    
    public z3(final int n) {
        final byte[] b = new byte[n];
        this.b = b;
        this.a = J3.D(b);
    }
    
    public final q3 a() {
        this.a.E();
        return new A3(this.b);
    }
    
    public final J3 b() {
        return this.a;
    }
}
