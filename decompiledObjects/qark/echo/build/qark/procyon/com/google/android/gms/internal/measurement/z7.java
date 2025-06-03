// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal.measurement;

public final class z7 implements w7
{
    public static final S2 a;
    public static final S2 b;
    public static final S2 c;
    public static final S2 d;
    public static final S2 e;
    public static final S2 f;
    
    static {
        final a3 e2 = new a3(P2.a("com.google.android.gms.measurement")).f().e();
        a = e2.d("measurement.client.sessions.background_sessions_enabled", true);
        b = e2.d("measurement.client.sessions.enable_fix_background_engagement", false);
        c = e2.d("measurement.client.sessions.immediate_start_enabled_foreground", true);
        d = e2.d("measurement.client.sessions.remove_expired_session_properties_enabled", true);
        e = e2.d("measurement.client.sessions.session_id_enabled", true);
        f = e2.b("measurement.id.client.sessions.enable_fix_background_engagement", 0L);
    }
    
    @Override
    public final boolean a() {
        return (boolean)z7.b.f();
    }
}
