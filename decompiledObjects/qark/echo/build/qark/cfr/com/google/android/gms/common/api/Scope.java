/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  java.lang.Object
 *  java.lang.String
 */
package com.google.android.gms.common.api;

import A2.n;
import B2.a;
import B2.c;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.ReflectedParcelable;
import y2.i;

public final class Scope
extends a
implements ReflectedParcelable {
    @NonNull
    public static final Parcelable.Creator<Scope> CREATOR = new i();
    public final int o;
    public final String p;

    public Scope(int n8, String string2) {
        n.f(string2, "scopeUri must not be null or empty");
        this.o = n8;
        this.p = string2;
    }

    public Scope(String string2) {
        this(1, string2);
    }

    public String a() {
        return this.p;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof Scope)) {
            return false;
        }
        return this.p.equals((Object)((Scope)object).p);
    }

    public int hashCode() {
        return this.p.hashCode();
    }

    public String toString() {
        return this.p;
    }

    public void writeToParcel(Parcel parcel, int n8) {
        n8 = c.a(parcel);
        c.i(parcel, 1, this.o);
        c.n(parcel, 2, this.a(), false);
        c.b(parcel, n8);
    }
}

