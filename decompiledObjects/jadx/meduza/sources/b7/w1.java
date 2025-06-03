package b7;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class w1 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int u10 = n6.b.u(parcel);
        x xVar = null;
        Uri uri = null;
        byte[] bArr = null;
        while (parcel.dataPosition() < u10) {
            int readInt = parcel.readInt();
            char c10 = (char) readInt;
            if (c10 == 2) {
                xVar = (x) n6.b.e(parcel, readInt, x.CREATOR);
            } else if (c10 == 3) {
                uri = (Uri) n6.b.e(parcel, readInt, Uri.CREATOR);
            } else if (c10 != 4) {
                n6.b.t(readInt, parcel);
            } else {
                bArr = n6.b.c(readInt, parcel);
            }
        }
        n6.b.j(u10, parcel);
        return new m(xVar, uri, bArr);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new m[i10];
    }
}
