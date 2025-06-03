package b8;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

/* loaded from: classes.dex */
public final class h extends f {
    public static final Parcelable.Creator<h> CREATOR = new f1();

    /* renamed from: a, reason: collision with root package name */
    public String f2080a;

    /* renamed from: b, reason: collision with root package name */
    public String f2081b;

    /* renamed from: c, reason: collision with root package name */
    public final String f2082c;

    /* renamed from: d, reason: collision with root package name */
    public String f2083d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f2084e;

    public h(String str, String str2, String str3, String str4, boolean z10) {
        m6.j.e(str);
        this.f2080a = str;
        if (TextUtils.isEmpty(str2) && TextUtils.isEmpty(str3)) {
            throw new IllegalArgumentException("Cannot create an EmailAuthCredential without a password or emailLink.");
        }
        this.f2081b = str2;
        this.f2082c = str3;
        this.f2083d = str4;
        this.f2084e = z10;
    }

    @Override // b8.f
    public final String D() {
        return "password";
    }

    @Override // b8.f
    public final String E() {
        return !TextUtils.isEmpty(this.f2081b) ? "password" : "emailLink";
    }

    @Override // b8.f
    public final f F() {
        return new h(this.f2080a, this.f2081b, this.f2082c, this.f2083d, this.f2084e);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int J = b.z.J(20293, parcel);
        b.z.F(parcel, 1, this.f2080a, false);
        b.z.F(parcel, 2, this.f2081b, false);
        b.z.F(parcel, 3, this.f2082c, false);
        b.z.F(parcel, 4, this.f2083d, false);
        b.z.t(parcel, 5, this.f2084e);
        b.z.L(J, parcel);
    }
}
