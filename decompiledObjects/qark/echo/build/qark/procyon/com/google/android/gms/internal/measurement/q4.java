// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal.measurement;

public abstract class q4
{
    public static final q4 a;
    public static final q4 b;
    
    static {
        a = new p4((s4)null);
        b = new r4((u4)null);
    }
    
    public static q4 a() {
        return q4.a;
    }
    
    public static q4 c() {
        return q4.b;
    }
    
    public abstract void b(final Object p0, final Object p1, final long p2);
    
    public abstract void d(final Object p0, final long p1);
}
