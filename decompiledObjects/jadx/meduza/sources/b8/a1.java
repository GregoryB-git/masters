package b8;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class a1 implements Parcelable.Creator<p0> {
    @Override // android.os.Parcelable.Creator
    public final p0 createFromParcel(Parcel parcel) {
        int u10 = n6.b.u(parcel);
        boolean z10 = false;
        String str = null;
        String str2 = null;
        boolean z11 = false;
        while (parcel.dataPosition() < u10) {
            int readInt = parcel.readInt();
            char c10 = (char) readInt;
            if (c10 == 2) {
                str = n6.b.f(readInt, parcel);
            } else if (c10 == 3) {
                str2 = n6.b.f(readInt, parcel);
            } else if (c10 == 4) {
                z10 = n6.b.k(readInt, parcel);
            } else if (c10 != 5) {
                n6.b.t(readInt, parcel);
            } else {
                z11 = n6.b.k(readInt, parcel);
            }
        }
        n6.b.j(u10, parcel);
        return new p0(str, str2, z10, z11);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ p0[] newArray(int i10) {
        return new p0[i10];
    }
}
