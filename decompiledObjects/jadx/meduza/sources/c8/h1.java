package c8;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class h1 implements Parcelable.Creator<i1> {
    @Override // android.os.Parcelable.Creator
    public final i1 createFromParcel(Parcel parcel) {
        int u10 = n6.b.u(parcel);
        String str = null;
        boolean z10 = false;
        String str2 = null;
        while (parcel.dataPosition() < u10) {
            int readInt = parcel.readInt();
            char c10 = (char) readInt;
            if (c10 == 1) {
                str = n6.b.f(readInt, parcel);
            } else if (c10 == 2) {
                str2 = n6.b.f(readInt, parcel);
            } else if (c10 != 3) {
                n6.b.t(readInt, parcel);
            } else {
                z10 = n6.b.k(readInt, parcel);
            }
        }
        n6.b.j(u10, parcel);
        return new i1(str, str2, z10);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ i1[] newArray(int i10) {
        return new i1[i10];
    }
}
