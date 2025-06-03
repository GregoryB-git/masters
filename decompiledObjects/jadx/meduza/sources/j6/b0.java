package j6;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class b0 extends n6.a {
    public static final Parcelable.Creator<b0> CREATOR = new c0();

    /* renamed from: a, reason: collision with root package name */
    public final boolean f8473a;

    /* renamed from: b, reason: collision with root package name */
    public final String f8474b;

    /* renamed from: c, reason: collision with root package name */
    public final int f8475c;

    /* renamed from: d, reason: collision with root package name */
    public final int f8476d;

    public b0(int i10, int i11, String str, boolean z10) {
        this.f8473a = z10;
        this.f8474b = str;
        this.f8475c = va.a.h(i10) - 1;
        this.f8476d = x6.b.E0(i11) - 1;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int J = b.z.J(20293, parcel);
        b.z.t(parcel, 1, this.f8473a);
        b.z.F(parcel, 2, this.f8474b, false);
        b.z.z(parcel, 3, this.f8475c);
        b.z.z(parcel, 4, this.f8476d);
        b.z.L(J, parcel);
    }
}
