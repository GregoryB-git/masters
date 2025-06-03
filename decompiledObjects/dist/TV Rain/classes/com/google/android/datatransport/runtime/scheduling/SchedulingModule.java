package com.google.android.datatransport.runtime.scheduling;

import android.content.Context;
import com.google.android.datatransport.runtime.dagger.Binds;
import com.google.android.datatransport.runtime.dagger.Module;
import com.google.android.datatransport.runtime.dagger.Provides;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoScheduler;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkScheduler;
import com.google.android.datatransport.runtime.scheduling.persistence.EventStore;
import com.google.android.datatransport.runtime.time.Clock;
import com.google.android.datatransport.runtime.time.Monotonic;

@Module
public abstract class SchedulingModule
{
  @Provides
  public static WorkScheduler workScheduler(Context paramContext, EventStore paramEventStore, SchedulerConfig paramSchedulerConfig, @Monotonic Clock paramClock)
  {
    return new JobInfoScheduler(paramContext, paramEventStore, paramSchedulerConfig);
  }
  
  @Binds
  public abstract Scheduler scheduler(DefaultScheduler paramDefaultScheduler);
}

/* Location:
 * Qualified Name:     com.google.android.datatransport.runtime.scheduling.SchedulingModule
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */