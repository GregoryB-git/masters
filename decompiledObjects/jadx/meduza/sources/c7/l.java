package c7;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class l implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int u10 = n6.b.u(parcel);
        b bVar = null;
        String str = null;
        String str2 = null;
        while (parcel.dataPosition() < u10) {
            int readInt = parcel.readInt();
            char c10 = (char) readInt;
            if (c10 == 2) {
                bVar = (b) n6.b.e(parcel, readInt, b.CREATOR);
            } else if (c10 == 3) {
                str = n6.b.f(readInt, parcel);
            } else if (c10 != 4) {
                n6.b.t(readInt, parcel);
            } else {
                str2 = n6.b.f(readInt, parcel);
            }
        }
        n6.b.j(u10, parcel);
        return new e(bVar, str, str2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new e[i10];
    }
}
