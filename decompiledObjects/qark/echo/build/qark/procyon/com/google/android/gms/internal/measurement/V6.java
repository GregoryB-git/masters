// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal.measurement;

public final class V6 implements W6
{
    public static final S2 a;
    public static final S2 b;
    public static final S2 c;
    public static final S2 d;
    
    static {
        final a3 e = new a3(P2.a("com.google.android.gms.measurement")).f().e();
        a = e.d("measurement.sdk.collection.enable_extend_user_property_size", true);
        b = e.d("measurement.sdk.collection.last_deep_link_referrer2", true);
        c = e.d("measurement.sdk.collection.last_deep_link_referrer_campaign2", false);
        d = e.b("measurement.id.sdk.collection.last_deep_link_referrer2", 0L);
    }
    
    @Override
    public final boolean a() {
        return (boolean)V6.c.f();
    }
}
