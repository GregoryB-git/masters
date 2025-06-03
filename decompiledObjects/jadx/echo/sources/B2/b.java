package B2;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class b {

    public static class a extends RuntimeException {
        public a(String str, Parcel parcel) {
            super(str + " Parcel: pos=" + parcel.dataPosition() + " size=" + parcel.dataSize());
        }
    }

    public static Bundle a(Parcel parcel, int i7) {
        int s7 = s(parcel, i7);
        int dataPosition = parcel.dataPosition();
        if (s7 == 0) {
            return null;
        }
        Bundle readBundle = parcel.readBundle();
        parcel.setDataPosition(dataPosition + s7);
        return readBundle;
    }

    public static int[] b(Parcel parcel, int i7) {
        int s7 = s(parcel, i7);
        int dataPosition = parcel.dataPosition();
        if (s7 == 0) {
            return null;
        }
        int[] createIntArray = parcel.createIntArray();
        parcel.setDataPosition(dataPosition + s7);
        return createIntArray;
    }

    public static Parcelable c(Parcel parcel, int i7, Parcelable.Creator creator) {
        int s7 = s(parcel, i7);
        int dataPosition = parcel.dataPosition();
        if (s7 == 0) {
            return null;
        }
        Parcelable parcelable = (Parcelable) creator.createFromParcel(parcel);
        parcel.setDataPosition(dataPosition + s7);
        return parcelable;
    }

    public static String d(Parcel parcel, int i7) {
        int s7 = s(parcel, i7);
        int dataPosition = parcel.dataPosition();
        if (s7 == 0) {
            return null;
        }
        String readString = parcel.readString();
        parcel.setDataPosition(dataPosition + s7);
        return readString;
    }

    public static ArrayList e(Parcel parcel, int i7) {
        int s7 = s(parcel, i7);
        int dataPosition = parcel.dataPosition();
        if (s7 == 0) {
            return null;
        }
        ArrayList<String> createStringArrayList = parcel.createStringArrayList();
        parcel.setDataPosition(dataPosition + s7);
        return createStringArrayList;
    }

    public static Object[] f(Parcel parcel, int i7, Parcelable.Creator creator) {
        int s7 = s(parcel, i7);
        int dataPosition = parcel.dataPosition();
        if (s7 == 0) {
            return null;
        }
        Object[] createTypedArray = parcel.createTypedArray(creator);
        parcel.setDataPosition(dataPosition + s7);
        return createTypedArray;
    }

    public static ArrayList g(Parcel parcel, int i7, Parcelable.Creator creator) {
        int s7 = s(parcel, i7);
        int dataPosition = parcel.dataPosition();
        if (s7 == 0) {
            return null;
        }
        ArrayList createTypedArrayList = parcel.createTypedArrayList(creator);
        parcel.setDataPosition(dataPosition + s7);
        return createTypedArrayList;
    }

    public static void h(Parcel parcel, int i7) {
        if (parcel.dataPosition() == i7) {
            return;
        }
        throw new a("Overread allowed size end=" + i7, parcel);
    }

    public static int i(int i7) {
        return (char) i7;
    }

    public static boolean j(Parcel parcel, int i7) {
        w(parcel, i7, 4);
        return parcel.readInt() != 0;
    }

    public static Boolean k(Parcel parcel, int i7) {
        int s7 = s(parcel, i7);
        if (s7 == 0) {
            return null;
        }
        v(parcel, i7, s7, 4);
        return Boolean.valueOf(parcel.readInt() != 0);
    }

    public static Double l(Parcel parcel, int i7) {
        int s7 = s(parcel, i7);
        if (s7 == 0) {
            return null;
        }
        v(parcel, i7, s7, 8);
        return Double.valueOf(parcel.readDouble());
    }

    public static Float m(Parcel parcel, int i7) {
        int s7 = s(parcel, i7);
        if (s7 == 0) {
            return null;
        }
        v(parcel, i7, s7, 4);
        return Float.valueOf(parcel.readFloat());
    }

    public static int n(Parcel parcel) {
        return parcel.readInt();
    }

    public static IBinder o(Parcel parcel, int i7) {
        int s7 = s(parcel, i7);
        int dataPosition = parcel.dataPosition();
        if (s7 == 0) {
            return null;
        }
        IBinder readStrongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(dataPosition + s7);
        return readStrongBinder;
    }

    public static int p(Parcel parcel, int i7) {
        w(parcel, i7, 4);
        return parcel.readInt();
    }

    public static long q(Parcel parcel, int i7) {
        w(parcel, i7, 8);
        return parcel.readLong();
    }

    public static Long r(Parcel parcel, int i7) {
        int s7 = s(parcel, i7);
        if (s7 == 0) {
            return null;
        }
        v(parcel, i7, s7, 8);
        return Long.valueOf(parcel.readLong());
    }

    public static int s(Parcel parcel, int i7) {
        return (i7 & (-65536)) != -65536 ? (char) (i7 >> 16) : parcel.readInt();
    }

    public static void t(Parcel parcel, int i7) {
        parcel.setDataPosition(parcel.dataPosition() + s(parcel, i7));
    }

    public static int u(Parcel parcel) {
        int n7 = n(parcel);
        int s7 = s(parcel, n7);
        int dataPosition = parcel.dataPosition();
        if (i(n7) != 20293) {
            throw new a("Expected object header. Got 0x".concat(String.valueOf(Integer.toHexString(n7))), parcel);
        }
        int i7 = s7 + dataPosition;
        if (i7 >= dataPosition && i7 <= parcel.dataSize()) {
            return i7;
        }
        throw new a("Size read is invalid start=" + dataPosition + " end=" + i7, parcel);
    }

    public static void v(Parcel parcel, int i7, int i8, int i9) {
        if (i8 == i9) {
            return;
        }
        throw new a("Expected size " + i9 + " got " + i8 + " (0x" + Integer.toHexString(i8) + ")", parcel);
    }

    public static void w(Parcel parcel, int i7, int i8) {
        int s7 = s(parcel, i7);
        if (s7 == i8) {
            return;
        }
        throw new a("Expected size " + i8 + " got " + s7 + " (0x" + Integer.toHexString(s7) + ")", parcel);
    }
}
