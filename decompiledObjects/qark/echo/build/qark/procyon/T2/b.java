// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package T2;

import android.os.Parcelable;
import android.os.Parcel;
import android.content.Intent;
import android.os.Parcelable$Creator;
import B2.a;

public final class b extends a
{
    public static final Parcelable$Creator<b> CREATOR;
    public final int o;
    public int p;
    public Intent q;
    
    static {
        CREATOR = (Parcelable$Creator)new c();
    }
    
    public b(final int o, final int p3, final Intent q) {
        this.o = o;
        this.p = p3;
        this.q = q;
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        final int a = B2.c.a(parcel);
        B2.c.i(parcel, 1, this.o);
        B2.c.i(parcel, 2, this.p);
        B2.c.m(parcel, 3, (Parcelable)this.q, n, false);
        B2.c.b(parcel, a);
    }
}
