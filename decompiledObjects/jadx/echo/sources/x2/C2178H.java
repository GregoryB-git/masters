package x2;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: x2.H, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2178H extends B2.a {
    public static final Parcelable.Creator<C2178H> CREATOR = new C2179I();

    /* renamed from: o, reason: collision with root package name */
    public final boolean f21151o;

    /* renamed from: p, reason: collision with root package name */
    public final String f21152p;

    /* renamed from: q, reason: collision with root package name */
    public final int f21153q;

    /* renamed from: r, reason: collision with root package name */
    public final int f21154r;

    public C2178H(boolean z7, String str, int i7, int i8) {
        this.f21151o = z7;
        this.f21152p = str;
        this.f21153q = AbstractC2186P.a(i7) - 1;
        this.f21154r = AbstractC2207u.a(i8) - 1;
    }

    public final String a() {
        return this.f21152p;
    }

    public final boolean d() {
        return this.f21151o;
    }

    public final int f() {
        return AbstractC2207u.a(this.f21154r);
    }

    public final int g() {
        return AbstractC2186P.a(this.f21153q);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int a7 = B2.c.a(parcel);
        B2.c.c(parcel, 1, this.f21151o);
        B2.c.n(parcel, 2, this.f21152p, false);
        B2.c.i(parcel, 3, this.f21153q);
        B2.c.i(parcel, 4, this.f21154r);
        B2.c.b(parcel, a7);
    }
}
