package x2;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: x2.G, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2177G implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int u7 = B2.b.u(parcel);
        String str = null;
        IBinder iBinder = null;
        boolean z7 = false;
        boolean z8 = false;
        boolean z9 = false;
        while (parcel.dataPosition() < u7) {
            int n7 = B2.b.n(parcel);
            int i7 = B2.b.i(n7);
            if (i7 == 1) {
                str = B2.b.d(parcel, n7);
            } else if (i7 == 2) {
                z7 = B2.b.j(parcel, n7);
            } else if (i7 == 3) {
                z8 = B2.b.j(parcel, n7);
            } else if (i7 == 4) {
                iBinder = B2.b.o(parcel, n7);
            } else if (i7 != 5) {
                B2.b.t(parcel, n7);
            } else {
                z9 = B2.b.j(parcel, n7);
            }
        }
        B2.b.h(parcel, u7);
        return new C2176F(str, z7, z8, iBinder, z9);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new C2176F[i7];
    }
}
