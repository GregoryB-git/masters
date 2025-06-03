package c7;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class j implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int u10 = n6.b.u(parcel);
        String str = null;
        String str2 = null;
        int i10 = 0;
        byte[] bArr = null;
        while (parcel.dataPosition() < u10) {
            int readInt = parcel.readInt();
            char c10 = (char) readInt;
            if (c10 == 1) {
                i10 = n6.b.o(readInt, parcel);
            } else if (c10 == 2) {
                str = n6.b.f(readInt, parcel);
            } else if (c10 == 3) {
                bArr = n6.b.c(readInt, parcel);
            } else if (c10 != 4) {
                n6.b.t(readInt, parcel);
            } else {
                str2 = n6.b.f(readInt, parcel);
            }
        }
        n6.b.j(u10, parcel);
        return new d(i10, str, str2, bArr);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new d[i10];
    }
}
