/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  java.lang.Object
 *  java.lang.String
 */
package com.google.android.gms.internal.measurement;

import A2.n;
import H2.a;
import H2.b;
import android.app.Activity;
import com.google.android.gms.internal.measurement.J0;
import com.google.android.gms.internal.measurement.x0;

public final class P0
extends J0.a {
    public final /* synthetic */ Activity s;
    public final /* synthetic */ String t;
    public final /* synthetic */ String u;
    public final /* synthetic */ J0 v;

    public P0(J0 j02, Activity activity, String string2, String string3) {
        this.v = j02;
        this.s = activity;
        this.t = string2;
        this.u = string3;
    }

    @Override
    public final void a() {
        ((x0)n.i(J0.d(this.v))).setCurrentScreen(b.Z0((Object)this.s), this.t, this.u, this.o);
    }
}

