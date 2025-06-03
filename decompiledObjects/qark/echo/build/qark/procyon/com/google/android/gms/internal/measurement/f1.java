// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal.measurement;

import H2.b;
import A2.n;

public final class f1 extends a
{
    public final /* synthetic */ int s;
    public final /* synthetic */ String t;
    public final /* synthetic */ Object u;
    public final /* synthetic */ Object v;
    public final /* synthetic */ Object w;
    public final /* synthetic */ J0 x;
    
    public f1(final J0 x, final boolean b, final int n, final String t, final Object u, final Object o, final Object o2) {
        this.x = x;
        this.s = 5;
        this.t = t;
        this.u = u;
        this.v = null;
        this.w = null;
        x.super(false);
    }
    
    @Override
    public final void a() {
        ((x0)n.i(J0.d(this.x))).logHealthData(this.s, this.t, H2.b.Z0(this.u), H2.b.Z0(null), H2.b.Z0(null));
    }
}
