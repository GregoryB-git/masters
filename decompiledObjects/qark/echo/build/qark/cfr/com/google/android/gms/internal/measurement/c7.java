/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 *  java.lang.Boolean
 *  java.lang.Double
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.String
 */
package com.google.android.gms.internal.measurement;

import android.net.Uri;
import com.google.android.gms.internal.measurement.P2;
import com.google.android.gms.internal.measurement.S2;
import com.google.android.gms.internal.measurement.a3;
import com.google.android.gms.internal.measurement.d7;

public final class c7
implements d7 {
    public static final S2 a;
    public static final S2 b;
    public static final S2 c;
    public static final S2 d;
    public static final S2 e;

    static {
        a3 a32 = new a3(P2.a("com.google.android.gms.measurement")).f().e();
        a = a32.d("measurement.test.boolean_flag", false);
        b = a32.a("measurement.test.double_flag", -3.0);
        c = a32.b("measurement.test.int_flag", -2L);
        d = a32.b("measurement.test.long_flag", -1L);
        e = a32.c("measurement.test.string_flag", "---");
    }

    @Override
    public final double a() {
        return (Double)b.f();
    }

    @Override
    public final long b() {
        return (Long)c.f();
    }

    @Override
    public final long c() {
        return (Long)d.f();
    }

    @Override
    public final String d() {
        return (String)e.f();
    }

    @Override
    public final boolean f() {
        return (Boolean)a.f();
    }
}

