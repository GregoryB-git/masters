package com.google.android.gms.tasks;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

final class zzad<T>
  implements zzae<T>
{
  private final CountDownLatch zza = new CountDownLatch(1);
  
  public final void onCanceled()
  {
    zza.countDown();
  }
  
  public final void onFailure(Exception paramException)
  {
    zza.countDown();
  }
  
  public final void onSuccess(T paramT)
  {
    zza.countDown();
  }
  
  public final void zza()
  {
    zza.await();
  }
  
  public final boolean zzb(long paramLong, TimeUnit paramTimeUnit)
  {
    return zza.await(paramLong, paramTimeUnit);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.tasks.zzad
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */