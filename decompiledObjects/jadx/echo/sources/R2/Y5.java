package R2;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class Y5 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int u7 = B2.b.u(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        Boolean bool = null;
        ArrayList arrayList = null;
        String str8 = null;
        String str9 = null;
        long j7 = 0;
        long j8 = 0;
        long j9 = 0;
        long j10 = 0;
        long j11 = 0;
        long j12 = 0;
        long j13 = 0;
        boolean z7 = true;
        boolean z8 = true;
        boolean z9 = false;
        int i7 = 0;
        boolean z10 = false;
        boolean z11 = false;
        int i8 = 0;
        long j14 = -2147483648L;
        String str10 = "";
        String str11 = str10;
        String str12 = str11;
        int i9 = 100;
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
                    str3 = B2.b.d(parcel, n7);
                    break;
                case 5:
                    str4 = B2.b.d(parcel, n7);
                    break;
                case 6:
                    j7 = B2.b.q(parcel, n7);
                    break;
                case 7:
                    j8 = B2.b.q(parcel, n7);
                    break;
                case 8:
                    str5 = B2.b.d(parcel, n7);
                    break;
                case 9:
                    z7 = B2.b.j(parcel, n7);
                    break;
                case 10:
                    z9 = B2.b.j(parcel, n7);
                    break;
                case 11:
                    j14 = B2.b.q(parcel, n7);
                    break;
                case N4.h.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                    str6 = B2.b.d(parcel, n7);
                    break;
                case N4.h.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                    j9 = B2.b.q(parcel, n7);
                    break;
                case 14:
                    j10 = B2.b.q(parcel, n7);
                    break;
                case 15:
                    i7 = B2.b.p(parcel, n7);
                    break;
                case 16:
                    z8 = B2.b.j(parcel, n7);
                    break;
                case 17:
                case 20:
                case 33:
                default:
                    B2.b.t(parcel, n7);
                    break;
                case 18:
                    z10 = B2.b.j(parcel, n7);
                    break;
                case 19:
                    str7 = B2.b.d(parcel, n7);
                    break;
                case 21:
                    bool = B2.b.k(parcel, n7);
                    break;
                case 22:
                    j11 = B2.b.q(parcel, n7);
                    break;
                case 23:
                    arrayList = B2.b.e(parcel, n7);
                    break;
                case 24:
                    str8 = B2.b.d(parcel, n7);
                    break;
                case 25:
                    str10 = B2.b.d(parcel, n7);
                    break;
                case 26:
                    str11 = B2.b.d(parcel, n7);
                    break;
                case 27:
                    str9 = B2.b.d(parcel, n7);
                    break;
                case 28:
                    z11 = B2.b.j(parcel, n7);
                    break;
                case 29:
                    j12 = B2.b.q(parcel, n7);
                    break;
                case 30:
                    i9 = B2.b.p(parcel, n7);
                    break;
                case 31:
                    str12 = B2.b.d(parcel, n7);
                    break;
                case 32:
                    i8 = B2.b.p(parcel, n7);
                    break;
                case 34:
                    j13 = B2.b.q(parcel, n7);
                    break;
            }
        }
        B2.b.h(parcel, u7);
        return new W5(str, str2, str3, str4, j7, j8, str5, z7, z9, j14, str6, j9, j10, i7, z8, z10, str7, bool, j11, arrayList, str8, str10, str11, str9, z11, j12, i9, str12, i8, j13);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new W5[i7];
    }
}
