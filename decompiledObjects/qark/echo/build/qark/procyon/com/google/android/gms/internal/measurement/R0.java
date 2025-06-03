// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal.measurement;

import A2.n;

public final class R0 extends a
{
    public final /* synthetic */ Boolean s;
    public final /* synthetic */ J0 t;
    
    public R0(final J0 t, final Boolean s) {
        this.t = t;
        this.s = s;
        t.super();
    }
    
    @Override
    public final void a() {
        if (this.s != null) {
            ((x0)n.i(J0.d(this.t))).setMeasurementEnabled(this.s, super.o);
            return;
        }
        ((x0)n.i(J0.d(this.t))).clearMeasurementEnabled(super.o);
    }
}
