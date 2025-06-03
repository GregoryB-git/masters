// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package T2;

import B2.c;
import android.os.Parcel;
import java.util.List;
import android.os.Parcelable$Creator;
import B2.a;

public final class h extends a
{
    public static final Parcelable$Creator<h> CREATOR;
    public final List o;
    public final String p;
    
    static {
        CREATOR = (Parcelable$Creator)new i();
    }
    
    public h(final List o, final String p2) {
        this.o = o;
        this.p = p2;
    }
    
    public final void writeToParcel(final Parcel parcel, int a) {
        a = c.a(parcel);
        c.o(parcel, 1, this.o, false);
        c.n(parcel, 2, this.p, false);
        c.b(parcel, a);
    }
}
