package s6;

import android.os.Parcel;
import android.os.Parcelable;
import b.z;

/* loaded from: classes.dex */
public final class d extends n6.a {
    public static final Parcelable.Creator<d> CREATOR = new f();

    /* renamed from: a, reason: collision with root package name */
    public final int f14231a;

    /* renamed from: b, reason: collision with root package name */
    public final String f14232b;

    /* renamed from: c, reason: collision with root package name */
    public final int f14233c;

    public d(int i10, String str, int i11) {
        this.f14231a = i10;
        this.f14232b = str;
        this.f14233c = i11;
    }

    public d(String str, int i10) {
        this.f14231a = 1;
        this.f14232b = str;
        this.f14233c = i10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f14231a;
        int J = z.J(20293, parcel);
        z.z(parcel, 1, i11);
        z.F(parcel, 2, this.f14232b, false);
        z.z(parcel, 3, this.f14233c);
        z.L(J, parcel);
    }
}
