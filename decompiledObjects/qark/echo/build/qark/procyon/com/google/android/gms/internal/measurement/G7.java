// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal.measurement;

public final class G7 implements D7
{
    public static final S2 a;
    public static final S2 b;
    
    static {
        final a3 e = new a3(P2.a("com.google.android.gms.measurement")).f().e();
        a = e.d("measurement.sgtm.client.dev", false);
        b = e.d("measurement.sgtm.service", false);
    }
    
    @Override
    public final boolean a() {
        return true;
    }
    
    @Override
    public final boolean b() {
        return (boolean)G7.a.f();
    }
    
    @Override
    public final boolean c() {
        return (boolean)G7.b.f();
    }
}
