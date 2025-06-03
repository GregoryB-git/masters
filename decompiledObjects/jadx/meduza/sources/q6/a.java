package q6;

import android.os.Parcel;
import android.os.Parcelable;
import b.z;

/* loaded from: classes.dex */
public final class a extends n6.a {
    public static final Parcelable.Creator<a> CREATOR = new e();

    /* renamed from: a, reason: collision with root package name */
    public final boolean f13332a;

    /* renamed from: b, reason: collision with root package name */
    public final int f13333b;

    public a(int i10, boolean z10) {
        this.f13332a = z10;
        this.f13333b = i10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int J = z.J(20293, parcel);
        z.t(parcel, 1, this.f13332a);
        z.z(parcel, 2, this.f13333b);
        z.L(J, parcel);
    }
}
