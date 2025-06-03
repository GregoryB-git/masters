package m6;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class l extends n6.a {
    public static final Parcelable.Creator<l> CREATOR = new h0();

    /* renamed from: a, reason: collision with root package name */
    public final int f10287a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f10288b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f10289c;

    /* renamed from: d, reason: collision with root package name */
    public final int f10290d;

    /* renamed from: e, reason: collision with root package name */
    public final int f10291e;

    public l(int i10, boolean z10, boolean z11, int i11, int i12) {
        this.f10287a = i10;
        this.f10288b = z10;
        this.f10289c = z11;
        this.f10290d = i11;
        this.f10291e = i12;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int J = b.z.J(20293, parcel);
        b.z.z(parcel, 1, this.f10287a);
        b.z.t(parcel, 2, this.f10288b);
        b.z.t(parcel, 3, this.f10289c);
        b.z.z(parcel, 4, this.f10290d);
        b.z.z(parcel, 5, this.f10291e);
        b.z.L(J, parcel);
    }
}
