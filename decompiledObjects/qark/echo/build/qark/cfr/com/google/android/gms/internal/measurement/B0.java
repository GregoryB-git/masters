/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  java.lang.String
 */
package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.measurement.a0;
import com.google.android.gms.internal.measurement.b0;
import com.google.android.gms.internal.measurement.y0;

public abstract class B0
extends b0
implements y0 {
    public B0() {
        super("com.google.android.gms.measurement.api.internal.IBundleReceiver");
    }

    @Override
    public final boolean n(int n8, Parcel parcel, Parcel parcel2, int n9) {
        if (n8 == 1) {
            Bundle bundle = (Bundle)a0.a(parcel, Bundle.CREATOR);
            a0.f(parcel);
            this.l(bundle);
            parcel2.writeNoException();
            return true;
        }
        return false;
    }
}

