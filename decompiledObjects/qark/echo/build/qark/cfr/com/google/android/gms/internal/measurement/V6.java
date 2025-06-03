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
import com.google.android.gms.internal.measurement.W6;
import com.google.android.gms.internal.measurement.a3;

public final class V6
implements W6 {
    public static final S2 a;
    public static final S2 b;
    public static final S2 c;
    public static final S2 d;

    static {
        a3 a32 = new a3(P2.a("com.google.android.gms.measurement")).f().e();
        a = a32.d("measurement.sdk.collection.enable_extend_user_property_size", true);
        b = a32.d("measurement.sdk.collection.last_deep_link_referrer2", true);
        c = a32.d("measurement.sdk.collection.last_deep_link_referrer_campaign2", false);
        d = a32.b("measurement.id.sdk.collection.last_deep_link_referrer2", 0L);
    }

    @Override
    public final boolean a() {
        return (Boolean)c.f();
    }
}

