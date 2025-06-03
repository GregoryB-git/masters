// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal.measurement;

public final class C6 implements z6
{
    public static final S2 a;
    public static final S2 b;
    public static final S2 c;
    public static final S2 d;
    
    static {
        final a3 e = new a3(P2.a("com.google.android.gms.measurement")).f().e();
        a = e.d("measurement.service.audience.fix_skip_audience_with_failed_filters", true);
        b = e.d("measurement.audience.refresh_event_count_filters_timestamp", false);
        c = e.d("measurement.audience.use_bundle_end_timestamp_for_non_sequence_property_filters", false);
        d = e.d("measurement.audience.use_bundle_timestamp_for_event_count_filters", false);
    }
    
    @Override
    public final boolean a() {
        return true;
    }
    
    @Override
    public final boolean b() {
        return (boolean)C6.b.f();
    }
    
    @Override
    public final boolean c() {
        return (boolean)C6.c.f();
    }
    
    @Override
    public final boolean d() {
        return (boolean)C6.d.f();
    }
}
