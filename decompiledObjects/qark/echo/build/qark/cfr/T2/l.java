/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 */
package T2;

import A2.I;
import B2.a;
import B2.c;
import T2.m;
import android.os.Parcel;
import android.os.Parcelable;
import x2.b;

public final class l
extends a {
    public static final Parcelable.Creator<l> CREATOR = new m();
    public final int o;
    public final b p;
    public final I q;

    public l(int n8, b b8, I i8) {
        this.o = n8;
        this.p = b8;
        this.q = i8;
    }

    public final b a() {
        return this.p;
    }

    public final I d() {
        return this.q;
    }

    public final void writeToParcel(Parcel parcel, int n8) {
        int n9 = c.a(parcel);
        c.i(parcel, 1, this.o);
        c.m(parcel, 2, this.p, n8, false);
        c.m(parcel, 3, this.q, n8, false);
        c.b(parcel, n9);
    }
}

