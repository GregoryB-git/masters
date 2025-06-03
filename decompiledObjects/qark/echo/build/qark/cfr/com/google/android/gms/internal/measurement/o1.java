/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.os.Bundle
 *  java.lang.Object
 *  java.lang.String
 */
package com.google.android.gms.internal.measurement;

import A2.n;
import H2.a;
import H2.b;
import android.app.Activity;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.J0;
import com.google.android.gms.internal.measurement.x0;

public final class o1
extends J0.a {
    public final /* synthetic */ Bundle s;
    public final /* synthetic */ Activity t;
    public final /* synthetic */ J0.c u;

    public o1(J0.c c8, Bundle bundle, Activity activity) {
        this.u = c8;
        this.s = bundle;
        this.t = activity;
    }

    @Override
    public final void a() {
        Bundle bundle;
        if (this.s != null) {
            Bundle bundle2;
            bundle = bundle2 = new Bundle();
            if (this.s.containsKey("com.google.app_measurement.screen_service")) {
                Object object = this.s.get("com.google.app_measurement.screen_service");
                bundle = bundle2;
                if (object instanceof Bundle) {
                    bundle2.putBundle("com.google.app_measurement.screen_service", (Bundle)object);
                    bundle = bundle2;
                }
            }
        } else {
            bundle = null;
        }
        ((x0)n.i(J0.d(this.u.J0.this))).onActivityCreated(b.Z0((Object)this.t), bundle, this.p);
    }
}

