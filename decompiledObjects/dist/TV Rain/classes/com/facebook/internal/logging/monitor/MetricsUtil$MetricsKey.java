package com.facebook.internal.logging.monitor;

import androidx.annotation.Nullable;

class MetricsUtil$MetricsKey
{
  private long extraId;
  private PerformanceEventName performanceEventName;
  
  public MetricsUtil$MetricsKey(PerformanceEventName paramPerformanceEventName, long paramLong)
  {
    performanceEventName = paramPerformanceEventName;
    extraId = paramLong;
  }
  
  public boolean equals(@Nullable Object paramObject)
  {
    boolean bool = true;
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (getClass() == paramObject.getClass()))
    {
      paramObject = (MetricsKey)paramObject;
      if ((extraId != extraId) || (performanceEventName != performanceEventName)) {
        bool = false;
      }
      return bool;
    }
    return false;
  }
  
  public int hashCode()
  {
    int i = performanceEventName.hashCode();
    long l = extraId;
    return (i + 527) * 31 + (int)(l ^ l >>> 32);
  }
}

/* Location:
 * Qualified Name:     com.facebook.internal.logging.monitor.MetricsUtil.MetricsKey
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */