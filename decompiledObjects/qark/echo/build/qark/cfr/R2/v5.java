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

import B2.a;
import B2.c;
import R2.y5;
import android.os.Parcel;
import android.os.Parcelable;

public final class v5
extends a {
    public static final Parcelable.Creator<v5> CREATOR = new y5();
    public final String o;
    public final long p;
    public final int q;

    public v5(String string2, long l8, int n8) {
        this.o = string2;
        this.p = l8;
        this.q = n8;
    }

    public final void writeToParcel(Parcel parcel, int n8) {
        n8 = c.a(parcel);
        c.n(parcel, 1, this.o, false);
        c.k(parcel, 2, this.p);
        c.i(parcel, 3, this.q);
        c.b(parcel, n8);
    }
}

