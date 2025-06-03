package com.google.android.gms.internal.measurement;

import android.os.SystemClock;
import b.z;

abstract class zzed$zzb
  implements Runnable
{
  public final long zza;
  public final long zzb;
  private final boolean zzc;
  
  public zzed$zzb(zzed paramzzed)
  {
    this(paramzzed, true);
  }
  
  public zzed$zzb(zzed paramzzed, boolean paramBoolean)
  {
    ((z)zza).getClass();
    zza = System.currentTimeMillis();
    ((z)zza).getClass();
    zzb = SystemClock.elapsedRealtime();
    zzc = paramBoolean;
  }
  
  public void run()
  {
    if (zzed.zzc(zzd))
    {
      zzb();
      return;
    }
    try
    {
      zza();
      return;
    }
    catch (Exception localException)
    {
      zzed.zza(zzd, localException, false, zzc);
      zzb();
    }
  }
  
  public abstract void zza();
  
  public void zzb() {}
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.zzed.zzb
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */