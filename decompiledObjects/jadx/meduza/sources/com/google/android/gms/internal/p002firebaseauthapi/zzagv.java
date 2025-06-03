package com.google.android.gms.internal.p002firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import n6.b;

/* loaded from: classes.dex */
public final class zzagv implements Parcelable.Creator<zzagw> {
    @Override // android.os.Parcelable.Creator
    public final zzagw createFromParcel(Parcel parcel) {
        int u10 = b.u(parcel);
        String str = null;
        String str2 = null;
        Long l10 = null;
        String str3 = null;
        Long l11 = null;
        while (parcel.dataPosition() < u10) {
            int readInt = parcel.readInt();
            char c10 = (char) readInt;
            if (c10 == 2) {
                str = b.f(readInt, parcel);
            } else if (c10 == 3) {
                str2 = b.f(readInt, parcel);
            } else if (c10 == 4) {
                l10 = b.r(readInt, parcel);
            } else if (c10 == 5) {
                str3 = b.f(readInt, parcel);
            } else if (c10 != 6) {
                b.t(readInt, parcel);
            } else {
                l11 = b.r(readInt, parcel);
            }
        }
        b.j(u10, parcel);
        return new zzagw(str, str2, l10, str3, l11);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzagw[] newArray(int i10) {
        return new zzagw[i10];
    }
}
