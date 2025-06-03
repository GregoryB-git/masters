package b8;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import io.flutter.plugins.firebase.auth.Constants;

/* loaded from: classes.dex */
public final class c0 extends f implements Cloneable {
    public static final Parcelable.Creator<c0> CREATOR = new v0();

    /* renamed from: a, reason: collision with root package name */
    public String f2054a;

    /* renamed from: b, reason: collision with root package name */
    public String f2055b;

    /* renamed from: c, reason: collision with root package name */
    public String f2056c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f2057d;

    /* renamed from: e, reason: collision with root package name */
    public String f2058e;

    public c0(String str, String str2, String str3, String str4, boolean z10) {
        m6.j.a("Cannot create PhoneAuthCredential without either sessionInfo + smsCode or temporary proof + phoneNumber.", ((TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) && (TextUtils.isEmpty(str3) || TextUtils.isEmpty(str4))) ? false : true);
        this.f2054a = str;
        this.f2055b = str2;
        this.f2056c = str3;
        this.f2057d = z10;
        this.f2058e = str4;
    }

    public static c0 G(String str, String str2) {
        return new c0(str, str2, null, null, true);
    }

    @Override // b8.f
    public final String D() {
        return Constants.SIGN_IN_METHOD_PHONE;
    }

    @Override // b8.f
    public final String E() {
        return Constants.SIGN_IN_METHOD_PHONE;
    }

    @Override // b8.f
    public final f F() {
        return (c0) clone();
    }

    public final Object clone() {
        return new c0(this.f2054a, this.f2055b, this.f2056c, this.f2058e, this.f2057d);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int J = b.z.J(20293, parcel);
        b.z.F(parcel, 1, this.f2054a, false);
        b.z.F(parcel, 2, this.f2055b, false);
        b.z.F(parcel, 4, this.f2056c, false);
        b.z.t(parcel, 5, this.f2057d);
        b.z.F(parcel, 6, this.f2058e, false);
        b.z.L(J, parcel);
    }
}
