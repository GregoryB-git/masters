package com.appsflyer.internal;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Handler;
import android.os.HandlerThread;
import androidx.annotation.NonNull;
import com.appsflyer.AFLogger;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.Format;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

public final class AFf1hSDK
  implements AFf1iSDK
{
  private static final BitSet afInfoLog;
  final Handler AFInAppEventParameterName;
  final Runnable AFInAppEventType;
  boolean AFKeystoreWrapper;
  private final Map<AFf1kSDK, AFf1kSDK> AFLogger;
  private long AFLogger$LogLevel;
  private Runnable AFVersionDeclaration;
  private boolean afDebugLog;
  private final Map<AFf1kSDK, Map<String, Object>> afErrorLog;
  private final Runnable afErrorLogForExcManagerOnly;
  private final SensorManager afRDLog;
  private int getLevel;
  final Object valueOf = new Object();
  final Runnable values;
  
  static
  {
    BitSet localBitSet = new BitSet(6);
    afInfoLog = localBitSet;
    localBitSet.set(1);
    localBitSet.set(2);
    localBitSet.set(4);
  }
  
  public AFf1hSDK(@NonNull Context paramContext)
  {
    this(localSensorManager, new Handler(paramContext.getLooper()));
  }
  
  private AFf1hSDK(@NonNull SensorManager paramSensorManager, Handler paramHandler)
  {
    BitSet localBitSet = afInfoLog;
    AFLogger = new HashMap(localBitSet.size());
    afErrorLog = new ConcurrentHashMap(localBitSet.size());
    values = new Runnable()
    {
      public final void run()
      {
        synchronized (valueOf)
        {
          AFf1hSDK localAFf1hSDK = AFf1hSDK.this;
          Handler localHandler = AFInAppEventParameterName;
          Object localObject2 = new com/appsflyer/internal/AFf1hSDK$3;
          ((AFf1hSDK.3)localObject2).<init>(localAFf1hSDK);
          localHandler.post((Runnable)localObject2);
          localObject2 = AFf1hSDK.this;
          AFInAppEventParameterName.postDelayed(AFf1hSDK.AFKeystoreWrapper((AFf1hSDK)localObject2), 100L);
          AFKeystoreWrapper = true;
          return;
        }
      }
    };
    AFInAppEventType = new u(this);
    AFVersionDeclaration = new Runnable()
    {
      public final void run()
      {
        synchronized (valueOf)
        {
          Object localObject2 = AFf1hSDK.this;
          if (AFKeystoreWrapper)
          {
            AFInAppEventParameterName.removeCallbacks(values);
            localObject2 = AFf1hSDK.this;
            AFInAppEventParameterName.removeCallbacks(AFInAppEventType);
            AFf1hSDK localAFf1hSDK = AFf1hSDK.this;
            localObject2 = AFInAppEventParameterName;
            AFf1hSDK.5 local5 = new com/appsflyer/internal/AFf1hSDK$5;
            local5.<init>(localAFf1hSDK);
            ((Handler)localObject2).post(local5);
            AFKeystoreWrapper = false;
          }
        }
        return;
        throw ((Throwable)localObject3);
      }
    };
    getLevel = 1;
    AFLogger$LogLevel = 0L;
    afErrorLogForExcManagerOnly = new Runnable()
    {
      public final void run()
      {
        synchronized (valueOf)
        {
          if (AFf1hSDK.AFInAppEventType(AFf1hSDK.this) == 0) {
            AFf1hSDK.AFKeystoreWrapper(AFf1hSDK.this, 1);
          }
        }
        localAFf1hSDK = AFf1hSDK.this;
        AFInAppEventParameterName.postDelayed(AFInAppEventType, AFf1hSDK.AFInAppEventType(localAFf1hSDK) * 500L);
      }
    };
    afRDLog = paramSensorManager;
    AFInAppEventParameterName = paramHandler;
  }
  
  private List<Map<String, Object>> AFKeystoreWrapper()
  {
    Object localObject = AFLogger.values().iterator();
    while (((Iterator)localObject).hasNext()) {
      ((AFf1kSDK)((Iterator)localObject).next()).valueOf(afErrorLog, true);
    }
    localObject = afErrorLog;
    if ((localObject != null) && (!((Map)localObject).isEmpty())) {
      return new CopyOnWriteArrayList(afErrorLog.values());
    }
    return new CopyOnWriteArrayList(Collections.emptyList());
  }
  
  @NonNull
  private List<Map<String, Object>> afErrorLog()
  {
    CopyOnWriteArrayList localCopyOnWriteArrayList;
    synchronized (valueOf)
    {
      if ((!AFLogger.isEmpty()) && (afDebugLog))
      {
        Iterator localIterator = AFLogger.values().iterator();
        if (localIterator.hasNext()) {
          ((AFf1kSDK)localIterator.next()).valueOf(afErrorLog, false);
        }
      }
    }
  }
  
  private static boolean values(int paramInt)
  {
    return (paramInt >= 0) && (afInfoLog.get(paramInt));
  }
  
  public final void AFInAppEventParameterName()
  {
    AFInAppEventParameterName.post(AFVersionDeclaration);
    AFInAppEventParameterName.post(values);
  }
  
  public final void AFInAppEventType()
  {
    try
    {
      AFInAppEventParameterName.post(AFVersionDeclaration);
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  @NonNull
  public final Map<String, Object> valueOf()
  {
    ConcurrentHashMap localConcurrentHashMap = new ConcurrentHashMap();
    List localList = afErrorLog();
    if (!localList.isEmpty()) {}
    do
    {
      localConcurrentHashMap.put("sensors", localList);
      break;
      localList = AFKeystoreWrapper();
    } while (!localList.isEmpty());
    return localConcurrentHashMap;
  }
  
  @NonNull
  public final Map<String, Object> values()
  {
    ConcurrentHashMap localConcurrentHashMap = new ConcurrentHashMap();
    Object localObject1 = AFKeystoreWrapper();
    boolean bool = ((List)localObject1).isEmpty();
    String str1 = "sensors";
    String str2 = "na";
    if (!bool)
    {
      new AFf1gSDK();
      HashMap localHashMap1 = new HashMap();
      Iterator localIterator = ((List)localObject1).iterator();
      while (localIterator.hasNext())
      {
        Object localObject2 = (Map)localIterator.next();
        HashMap localHashMap2 = new HashMap();
        int i;
        if (((Map)localObject2).get("sVS") != null) {
          i = 1;
        } else {
          i = 0;
        }
        int j;
        if (((Map)localObject2).get("sVE") != null) {
          j = 1;
        } else {
          j = 0;
        }
        if ((i != 0) && (j != 0)) {
          localObject1 = AFf1gSDK.AFa1xSDK.AFInAppEventType;
        } else if (i != 0) {
          localObject1 = AFf1gSDK.AFa1xSDK.values;
        } else {
          localObject1 = AFf1gSDK.AFa1xSDK.valueOf;
        }
        if (localObject1 != AFf1gSDK.AFa1xSDK.valueOf)
        {
          Integer localInteger = (Integer)((Map)localObject2).get("sT");
          Object localObject3 = (String)((Map)localObject2).get("sN");
          if (localObject3 != null) {}
          for (;;)
          {
            localHashMap2.put("n", localObject3);
            break;
            localObject3 = "uk";
          }
          Object localObject4 = AFf1gSDK.AFa1zSDK.values()[localInteger.intValue()];
          localObject3 = new ArrayList(AFf1gSDK.AFKeystoreWrapper(((Map)localObject2).get("sVS")));
          if (localObject1 == AFf1gSDK.AFa1xSDK.AFInAppEventType) {
            ((List)localObject3).addAll(AFf1gSDK.AFKeystoreWrapper(((Map)localObject2).get("sVE")));
          }
          Object localObject5;
          Object localObject6;
          Object localObject7;
          if (localObject4 == AFf1gSDK.AFa1zSDK.AFInAppEventParameterName)
          {
            localObject2 = new ArrayList();
            localObject4 = (BigDecimal)((List)localObject3).get(0);
            localObject5 = (BigDecimal)((List)localObject3).get(1);
            double d = ((Number)localObject4).doubleValue();
            localObject6 = BigDecimal.valueOf(Math.atan2(((Number)localObject5).doubleValue(), d) * 57.29577951308232D);
            localObject5 = new DecimalFormat("##.#");
            localObject4 = RoundingMode.DOWN;
            ((DecimalFormat)localObject5).setRoundingMode((RoundingMode)localObject4);
            ((List)localObject2).add(Double.valueOf(AFc1uSDK.AFa1wSDK.values(((Format)localObject5).format(localObject6))));
            localObject5 = (BigDecimal)((List)localObject3).get(2);
            localObject7 = new DecimalFormat("##.#");
            ((DecimalFormat)localObject7).setRoundingMode((RoundingMode)localObject4);
            ((List)localObject2).add(Double.valueOf(AFc1uSDK.AFa1wSDK.values(((Format)localObject7).format(localObject5))));
            localObject5 = new ArrayList();
            if (((List)localObject3).size() > 5)
            {
              localObject7 = (BigDecimal)((List)localObject3).get(3);
              BigDecimal localBigDecimal = (BigDecimal)((List)localObject3).get(4);
              d = ((Number)localObject7).doubleValue();
              localObject6 = BigDecimal.valueOf(Math.atan2(localBigDecimal.doubleValue(), d) * 57.29577951308232D).subtract((BigDecimal)localObject6);
              localObject7 = new DecimalFormat("##.#");
              ((DecimalFormat)localObject7).setRoundingMode((RoundingMode)localObject4);
              ((List)localObject5).add(Double.valueOf(AFc1uSDK.AFa1wSDK.values(((Format)localObject7).format(localObject6))));
              localObject6 = ((BigDecimal)((List)localObject3).get(5)).subtract((BigDecimal)((List)localObject3).get(2));
              localObject3 = new DecimalFormat("##.#");
              ((DecimalFormat)localObject3).setRoundingMode((RoundingMode)localObject4);
              ((List)localObject5).add(Double.valueOf(AFc1uSDK.AFa1wSDK.values(((Format)localObject3).format(localObject6))));
            }
            localObject3 = new ArrayList();
            ((List)localObject3).add(localObject2);
            ((List)localObject3).add(localObject5);
          }
          else
          {
            localObject2 = new ArrayList();
            if (((List)localObject3).size() > 5)
            {
              localObject5 = ((BigDecimal)((List)localObject3).get(3)).subtract((BigDecimal)((List)localObject3).get(0));
              localObject6 = new DecimalFormat("##.#");
              localObject4 = RoundingMode.DOWN;
              ((DecimalFormat)localObject6).setRoundingMode((RoundingMode)localObject4);
              ((List)localObject2).add(Double.valueOf(AFc1uSDK.AFa1wSDK.values(((Format)localObject6).format(localObject5))));
              localObject5 = ((BigDecimal)((List)localObject3).get(4)).subtract((BigDecimal)((List)localObject3).get(1));
              localObject6 = new DecimalFormat("##.#");
              ((DecimalFormat)localObject6).setRoundingMode((RoundingMode)localObject4);
              ((List)localObject2).add(Double.valueOf(AFc1uSDK.AFa1wSDK.values(((Format)localObject6).format(localObject5))));
              localObject6 = ((BigDecimal)((List)localObject3).get(5)).subtract((BigDecimal)((List)localObject3).get(2));
              localObject5 = new DecimalFormat("##.#");
              ((DecimalFormat)localObject5).setRoundingMode((RoundingMode)localObject4);
              ((List)localObject2).add(Double.valueOf(AFc1uSDK.AFa1wSDK.values(((Format)localObject5).format(localObject6))));
            }
            localObject4 = new ArrayList();
            localObject7 = (BigDecimal)((List)localObject3).get(0);
            localObject6 = new DecimalFormat("##.#");
            localObject5 = RoundingMode.DOWN;
            ((DecimalFormat)localObject6).setRoundingMode((RoundingMode)localObject5);
            ((List)localObject4).add(Double.valueOf(AFc1uSDK.AFa1wSDK.values(((Format)localObject6).format(localObject7))));
            localObject6 = (BigDecimal)((List)localObject3).get(1);
            localObject7 = new DecimalFormat("##.#");
            ((DecimalFormat)localObject7).setRoundingMode((RoundingMode)localObject5);
            ((List)localObject4).add(Double.valueOf(AFc1uSDK.AFa1wSDK.values(((Format)localObject7).format(localObject6))));
            localObject3 = (BigDecimal)((List)localObject3).get(2);
            localObject6 = new DecimalFormat("##.#");
            ((DecimalFormat)localObject6).setRoundingMode((RoundingMode)localObject5);
            ((List)localObject4).add(Double.valueOf(AFc1uSDK.AFa1wSDK.values(((Format)localObject6).format(localObject3))));
            localObject3 = new ArrayList();
            ((List)localObject3).add(localObject4);
            ((List)localObject3).add(localObject2);
          }
          localHashMap2.put("v", localObject3);
          localHashMap1.put(valuesintValuevalues, localHashMap2);
          if (localObject1 == AFf1gSDK.AFa1xSDK.values) {
            localHashMap1.put("er", "no_svs");
          }
        }
        else
        {
          localObject1 = new HashMap();
          ((Map)localObject1).put("er", str2);
          break label1183;
        }
      }
      localObject1 = localHashMap1;
      label1183:
      localConcurrentHashMap.put(str1, localObject1);
    }
    else
    {
      localConcurrentHashMap.put("sensors", "na");
    }
    return localConcurrentHashMap;
  }
}

/* Location:
 * Qualified Name:     com.appsflyer.internal.AFf1hSDK
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */