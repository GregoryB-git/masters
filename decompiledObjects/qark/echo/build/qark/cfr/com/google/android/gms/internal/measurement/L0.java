/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
package com.google.android.gms.internal.measurement;

import A2.n;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.J0;
import com.google.android.gms.internal.measurement.x0;

public final class L0
extends J0.a {
    public final /* synthetic */ Bundle s;
    public final /* synthetic */ J0 t;

    public L0(J0 j02, Bundle bundle) {
        this.t = j02;
        this.s = bundle;
    }

    @Override
    public final void a() {
        ((x0)n.i(J0.d(this.t))).setConditionalUserProperty(this.s, this.o);
    }
}

