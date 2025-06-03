// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal.measurement;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Bundle;
import android.os.IBinder;

public final class A0 extends Y implements y0
{
    public A0(final IBinder binder) {
        super(binder, "com.google.android.gms.measurement.api.internal.IBundleReceiver");
    }
    
    @Override
    public final void l(final Bundle bundle) {
        final Parcel n = this.n();
        a0.d(n, (Parcelable)bundle);
        this.v(1, n);
    }
}
