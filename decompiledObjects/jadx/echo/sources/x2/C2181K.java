package x2;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: x2.K, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2181K implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int u7 = B2.b.u(parcel);
        String str = null;
        boolean z7 = false;
        boolean z8 = false;
        IBinder iBinder = null;
        while (parcel.dataPosition() < u7) {
            int n7 = B2.b.n(parcel);
            int i7 = B2.b.i(n7);
            if (i7 == 1) {
                str = B2.b.d(parcel, n7);
            } else if (i7 == 2) {
                iBinder = B2.b.o(parcel, n7);
            } else if (i7 == 3) {
                z7 = B2.b.j(parcel, n7);
            } else if (i7 != 4) {
                B2.b.t(parcel, n7);
            } else {
                z8 = B2.b.j(parcel, n7);
            }
        }
        B2.b.h(parcel, u7);
        return new C2180J(str, iBinder, z7, z8);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new C2180J[i7];
    }
}
