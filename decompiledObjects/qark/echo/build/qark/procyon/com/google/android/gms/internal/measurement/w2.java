// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal.measurement;

import android.os.Handler;
import android.database.ContentObserver;

public final class w2 extends ContentObserver
{
    public w2(final Handler handler) {
        super((Handler)null);
    }
    
    public final void onChange(final boolean b) {
        t2.c().set(true);
    }
}
