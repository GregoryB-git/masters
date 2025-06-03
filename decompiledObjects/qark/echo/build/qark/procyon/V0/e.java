// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package V0;

import android.os.Parcel;
import android.os.Parcelable$Creator;

public final class e extends b
{
    public static final Parcelable$Creator<e> CREATOR;
    
    static {
        CREATOR = (Parcelable$Creator)new Parcelable$Creator() {
            public e a(final Parcel parcel) {
                return new e();
            }
            
            public e[] b(final int n) {
                return new e[n];
            }
        };
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
    }
}
