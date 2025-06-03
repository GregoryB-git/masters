package com.google.android.gms.tasks;

final class zzc
  implements Runnable
{
  public zzc(zzd paramzzd, Task paramTask) {}
  
  public final void run()
  {
    if (zza.isCanceled())
    {
      zzd.zzb(zzb).zzc();
      return;
    }
    try
    {
      Object localObject = zzd.zza(zzb).then(zza);
      zzd.zzb(zzb).zzb(localObject);
      return;
    }
    catch (Exception localException)
    {
      zzd.zzb(zzb).zza(localException);
      return;
    }
    catch (RuntimeExecutionException localRuntimeExecutionException)
    {
      if ((localRuntimeExecutionException.getCause() instanceof Exception))
      {
        zzd.zzb(zzb).zza((Exception)localRuntimeExecutionException.getCause());
        return;
      }
      zzd.zzb(zzb).zza(localRuntimeExecutionException);
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.tasks.zzc
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */