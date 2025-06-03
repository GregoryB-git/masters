/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.os.IBinder
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  java.lang.Boolean
 *  java.lang.Double
 *  java.lang.Float
 *  java.lang.Integer
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.ArrayList
 */
package B2;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

public abstract class b {
    public static Bundle a(Parcel parcel, int n8) {
        n8 = b.s(parcel, n8);
        int n9 = parcel.dataPosition();
        if (n8 == 0) {
            return null;
        }
        Bundle bundle = parcel.readBundle();
        parcel.setDataPosition(n9 + n8);
        return bundle;
    }

    public static int[] b(Parcel parcel, int n8) {
        n8 = b.s(parcel, n8);
        int n9 = parcel.dataPosition();
        if (n8 == 0) {
            return null;
        }
        int[] arrn = parcel.createIntArray();
        parcel.setDataPosition(n9 + n8);
        return arrn;
    }

    public static Parcelable c(Parcel parcel, int n8, Parcelable.Creator creator) {
        n8 = b.s(parcel, n8);
        int n9 = parcel.dataPosition();
        if (n8 == 0) {
            return null;
        }
        creator = (Parcelable)creator.createFromParcel(parcel);
        parcel.setDataPosition(n9 + n8);
        return creator;
    }

    public static String d(Parcel parcel, int n8) {
        n8 = b.s(parcel, n8);
        int n9 = parcel.dataPosition();
        if (n8 == 0) {
            return null;
        }
        String string2 = parcel.readString();
        parcel.setDataPosition(n9 + n8);
        return string2;
    }

    public static ArrayList e(Parcel parcel, int n8) {
        n8 = b.s(parcel, n8);
        int n9 = parcel.dataPosition();
        if (n8 == 0) {
            return null;
        }
        ArrayList arrayList = parcel.createStringArrayList();
        parcel.setDataPosition(n9 + n8);
        return arrayList;
    }

    public static Object[] f(Parcel parcel, int n8, Parcelable.Creator arrobject) {
        n8 = b.s(parcel, n8);
        int n9 = parcel.dataPosition();
        if (n8 == 0) {
            return null;
        }
        arrobject = parcel.createTypedArray((Parcelable.Creator)arrobject);
        parcel.setDataPosition(n9 + n8);
        return arrobject;
    }

    public static ArrayList g(Parcel parcel, int n8, Parcelable.Creator creator) {
        n8 = b.s(parcel, n8);
        int n9 = parcel.dataPosition();
        if (n8 == 0) {
            return null;
        }
        creator = parcel.createTypedArrayList(creator);
        parcel.setDataPosition(n9 + n8);
        return creator;
    }

    public static void h(Parcel parcel, int n8) {
        if (parcel.dataPosition() == n8) {
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Overread allowed size end=");
        stringBuilder.append(n8);
        throw new a(stringBuilder.toString(), parcel);
    }

    public static int i(int n8) {
        return (char)n8;
    }

    public static boolean j(Parcel parcel, int n8) {
        b.w(parcel, n8, 4);
        if (parcel.readInt() != 0) {
            return true;
        }
        return false;
    }

    public static Boolean k(Parcel parcel, int n8) {
        int n9 = b.s(parcel, n8);
        if (n9 == 0) {
            return null;
        }
        b.v(parcel, n8, n9, 4);
        boolean bl = parcel.readInt() != 0;
        return bl;
    }

    public static Double l(Parcel parcel, int n8) {
        int n9 = b.s(parcel, n8);
        if (n9 == 0) {
            return null;
        }
        b.v(parcel, n8, n9, 8);
        return parcel.readDouble();
    }

    public static Float m(Parcel parcel, int n8) {
        int n9 = b.s(parcel, n8);
        if (n9 == 0) {
            return null;
        }
        b.v(parcel, n8, n9, 4);
        return Float.valueOf((float)parcel.readFloat());
    }

    public static int n(Parcel parcel) {
        return parcel.readInt();
    }

    public static IBinder o(Parcel parcel, int n8) {
        n8 = b.s(parcel, n8);
        int n9 = parcel.dataPosition();
        if (n8 == 0) {
            return null;
        }
        IBinder iBinder = parcel.readStrongBinder();
        parcel.setDataPosition(n9 + n8);
        return iBinder;
    }

    public static int p(Parcel parcel, int n8) {
        b.w(parcel, n8, 4);
        return parcel.readInt();
    }

    public static long q(Parcel parcel, int n8) {
        b.w(parcel, n8, 8);
        return parcel.readLong();
    }

    public static Long r(Parcel parcel, int n8) {
        int n9 = b.s(parcel, n8);
        if (n9 == 0) {
            return null;
        }
        b.v(parcel, n8, n9, 8);
        return parcel.readLong();
    }

    public static int s(Parcel parcel, int n8) {
        if ((n8 & -65536) != -65536) {
            return (char)(n8 >> 16);
        }
        return parcel.readInt();
    }

    public static void t(Parcel parcel, int n8) {
        n8 = b.s(parcel, n8);
        parcel.setDataPosition(parcel.dataPosition() + n8);
    }

    public static int u(Parcel parcel) {
        int n8 = b.n(parcel);
        int n9 = b.s(parcel, n8);
        int n10 = parcel.dataPosition();
        if (b.i(n8) == 20293) {
            n8 = n9 + n10;
            if (n8 >= n10 && n8 <= parcel.dataSize()) {
                return n8;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Size read is invalid start=");
            stringBuilder.append(n10);
            stringBuilder.append(" end=");
            stringBuilder.append(n8);
            throw new a(stringBuilder.toString(), parcel);
        }
        throw new a("Expected object header. Got 0x".concat(String.valueOf((Object)Integer.toHexString((int)n8))), parcel);
    }

    public static void v(Parcel parcel, int n8, int n9, int n10) {
        if (n9 == n10) {
            return;
        }
        String string2 = Integer.toHexString((int)n9);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Expected size ");
        stringBuilder.append(n10);
        stringBuilder.append(" got ");
        stringBuilder.append(n9);
        stringBuilder.append(" (0x");
        stringBuilder.append(string2);
        stringBuilder.append(")");
        throw new a(stringBuilder.toString(), parcel);
    }

    public static void w(Parcel parcel, int n8, int n9) {
        if ((n8 = b.s(parcel, n8)) == n9) {
            return;
        }
        String string2 = Integer.toHexString((int)n8);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Expected size ");
        stringBuilder.append(n9);
        stringBuilder.append(" got ");
        stringBuilder.append(n8);
        stringBuilder.append(" (0x");
        stringBuilder.append(string2);
        stringBuilder.append(")");
        throw new a(stringBuilder.toString(), parcel);
    }

    public static class a
    extends RuntimeException {
        public a(String string2, Parcel parcel) {
            int n8 = parcel.dataPosition();
            int n9 = parcel.dataSize();
            parcel = new StringBuilder();
            parcel.append(string2);
            parcel.append(" Parcel: pos=");
            parcel.append(n8);
            parcel.append(" size=");
            parcel.append(n9);
            super(parcel.toString());
        }
    }

}

