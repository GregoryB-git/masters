package c7;

import android.os.Parcel;
import android.os.Parcelable;
import b.z;
import c7.c;
import java.util.Arrays;

@Deprecated
/* loaded from: classes.dex */
public final class d extends n6.a {
    public static final Parcelable.Creator<d> CREATOR = new j();

    /* renamed from: a, reason: collision with root package name */
    public final int f2398a;

    /* renamed from: b, reason: collision with root package name */
    public final c f2399b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f2400c;

    /* renamed from: d, reason: collision with root package name */
    public final String f2401d;

    public d(int i10, String str, String str2, byte[] bArr) {
        this.f2398a = i10;
        try {
            this.f2399b = c.f(str);
            this.f2400c = bArr;
            this.f2401d = str2;
        } catch (c.a e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (!Arrays.equals(this.f2400c, dVar.f2400c) || this.f2399b != dVar.f2399b) {
            return false;
        }
        String str = this.f2401d;
        String str2 = dVar.f2401d;
        if (str == null) {
            if (str2 != null) {
                return false;
            }
        } else if (!str.equals(str2)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = ((Arrays.hashCode(this.f2400c) + 31) * 31) + this.f2399b.hashCode();
        String str = this.f2401d;
        return (hashCode * 31) + (str == null ? 0 : str.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int J = z.J(20293, parcel);
        z.z(parcel, 1, this.f2398a);
        z.F(parcel, 2, this.f2399b.f2397a, false);
        z.w(parcel, 3, this.f2400c, false);
        z.F(parcel, 4, this.f2401d, false);
        z.L(J, parcel);
    }
}
