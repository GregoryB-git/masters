package w8;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class b implements Parcelable.Creator<a> {
    @Override // android.os.Parcelable.Creator
    public final a createFromParcel(Parcel parcel) {
        int u10 = n6.b.u(parcel);
        String str = null;
        String str2 = null;
        Bundle bundle = null;
        Uri uri = null;
        int i10 = 0;
        long j10 = 0;
        while (parcel.dataPosition() < u10) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    str = n6.b.f(readInt, parcel);
                    break;
                case 2:
                    str2 = n6.b.f(readInt, parcel);
                    break;
                case 3:
                    i10 = n6.b.o(readInt, parcel);
                    break;
                case 4:
                    j10 = n6.b.q(readInt, parcel);
                    break;
                case 5:
                    bundle = n6.b.b(readInt, parcel);
                    break;
                case 6:
                    uri = (Uri) n6.b.e(parcel, readInt, Uri.CREATOR);
                    break;
                default:
                    n6.b.t(readInt, parcel);
                    break;
            }
        }
        n6.b.j(u10, parcel);
        return new a(str, str2, i10, j10, bundle, uri);
    }

    @Override // android.os.Parcelable.Creator
    public final a[] newArray(int i10) {
        return new a[i10];
    }
}
