package d6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class l extends n6.a {
    public static final Parcelable.Creator<l> CREATOR = new e0();

    /* renamed from: a, reason: collision with root package name */
    public final String f3577a;

    /* renamed from: b, reason: collision with root package name */
    public final String f3578b;

    public l(String str, String str2) {
        if (str == null) {
            throw new NullPointerException("Account identifier cannot be null");
        }
        String trim = str.trim();
        m6.j.f("Account identifier cannot be empty", trim);
        this.f3577a = trim;
        m6.j.e(str2);
        this.f3578b = str2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return m6.h.a(this.f3577a, lVar.f3577a) && m6.h.a(this.f3578b, lVar.f3578b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f3577a, this.f3578b});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int J = b.z.J(20293, parcel);
        b.z.F(parcel, 1, this.f3577a, false);
        b.z.F(parcel, 2, this.f3578b, false);
        b.z.L(J, parcel);
    }
}
