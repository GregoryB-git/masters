package w8;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import b.z;

/* loaded from: classes.dex */
public final class a extends n6.a {
    public static final Parcelable.Creator<a> CREATOR = new b();

    /* renamed from: a, reason: collision with root package name */
    public String f16441a;

    /* renamed from: b, reason: collision with root package name */
    public String f16442b;

    /* renamed from: c, reason: collision with root package name */
    public int f16443c;

    /* renamed from: d, reason: collision with root package name */
    public long f16444d;

    /* renamed from: e, reason: collision with root package name */
    public Bundle f16445e;
    public Uri f;

    public a(String str, String str2, int i10, long j10, Bundle bundle, Uri uri) {
        this.f16441a = str;
        this.f16442b = str2;
        this.f16443c = i10;
        this.f16444d = j10;
        this.f16445e = bundle;
        this.f = uri;
    }

    public final Bundle D() {
        Bundle bundle = this.f16445e;
        return bundle == null ? new Bundle() : bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int J = z.J(20293, parcel);
        z.F(parcel, 1, this.f16441a, false);
        z.F(parcel, 2, this.f16442b, false);
        z.z(parcel, 3, this.f16443c);
        z.C(parcel, 4, this.f16444d);
        z.v(parcel, 5, D(), false);
        z.E(parcel, 6, this.f, i10, false);
        z.L(J, parcel);
    }
}
