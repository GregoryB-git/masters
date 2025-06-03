package m6;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class l0 extends n6.a {
    public static final Parcelable.Creator<l0> CREATOR = new m0();

    /* renamed from: a, reason: collision with root package name */
    public Bundle f10292a;

    /* renamed from: b, reason: collision with root package name */
    public j6.d[] f10293b;

    /* renamed from: c, reason: collision with root package name */
    public int f10294c;

    /* renamed from: d, reason: collision with root package name */
    public b f10295d;

    public l0() {
    }

    public l0(Bundle bundle, j6.d[] dVarArr, int i10, b bVar) {
        this.f10292a = bundle;
        this.f10293b = dVarArr;
        this.f10294c = i10;
        this.f10295d = bVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int J = b.z.J(20293, parcel);
        b.z.v(parcel, 1, this.f10292a, false);
        b.z.H(parcel, 2, this.f10293b, i10);
        b.z.z(parcel, 3, this.f10294c);
        b.z.E(parcel, 4, this.f10295d, i10, false);
        b.z.L(J, parcel);
    }
}
