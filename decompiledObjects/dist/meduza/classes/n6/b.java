package n6;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import f;
import g;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;

public final class b
{
  public static BigDecimal a(int paramInt, Parcel paramParcel)
  {
    paramInt = s(paramInt, paramParcel);
    int i = paramParcel.dataPosition();
    if (paramInt == 0) {
      return null;
    }
    byte[] arrayOfByte = paramParcel.createByteArray();
    int j = paramParcel.readInt();
    paramParcel.setDataPosition(i + paramInt);
    return new BigDecimal(new BigInteger(arrayOfByte), j);
  }
  
  public static Bundle b(int paramInt, Parcel paramParcel)
  {
    paramInt = s(paramInt, paramParcel);
    int i = paramParcel.dataPosition();
    if (paramInt == 0) {
      return null;
    }
    Bundle localBundle = paramParcel.readBundle();
    paramParcel.setDataPosition(i + paramInt);
    return localBundle;
  }
  
  public static byte[] c(int paramInt, Parcel paramParcel)
  {
    int i = s(paramInt, paramParcel);
    paramInt = paramParcel.dataPosition();
    if (i == 0) {
      return null;
    }
    byte[] arrayOfByte = paramParcel.createByteArray();
    paramParcel.setDataPosition(paramInt + i);
    return arrayOfByte;
  }
  
  public static int[] d(int paramInt, Parcel paramParcel)
  {
    paramInt = s(paramInt, paramParcel);
    int i = paramParcel.dataPosition();
    if (paramInt == 0) {
      return null;
    }
    int[] arrayOfInt = paramParcel.createIntArray();
    paramParcel.setDataPosition(i + paramInt);
    return arrayOfInt;
  }
  
  public static <T extends Parcelable> T e(Parcel paramParcel, int paramInt, Parcelable.Creator<T> paramCreator)
  {
    paramInt = s(paramInt, paramParcel);
    int i = paramParcel.dataPosition();
    if (paramInt == 0) {
      return null;
    }
    paramCreator = (Parcelable)paramCreator.createFromParcel(paramParcel);
    paramParcel.setDataPosition(i + paramInt);
    return paramCreator;
  }
  
  public static String f(int paramInt, Parcel paramParcel)
  {
    paramInt = s(paramInt, paramParcel);
    int i = paramParcel.dataPosition();
    if (paramInt == 0) {
      return null;
    }
    String str = paramParcel.readString();
    paramParcel.setDataPosition(i + paramInt);
    return str;
  }
  
  public static ArrayList g(int paramInt, Parcel paramParcel)
  {
    paramInt = s(paramInt, paramParcel);
    int i = paramParcel.dataPosition();
    if (paramInt == 0) {
      return null;
    }
    ArrayList localArrayList = paramParcel.createStringArrayList();
    paramParcel.setDataPosition(i + paramInt);
    return localArrayList;
  }
  
  public static <T> T[] h(Parcel paramParcel, int paramInt, Parcelable.Creator<T> paramCreator)
  {
    int i = s(paramInt, paramParcel);
    paramInt = paramParcel.dataPosition();
    if (i == 0) {
      return null;
    }
    paramCreator = paramParcel.createTypedArray(paramCreator);
    paramParcel.setDataPosition(paramInt + i);
    return paramCreator;
  }
  
  public static <T> ArrayList<T> i(Parcel paramParcel, int paramInt, Parcelable.Creator<T> paramCreator)
  {
    paramInt = s(paramInt, paramParcel);
    int i = paramParcel.dataPosition();
    if (paramInt == 0) {
      return null;
    }
    paramCreator = paramParcel.createTypedArrayList(paramCreator);
    paramParcel.setDataPosition(i + paramInt);
    return paramCreator;
  }
  
  public static void j(int paramInt, Parcel paramParcel)
  {
    if (paramParcel.dataPosition() == paramInt) {
      return;
    }
    throw new a(f.h("Overread allowed size end=", paramInt), paramParcel);
  }
  
  public static boolean k(int paramInt, Parcel paramParcel)
  {
    w(paramParcel, paramInt, 4);
    return paramParcel.readInt() != 0;
  }
  
  public static Boolean l(int paramInt, Parcel paramParcel)
  {
    paramInt = s(paramInt, paramParcel);
    if (paramInt == 0) {
      return null;
    }
    v(paramParcel, paramInt, 4);
    boolean bool;
    if (paramParcel.readInt() != 0) {
      bool = true;
    } else {
      bool = false;
    }
    return Boolean.valueOf(bool);
  }
  
  public static Double m(int paramInt, Parcel paramParcel)
  {
    paramInt = s(paramInt, paramParcel);
    if (paramInt == 0) {
      return null;
    }
    v(paramParcel, paramInt, 8);
    return Double.valueOf(paramParcel.readDouble());
  }
  
  public static IBinder n(int paramInt, Parcel paramParcel)
  {
    int i = s(paramInt, paramParcel);
    paramInt = paramParcel.dataPosition();
    if (i == 0) {
      return null;
    }
    IBinder localIBinder = paramParcel.readStrongBinder();
    paramParcel.setDataPosition(paramInt + i);
    return localIBinder;
  }
  
  public static int o(int paramInt, Parcel paramParcel)
  {
    w(paramParcel, paramInt, 4);
    return paramParcel.readInt();
  }
  
  public static Integer p(int paramInt, Parcel paramParcel)
  {
    paramInt = s(paramInt, paramParcel);
    if (paramInt == 0) {
      return null;
    }
    v(paramParcel, paramInt, 4);
    return Integer.valueOf(paramParcel.readInt());
  }
  
  public static long q(int paramInt, Parcel paramParcel)
  {
    w(paramParcel, paramInt, 8);
    return paramParcel.readLong();
  }
  
  public static Long r(int paramInt, Parcel paramParcel)
  {
    paramInt = s(paramInt, paramParcel);
    if (paramInt == 0) {
      return null;
    }
    v(paramParcel, paramInt, 8);
    return Long.valueOf(paramParcel.readLong());
  }
  
  public static int s(int paramInt, Parcel paramParcel)
  {
    if ((paramInt & 0xFFFF0000) != -65536) {
      return (char)(paramInt >> 16);
    }
    return paramParcel.readInt();
  }
  
  public static void t(int paramInt, Parcel paramParcel)
  {
    paramInt = s(paramInt, paramParcel);
    paramParcel.setDataPosition(paramParcel.dataPosition() + paramInt);
  }
  
  public static int u(Parcel paramParcel)
  {
    int i = paramParcel.readInt();
    int j = s(i, paramParcel);
    int k = (char)i;
    int m = paramParcel.dataPosition();
    if (k == 20293)
    {
      k = j + m;
      if ((k >= m) && (k <= paramParcel.dataSize())) {
        return k;
      }
      throw new a(f.i("Size read is invalid start=", m, " end=", k), paramParcel);
    }
    throw new a("Expected object header. Got 0x".concat(String.valueOf(Integer.toHexString(i))), paramParcel);
  }
  
  public static void v(Parcel paramParcel, int paramInt1, int paramInt2)
  {
    if (paramInt1 == paramInt2) {
      return;
    }
    String str = Integer.toHexString(paramInt1);
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Expected size ");
    localStringBuilder.append(paramInt2);
    localStringBuilder.append(" got ");
    localStringBuilder.append(paramInt1);
    localStringBuilder.append(" (0x");
    throw new a(g.f(localStringBuilder, str, ")"), paramParcel);
  }
  
  public static void w(Parcel paramParcel, int paramInt1, int paramInt2)
  {
    paramInt1 = s(paramInt1, paramParcel);
    if (paramInt1 == paramInt2) {
      return;
    }
    String str = Integer.toHexString(paramInt1);
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Expected size ");
    localStringBuilder.append(paramInt2);
    localStringBuilder.append(" got ");
    localStringBuilder.append(paramInt1);
    localStringBuilder.append(" (0x");
    throw new a(g.f(localStringBuilder, str, ")"), paramParcel);
  }
  
  public static final class a
    extends RuntimeException
  {
    public a(String paramString, Parcel paramParcel)
    {
      super();
    }
  }
}

/* Location:
 * Qualified Name:     n6.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */