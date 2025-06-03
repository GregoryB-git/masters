// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package A2;

import android.os.Parcelable;
import B2.c;
import android.os.Parcel;
import x2.b;
import android.os.IBinder;
import android.os.Parcelable$Creator;
import B2.a;

public final class I extends a
{
    public static final Parcelable$Creator<I> CREATOR;
    public final int o;
    public final IBinder p;
    public final b q;
    public final boolean r;
    public final boolean s;
    
    static {
        CREATOR = (Parcelable$Creator)new J();
    }
    
    public I(final int o, final IBinder p5, final b q, final boolean r, final boolean s) {
        this.o = o;
        this.p = p5;
        this.q = q;
        this.r = r;
        this.s = s;
    }
    
    public final b a() {
        return this.q;
    }
    
    public final i d() {
        final IBinder p = this.p;
        if (p == null) {
            return null;
        }
        return i.a.o(p);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == null) {
            return false;
        }
        if (this == o) {
            return true;
        }
        if (!(o instanceof I)) {
            return false;
        }
        final I i = (I)o;
        return this.q.equals(i.q) && m.a(this.d(), i.d());
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        final int a = c.a(parcel);
        c.i(parcel, 1, this.o);
        c.h(parcel, 2, this.p, false);
        c.m(parcel, 3, (Parcelable)this.q, n, false);
        c.c(parcel, 4, this.r);
        c.c(parcel, 5, this.s);
        c.b(parcel, a);
    }
}
