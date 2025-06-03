package c8;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class j1 implements Parcelable.Creator<k1> {
    @Override // android.os.Parcelable.Creator
    public final k1 createFromParcel(Parcel parcel) {
        int u10 = n6.b.u(parcel);
        i iVar = null;
        i1 i1Var = null;
        b8.c1 c1Var = null;
        while (parcel.dataPosition() < u10) {
            int readInt = parcel.readInt();
            char c10 = (char) readInt;
            if (c10 == 1) {
                iVar = (i) n6.b.e(parcel, readInt, i.CREATOR);
            } else if (c10 == 2) {
                i1Var = (i1) n6.b.e(parcel, readInt, i1.CREATOR);
            } else if (c10 != 3) {
                n6.b.t(readInt, parcel);
            } else {
                c1Var = (b8.c1) n6.b.e(parcel, readInt, b8.c1.CREATOR);
            }
        }
        n6.b.j(u10, parcel);
        return new k1(iVar, i1Var, c1Var);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ k1[] newArray(int i10) {
        return new k1[i10];
    }
}
