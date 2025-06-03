// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package R2;

import B2.c;
import android.os.Parcel;
import A2.n;
import android.os.Parcelable$Creator;
import B2.a;

public final class R5 extends a
{
    public static final Parcelable$Creator<R5> CREATOR;
    public final int o;
    public final String p;
    public final long q;
    public final Long r;
    public final Float s;
    public final String t;
    public final String u;
    public final Double v;
    
    static {
        CREATOR = (Parcelable$Creator)new Q5();
    }
    
    public R5(final int o, final String p8, final long q, final Long r, final Float n, final String t, final String u, final Double v) {
        this.o = o;
        this.p = p8;
        this.q = q;
        this.r = r;
        Double value = null;
        this.s = null;
        if (o == 1) {
            if (n != null) {
                value = (double)n;
            }
            this.v = value;
        }
        else {
            this.v = v;
        }
        this.t = t;
        this.u = u;
    }
    
    public R5(final T5 t5) {
        this(t5.c, t5.d, t5.e, t5.b);
    }
    
    public R5(final String p4, final long q, final Object o, final String u) {
        n.e(p4);
        this.o = 2;
        this.p = p4;
        this.q = q;
        this.u = u;
        if (o == null) {
            this.r = null;
            this.s = null;
            this.v = null;
            this.t = null;
            return;
        }
        if (o instanceof Long) {
            this.r = (Long)o;
            this.s = null;
            this.v = null;
            this.t = null;
            return;
        }
        if (o instanceof String) {
            this.r = null;
            this.s = null;
            this.v = null;
            this.t = (String)o;
            return;
        }
        if (o instanceof Double) {
            this.r = null;
            this.s = null;
            this.v = (Double)o;
            this.t = null;
            return;
        }
        throw new IllegalArgumentException("User attribute given of un-supported type");
    }
    
    public final Object a() {
        final Long r = this.r;
        if (r != null) {
            return r;
        }
        final Double v = this.v;
        if (v != null) {
            return v;
        }
        final String t = this.t;
        if (t != null) {
            return t;
        }
        return null;
    }
    
    public final void writeToParcel(final Parcel parcel, int a) {
        a = c.a(parcel);
        c.i(parcel, 1, this.o);
        c.n(parcel, 2, this.p, false);
        c.k(parcel, 3, this.q);
        c.l(parcel, 4, this.r, false);
        c.g(parcel, 5, null, false);
        c.n(parcel, 6, this.t, false);
        c.n(parcel, 7, this.u, false);
        c.f(parcel, 8, this.v, false);
        c.b(parcel, a);
    }
}
