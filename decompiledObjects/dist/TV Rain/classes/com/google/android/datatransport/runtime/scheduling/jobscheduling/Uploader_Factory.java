package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.content.Context;
import com.google.android.datatransport.runtime.backends.BackendRegistry;
import com.google.android.datatransport.runtime.dagger.internal.Factory;
import com.google.android.datatransport.runtime.scheduling.persistence.ClientHealthMetricsStore;
import com.google.android.datatransport.runtime.scheduling.persistence.EventStore;
import com.google.android.datatransport.runtime.synchronization.SynchronizationGuard;
import com.google.android.datatransport.runtime.time.Clock;
import java.util.concurrent.Executor;
import javax.inject.Provider;

public final class Uploader_Factory
  implements Factory<Uploader>
{
  private final Provider<BackendRegistry> backendRegistryProvider;
  private final Provider<ClientHealthMetricsStore> clientHealthMetricsStoreProvider;
  private final Provider<Clock> clockProvider;
  private final Provider<Context> contextProvider;
  private final Provider<EventStore> eventStoreProvider;
  private final Provider<Executor> executorProvider;
  private final Provider<SynchronizationGuard> guardProvider;
  private final Provider<Clock> uptimeClockProvider;
  private final Provider<WorkScheduler> workSchedulerProvider;
  
  public Uploader_Factory(Provider<Context> paramProvider, Provider<BackendRegistry> paramProvider1, Provider<EventStore> paramProvider2, Provider<WorkScheduler> paramProvider3, Provider<Executor> paramProvider4, Provider<SynchronizationGuard> paramProvider5, Provider<Clock> paramProvider6, Provider<Clock> paramProvider7, Provider<ClientHealthMetricsStore> paramProvider8)
  {
    contextProvider = paramProvider;
    backendRegistryProvider = paramProvider1;
    eventStoreProvider = paramProvider2;
    workSchedulerProvider = paramProvider3;
    executorProvider = paramProvider4;
    guardProvider = paramProvider5;
    clockProvider = paramProvider6;
    uptimeClockProvider = paramProvider7;
    clientHealthMetricsStoreProvider = paramProvider8;
  }
  
  public static Uploader_Factory create(Provider<Context> paramProvider, Provider<BackendRegistry> paramProvider1, Provider<EventStore> paramProvider2, Provider<WorkScheduler> paramProvider3, Provider<Executor> paramProvider4, Provider<SynchronizationGuard> paramProvider5, Provider<Clock> paramProvider6, Provider<Clock> paramProvider7, Provider<ClientHealthMetricsStore> paramProvider8)
  {
    return new Uploader_Factory(paramProvider, paramProvider1, paramProvider2, paramProvider3, paramProvider4, paramProvider5, paramProvider6, paramProvider7, paramProvider8);
  }
  
  public static Uploader newInstance(Context paramContext, BackendRegistry paramBackendRegistry, EventStore paramEventStore, WorkScheduler paramWorkScheduler, Executor paramExecutor, SynchronizationGuard paramSynchronizationGuard, Clock paramClock1, Clock paramClock2, ClientHealthMetricsStore paramClientHealthMetricsStore)
  {
    return new Uploader(paramContext, paramBackendRegistry, paramEventStore, paramWorkScheduler, paramExecutor, paramSynchronizationGuard, paramClock1, paramClock2, paramClientHealthMetricsStore);
  }
  
  public Uploader get()
  {
    return newInstance((Context)contextProvider.get(), (BackendRegistry)backendRegistryProvider.get(), (EventStore)eventStoreProvider.get(), (WorkScheduler)workSchedulerProvider.get(), (Executor)executorProvider.get(), (SynchronizationGuard)guardProvider.get(), (Clock)clockProvider.get(), (Clock)uptimeClockProvider.get(), (ClientHealthMetricsStore)clientHealthMetricsStoreProvider.get());
  }
}

/* Location:
 * Qualified Name:     com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader_Factory
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */