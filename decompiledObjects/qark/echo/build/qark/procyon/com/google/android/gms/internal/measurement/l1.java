// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal.measurement;

import A2.n;
import android.os.Bundle;

public final class l1 extends a
{
    public final /* synthetic */ Bundle s;
    public final /* synthetic */ J0 t;
    
    public l1(final J0 t, final Bundle s) {
        this.t = t;
        this.s = s;
        t.super();
    }
    
    @Override
    public final void a() {
        ((x0)n.i(J0.d(this.t))).setDefaultEventParameters(this.s);
    }
}
