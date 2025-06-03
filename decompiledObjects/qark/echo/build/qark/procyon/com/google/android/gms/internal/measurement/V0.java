// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal.measurement;

import A2.n;

public final class V0 extends a
{
    public final /* synthetic */ long s;
    public final /* synthetic */ J0 t;
    
    public V0(final J0 t, final long s) {
        this.t = t;
        this.s = s;
        t.super();
    }
    
    @Override
    public final void a() {
        ((x0)n.i(J0.d(this.t))).setSessionTimeoutDuration(this.s);
    }
}
