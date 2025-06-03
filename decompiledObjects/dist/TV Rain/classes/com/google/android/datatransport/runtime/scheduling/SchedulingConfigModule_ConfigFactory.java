package com.google.android.datatransport.runtime.scheduling;

import com.google.android.datatransport.runtime.dagger.internal.Factory;
import com.google.android.datatransport.runtime.dagger.internal.Preconditions;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig;
import com.google.android.datatransport.runtime.time.Clock;
import javax.inject.Provider;

public final class SchedulingConfigModule_ConfigFactory
  implements Factory<SchedulerConfig>
{
  private final Provider<Clock> clockProvider;
  
  public SchedulingConfigModule_ConfigFactory(Provider<Clock> paramProvider)
  {
    clockProvider = paramProvider;
  }
  
  public static SchedulerConfig config(Clock paramClock)
  {
    return (SchedulerConfig)Preconditions.checkNotNull(SchedulingConfigModule.config(paramClock), "Cannot return null from a non-@Nullable @Provides method");
  }
  
  public static SchedulingConfigModule_ConfigFactory create(Provider<Clock> paramProvider)
  {
    return new SchedulingConfigModule_ConfigFactory(paramProvider);
  }
  
  public SchedulerConfig get()
  {
    return config((Clock)clockProvider.get());
  }
}

/* Location:
 * Qualified Name:     com.google.android.datatransport.runtime.scheduling.SchedulingConfigModule_ConfigFactory
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */