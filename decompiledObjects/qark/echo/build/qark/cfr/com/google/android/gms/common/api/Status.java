/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.app.PendingIntent
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  java.lang.Object
 *  java.lang.String
 */
package com.google.android.gms.common.api;

import A2.m;
import B2.a;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.ReflectedParcelable;
import x2.b;
import y2.c;
import y2.j;

public final class Status
extends a
implements ReflectedParcelable {
    public static final Status A;
    @NonNull
    public static final Parcelable.Creator<Status> CREATOR;
    public static final Status t;
    public static final Status u;
    public static final Status v;
    public static final Status w;
    public static final Status x;
    public static final Status y;
    public static final Status z;
    public final int o;
    public final int p;
    public final String q;
    public final PendingIntent r;
    public final b s;

    static {
        t = new Status(-1);
        u = new Status(0);
        v = new Status(14);
        w = new Status(8);
        x = new Status(15);
        y = new Status(16);
        A = new Status(17);
        z = new Status(18);
        CREATOR = new j();
    }

    public Status(int n8) {
        this(n8, null);
    }

    public Status(int n8, int n9, String string2, PendingIntent pendingIntent, b b8) {
        this.o = n8;
        this.p = n9;
        this.q = string2;
        this.r = pendingIntent;
        this.s = b8;
    }

    public Status(int n8, String string2) {
        this(1, n8, string2, null, null);
    }

    public Status(b b8, String string2) {
        this(b8, string2, 17);
    }

    public Status(b b8, String string2, int n8) {
        this(1, n8, string2, b8.f(), b8);
    }

    public b a() {
        return this.s;
    }

    public int d() {
        return this.p;
    }

    public boolean equals(Object object) {
        if (!(object instanceof Status)) {
            return false;
        }
        object = (Status)object;
        if (this.o == object.o && this.p == object.p && m.a(this.q, object.q) && m.a((Object)this.r, (Object)object.r) && m.a(this.s, object.s)) {
            return true;
        }
        return false;
    }

    public String f() {
        return this.q;
    }

    public boolean g() {
        if (this.r != null) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return m.b(new Object[]{this.o, this.p, this.q, this.r, this.s});
    }

    public final String i() {
        String string2 = this.q;
        if (string2 != null) {
            return string2;
        }
        return c.a(this.p);
    }

    public String toString() {
        m.a a8 = m.c(this);
        a8.a("statusCode", this.i());
        a8.a("resolution", (Object)this.r);
        return a8.toString();
    }

    public void writeToParcel(Parcel parcel, int n8) {
        int n9 = B2.c.a(parcel);
        B2.c.i(parcel, 1, this.d());
        B2.c.n(parcel, 2, this.f(), false);
        B2.c.m(parcel, 3, (Parcelable)this.r, n8, false);
        B2.c.m(parcel, 4, this.a(), n8, false);
        B2.c.i(parcel, 1000, this.o);
        B2.c.b(parcel, n9);
    }
}

