package com.google.android.gms.internal.measurement;

import m6.j;

final class zzel
  extends zzed.zzb
{
  public zzel(zzed paramzzed, Boolean paramBoolean)
  {
    super(paramzzed);
  }
  
  public final void zza()
  {
    if (zzc != null)
    {
      localzzdl = zzed.zza(zzd);
      j.i(localzzdl);
      localzzdl.setMeasurementEnabled(zzc.booleanValue(), zza);
      return;
    }
    zzdl localzzdl = zzed.zza(zzd);
    j.i(localzzdl);
    localzzdl.clearMeasurementEnabled(zza);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.zzel
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */