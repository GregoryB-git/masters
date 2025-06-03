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
import com.google.android.gms.internal.measurement.R6;
import com.google.android.gms.internal.measurement.S2;
import com.google.android.gms.internal.measurement.a3;

public final class U6
implements R6 {
    public static final S2 a;
    public static final S2 b;
    public static final S2 c;

    static {
        a3 a32 = new a3(P2.a("com.google.android.gms.measurement")).f().e();
        a = a32.d("measurement.item_scoped_custom_parameters.client", true);
        b = a32.d("measurement.item_scoped_custom_parameters.service", false);
        c = a32.b("measurement.id.item_scoped_custom_parameters.service", 0L);
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
}

