/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.accounts.Account
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 */
package A2;

import A2.H;
import B2.a;
import B2.c;
import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;

public final class G
extends a {
    public static final Parcelable.Creator<G> CREATOR = new H();
    public final int o;
    public final Account p;
    public final int q;
    public final GoogleSignInAccount r;

    public G(int n8, Account account, int n9, GoogleSignInAccount googleSignInAccount) {
        this.o = n8;
        this.p = account;
        this.q = n9;
        this.r = googleSignInAccount;
    }

    public G(Account account, int n8, GoogleSignInAccount googleSignInAccount) {
        this(2, account, n8, googleSignInAccount);
    }

    public final void writeToParcel(Parcel parcel, int n8) {
        int n9 = c.a(parcel);
        c.i(parcel, 1, this.o);
        c.m(parcel, 2, (Parcelable)this.p, n8, false);
        c.i(parcel, 3, this.q);
        c.m(parcel, 4, this.r, n8, false);
        c.b(parcel, n9);
    }
}

