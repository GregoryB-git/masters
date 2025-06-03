// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.measurement;

import android.content.Intent;
import android.content.Context;
import R2.v2;
import V.a;

public final class AppMeasurementReceiver extends a implements v2.a
{
    public v2 q;
    
    @Override
    public final void a(final Context context, final Intent intent) {
        a.c(context, intent);
    }
    
    public final void onReceive(final Context context, final Intent intent) {
        if (this.q == null) {
            this.q = new v2((v2.a)this);
        }
        this.q.a(context, intent);
    }
}
