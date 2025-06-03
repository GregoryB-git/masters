package t6;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class k implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int u10 = n6.b.u(parcel);
        int i10 = 0;
        Parcel parcel2 = null;
        h hVar = null;
        while (parcel.dataPosition() < u10) {
            int readInt = parcel.readInt();
            char c10 = (char) readInt;
            if (c10 == 1) {
                i10 = n6.b.o(readInt, parcel);
            } else if (c10 == 2) {
                int s10 = n6.b.s(readInt, parcel);
                int dataPosition = parcel.dataPosition();
                if (s10 == 0) {
                    parcel2 = null;
                } else {
                    Parcel obtain = Parcel.obtain();
                    obtain.appendFrom(parcel, dataPosition, s10);
                    parcel.setDataPosition(dataPosition + s10);
                    parcel2 = obtain;
                }
            } else if (c10 != 3) {
                n6.b.t(readInt, parcel);
            } else {
                hVar = (h) n6.b.e(parcel, readInt, h.CREATOR);
            }
        }
        n6.b.j(u10, parcel);
        return new c(i10, parcel2, hVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new c[i10];
    }
}
