// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal.measurement;

public final class c7 implements d7
{
    public static final S2 a;
    public static final S2 b;
    public static final S2 c;
    public static final S2 d;
    public static final S2 e;
    
    static {
        final a3 e2 = new a3(P2.a("com.google.android.gms.measurement")).f().e();
        a = e2.d("measurement.test.boolean_flag", false);
        b = e2.a("measurement.test.double_flag", -3.0);
        c = e2.b("measurement.test.int_flag", -2L);
        d = e2.b("measurement.test.long_flag", -1L);
        e = e2.c("measurement.test.string_flag", "---");
    }
    
    @Override
    public final double a() {
        return (double)c7.b.f();
    }
    
    @Override
    public final long b() {
        return (long)c7.c.f();
    }
    
    @Override
    public final long c() {
        return (long)c7.d.f();
    }
    
    @Override
    public final String d() {
        return (String)c7.e.f();
    }
    
    @Override
    public final boolean f() {
        return (boolean)c7.a.f();
    }
}
