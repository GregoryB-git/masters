package A2;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import x2.C2188b;

/* loaded from: classes.dex */
public final class J implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int u7 = B2.b.u(parcel);
        int i7 = 0;
        boolean z7 = false;
        boolean z8 = false;
        IBinder iBinder = null;
        C2188b c2188b = null;
        while (parcel.dataPosition() < u7) {
            int n7 = B2.b.n(parcel);
            int i8 = B2.b.i(n7);
            if (i8 == 1) {
                i7 = B2.b.p(parcel, n7);
            } else if (i8 == 2) {
                iBinder = B2.b.o(parcel, n7);
            } else if (i8 == 3) {
                c2188b = (C2188b) B2.b.c(parcel, n7, C2188b.CREATOR);
            } else if (i8 == 4) {
                z7 = B2.b.j(parcel, n7);
            } else if (i8 != 5) {
                B2.b.t(parcel, n7);
            } else {
                z8 = B2.b.j(parcel, n7);
            }
        }
        B2.b.h(parcel, u7);
        return new I(i7, iBinder, c2188b, z7, z8);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new I[i7];
    }
}
