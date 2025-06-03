package b8;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class f1 implements Parcelable.Creator<h> {
    @Override // android.os.Parcelable.Creator
    public final h createFromParcel(Parcel parcel) {
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
            } else if (c10 == 3) {
                str3 = n6.b.f(readInt, parcel);
            } else if (c10 == 4) {
                str4 = n6.b.f(readInt, parcel);
            } else if (c10 != 5) {
                n6.b.t(readInt, parcel);
            } else {
                z10 = n6.b.k(readInt, parcel);
            }
        }
        n6.b.j(u10, parcel);
        return new h(str, str2, str3, str4, z10);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ h[] newArray(int i10) {
        return new h[i10];
    }
}
