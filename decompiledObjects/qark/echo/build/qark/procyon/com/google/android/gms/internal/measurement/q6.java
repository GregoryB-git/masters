// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal.measurement;

public final class q6 implements r6
{
    public static final S2 a;
    public static final S2 b;
    public static final S2 c;
    
    static {
        final a3 e = new a3(P2.a("com.google.android.gms.measurement")).f().e();
        a = e.d("measurement.collection.event_safelist", true);
        b = e.d("measurement.service.store_null_safelist", true);
        c = e.d("measurement.service.store_safelist", true);
    }
    
    @Override
    public final boolean a() {
        return true;
    }
    
    @Override
    public final boolean b() {
        return (boolean)q6.b.f();
    }
    
    @Override
    public final boolean c() {
        return (boolean)q6.c.f();
    }
}
