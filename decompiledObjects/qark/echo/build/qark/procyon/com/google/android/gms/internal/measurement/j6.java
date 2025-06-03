// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal.measurement;

public final class j6 implements g6
{
    public static final S2 a;
    public static final S2 b;
    public static final S2 c;
    public static final S2 d;
    
    static {
        final a3 e = new a3(P2.a("com.google.android.gms.measurement")).f().e();
        a = e.d("measurement.client.consent_state_v1", true);
        b = e.d("measurement.client.3p_consent_state_v1", true);
        c = e.d("measurement.service.consent_state_v1_W36", true);
        d = e.b("measurement.service.storage_consent_support_version", 203600L);
    }
    
    @Override
    public final long a() {
        return (long)j6.d.f();
    }
}
