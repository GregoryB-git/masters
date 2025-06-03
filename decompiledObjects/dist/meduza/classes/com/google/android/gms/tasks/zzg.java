package com.google.android.gms.tasks;

final class zzg
  implements Runnable
{
  public zzg(zzh paramzzh) {}
  
  public final void run()
  {
    synchronized (zzh.zzb(zza))
    {
      zzh localzzh = zza;
      if (zzh.zza(localzzh) != null) {
        zzh.zza(localzzh).onCanceled();
      }
      return;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.tasks.zzg
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */