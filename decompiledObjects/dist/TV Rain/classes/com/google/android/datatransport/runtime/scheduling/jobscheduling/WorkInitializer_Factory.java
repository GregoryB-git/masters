package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import com.google.android.datatransport.runtime.dagger.internal.Factory;
import com.google.android.datatransport.runtime.scheduling.persistence.EventStore;
import com.google.android.datatransport.runtime.synchronization.SynchronizationGuard;
import java.util.concurrent.Executor;
import javax.inject.Provider;

public final class WorkInitializer_Factory
  implements Factory<WorkInitializer>
{
  private final Provider<Executor> executorProvider;
  private final Provider<SynchronizationGuard> guardProvider;
  private final Provider<WorkScheduler> schedulerProvider;
  private final Provider<EventStore> storeProvider;
  
  public WorkInitializer_Factory(Provider<Executor> paramProvider, Provider<EventStore> paramProvider1, Provider<WorkScheduler> paramProvider2, Provider<SynchronizationGuard> paramProvider3)
  {
    executorProvider = paramProvider;
    storeProvider = paramProvider1;
    schedulerProvider = paramProvider2;
    guardProvider = paramProvider3;
  }
  
  public static WorkInitializer_Factory create(Provider<Executor> paramProvider, Provider<EventStore> paramProvider1, Provider<WorkScheduler> paramProvider2, Provider<SynchronizationGuard> paramProvider3)
  {
    return new WorkInitializer_Factory(paramProvider, paramProvider1, paramProvider2, paramProvider3);
  }
  
  public static WorkInitializer newInstance(Executor paramExecutor, EventStore paramEventStore, WorkScheduler paramWorkScheduler, SynchronizationGuard paramSynchronizationGuard)
  {
    return new WorkInitializer(paramExecutor, paramEventStore, paramWorkScheduler, paramSynchronizationGuard);
  }
  
  public WorkInitializer get()
  {
    return newInstance((Executor)executorProvider.get(), (EventStore)storeProvider.get(), (WorkScheduler)schedulerProvider.get(), (SynchronizationGuard)guardProvider.get());
  }
}

/* Location:
 * Qualified Name:     com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkInitializer_Factory
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */