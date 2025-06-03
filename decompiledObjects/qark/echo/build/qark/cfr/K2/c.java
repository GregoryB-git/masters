/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.BadParcelableException
 *  android.os.IBinder
 *  android.os.IInterface
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  java.lang.ClassLoader
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package K2;

import android.os.BadParcelableException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

public abstract class c {
    public static final ClassLoader a = c.class.getClassLoader();

    public static Parcelable a(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return (Parcelable)creator.createFromParcel(parcel);
    }

    public static void b(Parcel parcel) {
        int n8 = parcel.dataAvail();
        if (n8 <= 0) {
            return;
        }
        parcel = new StringBuilder();
        parcel.append("Parcel data not fully consumed, unread size: ");
        parcel.append(n8);
        throw new BadParcelableException(parcel.toString());
    }

    public static void c(Parcel parcel, Parcelable parcelable) {
        if (parcelable == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcelable.writeToParcel(parcel, 0);
    }

    /*
     * Enabled aggressive block sorting
     */
    public static void d(Parcel parcel, IInterface iInterface) {
        iInterface = iInterface == null ? null : iInterface.asBinder();
        parcel.writeStrongBinder((IBinder)iInterface);
    }
}

