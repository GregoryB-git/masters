package z5;

import android.os.Parcel;
import android.os.Parcelable;
import b.z;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class a extends n6.a {
    public static final Parcelable.Creator<a> CREATOR = new f();

    /* renamed from: a, reason: collision with root package name */
    public final int f17793a;

    /* renamed from: b, reason: collision with root package name */
    public final long f17794b;

    /* renamed from: c, reason: collision with root package name */
    public final String f17795c;

    /* renamed from: d, reason: collision with root package name */
    public final int f17796d;

    /* renamed from: e, reason: collision with root package name */
    public final int f17797e;
    public final String f;

    public a(int i10, long j10, String str, int i11, int i12, String str2) {
        this.f17793a = i10;
        this.f17794b = j10;
        m6.j.i(str);
        this.f17795c = str;
        this.f17796d = i11;
        this.f17797e = i12;
        this.f = str2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        a aVar = (a) obj;
        return this.f17793a == aVar.f17793a && this.f17794b == aVar.f17794b && m6.h.a(this.f17795c, aVar.f17795c) && this.f17796d == aVar.f17796d && this.f17797e == aVar.f17797e && m6.h.a(this.f, aVar.f);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f17793a), Long.valueOf(this.f17794b), this.f17795c, Integer.valueOf(this.f17796d), Integer.valueOf(this.f17797e), this.f});
    }

    public final String toString() {
        int i10 = this.f17796d;
        String str = i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? "UNKNOWN" : "RENAMED_TO" : "RENAMED_FROM" : "REMOVED" : "ADDED";
        return "AccountChangeEvent {accountName = " + this.f17795c + ", changeType = " + str + ", changeData = " + this.f + ", eventIndex = " + this.f17797e + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int J = z.J(20293, parcel);
        z.z(parcel, 1, this.f17793a);
        z.C(parcel, 2, this.f17794b);
        z.F(parcel, 3, this.f17795c, false);
        z.z(parcel, 4, this.f17796d);
        z.z(parcel, 5, this.f17797e);
        z.F(parcel, 6, this.f, false);
        z.L(J, parcel);
    }
}
