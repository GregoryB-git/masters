package b7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class s extends n6.a {
    public static final Parcelable.Creator<s> CREATOR = new n0();

    /* renamed from: a, reason: collision with root package name */
    public final boolean f1996a;

    public s(boolean z10) {
        this.f1996a = z10;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof s) && this.f1996a == ((s) obj).f1996a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f1996a)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int J = b.z.J(20293, parcel);
        b.z.t(parcel, 1, this.f1996a);
        b.z.L(J, parcel);
    }
}
