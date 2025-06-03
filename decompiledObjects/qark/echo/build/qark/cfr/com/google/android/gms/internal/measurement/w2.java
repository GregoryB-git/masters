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
import com.google.android.gms.internal.measurement.t2;

public final class w2
extends ContentObserver {
    public w2(Handler handler) {
        super(null);
    }

    public final void onChange(boolean bl) {
        t2.c().set(true);
    }
}

