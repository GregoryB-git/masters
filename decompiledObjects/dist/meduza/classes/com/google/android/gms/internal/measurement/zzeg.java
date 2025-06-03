package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.DynamiteModule;
import e7.f2;
import m6.j;

final class zzeg
  extends zzed.zzb
{
  public zzeg(zzed paramzzed, String paramString1, String paramString2, Context paramContext, Bundle paramBundle)
  {
    super(paramzzed);
  }
  
  public final void zza()
  {
    try
    {
      Object localObject1;
      Object localObject2;
      if (zzed.zza(zzg, zzc, zzd))
      {
        localObject1 = zzd;
        localObject2 = zzc;
        localObject3 = zzed.zzb(zzg);
      }
      else
      {
        localObject4 = null;
        localObject3 = localObject4;
        localObject1 = localObject3;
        localObject2 = localObject3;
        localObject3 = localObject4;
      }
      j.i(zze);
      Object localObject4 = zzg;
      zzed.zza((zzed)localObject4, ((zzed)localObject4).zza(zze, true));
      if (zzed.zza(zzg) == null)
      {
        Log.w(zzed.zzb(zzg), "Failed to connect to measurement client.");
        return;
      }
      int i = DynamiteModule.a(zze, "com.google.android.gms.measurement.dynamite");
      int j = DynamiteModule.d(zze, "com.google.android.gms.measurement.dynamite", false);
      int k = Math.max(i, j);
      boolean bool;
      if (j < i) {
        bool = true;
      } else {
        bool = false;
      }
      localObject4 = new com/google/android/gms/internal/measurement/zzdz;
      ((zzdz)localObject4).<init>(114010L, k, bool, (String)localObject3, (String)localObject2, (String)localObject1, zzf, f2.a(zze));
      Object localObject3 = zzed.zza(zzg);
      j.i(localObject3);
      ((zzdl)localObject3).initialize(ObjectWrapper.wrap(zze), (zzdz)localObject4, zza);
      return;
    }
    catch (Exception localException)
    {
      zzed.zza(zzg, localException, true, false);
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.zzeg
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */