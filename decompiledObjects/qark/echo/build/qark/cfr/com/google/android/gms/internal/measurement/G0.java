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
import com.google.android.gms.internal.measurement.E0;
import com.google.android.gms.internal.measurement.Y;
import com.google.android.gms.internal.measurement.a0;

public final class G0
extends Y
implements E0 {
    public G0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
    }

    @Override
    public final void L(String string2, String string3, Bundle bundle, long l8) {
        Parcel parcel = this.n();
        parcel.writeString(string2);
        parcel.writeString(string3);
        a0.d(parcel, (Parcelable)bundle);
        parcel.writeLong(l8);
        this.v(1, parcel);
    }

    @Override
    public final int a() {
        Parcel parcel = this.o(2, this.n());
        int n8 = parcel.readInt();
        parcel.recycle();
        return n8;
    }
}

