package com.google.android.gms.internal.auth;

import android.os.Parcel;
import android.os.Parcelable;
import n6.b;

/* loaded from: classes.dex */
public final class zzbx implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int u10 = b.u(parcel);
        String str = null;
        int i10 = 0;
        while (parcel.dataPosition() < u10) {
            int readInt = parcel.readInt();
            char c10 = (char) readInt;
            if (c10 == 1) {
                i10 = b.o(readInt, parcel);
            } else if (c10 != 2) {
                b.t(readInt, parcel);
            } else {
                str = b.f(readInt, parcel);
            }
        }
        b.j(u10, parcel);
        return new zzbw(i10, str);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzbw[i10];
    }
}
