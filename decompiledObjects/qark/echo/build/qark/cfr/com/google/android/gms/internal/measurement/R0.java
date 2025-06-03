/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Boolean
 */
package com.google.android.gms.internal.measurement;

import A2.n;
import com.google.android.gms.internal.measurement.J0;
import com.google.android.gms.internal.measurement.x0;

public final class R0
extends J0.a {
    public final /* synthetic */ Boolean s;
    public final /* synthetic */ J0 t;

    public R0(J0 j02, Boolean bl) {
        this.t = j02;
        this.s = bl;
    }

    @Override
    public final void a() {
        if (this.s != null) {
            ((x0)n.i(J0.d(this.t))).setMeasurementEnabled(this.s, this.o);
            return;
        }
        ((x0)n.i(J0.d(this.t))).clearMeasurementEnabled(this.o);
    }
}

