/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 *  android.os.Looper
 */
package com.google.android.gms.internal.measurement;

import android.os.Handler;
import android.os.Looper;

public final class t0
extends Handler {
    public final Looper a = Looper.getMainLooper();

    public t0(Looper looper) {
        super(looper);
    }
}

