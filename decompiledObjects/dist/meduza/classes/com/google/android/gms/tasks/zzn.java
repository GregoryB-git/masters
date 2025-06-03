package com.google.android.gms.tasks;

import java.util.concurrent.Executor;

final class zzn
  implements zzq
{
  private final Executor zza;
  private final Object zzb = new Object();
  private OnSuccessListener zzc;
  
  public zzn(Executor paramExecutor, OnSuccessListener paramOnSuccessListener)
  {
    zza = paramExecutor;
    zzc = paramOnSuccessListener;
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
    if (paramTask.isSuccessful()) {
      synchronized (zzb)
      {
        if (zzc == null) {
          return;
        }
        zza.execute(new zzm(this, paramTask));
        return;
      }
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.tasks.zzn
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */