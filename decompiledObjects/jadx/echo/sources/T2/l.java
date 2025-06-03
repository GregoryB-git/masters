package T2;

import A2.I;
import android.os.Parcel;
import android.os.Parcelable;
import x2.C2188b;

/* loaded from: classes.dex */
public final class l extends B2.a {
    public static final Parcelable.Creator<l> CREATOR = new m();

    /* renamed from: o, reason: collision with root package name */
    public final int f6075o;

    /* renamed from: p, reason: collision with root package name */
    public final C2188b f6076p;

    /* renamed from: q, reason: collision with root package name */
    public final I f6077q;

    public l(int i7, C2188b c2188b, I i8) {
        this.f6075o = i7;
        this.f6076p = c2188b;
        this.f6077q = i8;
    }

    public final C2188b a() {
        return this.f6076p;
    }

    public final I d() {
        return this.f6077q;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int a7 = B2.c.a(parcel);
        B2.c.i(parcel, 1, this.f6075o);
        B2.c.m(parcel, 2, this.f6076p, i7, false);
        B2.c.m(parcel, 3, this.f6077q, i7, false);
        B2.c.b(parcel, a7);
    }
}
