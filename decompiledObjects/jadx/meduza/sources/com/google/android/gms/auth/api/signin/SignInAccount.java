package com.google.android.gms.auth.api.signin;

import android.os.Parcel;
import android.os.Parcelable;
import b.z;
import com.google.android.gms.common.internal.ReflectedParcelable;
import g6.g;
import m6.j;
import n6.a;

/* loaded from: classes.dex */
public class SignInAccount extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<SignInAccount> CREATOR = new g();

    /* renamed from: a, reason: collision with root package name */
    @Deprecated
    public final String f2797a;

    /* renamed from: b, reason: collision with root package name */
    public final GoogleSignInAccount f2798b;

    /* renamed from: c, reason: collision with root package name */
    @Deprecated
    public final String f2799c;

    public SignInAccount(String str, GoogleSignInAccount googleSignInAccount, String str2) {
        this.f2798b = googleSignInAccount;
        j.f("8.3 and 8.4 SDKs require non-null email", str);
        this.f2797a = str;
        j.f("8.3 and 8.4 SDKs require non-null userId", str2);
        this.f2799c = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        String str = this.f2797a;
        int J = z.J(20293, parcel);
        z.F(parcel, 4, str, false);
        z.E(parcel, 7, this.f2798b, i10, false);
        z.F(parcel, 8, this.f2799c, false);
        z.L(J, parcel);
    }
}
