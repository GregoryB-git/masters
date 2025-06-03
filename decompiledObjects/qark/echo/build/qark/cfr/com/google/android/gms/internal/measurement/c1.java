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

public final class c1
extends J0.a {
    public final /* synthetic */ String s;
    public final /* synthetic */ String t;
    public final /* synthetic */ boolean u;
    public final /* synthetic */ v0 v;
    public final /* synthetic */ J0 w;

    public c1(J0 j02, String string2, String string3, boolean bl, v0 v02) {
        this.w = j02;
        this.s = string2;
        this.t = string3;
        this.u = bl;
        this.v = v02;
    }

    @Override
    public final void a() {
        ((x0)n.i(J0.d(this.w))).getUserProperties(this.s, this.t, this.u, this.v);
    }

    @Override
    public final void b() {
        this.v.l(null);
    }
}

