// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal.measurement;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Bundle;
import android.os.IBinder;

public final class e0 extends Y implements c0
{
    public e0(final IBinder binder) {
        super(binder, "com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
    }
    
    @Override
    public final Bundle l(final Bundle bundle) {
        final Parcel n = this.n();
        a0.d(n, (Parcelable)bundle);
        final Parcel o = this.o(1, n);
        final Bundle bundle2 = (Bundle)a0.a(o, Bundle.CREATOR);
        o.recycle();
        return bundle2;
    }
}
