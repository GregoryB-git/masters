// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package x2;

import B2.c;
import android.os.Parcel;
import H2.b;
import android.os.IBinder;
import android.content.Context;
import android.os.Parcelable$Creator;
import B2.a;

public final class F extends a
{
    public static final Parcelable$Creator<F> CREATOR;
    public final String o;
    public final boolean p;
    public final boolean q;
    public final Context r;
    public final boolean s;
    
    static {
        CREATOR = (Parcelable$Creator)new G();
    }
    
    public F(final String o, final boolean p5, final boolean q, final IBinder binder, final boolean s) {
        this.o = o;
        this.p = p5;
        this.q = q;
        this.r = (Context)b.v(H2.a.a.o(binder));
        this.s = s;
    }
    
    public final void writeToParcel(final Parcel parcel, int a) {
        a = c.a(parcel);
        c.n(parcel, 1, this.o, false);
        c.c(parcel, 2, this.p);
        c.c(parcel, 3, this.q);
        c.h(parcel, 4, (IBinder)b.Z0(this.r), false);
        c.c(parcel, 5, this.s);
        c.b(parcel, a);
    }
}
