package b7;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class i0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int u10 = n6.b.u(parcel);
        boolean z10 = false;
        while (parcel.dataPosition() < u10) {
            int readInt = parcel.readInt();
            if (((char) readInt) != 1) {
                n6.b.t(readInt, parcel);
            } else {
                z10 = n6.b.k(readInt, parcel);
            }
        }
        n6.b.j(u10, parcel);
        return new g2(z10);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new g2[i10];
    }
}
