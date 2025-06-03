package com.google.android.gms.internal.base;

import android.os.BadParcelableException;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import f;

public final class zac
{
  private static final ClassLoader zaa = zac.class.getClassLoader();
  
  public static Parcelable zaa(Parcel paramParcel, Parcelable.Creator paramCreator)
  {
    if (paramParcel.readInt() == 0) {
      return null;
    }
    return (Parcelable)paramCreator.createFromParcel(paramParcel);
  }
  
  public static void zab(Parcel paramParcel)
  {
    int i = paramParcel.dataAvail();
    if (i <= 0) {
      return;
    }
    throw new BadParcelableException(f.h("Parcel data not fully consumed, unread size: ", i));
  }
  
  public static void zac(Parcel paramParcel, Parcelable paramParcelable)
  {
    if (paramParcelable == null)
    {
      paramParcel.writeInt(0);
      return;
    }
    paramParcel.writeInt(1);
    paramParcelable.writeToParcel(paramParcel, 0);
  }
  
  public static void zad(Parcel paramParcel, IInterface paramIInterface)
  {
    if (paramIInterface == null) {}
    for (paramIInterface = null;; paramIInterface = paramIInterface.asBinder())
    {
      paramParcel.writeStrongBinder(paramIInterface);
      return;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.base.zac
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */