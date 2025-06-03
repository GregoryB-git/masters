package b7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class o0 extends n6.a {
    public static final Parcelable.Creator<o0> CREATOR = new p0();

    /* renamed from: a, reason: collision with root package name */
    public final String f1987a;

    public o0(String str) {
        m6.j.i(str);
        this.f1987a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof o0) {
            return this.f1987a.equals(((o0) obj).f1987a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f1987a});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int J = b.z.J(20293, parcel);
        b.z.F(parcel, 1, this.f1987a, false);
        b.z.L(J, parcel);
    }
}
