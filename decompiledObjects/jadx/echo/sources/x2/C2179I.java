package x2;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: x2.I, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2179I implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int u7 = B2.b.u(parcel);
        boolean z7 = false;
        int i7 = 0;
        String str = null;
        int i8 = 0;
        while (parcel.dataPosition() < u7) {
            int n7 = B2.b.n(parcel);
            int i9 = B2.b.i(n7);
            if (i9 == 1) {
                z7 = B2.b.j(parcel, n7);
            } else if (i9 == 2) {
                str = B2.b.d(parcel, n7);
            } else if (i9 == 3) {
                i8 = B2.b.p(parcel, n7);
            } else if (i9 != 4) {
                B2.b.t(parcel, n7);
            } else {
                i7 = B2.b.p(parcel, n7);
            }
        }
        B2.b.h(parcel, u7);
        return new C2178H(z7, str, i8, i7);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new C2178H[i7];
    }
}
