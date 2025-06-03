package com.google.android.gms.internal.fido;

import android.os.IBinder;
import android.os.Parcel;
import b7.u;
import b7.x;

public final class zzs
  extends zza
{
  public zzs(IBinder paramIBinder)
  {
    super(paramIBinder, "com.google.android.gms.fido.fido2.internal.regular.IFido2AppService");
  }
  
  public final void zzc(zzr paramzzr, u paramu)
  {
    Parcel localParcel = zza();
    int i = zzc.zza;
    localParcel.writeStrongBinder(paramzzr);
    zzc.zzd(localParcel, paramu);
    zzb(1, localParcel);
  }
  
  public final void zzd(zzr paramzzr, x paramx)
  {
    Parcel localParcel = zza();
    int i = zzc.zza;
    localParcel.writeStrongBinder(paramzzr);
    zzc.zzd(localParcel, paramx);
    zzb(2, localParcel);
  }
  
  public final void zze(zze paramzze)
  {
    Parcel localParcel = zza();
    int i = zzc.zza;
    localParcel.writeStrongBinder(paramzze);
    zzb(3, localParcel);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.fido.zzs
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */