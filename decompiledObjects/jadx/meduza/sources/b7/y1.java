package b7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class y1 extends n6.a {
    public static final Parcelable.Creator<y1> CREATOR = new z1();

    /* renamed from: a, reason: collision with root package name */
    public final long f2030a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f2031b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f2032c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f2033d;

    public y1(long j10, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.f2030a = j10;
        m6.j.i(bArr);
        this.f2031b = bArr;
        m6.j.i(bArr2);
        this.f2032c = bArr2;
        m6.j.i(bArr3);
        this.f2033d = bArr3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof y1)) {
            return false;
        }
        y1 y1Var = (y1) obj;
        return this.f2030a == y1Var.f2030a && Arrays.equals(this.f2031b, y1Var.f2031b) && Arrays.equals(this.f2032c, y1Var.f2032c) && Arrays.equals(this.f2033d, y1Var.f2033d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f2030a), this.f2031b, this.f2032c, this.f2033d});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int J = b.z.J(20293, parcel);
        b.z.C(parcel, 1, this.f2030a);
        b.z.w(parcel, 2, this.f2031b, false);
        b.z.w(parcel, 3, this.f2032c, false);
        b.z.w(parcel, 4, this.f2033d, false);
        b.z.L(J, parcel);
    }
}
