/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  java.lang.String
 */
package x2;

import B2.a;
import B2.c;
import android.os.Parcel;
import android.os.Parcelable;
import x2.I;
import x2.P;
import x2.u;

public final class H
extends a {
    public static final Parcelable.Creator<H> CREATOR = new I();
    public final boolean o;
    public final String p;
    public final int q;
    public final int r;

    public H(boolean bl, String string2, int n8, int n9) {
        this.o = bl;
        this.p = string2;
        this.q = P.a(n8) - 1;
        this.r = u.a(n9) - 1;
    }

    public final String a() {
        return this.p;
    }

    public final boolean d() {
        return this.o;
    }

    public final int f() {
        return u.a(this.r);
    }

    public final int g() {
        return P.a(this.q);
    }

    public final void writeToParcel(Parcel parcel, int n8) {
        n8 = c.a(parcel);
        c.c(parcel, 1, this.o);
        c.n(parcel, 2, this.p, false);
        c.i(parcel, 3, this.q);
        c.i(parcel, 4, this.r);
        c.b(parcel, n8);
    }
}

