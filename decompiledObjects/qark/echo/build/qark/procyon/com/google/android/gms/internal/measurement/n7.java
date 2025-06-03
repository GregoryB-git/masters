// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal.measurement;

public final class n7 implements k7
{
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
        final a3 e2 = new a3(P2.a("com.google.android.gms.measurement")).f().e();
        a = e2.d("measurement.redaction.app_instance_id", true);
        b = e2.d("measurement.redaction.client_ephemeral_aiid_generation", true);
        c = e2.d("measurement.redaction.config_redacted_fields", true);
        d = e2.d("measurement.redaction.device_info", true);
        e = e2.d("measurement.redaction.e_tag", true);
        f = e2.d("measurement.redaction.enhanced_uid", true);
        g = e2.d("measurement.redaction.populate_ephemeral_app_instance_id", true);
        h = e2.d("measurement.redaction.google_signals", true);
        i = e2.d("measurement.redaction.no_aiid_in_config_request", true);
        j = e2.d("measurement.redaction.retain_major_os_version", true);
        k = e2.d("measurement.redaction.scion_payload_generator", true);
        l = e2.d("measurement.redaction.upload_redacted_fields", true);
        m = e2.d("measurement.redaction.upload_subdomain_override", true);
        n = e2.d("measurement.redaction.user_id", true);
    }
    
    @Override
    public final boolean a() {
        return (boolean)n7.j.f();
    }
    
    @Override
    public final boolean b() {
        return (boolean)n7.k.f();
    }
}
