/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  java.lang.String
 */
package com.google.android.gms.internal.measurement;

import B2.a;
import B2.c;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.measurement.K0;

public final class H0
extends a {
    public static final Parcelable.Creator<H0> CREATOR = new K0();
    public final long o;
    public final long p;
    public final boolean q;
    public final String r;
    public final String s;
    public final String t;
    public final Bundle u;
    public final String v;

    public H0(long l8, long l9, boolean bl, String string2, String string3, String string4, Bundle bundle, String string5) {
        this.o = l8;
        this.p = l9;
        this.q = bl;
        this.r = string2;
        this.s = string3;
        this.t = string4;
        this.u = bundle;
        this.v = string5;
    }

    public final void writeToParcel(Parcel parcel, int n8) {
        n8 = c.a(parcel);
        c.k(parcel, 1, this.o);
        c.k(parcel, 2, this.p);
        c.c(parcel, 3, this.q);
        c.n(parcel, 4, this.r, false);
        c.n(parcel, 5, this.s, false);
        c.n(parcel, 6, this.t, false);
        c.e(parcel, 7, this.u, false);
        c.n(parcel, 8, this.v, false);
        c.b(parcel, n8);
    }
}

