// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal.measurement;

public final class B7 implements C7
{
    public static final S2 a;
    public static final S2 b;
    
    static {
        final a3 e = new a3(P2.a("com.google.android.gms.measurement")).f().e();
        a = e.d("measurement.sfmc.client", true);
        b = e.d("measurement.sfmc.service", true);
    }
    
    @Override
    public final boolean a() {
        return true;
    }
    
    @Override
    public final boolean b() {
        return (boolean)B7.a.f();
    }
    
    @Override
    public final boolean c() {
        return (boolean)B7.b.f();
    }
}
