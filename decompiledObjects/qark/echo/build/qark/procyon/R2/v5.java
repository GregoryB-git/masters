// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package R2;

import B2.c;
import android.os.Parcel;
import android.os.Parcelable$Creator;
import B2.a;

public final class v5 extends a
{
    public static final Parcelable$Creator<v5> CREATOR;
    public final String o;
    public final long p;
    public final int q;
    
    static {
        CREATOR = (Parcelable$Creator)new y5();
    }
    
    public v5(final String o, final long p3, final int q) {
        this.o = o;
        this.p = p3;
        this.q = q;
    }
    
    public final void writeToParcel(final Parcel parcel, int a) {
        a = c.a(parcel);
        c.n(parcel, 1, this.o, false);
        c.k(parcel, 2, this.p);
        c.i(parcel, 3, this.q);
        c.b(parcel, a);
    }
}
