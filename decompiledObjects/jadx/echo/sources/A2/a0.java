package A2;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import x2.C2190d;

/* loaded from: classes.dex */
public final class a0 extends B2.a {
    public static final Parcelable.Creator<a0> CREATOR = new b0();

    /* renamed from: o, reason: collision with root package name */
    public Bundle f404o;

    /* renamed from: p, reason: collision with root package name */
    public C2190d[] f405p;

    /* renamed from: q, reason: collision with root package name */
    public int f406q;

    /* renamed from: r, reason: collision with root package name */
    public C0319e f407r;

    public a0(Bundle bundle, C2190d[] c2190dArr, int i7, C0319e c0319e) {
        this.f404o = bundle;
        this.f405p = c2190dArr;
        this.f406q = i7;
        this.f407r = c0319e;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int a7 = B2.c.a(parcel);
        B2.c.e(parcel, 1, this.f404o, false);
        B2.c.p(parcel, 2, this.f405p, i7, false);
        B2.c.i(parcel, 3, this.f406q);
        B2.c.m(parcel, 4, this.f407r, i7, false);
        B2.c.b(parcel, a7);
    }
}
