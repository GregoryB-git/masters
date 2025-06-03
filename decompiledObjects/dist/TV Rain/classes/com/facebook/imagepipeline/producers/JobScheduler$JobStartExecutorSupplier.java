package com.facebook.imagepipeline.producers;

import com.facebook.common.internal.VisibleForTesting;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

@VisibleForTesting
class JobScheduler$JobStartExecutorSupplier
{
  private static ScheduledExecutorService sJobStarterExecutor;
  
  public static ScheduledExecutorService get()
  {
    if (sJobStarterExecutor == null) {
      sJobStarterExecutor = Executors.newSingleThreadScheduledExecutor();
    }
    return sJobStarterExecutor;
  }
}

/* Location:
 * Qualified Name:     com.facebook.imagepipeline.producers.JobScheduler.JobStartExecutorSupplier
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */