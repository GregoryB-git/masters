/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 *  java.lang.Boolean
 *  java.lang.Object
 *  java.lang.String
 */
package com.google.android.gms.internal.measurement;

import android.net.Uri;
import com.google.android.gms.internal.measurement.P2;
import com.google.android.gms.internal.measurement.S2;
import com.google.android.gms.internal.measurement.a3;
import com.google.android.gms.internal.measurement.z6;

public final class C6
implements z6 {
    public static final S2 a;
    public static final S2 b;
    public static final S2 c;
    public static final S2 d;

    static {
        a3 a32 = new a3(P2.a("com.google.android.gms.measurement")).f().e();
        a = a32.d("measurement.service.audience.fix_skip_audience_with_failed_filters", true);
        b = a32.d("measurement.audience.refresh_event_count_filters_timestamp", false);
        c = a32.d("measurement.audience.use_bundle_end_timestamp_for_non_sequence_property_filters", false);
        d = a32.d("measurement.audience.use_bundle_timestamp_for_event_count_filters", false);
    }

    @Override
    public final boolean a() {
        return true;
    }

    @Override
    public final boolean b() {
        return (Boolean)b.f();
    }

    @Override
    public final boolean c() {
        return (Boolean)c.f();
    }

    @Override
    public final boolean d() {
        return (Boolean)d.f();
    }
}

