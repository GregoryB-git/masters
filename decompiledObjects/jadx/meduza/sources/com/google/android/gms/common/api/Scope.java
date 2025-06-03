package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;
import b.z;
import com.google.android.gms.common.internal.ReflectedParcelable;
import k6.q;
import m6.j;
import n6.a;

/* loaded from: classes.dex */
public final class Scope extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<Scope> CREATOR = new q();

    /* renamed from: a, reason: collision with root package name */
    public final int f2810a;

    /* renamed from: b, reason: collision with root package name */
    public final String f2811b;

    public Scope() {
        throw null;
    }

    public Scope(int i10, String str) {
        j.f("scopeUri must not be null or empty", str);
        this.f2810a = i10;
        this.f2811b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Scope) {
            return this.f2811b.equals(((Scope) obj).f2811b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f2811b.hashCode();
    }

    public final String toString() {
        return this.f2811b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f2810a;
        int J = z.J(20293, parcel);
        z.z(parcel, 1, i11);
        z.F(parcel, 2, this.f2811b, false);
        z.L(J, parcel);
    }
}
