package A2;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;

/* loaded from: classes.dex */
public final class H implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int u7 = B2.b.u(parcel);
        int i7 = 0;
        Account account = null;
        GoogleSignInAccount googleSignInAccount = null;
        int i8 = 0;
        while (parcel.dataPosition() < u7) {
            int n7 = B2.b.n(parcel);
            int i9 = B2.b.i(n7);
            if (i9 == 1) {
                i7 = B2.b.p(parcel, n7);
            } else if (i9 == 2) {
                account = (Account) B2.b.c(parcel, n7, Account.CREATOR);
            } else if (i9 == 3) {
                i8 = B2.b.p(parcel, n7);
            } else if (i9 != 4) {
                B2.b.t(parcel, n7);
            } else {
                googleSignInAccount = (GoogleSignInAccount) B2.b.c(parcel, n7, GoogleSignInAccount.CREATOR);
            }
        }
        B2.b.h(parcel, u7);
        return new G(i7, account, i8, googleSignInAccount);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new G[i7];
    }
}
