package T2;

import A2.G;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class k implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int u7 = B2.b.u(parcel);
        int i7 = 0;
        G g7 = null;
        while (parcel.dataPosition() < u7) {
            int n7 = B2.b.n(parcel);
            int i8 = B2.b.i(n7);
            if (i8 == 1) {
                i7 = B2.b.p(parcel, n7);
            } else if (i8 != 2) {
                B2.b.t(parcel, n7);
            } else {
                g7 = (G) B2.b.c(parcel, n7, G.CREATOR);
            }
        }
        B2.b.h(parcel, u7);
        return new j(i7, g7);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new j[i7];
    }
}
