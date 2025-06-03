// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal.measurement;

public final class U6 implements R6
{
    public static final S2 a;
    public static final S2 b;
    public static final S2 c;
    
    static {
        final a3 e = new a3(P2.a("com.google.android.gms.measurement")).f().e();
        a = e.d("measurement.item_scoped_custom_parameters.client", true);
        b = e.d("measurement.item_scoped_custom_parameters.service", false);
        c = e.b("measurement.id.item_scoped_custom_parameters.service", 0L);
    }
    
    @Override
    public final boolean a() {
        return true;
    }
    
    @Override
    public final boolean b() {
        return (boolean)U6.a.f();
    }
    
    @Override
    public final boolean c() {
        return (boolean)U6.b.f();
    }
}
