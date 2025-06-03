package f6;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class d implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int u10 = n6.b.u(parcel);
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        PendingIntent pendingIntent = null;
        Bundle bundle = null;
        byte[] bArr = null;
        while (parcel.dataPosition() < u10) {
            int readInt = parcel.readInt();
            char c10 = (char) readInt;
            if (c10 == 1) {
                i11 = n6.b.o(readInt, parcel);
            } else if (c10 == 2) {
                pendingIntent = (PendingIntent) n6.b.e(parcel, readInt, PendingIntent.CREATOR);
            } else if (c10 == 3) {
                i12 = n6.b.o(readInt, parcel);
            } else if (c10 == 4) {
                bundle = n6.b.b(readInt, parcel);
            } else if (c10 == 5) {
                bArr = n6.b.c(readInt, parcel);
            } else if (c10 != 1000) {
                n6.b.t(readInt, parcel);
            } else {
                i10 = n6.b.o(readInt, parcel);
            }
        }
        n6.b.j(u10, parcel);
        return new b(i10, i11, pendingIntent, i12, bundle, bArr);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new b[i10];
    }
}
