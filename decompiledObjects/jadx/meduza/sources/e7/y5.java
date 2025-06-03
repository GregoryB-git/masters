package e7;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class y5 implements Parcelable.Creator<w5> {
    @Override // android.os.Parcelable.Creator
    public final w5 createFromParcel(Parcel parcel) {
        int u10 = n6.b.u(parcel);
        String str = null;
        long j10 = 0;
        int i10 = 0;
        while (parcel.dataPosition() < u10) {
            int readInt = parcel.readInt();
            char c10 = (char) readInt;
            if (c10 == 1) {
                str = n6.b.f(readInt, parcel);
            } else if (c10 == 2) {
                j10 = n6.b.q(readInt, parcel);
            } else if (c10 != 3) {
                n6.b.t(readInt, parcel);
            } else {
                i10 = n6.b.o(readInt, parcel);
            }
        }
        n6.b.j(u10, parcel);
        return new w5(str, j10, i10);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ w5[] newArray(int i10) {
        return new w5[i10];
    }
}
