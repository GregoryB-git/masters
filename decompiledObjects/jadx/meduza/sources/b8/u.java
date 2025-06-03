package b8;

import android.os.Parcel;
import android.os.Parcelable;
import io.flutter.plugins.firebase.auth.Constants;

/* loaded from: classes.dex */
public final class u extends f {
    public static final Parcelable.Creator<u> CREATOR = new s0();

    /* renamed from: a, reason: collision with root package name */
    public final String f2143a;

    /* renamed from: b, reason: collision with root package name */
    public final String f2144b;

    public u(String str, String str2) {
        if (str == null && str2 == null) {
            throw new IllegalArgumentException("Must specify an idToken or an accessToken.");
        }
        if (str != null && str.length() == 0) {
            throw new IllegalArgumentException("idToken cannot be empty");
        }
        if (str2 != null && str2.length() == 0) {
            throw new IllegalArgumentException("accessToken cannot be empty");
        }
        this.f2143a = str;
        this.f2144b = str2;
    }

    @Override // b8.f
    public final String D() {
        return Constants.SIGN_IN_METHOD_GOOGLE;
    }

    @Override // b8.f
    public final String E() {
        return Constants.SIGN_IN_METHOD_GOOGLE;
    }

    @Override // b8.f
    public final f F() {
        return new u(this.f2143a, this.f2144b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int J = b.z.J(20293, parcel);
        b.z.F(parcel, 1, this.f2143a, false);
        b.z.F(parcel, 2, this.f2144b, false);
        b.z.L(J, parcel);
    }
}
