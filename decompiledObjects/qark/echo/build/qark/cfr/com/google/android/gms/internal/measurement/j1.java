/*
 * Decompiled with CFR 0_124.
 */
package com.google.android.gms.internal.measurement;

import A2.n;
import com.google.android.gms.internal.measurement.J0;
import com.google.android.gms.internal.measurement.x0;

public final class j1
extends J0.a {
    public final /* synthetic */ boolean s;
    public final /* synthetic */ J0 t;

    public j1(J0 j02, boolean bl) {
        this.t = j02;
        this.s = bl;
    }

    @Override
    public final void a() {
        ((x0)n.i(J0.d(this.t))).setDataCollectionEnabled(this.s);
    }
}

