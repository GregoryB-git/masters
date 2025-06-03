package com.google.android.gms.internal.auth;

import android.os.Parcel;
import android.os.Parcelable;
import n6.b;

/* loaded from: classes.dex */
public final class zzba implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int u10 = b.u(parcel);
        String str = null;
        int i10 = 0;
        byte[] bArr = null;
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
                bArr = b.c(readInt, parcel);
            }
        }
        b.j(u10, parcel);
        return new zzaz(i10, str, bArr);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzaz[i10];
    }
}
