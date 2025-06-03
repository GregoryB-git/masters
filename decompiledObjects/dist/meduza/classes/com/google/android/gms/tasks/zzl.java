package com.google.android.gms.tasks;

import java.util.concurrent.Executor;

final class zzl
  implements zzq
{
  private final Executor zza;
  private final Object zzb = new Object();
  private OnFailureListener zzc;
  
  public zzl(Executor paramExecutor, OnFailureListener paramOnFailureListener)
  {
    zza = paramExecutor;
    zzc = paramOnFailureListener;
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
    if ((!paramTask.isSuccessful()) && (!paramTask.isCanceled())) {
      synchronized (zzb)
      {
        if (zzc == null) {
          return;
        }
        zza.execute(new zzk(this, paramTask));
        return;
      }
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.tasks.zzl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */