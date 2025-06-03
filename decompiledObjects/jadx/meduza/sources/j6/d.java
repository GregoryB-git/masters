package j6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import m6.h;

/* loaded from: classes.dex */
public final class d extends n6.a {
    public static final Parcelable.Creator<d> CREATOR = new o();

    /* renamed from: a, reason: collision with root package name */
    public final String f8480a;

    /* renamed from: b, reason: collision with root package name */
    @Deprecated
    public final int f8481b;

    /* renamed from: c, reason: collision with root package name */
    public final long f8482c;

    public d(String str, int i10, long j10) {
        this.f8480a = str;
        this.f8481b = i10;
        this.f8482c = j10;
    }

    public d(String str, long j10) {
        this.f8480a = str;
        this.f8482c = j10;
        this.f8481b = -1;
    }

    public final long D() {
        long j10 = this.f8482c;
        return j10 == -1 ? this.f8481b : j10;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof d) {
            d dVar = (d) obj;
            String str = this.f8480a;
            if (((str != null && str.equals(dVar.f8480a)) || (this.f8480a == null && dVar.f8480a == null)) && D() == dVar.D()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f8480a, Long.valueOf(D())});
    }

    public final String toString() {
        h.a aVar = new h.a(this);
        aVar.a(this.f8480a, "name");
        aVar.a(Long.valueOf(D()), "version");
        return aVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int J = b.z.J(20293, parcel);
        b.z.F(parcel, 1, this.f8480a, false);
        b.z.z(parcel, 2, this.f8481b);
        b.z.C(parcel, 3, D());
        b.z.L(J, parcel);
    }
}
