package c8;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class j implements Parcelable.Creator<k> {
    @Override // android.os.Parcelable.Creator
    public final k createFromParcel(Parcel parcel) {
        int u10 = n6.b.u(parcel);
        long j10 = 0;
        long j11 = 0;
        while (parcel.dataPosition() < u10) {
            int readInt = parcel.readInt();
            char c10 = (char) readInt;
            if (c10 == 1) {
                j10 = n6.b.q(readInt, parcel);
            } else if (c10 != 2) {
                n6.b.t(readInt, parcel);
            } else {
                j11 = n6.b.q(readInt, parcel);
            }
        }
        n6.b.j(u10, parcel);
        return new k(j10, j11);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ k[] newArray(int i10) {
        return new k[i10];
    }
}
