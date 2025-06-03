// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package B2;

import android.os.IBinder;
import java.util.ArrayList;
import android.os.Parcelable;
import android.os.Parcelable$Creator;
import android.os.Bundle;
import android.os.Parcel;

public abstract class b
{
    public static Bundle a(final Parcel parcel, int s) {
        s = s(parcel, s);
        final int dataPosition = parcel.dataPosition();
        if (s == 0) {
            return null;
        }
        final Bundle bundle = parcel.readBundle();
        parcel.setDataPosition(dataPosition + s);
        return bundle;
    }
    
    public static int[] b(final Parcel parcel, int s) {
        s = s(parcel, s);
        final int dataPosition = parcel.dataPosition();
        if (s == 0) {
            return null;
        }
        final int[] intArray = parcel.createIntArray();
        parcel.setDataPosition(dataPosition + s);
        return intArray;
    }
    
    public static Parcelable c(final Parcel parcel, int s, final Parcelable$Creator parcelable$Creator) {
        s = s(parcel, s);
        final int dataPosition = parcel.dataPosition();
        if (s == 0) {
            return null;
        }
        final Parcelable parcelable = (Parcelable)parcelable$Creator.createFromParcel(parcel);
        parcel.setDataPosition(dataPosition + s);
        return parcelable;
    }
    
    public static String d(final Parcel parcel, int s) {
        s = s(parcel, s);
        final int dataPosition = parcel.dataPosition();
        if (s == 0) {
            return null;
        }
        final String string = parcel.readString();
        parcel.setDataPosition(dataPosition + s);
        return string;
    }
    
    public static ArrayList e(final Parcel parcel, int s) {
        s = s(parcel, s);
        final int dataPosition = parcel.dataPosition();
        if (s == 0) {
            return null;
        }
        final ArrayList stringArrayList = parcel.createStringArrayList();
        parcel.setDataPosition(dataPosition + s);
        return stringArrayList;
    }
    
    public static Object[] f(final Parcel parcel, int s, final Parcelable$Creator parcelable$Creator) {
        s = s(parcel, s);
        final int dataPosition = parcel.dataPosition();
        if (s == 0) {
            return null;
        }
        final Object[] typedArray = parcel.createTypedArray(parcelable$Creator);
        parcel.setDataPosition(dataPosition + s);
        return typedArray;
    }
    
    public static ArrayList g(final Parcel parcel, int s, final Parcelable$Creator parcelable$Creator) {
        s = s(parcel, s);
        final int dataPosition = parcel.dataPosition();
        if (s == 0) {
            return null;
        }
        final ArrayList typedArrayList = parcel.createTypedArrayList(parcelable$Creator);
        parcel.setDataPosition(dataPosition + s);
        return typedArrayList;
    }
    
    public static void h(final Parcel parcel, final int i) {
        if (parcel.dataPosition() == i) {
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Overread allowed size end=");
        sb.append(i);
        throw new a(sb.toString(), parcel);
    }
    
    public static int i(final int n) {
        return (char)n;
    }
    
    public static boolean j(final Parcel parcel, final int n) {
        w(parcel, n, 4);
        return parcel.readInt() != 0;
    }
    
    public static Boolean k(final Parcel parcel, final int n) {
        final int s = s(parcel, n);
        if (s == 0) {
            return null;
        }
        v(parcel, n, s, 4);
        return parcel.readInt() != 0;
    }
    
    public static Double l(final Parcel parcel, final int n) {
        final int s = s(parcel, n);
        if (s == 0) {
            return null;
        }
        v(parcel, n, s, 8);
        return parcel.readDouble();
    }
    
    public static Float m(final Parcel parcel, final int n) {
        final int s = s(parcel, n);
        if (s == 0) {
            return null;
        }
        v(parcel, n, s, 4);
        return parcel.readFloat();
    }
    
    public static int n(final Parcel parcel) {
        return parcel.readInt();
    }
    
    public static IBinder o(final Parcel parcel, int s) {
        s = s(parcel, s);
        final int dataPosition = parcel.dataPosition();
        if (s == 0) {
            return null;
        }
        final IBinder strongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(dataPosition + s);
        return strongBinder;
    }
    
    public static int p(final Parcel parcel, final int n) {
        w(parcel, n, 4);
        return parcel.readInt();
    }
    
    public static long q(final Parcel parcel, final int n) {
        w(parcel, n, 8);
        return parcel.readLong();
    }
    
    public static Long r(final Parcel parcel, final int n) {
        final int s = s(parcel, n);
        if (s == 0) {
            return null;
        }
        v(parcel, n, s, 8);
        return parcel.readLong();
    }
    
    public static int s(final Parcel parcel, final int n) {
        if ((n & 0xFFFF0000) != 0xFFFF0000) {
            return (char)(n >> 16);
        }
        return parcel.readInt();
    }
    
    public static void t(final Parcel parcel, int s) {
        s = s(parcel, s);
        parcel.setDataPosition(parcel.dataPosition() + s);
    }
    
    public static int u(final Parcel parcel) {
        final int n = n(parcel);
        final int s = s(parcel, n);
        final int dataPosition = parcel.dataPosition();
        if (i(n) != 20293) {
            throw new a("Expected object header. Got 0x".concat(String.valueOf(Integer.toHexString(n))), parcel);
        }
        final int i = s + dataPosition;
        if (i >= dataPosition && i <= parcel.dataSize()) {
            return i;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Size read is invalid start=");
        sb.append(dataPosition);
        sb.append(" end=");
        sb.append(i);
        throw new a(sb.toString(), parcel);
    }
    
    public static void v(final Parcel parcel, final int n, final int n2, final int i) {
        if (n2 == i) {
            return;
        }
        final String hexString = Integer.toHexString(n2);
        final StringBuilder sb = new StringBuilder();
        sb.append("Expected size ");
        sb.append(i);
        sb.append(" got ");
        sb.append(n2);
        sb.append(" (0x");
        sb.append(hexString);
        sb.append(")");
        throw new a(sb.toString(), parcel);
    }
    
    public static void w(final Parcel parcel, int s, final int i) {
        s = s(parcel, s);
        if (s == i) {
            return;
        }
        final String hexString = Integer.toHexString(s);
        final StringBuilder sb = new StringBuilder();
        sb.append("Expected size ");
        sb.append(i);
        sb.append(" got ");
        sb.append(s);
        sb.append(" (0x");
        sb.append(hexString);
        sb.append(")");
        throw new a(sb.toString(), parcel);
    }
    
    public static class a extends RuntimeException
    {
        public a(final String str, final Parcel parcel) {
            final int dataPosition = parcel.dataPosition();
            final int dataSize = parcel.dataSize();
            final StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(" Parcel: pos=");
            sb.append(dataPosition);
            sb.append(" size=");
            sb.append(dataSize);
            super(sb.toString());
        }
    }
}
