package b7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class e0 extends n6.a {
    public static final Parcelable.Creator<e0> CREATOR = new d1();

    /* renamed from: a, reason: collision with root package name */
    public final boolean f1951a;

    public e0(boolean z10) {
        this.f1951a = z10;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof e0) && this.f1951a == ((e0) obj).f1951a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f1951a)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int J = b.z.J(20293, parcel);
        b.z.t(parcel, 1, this.f1951a);
        b.z.L(J, parcel);
    }
}
