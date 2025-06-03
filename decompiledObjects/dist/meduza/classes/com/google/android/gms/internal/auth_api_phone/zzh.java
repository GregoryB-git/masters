package com.google.android.gms.internal.auth_api_phone;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.api.internal.IStatusCallback;
import com.google.android.gms.internal.auth-api-phone.zze;
import com.google.android.gms.internal.auth-api-phone.zzg;
import com.google.android.gms.internal.auth-api-phone.zzj;

public final class zzh
  extends zza
{
  public zzh(IBinder paramIBinder)
  {
    super(paramIBinder, "com.google.android.gms.auth.api.phone.internal.ISmsRetrieverApiService");
  }
  
  public final void zzc(zze paramzze)
  {
    Parcel localParcel = zza();
    zzc.zzc(localParcel, paramzze);
    zzb(4, localParcel);
  }
  
  public final void zzd(String paramString, zzg paramzzg)
  {
    Parcel localParcel = zza();
    localParcel.writeString(paramString);
    zzc.zzc(localParcel, paramzzg);
    zzb(5, localParcel);
  }
  
  public final void zze(IStatusCallback paramIStatusCallback)
  {
    Parcel localParcel = zza();
    zzc.zzc(localParcel, paramIStatusCallback);
    zzb(3, localParcel);
  }
  
  public final void zzf(IStatusCallback paramIStatusCallback)
  {
    Parcel localParcel = zza();
    zzc.zzc(localParcel, paramIStatusCallback);
    zzb(6, localParcel);
  }
  
  public final void zzg(zzj paramzzj)
  {
    Parcel localParcel = zza();
    zzc.zzc(localParcel, paramzzj);
    zzb(1, localParcel);
  }
  
  public final void zzh(String paramString, zzj paramzzj)
  {
    Parcel localParcel = zza();
    localParcel.writeString(paramString);
    zzc.zzc(localParcel, paramzzj);
    zzb(2, localParcel);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.auth_api_phone.zzh
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */