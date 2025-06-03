package w8;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import w8.d;

/* loaded from: classes.dex */
public final class e implements Parcelable.Creator<d> {
    @Override // android.os.Parcelable.Creator
    public final d createFromParcel(Parcel parcel) {
        int u10 = n6.b.u(parcel);
        Uri uri = null;
        Uri uri2 = null;
        ArrayList arrayList = null;
        while (parcel.dataPosition() < u10) {
            int readInt = parcel.readInt();
            char c10 = (char) readInt;
            if (c10 == 1) {
                uri = (Uri) n6.b.e(parcel, readInt, Uri.CREATOR);
            } else if (c10 == 2) {
                uri2 = (Uri) n6.b.e(parcel, readInt, Uri.CREATOR);
            } else if (c10 != 3) {
                n6.b.t(readInt, parcel);
            } else {
                arrayList = n6.b.i(parcel, readInt, d.a.CREATOR);
            }
        }
        n6.b.j(u10, parcel);
        return new d(uri, uri2, arrayList);
    }

    @Override // android.os.Parcelable.Creator
    public final d[] newArray(int i10) {
        return new d[i10];
    }
}
