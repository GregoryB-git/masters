// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal.measurement;

import android.os.Looper;
import android.os.Handler;

public final class t0 extends Handler
{
    public final Looper a;
    
    public t0(final Looper looper) {
        super(looper);
        this.a = Looper.getMainLooper();
    }
}
