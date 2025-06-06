// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package K2;

import android.os.IBinder;
import android.os.IInterface;
import android.os.BadParcelableException;
import android.os.Parcelable;
import android.os.Parcelable$Creator;
import android.os.Parcel;

public abstract class c
{
    public static final ClassLoader a;
    
    static {
        a = c.class.getClassLoader();
    }
    
    public static Parcelable a(final Parcel parcel, final Parcelable$Creator parcelable$Creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return (Parcelable)parcelable$Creator.createFromParcel(parcel);
    }
    
    public static void b(final Parcel parcel) {
        final int dataAvail = parcel.dataAvail();
        if (dataAvail <= 0) {
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Parcel data not fully consumed, unread size: ");
        sb.append(dataAvail);
        throw new BadParcelableException(sb.toString());
    }
    
    public static void c(final Parcel parcel, final Parcelable parcelable) {
        if (parcelable == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcelable.writeToParcel(parcel, 0);
    }
    
    public static void d(final Parcel parcel, final IInterface interface1) {
        IBinder binder;
        if (interface1 == null) {
            binder = null;
        }
        else {
            binder = interface1.asBinder();
        }
        parcel.writeStrongBinder(binder);
    }
}
