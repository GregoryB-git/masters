package c6;

import android.os.Parcel;
import android.os.Parcelable;
import b.z;

/* loaded from: classes.dex */
public final class a extends n6.a {
    public static final Parcelable.Creator<a> CREATOR = new k();

    /* renamed from: a, reason: collision with root package name */
    public final int f2356a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f2357b;

    /* renamed from: c, reason: collision with root package name */
    public final long f2358c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f2359d;

    public a(int i10, long j10, boolean z10, boolean z11) {
        this.f2356a = i10;
        this.f2357b = z10;
        this.f2358c = j10;
        this.f2359d = z11;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int J = z.J(20293, parcel);
        z.z(parcel, 1, this.f2356a);
        z.t(parcel, 2, this.f2357b);
        z.C(parcel, 3, this.f2358c);
        z.t(parcel, 4, this.f2359d);
        z.L(J, parcel);
    }
}
