package q6;

import android.os.Parcel;
import android.os.Parcelable;
import b.z;

/* loaded from: classes.dex */
public final class c extends n6.a {
    public static final Parcelable.Creator<c> CREATOR = new g();

    /* renamed from: a, reason: collision with root package name */
    public final int f13335a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f13336b;

    public c(int i10, boolean z10) {
        this.f13335a = i10;
        this.f13336b = z10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int J = z.J(20293, parcel);
        z.z(parcel, 1, this.f13335a);
        z.t(parcel, 2, this.f13336b);
        z.L(J, parcel);
    }
}
