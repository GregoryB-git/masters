// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package R2;

import android.os.BaseBundle;
import B2.c;
import android.os.Parcel;
import java.util.Iterator;
import android.os.Bundle;
import android.os.Parcelable$Creator;
import B2.a;

public final class D extends a implements Iterable
{
    public static final Parcelable$Creator<D> CREATOR;
    public final Bundle o;
    
    static {
        CREATOR = (Parcelable$Creator)new F();
    }
    
    public D(final Bundle o) {
        this.o = o;
    }
    
    public final int a() {
        return ((BaseBundle)this.o).size();
    }
    
    public final Double f(final String s) {
        return ((BaseBundle)this.o).getDouble(s);
    }
    
    public final Bundle g() {
        return new Bundle(this.o);
    }
    
    public final Long i(final String s) {
        return ((BaseBundle)this.o).getLong(s);
    }
    
    @Override
    public final Iterator iterator() {
        return new G(this);
    }
    
    public final Object k(final String s) {
        return ((BaseBundle)this.o).get(s);
    }
    
    public final String q(final String s) {
        return ((BaseBundle)this.o).getString(s);
    }
    
    @Override
    public final String toString() {
        return this.o.toString();
    }
    
    public final void writeToParcel(final Parcel parcel, int a) {
        a = c.a(parcel);
        c.e(parcel, 2, this.g(), false);
        c.b(parcel, a);
    }
}
