package c7;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.u2f.api.common.RegisterRequestParams;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class k implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int u10 = n6.b.u(parcel);
        Integer num = null;
        Double d10 = null;
        Uri uri = null;
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        a aVar = null;
        String str = null;
        while (parcel.dataPosition() < u10) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 2:
                    num = n6.b.p(readInt, parcel);
                    break;
                case 3:
                    d10 = n6.b.m(readInt, parcel);
                    break;
                case 4:
                    uri = (Uri) n6.b.e(parcel, readInt, Uri.CREATOR);
                    break;
                case 5:
                    arrayList = n6.b.i(parcel, readInt, d.CREATOR);
                    break;
                case 6:
                    arrayList2 = n6.b.i(parcel, readInt, e.CREATOR);
                    break;
                case 7:
                    aVar = (a) n6.b.e(parcel, readInt, a.CREATOR);
                    break;
                case '\b':
                    str = n6.b.f(readInt, parcel);
                    break;
                default:
                    n6.b.t(readInt, parcel);
                    break;
            }
        }
        n6.b.j(u10, parcel);
        return new RegisterRequestParams(num, d10, uri, arrayList, arrayList2, aVar, str);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new RegisterRequestParams[i10];
    }
}
