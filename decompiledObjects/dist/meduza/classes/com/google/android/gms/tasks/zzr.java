package com.google.android.gms.tasks;

import java.util.ArrayDeque;
import java.util.Queue;

final class zzr
{
  private final Object zza = new Object();
  private Queue zzb;
  private boolean zzc;
  
  public final void zza(zzq paramzzq)
  {
    synchronized (zza)
    {
      if (zzb == null)
      {
        ArrayDeque localArrayDeque = new java/util/ArrayDeque;
        localArrayDeque.<init>();
        zzb = localArrayDeque;
      }
      zzb.add(paramzzq);
      return;
    }
  }
  
  public final void zzb(Task paramTask)
  {
    synchronized (zza)
    {
      if ((zzb != null) && (!zzc))
      {
        zzc = true;
        synchronized (zza)
        {
          zzq localzzq = (zzq)zzb.poll();
          if (localzzq == null)
          {
            zzc = false;
            return;
          }
          localzzq.zzd(paramTask);
        }
      }
      return;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.tasks.zzr
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */