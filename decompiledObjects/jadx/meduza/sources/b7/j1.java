package b7;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class j1 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int u10 = n6.b.u(parcel);
        int i10 = 0;
        short s10 = 0;
        short s11 = 0;
        while (parcel.dataPosition() < u10) {
            int readInt = parcel.readInt();
            char c10 = (char) readInt;
            if (c10 == 1) {
                i10 = n6.b.o(readInt, parcel);
            } else if (c10 == 2) {
                n6.b.w(parcel, readInt, 4);
                s10 = (short) parcel.readInt();
            } else if (c10 != 3) {
                n6.b.t(readInt, parcel);
            } else {
                n6.b.w(parcel, readInt, 4);
                s11 = (short) parcel.readInt();
            }
        }
        n6.b.j(u10, parcel);
        return new g0(i10, s10, s11);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new g0[i10];
    }
}
