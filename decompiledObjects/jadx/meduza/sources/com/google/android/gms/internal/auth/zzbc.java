package com.google.android.gms.internal.auth;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import n6.b;

/* loaded from: classes.dex */
public final class zzbc implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int u10 = b.u(parcel);
        String str = null;
        int i10 = 0;
        PendingIntent pendingIntent = null;
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
                pendingIntent = (PendingIntent) b.e(parcel, readInt, PendingIntent.CREATOR);
            }
        }
        b.j(u10, parcel);
        return new zzbb(i10, str, pendingIntent);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzbb[i10];
    }
}
