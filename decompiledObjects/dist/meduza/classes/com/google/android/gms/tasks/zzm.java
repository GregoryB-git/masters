package com.google.android.gms.tasks;

final class zzm
  implements Runnable
{
  public zzm(zzn paramzzn, Task paramTask) {}
  
  public final void run()
  {
    synchronized (zzn.zzb(zzb))
    {
      zzn localzzn = zzb;
      if (zzn.zza(localzzn) != null) {
        zzn.zza(localzzn).onSuccess(zza.getResult());
      }
      return;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.tasks.zzm
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */