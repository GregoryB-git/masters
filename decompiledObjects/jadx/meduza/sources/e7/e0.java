package e7;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class e0 implements Parcelable.Creator<f0> {
    @Override // android.os.Parcelable.Creator
    public final f0 createFromParcel(Parcel parcel) {
        int u10 = n6.b.u(parcel);
        String str = null;
        a0 a0Var = null;
        String str2 = null;
        long j10 = 0;
        while (parcel.dataPosition() < u10) {
            int readInt = parcel.readInt();
            char c10 = (char) readInt;
            if (c10 == 2) {
                str = n6.b.f(readInt, parcel);
            } else if (c10 == 3) {
                a0Var = (a0) n6.b.e(parcel, readInt, a0.CREATOR);
            } else if (c10 == 4) {
                str2 = n6.b.f(readInt, parcel);
            } else if (c10 != 5) {
                n6.b.t(readInt, parcel);
            } else {
                j10 = n6.b.q(readInt, parcel);
            }
        }
        n6.b.j(u10, parcel);
        return new f0(str, a0Var, str2, j10);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ f0[] newArray(int i10) {
        return new f0[i10];
    }
}
