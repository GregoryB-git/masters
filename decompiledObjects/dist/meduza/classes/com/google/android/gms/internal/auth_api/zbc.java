package com.google.android.gms.internal.auth_api;

import android.os.BadParcelableException;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import f;

public final class zbc
{
  private static final ClassLoader zba = com.google.android.gms.internal.auth-api.zbc.class.getClassLoader();
  
  public static Parcelable zba(Parcel paramParcel, Parcelable.Creator paramCreator)
  {
    if (paramParcel.readInt() == 0) {
      return null;
    }
    return (Parcelable)paramCreator.createFromParcel(paramParcel);
  }
  
  public static void zbb(Parcel paramParcel)
  {
    int i = paramParcel.dataAvail();
    if (i <= 0) {
      return;
    }
    throw new BadParcelableException(f.h("Parcel data not fully consumed, unread size: ", i));
  }
  
  public static void zbc(Parcel paramParcel, Parcelable paramParcelable)
  {
    if (paramParcelable == null)
    {
      paramParcel.writeInt(0);
      return;
    }
    paramParcel.writeInt(1);
    paramParcelable.writeToParcel(paramParcel, 0);
  }
  
  public static void zbd(Parcel paramParcel, IInterface paramIInterface)
  {
    paramParcel.writeStrongBinder(paramIInterface.asBinder());
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.auth_api.zbc
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */