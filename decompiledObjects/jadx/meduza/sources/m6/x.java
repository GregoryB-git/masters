package m6;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;

/* loaded from: classes.dex */
public final class x extends n6.a {
    public static final Parcelable.Creator<x> CREATOR = new y();

    /* renamed from: a, reason: collision with root package name */
    public final int f10335a;

    /* renamed from: b, reason: collision with root package name */
    public final Account f10336b;

    /* renamed from: c, reason: collision with root package name */
    public final int f10337c;

    /* renamed from: d, reason: collision with root package name */
    public final GoogleSignInAccount f10338d;

    public x(int i10, Account account, int i11, GoogleSignInAccount googleSignInAccount) {
        this.f10335a = i10;
        this.f10336b = account;
        this.f10337c = i11;
        this.f10338d = googleSignInAccount;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f10335a;
        int J = b.z.J(20293, parcel);
        b.z.z(parcel, 1, i11);
        b.z.E(parcel, 2, this.f10336b, i10, false);
        b.z.z(parcel, 3, this.f10337c);
        b.z.E(parcel, 4, this.f10338d, i10, false);
        b.z.L(J, parcel);
    }
}
