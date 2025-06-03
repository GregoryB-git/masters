package b8;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class v0 implements Parcelable.Creator<c0> {
    @Override // android.os.Parcelable.Creator
    public final c0 createFromParcel(Parcel parcel) {
        int u10 = n6.b.u(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        boolean z10 = false;
        while (parcel.dataPosition() < u10) {
            int readInt = parcel.readInt();
            char c10 = (char) readInt;
            if (c10 == 1) {
                str = n6.b.f(readInt, parcel);
            } else if (c10 == 2) {
                str2 = n6.b.f(readInt, parcel);
            } else if (c10 == 4) {
                str3 = n6.b.f(readInt, parcel);
            } else if (c10 == 5) {
                z10 = n6.b.k(readInt, parcel);
            } else if (c10 != 6) {
                n6.b.t(readInt, parcel);
            } else {
                str4 = n6.b.f(readInt, parcel);
            }
        }
        n6.b.j(u10, parcel);
        return new c0(str, str2, str3, str4, z10);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ c0[] newArray(int i10) {
        return new c0[i10];
    }
}
