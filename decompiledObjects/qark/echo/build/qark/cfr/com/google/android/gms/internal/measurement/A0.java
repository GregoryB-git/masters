/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.os.IBinder
 *  android.os.Parcel
 *  android.os.Parcelable
 *  java.lang.String
 */
package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.measurement.Y;
import com.google.android.gms.internal.measurement.a0;
import com.google.android.gms.internal.measurement.y0;

public final class A0
extends Y
implements y0 {
    public A0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IBundleReceiver");
    }

    @Override
    public final void l(Bundle bundle) {
        Parcel parcel = this.n();
        a0.d(parcel, (Parcelable)bundle);
        this.v(1, parcel);
    }
}

