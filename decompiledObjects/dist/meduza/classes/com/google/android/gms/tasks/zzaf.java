package com.google.android.gms.tasks;

import java.util.concurrent.ExecutionException;

final class zzaf<T>
  implements zzae<T>
{
  private final Object zza = new Object();
  private final int zzb;
  private final zzw zzc;
  private int zzd;
  private int zze;
  private int zzf;
  private Exception zzg;
  private boolean zzh;
  
  public zzaf(int paramInt, zzw paramzzw)
  {
    zzb = paramInt;
    zzc = paramzzw;
  }
  
  private final void zza()
  {
    if (zzd + zze + zzf == zzb)
    {
      if (zzg != null)
      {
        zzw localzzw = zzc;
        int i = zze;
        int j = zzb;
        StringBuilder localStringBuilder = new StringBuilder();
        localStringBuilder.append(i);
        localStringBuilder.append(" out of ");
        localStringBuilder.append(j);
        localStringBuilder.append(" underlying tasks failed");
        localzzw.zza(new ExecutionException(localStringBuilder.toString(), zzg));
        return;
      }
      if (zzh)
      {
        zzc.zzc();
        return;
      }
      zzc.zzb(null);
    }
  }
  
  public final void onCanceled()
  {
    synchronized (zza)
    {
      zzf += 1;
      zzh = true;
      zza();
      return;
    }
  }
  
  public final void onFailure(Exception paramException)
  {
    synchronized (zza)
    {
      zze += 1;
      zzg = paramException;
      zza();
      return;
    }
  }
  
  public final void onSuccess(T arg1)
  {
    synchronized (zza)
    {
      zzd += 1;
      zza();
      return;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.tasks.zzaf
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */