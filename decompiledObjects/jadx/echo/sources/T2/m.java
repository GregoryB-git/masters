package T2;

import A2.I;
import android.os.Parcel;
import android.os.Parcelable;
import x2.C2188b;

/* loaded from: classes.dex */
public final class m implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int u7 = B2.b.u(parcel);
        int i7 = 0;
        C2188b c2188b = null;
        I i8 = null;
        while (parcel.dataPosition() < u7) {
            int n7 = B2.b.n(parcel);
            int i9 = B2.b.i(n7);
            if (i9 == 1) {
                i7 = B2.b.p(parcel, n7);
            } else if (i9 == 2) {
                c2188b = (C2188b) B2.b.c(parcel, n7, C2188b.CREATOR);
            } else if (i9 != 3) {
                B2.b.t(parcel, n7);
            } else {
                i8 = (I) B2.b.c(parcel, n7, I.CREATOR);
            }
        }
        B2.b.h(parcel, u7);
        return new l(i7, c2188b, i8);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new l[i7];
    }
}
