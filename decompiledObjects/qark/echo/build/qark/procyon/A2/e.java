// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package A2;

import android.os.Parcelable;
import B2.c;
import android.os.Parcel;
import androidx.annotation.NonNull;
import android.os.Parcelable$Creator;
import B2.a;

public class e extends a
{
    @NonNull
    public static final Parcelable$Creator<e> CREATOR;
    public final p o;
    public final boolean p;
    public final boolean q;
    public final int[] r;
    public final int s;
    public final int[] t;
    
    static {
        CREATOR = (Parcelable$Creator)new c0();
    }
    
    public e(final p o, final boolean p6, final boolean q, final int[] r, final int s, final int[] t) {
        this.o = o;
        this.p = p6;
        this.q = q;
        this.r = r;
        this.s = s;
        this.t = t;
    }
    
    public int a() {
        return this.s;
    }
    
    public int[] d() {
        return this.r;
    }
    
    public int[] f() {
        return this.t;
    }
    
    public boolean g() {
        return this.p;
    }
    
    public boolean i() {
        return this.q;
    }
    
    public final p k() {
        return this.o;
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        final int a = c.a(parcel);
        c.m(parcel, 1, (Parcelable)this.o, n, false);
        c.c(parcel, 2, this.g());
        c.c(parcel, 3, this.i());
        c.j(parcel, 4, this.d(), false);
        c.i(parcel, 5, this.a());
        c.j(parcel, 6, this.f(), false);
        c.b(parcel, a);
    }
}
