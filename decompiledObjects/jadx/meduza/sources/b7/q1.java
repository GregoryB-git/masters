package b7;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class q1 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int u10 = n6.b.u(parcel);
        byte[] bArr = null;
        boolean z10 = false;
        while (parcel.dataPosition() < u10) {
            int readInt = parcel.readInt();
            char c10 = (char) readInt;
            if (c10 == 1) {
                z10 = n6.b.k(readInt, parcel);
            } else if (c10 != 2) {
                n6.b.t(readInt, parcel);
            } else {
                bArr = n6.b.c(readInt, parcel);
            }
        }
        n6.b.j(u10, parcel);
        return new p1(z10, bArr);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new p1[i10];
    }
}
