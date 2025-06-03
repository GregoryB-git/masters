// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal.measurement;

import H2.b;
import A2.n;
import android.app.Activity;

public final class q1 extends a
{
    public final /* synthetic */ Activity s;
    public final /* synthetic */ c t;
    
    public q1(final c t, final Activity s) {
        this.t = t;
        this.s = s;
        t.o.super();
    }
    
    @Override
    public final void a() {
        ((x0)n.i(J0.d(this.t.o))).onActivityStarted(H2.b.Z0(this.s), super.p);
    }
}
