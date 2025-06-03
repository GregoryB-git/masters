package b8;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class x0 implements Parcelable.Creator<i0> {
    @Override // android.os.Parcelable.Creator
    public final i0 createFromParcel(Parcel parcel) {
        int u10 = n6.b.u(parcel);
        String str = null;
        while (parcel.dataPosition() < u10) {
            int readInt = parcel.readInt();
            if (((char) readInt) != 1) {
                n6.b.t(readInt, parcel);
            } else {
                str = n6.b.f(readInt, parcel);
            }
        }
        n6.b.j(u10, parcel);
        return new i0(str);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ i0[] newArray(int i10) {
        return new i0[i10];
    }
}
