package com.google.android.gms.common.api;

import A2.AbstractC0327m;
import B2.a;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.ReflectedParcelable;
import x2.C2188b;
import y2.c;
import y2.j;

/* loaded from: classes.dex */
public final class Status extends a implements ReflectedParcelable {

    /* renamed from: o, reason: collision with root package name */
    public final int f10259o;

    /* renamed from: p, reason: collision with root package name */
    public final int f10260p;

    /* renamed from: q, reason: collision with root package name */
    public final String f10261q;

    /* renamed from: r, reason: collision with root package name */
    public final PendingIntent f10262r;

    /* renamed from: s, reason: collision with root package name */
    public final C2188b f10263s;

    /* renamed from: t, reason: collision with root package name */
    public static final Status f10252t = new Status(-1);

    /* renamed from: u, reason: collision with root package name */
    public static final Status f10253u = new Status(0);

    /* renamed from: v, reason: collision with root package name */
    public static final Status f10254v = new Status(14);

    /* renamed from: w, reason: collision with root package name */
    public static final Status f10255w = new Status(8);

    /* renamed from: x, reason: collision with root package name */
    public static final Status f10256x = new Status(15);

    /* renamed from: y, reason: collision with root package name */
    public static final Status f10257y = new Status(16);

    /* renamed from: A, reason: collision with root package name */
    public static final Status f10251A = new Status(17);

    /* renamed from: z, reason: collision with root package name */
    public static final Status f10258z = new Status(18);

    @NonNull
    public static final Parcelable.Creator<Status> CREATOR = new j();

    public Status(int i7) {
        this(i7, (String) null);
    }

    public C2188b a() {
        return this.f10263s;
    }

    public int d() {
        return this.f10260p;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        return this.f10259o == status.f10259o && this.f10260p == status.f10260p && AbstractC0327m.a(this.f10261q, status.f10261q) && AbstractC0327m.a(this.f10262r, status.f10262r) && AbstractC0327m.a(this.f10263s, status.f10263s);
    }

    public String f() {
        return this.f10261q;
    }

    public boolean g() {
        return this.f10262r != null;
    }

    public int hashCode() {
        return AbstractC0327m.b(Integer.valueOf(this.f10259o), Integer.valueOf(this.f10260p), this.f10261q, this.f10262r, this.f10263s);
    }

    public final String i() {
        String str = this.f10261q;
        return str != null ? str : c.a(this.f10260p);
    }

    public String toString() {
        AbstractC0327m.a c7 = AbstractC0327m.c(this);
        c7.a("statusCode", i());
        c7.a("resolution", this.f10262r);
        return c7.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        int a7 = B2.c.a(parcel);
        B2.c.i(parcel, 1, d());
        B2.c.n(parcel, 2, f(), false);
        B2.c.m(parcel, 3, this.f10262r, i7, false);
        B2.c.m(parcel, 4, a(), i7, false);
        B2.c.i(parcel, 1000, this.f10259o);
        B2.c.b(parcel, a7);
    }

    public Status(int i7, int i8, String str, PendingIntent pendingIntent, C2188b c2188b) {
        this.f10259o = i7;
        this.f10260p = i8;
        this.f10261q = str;
        this.f10262r = pendingIntent;
        this.f10263s = c2188b;
    }

    public Status(int i7, String str) {
        this(1, i7, str, null, null);
    }

    public Status(C2188b c2188b, String str) {
        this(c2188b, str, 17);
    }

    public Status(C2188b c2188b, String str, int i7) {
        this(1, i7, str, c2188b.f(), c2188b);
    }
}
