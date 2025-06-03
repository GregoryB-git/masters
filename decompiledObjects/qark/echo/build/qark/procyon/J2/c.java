// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package J2;

import android.os.Parcel;

public abstract class c
{
    public static final ClassLoader a;
    
    static {
        a = c.class.getClassLoader();
    }
    
    public static void a(final Parcel parcel, final boolean b) {
        parcel.writeInt(1);
    }
    
    public static boolean b(final Parcel parcel) {
        return parcel.readInt() != 0;
    }
}
