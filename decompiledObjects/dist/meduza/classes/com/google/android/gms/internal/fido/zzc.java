package com.google.android.gms.internal.fido;

import android.os.BadParcelableException;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import f;
import java.util.ArrayList;

public final class zzc
{
  private static final ClassLoader zzb = zzc.class.getClassLoader();
  
  public static Parcelable zza(Parcel paramParcel, Parcelable.Creator paramCreator)
  {
    if (paramParcel.readInt() == 0) {
      return null;
    }
    return (Parcelable)paramCreator.createFromParcel(paramParcel);
  }
  
  public static ArrayList zzb(Parcel paramParcel)
  {
    return paramParcel.readArrayList(zzb);
  }
  
  public static void zzc(Parcel paramParcel)
  {
    int i = paramParcel.dataAvail();
    if (i <= 0) {
      return;
    }
    throw new BadParcelableException(f.h("Parcel data not fully consumed, unread size: ", i));
  }
  
  public static void zzd(Parcel paramParcel, Parcelable paramParcelable)
  {
    if (paramParcelable == null)
    {
      paramParcel.writeInt(0);
      return;
    }
    paramParcel.writeInt(1);
    paramParcelable.writeToParcel(paramParcel, 0);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.fido.zzc
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */