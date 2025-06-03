package b7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class g0 extends n6.a {
    public static final Parcelable.Creator<g0> CREATOR = new j1();

    /* renamed from: a, reason: collision with root package name */
    public final int f1959a;

    /* renamed from: b, reason: collision with root package name */
    public final short f1960b;

    /* renamed from: c, reason: collision with root package name */
    public final short f1961c;

    public g0(int i10, short s10, short s11) {
        this.f1959a = i10;
        this.f1960b = s10;
        this.f1961c = s11;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof g0)) {
            return false;
        }
        g0 g0Var = (g0) obj;
        return this.f1959a == g0Var.f1959a && this.f1960b == g0Var.f1960b && this.f1961c == g0Var.f1961c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f1959a), Short.valueOf(this.f1960b), Short.valueOf(this.f1961c)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int J = b.z.J(20293, parcel);
        b.z.z(parcel, 1, this.f1959a);
        short s10 = this.f1960b;
        parcel.writeInt(262146);
        parcel.writeInt(s10);
        short s11 = this.f1961c;
        parcel.writeInt(262147);
        parcel.writeInt(s11);
        b.z.L(J, parcel);
    }
}
