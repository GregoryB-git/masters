package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import java.util.Set;
import z2;

final class AutoValue_SchedulerConfig_ConfigValue
  extends SchedulerConfig.ConfigValue
{
  private final long delta;
  private final Set<SchedulerConfig.Flag> flags;
  private final long maxAllowedDelay;
  
  private AutoValue_SchedulerConfig_ConfigValue(long paramLong1, long paramLong2, Set<SchedulerConfig.Flag> paramSet)
  {
    delta = paramLong1;
    maxAllowedDelay = paramLong2;
    flags = paramSet;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (paramObject == this) {
      return true;
    }
    if ((paramObject instanceof SchedulerConfig.ConfigValue))
    {
      paramObject = (SchedulerConfig.ConfigValue)paramObject;
      if ((delta != ((SchedulerConfig.ConfigValue)paramObject).getDelta()) || (maxAllowedDelay != ((SchedulerConfig.ConfigValue)paramObject).getMaxAllowedDelay()) || (!flags.equals(((SchedulerConfig.ConfigValue)paramObject).getFlags()))) {
        bool = false;
      }
      return bool;
    }
    return false;
  }
  
  public long getDelta()
  {
    return delta;
  }
  
  public Set<SchedulerConfig.Flag> getFlags()
  {
    return flags;
  }
  
  public long getMaxAllowedDelay()
  {
    return maxAllowedDelay;
  }
  
  public int hashCode()
  {
    long l = delta;
    int i = (int)(l ^ l >>> 32);
    l = maxAllowedDelay;
    return ((i ^ 0xF4243) * 1000003 ^ (int)(l >>> 32 ^ l)) * 1000003 ^ flags.hashCode();
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = z2.t("ConfigValue{delta=");
    localStringBuilder.append(delta);
    localStringBuilder.append(", maxAllowedDelay=");
    localStringBuilder.append(maxAllowedDelay);
    localStringBuilder.append(", flags=");
    localStringBuilder.append(flags);
    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
  
  public static final class Builder
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
}

/* Location:
 * Qualified Name:     com.google.android.datatransport.runtime.scheduling.jobscheduling.AutoValue_SchedulerConfig_ConfigValue
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */