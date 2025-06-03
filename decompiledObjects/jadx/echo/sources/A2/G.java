package A2;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;

/* loaded from: classes.dex */
public final class G extends B2.a {
    public static final Parcelable.Creator<G> CREATOR = new H();

    /* renamed from: o, reason: collision with root package name */
    public final int f376o;

    /* renamed from: p, reason: collision with root package name */
    public final Account f377p;

    /* renamed from: q, reason: collision with root package name */
    public final int f378q;

    /* renamed from: r, reason: collision with root package name */
    public final GoogleSignInAccount f379r;

    public G(int i7, Account account, int i8, GoogleSignInAccount googleSignInAccount) {
        this.f376o = i7;
        this.f377p = account;
        this.f378q = i8;
        this.f379r = googleSignInAccount;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int a7 = B2.c.a(parcel);
        B2.c.i(parcel, 1, this.f376o);
        B2.c.m(parcel, 2, this.f377p, i7, false);
        B2.c.i(parcel, 3, this.f378q);
        B2.c.m(parcel, 4, this.f379r, i7, false);
        B2.c.b(parcel, a7);
    }

    public G(Account account, int i7, GoogleSignInAccount googleSignInAccount) {
        this(2, account, i7, googleSignInAccount);
    }
}
