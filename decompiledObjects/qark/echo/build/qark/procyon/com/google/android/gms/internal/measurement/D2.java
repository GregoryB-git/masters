// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal.measurement;

import android.os.Handler;
import android.database.ContentObserver;

public final class D2 extends ContentObserver
{
    public final /* synthetic */ B2 a;
    
    public D2(final B2 a, final Handler handler) {
        this.a = a;
        super((Handler)null);
    }
    
    public final void onChange(final boolean b) {
        this.a.e();
    }
}
