package g6;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.SignInAccount;

/* loaded from: classes.dex */
public final class g implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int u10 = n6.b.u(parcel);
        String str = "";
        GoogleSignInAccount googleSignInAccount = null;
        String str2 = "";
        while (parcel.dataPosition() < u10) {
            int readInt = parcel.readInt();
            char c10 = (char) readInt;
            if (c10 == 4) {
                str = n6.b.f(readInt, parcel);
            } else if (c10 == 7) {
                googleSignInAccount = (GoogleSignInAccount) n6.b.e(parcel, readInt, GoogleSignInAccount.CREATOR);
            } else if (c10 != '\b') {
                n6.b.t(readInt, parcel);
            } else {
                str2 = n6.b.f(readInt, parcel);
            }
        }
        n6.b.j(u10, parcel);
        return new SignInAccount(str, googleSignInAccount, str2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new SignInAccount[i10];
    }
}
