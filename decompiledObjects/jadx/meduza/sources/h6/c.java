package h6;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class c implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int u10 = n6.b.u(parcel);
        int i10 = 0;
        Bundle bundle = null;
        int i11 = 0;
        while (parcel.dataPosition() < u10) {
            int readInt = parcel.readInt();
            char c10 = (char) readInt;
            if (c10 == 1) {
                i10 = n6.b.o(readInt, parcel);
            } else if (c10 == 2) {
                i11 = n6.b.o(readInt, parcel);
            } else if (c10 != 3) {
                n6.b.t(readInt, parcel);
            } else {
                bundle = n6.b.b(readInt, parcel);
            }
        }
        n6.b.j(u10, parcel);
        return new a(i10, i11, bundle);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new a[i10];
    }
}
