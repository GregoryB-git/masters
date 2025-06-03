/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  java.lang.Double
 *  java.lang.Float
 *  java.lang.IllegalArgumentException
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.String
 */
package R2;

import A2.n;
import B2.a;
import B2.c;
import R2.Q5;
import R2.T5;
import android.os.Parcel;
import android.os.Parcelable;

public final class R5
extends a {
    public static final Parcelable.Creator<R5> CREATOR = new Q5();
    public final int o;
    public final String p;
    public final long q;
    public final Long r;
    public final Float s;
    public final String t;
    public final String u;
    public final Double v;

    public R5(int n8, String string2, long l8, Long l9, Float f8, String string3, String string4, Double d8) {
        this.o = n8;
        this.p = string2;
        this.q = l8;
        this.r = l9;
        string2 = null;
        this.s = null;
        if (n8 == 1) {
            if (f8 != null) {
                string2 = Double.valueOf((double)f8.doubleValue());
            }
            this.v = string2;
        } else {
            this.v = d8;
        }
        this.t = string3;
        this.u = string4;
    }

    public R5(T5 t52) {
        this(t52.c, t52.d, t52.e, t52.b);
    }

    public R5(String string2, long l8, Object object, String string3) {
        n.e(string2);
        this.o = 2;
        this.p = string2;
        this.q = l8;
        this.u = string3;
        if (object == null) {
            this.r = null;
            this.s = null;
            this.v = null;
            this.t = null;
            return;
        }
        if (object instanceof Long) {
            this.r = (Long)object;
            this.s = null;
            this.v = null;
            this.t = null;
            return;
        }
        if (object instanceof String) {
            this.r = null;
            this.s = null;
            this.v = null;
            this.t = (String)object;
            return;
        }
        if (object instanceof Double) {
            this.r = null;
            this.s = null;
            this.v = (Double)object;
            this.t = null;
            return;
        }
        throw new IllegalArgumentException("User attribute given of un-supported type");
    }

    public final Object a() {
        Object object = this.r;
        if (object != null) {
            return object;
        }
        object = this.v;
        if (object != null) {
            return object;
        }
        object = this.t;
        if (object != null) {
            return object;
        }
        return null;
    }

    public final void writeToParcel(Parcel parcel, int n8) {
        n8 = c.a(parcel);
        c.i(parcel, 1, this.o);
        c.n(parcel, 2, this.p, false);
        c.k(parcel, 3, this.q);
        c.l(parcel, 4, this.r, false);
        c.g(parcel, 5, null, false);
        c.n(parcel, 6, this.t, false);
        c.n(parcel, 7, this.u, false);
        c.f(parcel, 8, this.v, false);
        c.b(parcel, n8);
    }
}

