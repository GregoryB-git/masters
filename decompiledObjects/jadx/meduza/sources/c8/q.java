package c8;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class q implements Parcelable.Creator<n> {
    @Override // android.os.Parcelable.Creator
    public final n createFromParcel(Parcel parcel) {
        int u10 = n6.b.u(parcel);
        String str = null;
        String str2 = null;
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        i iVar = null;
        while (parcel.dataPosition() < u10) {
            int readInt = parcel.readInt();
            char c10 = (char) readInt;
            if (c10 == 1) {
                str = n6.b.f(readInt, parcel);
            } else if (c10 == 2) {
                str2 = n6.b.f(readInt, parcel);
            } else if (c10 == 3) {
                arrayList = n6.b.i(parcel, readInt, b8.h0.CREATOR);
            } else if (c10 == 4) {
                arrayList2 = n6.b.i(parcel, readInt, b8.l0.CREATOR);
            } else if (c10 != 5) {
                n6.b.t(readInt, parcel);
            } else {
                iVar = (i) n6.b.e(parcel, readInt, i.CREATOR);
            }
        }
        n6.b.j(u10, parcel);
        return new n(str, str2, arrayList, arrayList2, iVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ n[] newArray(int i10) {
        return new n[i10];
    }
}
