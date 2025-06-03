/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 */
package com.google.android.gms.measurement;

import R2.v2;
import V.a;
import android.content.Context;
import android.content.Intent;

public final class AppMeasurementReceiver
extends a
implements v2.a {
    public v2 q;

    @Override
    public final void a(Context context, Intent intent) {
        a.c(context, intent);
    }

    public final void onReceive(Context context, Intent intent) {
        if (this.q == null) {
            this.q = new v2(this);
        }
        this.q.a(context, intent);
    }
}

