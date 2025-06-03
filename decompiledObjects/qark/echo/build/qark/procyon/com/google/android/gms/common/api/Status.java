// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.common.api;

import android.os.Parcelable;
import android.os.Parcel;
import y2.c;
import A2.m;
import y2.j;
import x2.b;
import android.app.PendingIntent;
import androidx.annotation.NonNull;
import android.os.Parcelable$Creator;
import com.google.android.gms.common.internal.ReflectedParcelable;
import B2.a;

public final class Status extends a implements ReflectedParcelable
{
    public static final Status A;
    @NonNull
    public static final Parcelable$Creator<Status> CREATOR;
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
        CREATOR = (Parcelable$Creator)new j();
    }
    
    public Status(final int n) {
        this(n, null);
    }
    
    public Status(final int o, final int p5, final String q, final PendingIntent r, final b s) {
        this.o = o;
        this.p = p5;
        this.q = q;
        this.r = r;
        this.s = s;
    }
    
    public Status(final int n, final String s) {
        this(1, n, s, null, null);
    }
    
    public Status(final b b, final String s) {
        this(b, s, 17);
    }
    
    public Status(final b b, final String s, final int n) {
        this(1, n, s, b.f(), b);
    }
    
    public b a() {
        return this.s;
    }
    
    public int d() {
        return this.p;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (!(o instanceof Status)) {
            return false;
        }
        final Status status = (Status)o;
        return this.o == status.o && this.p == status.p && m.a(this.q, status.q) && m.a(this.r, status.r) && m.a(this.s, status.s);
    }
    
    public String f() {
        return this.q;
    }
    
    public boolean g() {
        return this.r != null;
    }
    
    @Override
    public int hashCode() {
        return m.b(this.o, this.p, this.q, this.r, this.s);
    }
    
    public final String i() {
        final String q = this.q;
        if (q != null) {
            return q;
        }
        return c.a(this.p);
    }
    
    @Override
    public String toString() {
        final m.a c = m.c(this);
        c.a("statusCode", this.i());
        c.a("resolution", this.r);
        return c.toString();
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        final int a = B2.c.a(parcel);
        B2.c.i(parcel, 1, this.d());
        B2.c.n(parcel, 2, this.f(), false);
        B2.c.m(parcel, 3, (Parcelable)this.r, n, false);
        B2.c.m(parcel, 4, (Parcelable)this.a(), n, false);
        B2.c.i(parcel, 1000, this.o);
        B2.c.b(parcel, a);
    }
}
