package n6;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.f;
import defpackage.g;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class b {

    public static class a extends RuntimeException {
        public a(String str, Parcel parcel) {
            super(str + " Parcel: pos=" + parcel.dataPosition() + " size=" + parcel.dataSize());
        }
    }

    public static BigDecimal a(int i10, Parcel parcel) {
        int s10 = s(i10, parcel);
        int dataPosition = parcel.dataPosition();
        if (s10 == 0) {
            return null;
        }
        byte[] createByteArray = parcel.createByteArray();
        int readInt = parcel.readInt();
        parcel.setDataPosition(dataPosition + s10);
        return new BigDecimal(new BigInteger(createByteArray), readInt);
    }

    public static Bundle b(int i10, Parcel parcel) {
        int s10 = s(i10, parcel);
        int dataPosition = parcel.dataPosition();
        if (s10 == 0) {
            return null;
        }
        Bundle readBundle = parcel.readBundle();
        parcel.setDataPosition(dataPosition + s10);
        return readBundle;
    }

    public static byte[] c(int i10, Parcel parcel) {
        int s10 = s(i10, parcel);
        int dataPosition = parcel.dataPosition();
        if (s10 == 0) {
            return null;
        }
        byte[] createByteArray = parcel.createByteArray();
        parcel.setDataPosition(dataPosition + s10);
        return createByteArray;
    }

    public static int[] d(int i10, Parcel parcel) {
        int s10 = s(i10, parcel);
        int dataPosition = parcel.dataPosition();
        if (s10 == 0) {
            return null;
        }
        int[] createIntArray = parcel.createIntArray();
        parcel.setDataPosition(dataPosition + s10);
        return createIntArray;
    }

    public static <T extends Parcelable> T e(Parcel parcel, int i10, Parcelable.Creator<T> creator) {
        int s10 = s(i10, parcel);
        int dataPosition = parcel.dataPosition();
        if (s10 == 0) {
            return null;
        }
        T createFromParcel = creator.createFromParcel(parcel);
        parcel.setDataPosition(dataPosition + s10);
        return createFromParcel;
    }

    public static String f(int i10, Parcel parcel) {
        int s10 = s(i10, parcel);
        int dataPosition = parcel.dataPosition();
        if (s10 == 0) {
            return null;
        }
        String readString = parcel.readString();
        parcel.setDataPosition(dataPosition + s10);
        return readString;
    }

    public static ArrayList g(int i10, Parcel parcel) {
        int s10 = s(i10, parcel);
        int dataPosition = parcel.dataPosition();
        if (s10 == 0) {
            return null;
        }
        ArrayList<String> createStringArrayList = parcel.createStringArrayList();
        parcel.setDataPosition(dataPosition + s10);
        return createStringArrayList;
    }

    public static <T> T[] h(Parcel parcel, int i10, Parcelable.Creator<T> creator) {
        int s10 = s(i10, parcel);
        int dataPosition = parcel.dataPosition();
        if (s10 == 0) {
            return null;
        }
        T[] tArr = (T[]) parcel.createTypedArray(creator);
        parcel.setDataPosition(dataPosition + s10);
        return tArr;
    }

    public static <T> ArrayList<T> i(Parcel parcel, int i10, Parcelable.Creator<T> creator) {
        int s10 = s(i10, parcel);
        int dataPosition = parcel.dataPosition();
        if (s10 == 0) {
            return null;
        }
        ArrayList<T> createTypedArrayList = parcel.createTypedArrayList(creator);
        parcel.setDataPosition(dataPosition + s10);
        return createTypedArrayList;
    }

    public static void j(int i10, Parcel parcel) {
        if (parcel.dataPosition() != i10) {
            throw new a(f.h("Overread allowed size end=", i10), parcel);
        }
    }

    public static boolean k(int i10, Parcel parcel) {
        w(parcel, i10, 4);
        return parcel.readInt() != 0;
    }

    public static Boolean l(int i10, Parcel parcel) {
        int s10 = s(i10, parcel);
        if (s10 == 0) {
            return null;
        }
        v(parcel, s10, 4);
        return Boolean.valueOf(parcel.readInt() != 0);
    }

    public static Double m(int i10, Parcel parcel) {
        int s10 = s(i10, parcel);
        if (s10 == 0) {
            return null;
        }
        v(parcel, s10, 8);
        return Double.valueOf(parcel.readDouble());
    }

    public static IBinder n(int i10, Parcel parcel) {
        int s10 = s(i10, parcel);
        int dataPosition = parcel.dataPosition();
        if (s10 == 0) {
            return null;
        }
        IBinder readStrongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(dataPosition + s10);
        return readStrongBinder;
    }

    public static int o(int i10, Parcel parcel) {
        w(parcel, i10, 4);
        return parcel.readInt();
    }

    public static Integer p(int i10, Parcel parcel) {
        int s10 = s(i10, parcel);
        if (s10 == 0) {
            return null;
        }
        v(parcel, s10, 4);
        return Integer.valueOf(parcel.readInt());
    }

    public static long q(int i10, Parcel parcel) {
        w(parcel, i10, 8);
        return parcel.readLong();
    }

    public static Long r(int i10, Parcel parcel) {
        int s10 = s(i10, parcel);
        if (s10 == 0) {
            return null;
        }
        v(parcel, s10, 8);
        return Long.valueOf(parcel.readLong());
    }

    public static int s(int i10, Parcel parcel) {
        return (i10 & (-65536)) != -65536 ? (char) (i10 >> 16) : parcel.readInt();
    }

    public static void t(int i10, Parcel parcel) {
        parcel.setDataPosition(parcel.dataPosition() + s(i10, parcel));
    }

    public static int u(Parcel parcel) {
        int readInt = parcel.readInt();
        int s10 = s(readInt, parcel);
        char c10 = (char) readInt;
        int dataPosition = parcel.dataPosition();
        if (c10 != 20293) {
            throw new a("Expected object header. Got 0x".concat(String.valueOf(Integer.toHexString(readInt))), parcel);
        }
        int i10 = s10 + dataPosition;
        if (i10 < dataPosition || i10 > parcel.dataSize()) {
            throw new a(f.i("Size read is invalid start=", dataPosition, " end=", i10), parcel);
        }
        return i10;
    }

    public static void v(Parcel parcel, int i10, int i11) {
        if (i10 == i11) {
            return;
        }
        String hexString = Integer.toHexString(i10);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Expected size ");
        sb2.append(i11);
        sb2.append(" got ");
        sb2.append(i10);
        sb2.append(" (0x");
        throw new a(g.f(sb2, hexString, ")"), parcel);
    }

    public static void w(Parcel parcel, int i10, int i11) {
        int s10 = s(i10, parcel);
        if (s10 == i11) {
            return;
        }
        String hexString = Integer.toHexString(s10);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Expected size ");
        sb2.append(i11);
        sb2.append(" got ");
        sb2.append(s10);
        sb2.append(" (0x");
        throw new a(g.f(sb2, hexString, ")"), parcel);
    }
}
