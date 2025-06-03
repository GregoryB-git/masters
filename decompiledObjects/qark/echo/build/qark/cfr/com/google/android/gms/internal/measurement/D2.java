/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.database.ContentObserver
 *  android.os.Handler
 */
package com.google.android.gms.internal.measurement;

import android.database.ContentObserver;
import android.os.Handler;
import com.google.android.gms.internal.measurement.B2;

public final class D2
extends ContentObserver {
    public final /* synthetic */ B2 a;

    public D2(B2 b22, Handler handler) {
        this.a = b22;
        super(null);
    }

    public final void onChange(boolean bl) {
        this.a.e();
    }
}

