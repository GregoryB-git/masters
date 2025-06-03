package q6;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class h implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int u10 = n6.b.u(parcel);
        Long l10 = null;
        Long l11 = null;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (parcel.dataPosition() < u10) {
            int readInt = parcel.readInt();
            char c10 = (char) readInt;
            if (c10 == 1) {
                i10 = n6.b.o(readInt, parcel);
            } else if (c10 == 2) {
                i11 = n6.b.o(readInt, parcel);
            } else if (c10 == 3) {
                l10 = n6.b.r(readInt, parcel);
            } else if (c10 == 4) {
                l11 = n6.b.r(readInt, parcel);
            } else if (c10 != 5) {
                n6.b.t(readInt, parcel);
            } else {
                i12 = n6.b.o(readInt, parcel);
            }
        }
        n6.b.j(u10, parcel);
        return new d(i10, i11, l10, l11, i12);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new d[i10];
    }
}
