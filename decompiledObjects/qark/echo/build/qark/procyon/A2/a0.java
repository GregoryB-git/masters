// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package A2;

import android.os.Parcelable;
import B2.c;
import android.os.Parcel;
import x2.d;
import android.os.Bundle;
import android.os.Parcelable$Creator;
import B2.a;

public final class a0 extends a
{
    public static final Parcelable$Creator<a0> CREATOR;
    public Bundle o;
    public d[] p;
    public int q;
    public e r;
    
    static {
        CREATOR = (Parcelable$Creator)new b0();
    }
    
    public a0(final Bundle o, final d[] p4, final int q, final e r) {
        this.o = o;
        this.p = p4;
        this.q = q;
        this.r = r;
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        final int a = c.a(parcel);
        c.e(parcel, 1, this.o, false);
        c.p(parcel, 2, (Parcelable[])this.p, n, false);
        c.i(parcel, 3, this.q);
        c.m(parcel, 4, (Parcelable)this.r, n, false);
        c.b(parcel, a);
    }
}
