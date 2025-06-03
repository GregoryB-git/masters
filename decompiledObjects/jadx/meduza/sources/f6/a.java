package f6;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import b.z;

/* loaded from: classes.dex */
public final class a extends n6.a {
    public static final Parcelable.Creator<a> CREATOR = new c();

    /* renamed from: a, reason: collision with root package name */
    public final String f5460a;

    /* renamed from: b, reason: collision with root package name */
    public final int f5461b;

    /* renamed from: c, reason: collision with root package name */
    public final long f5462c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f5463d;

    /* renamed from: e, reason: collision with root package name */
    public final int f5464e;
    public final Bundle f;

    public a(int i10, String str, int i11, long j10, byte[] bArr, Bundle bundle) {
        this.f5464e = i10;
        this.f5460a = str;
        this.f5461b = i11;
        this.f5462c = j10;
        this.f5463d = bArr;
        this.f = bundle;
    }

    public final String toString() {
        return "ProxyRequest[ url: " + this.f5460a + ", method: " + this.f5461b + " ]";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int J = z.J(20293, parcel);
        z.F(parcel, 1, this.f5460a, false);
        z.z(parcel, 2, this.f5461b);
        z.C(parcel, 3, this.f5462c);
        z.w(parcel, 4, this.f5463d, false);
        z.v(parcel, 5, this.f, false);
        z.z(parcel, 1000, this.f5464e);
        z.L(J, parcel);
    }
}
