package t2;

import B2.b;
import N4.h;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;

/* renamed from: t2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1988a implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int u7 = b.u(parcel);
        int i7 = 0;
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
        long j7 = 0;
        while (parcel.dataPosition() < u7) {
            int n7 = b.n(parcel);
            switch (b.i(n7)) {
                case 1:
                    i7 = b.p(parcel, n7);
                    break;
                case 2:
                    str = b.d(parcel, n7);
                    break;
                case 3:
                    str2 = b.d(parcel, n7);
                    break;
                case 4:
                    str3 = b.d(parcel, n7);
                    break;
                case 5:
                    str4 = b.d(parcel, n7);
                    break;
                case 6:
                    uri = (Uri) b.c(parcel, n7, Uri.CREATOR);
                    break;
                case 7:
                    str5 = b.d(parcel, n7);
                    break;
                case 8:
                    j7 = b.q(parcel, n7);
                    break;
                case 9:
                    str6 = b.d(parcel, n7);
                    break;
                case 10:
                    arrayList = b.g(parcel, n7, Scope.CREATOR);
                    break;
                case 11:
                    str7 = b.d(parcel, n7);
                    break;
                case h.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                    str8 = b.d(parcel, n7);
                    break;
                default:
                    b.t(parcel, n7);
                    break;
            }
        }
        b.h(parcel, u7);
        return new GoogleSignInAccount(i7, str, str2, str3, str4, uri, str5, j7, str6, arrayList, str7, str8);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new GoogleSignInAccount[i7];
    }
}
