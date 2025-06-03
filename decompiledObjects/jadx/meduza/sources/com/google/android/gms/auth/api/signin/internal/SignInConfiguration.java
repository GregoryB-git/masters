package com.google.android.gms.auth.api.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import b.z;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import h6.r;
import m6.j;
import n6.a;

/* loaded from: classes.dex */
public final class SignInConfiguration extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<SignInConfiguration> CREATOR = new r();

    /* renamed from: a, reason: collision with root package name */
    public final String f2800a;

    /* renamed from: b, reason: collision with root package name */
    public final GoogleSignInOptions f2801b;

    public SignInConfiguration(String str, GoogleSignInOptions googleSignInOptions) {
        j.e(str);
        this.f2800a = str;
        this.f2801b = googleSignInOptions;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof SignInConfiguration)) {
            return false;
        }
        SignInConfiguration signInConfiguration = (SignInConfiguration) obj;
        if (this.f2800a.equals(signInConfiguration.f2800a)) {
            GoogleSignInOptions googleSignInOptions = this.f2801b;
            GoogleSignInOptions googleSignInOptions2 = signInConfiguration.f2801b;
            if (googleSignInOptions == null) {
                if (googleSignInOptions2 == null) {
                    return true;
                }
            } else if (googleSignInOptions.equals(googleSignInOptions2)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f2800a;
        int hashCode = (1 * 31) + (str == null ? 0 : str.hashCode());
        GoogleSignInOptions googleSignInOptions = this.f2801b;
        return (hashCode * 31) + (googleSignInOptions != null ? googleSignInOptions.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        String str = this.f2800a;
        int J = z.J(20293, parcel);
        z.F(parcel, 2, str, false);
        z.E(parcel, 5, this.f2801b, i10, false);
        z.L(J, parcel);
    }
}
