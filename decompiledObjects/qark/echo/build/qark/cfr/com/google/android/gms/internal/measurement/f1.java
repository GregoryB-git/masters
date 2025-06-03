/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 */
package com.google.android.gms.internal.measurement;

import A2.n;
import H2.a;
import H2.b;
import com.google.android.gms.internal.measurement.J0;
import com.google.android.gms.internal.measurement.x0;

public final class f1
extends J0.a {
    public final /* synthetic */ int s;
    public final /* synthetic */ String t;
    public final /* synthetic */ Object u;
    public final /* synthetic */ Object v;
    public final /* synthetic */ Object w;
    public final /* synthetic */ J0 x;

    public f1(J0 j02, boolean bl, int n8, String string2, Object object, Object object2, Object object3) {
        this.x = j02;
        this.s = 5;
        this.t = string2;
        this.u = object;
        this.v = null;
        this.w = null;
        super(false);
    }

    @Override
    public final void a() {
        ((x0)n.i(J0.d(this.x))).logHealthData(this.s, this.t, b.Z0(this.u), b.Z0(null), b.Z0(null));
    }
}

