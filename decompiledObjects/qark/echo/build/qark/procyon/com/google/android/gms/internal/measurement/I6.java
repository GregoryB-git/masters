// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal.measurement;

public final class I6 implements F6
{
    public static final S2 a;
    public static final S2 b;
    public static final S2 c;
    
    static {
        final a3 e = new a3(P2.a("com.google.android.gms.measurement")).f().e();
        a = e.d("measurement.client.sessions.check_on_reset_and_enable2", true);
        b = e.d("measurement.client.sessions.check_on_startup", true);
        c = e.d("measurement.client.sessions.start_session_before_view_screen", true);
    }
    
    @Override
    public final boolean a() {
        return true;
    }
    
    @Override
    public final boolean b() {
        return (boolean)I6.a.f();
    }
}
