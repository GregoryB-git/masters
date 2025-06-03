package R2;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class Q5 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int u7 = B2.b.u(parcel);
        int i7 = 0;
        String str = null;
        Long l7 = null;
        Float f7 = null;
        String str2 = null;
        String str3 = null;
        Double d7 = null;
        long j7 = 0;
        while (parcel.dataPosition() < u7) {
            int n7 = B2.b.n(parcel);
            switch (B2.b.i(n7)) {
                case 1:
                    i7 = B2.b.p(parcel, n7);
                    break;
                case 2:
                    str = B2.b.d(parcel, n7);
                    break;
                case 3:
                    j7 = B2.b.q(parcel, n7);
                    break;
                case 4:
                    l7 = B2.b.r(parcel, n7);
                    break;
                case 5:
                    f7 = B2.b.m(parcel, n7);
                    break;
                case 6:
                    str2 = B2.b.d(parcel, n7);
                    break;
                case 7:
                    str3 = B2.b.d(parcel, n7);
                    break;
                case 8:
                    d7 = B2.b.l(parcel, n7);
                    break;
                default:
                    B2.b.t(parcel, n7);
                    break;
            }
        }
        B2.b.h(parcel, u7);
        return new R5(i7, str, j7, l7, f7, str2, str3, d7);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new R5[i7];
    }
}
