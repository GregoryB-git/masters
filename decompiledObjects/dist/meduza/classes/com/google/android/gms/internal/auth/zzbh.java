package com.google.android.gms.internal.auth;

import android.os.IBinder;
import android.os.Parcel;
import f6.a;

public final class zzbh
  extends zza
{
  public zzbh(IBinder paramIBinder)
  {
    super(paramIBinder, "com.google.android.gms.auth.api.internal.IAuthService");
  }
  
  public final void zzd(zzbg paramzzbg)
  {
    Parcel localParcel = zza();
    zzc.zzd(localParcel, paramzzbg);
    zzc(3, localParcel);
  }
  
  public final void zze(zzbg paramzzbg, a parama)
  {
    Parcel localParcel = zza();
    zzc.zzd(localParcel, paramzzbg);
    zzc.zzc(localParcel, parama);
    zzc(1, localParcel);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.auth.zzbh
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */