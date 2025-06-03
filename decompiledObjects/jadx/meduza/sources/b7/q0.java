package b7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class q0 extends n6.a {
    public static final Parcelable.Creator<q0> CREATOR = new r0();

    /* renamed from: a, reason: collision with root package name */
    public final byte[][] f1994a;

    public q0(byte[][] bArr) {
        m6.j.b(bArr != null);
        m6.j.b(1 == ((bArr.length & 1) ^ 1));
        int i10 = 0;
        while (i10 < bArr.length) {
            m6.j.b(i10 == 0 || bArr[i10] != null);
            int i11 = i10 + 1;
            m6.j.b(bArr[i11] != null);
            int length = bArr[i11].length;
            m6.j.b(length == 32 || length == 64);
            i10 += 2;
        }
        this.f1994a = bArr;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof q0) {
            return Arrays.deepEquals(this.f1994a, ((q0) obj).f1994a);
        }
        return false;
    }

    public final int hashCode() {
        int i10 = 0;
        for (byte[] bArr : this.f1994a) {
            i10 ^= Arrays.hashCode(new Object[]{bArr});
        }
        return i10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int J = b.z.J(20293, parcel);
        byte[][] bArr = this.f1994a;
        if (bArr != null) {
            int J2 = b.z.J(1, parcel);
            parcel.writeInt(bArr.length);
            for (byte[] bArr2 : bArr) {
                parcel.writeByteArray(bArr2);
            }
            b.z.L(J2, parcel);
        }
        b.z.L(J, parcel);
    }
}
