// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal.measurement;

public final class p6 implements m6
{
    public static final S2 a;
    public static final S2 b;
    public static final S2 c;
    public static final S2 d;
    public static final S2 e;
    public static final S2 f;
    public static final S2 g;
    
    static {
        final a3 e2 = new a3(P2.a("com.google.android.gms.measurement")).f().e();
        a = e2.d("measurement.dma_consent.client", false);
        b = e2.d("measurement.dma_consent.client_bow_check", false);
        c = e2.d("measurement.dma_consent.service", false);
        d = e2.d("measurement.dma_consent.service_gcs_v2", false);
        e = e2.d("measurement.dma_consent.service_npa_remote_default", false);
        f = e2.d("measurement.dma_consent.service_split_batch_on_consent", false);
        g = e2.b("measurement.id.dma_consent.service", 0L);
    }
    
    @Override
    public final boolean a() {
        return true;
    }
    
    @Override
    public final boolean b() {
        return (boolean)p6.a.f();
    }
    
    @Override
    public final boolean c() {
        return (boolean)p6.b.f();
    }
    
    @Override
    public final boolean d() {
        return (boolean)p6.c.f();
    }
    
    @Override
    public final boolean f() {
        return (boolean)p6.d.f();
    }
    
    @Override
    public final boolean g() {
        return (boolean)p6.e.f();
    }
    
    @Override
    public final boolean m() {
        return (boolean)p6.f.f();
    }
}
