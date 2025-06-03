package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.os.BaseBundle;
import android.os.Bundle;
import m6.j;

final class zzfq
  extends zzed.zzb
{
  public zzfq(zzed.zzc paramzzc, Bundle paramBundle, Activity paramActivity)
  {
    super(zza);
  }
  
  public final void zza()
  {
    Object localObject2;
    if (zzc != null)
    {
      localObject1 = new Bundle();
      localObject2 = localObject1;
      if (zzc.containsKey("com.google.app_measurement.screen_service"))
      {
        Object localObject3 = zzc.get("com.google.app_measurement.screen_service");
        localObject2 = localObject1;
        if ((localObject3 instanceof Bundle))
        {
          ((Bundle)localObject1).putBundle("com.google.app_measurement.screen_service", (Bundle)localObject3);
          localObject2 = localObject1;
        }
      }
    }
    else
    {
      localObject2 = null;
    }
    Object localObject1 = zzed.zza(zze.zza);
    j.i(localObject1);
    ((zzdl)localObject1).onActivityCreatedByScionActivityInfo(zzeb.zza(zzd), (Bundle)localObject2, zzb);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.zzfq
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */