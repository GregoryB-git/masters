// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal.measurement;

public final class H7 implements I7
{
    public static final S2 a;
    
    static {
        a = new a3(P2.a("com.google.android.gms.measurement")).f().e().d("measurement.integration.disable_firebase_instance_id", false);
    }
    
    @Override
    public final boolean a() {
        return true;
    }
    
    @Override
    public final boolean b() {
        return (boolean)H7.a.f();
    }
}
