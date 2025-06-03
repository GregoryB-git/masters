package h7;

import android.os.Parcel;
import android.os.Parcelable;
import b.z;
import m6.x;

/* loaded from: classes.dex */
public final class h extends n6.a {
    public static final Parcelable.Creator<h> CREATOR = new i();

    /* renamed from: a, reason: collision with root package name */
    public final int f7181a;

    /* renamed from: b, reason: collision with root package name */
    public final x f7182b;

    public h(int i10, x xVar) {
        this.f7181a = i10;
        this.f7182b = xVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int J = z.J(20293, parcel);
        z.z(parcel, 1, this.f7181a);
        z.E(parcel, 2, this.f7182b, i10, false);
        z.L(J, parcel);
    }
}
