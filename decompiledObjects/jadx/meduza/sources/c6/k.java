package c6;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class k implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int u10 = n6.b.u(parcel);
        int i10 = 0;
        boolean z10 = false;
        boolean z11 = false;
        long j10 = 0;
        while (parcel.dataPosition() < u10) {
            int readInt = parcel.readInt();
            char c10 = (char) readInt;
            if (c10 == 1) {
                i10 = n6.b.o(readInt, parcel);
            } else if (c10 == 2) {
                z10 = n6.b.k(readInt, parcel);
            } else if (c10 == 3) {
                j10 = n6.b.q(readInt, parcel);
            } else if (c10 != 4) {
                n6.b.t(readInt, parcel);
            } else {
                z11 = n6.b.k(readInt, parcel);
            }
        }
        n6.b.j(u10, parcel);
        return new a(i10, j10, z10, z11);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new a[i10];
    }
}
