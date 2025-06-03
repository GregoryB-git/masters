package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import com.google.auto.value.AutoValue;
import com.google.auto.value.AutoValue.Builder;
import java.util.Collections;
import java.util.Set;

@AutoValue
public abstract class SchedulerConfig$ConfigValue
{
  public static Builder builder()
  {
    return new AutoValue_SchedulerConfig_ConfigValue.Builder().setFlags(Collections.emptySet());
  }
  
  public abstract long getDelta();
  
  public abstract Set<SchedulerConfig.Flag> getFlags();
  
  public abstract long getMaxAllowedDelay();
  
  @AutoValue.Builder
  public static abstract class Builder
  {
    public abstract SchedulerConfig.ConfigValue build();
    
    public abstract Builder setDelta(long paramLong);
    
    public abstract Builder setFlags(Set<SchedulerConfig.Flag> paramSet);
    
    public abstract Builder setMaxAllowedDelay(long paramLong);
  }
}

/* Location:
 * Qualified Name:     com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig.ConfigValue
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */