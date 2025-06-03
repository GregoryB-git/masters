package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import java.util.Set;
import z2;

final class AutoValue_SchedulerConfig_ConfigValue$Builder
  extends SchedulerConfig.ConfigValue.Builder
{
  private Long delta;
  private Set<SchedulerConfig.Flag> flags;
  private Long maxAllowedDelay;
  
  public SchedulerConfig.ConfigValue build()
  {
    if (delta == null) {
      localObject1 = " delta";
    } else {
      localObject1 = "";
    }
    Object localObject2 = localObject1;
    if (maxAllowedDelay == null) {
      localObject2 = z2.o((String)localObject1, " maxAllowedDelay");
    }
    Object localObject1 = localObject2;
    if (flags == null) {
      localObject1 = z2.o((String)localObject2, " flags");
    }
    if (((String)localObject1).isEmpty()) {
      return new AutoValue_SchedulerConfig_ConfigValue(delta.longValue(), maxAllowedDelay.longValue(), flags, null);
    }
    throw new IllegalStateException(z2.o("Missing required properties:", (String)localObject1));
  }
  
  public SchedulerConfig.ConfigValue.Builder setDelta(long paramLong)
  {
    delta = Long.valueOf(paramLong);
    return this;
  }
  
  public SchedulerConfig.ConfigValue.Builder setFlags(Set<SchedulerConfig.Flag> paramSet)
  {
    if (paramSet != null)
    {
      flags = paramSet;
      return this;
    }
    throw new NullPointerException("Null flags");
  }
  
  public SchedulerConfig.ConfigValue.Builder setMaxAllowedDelay(long paramLong)
  {
    maxAllowedDelay = Long.valueOf(paramLong);
    return this;
  }
}

/* Location:
 * Qualified Name:     com.google.android.datatransport.runtime.scheduling.jobscheduling.AutoValue_SchedulerConfig_ConfigValue.Builder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */