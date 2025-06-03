// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal.measurement;

public final class b7 implements X6
{
    public static final S2 a;
    public static final S2 b;
    public static final S2 c;
    
    static {
        final a3 e = new a3(P2.a("com.google.android.gms.measurement")).f().e();
        a = e.b("measurement.id.lifecycle.app_in_background_parameter", 0L);
        b = e.d("measurement.lifecycle.app_backgrounded_tracking", true);
        c = e.d("measurement.lifecycle.app_in_background_parameter", false);
    }
    
    @Override
    public final boolean a() {
        return (boolean)b7.c.f();
    }
}
