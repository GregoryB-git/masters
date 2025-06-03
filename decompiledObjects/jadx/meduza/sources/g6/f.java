package g6;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class f implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int u10 = n6.b.u(parcel);
        ArrayList arrayList = null;
        int i10 = 0;
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        ArrayList arrayList2 = null;
        Account account = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        while (parcel.dataPosition() < u10) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    i10 = n6.b.o(readInt, parcel);
                    break;
                case 2:
                    arrayList2 = n6.b.i(parcel, readInt, Scope.CREATOR);
                    break;
                case 3:
                    account = (Account) n6.b.e(parcel, readInt, Account.CREATOR);
                    break;
                case 4:
                    z10 = n6.b.k(readInt, parcel);
                    break;
                case 5:
                    z11 = n6.b.k(readInt, parcel);
                    break;
                case 6:
                    z12 = n6.b.k(readInt, parcel);
                    break;
                case 7:
                    str = n6.b.f(readInt, parcel);
                    break;
                case '\b':
                    str2 = n6.b.f(readInt, parcel);
                    break;
                case '\t':
                    arrayList = n6.b.i(parcel, readInt, h6.a.CREATOR);
                    break;
                case '\n':
                    str3 = n6.b.f(readInt, parcel);
                    break;
                default:
                    n6.b.t(readInt, parcel);
                    break;
            }
        }
        n6.b.j(u10, parcel);
        return new GoogleSignInOptions(i10, arrayList2, account, z10, z11, z12, str, str2, GoogleSignInOptions.F(arrayList), str3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new GoogleSignInOptions[i10];
    }
}
