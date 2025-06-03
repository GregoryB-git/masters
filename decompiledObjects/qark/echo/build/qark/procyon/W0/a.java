// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package W0;

import android.os.Parcel;
import android.os.Parcelable$Creator;
import R0.b;

public final class a extends b
{
    public static final Parcelable$Creator<a> CREATOR;
    
    static {
        CREATOR = (Parcelable$Creator)new Parcelable$Creator() {
            public a a(final Parcel parcel) {
                return new a(parcel);
            }
            
            public a[] b(final int n) {
                return new a[n];
            }
        };
    }
    
    public a(final Parcel parcel) {
        super(parcel);
    }
    
    public a(final String s, final String s2) {
        super(s, s2);
    }
}
