package b7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class l0 extends n6.a {
    public static final Parcelable.Creator<l0> CREATOR = new m0();

    /* renamed from: a, reason: collision with root package name */
    public final boolean f1980a;

    public l0(boolean z10) {
        Boolean valueOf = Boolean.valueOf(z10);
        m6.j.i(valueOf);
        this.f1980a = valueOf.booleanValue();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof l0) && this.f1980a == ((l0) obj).f1980a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f1980a)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int J = b.z.J(20293, parcel);
        b.z.t(parcel, 1, this.f1980a);
        b.z.L(J, parcel);
    }
}
