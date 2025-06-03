// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal.measurement;

import android.os.BaseBundle;
import H2.b;
import A2.n;
import android.app.Activity;
import android.os.Bundle;

public final class o1 extends a
{
    public final /* synthetic */ Bundle s;
    public final /* synthetic */ Activity t;
    public final /* synthetic */ c u;
    
    public o1(final c u, final Bundle s, final Activity t) {
        this.u = u;
        this.s = s;
        this.t = t;
        u.o.super();
    }
    
    @Override
    public final void a() {
        Bundle bundle2;
        if (this.s != null) {
            final Bundle bundle = bundle2 = new Bundle();
            if (((BaseBundle)this.s).containsKey("com.google.app_measurement.screen_service")) {
                final Object value = ((BaseBundle)this.s).get("com.google.app_measurement.screen_service");
                bundle2 = bundle;
                if (value instanceof Bundle) {
                    bundle.putBundle("com.google.app_measurement.screen_service", (Bundle)value);
                    bundle2 = bundle;
                }
            }
        }
        else {
            bundle2 = null;
        }
        ((x0)n.i(J0.d(this.u.o))).onActivityCreated(H2.b.Z0(this.t), bundle2, super.p);
    }
}
