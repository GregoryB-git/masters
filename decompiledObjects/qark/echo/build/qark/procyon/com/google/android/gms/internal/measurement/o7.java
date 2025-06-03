// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal.measurement;

public final class o7 implements p7
{
    public static final S2 a;
    public static final S2 b;
    
    static {
        final a3 e = new a3(P2.a("com.google.android.gms.measurement")).f().e();
        a = e.d("measurement.remove_app_background.client", false);
        b = e.b("measurement.id.remove_app_background.client", 0L);
    }
    
    @Override
    public final boolean a() {
        return true;
    }
    
    @Override
    public final boolean b() {
        return (boolean)o7.a.f();
    }
}
