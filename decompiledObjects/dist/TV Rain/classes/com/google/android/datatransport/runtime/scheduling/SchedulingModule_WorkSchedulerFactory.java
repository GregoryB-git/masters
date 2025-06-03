package com.google.android.datatransport.runtime.scheduling;

import android.content.Context;
import com.google.android.datatransport.runtime.dagger.internal.Factory;
import com.google.android.datatransport.runtime.dagger.internal.Preconditions;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkScheduler;
import com.google.android.datatransport.runtime.scheduling.persistence.EventStore;
import com.google.android.datatransport.runtime.time.Clock;
import javax.inject.Provider;

public final class SchedulingModule_WorkSchedulerFactory
  implements Factory<WorkScheduler>
{
  private final Provider<Clock> clockProvider;
  private final Provider<SchedulerConfig> configProvider;
  private final Provider<Context> contextProvider;
  private final Provider<EventStore> eventStoreProvider;
  
  public SchedulingModule_WorkSchedulerFactory(Provider<Context> paramProvider, Provider<EventStore> paramProvider1, Provider<SchedulerConfig> paramProvider2, Provider<Clock> paramProvider3)
  {
    contextProvider = paramProvider;
    eventStoreProvider = paramProvider1;
    configProvider = paramProvider2;
    clockProvider = paramProvider3;
  }
  
  public static SchedulingModule_WorkSchedulerFactory create(Provider<Context> paramProvider, Provider<EventStore> paramProvider1, Provider<SchedulerConfig> paramProvider2, Provider<Clock> paramProvider3)
  {
    return new SchedulingModule_WorkSchedulerFactory(paramProvider, paramProvider1, paramProvider2, paramProvider3);
  }
  
  public static WorkScheduler workScheduler(Context paramContext, EventStore paramEventStore, SchedulerConfig paramSchedulerConfig, Clock paramClock)
  {
    return (WorkScheduler)Preconditions.checkNotNull(SchedulingModule.workScheduler(paramContext, paramEventStore, paramSchedulerConfig, paramClock), "Cannot return null from a non-@Nullable @Provides method");
  }
  
  public WorkScheduler get()
  {
    return workScheduler((Context)contextProvider.get(), (EventStore)eventStoreProvider.get(), (SchedulerConfig)configProvider.get(), (Clock)clockProvider.get());
  }
}

/* Location:
 * Qualified Name:     com.google.android.datatransport.runtime.scheduling.SchedulingModule_WorkSchedulerFactory
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */