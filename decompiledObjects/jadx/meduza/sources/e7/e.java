package e7;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class e extends n6.a {
    public static final Parcelable.Creator<e> CREATOR = new g();

    /* renamed from: a, reason: collision with root package name */
    public final long f4154a;

    /* renamed from: b, reason: collision with root package name */
    public final int f4155b;

    /* renamed from: c, reason: collision with root package name */
    public final long f4156c;

    public e(int i10, long j10, long j11) {
        this.f4154a = j10;
        this.f4155b = i10;
        this.f4156c = j11;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int J = b.z.J(20293, parcel);
        b.z.C(parcel, 1, this.f4154a);
        b.z.z(parcel, 2, this.f4155b);
        b.z.C(parcel, 3, this.f4156c);
        b.z.L(J, parcel);
    }
}
