package R2;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: R2.v5, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0621v5 extends B2.a {
    public static final Parcelable.Creator<C0621v5> CREATOR = new C0642y5();

    /* renamed from: o, reason: collision with root package name */
    public final String f5563o;

    /* renamed from: p, reason: collision with root package name */
    public final long f5564p;

    /* renamed from: q, reason: collision with root package name */
    public final int f5565q;

    public C0621v5(String str, long j7, int i7) {
        this.f5563o = str;
        this.f5564p = j7;
        this.f5565q = i7;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int a7 = B2.c.a(parcel);
        B2.c.n(parcel, 1, this.f5563o, false);
        B2.c.k(parcel, 2, this.f5564p);
        B2.c.i(parcel, 3, this.f5565q);
        B2.c.b(parcel, a7);
    }
}
