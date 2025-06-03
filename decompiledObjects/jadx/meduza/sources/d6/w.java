package d6;

import android.os.Parcel;
import android.os.Parcelable;
import d6.b;

/* loaded from: classes.dex */
public final class w implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int u10 = n6.b.u(parcel);
        byte[] bArr = null;
        boolean z10 = false;
        String str = null;
        while (parcel.dataPosition() < u10) {
            int readInt = parcel.readInt();
            char c10 = (char) readInt;
            if (c10 == 1) {
                z10 = n6.b.k(readInt, parcel);
            } else if (c10 == 2) {
                bArr = n6.b.c(readInt, parcel);
            } else if (c10 != 3) {
                n6.b.t(readInt, parcel);
            } else {
                str = n6.b.f(readInt, parcel);
            }
        }
        n6.b.j(u10, parcel);
        return new b.c(z10, bArr, str);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new b.c[i10];
    }
}
