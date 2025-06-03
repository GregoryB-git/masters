package f6;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class c implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int u10 = n6.b.u(parcel);
        int i10 = 0;
        int i11 = 0;
        String str = null;
        byte[] bArr = null;
        Bundle bundle = null;
        long j10 = 0;
        while (parcel.dataPosition() < u10) {
            int readInt = parcel.readInt();
            char c10 = (char) readInt;
            if (c10 == 1) {
                str = n6.b.f(readInt, parcel);
            } else if (c10 == 2) {
                i11 = n6.b.o(readInt, parcel);
            } else if (c10 == 3) {
                j10 = n6.b.q(readInt, parcel);
            } else if (c10 == 4) {
                bArr = n6.b.c(readInt, parcel);
            } else if (c10 == 5) {
                bundle = n6.b.b(readInt, parcel);
            } else if (c10 != 1000) {
                n6.b.t(readInt, parcel);
            } else {
                i10 = n6.b.o(readInt, parcel);
            }
        }
        n6.b.j(u10, parcel);
        return new a(i10, str, i11, j10, bArr, bundle);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new a[i10];
    }
}
