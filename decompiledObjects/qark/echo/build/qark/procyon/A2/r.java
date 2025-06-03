// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package A2;

import B2.c;
import android.os.Parcel;
import java.util.ArrayList;
import java.util.List;
import androidx.annotation.NonNull;
import android.os.Parcelable$Creator;
import B2.a;

public class r extends a
{
    @NonNull
    public static final Parcelable$Creator<r> CREATOR;
    public final int o;
    public List p;
    
    static {
        CREATOR = (Parcelable$Creator)new v();
    }
    
    public r(final int o, final List p2) {
        this.o = o;
        this.p = p2;
    }
    
    public final int a() {
        return this.o;
    }
    
    public final List d() {
        return this.p;
    }
    
    public final void f(final l l) {
        if (this.p == null) {
            this.p = new ArrayList();
        }
        this.p.add(l);
    }
    
    public final void writeToParcel(final Parcel parcel, int a) {
        a = c.a(parcel);
        c.i(parcel, 1, this.o);
        c.q(parcel, 2, this.p, false);
        c.b(parcel, a);
    }
}
