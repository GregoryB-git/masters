package com.google.android.gms.tasks;

import java.util.concurrent.Executor;

final class zze
  implements Runnable
{
  public zze(zzf paramzzf, Task paramTask) {}
  
  public final void run()
  {
    try
    {
      Task localTask = (Task)zzf.zza(zzb).then(zza);
      if (localTask == null)
      {
        zzb.onFailure(new NullPointerException("Continuation returned null"));
        return;
      }
      zzf localzzf = zzb;
      Executor localExecutor = TaskExecutors.zza;
      localTask.addOnSuccessListener(localExecutor, localzzf);
      localTask.addOnFailureListener(localExecutor, zzb);
      localTask.addOnCanceledListener(localExecutor, zzb);
      return;
    }
    catch (Exception localException)
    {
      zzf.zzb(zzb).zza(localException);
      return;
    }
    catch (RuntimeExecutionException localRuntimeExecutionException)
    {
      if ((localRuntimeExecutionException.getCause() instanceof Exception))
      {
        zzf.zzb(zzb).zza((Exception)localRuntimeExecutionException.getCause());
        return;
      }
      zzf.zzb(zzb).zza(localRuntimeExecutionException);
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.tasks.zze
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */