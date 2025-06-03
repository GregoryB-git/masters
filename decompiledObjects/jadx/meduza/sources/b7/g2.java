package b7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class g2 extends n6.a {
    public static final Parcelable.Creator<g2> CREATOR = new i0();

    /* renamed from: a, reason: collision with root package name */
    public final boolean f1964a;

    public g2(boolean z10) {
        Boolean valueOf = Boolean.valueOf(z10);
        m6.j.i(valueOf);
        this.f1964a = valueOf.booleanValue();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof g2) && this.f1964a == ((g2) obj).f1964a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f1964a)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int J = b.z.J(20293, parcel);
        b.z.t(parcel, 1, this.f1964a);
        b.z.L(J, parcel);
    }
}
