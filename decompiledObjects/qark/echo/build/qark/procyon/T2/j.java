// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package T2;

import android.os.Parcelable;
import B2.c;
import android.os.Parcel;
import A2.G;
import android.os.Parcelable$Creator;
import B2.a;

public final class j extends a
{
    public static final Parcelable$Creator<j> CREATOR;
    public final int o;
    public final G p;
    
    static {
        CREATOR = (Parcelable$Creator)new k();
    }
    
    public j(final int o, final G p2) {
        this.o = o;
        this.p = p2;
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        final int a = c.a(parcel);
        c.i(parcel, 1, this.o);
        c.m(parcel, 2, (Parcelable)this.p, n, false);
        c.b(parcel, a);
    }
}
