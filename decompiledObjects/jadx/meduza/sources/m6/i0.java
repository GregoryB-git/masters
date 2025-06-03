package m6;

import android.os.Parcel;
import android.os.Parcelable;

@Deprecated
/* loaded from: classes.dex */
public final class i0 extends n6.a {
    public static final Parcelable.Creator<i0> CREATOR = new j0();

    /* renamed from: a, reason: collision with root package name */
    public final int f10280a;

    public i0(int i10) {
        this.f10280a = i10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f10280a;
        int J = b.z.J(20293, parcel);
        b.z.z(parcel, 1, i11);
        b.z.L(J, parcel);
    }
}
