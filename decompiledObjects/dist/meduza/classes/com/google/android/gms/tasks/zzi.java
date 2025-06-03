package com.google.android.gms.tasks;

final class zzi
  implements Runnable
{
  public zzi(zzj paramzzj, Task paramTask) {}
  
  public final void run()
  {
    synchronized (zzj.zzb(zzb))
    {
      zzj localzzj = zzb;
      if (zzj.zza(localzzj) != null) {
        zzj.zza(localzzj).onComplete(zza);
      }
      return;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.tasks.zzi
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */