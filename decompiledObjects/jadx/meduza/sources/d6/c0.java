package d6;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class c0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int u10 = n6.b.u(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        Uri uri = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        b7.t tVar = null;
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
                    str3 = n6.b.f(readInt, parcel);
                    break;
                case 4:
                    str4 = n6.b.f(readInt, parcel);
                    break;
                case 5:
                    uri = (Uri) n6.b.e(parcel, readInt, Uri.CREATOR);
                    break;
                case 6:
                    str5 = n6.b.f(readInt, parcel);
                    break;
                case 7:
                    str6 = n6.b.f(readInt, parcel);
                    break;
                case '\b':
                    str7 = n6.b.f(readInt, parcel);
                    break;
                case '\t':
                    tVar = (b7.t) n6.b.e(parcel, readInt, b7.t.CREATOR);
                    break;
                default:
                    n6.b.t(readInt, parcel);
                    break;
            }
        }
        n6.b.j(u10, parcel);
        return new k(str, str2, str3, str4, uri, str5, str6, str7, tVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new k[i10];
    }
}
