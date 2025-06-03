// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal.measurement;

import A2.n;
import android.os.Bundle;

public final class O0 extends a
{
    public final /* synthetic */ String s;
    public final /* synthetic */ String t;
    public final /* synthetic */ Bundle u;
    public final /* synthetic */ J0 v;
    
    public O0(final J0 v, final String s, final String t, final Bundle u) {
        this.v = v;
        this.s = s;
        this.t = t;
        this.u = u;
        v.super();
    }
    
    @Override
    public final void a() {
        ((x0)n.i(J0.d(this.v))).clearConditionalUserProperty(this.s, this.t, this.u);
    }
}
