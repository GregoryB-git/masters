// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package b2;

import android.os.Parcelable;
import android.os.Parcelable$Creator;
import android.os.Parcel;

public abstract class c
{
    static {
        c.class.getClassLoader();
    }
    
    public static Parcelable a(final Parcel parcel, final Parcelable$Creator parcelable$Creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return (Parcelable)parcelable$Creator.createFromParcel(parcel);
    }
    
    public static void b(final Parcel parcel, final Parcelable parcelable) {
        parcel.writeInt(1);
        parcelable.writeToParcel(parcel, 0);
    }
}
