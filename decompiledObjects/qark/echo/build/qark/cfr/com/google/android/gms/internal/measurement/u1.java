/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  java.lang.Object
 */
package com.google.android.gms.internal.measurement;

import A2.n;
import H2.a;
import H2.b;
import android.app.Activity;
import com.google.android.gms.internal.measurement.J0;
import com.google.android.gms.internal.measurement.v0;
import com.google.android.gms.internal.measurement.x0;
import com.google.android.gms.internal.measurement.y0;

public final class u1
extends J0.a {
    public final /* synthetic */ Activity s;
    public final /* synthetic */ v0 t;
    public final /* synthetic */ J0.c u;

    public u1(J0.c c8, Activity activity, v0 v02) {
        this.u = c8;
        this.s = activity;
        this.t = v02;
    }

    @Override
    public final void a() {
        ((x0)n.i(J0.d(this.u.J0.this))).onActivitySaveInstanceState(b.Z0((Object)this.s), this.t, this.p);
    }
}

