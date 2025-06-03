/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  java.lang.Long
 *  java.lang.String
 */
package com.google.android.gms.internal.measurement;

import A2.n;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.J0;
import com.google.android.gms.internal.measurement.x0;

public final class m1
extends J0.a {
    public final /* synthetic */ Long s;
    public final /* synthetic */ String t;
    public final /* synthetic */ String u;
    public final /* synthetic */ Bundle v;
    public final /* synthetic */ boolean w;
    public final /* synthetic */ boolean x;
    public final /* synthetic */ J0 y;

    public m1(J0 j02, Long l8, String string2, String string3, Bundle bundle, boolean bl, boolean bl2) {
        this.y = j02;
        this.s = l8;
        this.t = string2;
        this.u = string3;
        this.v = bundle;
        this.w = bl;
        this.x = bl2;
    }

    @Override
    public final void a() {
        Long l8 = this.s;
        long l9 = l8 == null ? this.o : l8;
        ((x0)n.i(J0.d(this.y))).logEvent(this.t, this.u, this.v, this.w, this.x, l9);
    }
}

