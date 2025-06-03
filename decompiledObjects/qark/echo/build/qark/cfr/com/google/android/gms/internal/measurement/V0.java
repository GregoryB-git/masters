/*
 * Decompiled with CFR 0_124.
 */
package com.google.android.gms.internal.measurement;

import A2.n;
import com.google.android.gms.internal.measurement.J0;
import com.google.android.gms.internal.measurement.x0;

public final class V0
extends J0.a {
    public final /* synthetic */ long s;
    public final /* synthetic */ J0 t;

    public V0(J0 j02, long l8) {
        this.t = j02;
        this.s = l8;
    }

    @Override
    public final void a() {
        ((x0)n.i(J0.d(this.t))).setSessionTimeoutDuration(this.s);
    }
}

