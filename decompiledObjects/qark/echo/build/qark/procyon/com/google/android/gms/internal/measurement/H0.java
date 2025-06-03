// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal.measurement;

import B2.c;
import android.os.Parcel;
import android.os.Bundle;
import android.os.Parcelable$Creator;
import B2.a;

public final class H0 extends a
{
    public static final Parcelable$Creator<H0> CREATOR;
    public final long o;
    public final long p;
    public final boolean q;
    public final String r;
    public final String s;
    public final String t;
    public final Bundle u;
    public final String v;
    
    static {
        CREATOR = (Parcelable$Creator)new K0();
    }
    
    public H0(final long o, final long p8, final boolean q, final String r, final String s, final String t, final Bundle u, final String v) {
        this.o = o;
        this.p = p8;
        this.q = q;
        this.r = r;
        this.s = s;
        this.t = t;
        this.u = u;
        this.v = v;
    }
    
    public final void writeToParcel(final Parcel parcel, int a) {
        a = c.a(parcel);
        c.k(parcel, 1, this.o);
        c.k(parcel, 2, this.p);
        c.c(parcel, 3, this.q);
        c.n(parcel, 4, this.r, false);
        c.n(parcel, 5, this.s, false);
        c.n(parcel, 6, this.t, false);
        c.e(parcel, 7, this.u, false);
        c.n(parcel, 8, this.v, false);
        c.b(parcel, a);
    }
}
