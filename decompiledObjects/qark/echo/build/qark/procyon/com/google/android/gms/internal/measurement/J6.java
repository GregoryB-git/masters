// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal.measurement;

public final class J6 implements K6
{
    public static final S2 a;
    public static final S2 b;
    public static final S2 c;
    
    static {
        final a3 e = new a3(P2.a("com.google.android.gms.measurement")).f().e();
        a = e.d("measurement.gbraid_campaign.gbraid.client.dev", false);
        b = e.d("measurement.gbraid_campaign.gbraid.service", false);
        c = e.b("measurement.id.gbraid_campaign.service", 0L);
    }
    
    @Override
    public final boolean a() {
        return true;
    }
    
    @Override
    public final boolean b() {
        return (boolean)J6.a.f();
    }
    
    @Override
    public final boolean c() {
        return (boolean)J6.b.f();
    }
}
