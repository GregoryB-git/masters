package b7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class p1 extends n6.a {
    public static final Parcelable.Creator<p1> CREATOR = new q1();

    /* renamed from: a, reason: collision with root package name */
    public final boolean f1990a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f1991b;

    public p1(boolean z10, byte[] bArr) {
        this.f1990a = z10;
        this.f1991b = bArr;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof p1)) {
            return false;
        }
        p1 p1Var = (p1) obj;
        return this.f1990a == p1Var.f1990a && Arrays.equals(this.f1991b, p1Var.f1991b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f1990a), this.f1991b});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int J = b.z.J(20293, parcel);
        b.z.t(parcel, 1, this.f1990a);
        b.z.w(parcel, 2, this.f1991b, false);
        b.z.L(J, parcel);
    }
}
