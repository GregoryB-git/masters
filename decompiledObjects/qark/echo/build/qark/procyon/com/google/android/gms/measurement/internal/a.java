// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.measurement.internal;

import R2.v3;

public final class a implements Runnable
{
    public final /* synthetic */ AppMeasurementDynamiteService.a o;
    public final /* synthetic */ AppMeasurementDynamiteService p;
    
    public a(final AppMeasurementDynamiteService p2, final AppMeasurementDynamiteService.a o) {
        this.p = p2;
        this.o = o;
    }
    
    @Override
    public final void run() {
        this.p.b.H().J(this.o);
    }
}
