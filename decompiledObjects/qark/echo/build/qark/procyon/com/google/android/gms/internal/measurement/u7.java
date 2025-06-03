// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal.measurement;

public final class u7 implements v7
{
    public static final S2 a;
    public static final S2 b;
    public static final S2 c;
    public static final S2 d;
    
    static {
        final a3 e = new a3(P2.a("com.google.android.gms.measurement")).f().e();
        a = e.d("measurement.collection.enable_session_stitching_token.client.dev", true);
        b = e.d("measurement.collection.enable_session_stitching_token.first_open_fix", true);
        c = e.d("measurement.session_stitching_token_enabled", false);
        d = e.d("measurement.link_sst_to_sid", true);
    }
    
    @Override
    public final boolean a() {
        return true;
    }
    
    @Override
    public final boolean b() {
        return (boolean)u7.a.f();
    }
    
    @Override
    public final boolean c() {
        return (boolean)u7.b.f();
    }
    
    @Override
    public final boolean d() {
        return (boolean)u7.c.f();
    }
}
