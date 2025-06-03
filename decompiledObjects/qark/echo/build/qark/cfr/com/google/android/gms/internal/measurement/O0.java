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
import com.google.android.gms.internal.measurement.x0;

public final class O0
extends J0.a {
    public final /* synthetic */ String s;
    public final /* synthetic */ String t;
    public final /* synthetic */ Bundle u;
    public final /* synthetic */ J0 v;

    public O0(J0 j02, String string2, String string3, Bundle bundle) {
        this.v = j02;
        this.s = string2;
        this.t = string3;
        this.u = bundle;
    }

    @Override
    public final void a() {
        ((x0)n.i(J0.d(this.v))).clearConditionalUserProperty(this.s, this.t, this.u);
    }
}

