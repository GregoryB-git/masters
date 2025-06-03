/*
 * Decompiled with CFR 0_124.
 */
package com.google.android.gms.internal.measurement;

import A2.n;
import com.google.android.gms.internal.measurement.E0;
import com.google.android.gms.internal.measurement.J0;
import com.google.android.gms.internal.measurement.x0;

public final class k1
extends J0.a {
    public final /* synthetic */ J0.b s;
    public final /* synthetic */ J0 t;

    public k1(J0 j02, J0.b b8) {
        this.t = j02;
        this.s = b8;
    }

    @Override
    public final void a() {
        ((x0)n.i(J0.d(this.t))).registerOnMeasurementEventListener(this.s);
    }
}

