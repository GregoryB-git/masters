package b8;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class d1 implements Parcelable.Creator<e0> {
    @Override // android.os.Parcelable.Creator
    public final e0 createFromParcel(Parcel parcel) {
        int u10 = n6.b.u(parcel);
        while (parcel.dataPosition() < u10) {
            n6.b.t(parcel.readInt(), parcel);
        }
        n6.b.j(u10, parcel);
        return new e0();
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ e0[] newArray(int i10) {
        return new e0[i10];
    }
}
