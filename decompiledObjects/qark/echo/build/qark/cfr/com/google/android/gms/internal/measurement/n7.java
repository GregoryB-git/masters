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
import com.google.android.gms.internal.measurement.k7;

public final class n7
implements k7 {
    public static final S2 a;
    public static final S2 b;
    public static final S2 c;
    public static final S2 d;
    public static final S2 e;
    public static final S2 f;
    public static final S2 g;
    public static final S2 h;
    public static final S2 i;
    public static final S2 j;
    public static final S2 k;
    public static final S2 l;
    public static final S2 m;
    public static final S2 n;

    static {
        a3 a32 = new a3(P2.a("com.google.android.gms.measurement")).f().e();
        a = a32.d("measurement.redaction.app_instance_id", true);
        b = a32.d("measurement.redaction.client_ephemeral_aiid_generation", true);
        c = a32.d("measurement.redaction.config_redacted_fields", true);
        d = a32.d("measurement.redaction.device_info", true);
        e = a32.d("measurement.redaction.e_tag", true);
        f = a32.d("measurement.redaction.enhanced_uid", true);
        g = a32.d("measurement.redaction.populate_ephemeral_app_instance_id", true);
        h = a32.d("measurement.redaction.google_signals", true);
        i = a32.d("measurement.redaction.no_aiid_in_config_request", true);
        j = a32.d("measurement.redaction.retain_major_os_version", true);
        k = a32.d("measurement.redaction.scion_payload_generator", true);
        l = a32.d("measurement.redaction.upload_redacted_fields", true);
        m = a32.d("measurement.redaction.upload_subdomain_override", true);
        n = a32.d("measurement.redaction.user_id", true);
    }

    @Override
    public final boolean a() {
        return (Boolean)j.f();
    }

    @Override
    public final boolean b() {
        return (Boolean)k.f();
    }
}

