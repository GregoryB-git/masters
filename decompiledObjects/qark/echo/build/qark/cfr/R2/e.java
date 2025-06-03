/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  java.lang.String
 */
package R2;

import A2.n;
import B2.a;
import B2.c;
import R2.I;
import R2.R5;
import R2.h;
import android.os.Parcel;
import android.os.Parcelable;

public final class e
extends a {
    public static final Parcelable.Creator<e> CREATOR = new h();
    public String o;
    public String p;
    public R5 q;
    public long r;
    public boolean s;
    public String t;
    public I u;
    public long v;
    public I w;
    public long x;
    public I y;

    public e(e e8) {
        n.i(e8);
        this.o = e8.o;
        this.p = e8.p;
        this.q = e8.q;
        this.r = e8.r;
        this.s = e8.s;
        this.t = e8.t;
        this.u = e8.u;
        this.v = e8.v;
        this.w = e8.w;
        this.x = e8.x;
        this.y = e8.y;
    }

    public e(String string2, String string3, R5 r52, long l8, boolean bl, String string4, I i8, long l9, I i9, long l10, I i10) {
        this.o = string2;
        this.p = string3;
        this.q = r52;
        this.r = l8;
        this.s = bl;
        this.t = string4;
        this.u = i8;
        this.v = l9;
        this.w = i9;
        this.x = l10;
        this.y = i10;
    }

    public final void writeToParcel(Parcel parcel, int n8) {
        int n9 = c.a(parcel);
        c.n(parcel, 2, this.o, false);
        c.n(parcel, 3, this.p, false);
        c.m(parcel, 4, this.q, n8, false);
        c.k(parcel, 5, this.r);
        c.c(parcel, 6, this.s);
        c.n(parcel, 7, this.t, false);
        c.m(parcel, 8, this.u, n8, false);
        c.k(parcel, 9, this.v);
        c.m(parcel, 10, this.w, n8, false);
        c.k(parcel, 11, this.x);
        c.m(parcel, 12, this.y, n8, false);
        c.b(parcel, n9);
    }
}

