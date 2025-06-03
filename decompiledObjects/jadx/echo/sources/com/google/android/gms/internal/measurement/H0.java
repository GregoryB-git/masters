package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class H0 extends B2.a {
    public static final Parcelable.Creator<H0> CREATOR = new K0();

    /* renamed from: o, reason: collision with root package name */
    public final long f10390o;

    /* renamed from: p, reason: collision with root package name */
    public final long f10391p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f10392q;

    /* renamed from: r, reason: collision with root package name */
    public final String f10393r;

    /* renamed from: s, reason: collision with root package name */
    public final String f10394s;

    /* renamed from: t, reason: collision with root package name */
    public final String f10395t;

    /* renamed from: u, reason: collision with root package name */
    public final Bundle f10396u;

    /* renamed from: v, reason: collision with root package name */
    public final String f10397v;

    public H0(long j7, long j8, boolean z7, String str, String str2, String str3, Bundle bundle, String str4) {
        this.f10390o = j7;
        this.f10391p = j8;
        this.f10392q = z7;
        this.f10393r = str;
        this.f10394s = str2;
        this.f10395t = str3;
        this.f10396u = bundle;
        this.f10397v = str4;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int a7 = B2.c.a(parcel);
        B2.c.k(parcel, 1, this.f10390o);
        B2.c.k(parcel, 2, this.f10391p);
        B2.c.c(parcel, 3, this.f10392q);
        B2.c.n(parcel, 4, this.f10393r, false);
        B2.c.n(parcel, 5, this.f10394s, false);
        B2.c.n(parcel, 6, this.f10395t, false);
        B2.c.e(parcel, 7, this.f10396u, false);
        B2.c.n(parcel, 8, this.f10397v, false);
        B2.c.b(parcel, a7);
    }
}
