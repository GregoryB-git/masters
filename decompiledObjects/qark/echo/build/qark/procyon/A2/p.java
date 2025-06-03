// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package A2;

import B2.c;
import android.os.Parcel;
import androidx.annotation.NonNull;
import android.os.Parcelable$Creator;
import B2.a;

public class p extends a
{
    @NonNull
    public static final Parcelable$Creator<p> CREATOR;
    public final int o;
    public final boolean p;
    public final boolean q;
    public final int r;
    public final int s;
    
    static {
        CREATOR = (Parcelable$Creator)new T();
    }
    
    public p(final int o, final boolean p5, final boolean q, final int r, final int s) {
        this.o = o;
        this.p = p5;
        this.q = q;
        this.r = r;
        this.s = s;
    }
    
    public int a() {
        return this.r;
    }
    
    public int d() {
        return this.s;
    }
    
    public boolean f() {
        return this.p;
    }
    
    public boolean g() {
        return this.q;
    }
    
    public int i() {
        return this.o;
    }
    
    public final void writeToParcel(final Parcel parcel, int a) {
        a = c.a(parcel);
        c.i(parcel, 1, this.i());
        c.c(parcel, 2, this.f());
        c.c(parcel, 3, this.g());
        c.i(parcel, 4, this.a());
        c.i(parcel, 5, this.d());
        c.b(parcel, a);
    }
}
