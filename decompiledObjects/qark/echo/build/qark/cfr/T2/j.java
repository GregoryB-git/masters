/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 */
package T2;

import A2.G;
import B2.a;
import B2.c;
import T2.k;
import android.os.Parcel;
import android.os.Parcelable;

public final class j
extends a {
    public static final Parcelable.Creator<j> CREATOR = new k();
    public final int o;
    public final G p;

    public j(int n8, G g8) {
        this.o = n8;
        this.p = g8;
    }

    public final void writeToParcel(Parcel parcel, int n8) {
        int n9 = c.a(parcel);
        c.i(parcel, 1, this.o);
        c.m(parcel, 2, this.p, n8, false);
        c.b(parcel, n9);
    }
}

