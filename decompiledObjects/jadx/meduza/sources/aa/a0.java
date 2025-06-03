package aa;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class a0 implements Parcelable.Creator<z> {
    @Override // android.os.Parcelable.Creator
    public final z createFromParcel(Parcel parcel) {
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
        return new z(bundle);
    }

    @Override // android.os.Parcelable.Creator
    public final z[] newArray(int i10) {
        return new z[i10];
    }
}
