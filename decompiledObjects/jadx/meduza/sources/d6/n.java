package d6;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.identity.AuthorizationRequest;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class n implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int u10 = n6.b.u(parcel);
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        ArrayList arrayList = null;
        String str = null;
        Account account = null;
        String str2 = null;
        String str3 = null;
        while (parcel.dataPosition() < u10) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    arrayList = n6.b.i(parcel, readInt, Scope.CREATOR);
                    break;
                case 2:
                    str = n6.b.f(readInt, parcel);
                    break;
                case 3:
                    z10 = n6.b.k(readInt, parcel);
                    break;
                case 4:
                    z11 = n6.b.k(readInt, parcel);
                    break;
                case 5:
                    account = (Account) n6.b.e(parcel, readInt, Account.CREATOR);
                    break;
                case 6:
                    str2 = n6.b.f(readInt, parcel);
                    break;
                case 7:
                    str3 = n6.b.f(readInt, parcel);
                    break;
                case '\b':
                    z12 = n6.b.k(readInt, parcel);
                    break;
                default:
                    n6.b.t(readInt, parcel);
                    break;
            }
        }
        n6.b.j(u10, parcel);
        return new AuthorizationRequest(arrayList, str, z10, z11, account, str2, str3, z12);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new AuthorizationRequest[i10];
    }
}
