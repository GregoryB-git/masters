package com.google.android.gms.internal.fido;

import android.os.IBinder;
import android.os.Parcel;
import b7.l;
import b7.m;

public final class zzn
  extends zza
{
  public zzn(IBinder paramIBinder)
  {
    super(paramIBinder, "com.google.android.gms.fido.fido2.internal.privileged.IFido2PrivilegedService");
  }
  
  public final void zzc(zzg paramzzg, String paramString)
  {
    Parcel localParcel = zza();
    int i = zzc.zza;
    localParcel.writeStrongBinder(paramzzg);
    localParcel.writeString(paramString);
    zzb(4, localParcel);
  }
  
  public final void zzd(zzm paramzzm, l paraml)
  {
    Parcel localParcel = zza();
    int i = zzc.zza;
    localParcel.writeStrongBinder(paramzzm);
    zzc.zzd(localParcel, paraml);
    zzb(1, localParcel);
  }
  
  public final void zze(zzm paramzzm, m paramm)
  {
    Parcel localParcel = zza();
    int i = zzc.zza;
    localParcel.writeStrongBinder(paramzzm);
    zzc.zzd(localParcel, paramm);
    zzb(2, localParcel);
  }
  
  public final void zzf(zze paramzze)
  {
    Parcel localParcel = zza();
    int i = zzc.zza;
    localParcel.writeStrongBinder(paramzze);
    zzb(3, localParcel);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.fido.zzn
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */