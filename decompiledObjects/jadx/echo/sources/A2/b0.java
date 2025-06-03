package A2;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import x2.C2190d;

/* loaded from: classes.dex */
public final class b0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int u7 = B2.b.u(parcel);
        Bundle bundle = null;
        C0319e c0319e = null;
        int i7 = 0;
        C2190d[] c2190dArr = null;
        while (parcel.dataPosition() < u7) {
            int n7 = B2.b.n(parcel);
            int i8 = B2.b.i(n7);
            if (i8 == 1) {
                bundle = B2.b.a(parcel, n7);
            } else if (i8 == 2) {
                c2190dArr = (C2190d[]) B2.b.f(parcel, n7, C2190d.CREATOR);
            } else if (i8 == 3) {
                i7 = B2.b.p(parcel, n7);
            } else if (i8 != 4) {
                B2.b.t(parcel, n7);
            } else {
                c0319e = (C0319e) B2.b.c(parcel, n7, C0319e.CREATOR);
            }
        }
        B2.b.h(parcel, u7);
        return new a0(bundle, c2190dArr, i7, c0319e);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new a0[i7];
    }
}
