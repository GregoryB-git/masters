package b7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class n1 extends n6.a {
    public static final Parcelable.Creator<n1> CREATOR = new o1();

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f1984a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f1985b;

    public n1(byte[] bArr, byte[] bArr2) {
        this.f1984a = bArr;
        this.f1985b = bArr2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof n1)) {
            return false;
        }
        n1 n1Var = (n1) obj;
        return Arrays.equals(this.f1984a, n1Var.f1984a) && Arrays.equals(this.f1985b, n1Var.f1985b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f1984a, this.f1985b});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int J = b.z.J(20293, parcel);
        b.z.w(parcel, 1, this.f1984a, false);
        b.z.w(parcel, 2, this.f1985b, false);
        b.z.L(J, parcel);
    }
}
