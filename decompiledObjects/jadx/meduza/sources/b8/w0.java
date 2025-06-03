package b8;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class w0 implements Parcelable.Creator<h0> {
    @Override // android.os.Parcelable.Creator
    public final h0 createFromParcel(Parcel parcel) {
        int u10 = n6.b.u(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        long j10 = 0;
        while (parcel.dataPosition() < u10) {
            int readInt = parcel.readInt();
            char c10 = (char) readInt;
            if (c10 == 1) {
                str = n6.b.f(readInt, parcel);
            } else if (c10 == 2) {
                str2 = n6.b.f(readInt, parcel);
            } else if (c10 == 3) {
                j10 = n6.b.q(readInt, parcel);
            } else if (c10 != 4) {
                n6.b.t(readInt, parcel);
            } else {
                str3 = n6.b.f(readInt, parcel);
            }
        }
        n6.b.j(u10, parcel);
        return new h0(j10, str, str2, str3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ h0[] newArray(int i10) {
        return new h0[i10];
    }
}
