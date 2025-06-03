package e7;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class b6 extends n6.a {
    public static final Parcelable.Creator<b6> CREATOR = new a6();

    /* renamed from: a, reason: collision with root package name */
    public final long f4117a;

    /* renamed from: b, reason: collision with root package name */
    public byte[] f4118b;

    /* renamed from: c, reason: collision with root package name */
    public final String f4119c;

    /* renamed from: d, reason: collision with root package name */
    public final Bundle f4120d;

    /* renamed from: e, reason: collision with root package name */
    public final int f4121e;
    public final long f;

    /* renamed from: o, reason: collision with root package name */
    public String f4122o;

    public b6(long j10, byte[] bArr, String str, Bundle bundle, int i10, long j11, String str2) {
        this.f4117a = j10;
        this.f4118b = bArr;
        this.f4119c = str;
        this.f4120d = bundle;
        this.f4121e = i10;
        this.f = j11;
        this.f4122o = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int J = b.z.J(20293, parcel);
        b.z.C(parcel, 1, this.f4117a);
        b.z.w(parcel, 2, this.f4118b, false);
        b.z.F(parcel, 3, this.f4119c, false);
        b.z.v(parcel, 4, this.f4120d, false);
        b.z.z(parcel, 5, this.f4121e);
        b.z.C(parcel, 6, this.f);
        b.z.F(parcel, 7, this.f4122o, false);
        b.z.L(J, parcel);
    }
}
