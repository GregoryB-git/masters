// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal.measurement;

public final class i7 implements j7
{
    public static final S2 a;
    public static final S2 b;
    public static final S2 c;
    public static final S2 d;
    public static final S2 e;
    public static final S2 f;
    
    static {
        final a3 e2 = new a3(P2.a("com.google.android.gms.measurement")).f().e();
        a = e2.d("measurement.rb.attribution.client2", false);
        b = e2.d("measurement.rb.attribution.followup1.service", false);
        c = e2.d("measurement.rb.attribution.service", false);
        d = e2.d("measurement.rb.attribution.enable_trigger_redaction", true);
        e = e2.d("measurement.rb.attribution.uuid_generation", true);
        f = e2.b("measurement.id.rb.attribution.service", 0L);
    }
    
    @Override
    public final boolean a() {
        return true;
    }
    
    @Override
    public final boolean b() {
        return (boolean)i7.a.f();
    }
    
    @Override
    public final boolean c() {
        return (boolean)i7.b.f();
    }
    
    @Override
    public final boolean d() {
        return (boolean)i7.c.f();
    }
    
    @Override
    public final boolean f() {
        return (boolean)i7.d.f();
    }
    
    @Override
    public final boolean g() {
        return (boolean)i7.e.f();
    }
}
