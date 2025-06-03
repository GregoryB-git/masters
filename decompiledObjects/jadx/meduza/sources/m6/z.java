package m6;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class z implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int u10 = n6.b.u(parcel);
        IBinder iBinder = null;
        j6.b bVar = null;
        int i10 = 0;
        boolean z10 = false;
        boolean z11 = false;
        while (parcel.dataPosition() < u10) {
            int readInt = parcel.readInt();
            char c10 = (char) readInt;
            if (c10 == 1) {
                i10 = n6.b.o(readInt, parcel);
            } else if (c10 == 2) {
                iBinder = n6.b.n(readInt, parcel);
            } else if (c10 == 3) {
                bVar = (j6.b) n6.b.e(parcel, readInt, j6.b.CREATOR);
            } else if (c10 == 4) {
                z10 = n6.b.k(readInt, parcel);
            } else if (c10 != 5) {
                n6.b.t(readInt, parcel);
            } else {
                z11 = n6.b.k(readInt, parcel);
            }
        }
        n6.b.j(u10, parcel);
        return new com.google.android.gms.common.internal.f(i10, iBinder, bVar, z10, z11);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new com.google.android.gms.common.internal.f[i10];
    }
}
