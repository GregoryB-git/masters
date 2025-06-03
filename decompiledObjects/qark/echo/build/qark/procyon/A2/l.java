// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package A2;

import B2.c;
import android.os.Parcel;
import androidx.annotation.NonNull;
import android.os.Parcelable$Creator;
import B2.a;

public class l extends a
{
    @NonNull
    public static final Parcelable$Creator<l> CREATOR;
    public final int o;
    public final int p;
    public final int q;
    public final long r;
    public final long s;
    public final String t;
    public final String u;
    public final int v;
    public final int w;
    
    static {
        CREATOR = (Parcelable$Creator)new F();
    }
    
    public l(final int o, final int p9, final int q, final long r, final long s, final String t, final String u, final int v, final int w) {
        this.o = o;
        this.p = p9;
        this.q = q;
        this.r = r;
        this.s = s;
        this.t = t;
        this.u = u;
        this.v = v;
        this.w = w;
    }
    
    public final void writeToParcel(final Parcel parcel, int a) {
        a = c.a(parcel);
        c.i(parcel, 1, this.o);
        c.i(parcel, 2, this.p);
        c.i(parcel, 3, this.q);
        c.k(parcel, 4, this.r);
        c.k(parcel, 5, this.s);
        c.n(parcel, 6, this.t, false);
        c.n(parcel, 7, this.u, false);
        c.i(parcel, 8, this.v);
        c.i(parcel, 9, this.w);
        c.b(parcel, a);
    }
}
