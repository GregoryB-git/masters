package com.google.android.datatransport.runtime.scheduling;

import com.google.android.datatransport.runtime.dagger.Module;
import com.google.android.datatransport.runtime.dagger.Provides;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig;
import com.google.android.datatransport.runtime.time.Clock;
import com.google.android.datatransport.runtime.time.WallTime;

@Module
public abstract class SchedulingConfigModule
{
  @Provides
  public static SchedulerConfig config(@WallTime Clock paramClock)
  {
    return SchedulerConfig.getDefault(paramClock);
  }
}

/* Location:
 * Qualified Name:     com.google.android.datatransport.runtime.scheduling.SchedulingConfigModule
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */