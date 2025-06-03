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
import com.google.android.gms.internal.measurement.E0;
import com.google.android.gms.internal.measurement.a0;
import com.google.android.gms.internal.measurement.b0;

public abstract class C0
extends b0
implements E0 {
    public C0() {
        super("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
    }

    @Override
    public final boolean n(int n8, Parcel parcel, Parcel parcel2, int n9) {
        if (n8 != 1) {
            if (n8 != 2) {
                return false;
            }
            n8 = this.a();
            parcel2.writeNoException();
            parcel2.writeInt(n8);
            return true;
        }
        String string2 = parcel.readString();
        String string3 = parcel.readString();
        Bundle bundle = (Bundle)a0.a(parcel, Bundle.CREATOR);
        long l8 = parcel.readLong();
        a0.f(parcel);
        this.L(string2, string3, bundle, l8);
        parcel2.writeNoException();
        return true;
    }
}

