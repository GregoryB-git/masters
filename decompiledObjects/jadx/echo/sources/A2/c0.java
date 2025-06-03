package A2;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class c0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int u7 = B2.b.u(parcel);
        C0330p c0330p = null;
        int[] iArr = null;
        int[] iArr2 = null;
        boolean z7 = false;
        boolean z8 = false;
        int i7 = 0;
        while (parcel.dataPosition() < u7) {
            int n7 = B2.b.n(parcel);
            switch (B2.b.i(n7)) {
                case 1:
                    c0330p = (C0330p) B2.b.c(parcel, n7, C0330p.CREATOR);
                    break;
                case 2:
                    z7 = B2.b.j(parcel, n7);
                    break;
                case 3:
                    z8 = B2.b.j(parcel, n7);
                    break;
                case 4:
                    iArr = B2.b.b(parcel, n7);
                    break;
                case 5:
                    i7 = B2.b.p(parcel, n7);
                    break;
                case 6:
                    iArr2 = B2.b.b(parcel, n7);
                    break;
                default:
                    B2.b.t(parcel, n7);
                    break;
            }
        }
        B2.b.h(parcel, u7);
        return new C0319e(c0330p, z7, z8, iArr, i7, iArr2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new C0319e[i7];
    }
}
