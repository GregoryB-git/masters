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

public final class I extends a
{
    public static final Parcelable$Creator<I> CREATOR;
    public final String o;
    public final D p;
    public final String q;
    public final long r;
    
    static {
        CREATOR = (Parcelable$Creator)new H();
    }
    
    public I(final I i, final long r) {
        n.i(i);
        this.o = i.o;
        this.p = i.p;
        this.q = i.q;
        this.r = r;
    }
    
    public I(final String o, final D p4, final String q, final long r) {
        this.o = o;
        this.p = p4;
        this.q = q;
        this.r = r;
    }
    
    @Override
    public final String toString() {
        final String q = this.q;
        final String o = this.o;
        final String value = String.valueOf(this.p);
        final StringBuilder sb = new StringBuilder("origin=");
        sb.append(q);
        sb.append(",name=");
        sb.append(o);
        sb.append(",params=");
        sb.append(value);
        return sb.toString();
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        final int a = c.a(parcel);
        c.n(parcel, 2, this.o, false);
        c.m(parcel, 3, (Parcelable)this.p, n, false);
        c.n(parcel, 4, this.q, false);
        c.k(parcel, 5, this.r);
        c.b(parcel, a);
    }
}
