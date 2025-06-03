package R2;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class H implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int u7 = B2.b.u(parcel);
        String str = null;
        D d7 = null;
        String str2 = null;
        long j7 = 0;
        while (parcel.dataPosition() < u7) {
            int n7 = B2.b.n(parcel);
            int i7 = B2.b.i(n7);
            if (i7 == 2) {
                str = B2.b.d(parcel, n7);
            } else if (i7 == 3) {
                d7 = (D) B2.b.c(parcel, n7, D.CREATOR);
            } else if (i7 == 4) {
                str2 = B2.b.d(parcel, n7);
            } else if (i7 != 5) {
                B2.b.t(parcel, n7);
            } else {
                j7 = B2.b.q(parcel, n7);
            }
        }
        B2.b.h(parcel, u7);
        return new I(str, d7, str2, j7);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new I[i7];
    }
}
