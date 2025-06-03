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
import com.google.android.gms.internal.measurement.r6;

public final class q6
implements r6 {
    public static final S2 a;
    public static final S2 b;
    public static final S2 c;

    static {
        a3 a32 = new a3(P2.a("com.google.android.gms.measurement")).f().e();
        a = a32.d("measurement.collection.event_safelist", true);
        b = a32.d("measurement.service.store_null_safelist", true);
        c = a32.d("measurement.service.store_safelist", true);
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
}

