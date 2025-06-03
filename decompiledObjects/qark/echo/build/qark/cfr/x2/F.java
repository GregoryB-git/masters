/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.IBinder
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  java.lang.Object
 *  java.lang.String
 */
package x2;

import B2.a;
import B2.c;
import H2.a;
import H2.b;
import android.content.Context;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import x2.G;

public final class F
extends a {
    public static final Parcelable.Creator<F> CREATOR = new G();
    public final String o;
    public final boolean p;
    public final boolean q;
    public final Context r;
    public final boolean s;

    public F(String string2, boolean bl, boolean bl2, IBinder iBinder, boolean bl3) {
        this.o = string2;
        this.p = bl;
        this.q = bl2;
        this.r = (Context)b.v(a.a.o(iBinder));
        this.s = bl3;
    }

    public final void writeToParcel(Parcel parcel, int n8) {
        n8 = c.a(parcel);
        c.n(parcel, 1, this.o, false);
        c.c(parcel, 2, this.p);
        c.c(parcel, 3, this.q);
        c.h(parcel, 4, (IBinder)b.Z0((Object)this.r), false);
        c.c(parcel, 5, this.s);
        c.b(parcel, n8);
    }
}

