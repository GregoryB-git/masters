package A2;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class F implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int u7 = B2.b.u(parcel);
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        long j7 = 0;
        long j8 = 0;
        String str = null;
        String str2 = null;
        int i11 = -1;
        while (parcel.dataPosition() < u7) {
            int n7 = B2.b.n(parcel);
            switch (B2.b.i(n7)) {
                case 1:
                    i7 = B2.b.p(parcel, n7);
                    break;
                case 2:
                    i8 = B2.b.p(parcel, n7);
                    break;
                case 3:
                    i9 = B2.b.p(parcel, n7);
                    break;
                case 4:
                    j7 = B2.b.q(parcel, n7);
                    break;
                case 5:
                    j8 = B2.b.q(parcel, n7);
                    break;
                case 6:
                    str = B2.b.d(parcel, n7);
                    break;
                case 7:
                    str2 = B2.b.d(parcel, n7);
                    break;
                case 8:
                    i10 = B2.b.p(parcel, n7);
                    break;
                case 9:
                    i11 = B2.b.p(parcel, n7);
                    break;
                default:
                    B2.b.t(parcel, n7);
                    break;
            }
        }
        B2.b.h(parcel, u7);
        return new C0326l(i7, i8, i9, j7, j8, str, str2, i10, i11);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new C0326l[i7];
    }
}
