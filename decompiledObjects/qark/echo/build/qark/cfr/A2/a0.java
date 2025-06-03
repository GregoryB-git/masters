/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 */
package A2;

import A2.b0;
import A2.e;
import B2.a;
import B2.c;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import x2.d;

public final class a0
extends a {
    public static final Parcelable.Creator<a0> CREATOR = new b0();
    public Bundle o;
    public d[] p;
    public int q;
    public e r;

    public a0(Bundle bundle, d[] arrd, int n8, e e8) {
        this.o = bundle;
        this.p = arrd;
        this.q = n8;
        this.r = e8;
    }

    public final void writeToParcel(Parcel parcel, int n8) {
        int n9 = c.a(parcel);
        c.e(parcel, 1, this.o, false);
        c.p(parcel, 2, this.p, n8, false);
        c.i(parcel, 3, this.q);
        c.m(parcel, 4, this.r, n8, false);
        c.b(parcel, n9);
    }
}

