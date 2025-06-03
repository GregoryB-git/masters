package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import com.google.auto.value.AutoValue.Builder;
import java.util.Set;

@AutoValue.Builder
public abstract class SchedulerConfig$ConfigValue$Builder
{
  public abstract SchedulerConfig.ConfigValue build();
  
  public abstract Builder setDelta(long paramLong);
  
  public abstract Builder setFlags(Set<SchedulerConfig.Flag> paramSet);
  
  public abstract Builder setMaxAllowedDelay(long paramLong);
}

/* Location:
 * Qualified Name:     com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig.ConfigValue.Builder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */