package com.google.android.gms.internal.auth_api_phone;

import android.os.BadParcelableException;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import f;

public final class zzc
{
  private static final ClassLoader zza = com.google.android.gms.internal.auth-api-phone.zzc.class.getClassLoader();
  
  public static Parcelable zza(Parcel paramParcel, Parcelable.Creator paramCreator)
  {
    if (paramParcel.readInt() == 0) {
      return null;
    }
    return (Parcelable)paramCreator.createFromParcel(paramParcel);
  }
  
  public static void zzb(Parcel paramParcel)
  {
    int i = paramParcel.dataAvail();
    if (i <= 0) {
      return;
    }
    throw new BadParcelableException(f.h("Parcel data not fully consumed, unread size: ", i));
  }
  
  public static void zzc(Parcel paramParcel, IInterface paramIInterface)
  {
    paramParcel.writeStrongBinder(paramIInterface.asBinder());
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.auth_api_phone.zzc
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */