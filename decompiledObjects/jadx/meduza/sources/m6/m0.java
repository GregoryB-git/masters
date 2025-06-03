package m6;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class m0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int u10 = n6.b.u(parcel);
        Bundle bundle = null;
        b bVar = null;
        int i10 = 0;
        j6.d[] dVarArr = null;
        while (parcel.dataPosition() < u10) {
            int readInt = parcel.readInt();
            char c10 = (char) readInt;
            if (c10 == 1) {
                bundle = n6.b.b(readInt, parcel);
            } else if (c10 == 2) {
                dVarArr = (j6.d[]) n6.b.h(parcel, readInt, j6.d.CREATOR);
            } else if (c10 == 3) {
                i10 = n6.b.o(readInt, parcel);
            } else if (c10 != 4) {
                n6.b.t(readInt, parcel);
            } else {
                bVar = (b) n6.b.e(parcel, readInt, b.CREATOR);
            }
        }
        n6.b.j(u10, parcel);
        return new l0(bundle, dVarArr, i10, bVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new l0[i10];
    }
}
