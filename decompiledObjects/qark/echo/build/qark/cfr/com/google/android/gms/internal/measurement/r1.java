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
import com.google.android.gms.internal.measurement.x0;

public final class r1
extends J0.a {
    public final /* synthetic */ Activity s;
    public final /* synthetic */ J0.c t;

    public r1(J0.c c8, Activity activity) {
        this.t = c8;
        this.s = activity;
    }

    @Override
    public final void a() {
        ((x0)n.i(J0.d(this.t.J0.this))).onActivityStopped(b.Z0((Object)this.s), this.p);
    }
}

