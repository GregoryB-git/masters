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
import com.google.android.gms.internal.measurement.m6;

public final class p6
implements m6 {
    public static final S2 a;
    public static final S2 b;
    public static final S2 c;
    public static final S2 d;
    public static final S2 e;
    public static final S2 f;
    public static final S2 g;

    static {
        a3 a32 = new a3(P2.a("com.google.android.gms.measurement")).f().e();
        a = a32.d("measurement.dma_consent.client", false);
        b = a32.d("measurement.dma_consent.client_bow_check", false);
        c = a32.d("measurement.dma_consent.service", false);
        d = a32.d("measurement.dma_consent.service_gcs_v2", false);
        e = a32.d("measurement.dma_consent.service_npa_remote_default", false);
        f = a32.d("measurement.dma_consent.service_split_batch_on_consent", false);
        g = a32.b("measurement.id.dma_consent.service", 0L);
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

    @Override
    public final boolean m() {
        return (Boolean)f.f();
    }
}

