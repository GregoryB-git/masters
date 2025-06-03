// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal.measurement;

public final class k6 implements l6
{
    public static final S2 a;
    public static final S2 b;
    
    static {
        final a3 e = new a3(P2.a("com.google.android.gms.measurement")).f().e();
        a = e.d("measurement.service.deferred_first_open", false);
        b = e.b("measurement.id.service.deferred_first_open", 0L);
    }
    
    @Override
    public final boolean a() {
        return true;
    }
    
    @Override
    public final boolean b() {
        return (boolean)k6.a.f();
    }
}
