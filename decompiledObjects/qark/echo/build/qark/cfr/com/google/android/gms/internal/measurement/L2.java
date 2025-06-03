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
import com.google.android.gms.internal.measurement.J2;
import com.google.android.gms.internal.measurement.S2;

public final class L2
extends ContentObserver {
    public L2(J2 j22, Handler handler) {
        super(null);
    }

    public final void onChange(boolean bl) {
        S2.m();
    }
}

