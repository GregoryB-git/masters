/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.String
 */
package com.google.android.gms.internal.measurement;

import android.net.Uri;
import com.google.android.gms.internal.measurement.P2;
import com.google.android.gms.internal.measurement.S2;
import com.google.android.gms.internal.measurement.a3;
import com.google.android.gms.internal.measurement.g6;

public final class j6
implements g6 {
    public static final S2 a;
    public static final S2 b;
    public static final S2 c;
    public static final S2 d;

    static {
        a3 a32 = new a3(P2.a("com.google.android.gms.measurement")).f().e();
        a = a32.d("measurement.client.consent_state_v1", true);
        b = a32.d("measurement.client.3p_consent_state_v1", true);
        c = a32.d("measurement.service.consent_state_v1_W36", true);
        d = a32.b("measurement.service.storage_consent_support_version", 203600L);
    }

    @Override
    public final long a() {
        return (Long)d.f();
    }
}

