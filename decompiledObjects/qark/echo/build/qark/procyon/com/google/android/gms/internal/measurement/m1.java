// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal.measurement;

import A2.n;
import android.os.Bundle;

public final class m1 extends a
{
    public final /* synthetic */ Long s;
    public final /* synthetic */ String t;
    public final /* synthetic */ String u;
    public final /* synthetic */ Bundle v;
    public final /* synthetic */ boolean w;
    public final /* synthetic */ boolean x;
    public final /* synthetic */ J0 y;
    
    public m1(final J0 y, final Long s, final String t, final String u, final Bundle v, final boolean w, final boolean x) {
        this.y = y;
        this.s = s;
        this.t = t;
        this.u = u;
        this.v = v;
        this.w = w;
        this.x = x;
        y.super();
    }
    
    @Override
    public final void a() {
        final Long s = this.s;
        long n;
        if (s == null) {
            n = super.o;
        }
        else {
            n = s;
        }
        ((x0)A2.n.i(J0.d(this.y))).logEvent(this.t, this.u, this.v, this.w, this.x, n);
    }
}
