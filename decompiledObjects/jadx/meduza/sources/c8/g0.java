package c8;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class g0 implements Parcelable.Creator<e0> {
    @Override // android.os.Parcelable.Creator
    public final e0 createFromParcel(Parcel parcel) {
        int u10 = n6.b.u(parcel);
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        while (parcel.dataPosition() < u10) {
            int readInt = parcel.readInt();
            char c10 = (char) readInt;
            if (c10 == 1) {
                arrayList = n6.b.i(parcel, readInt, b8.h0.CREATOR);
            } else if (c10 != 2) {
                n6.b.t(readInt, parcel);
            } else {
                arrayList2 = n6.b.i(parcel, readInt, b8.l0.CREATOR);
            }
        }
        n6.b.j(u10, parcel);
        return new e0(arrayList, arrayList2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ e0[] newArray(int i10) {
        return new e0[i10];
    }
}
