package com.google.android.gms.internal.measurement;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import n6.b;

/* loaded from: classes.dex */
public final class zzee implements Parcelable.Creator<zzeb> {
    @Override // android.os.Parcelable.Creator
    public final zzeb createFromParcel(Parcel parcel) {
        int u10 = b.u(parcel);
        String str = null;
        int i10 = 0;
        Intent intent = null;
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
                intent = (Intent) b.e(parcel, readInt, Intent.CREATOR);
            }
        }
        b.j(u10, parcel);
        return new zzeb(i10, str, intent);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzeb[] newArray(int i10) {
        return new zzeb[i10];
    }
}
