package b8;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class s0 implements Parcelable.Creator<u> {
    @Override // android.os.Parcelable.Creator
    public final u createFromParcel(Parcel parcel) {
        int u10 = n6.b.u(parcel);
        String str = null;
        String str2 = null;
        while (parcel.dataPosition() < u10) {
            int readInt = parcel.readInt();
            char c10 = (char) readInt;
            if (c10 == 1) {
                str = n6.b.f(readInt, parcel);
            } else if (c10 != 2) {
                n6.b.t(readInt, parcel);
            } else {
                str2 = n6.b.f(readInt, parcel);
            }
        }
        n6.b.j(u10, parcel);
        return new u(str, str2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ u[] newArray(int i10) {
        return new u[i10];
    }
}
