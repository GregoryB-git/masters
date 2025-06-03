package b8;

import android.os.Parcel;
import android.os.Parcelable;
import io.flutter.plugins.firebase.auth.Constants;

/* loaded from: classes.dex */
public final class t extends f {
    public static final Parcelable.Creator<t> CREATOR = new r0();

    /* renamed from: a, reason: collision with root package name */
    public String f2139a;

    public t(String str) {
        m6.j.e(str);
        this.f2139a = str;
    }

    @Override // b8.f
    public final String D() {
        return Constants.SIGN_IN_METHOD_GITHUB;
    }

    @Override // b8.f
    public final String E() {
        return Constants.SIGN_IN_METHOD_GITHUB;
    }

    @Override // b8.f
    public final f F() {
        return new t(this.f2139a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int J = b.z.J(20293, parcel);
        b.z.F(parcel, 1, this.f2139a, false);
        b.z.L(J, parcel);
    }
}
