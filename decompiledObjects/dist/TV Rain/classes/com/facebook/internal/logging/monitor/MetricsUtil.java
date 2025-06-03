package com.facebook.internal.logging.monitor;

import android.os.SystemClock;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import com.facebook.internal.Utility;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import com.facebook.internal.logging.LogCategory;
import com.facebook.internal.logging.LogEvent;
import java.util.HashMap;
import java.util.Map;

@RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
public class MetricsUtil
{
  private static final String CLASS_TAG = "com.facebook.internal.logging.monitor.MetricsUtil";
  public static final int INVALID_TIME = -1;
  private static MetricsUtil metricsUtil;
  private final Map<MetricsKey, TempMetrics> metricsDataMap = new HashMap();
  
  /* Error */
  public static MetricsUtil getInstance()
  {
    // Byte code:
    //   0: ldc 2
    //   2: monitorenter
    //   3: ldc 2
    //   5: invokestatic 44	com/facebook/internal/instrument/crashshield/CrashShieldHandler:isObjectCrashing	(Ljava/lang/Object;)Z
    //   8: istore_0
    //   9: iload_0
    //   10: ifeq +8 -> 18
    //   13: ldc 2
    //   15: monitorexit
    //   16: aconst_null
    //   17: areturn
    //   18: getstatic 46	com/facebook/internal/logging/monitor/MetricsUtil:metricsUtil	Lcom/facebook/internal/logging/monitor/MetricsUtil;
    //   21: ifnonnull +15 -> 36
    //   24: new 2	com/facebook/internal/logging/monitor/MetricsUtil
    //   27: astore_1
    //   28: aload_1
    //   29: invokespecial 47	com/facebook/internal/logging/monitor/MetricsUtil:<init>	()V
    //   32: aload_1
    //   33: putstatic 46	com/facebook/internal/logging/monitor/MetricsUtil:metricsUtil	Lcom/facebook/internal/logging/monitor/MetricsUtil;
    //   36: getstatic 46	com/facebook/internal/logging/monitor/MetricsUtil:metricsUtil	Lcom/facebook/internal/logging/monitor/MetricsUtil;
    //   39: astore_1
    //   40: ldc 2
    //   42: monitorexit
    //   43: aload_1
    //   44: areturn
    //   45: astore_1
    //   46: aload_1
    //   47: ldc 2
    //   49: invokestatic 51	com/facebook/internal/instrument/crashshield/CrashShieldHandler:handleThrowable	(Ljava/lang/Throwable;Ljava/lang/Object;)V
    //   52: ldc 2
    //   54: monitorexit
    //   55: aconst_null
    //   56: areturn
    //   57: astore_1
    //   58: ldc 2
    //   60: monitorexit
    //   61: aload_1
    //   62: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   8	2	0	bool	boolean
    //   27	17	1	localMetricsUtil	MetricsUtil
    //   45	2	1	localThrowable	Throwable
    //   57	5	1	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   18	36	45	finally
    //   36	40	45	finally
    //   3	9	57	finally
    //   46	52	57	finally
  }
  
  public void removeTempMetricsDataFor(PerformanceEventName paramPerformanceEventName, long paramLong)
  {
    if (CrashShieldHandler.isObjectCrashing(this)) {
      return;
    }
    try
    {
      MetricsKey localMetricsKey = new com/facebook/internal/logging/monitor/MetricsUtil$MetricsKey;
      localMetricsKey.<init>(paramPerformanceEventName, paramLong);
      metricsDataMap.remove(localMetricsKey);
      return;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramPerformanceEventName, this);
    }
  }
  
  public void startMeasureFor(PerformanceEventName paramPerformanceEventName, long paramLong)
  {
    if (CrashShieldHandler.isObjectCrashing(this)) {
      return;
    }
    try
    {
      MetricsKey localMetricsKey = new com/facebook/internal/logging/monitor/MetricsUtil$MetricsKey;
      localMetricsKey.<init>(paramPerformanceEventName, paramLong);
      paramLong = SystemClock.elapsedRealtime();
      paramPerformanceEventName = new com/facebook/internal/logging/monitor/MetricsUtil$TempMetrics;
      paramPerformanceEventName.<init>(paramLong);
      metricsDataMap.put(localMetricsKey, paramPerformanceEventName);
      return;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramPerformanceEventName, this);
    }
  }
  
  public MonitorLog stopMeasureFor(PerformanceEventName paramPerformanceEventName, long paramLong)
  {
    if (CrashShieldHandler.isObjectCrashing(this)) {
      return null;
    }
    try
    {
      long l = SystemClock.elapsedRealtime();
      Object localObject1 = new com/facebook/internal/logging/monitor/MetricsUtil$MetricsKey;
      ((MetricsKey)localObject1).<init>(paramPerformanceEventName, paramLong);
      LogEvent localLogEvent = new com/facebook/internal/logging/LogEvent;
      localLogEvent.<init>(paramPerformanceEventName.toString(), LogCategory.PERFORMANCE);
      Object localObject2 = new com/facebook/internal/logging/monitor/MonitorLog$LogBuilder;
      ((MonitorLog.LogBuilder)localObject2).<init>(localLogEvent);
      localObject2 = ((MonitorLog.LogBuilder)localObject2).timeSpent(-1).build();
      if (!metricsDataMap.containsKey(localObject1))
      {
        localObject1 = new java/lang/StringBuilder;
        ((StringBuilder)localObject1).<init>();
        ((StringBuilder)localObject1).append("Can't measure for ");
        ((StringBuilder)localObject1).append(paramPerformanceEventName);
        ((StringBuilder)localObject1).append(", startMeasureFor hasn't been called before.");
        Utility.logd(CLASS_TAG, ((StringBuilder)localObject1).toString());
        return (MonitorLog)localObject2;
      }
      TempMetrics localTempMetrics = (TempMetrics)metricsDataMap.get(localObject1);
      paramPerformanceEventName = (PerformanceEventName)localObject2;
      if (localTempMetrics != null)
      {
        int i = (int)(l - TempMetrics.access$000(localTempMetrics));
        paramPerformanceEventName = new com/facebook/internal/logging/monitor/MonitorLog$LogBuilder;
        paramPerformanceEventName.<init>(localLogEvent);
        paramPerformanceEventName = paramPerformanceEventName.timeSpent(i).build();
      }
      metricsDataMap.remove(localObject1);
      return paramPerformanceEventName;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramPerformanceEventName, this);
    }
    return null;
  }
  
  public static class MetricsKey
  {
    private long extraId;
    private PerformanceEventName performanceEventName;
    
    public MetricsKey(PerformanceEventName paramPerformanceEventName, long paramLong)
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
  
  public static class TempMetrics
  {
    private long timeStart;
    
    public TempMetrics(long paramLong)
    {
      timeStart = paramLong;
    }
  }
}

/* Location:
 * Qualified Name:     com.facebook.internal.logging.monitor.MetricsUtil
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */