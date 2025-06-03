// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package x2;

import B2.c;
import android.os.Parcel;
import android.os.Parcelable$Creator;
import B2.a;

public final class H extends a
{
    public static final Parcelable$Creator<H> CREATOR;
    public final boolean o;
    public final String p;
    public final int q;
    public final int r;
    
    static {
        CREATOR = (Parcelable$Creator)new I();
    }
    
    public H(final boolean o, final String p4, final int n, final int n2) {
        this.o = o;
        this.p = p4;
        this.q = P.a(n) - 1;
        this.r = u.a(n2) - 1;
    }
    
    public final String a() {
        return this.p;
    }
    
    public final boolean d() {
        return this.o;
    }
    
    public final int f() {
        return u.a(this.r);
    }
    
    public final int g() {
        return P.a(this.q);
    }
    
    public final void writeToParcel(final Parcel parcel, int a) {
        a = c.a(parcel);
        c.c(parcel, 1, this.o);
        c.n(parcel, 2, this.p, false);
        c.i(parcel, 3, this.q);
        c.i(parcel, 4, this.r);
        c.b(parcel, a);
    }
}
