package com.google.android.gms.internal.measurement;

import a0.j;
import android.os.BadParcelableException;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.HashMap;

public class zzbw
{
  private static final ClassLoader zza = zzbw.class.getClassLoader();
  
  public static <T extends Parcelable> T zza(Parcel paramParcel, Parcelable.Creator<T> paramCreator)
  {
    if (paramParcel.readInt() == 0) {
      return null;
    }
    return (Parcelable)paramCreator.createFromParcel(paramParcel);
  }
  
  public static HashMap zza(Parcel paramParcel)
  {
    return paramParcel.readHashMap(zza);
  }
  
  public static void zza(Parcel paramParcel, IInterface paramIInterface)
  {
    if (paramIInterface == null) {}
    for (paramIInterface = null;; paramIInterface = paramIInterface.asBinder())
    {
      paramParcel.writeStrongBinder(paramIInterface);
      return;
    }
  }
  
  public static void zza(Parcel paramParcel, Parcelable paramParcelable)
  {
    if (paramParcelable == null)
    {
      paramParcel.writeInt(0);
      return;
    }
    paramParcel.writeInt(1);
    paramParcelable.writeToParcel(paramParcel, 0);
  }
  
  public static void zza(Parcel paramParcel, boolean paramBoolean)
  {
    paramParcel.writeInt(paramBoolean);
  }
  
  public static void zzb(Parcel paramParcel)
  {
    int i = paramParcel.dataAvail();
    if (i <= 0) {
      return;
    }
    throw new BadParcelableException(j.g("Parcel data not fully consumed, unread size: ", i));
  }
  
  public static void zzb(Parcel paramParcel, Parcelable paramParcelable)
  {
    if (paramParcelable == null)
    {
      paramParcel.writeInt(0);
      return;
    }
    paramParcel.writeInt(1);
    paramParcelable.writeToParcel(paramParcel, 1);
  }
  
  public static boolean zzc(Parcel paramParcel)
  {
    return paramParcel.readInt() != 0;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.zzbw
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */