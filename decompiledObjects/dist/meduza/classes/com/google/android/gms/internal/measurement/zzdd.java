package com.google.android.gms.internal.measurement;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

final class zzdd
  implements zzdb
{
  public final ExecutorService zza(ThreadFactory paramThreadFactory, int paramInt)
  {
    paramThreadFactory = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), paramThreadFactory);
    paramThreadFactory.allowCoreThreadTimeOut(true);
    return Executors.unconfigurableExecutorService(paramThreadFactory);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.zzdd
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */