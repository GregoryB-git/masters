package B2;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.ArrayList;

public abstract class b
{
  public static Bundle a(Parcel paramParcel, int paramInt)
  {
    int i = s(paramParcel, paramInt);
    paramInt = paramParcel.dataPosition();
    if (i == 0) {
      return null;
    }
    Bundle localBundle = paramParcel.readBundle();
    paramParcel.setDataPosition(paramInt + i);
    return localBundle;
  }
  
  public static int[] b(Parcel paramParcel, int paramInt)
  {
    int i = s(paramParcel, paramInt);
    paramInt = paramParcel.dataPosition();
    if (i == 0) {
      return null;
    }
    int[] arrayOfInt = paramParcel.createIntArray();
    paramParcel.setDataPosition(paramInt + i);
    return arrayOfInt;
  }
  
  public static Parcelable c(Parcel paramParcel, int paramInt, Parcelable.Creator paramCreator)
  {
    paramInt = s(paramParcel, paramInt);
    int i = paramParcel.dataPosition();
    if (paramInt == 0) {
      return null;
    }
    paramCreator = (Parcelable)paramCreator.createFromParcel(paramParcel);
    paramParcel.setDataPosition(i + paramInt);
    return paramCreator;
  }
  
  public static String d(Parcel paramParcel, int paramInt)
  {
    paramInt = s(paramParcel, paramInt);
    int i = paramParcel.dataPosition();
    if (paramInt == 0) {
      return null;
    }
    String str = paramParcel.readString();
    paramParcel.setDataPosition(i + paramInt);
    return str;
  }
  
  public static ArrayList e(Parcel paramParcel, int paramInt)
  {
    int i = s(paramParcel, paramInt);
    paramInt = paramParcel.dataPosition();
    if (i == 0) {
      return null;
    }
    ArrayList localArrayList = paramParcel.createStringArrayList();
    paramParcel.setDataPosition(paramInt + i);
    return localArrayList;
  }
  
  public static Object[] f(Parcel paramParcel, int paramInt, Parcelable.Creator paramCreator)
  {
    int i = s(paramParcel, paramInt);
    paramInt = paramParcel.dataPosition();
    if (i == 0) {
      return null;
    }
    paramCreator = paramParcel.createTypedArray(paramCreator);
    paramParcel.setDataPosition(paramInt + i);
    return paramCreator;
  }
  
  public static ArrayList g(Parcel paramParcel, int paramInt, Parcelable.Creator paramCreator)
  {
    paramInt = s(paramParcel, paramInt);
    int i = paramParcel.dataPosition();
    if (paramInt == 0) {
      return null;
    }
    paramCreator = paramParcel.createTypedArrayList(paramCreator);
    paramParcel.setDataPosition(i + paramInt);
    return paramCreator;
  }
  
  public static void h(Parcel paramParcel, int paramInt)
  {
    if (paramParcel.dataPosition() == paramInt) {
      return;
    }
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Overread allowed size end=");
    localStringBuilder.append(paramInt);
    throw new a(localStringBuilder.toString(), paramParcel);
  }
  
  public static int i(int paramInt)
  {
    return (char)paramInt;
  }
  
  public static boolean j(Parcel paramParcel, int paramInt)
  {
    w(paramParcel, paramInt, 4);
    return paramParcel.readInt() != 0;
  }
  
  public static Boolean k(Parcel paramParcel, int paramInt)
  {
    int i = s(paramParcel, paramInt);
    if (i == 0) {
      return null;
    }
    v(paramParcel, paramInt, i, 4);
    boolean bool;
    if (paramParcel.readInt() != 0) {
      bool = true;
    } else {
      bool = false;
    }
    return Boolean.valueOf(bool);
  }
  
  public static Double l(Parcel paramParcel, int paramInt)
  {
    int i = s(paramParcel, paramInt);
    if (i == 0) {
      return null;
    }
    v(paramParcel, paramInt, i, 8);
    return Double.valueOf(paramParcel.readDouble());
  }
  
  public static Float m(Parcel paramParcel, int paramInt)
  {
    int i = s(paramParcel, paramInt);
    if (i == 0) {
      return null;
    }
    v(paramParcel, paramInt, i, 4);
    return Float.valueOf(paramParcel.readFloat());
  }
  
  public static int n(Parcel paramParcel)
  {
    return paramParcel.readInt();
  }
  
  public static IBinder o(Parcel paramParcel, int paramInt)
  {
    paramInt = s(paramParcel, paramInt);
    int i = paramParcel.dataPosition();
    if (paramInt == 0) {
      return null;
    }
    IBinder localIBinder = paramParcel.readStrongBinder();
    paramParcel.setDataPosition(i + paramInt);
    return localIBinder;
  }
  
  public static int p(Parcel paramParcel, int paramInt)
  {
    w(paramParcel, paramInt, 4);
    return paramParcel.readInt();
  }
  
  public static long q(Parcel paramParcel, int paramInt)
  {
    w(paramParcel, paramInt, 8);
    return paramParcel.readLong();
  }
  
  public static Long r(Parcel paramParcel, int paramInt)
  {
    int i = s(paramParcel, paramInt);
    if (i == 0) {
      return null;
    }
    v(paramParcel, paramInt, i, 8);
    return Long.valueOf(paramParcel.readLong());
  }
  
  public static int s(Parcel paramParcel, int paramInt)
  {
    if ((paramInt & 0xFFFF0000) != -65536) {
      return (char)(paramInt >> 16);
    }
    return paramParcel.readInt();
  }
  
  public static void t(Parcel paramParcel, int paramInt)
  {
    paramInt = s(paramParcel, paramInt);
    paramParcel.setDataPosition(paramParcel.dataPosition() + paramInt);
  }
  
  public static int u(Parcel paramParcel)
  {
    int i = n(paramParcel);
    int j = s(paramParcel, i);
    int k = paramParcel.dataPosition();
    if (i(i) == 20293)
    {
      i = j + k;
      if ((i >= k) && (i <= paramParcel.dataSize())) {
        return i;
      }
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("Size read is invalid start=");
      localStringBuilder.append(k);
      localStringBuilder.append(" end=");
      localStringBuilder.append(i);
      throw new a(localStringBuilder.toString(), paramParcel);
    }
    throw new a("Expected object header. Got 0x".concat(String.valueOf(Integer.toHexString(i))), paramParcel);
  }
  
  public static void v(Parcel paramParcel, int paramInt1, int paramInt2, int paramInt3)
  {
    if (paramInt2 == paramInt3) {
      return;
    }
    String str = Integer.toHexString(paramInt2);
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Expected size ");
    localStringBuilder.append(paramInt3);
    localStringBuilder.append(" got ");
    localStringBuilder.append(paramInt2);
    localStringBuilder.append(" (0x");
    localStringBuilder.append(str);
    localStringBuilder.append(")");
    throw new a(localStringBuilder.toString(), paramParcel);
  }
  
  public static void w(Parcel paramParcel, int paramInt1, int paramInt2)
  {
    paramInt1 = s(paramParcel, paramInt1);
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
    localStringBuilder.append(str);
    localStringBuilder.append(")");
    throw new a(localStringBuilder.toString(), paramParcel);
  }
  
  public static class a
    extends RuntimeException
  {
    public a(String paramString, Parcel paramParcel)
    {
      super();
    }
  }
}

/* Location:
 * Qualified Name:     B2.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */