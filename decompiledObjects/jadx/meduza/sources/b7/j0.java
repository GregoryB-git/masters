package b7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class j0 extends n6.a {
    public static final Parcelable.Creator<j0> CREATOR = new k0();

    /* renamed from: a, reason: collision with root package name */
    public final long f1972a;

    public j0(long j10) {
        Long valueOf = Long.valueOf(j10);
        m6.j.i(valueOf);
        this.f1972a = valueOf.longValue();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof j0) && this.f1972a == ((j0) obj).f1972a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f1972a)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int J = b.z.J(20293, parcel);
        b.z.C(parcel, 1, this.f1972a);
        b.z.L(J, parcel);
    }
}
