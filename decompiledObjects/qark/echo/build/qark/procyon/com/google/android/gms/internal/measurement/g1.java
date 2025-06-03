// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import A2.n;

public final class g1 extends a
{
    public final /* synthetic */ String s;
    public final /* synthetic */ v0 t;
    public final /* synthetic */ J0 u;
    
    public g1(final J0 u, final String s, final v0 t) {
        this.u = u;
        this.s = s;
        this.t = t;
        u.super();
    }
    
    @Override
    public final void a() {
        ((x0)n.i(J0.d(this.u))).getMaxUserProperties(this.s, this.t);
    }
    
    @Override
    public final void b() {
        this.t.l(null);
    }
}
