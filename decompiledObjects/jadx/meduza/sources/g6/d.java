package g6;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class d implements Parcelable.Creator {
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
        ArrayList arrayList = null;
        String str7 = null;
        String str8 = null;
        long j10 = 0;
        int i10 = 0;
        while (parcel.dataPosition() < u10) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    i10 = n6.b.o(readInt, parcel);
                    break;
                case 2:
                    str = n6.b.f(readInt, parcel);
                    break;
                case 3:
                    str2 = n6.b.f(readInt, parcel);
                    break;
                case 4:
                    str3 = n6.b.f(readInt, parcel);
                    break;
                case 5:
                    str4 = n6.b.f(readInt, parcel);
                    break;
                case 6:
                    uri = (Uri) n6.b.e(parcel, readInt, Uri.CREATOR);
                    break;
                case 7:
                    str5 = n6.b.f(readInt, parcel);
                    break;
                case '\b':
                    j10 = n6.b.q(readInt, parcel);
                    break;
                case '\t':
                    str6 = n6.b.f(readInt, parcel);
                    break;
                case '\n':
                    arrayList = n6.b.i(parcel, readInt, Scope.CREATOR);
                    break;
                case 11:
                    str7 = n6.b.f(readInt, parcel);
                    break;
                case '\f':
                    str8 = n6.b.f(readInt, parcel);
                    break;
                default:
                    n6.b.t(readInt, parcel);
                    break;
            }
        }
        n6.b.j(u10, parcel);
        return new GoogleSignInAccount(i10, str, str2, str3, str4, uri, str5, j10, str6, arrayList, str7, str8);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new GoogleSignInAccount[i10];
    }
}
