package com.google.android.gms.tasks;

import java.util.concurrent.Executor;

final class zzh
  implements zzq
{
  private final Executor zza;
  private final Object zzb = new Object();
  private OnCanceledListener zzc;
  
  public zzh(Executor paramExecutor, OnCanceledListener paramOnCanceledListener)
  {
    zza = paramExecutor;
    zzc = paramOnCanceledListener;
  }
  
  public final void zzc()
  {
    synchronized (zzb)
    {
      zzc = null;
      return;
    }
  }
  
  public final void zzd(Task arg1)
  {
    if (???.isCanceled()) {
      synchronized (zzb)
      {
        if (zzc == null) {
          return;
        }
        zza.execute(new zzg(this));
        return;
      }
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.tasks.zzh
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */