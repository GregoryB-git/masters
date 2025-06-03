package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.job.JobInfo.Builder;
import androidx.annotation.RequiresApi;
import com.google.android.datatransport.Priority;
import com.google.android.datatransport.runtime.time.Clock;
import com.google.auto.value.AutoValue;
import com.google.auto.value.AutoValue.Builder;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

@AutoValue
public abstract class SchedulerConfig
{
  private static final long BACKOFF_LOG_BASE = 10000L;
  private static final long ONE_SECOND = 1000L;
  private static final long THIRTY_SECONDS = 30000L;
  private static final long TWENTY_FOUR_HOURS = 86400000L;
  
  private long adjustedExponentialBackoff(int paramInt, long paramLong)
  {
    
    long l;
    if (paramLong > 1L) {
      l = paramLong;
    } else {
      l = 2L;
    }
    double d = Math.max(1.0D, Math.log(10000.0D) / Math.log(l * paramInt));
    return (Math.pow(3.0D, paramInt) * paramLong * d);
  }
  
  public static Builder builder()
  {
    return new Builder();
  }
  
  public static SchedulerConfig create(Clock paramClock, Map<Priority, ConfigValue> paramMap)
  {
    return new AutoValue_SchedulerConfig(paramClock, paramMap);
  }
  
  public static SchedulerConfig getDefault(Clock paramClock)
  {
    return builder().addConfig(Priority.DEFAULT, ConfigValue.builder().setDelta(30000L).setMaxAllowedDelay(86400000L).build()).addConfig(Priority.HIGHEST, ConfigValue.builder().setDelta(1000L).setMaxAllowedDelay(86400000L).build()).addConfig(Priority.VERY_LOW, ConfigValue.builder().setDelta(86400000L).setMaxAllowedDelay(86400000L).setFlags(immutableSetOf(new Flag[] { Flag.DEVICE_IDLE })).build()).setClock(paramClock).build();
  }
  
  private static <T> Set<T> immutableSetOf(T... paramVarArgs)
  {
    return Collections.unmodifiableSet(new HashSet(Arrays.asList(paramVarArgs)));
  }
  
  @RequiresApi(api=21)
  private void populateFlags(JobInfo.Builder paramBuilder, Set<Flag> paramSet)
  {
    if (paramSet.contains(Flag.NETWORK_UNMETERED)) {
      paramBuilder.setRequiredNetworkType(2);
    } else {
      paramBuilder.setRequiredNetworkType(1);
    }
    if (paramSet.contains(Flag.DEVICE_CHARGING)) {
      paramBuilder.setRequiresCharging(true);
    }
    if (paramSet.contains(Flag.DEVICE_IDLE)) {
      paramBuilder.setRequiresDeviceIdle(true);
    }
  }
  
  @RequiresApi(api=21)
  public JobInfo.Builder configureJob(JobInfo.Builder paramBuilder, Priority paramPriority, long paramLong, int paramInt)
  {
    paramBuilder.setMinimumLatency(getScheduleDelay(paramPriority, paramLong, paramInt));
    populateFlags(paramBuilder, ((ConfigValue)getValues().get(paramPriority)).getFlags());
    return paramBuilder;
  }
  
  public abstract Clock getClock();
  
  public Set<Flag> getFlags(Priority paramPriority)
  {
    return ((ConfigValue)getValues().get(paramPriority)).getFlags();
  }
  
  public long getScheduleDelay(Priority paramPriority, long paramLong, int paramInt)
  {
    long l = getClock().getTime();
    paramPriority = (ConfigValue)getValues().get(paramPriority);
    return Math.min(Math.max(adjustedExponentialBackoff(paramInt, paramPriority.getDelta()), paramLong - l), paramPriority.getMaxAllowedDelay());
  }
  
  public abstract Map<Priority, ConfigValue> getValues();
  
  public static class Builder
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
  
  @AutoValue
  public static abstract class ConfigValue
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
  
  public static enum Flag
  {
    static
    {
      Flag localFlag1 = new Flag("NETWORK_UNMETERED", 0);
      NETWORK_UNMETERED = localFlag1;
      Flag localFlag2 = new Flag("DEVICE_IDLE", 1);
      DEVICE_IDLE = localFlag2;
      Flag localFlag3 = new Flag("DEVICE_CHARGING", 2);
      DEVICE_CHARGING = localFlag3;
      $VALUES = new Flag[] { localFlag1, localFlag2, localFlag3 };
    }
    
    private Flag() {}
  }
}

/* Location:
 * Qualified Name:     com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */