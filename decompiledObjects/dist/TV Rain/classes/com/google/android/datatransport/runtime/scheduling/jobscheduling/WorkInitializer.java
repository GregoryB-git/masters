package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import com.google.android.datatransport.runtime.scheduling.persistence.EventStore;
import com.google.android.datatransport.runtime.synchronization.SynchronizationGuard;
import h0;
import java.util.concurrent.Executor;
import javax.inject.Inject;

public class WorkInitializer
{
  private final Executor executor;
  private final SynchronizationGuard guard;
  private final WorkScheduler scheduler;
  private final EventStore store;
  
  @Inject
  public WorkInitializer(Executor paramExecutor, EventStore paramEventStore, WorkScheduler paramWorkScheduler, SynchronizationGuard paramSynchronizationGuard)
  {
    executor = paramExecutor;
    store = paramEventStore;
    scheduler = paramWorkScheduler;
    guard = paramSynchronizationGuard;
  }
  
  public void ensureContextsScheduled()
  {
    executor.execute(new h0(this, 3));
  }
}

/* Location:
 * Qualified Name:     com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkInitializer
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */