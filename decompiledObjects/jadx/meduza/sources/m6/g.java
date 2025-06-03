package m6;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class g extends n6.a {
    public static final Parcelable.Creator<g> CREATOR = new v();

    /* renamed from: a, reason: collision with root package name */
    public final int f10269a;

    /* renamed from: b, reason: collision with root package name */
    public final int f10270b;

    /* renamed from: c, reason: collision with root package name */
    public final int f10271c;

    /* renamed from: d, reason: collision with root package name */
    public final long f10272d;

    /* renamed from: e, reason: collision with root package name */
    public final long f10273e;
    public final String f;

    /* renamed from: o, reason: collision with root package name */
    public final String f10274o;

    /* renamed from: p, reason: collision with root package name */
    public final int f10275p;

    /* renamed from: q, reason: collision with root package name */
    public final int f10276q;

    public g(int i10, int i11, int i12, long j10, long j11, String str, String str2, int i13, int i14) {
        this.f10269a = i10;
        this.f10270b = i11;
        this.f10271c = i12;
        this.f10272d = j10;
        this.f10273e = j11;
        this.f = str;
        this.f10274o = str2;
        this.f10275p = i13;
        this.f10276q = i14;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f10269a;
        int J = b.z.J(20293, parcel);
        b.z.z(parcel, 1, i11);
        b.z.z(parcel, 2, this.f10270b);
        b.z.z(parcel, 3, this.f10271c);
        b.z.C(parcel, 4, this.f10272d);
        b.z.C(parcel, 5, this.f10273e);
        b.z.F(parcel, 6, this.f, false);
        b.z.F(parcel, 7, this.f10274o, false);
        b.z.z(parcel, 8, this.f10275p);
        b.z.z(parcel, 9, this.f10276q);
        b.z.L(J, parcel);
    }
}
