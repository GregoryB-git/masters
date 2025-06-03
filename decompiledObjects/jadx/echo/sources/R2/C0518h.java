package R2;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: R2.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0518h implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int u7 = B2.b.u(parcel);
        String str = null;
        String str2 = null;
        R5 r52 = null;
        String str3 = null;
        I i7 = null;
        I i8 = null;
        I i9 = null;
        long j7 = 0;
        long j8 = 0;
        long j9 = 0;
        boolean z7 = false;
        while (parcel.dataPosition() < u7) {
            int n7 = B2.b.n(parcel);
            switch (B2.b.i(n7)) {
                case 2:
                    str = B2.b.d(parcel, n7);
                    break;
                case 3:
                    str2 = B2.b.d(parcel, n7);
                    break;
                case 4:
                    r52 = (R5) B2.b.c(parcel, n7, R5.CREATOR);
                    break;
                case 5:
                    j7 = B2.b.q(parcel, n7);
                    break;
                case 6:
                    z7 = B2.b.j(parcel, n7);
                    break;
                case 7:
                    str3 = B2.b.d(parcel, n7);
                    break;
                case 8:
                    i7 = (I) B2.b.c(parcel, n7, I.CREATOR);
                    break;
                case 9:
                    j8 = B2.b.q(parcel, n7);
                    break;
                case 10:
                    i8 = (I) B2.b.c(parcel, n7, I.CREATOR);
                    break;
                case 11:
                    j9 = B2.b.q(parcel, n7);
                    break;
                case N4.h.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                    i9 = (I) B2.b.c(parcel, n7, I.CREATOR);
                    break;
                default:
                    B2.b.t(parcel, n7);
                    break;
            }
        }
        B2.b.h(parcel, u7);
        return new C0497e(str, str2, r52, j7, z7, str3, i7, j8, i8, j9, i9);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new C0497e[i7];
    }
}
