/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Bundle
 *  android.util.Log
 *  java.lang.Exception
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.String
 */
package com.google.android.gms.internal.measurement;

import A2.n;
import H2.a;
import H2.b;
import R2.H2;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.internal.measurement.H0;
import com.google.android.gms.internal.measurement.J0;
import com.google.android.gms.internal.measurement.x0;

public final class M0
extends J0.a {
    public final /* synthetic */ String s;
    public final /* synthetic */ String t;
    public final /* synthetic */ Context u;
    public final /* synthetic */ Bundle v;
    public final /* synthetic */ J0 w;

    public M0(J0 j02, String string2, String string3, Context context, Bundle bundle) {
        this.w = j02;
        this.s = string2;
        this.t = string3;
        this.u = context;
        this.v = bundle;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void a() {
        Object object;
        String string2;
        Object object2;
        String string3;
        block4 : {
            block3 : {
                try {
                    if (!J0.y(this.w, this.s, this.t)) break block3;
                    object2 = this.t;
                    string2 = this.s;
                    string3 = J0.A(this.w);
                    break block4;
                }
                catch (Exception exception) {}
                J0.q(this.w, exception, true, false);
                return;
            }
            string3 = null;
            object = object2 = string3;
            string2 = object2;
            object2 = object;
        }
        n.i((Object)this.u);
        object = this.w;
        J0.o((J0)object, object.c(this.u, true));
        if (J0.d(this.w) == null) {
            Log.w((String)J0.A(this.w), (String)"Failed to connect to measurement client.");
            return;
        }
        int n8 = DynamiteModule.a(this.u, "com.google.android.gms.measurement.dynamite");
        int n9 = DynamiteModule.b(this.u, "com.google.android.gms.measurement.dynamite");
        int n10 = Math.max((int)n8, (int)n9);
        boolean bl = n9 < n8;
        object2 = new H0(82001L, n10, bl, string3, string2, (String)object2, this.v, H2.a(this.u));
        ((x0)n.i(J0.d(this.w))).initialize(b.Z0((Object)this.u), (H0)object2, this.o);
    }
}

