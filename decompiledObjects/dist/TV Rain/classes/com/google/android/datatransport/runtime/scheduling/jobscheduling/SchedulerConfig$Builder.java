package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import com.google.android.datatransport.Priority;
import com.google.android.datatransport.runtime.time.Clock;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class SchedulerConfig$Builder
{
  private Clock clock;
  private Map<Priority, SchedulerConfig.ConfigValue> values = new HashMap();
  
  public Builder addConfig(Priority paramPriority, SchedulerConfig.ConfigValue paramConfigValue)
  {
    values.put(paramPriority, paramConfigValue);
    return this;
  }
  
  public SchedulerConfig build()
  {
    if (clock != null)
    {
      if (values.keySet().size() >= Priority.values().length)
      {
        Map localMap = values;
        values = new HashMap();
        return SchedulerConfig.create(clock, localMap);
      }
      throw new IllegalStateException("Not all priorities have been configured");
    }
    throw new NullPointerException("missing required property: clock");
  }
  
  public Builder setClock(Clock paramClock)
  {
    clock = paramClock;
    return this;
  }
}

/* Location:
 * Qualified Name:     com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig.Builder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */