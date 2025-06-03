// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package R2;

import android.os.Parcelable;
import B2.c;
import android.os.Parcel;
import A2.n;
import android.os.Parcelable$Creator;
import B2.a;

public final class e extends a
{
    public static final Parcelable$Creator<e> CREATOR;
    public String o;
    public String p;
    public R5 q;
    public long r;
    public boolean s;
    public String t;
    public I u;
    public long v;
    public I w;
    public long x;
    public I y;
    
    static {
        CREATOR = (Parcelable$Creator)new h();
    }
    
    public e(final e e) {
        n.i(e);
        this.o = e.o;
        this.p = e.p;
        this.q = e.q;
        this.r = e.r;
        this.s = e.s;
        this.t = e.t;
        this.u = e.u;
        this.v = e.v;
        this.w = e.w;
        this.x = e.x;
        this.y = e.y;
    }
    
    public e(final String o, final String p11, final R5 q, final long r, final boolean s, final String t, final I u, final long v, final I w, final long x, final I y) {
        this.o = o;
        this.p = p11;
        this.q = q;
        this.r = r;
        this.s = s;
        this.t = t;
        this.u = u;
        this.v = v;
        this.w = w;
        this.x = x;
        this.y = y;
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        final int a = c.a(parcel);
        c.n(parcel, 2, this.o, false);
        c.n(parcel, 3, this.p, false);
        c.m(parcel, 4, (Parcelable)this.q, n, false);
        c.k(parcel, 5, this.r);
        c.c(parcel, 6, this.s);
        c.n(parcel, 7, this.t, false);
        c.m(parcel, 8, (Parcelable)this.u, n, false);
        c.k(parcel, 9, this.v);
        c.m(parcel, 10, (Parcelable)this.w, n, false);
        c.k(parcel, 11, this.x);
        c.m(parcel, 12, (Parcelable)this.y, n, false);
        c.b(parcel, a);
    }
}
