package b7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class f extends n6.a {
    public static final Parcelable.Creator<f> CREATOR = new m1();

    /* renamed from: a, reason: collision with root package name */
    public final boolean f1952a;

    public f(boolean z10) {
        this.f1952a = z10;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof f) && this.f1952a == ((f) obj).f1952a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f1952a)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int J = b.z.J(20293, parcel);
        b.z.t(parcel, 1, this.f1952a);
        b.z.L(J, parcel);
    }
}
