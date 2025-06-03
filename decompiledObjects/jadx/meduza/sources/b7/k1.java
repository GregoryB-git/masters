package b7;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class k1 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int u10 = n6.b.u(parcel);
        f0 f0Var = null;
        n1 n1Var = null;
        f fVar = null;
        p1 p1Var = null;
        while (parcel.dataPosition() < u10) {
            int readInt = parcel.readInt();
            char c10 = (char) readInt;
            if (c10 == 1) {
                f0Var = (f0) n6.b.e(parcel, readInt, f0.CREATOR);
            } else if (c10 == 2) {
                n1Var = (n1) n6.b.e(parcel, readInt, n1.CREATOR);
            } else if (c10 == 3) {
                fVar = (f) n6.b.e(parcel, readInt, f.CREATOR);
            } else if (c10 != 4) {
                n6.b.t(readInt, parcel);
            } else {
                p1Var = (p1) n6.b.e(parcel, readInt, p1.CREATOR);
            }
        }
        n6.b.j(u10, parcel);
        return new e(f0Var, n1Var, fVar, p1Var);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new e[i10];
    }
}
