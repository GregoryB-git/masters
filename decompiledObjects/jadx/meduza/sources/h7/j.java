package h7;

import android.os.Parcel;
import android.os.Parcelable;
import b.z;

/* loaded from: classes.dex */
public final class j extends n6.a {
    public static final Parcelable.Creator<j> CREATOR = new k();

    /* renamed from: a, reason: collision with root package name */
    public final int f7183a;

    /* renamed from: b, reason: collision with root package name */
    public final j6.b f7184b;

    /* renamed from: c, reason: collision with root package name */
    public final com.google.android.gms.common.internal.f f7185c;

    public j(int i10, j6.b bVar, com.google.android.gms.common.internal.f fVar) {
        this.f7183a = i10;
        this.f7184b = bVar;
        this.f7185c = fVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int J = z.J(20293, parcel);
        z.z(parcel, 1, this.f7183a);
        z.E(parcel, 2, this.f7184b, i10, false);
        z.E(parcel, 3, this.f7185c, i10, false);
        z.L(J, parcel);
    }
}
