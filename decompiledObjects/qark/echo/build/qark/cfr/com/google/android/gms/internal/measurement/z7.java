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
import com.google.android.gms.internal.measurement.w7;

public final class z7
implements w7 {
    public static final S2 a;
    public static final S2 b;
    public static final S2 c;
    public static final S2 d;
    public static final S2 e;
    public static final S2 f;

    static {
        a3 a32 = new a3(P2.a("com.google.android.gms.measurement")).f().e();
        a = a32.d("measurement.client.sessions.background_sessions_enabled", true);
        b = a32.d("measurement.client.sessions.enable_fix_background_engagement", false);
        c = a32.d("measurement.client.sessions.immediate_start_enabled_foreground", true);
        d = a32.d("measurement.client.sessions.remove_expired_session_properties_enabled", true);
        e = a32.d("measurement.client.sessions.session_id_enabled", true);
        f = a32.b("measurement.id.client.sessions.enable_fix_background_engagement", 0L);
    }

    @Override
    public final boolean a() {
        return (Boolean)b.f();
    }
}

