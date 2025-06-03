package w8;

import android.os.Parcel;
import android.os.Parcelable;
import w8.d;

/* loaded from: classes.dex */
public final class f implements Parcelable.Creator<d.a> {
    @Override // android.os.Parcelable.Creator
    public final d.a createFromParcel(Parcel parcel) {
        int u10 = n6.b.u(parcel);
        String str = null;
        while (parcel.dataPosition() < u10) {
            int readInt = parcel.readInt();
            if (((char) readInt) != 2) {
                n6.b.t(readInt, parcel);
            } else {
                str = n6.b.f(readInt, parcel);
            }
        }
        n6.b.j(u10, parcel);
        return new d.a(str);
    }

    @Override // android.os.Parcelable.Creator
    public final d.a[] newArray(int i10) {
        return new d.a[i10];
    }
}
