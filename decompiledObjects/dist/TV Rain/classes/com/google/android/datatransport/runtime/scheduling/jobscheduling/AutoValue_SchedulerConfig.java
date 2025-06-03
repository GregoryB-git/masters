package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import com.google.android.datatransport.Priority;
import com.google.android.datatransport.runtime.time.Clock;
import java.util.Map;
import z2;

final class AutoValue_SchedulerConfig
  extends SchedulerConfig
{
  private final Clock clock;
  private final Map<Priority, SchedulerConfig.ConfigValue> values;
  
  public AutoValue_SchedulerConfig(Clock paramClock, Map<Priority, SchedulerConfig.ConfigValue> paramMap)
  {
    if (paramClock != null)
    {
      clock = paramClock;
      if (paramMap != null)
      {
        values = paramMap;
        return;
      }
      throw new NullPointerException("Null values");
    }
    throw new NullPointerException("Null clock");
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (paramObject == this) {
      return true;
    }
    if ((paramObject instanceof SchedulerConfig))
    {
      paramObject = (SchedulerConfig)paramObject;
      if ((!clock.equals(((SchedulerConfig)paramObject).getClock())) || (!values.equals(((SchedulerConfig)paramObject).getValues()))) {
        bool = false;
      }
      return bool;
    }
    return false;
  }
  
  public Clock getClock()
  {
    return clock;
  }
  
  public Map<Priority, SchedulerConfig.ConfigValue> getValues()
  {
    return values;
  }
  
  public int hashCode()
  {
    return (clock.hashCode() ^ 0xF4243) * 1000003 ^ values.hashCode();
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = z2.t("SchedulerConfig{clock=");
    localStringBuilder.append(clock);
    localStringBuilder.append(", values=");
    localStringBuilder.append(values);
    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     com.google.android.datatransport.runtime.scheduling.jobscheduling.AutoValue_SchedulerConfig
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */