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
import com.google.android.gms.internal.measurement.v7;

public final class u7
implements v7 {
    public static final S2 a;
    public static final S2 b;
    public static final S2 c;
    public static final S2 d;

    static {
        a3 a32 = new a3(P2.a("com.google.android.gms.measurement")).f().e();
        a = a32.d("measurement.collection.enable_session_stitching_token.client.dev", true);
        b = a32.d("measurement.collection.enable_session_stitching_token.first_open_fix", true);
        c = a32.d("measurement.session_stitching_token_enabled", false);
        d = a32.d("measurement.link_sst_to_sid", true);
    }

    @Override
    public final boolean a() {
        return true;
    }

    @Override
    public final boolean b() {
        return (Boolean)a.f();
    }

    @Override
    public final boolean c() {
        return (Boolean)b.f();
    }

    @Override
    public final boolean d() {
        return (Boolean)c.f();
    }
}

