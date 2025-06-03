package com.google.android.gms.internal.ads_identifier;

import android.os.IBinder;
import android.os.Parcel;

public final class zzd
  extends zza
  implements zzf
{
  public zzd(IBinder paramIBinder)
  {
    super(paramIBinder, "com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
  }
  
  public final String zzc()
  {
    Parcel localParcel = zzb(1, zza());
    String str = localParcel.readString();
    localParcel.recycle();
    return str;
  }
  
  public final boolean zzd()
  {
    Parcel localParcel = zzb(6, zza());
    boolean bool = zzc.zzb(localParcel);
    localParcel.recycle();
    return bool;
  }
  
  public final boolean zze(boolean paramBoolean)
  {
    Parcel localParcel = zza();
    zzc.zza(localParcel, true);
    localParcel = zzb(2, localParcel);
    paramBoolean = zzc.zzb(localParcel);
    localParcel.recycle();
    return paramBoolean;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.ads_identifier.zzd
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */