package com.google.android.gms.internal.p002firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import n6.b;

/* loaded from: classes.dex */
public final class zzahz implements Parcelable.Creator<zzaia> {
    @Override // android.os.Parcelable.Creator
    public final zzaia createFromParcel(Parcel parcel) {
        int u10 = b.u(parcel);
        while (parcel.dataPosition() < u10) {
            b.t(parcel.readInt(), parcel);
        }
        b.j(u10, parcel);
        return new zzaia();
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzaia[] newArray(int i10) {
        return new zzaia[i10];
    }
}
