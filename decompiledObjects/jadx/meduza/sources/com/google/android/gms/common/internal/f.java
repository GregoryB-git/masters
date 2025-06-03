package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.IAccountAccessor;
import m6.z;

/* loaded from: classes.dex */
public final class f extends n6.a {
    public static final Parcelable.Creator<f> CREATOR = new z();

    /* renamed from: a, reason: collision with root package name */
    public final int f2844a;

    /* renamed from: b, reason: collision with root package name */
    public final IBinder f2845b;

    /* renamed from: c, reason: collision with root package name */
    public final j6.b f2846c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f2847d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f2848e;

    public f(int i10, IBinder iBinder, j6.b bVar, boolean z10, boolean z11) {
        this.f2844a = i10;
        this.f2845b = iBinder;
        this.f2846c = bVar;
        this.f2847d = z10;
        this.f2848e = z11;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (this.f2846c.equals(fVar.f2846c)) {
            IBinder iBinder = this.f2845b;
            IAccountAccessor asInterface = iBinder == null ? null : IAccountAccessor.Stub.asInterface(iBinder);
            IBinder iBinder2 = fVar.f2845b;
            if (m6.h.a(asInterface, iBinder2 != null ? IAccountAccessor.Stub.asInterface(iBinder2) : null)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int J = b.z.J(20293, parcel);
        b.z.z(parcel, 1, this.f2844a);
        b.z.y(parcel, 2, this.f2845b);
        b.z.E(parcel, 3, this.f2846c, i10, false);
        b.z.t(parcel, 4, this.f2847d);
        b.z.t(parcel, 5, this.f2848e);
        b.z.L(J, parcel);
    }
}
