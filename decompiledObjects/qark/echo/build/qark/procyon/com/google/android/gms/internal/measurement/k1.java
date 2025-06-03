// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal.measurement;

import A2.n;

public final class k1 extends a
{
    public final /* synthetic */ b s;
    public final /* synthetic */ J0 t;
    
    public k1(final J0 t, final b s) {
        this.t = t;
        this.s = s;
        t.super();
    }
    
    @Override
    public final void a() {
        ((x0)n.i(J0.d(this.t))).registerOnMeasurementEventListener(this.s);
    }
}
