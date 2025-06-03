// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package R2;

import B2.c;
import android.os.Parcel;
import android.os.Bundle;
import android.os.Parcelable$Creator;
import B2.a;

public final class n extends a
{
    public static final Parcelable$Creator<n> CREATOR;
    public final Bundle o;
    
    static {
        CREATOR = (Parcelable$Creator)new m();
    }
    
    public n(final Bundle o) {
        this.o = o;
    }
    
    public final void writeToParcel(final Parcel parcel, int a) {
        a = c.a(parcel);
        c.e(parcel, 1, this.o, false);
        c.b(parcel, a);
    }
}
