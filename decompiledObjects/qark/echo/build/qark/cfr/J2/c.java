/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  java.lang.ClassLoader
 *  java.lang.Object
 */
package J2;

import android.os.Parcel;

public abstract class c {
    public static final ClassLoader a = c.class.getClassLoader();

    public static void a(Parcel parcel, boolean bl) {
        parcel.writeInt(1);
    }

    public static boolean b(Parcel parcel) {
        if (parcel.readInt() != 0) {
            return true;
        }
        return false;
    }
}

