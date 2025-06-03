package com.google.android.gms.internal.measurement;

import android.os.BadParcelableException;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.HashMap;

public abstract class a0
{
  public static final ClassLoader a = a0.class.getClassLoader();
  
  public static Parcelable a(Parcel paramParcel, Parcelable.Creator paramCreator)
  {
    if (paramParcel.readInt() == 0) {
      return null;
    }
    return (Parcelable)paramCreator.createFromParcel(paramParcel);
  }
  
  public static HashMap b(Parcel paramParcel)
  {
    return paramParcel.readHashMap(a);
  }
  
  public static void c(Parcel paramParcel, IInterface paramIInterface)
  {
    if (paramIInterface == null) {}
    for (paramIInterface = null;; paramIInterface = paramIInterface.asBinder())
    {
      paramParcel.writeStrongBinder(paramIInterface);
      return;
    }
  }
  
  public static void d(Parcel paramParcel, Parcelable paramParcelable)
  {
    if (paramParcelable == null)
    {
      paramParcel.writeInt(0);
      return;
    }
    paramParcel.writeInt(1);
    paramParcelable.writeToParcel(paramParcel, 0);
  }
  
  public static void e(Parcel paramParcel, boolean paramBoolean)
  {
    paramParcel.writeInt(paramBoolean);
  }
  
  public static void f(Parcel paramParcel)
  {
    int i = paramParcel.dataAvail();
    if (i <= 0) {
      return;
    }
    paramParcel = new StringBuilder("Parcel data not fully consumed, unread size: ");
    paramParcel.append(i);
    throw new BadParcelableException(paramParcel.toString());
  }
  
  public static void g(Parcel paramParcel, Parcelable paramParcelable)
  {
    if (paramParcelable == null)
    {
      paramParcel.writeInt(0);
      return;
    }
    paramParcel.writeInt(1);
    paramParcelable.writeToParcel(paramParcel, 1);
  }
  
  public static boolean h(Parcel paramParcel)
  {
    return paramParcel.readInt() != 0;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.a0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */