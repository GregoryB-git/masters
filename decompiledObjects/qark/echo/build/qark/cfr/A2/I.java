/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.IBinder
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  java.lang.Object
 */
package A2;

import A2.J;
import A2.i;
import A2.m;
import B2.a;
import B2.c;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import x2.b;

public final class I
extends a {
    public static final Parcelable.Creator<I> CREATOR = new J();
    public final int o;
    public final IBinder p;
    public final b q;
    public final boolean r;
    public final boolean s;

    public I(int n8, IBinder iBinder, b b8, boolean bl, boolean bl2) {
        this.o = n8;
        this.p = iBinder;
        this.q = b8;
        this.r = bl;
        this.s = bl2;
    }

    public final b a() {
        return this.q;
    }

    public final i d() {
        IBinder iBinder = this.p;
        if (iBinder == null) {
            return null;
        }
        return i.a.o(iBinder);
    }

    public final boolean equals(Object object) {
        if (object == null) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!(object instanceof I)) {
            return false;
        }
        object = (I)object;
        if (this.q.equals(object.q) && m.a(this.d(), object.d())) {
            return true;
        }
        return false;
    }

    public final void writeToParcel(Parcel parcel, int n8) {
        int n9 = c.a(parcel);
        c.i(parcel, 1, this.o);
        c.h(parcel, 2, this.p, false);
        c.m(parcel, 3, this.q, n8, false);
        c.c(parcel, 4, this.r);
        c.c(parcel, 5, this.s);
        c.b(parcel, n9);
    }
}

