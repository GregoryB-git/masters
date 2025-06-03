package A2;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class T implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int u7 = B2.b.u(parcel);
        int i7 = 0;
        boolean z7 = false;
        boolean z8 = false;
        int i8 = 0;
        int i9 = 0;
        while (parcel.dataPosition() < u7) {
            int n7 = B2.b.n(parcel);
            int i10 = B2.b.i(n7);
            if (i10 == 1) {
                i7 = B2.b.p(parcel, n7);
            } else if (i10 == 2) {
                z7 = B2.b.j(parcel, n7);
            } else if (i10 == 3) {
                z8 = B2.b.j(parcel, n7);
            } else if (i10 == 4) {
                i8 = B2.b.p(parcel, n7);
            } else if (i10 != 5) {
                B2.b.t(parcel, n7);
            } else {
                i9 = B2.b.p(parcel, n7);
            }
        }
        B2.b.h(parcel, u7);
        return new C0330p(i7, z7, z8, i8, i9);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new C0330p[i7];
    }
}
