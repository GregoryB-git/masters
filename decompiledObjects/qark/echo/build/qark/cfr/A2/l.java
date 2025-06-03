/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  java.lang.String
 */
package A2;

import A2.F;
import B2.a;
import B2.c;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;

public class l
extends a {
    @NonNull
    public static final Parcelable.Creator<l> CREATOR = new F();
    public final int o;
    public final int p;
    public final int q;
    public final long r;
    public final long s;
    public final String t;
    public final String u;
    public final int v;
    public final int w;

    public l(int n8, int n9, int n10, long l8, long l9, String string2, String string3, int n11, int n12) {
        this.o = n8;
        this.p = n9;
        this.q = n10;
        this.r = l8;
        this.s = l9;
        this.t = string2;
        this.u = string3;
        this.v = n11;
        this.w = n12;
    }

    public final void writeToParcel(Parcel parcel, int n8) {
        n8 = c.a(parcel);
        c.i(parcel, 1, this.o);
        c.i(parcel, 2, this.p);
        c.i(parcel, 3, this.q);
        c.k(parcel, 4, this.r);
        c.k(parcel, 5, this.s);
        c.n(parcel, 6, this.t, false);
        c.n(parcel, 7, this.u, false);
        c.i(parcel, 8, this.v);
        c.i(parcel, 9, this.w);
        c.b(parcel, n8);
    }
}

