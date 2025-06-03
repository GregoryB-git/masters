package s6;

import android.os.Parcel;
import android.os.Parcelable;
import b.z;

/* loaded from: classes.dex */
public final class b extends n6.a {
    public static final Parcelable.Creator<b> CREATOR = new c();

    /* renamed from: a, reason: collision with root package name */
    public final int f14229a;

    /* renamed from: b, reason: collision with root package name */
    public final a f14230b;

    public b(int i10, a aVar) {
        this.f14229a = i10;
        this.f14230b = aVar;
    }

    public b(a aVar) {
        this.f14229a = 1;
        this.f14230b = aVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f14229a;
        int J = z.J(20293, parcel);
        z.z(parcel, 1, i11);
        z.E(parcel, 2, this.f14230b, i10, false);
        z.L(J, parcel);
    }
}
