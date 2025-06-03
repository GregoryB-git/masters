// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import A2.n;

public final class N0 extends a
{
    public final /* synthetic */ String s;
    public final /* synthetic */ String t;
    public final /* synthetic */ v0 u;
    public final /* synthetic */ J0 v;
    
    public N0(final J0 v, final String s, final String t, final v0 u) {
        this.v = v;
        this.s = s;
        this.t = t;
        this.u = u;
        v.super();
    }
    
    @Override
    public final void a() {
        ((x0)n.i(J0.d(this.v))).getConditionalUserProperties(this.s, this.t, this.u);
    }
    
    @Override
    public final void b() {
        this.u.l(null);
    }
}
