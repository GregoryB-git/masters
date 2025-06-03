// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package x2;

import B2.c;
import android.os.Parcel;
import A2.m;
import androidx.annotation.NonNull;
import android.os.Parcelable$Creator;
import B2.a;

public class d extends a
{
    @NonNull
    public static final Parcelable$Creator<d> CREATOR;
    public final String o;
    public final int p;
    public final long q;
    
    static {
        CREATOR = (Parcelable$Creator)new t();
    }
    
    public d(final String o, final int p3, final long q) {
        this.o = o;
        this.p = p3;
        this.q = q;
    }
    
    public d(final String o, final long q) {
        this.o = o;
        this.q = q;
        this.p = -1;
    }
    
    public String a() {
        return this.o;
    }
    
    public long d() {
        long q;
        if ((q = this.q) == -1L) {
            q = this.p;
        }
        return q;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o instanceof d) {
            final d d = (d)o;
            if (((this.a() != null && this.a().equals(d.a())) || (this.a() == null && d.a() == null)) && this.d() == d.d()) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return m.b(this.a(), this.d());
    }
    
    @Override
    public final String toString() {
        final m.a c = m.c(this);
        c.a("name", this.a());
        c.a("version", this.d());
        return c.toString();
    }
    
    public final void writeToParcel(final Parcel parcel, int a) {
        a = c.a(parcel);
        c.n(parcel, 1, this.a(), false);
        c.i(parcel, 2, this.p);
        c.k(parcel, 3, this.d());
        c.b(parcel, a);
    }
}
