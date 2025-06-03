package com.facebook.internal.logging.monitor;

import android.os.BaseBundle;
import android.os.Bundle;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import com.facebook.FacebookSdk;
import com.facebook.GraphRequest;
import com.facebook.GraphResponse;
import com.facebook.internal.Utility;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import com.facebook.internal.logging.ExternalLog;
import com.facebook.internal.logging.LoggingManager;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicLong;
import org.json.JSONObject;

@RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
public class Monitor
{
  private static final AtomicLong UNIQUE_EXTRA_ID = new AtomicLong(0L);
  private static Integer defaultSamplingRate;
  private static boolean isEnabled;
  private static final MetricsUtil metricsUtil;
  private static final LoggingManager monitorLoggingManager;
  private static final Random random = new Random();
  private static final Map<String, Integer> samplingRatesMap;
  
  static
  {
    defaultSamplingRate = Integer.valueOf(1000);
    monitorLoggingManager = MonitorLoggingManager.getInstance(MonitorLoggingQueue.getInstance(), MonitorLoggingStore.getInstance());
    metricsUtil = MetricsUtil.getInstance();
    samplingRatesMap = new HashMap();
  }
  
  @VisibleForTesting
  public static void addLog(ExternalLog paramExternalLog)
  {
    if (CrashShieldHandler.isObjectCrashing(Monitor.class)) {
      return;
    }
    try
    {
      if (isEnabled) {
        monitorLoggingManager.addLog(paramExternalLog);
      }
      return;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramExternalLog, Monitor.class);
    }
  }
  
  public static void cancelMeasurePerfFor(PerformanceEventName paramPerformanceEventName)
  {
    if (CrashShieldHandler.isObjectCrashing(Monitor.class)) {
      return;
    }
    try
    {
      long l = getCurrentThreadID();
      metricsUtil.removeTempMetricsDataFor(paramPerformanceEventName, l);
      return;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramPerformanceEventName, Monitor.class);
    }
  }
  
  public static void cancelMeasurePerfFor(PerformanceEventName paramPerformanceEventName, long paramLong)
  {
    if (CrashShieldHandler.isObjectCrashing(Monitor.class)) {
      return;
    }
    try
    {
      metricsUtil.removeTempMetricsDataFor(paramPerformanceEventName, paramLong);
      return;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramPerformanceEventName, Monitor.class);
    }
  }
  
  public static void enable()
  {
    if (CrashShieldHandler.isObjectCrashing(Monitor.class)) {
      return;
    }
    try
    {
      if (isEnabled) {
        return;
      }
      isEnabled = true;
      loadSamplingRatesMapAsync();
      monitorLoggingManager.flushLoggingStore();
      return;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(localThrowable, Monitor.class);
    }
  }
  
  public static JSONObject fetchSamplingRate()
  {
    if (CrashShieldHandler.isObjectCrashing(Monitor.class)) {
      return null;
    }
    try
    {
      Object localObject = new android/os/Bundle;
      ((Bundle)localObject).<init>();
      ((BaseBundle)localObject).putString("fields", "monitoring_config");
      GraphRequest localGraphRequest = GraphRequest.newGraphPathRequest(null, FacebookSdk.getApplicationId(), null);
      localGraphRequest.setSkipClientToken(true);
      localGraphRequest.setParameters((Bundle)localObject);
      localObject = localGraphRequest.executeAndWait().getJSONObject();
      return (JSONObject)localObject;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(localThrowable, Monitor.class);
    }
    return null;
  }
  
  public static long generateExtraId()
  {
    if (CrashShieldHandler.isObjectCrashing(Monitor.class)) {
      return 0L;
    }
    try
    {
      long l = UNIQUE_EXTRA_ID.incrementAndGet();
      return l;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(localThrowable, Monitor.class);
    }
    return 0L;
  }
  
  private static long getCurrentThreadID()
  {
    if (CrashShieldHandler.isObjectCrashing(Monitor.class)) {
      return 0L;
    }
    try
    {
      long l = Thread.currentThread().getId();
      return l;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(localThrowable, Monitor.class);
    }
    return 0L;
  }
  
  public static Integer getDefaultSamplingRate()
  {
    if (CrashShieldHandler.isObjectCrashing(Monitor.class)) {
      return null;
    }
    try
    {
      Integer localInteger = defaultSamplingRate;
      return localInteger;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(localThrowable, Monitor.class);
    }
    return null;
  }
  
  public static boolean isEnabled()
  {
    if (CrashShieldHandler.isObjectCrashing(Monitor.class)) {
      return false;
    }
    try
    {
      boolean bool = isEnabled;
      return bool;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(localThrowable, Monitor.class);
    }
    return false;
  }
  
  public static boolean isSampled(String paramString)
  {
    boolean bool1 = CrashShieldHandler.isObjectCrashing(Monitor.class);
    boolean bool2 = false;
    if (bool1) {
      return false;
    }
    try
    {
      if (Utility.isNullOrEmpty(paramString)) {
        return false;
      }
      int i = defaultSamplingRate.intValue();
      Map localMap = samplingRatesMap;
      if (localMap.containsKey(paramString)) {
        i = ((Integer)localMap.get(paramString)).intValue();
      }
      bool1 = bool2;
      if (i > 0)
      {
        i = random.nextInt(i);
        bool1 = bool2;
        if (i == 0) {
          bool1 = true;
        }
      }
      return bool1;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramString, Monitor.class);
    }
    return false;
  }
  
  public static void loadSamplingRatesMapAsync()
  {
    if (CrashShieldHandler.isObjectCrashing(Monitor.class)) {
      return;
    }
    try
    {
      Executor localExecutor = FacebookSdk.getExecutor();
      Runnable local1 = new com/facebook/internal/logging/monitor/Monitor$1;
      local1.<init>();
      localExecutor.execute(local1);
      return;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(localThrowable, Monitor.class);
    }
  }
  
  public static void startMeasurePerfFor(PerformanceEventName paramPerformanceEventName)
  {
    if (CrashShieldHandler.isObjectCrashing(Monitor.class)) {
      return;
    }
    try
    {
      startMeasurePerfFor(paramPerformanceEventName, getCurrentThreadID());
      return;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramPerformanceEventName, Monitor.class);
    }
  }
  
  public static void startMeasurePerfFor(PerformanceEventName paramPerformanceEventName, long paramLong)
  {
    if (CrashShieldHandler.isObjectCrashing(Monitor.class)) {
      return;
    }
    try
    {
      if ((isEnabled) && (isSampled(paramPerformanceEventName.toString()))) {
        metricsUtil.startMeasureFor(paramPerformanceEventName, paramLong);
      }
      return;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramPerformanceEventName, Monitor.class);
    }
  }
  
  public static void stopMeasurePerfFor(PerformanceEventName paramPerformanceEventName)
  {
    if (CrashShieldHandler.isObjectCrashing(Monitor.class)) {
      return;
    }
    try
    {
      stopMeasurePerfFor(paramPerformanceEventName, getCurrentThreadID());
      return;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramPerformanceEventName, Monitor.class);
    }
  }
  
  public static void stopMeasurePerfFor(PerformanceEventName paramPerformanceEventName, long paramLong)
  {
    if (CrashShieldHandler.isObjectCrashing(Monitor.class)) {
      return;
    }
    try
    {
      paramPerformanceEventName = metricsUtil.stopMeasureFor(paramPerformanceEventName, paramLong);
      if (paramPerformanceEventName.isValid()) {
        addLog(paramPerformanceEventName);
      }
      return;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramPerformanceEventName, Monitor.class);
    }
  }
  
  /* Error */
  public static void updateSamplingRateMap(JSONObject paramJSONObject)
  {
    // Byte code:
    //   0: ldc 2
    //   2: invokestatic 90	com/facebook/internal/instrument/crashshield/CrashShieldHandler:isObjectCrashing	(Ljava/lang/Object;)Z
    //   5: ifeq +4 -> 9
    //   8: return
    //   9: aload_0
    //   10: ldc 127
    //   12: invokevirtual 248	org/json/JSONObject:getJSONObject	(Ljava/lang/String;)Lorg/json/JSONObject;
    //   15: ldc -6
    //   17: invokevirtual 254	org/json/JSONObject:getJSONArray	(Ljava/lang/String;)Lorg/json/JSONArray;
    //   20: astore_0
    //   21: iconst_0
    //   22: istore_1
    //   23: iload_1
    //   24: aload_0
    //   25: invokevirtual 259	org/json/JSONArray:length	()I
    //   28: if_icmpge +75 -> 103
    //   31: aload_0
    //   32: iload_1
    //   33: invokevirtual 262	org/json/JSONArray:getJSONObject	(I)Lorg/json/JSONObject;
    //   36: astore_2
    //   37: aload_2
    //   38: ldc_w 264
    //   41: invokevirtual 268	org/json/JSONObject:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   44: astore_3
    //   45: aload_2
    //   46: ldc_w 269
    //   49: invokevirtual 273	org/json/JSONObject:getInt	(Ljava/lang/String;)I
    //   52: istore 4
    //   54: ldc_w 275
    //   57: aload_3
    //   58: invokevirtual 280	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   61: ifeq +14 -> 75
    //   64: iload 4
    //   66: invokestatic 40	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   69: putstatic 42	com/facebook/internal/logging/monitor/Monitor:defaultSamplingRate	Ljava/lang/Integer;
    //   72: goto +18 -> 90
    //   75: getstatic 72	com/facebook/internal/logging/monitor/Monitor:samplingRatesMap	Ljava/util/Map;
    //   78: aload_3
    //   79: iload 4
    //   81: invokestatic 40	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   84: invokeinterface 284 3 0
    //   89: pop
    //   90: iinc 1 1
    //   93: goto -70 -> 23
    //   96: astore_0
    //   97: aload_0
    //   98: ldc 2
    //   100: invokestatic 100	com/facebook/internal/instrument/crashshield/CrashShieldHandler:handleThrowable	(Ljava/lang/Throwable;Ljava/lang/Object;)V
    //   103: return
    //   104: astore_0
    //   105: goto -2 -> 103
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	108	0	paramJSONObject	JSONObject
    //   22	69	1	i	int
    //   36	10	2	localJSONObject	JSONObject
    //   44	35	3	str	String
    //   52	28	4	j	int
    // Exception table:
    //   from	to	target	type
    //   9	21	96	finally
    //   23	72	96	finally
    //   75	90	96	finally
    //   9	21	104	org/json/JSONException
    //   23	72	104	org/json/JSONException
    //   75	90	104	org/json/JSONException
  }
}

/* Location:
 * Qualified Name:     com.facebook.internal.logging.monitor.Monitor
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */