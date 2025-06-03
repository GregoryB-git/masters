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
import com.google.android.gms.internal.measurement.j7;

public final class i7
implements j7 {
    public static final S2 a;
    public static final S2 b;
    public static final S2 c;
    public static final S2 d;
    public static final S2 e;
    public static final S2 f;

    static {
        a3 a32 = new a3(P2.a("com.google.android.gms.measurement")).f().e();
        a = a32.d("measurement.rb.attribution.client2", false);
        b = a32.d("measurement.rb.attribution.followup1.service", false);
        c = a32.d("measurement.rb.attribution.service", false);
        d = a32.d("measurement.rb.attribution.enable_trigger_redaction", true);
        e = a32.d("measurement.rb.attribution.uuid_generation", true);
        f = a32.b("measurement.id.rb.attribution.service", 0L);
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

    @Override
    public final boolean f() {
        return (Boolean)d.f();
    }

    @Override
    public final boolean g() {
        return (Boolean)e.f();
    }
}

