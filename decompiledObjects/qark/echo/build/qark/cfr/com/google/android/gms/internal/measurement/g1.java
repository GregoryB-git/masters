/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  java.lang.String
 */
package com.google.android.gms.internal.measurement;

import A2.n;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.J0;
import com.google.android.gms.internal.measurement.v0;
import com.google.android.gms.internal.measurement.x0;
import com.google.android.gms.internal.measurement.y0;

public final class g1
extends J0.a {
    public final /* synthetic */ String s;
    public final /* synthetic */ v0 t;
    public final /* synthetic */ J0 u;

    public g1(J0 j02, String string2, v0 v02) {
        this.u = j02;
        this.s = string2;
        this.t = v02;
    }

    @Override
    public final void a() {
        ((x0)n.i(J0.d(this.u))).getMaxUserProperties(this.s, this.t);
    }

    @Override
    public final void b() {
        this.t.l(null);
    }
}

