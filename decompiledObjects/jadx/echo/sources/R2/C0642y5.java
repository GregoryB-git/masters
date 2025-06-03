package R2;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: R2.y5, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0642y5 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int u7 = B2.b.u(parcel);
        String str = null;
        long j7 = 0;
        int i7 = 0;
        while (parcel.dataPosition() < u7) {
            int n7 = B2.b.n(parcel);
            int i8 = B2.b.i(n7);
            if (i8 == 1) {
                str = B2.b.d(parcel, n7);
            } else if (i8 == 2) {
                j7 = B2.b.q(parcel, n7);
            } else if (i8 != 3) {
                B2.b.t(parcel, n7);
            } else {
                i7 = B2.b.p(parcel, n7);
            }
        }
        B2.b.h(parcel, u7);
        return new C0621v5(str, j7, i7);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new C0621v5[i7];
    }
}
