package m6;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;

/* loaded from: classes.dex */
public final class y implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int u10 = n6.b.u(parcel);
        int i10 = 0;
        Account account = null;
        GoogleSignInAccount googleSignInAccount = null;
        int i11 = 0;
        while (parcel.dataPosition() < u10) {
            int readInt = parcel.readInt();
            char c10 = (char) readInt;
            if (c10 == 1) {
                i10 = n6.b.o(readInt, parcel);
            } else if (c10 == 2) {
                account = (Account) n6.b.e(parcel, readInt, Account.CREATOR);
            } else if (c10 == 3) {
                i11 = n6.b.o(readInt, parcel);
            } else if (c10 != 4) {
                n6.b.t(readInt, parcel);
            } else {
                googleSignInAccount = (GoogleSignInAccount) n6.b.e(parcel, readInt, GoogleSignInAccount.CREATOR);
            }
        }
        n6.b.j(u10, parcel);
        return new x(i10, account, i11, googleSignInAccount);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new x[i10];
    }
}
