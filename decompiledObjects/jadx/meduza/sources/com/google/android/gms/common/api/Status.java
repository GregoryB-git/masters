package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import b.z;
import com.google.android.gms.common.internal.ReflectedParcelable;
import j6.b;
import java.util.Arrays;
import k6.c;
import k6.j;
import k6.r;
import m6.h;
import n6.a;

/* loaded from: classes.dex */
public final class Status extends a implements j, ReflectedParcelable {
    public static final Parcelable.Creator<Status> CREATOR;

    /* renamed from: e, reason: collision with root package name */
    public static final Status f2812e;
    public static final Status f;

    /* renamed from: o, reason: collision with root package name */
    public static final Status f2813o;

    /* renamed from: p, reason: collision with root package name */
    public static final Status f2814p;

    /* renamed from: q, reason: collision with root package name */
    public static final Status f2815q;

    /* renamed from: a, reason: collision with root package name */
    public final int f2816a;

    /* renamed from: b, reason: collision with root package name */
    public final String f2817b;

    /* renamed from: c, reason: collision with root package name */
    public final PendingIntent f2818c;

    /* renamed from: d, reason: collision with root package name */
    public final b f2819d;

    static {
        new Status(-1, null, null, null);
        f2812e = new Status(0, null, null, null);
        f = new Status(14, null, null, null);
        f2813o = new Status(8, null, null, null);
        f2814p = new Status(15, null, null, null);
        f2815q = new Status(16, null, null, null);
        new Status(17, null, null, null);
        new Status(18, null, null, null);
        CREATOR = new r();
    }

    public Status() {
        throw null;
    }

    public Status(int i10, String str, PendingIntent pendingIntent, b bVar) {
        this.f2816a = i10;
        this.f2817b = str;
        this.f2818c = pendingIntent;
        this.f2819d = bVar;
    }

    public final boolean D() {
        return this.f2816a <= 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        return this.f2816a == status.f2816a && h.a(this.f2817b, status.f2817b) && h.a(this.f2818c, status.f2818c) && h.a(this.f2819d, status.f2819d);
    }

    @Override // k6.j
    public final Status getStatus() {
        return this;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f2816a), this.f2817b, this.f2818c, this.f2819d});
    }

    public final String toString() {
        h.a aVar = new h.a(this);
        String str = this.f2817b;
        if (str == null) {
            str = c.a(this.f2816a);
        }
        aVar.a(str, "statusCode");
        aVar.a(this.f2818c, "resolution");
        return aVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int J = z.J(20293, parcel);
        z.z(parcel, 1, this.f2816a);
        z.F(parcel, 2, this.f2817b, false);
        z.E(parcel, 3, this.f2818c, i10, false);
        z.E(parcel, 4, this.f2819d, i10, false);
        z.L(J, parcel);
    }
}
