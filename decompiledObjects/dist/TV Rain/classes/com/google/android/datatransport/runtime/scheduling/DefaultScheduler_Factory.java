package com.google.android.datatransport.runtime.scheduling;

import com.google.android.datatransport.runtime.backends.BackendRegistry;
import com.google.android.datatransport.runtime.dagger.internal.Factory;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkScheduler;
import com.google.android.datatransport.runtime.scheduling.persistence.EventStore;
import com.google.android.datatransport.runtime.synchronization.SynchronizationGuard;
import java.util.concurrent.Executor;
import javax.inject.Provider;

public final class DefaultScheduler_Factory
  implements Factory<DefaultScheduler>
{
  private final Provider<BackendRegistry> backendRegistryProvider;
  private final Provider<EventStore> eventStoreProvider;
  private final Provider<Executor> executorProvider;
  private final Provider<SynchronizationGuard> guardProvider;
  private final Provider<WorkScheduler> workSchedulerProvider;
  
  public DefaultScheduler_Factory(Provider<Executor> paramProvider, Provider<BackendRegistry> paramProvider1, Provider<WorkScheduler> paramProvider2, Provider<EventStore> paramProvider3, Provider<SynchronizationGuard> paramProvider4)
  {
    executorProvider = paramProvider;
    backendRegistryProvider = paramProvider1;
    workSchedulerProvider = paramProvider2;
    eventStoreProvider = paramProvider3;
    guardProvider = paramProvider4;
  }
  
  public static DefaultScheduler_Factory create(Provider<Executor> paramProvider, Provider<BackendRegistry> paramProvider1, Provider<WorkScheduler> paramProvider2, Provider<EventStore> paramProvider3, Provider<SynchronizationGuard> paramProvider4)
  {
    return new DefaultScheduler_Factory(paramProvider, paramProvider1, paramProvider2, paramProvider3, paramProvider4);
  }
  
  public static DefaultScheduler newInstance(Executor paramExecutor, BackendRegistry paramBackendRegistry, WorkScheduler paramWorkScheduler, EventStore paramEventStore, SynchronizationGuard paramSynchronizationGuard)
  {
    return new DefaultScheduler(paramExecutor, paramBackendRegistry, paramWorkScheduler, paramEventStore, paramSynchronizationGuard);
  }
  
  public DefaultScheduler get()
  {
    return newInstance((Executor)executorProvider.get(), (BackendRegistry)backendRegistryProvider.get(), (WorkScheduler)workSchedulerProvider.get(), (EventStore)eventStoreProvider.get(), (SynchronizationGuard)guardProvider.get());
  }
}

/* Location:
 * Qualified Name:     com.google.android.datatransport.runtime.scheduling.DefaultScheduler_Factory
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */