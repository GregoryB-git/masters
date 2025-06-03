// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal.measurement;

import H2.b;
import A2.n;
import android.app.Activity;

public final class P0 extends a
{
    public final /* synthetic */ Activity s;
    public final /* synthetic */ String t;
    public final /* synthetic */ String u;
    public final /* synthetic */ J0 v;
    
    public P0(final J0 v, final Activity s, final String t, final String u) {
        this.v = v;
        this.s = s;
        this.t = t;
        this.u = u;
        v.super();
    }
    
    @Override
    public final void a() {
        ((x0)n.i(J0.d(this.v))).setCurrentScreen(H2.b.Z0(this.s), this.t, this.u, super.o);
    }
}
