package e7;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class c0 implements Parcelable.Creator<a0> {
    @Override // android.os.Parcelable.Creator
    public final a0 createFromParcel(Parcel parcel) {
        int u10 = n6.b.u(parcel);
        Bundle bundle = null;
        while (parcel.dataPosition() < u10) {
            int readInt = parcel.readInt();
            if (((char) readInt) != 2) {
                n6.b.t(readInt, parcel);
            } else {
                bundle = n6.b.b(readInt, parcel);
            }
        }
        n6.b.j(u10, parcel);
        return new a0(bundle);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ a0[] newArray(int i10) {
        return new a0[i10];
    }
}
