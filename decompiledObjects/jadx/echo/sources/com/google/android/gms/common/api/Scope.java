package com.google.android.gms.common.api;

import A2.AbstractC0328n;
import B2.a;
import B2.c;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.ReflectedParcelable;
import y2.i;

/* loaded from: classes.dex */
public final class Scope extends a implements ReflectedParcelable {

    @NonNull
    public static final Parcelable.Creator<Scope> CREATOR = new i();

    /* renamed from: o, reason: collision with root package name */
    public final int f10249o;

    /* renamed from: p, reason: collision with root package name */
    public final String f10250p;

    public Scope(int i7, String str) {
        AbstractC0328n.f(str, "scopeUri must not be null or empty");
        this.f10249o = i7;
        this.f10250p = str;
    }

    public String a() {
        return this.f10250p;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Scope) {
            return this.f10250p.equals(((Scope) obj).f10250p);
        }
        return false;
    }

    public int hashCode() {
        return this.f10250p.hashCode();
    }

    public String toString() {
        return this.f10250p;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        int a7 = c.a(parcel);
        c.i(parcel, 1, this.f10249o);
        c.n(parcel, 2, a(), false);
        c.b(parcel, a7);
    }

    public Scope(String str) {
        this(1, str);
    }
}
