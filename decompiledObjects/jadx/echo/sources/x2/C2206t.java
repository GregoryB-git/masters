package x2;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: x2.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2206t implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int u7 = B2.b.u(parcel);
        String str = null;
        int i7 = 0;
        long j7 = -1;
        while (parcel.dataPosition() < u7) {
            int n7 = B2.b.n(parcel);
            int i8 = B2.b.i(n7);
            if (i8 == 1) {
                str = B2.b.d(parcel, n7);
            } else if (i8 == 2) {
                i7 = B2.b.p(parcel, n7);
            } else if (i8 != 3) {
                B2.b.t(parcel, n7);
            } else {
                j7 = B2.b.q(parcel, n7);
            }
        }
        B2.b.h(parcel, u7);
        return new C2190d(str, i7, j7);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new C2190d[i7];
    }
}
