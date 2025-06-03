package com.google.android.gms.internal.auth;

import android.os.Parcel;
import android.os.Parcelable;
import n6.b;

/* loaded from: classes.dex */
public final class zzaw implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int u10 = b.u(parcel);
        int i10 = 0;
        String str = null;
        int i11 = 0;
        while (parcel.dataPosition() < u10) {
            int readInt = parcel.readInt();
            char c10 = (char) readInt;
            if (c10 == 1) {
                i10 = b.o(readInt, parcel);
            } else if (c10 == 2) {
                str = b.f(readInt, parcel);
            } else if (c10 != 3) {
                b.t(readInt, parcel);
            } else {
                i11 = b.o(readInt, parcel);
            }
        }
        b.j(u10, parcel);
        return new zzav(i10, str, i11);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzav[i10];
    }
}
