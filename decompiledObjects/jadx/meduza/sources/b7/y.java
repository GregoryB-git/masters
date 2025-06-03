package b7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class y extends n6.a {
    public static final Parcelable.Creator<y> CREATOR = new x0();

    /* renamed from: a, reason: collision with root package name */
    public final String f2027a;

    /* renamed from: b, reason: collision with root package name */
    public final String f2028b;

    /* renamed from: c, reason: collision with root package name */
    public final String f2029c;

    public y(String str, String str2, String str3) {
        m6.j.i(str);
        this.f2027a = str;
        m6.j.i(str2);
        this.f2028b = str2;
        this.f2029c = str3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return m6.h.a(this.f2027a, yVar.f2027a) && m6.h.a(this.f2028b, yVar.f2028b) && m6.h.a(this.f2029c, yVar.f2029c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f2027a, this.f2028b, this.f2029c});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int J = b.z.J(20293, parcel);
        b.z.F(parcel, 2, this.f2027a, false);
        b.z.F(parcel, 3, this.f2028b, false);
        b.z.F(parcel, 4, this.f2029c, false);
        b.z.L(J, parcel);
    }
}
