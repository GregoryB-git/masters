package com.google.android.gms.tasks;

import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

final class zzo
  implements Runnable
{
  public zzo(zzp paramzzp, Task paramTask) {}
  
  public final void run()
  {
    try
    {
      Task localTask = zzp.zza(zzb).then(zza.getResult());
      if (localTask == null)
      {
        zzb.onFailure(new NullPointerException("Continuation returned null"));
        return;
      }
      zzp localzzp = zzb;
      Executor localExecutor = TaskExecutors.zza;
      localTask.addOnSuccessListener(localExecutor, localzzp);
      localTask.addOnFailureListener(localExecutor, zzb);
      localTask.addOnCanceledListener(localExecutor, zzb);
      return;
    }
    catch (Exception localException)
    {
      zzb.onFailure(localException);
      return;
    }
    catch (CancellationException localCancellationException)
    {
      zzb.onCanceled();
      return;
    }
    catch (RuntimeExecutionException localRuntimeExecutionException)
    {
      if ((localRuntimeExecutionException.getCause() instanceof Exception))
      {
        zzb.onFailure((Exception)localRuntimeExecutionException.getCause());
        return;
      }
      zzb.onFailure(localRuntimeExecutionException);
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.tasks.zzo
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */