package com.google.android.gms.internal.fido;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.fido.u2f.api.common.RegisterRequestParams;
import com.google.android.gms.fido.u2f.api.common.SignRequestParams;

public final class zzw
  extends zza
{
  public zzw(IBinder paramIBinder)
  {
    super(paramIBinder, "com.google.android.gms.fido.u2f.internal.regular.IU2fAppService");
  }
  
  public final void zzc(zzv paramzzv, RegisterRequestParams paramRegisterRequestParams)
  {
    Parcel localParcel = zza();
    int i = zzc.zza;
    localParcel.writeStrongBinder(paramzzv);
    zzc.zzd(localParcel, paramRegisterRequestParams);
    zzb(1, localParcel);
  }
  
  public final void zzd(zzv paramzzv, SignRequestParams paramSignRequestParams)
  {
    Parcel localParcel = zza();
    int i = zzc.zza;
    localParcel.writeStrongBinder(paramzzv);
    zzc.zzd(localParcel, paramSignRequestParams);
    zzb(2, localParcel);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.fido.zzw
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */