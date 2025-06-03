// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal.measurement;

import H2.b;
import A2.n;
import android.app.Activity;

public final class u1 extends a
{
    public final /* synthetic */ Activity s;
    public final /* synthetic */ v0 t;
    public final /* synthetic */ c u;
    
    public u1(final c u, final Activity s, final v0 t) {
        this.u = u;
        this.s = s;
        this.t = t;
        u.o.super();
    }
    
    @Override
    public final void a() {
        ((x0)n.i(J0.d(this.u.o))).onActivitySaveInstanceState(H2.b.Z0(this.s), this.t, super.p);
    }
}
