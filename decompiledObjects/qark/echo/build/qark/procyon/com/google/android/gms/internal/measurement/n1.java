// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal.measurement;

import H2.b;
import A2.n;

public final class n1 extends a
{
    public final /* synthetic */ String s;
    public final /* synthetic */ String t;
    public final /* synthetic */ Object u;
    public final /* synthetic */ boolean v;
    public final /* synthetic */ J0 w;
    
    public n1(final J0 w, final String s, final String t, final Object u, final boolean v) {
        this.w = w;
        this.s = s;
        this.t = t;
        this.u = u;
        this.v = v;
        w.super();
    }
    
    @Override
    public final void a() {
        ((x0)n.i(J0.d(this.w))).setUserProperty(this.s, this.t, H2.b.Z0(this.u), this.v, super.o);
    }
}
