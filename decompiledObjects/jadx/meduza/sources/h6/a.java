package h6;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import b.z;

/* loaded from: classes.dex */
public final class a extends n6.a {
    public static final Parcelable.Creator<a> CREATOR = new c();

    /* renamed from: a, reason: collision with root package name */
    public final int f7147a;

    /* renamed from: b, reason: collision with root package name */
    public int f7148b;

    /* renamed from: c, reason: collision with root package name */
    public Bundle f7149c;

    public a(int i10, int i11, Bundle bundle) {
        this.f7147a = i10;
        this.f7148b = i11;
        this.f7149c = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int J = z.J(20293, parcel);
        z.z(parcel, 1, this.f7147a);
        z.z(parcel, 2, this.f7148b);
        z.v(parcel, 3, this.f7149c, false);
        z.L(J, parcel);
    }
}
