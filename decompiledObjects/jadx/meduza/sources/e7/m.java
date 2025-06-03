package e7;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class m implements Parcelable.Creator<n> {
    @Override // android.os.Parcelable.Creator
    public final n createFromParcel(Parcel parcel) {
        int u10 = n6.b.u(parcel);
        Bundle bundle = null;
        while (parcel.dataPosition() < u10) {
            int readInt = parcel.readInt();
            if (((char) readInt) != 1) {
                n6.b.t(readInt, parcel);
            } else {
                bundle = n6.b.b(readInt, parcel);
            }
        }
        n6.b.j(u10, parcel);
        return new n(bundle);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ n[] newArray(int i10) {
        return new n[i10];
    }
}
