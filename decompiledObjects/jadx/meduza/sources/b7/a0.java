package b7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class a0 extends n6.a {
    public static final Parcelable.Creator<a0> CREATOR = new z0();

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f1918a;

    /* renamed from: b, reason: collision with root package name */
    public final String f1919b;

    /* renamed from: c, reason: collision with root package name */
    public final String f1920c;

    /* renamed from: d, reason: collision with root package name */
    public final String f1921d;

    public a0(String str, String str2, String str3, byte[] bArr) {
        m6.j.i(bArr);
        this.f1918a = bArr;
        m6.j.i(str);
        this.f1919b = str;
        this.f1920c = str2;
        m6.j.i(str3);
        this.f1921d = str3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj;
        return Arrays.equals(this.f1918a, a0Var.f1918a) && m6.h.a(this.f1919b, a0Var.f1919b) && m6.h.a(this.f1920c, a0Var.f1920c) && m6.h.a(this.f1921d, a0Var.f1921d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f1918a, this.f1919b, this.f1920c, this.f1921d});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int J = b.z.J(20293, parcel);
        b.z.w(parcel, 2, this.f1918a, false);
        b.z.F(parcel, 3, this.f1919b, false);
        b.z.F(parcel, 4, this.f1920c, false);
        b.z.F(parcel, 5, this.f1921d, false);
        b.z.L(J, parcel);
    }
}
