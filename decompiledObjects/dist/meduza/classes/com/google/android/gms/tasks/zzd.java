package com.google.android.gms.tasks;

import java.util.concurrent.Executor;

final class zzd
  implements zzq
{
  private final Executor zza;
  private final Continuation zzb;
  private final zzw zzc;
  
  public zzd(Executor paramExecutor, Continuation paramContinuation, zzw paramzzw)
  {
    zza = paramExecutor;
    zzb = paramContinuation;
    zzc = paramzzw;
  }
  
  public final void zzc()
  {
    throw new UnsupportedOperationException();
  }
  
  public final void zzd(Task paramTask)
  {
    paramTask = new zzc(this, paramTask);
    zza.execute(paramTask);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.tasks.zzd
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */