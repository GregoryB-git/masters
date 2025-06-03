// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package T2;

import android.os.Parcelable;
import B2.c;
import android.os.Parcel;
import A2.I;
import x2.b;
import android.os.Parcelable$Creator;
import B2.a;

public final class l extends a
{
    public static final Parcelable$Creator<l> CREATOR;
    public final int o;
    public final b p;
    public final I q;
    
    static {
        CREATOR = (Parcelable$Creator)new m();
    }
    
    public l(final int o, final b p3, final I q) {
        this.o = o;
        this.p = p3;
        this.q = q;
    }
    
    public final b a() {
        return this.p;
    }
    
    public final I d() {
        return this.q;
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        final int a = c.a(parcel);
        c.i(parcel, 1, this.o);
        c.m(parcel, 2, (Parcelable)this.p, n, false);
        c.m(parcel, 3, (Parcelable)this.q, n, false);
        c.b(parcel, a);
    }
}
