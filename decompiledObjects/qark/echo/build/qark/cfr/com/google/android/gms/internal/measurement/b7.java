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
import com.google.android.gms.internal.measurement.X6;
import com.google.android.gms.internal.measurement.a3;

public final class b7
implements X6 {
    public static final S2 a;
    public static final S2 b;
    public static final S2 c;

    static {
        a3 a32 = new a3(P2.a("com.google.android.gms.measurement")).f().e();
        a = a32.b("measurement.id.lifecycle.app_in_background_parameter", 0L);
        b = a32.d("measurement.lifecycle.app_backgrounded_tracking", true);
        c = a32.d("measurement.lifecycle.app_in_background_parameter", false);
    }

    @Override
    public final boolean a() {
        return (Boolean)c.f();
    }
}

