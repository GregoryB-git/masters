package com.google.android.gms.tasks;

import java.util.concurrent.Executor;

final class zzj
  implements zzq
{
  private final Executor zza;
  private final Object zzb = new Object();
  private OnCompleteListener zzc;
  
  public zzj(Executor paramExecutor, OnCompleteListener paramOnCompleteListener)
  {
    zza = paramExecutor;
    zzc = paramOnCompleteListener;
  }
  
  public final void zzc()
  {
    synchronized (zzb)
    {
      zzc = null;
      return;
    }
  }
  
  public final void zzd(Task paramTask)
  {
    synchronized (zzb)
    {
      if (zzc == null) {
        return;
      }
      zza.execute(new zzi(this, paramTask));
      return;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.tasks.zzj
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */