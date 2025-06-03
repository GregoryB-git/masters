package b8;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class r0 implements Parcelable.Creator<t> {
    @Override // android.os.Parcelable.Creator
    public final t createFromParcel(Parcel parcel) {
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
        return new t(str);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ t[] newArray(int i10) {
        return new t[i10];
    }
}
