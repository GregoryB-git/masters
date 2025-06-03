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

public final class n1
extends J0.a {
    public final /* synthetic */ String s;
    public final /* synthetic */ String t;
    public final /* synthetic */ Object u;
    public final /* synthetic */ boolean v;
    public final /* synthetic */ J0 w;

    public n1(J0 j02, String string2, String string3, Object object, boolean bl) {
        this.w = j02;
        this.s = string2;
        this.t = string3;
        this.u = object;
        this.v = bl;
    }

    @Override
    public final void a() {
        ((x0)n.i(J0.d(this.w))).setUserProperty(this.s, this.t, b.Z0(this.u), this.v, this.o);
    }
}

