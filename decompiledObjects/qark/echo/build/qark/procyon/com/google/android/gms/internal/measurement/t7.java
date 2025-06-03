// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal.measurement;

public final class t7 implements q7
{
    public static final S2 a;
    
    static {
        a = new a3(P2.a("com.google.android.gms.measurement")).f().e().d("measurement.sessionid.enable_client_session_id", true);
    }
    
    @Override
    public final boolean a() {
        return true;
    }
    
    @Override
    public final boolean b() {
        return (boolean)t7.a.f();
    }
}
