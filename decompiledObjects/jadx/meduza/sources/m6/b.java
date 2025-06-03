package m6;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class b extends n6.a {
    public static final Parcelable.Creator<b> CREATOR = new n0();

    /* renamed from: a, reason: collision with root package name */
    public final l f10253a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f10254b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f10255c;

    /* renamed from: d, reason: collision with root package name */
    public final int[] f10256d;

    /* renamed from: e, reason: collision with root package name */
    public final int f10257e;
    public final int[] f;

    public b(l lVar, boolean z10, boolean z11, int[] iArr, int i10, int[] iArr2) {
        this.f10253a = lVar;
        this.f10254b = z10;
        this.f10255c = z11;
        this.f10256d = iArr;
        this.f10257e = i10;
        this.f = iArr2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int J = b.z.J(20293, parcel);
        b.z.E(parcel, 1, this.f10253a, i10, false);
        b.z.t(parcel, 2, this.f10254b);
        b.z.t(parcel, 3, this.f10255c);
        b.z.A(parcel, 4, this.f10256d, false);
        b.z.z(parcel, 5, this.f10257e);
        b.z.A(parcel, 6, this.f, false);
        b.z.L(J, parcel);
    }
}
