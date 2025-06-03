package h7;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class k implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int u10 = n6.b.u(parcel);
        j6.b bVar = null;
        int i10 = 0;
        com.google.android.gms.common.internal.f fVar = null;
        while (parcel.dataPosition() < u10) {
            int readInt = parcel.readInt();
            char c10 = (char) readInt;
            if (c10 == 1) {
                i10 = n6.b.o(readInt, parcel);
            } else if (c10 == 2) {
                bVar = (j6.b) n6.b.e(parcel, readInt, j6.b.CREATOR);
            } else if (c10 != 3) {
                n6.b.t(readInt, parcel);
            } else {
                fVar = (com.google.android.gms.common.internal.f) n6.b.e(parcel, readInt, com.google.android.gms.common.internal.f.CREATOR);
            }
        }
        n6.b.j(u10, parcel);
        return new j(i10, bVar, fVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new j[i10];
    }
}
