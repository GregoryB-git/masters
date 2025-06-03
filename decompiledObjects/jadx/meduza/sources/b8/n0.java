package b8;

import android.os.Parcel;
import android.os.Parcelable;
import io.flutter.plugins.firebase.auth.Constants;

/* loaded from: classes.dex */
public final class n0 extends f {
    public static final Parcelable.Creator<n0> CREATOR = new z0();

    /* renamed from: a, reason: collision with root package name */
    public String f2117a;

    /* renamed from: b, reason: collision with root package name */
    public String f2118b;

    public n0(String str, String str2) {
        m6.j.e(str);
        this.f2117a = str;
        m6.j.e(str2);
        this.f2118b = str2;
    }

    @Override // b8.f
    public final String D() {
        return Constants.SIGN_IN_METHOD_TWITTER;
    }

    @Override // b8.f
    public final String E() {
        return Constants.SIGN_IN_METHOD_TWITTER;
    }

    @Override // b8.f
    public final f F() {
        return new n0(this.f2117a, this.f2118b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int J = b.z.J(20293, parcel);
        b.z.F(parcel, 1, this.f2117a, false);
        b.z.F(parcel, 2, this.f2118b, false);
        b.z.L(J, parcel);
    }
}
