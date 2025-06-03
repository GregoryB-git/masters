// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import A2.n;

public final class c1 extends a
{
    public final /* synthetic */ String s;
    public final /* synthetic */ String t;
    public final /* synthetic */ boolean u;
    public final /* synthetic */ v0 v;
    public final /* synthetic */ J0 w;
    
    public c1(final J0 w, final String s, final String t, final boolean u, final v0 v) {
        this.w = w;
        this.s = s;
        this.t = t;
        this.u = u;
        this.v = v;
        w.super();
    }
    
    @Override
    public final void a() {
        ((x0)n.i(J0.d(this.w))).getUserProperties(this.s, this.t, this.u, this.v);
    }
    
    @Override
    public final void b() {
        this.v.l(null);
    }
}
