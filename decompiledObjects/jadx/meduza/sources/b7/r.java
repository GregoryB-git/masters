package b7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class r extends n6.a {
    public static final Parcelable.Creator<r> CREATOR = new f2();

    /* renamed from: a, reason: collision with root package name */
    public final String f1995a;

    public r(String str) {
        m6.j.i(str);
        this.f1995a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof r) {
            return this.f1995a.equals(((r) obj).f1995a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f1995a});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int J = b.z.J(20293, parcel);
        b.z.F(parcel, 2, this.f1995a, false);
        b.z.L(J, parcel);
    }
}
