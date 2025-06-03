package com.google.android.gms.tasks;

import m6.j;

final class zzk
  implements Runnable
{
  public zzk(zzl paramzzl, Task paramTask) {}
  
  public final void run()
  {
    synchronized (zzl.zzb(zzb))
    {
      Object localObject2 = zzb;
      if (zzl.zza((zzl)localObject2) != null)
      {
        localObject2 = zzl.zza((zzl)localObject2);
        Exception localException = zza.getException();
        j.i(localException);
        ((OnFailureListener)localObject2).onFailure(localException);
      }
      return;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.tasks.zzk
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */