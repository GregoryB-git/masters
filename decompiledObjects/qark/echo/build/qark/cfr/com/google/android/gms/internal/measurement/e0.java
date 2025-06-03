/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.os.IBinder
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  java.lang.String
 */
package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.measurement.Y;
import com.google.android.gms.internal.measurement.a0;
import com.google.android.gms.internal.measurement.c0;

public final class e0
extends Y
implements c0 {
    public e0(IBinder iBinder) {
        super(iBinder, "com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
    }

    @Override
    public final Bundle l(Bundle bundle) {
        Parcel parcel = this.n();
        a0.d(parcel, (Parcelable)bundle);
        bundle = this.o(1, parcel);
        parcel = (Bundle)a0.a((Parcel)bundle, Bundle.CREATOR);
        bundle.recycle();
        return parcel;
    }
}

