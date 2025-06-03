package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import m6.j;

final class zzfn
  extends zzed.zzb
{
  public zzfn(zzed paramzzed, Long paramLong, String paramString1, String paramString2, Bundle paramBundle, boolean paramBoolean1, boolean paramBoolean2)
  {
    super(paramzzed);
  }
  
  public final void zza()
  {
    Object localObject = zzc;
    long l;
    if (localObject == null) {
      l = zza;
    } else {
      l = ((Long)localObject).longValue();
    }
    localObject = zzed.zza(zzi);
    j.i(localObject);
    ((zzdl)localObject).logEvent(zzd, zze, zzf, zzg, zzh, l);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.zzfn
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */