package B2;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

public abstract class c
{
  public static int a(Parcel paramParcel)
  {
    return r(paramParcel, 20293);
  }
  
  public static void b(Parcel paramParcel, int paramInt)
  {
    s(paramParcel, paramInt);
  }
  
  public static void c(Parcel paramParcel, int paramInt, boolean paramBoolean)
  {
    t(paramParcel, paramInt, 4);
    paramParcel.writeInt(paramBoolean);
  }
  
  public static void d(Parcel paramParcel, int paramInt, Boolean paramBoolean, boolean paramBoolean1)
  {
    if (paramBoolean == null)
    {
      if (paramBoolean1) {
        t(paramParcel, paramInt, 0);
      }
      return;
    }
    t(paramParcel, paramInt, 4);
    paramParcel.writeInt(paramBoolean.booleanValue());
  }
  
  public static void e(Parcel paramParcel, int paramInt, Bundle paramBundle, boolean paramBoolean)
  {
    if (paramBundle == null)
    {
      if (paramBoolean) {
        t(paramParcel, paramInt, 0);
      }
      return;
    }
    paramInt = r(paramParcel, paramInt);
    paramParcel.writeBundle(paramBundle);
    s(paramParcel, paramInt);
  }
  
  public static void f(Parcel paramParcel, int paramInt, Double paramDouble, boolean paramBoolean)
  {
    if (paramDouble == null)
    {
      if (paramBoolean) {
        t(paramParcel, paramInt, 0);
      }
      return;
    }
    t(paramParcel, paramInt, 8);
    paramParcel.writeDouble(paramDouble.doubleValue());
  }
  
  public static void g(Parcel paramParcel, int paramInt, Float paramFloat, boolean paramBoolean)
  {
    if (paramFloat == null)
    {
      if (paramBoolean) {
        t(paramParcel, paramInt, 0);
      }
      return;
    }
    t(paramParcel, paramInt, 4);
    paramParcel.writeFloat(paramFloat.floatValue());
  }
  
  public static void h(Parcel paramParcel, int paramInt, IBinder paramIBinder, boolean paramBoolean)
  {
    if (paramIBinder == null)
    {
      if (paramBoolean) {
        t(paramParcel, paramInt, 0);
      }
      return;
    }
    paramInt = r(paramParcel, paramInt);
    paramParcel.writeStrongBinder(paramIBinder);
    s(paramParcel, paramInt);
  }
  
  public static void i(Parcel paramParcel, int paramInt1, int paramInt2)
  {
    t(paramParcel, paramInt1, 4);
    paramParcel.writeInt(paramInt2);
  }
  
  public static void j(Parcel paramParcel, int paramInt, int[] paramArrayOfInt, boolean paramBoolean)
  {
    if (paramArrayOfInt == null)
    {
      if (paramBoolean) {
        t(paramParcel, paramInt, 0);
      }
      return;
    }
    paramInt = r(paramParcel, paramInt);
    paramParcel.writeIntArray(paramArrayOfInt);
    s(paramParcel, paramInt);
  }
  
  public static void k(Parcel paramParcel, int paramInt, long paramLong)
  {
    t(paramParcel, paramInt, 8);
    paramParcel.writeLong(paramLong);
  }
  
  public static void l(Parcel paramParcel, int paramInt, Long paramLong, boolean paramBoolean)
  {
    if (paramLong == null)
    {
      if (paramBoolean) {
        t(paramParcel, paramInt, 0);
      }
      return;
    }
    t(paramParcel, paramInt, 8);
    paramParcel.writeLong(paramLong.longValue());
  }
  
  public static void m(Parcel paramParcel, int paramInt1, Parcelable paramParcelable, int paramInt2, boolean paramBoolean)
  {
    if (paramParcelable == null)
    {
      if (paramBoolean) {
        t(paramParcel, paramInt1, 0);
      }
      return;
    }
    paramInt1 = r(paramParcel, paramInt1);
    paramParcelable.writeToParcel(paramParcel, paramInt2);
    s(paramParcel, paramInt1);
  }
  
  public static void n(Parcel paramParcel, int paramInt, String paramString, boolean paramBoolean)
  {
    if (paramString == null)
    {
      if (paramBoolean) {
        t(paramParcel, paramInt, 0);
      }
      return;
    }
    paramInt = r(paramParcel, paramInt);
    paramParcel.writeString(paramString);
    s(paramParcel, paramInt);
  }
  
  public static void o(Parcel paramParcel, int paramInt, List paramList, boolean paramBoolean)
  {
    if (paramList == null)
    {
      if (paramBoolean) {
        t(paramParcel, paramInt, 0);
      }
      return;
    }
    paramInt = r(paramParcel, paramInt);
    paramParcel.writeStringList(paramList);
    s(paramParcel, paramInt);
  }
  
  public static void p(Parcel paramParcel, int paramInt1, Parcelable[] paramArrayOfParcelable, int paramInt2, boolean paramBoolean)
  {
    if (paramArrayOfParcelable == null)
    {
      if (paramBoolean) {
        t(paramParcel, paramInt1, 0);
      }
      return;
    }
    int i = r(paramParcel, paramInt1);
    int j = paramArrayOfParcelable.length;
    paramParcel.writeInt(j);
    for (paramInt1 = 0; paramInt1 < j; paramInt1++)
    {
      Parcelable localParcelable = paramArrayOfParcelable[paramInt1];
      if (localParcelable == null) {
        paramParcel.writeInt(0);
      } else {
        u(paramParcel, localParcelable, paramInt2);
      }
    }
    s(paramParcel, i);
  }
  
  public static void q(Parcel paramParcel, int paramInt, List paramList, boolean paramBoolean)
  {
    if (paramList == null)
    {
      if (paramBoolean) {
        t(paramParcel, paramInt, 0);
      }
      return;
    }
    int i = r(paramParcel, paramInt);
    int j = paramList.size();
    paramParcel.writeInt(j);
    for (paramInt = 0; paramInt < j; paramInt++)
    {
      Parcelable localParcelable = (Parcelable)paramList.get(paramInt);
      if (localParcelable == null) {
        paramParcel.writeInt(0);
      } else {
        u(paramParcel, localParcelable, 0);
      }
    }
    s(paramParcel, i);
  }
  
  public static int r(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeInt(paramInt | 0xFFFF0000);
    paramParcel.writeInt(0);
    return paramParcel.dataPosition();
  }
  
  public static void s(Parcel paramParcel, int paramInt)
  {
    int i = paramParcel.dataPosition();
    paramParcel.setDataPosition(paramInt - 4);
    paramParcel.writeInt(i - paramInt);
    paramParcel.setDataPosition(i);
  }
  
  public static void t(Parcel paramParcel, int paramInt1, int paramInt2)
  {
    paramParcel.writeInt(paramInt1 | paramInt2 << 16);
  }
  
  public static void u(Parcel paramParcel, Parcelable paramParcelable, int paramInt)
  {
    int i = paramParcel.dataPosition();
    paramParcel.writeInt(1);
    int j = paramParcel.dataPosition();
    paramParcelable.writeToParcel(paramParcel, paramInt);
    paramInt = paramParcel.dataPosition();
    paramParcel.setDataPosition(i);
    paramParcel.writeInt(paramInt - j);
    paramParcel.setDataPosition(paramInt);
  }
}

/* Location:
 * Qualified Name:     B2.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */