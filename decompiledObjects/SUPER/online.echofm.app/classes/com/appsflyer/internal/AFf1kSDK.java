package com.appsflyer.internal;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.os.Looper;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public final class AFf1kSDK
  implements SensorEventListener
{
  private final long[] AFInAppEventParameterName = new long[2];
  @NonNull
  private final String AFInAppEventType;
  @NonNull
  private final String AFKeystoreWrapper;
  private final int AFLogger;
  private long afDebugLog;
  private double afErrorLog;
  private Executor afRDLog;
  private final int valueOf;
  private final float[][] values = new float[2][];
  
  public AFf1kSDK(Sensor paramSensor)
  {
    int i = paramSensor.getType();
    valueOf = i;
    String str1 = paramSensor.getName();
    String str2 = "";
    String str3 = str1;
    if (str1 == null) {
      str3 = "";
    }
    AFInAppEventType = str3;
    paramSensor = paramSensor.getVendor();
    if (paramSensor == null) {
      paramSensor = str2;
    }
    AFKeystoreWrapper = paramSensor;
    AFLogger = (((i + 31) * 31 + str3.hashCode()) * 31 + paramSensor.hashCode());
  }
  
  @NonNull
  private Executor AFInAppEventParameterName()
  {
    try
    {
      if (afRDLog == null) {
        afRDLog = Executors.newSingleThreadExecutor();
      }
    }
    finally
    {
      break label32;
    }
    Executor localExecutor = afRDLog;
    return localExecutor;
    label32:
    throw localExecutor;
  }
  
  @NonNull
  private static List<Float> AFInAppEventType(@NonNull float[] paramArrayOfFloat)
  {
    ArrayList localArrayList = new ArrayList(paramArrayOfFloat.length);
    int i = paramArrayOfFloat.length;
    for (int j = 0; j < i; j++) {
      localArrayList.add(Float.valueOf(paramArrayOfFloat[j]));
    }
    return localArrayList;
  }
  
  private static double AFKeystoreWrapper(@NonNull float[] paramArrayOfFloat1, @NonNull float[] paramArrayOfFloat2)
  {
    int i = Math.min(paramArrayOfFloat1.length, paramArrayOfFloat2.length);
    double d = 0.0D;
    for (int j = 0; j < i; j++) {
      d += StrictMath.pow(paramArrayOfFloat1[j] - paramArrayOfFloat2[j], 2.0D);
    }
    return Math.sqrt(d);
  }
  
  private boolean AFKeystoreWrapper()
  {
    return values[0] != null;
  }
  
  private boolean AFKeystoreWrapper(int paramInt, @NonNull String paramString1, @NonNull String paramString2)
  {
    return (valueOf == paramInt) && (AFInAppEventType.equals(paramString1)) && (AFKeystoreWrapper.equals(paramString2));
  }
  
  @NonNull
  private Map<String, Object> values()
  {
    ConcurrentHashMap localConcurrentHashMap = new ConcurrentHashMap(7);
    localConcurrentHashMap.put("sT", Integer.valueOf(valueOf));
    localConcurrentHashMap.put("sN", AFInAppEventType);
    localConcurrentHashMap.put("sV", AFKeystoreWrapper);
    float[] arrayOfFloat = values[0];
    if (arrayOfFloat != null) {
      localConcurrentHashMap.put("sVS", AFInAppEventType(arrayOfFloat));
    }
    arrayOfFloat = values[1];
    if (arrayOfFloat != null) {
      localConcurrentHashMap.put("sVE", AFInAppEventType(arrayOfFloat));
    }
    return localConcurrentHashMap;
  }
  
  private void values(SensorEvent paramSensorEvent)
  {
    long l1 = timestamp;
    float[] arrayOfFloat = values;
    long l2 = System.currentTimeMillis();
    Object localObject = values;
    paramSensorEvent = localObject[0];
    if (paramSensorEvent == null)
    {
      localObject[0] = Arrays.copyOf(arrayOfFloat, arrayOfFloat.length);
      AFInAppEventParameterName[0] = l2;
      return;
    }
    localObject = localObject[1];
    if (localObject == null)
    {
      arrayOfFloat = Arrays.copyOf(arrayOfFloat, arrayOfFloat.length);
      values[1] = arrayOfFloat;
      AFInAppEventParameterName[1] = l2;
      afErrorLog = AFKeystoreWrapper(paramSensorEvent, arrayOfFloat);
      return;
    }
    if (50000000L <= l1 - afDebugLog)
    {
      afDebugLog = l1;
      if (Arrays.equals((float[])localObject, arrayOfFloat))
      {
        AFInAppEventParameterName[1] = l2;
        return;
      }
      double d = AFKeystoreWrapper(paramSensorEvent, arrayOfFloat);
      if (d > afErrorLog)
      {
        values[1] = Arrays.copyOf(arrayOfFloat, arrayOfFloat.length);
        AFInAppEventParameterName[1] = l2;
        afErrorLog = d;
      }
    }
  }
  
  public final boolean equals(Object paramObject)
  {
    if (paramObject == this) {
      return true;
    }
    if ((paramObject instanceof AFf1kSDK))
    {
      paramObject = (AFf1kSDK)paramObject;
      return AFKeystoreWrapper(valueOf, AFInAppEventType, AFKeystoreWrapper);
    }
    return false;
  }
  
  public final int hashCode()
  {
    return AFLogger;
  }
  
  public final void onAccuracyChanged(Sensor paramSensor, int paramInt) {}
  
  public final void onSensorChanged(SensorEvent paramSensorEvent)
  {
    if (Looper.myLooper() == Looper.getMainLooper())
    {
      AFInAppEventParameterName().execute(new v(this, paramSensorEvent));
      return;
    }
    values(paramSensorEvent);
  }
  
  public final void valueOf(@NonNull Map<AFf1kSDK, Map<String, Object>> paramMap, boolean paramBoolean)
  {
    if (AFKeystoreWrapper())
    {
      paramMap.put(this, values());
      if (paramBoolean)
      {
        int i = values.length;
        int j = 0;
        for (int k = 0; k < i; k++) {
          values[k] = null;
        }
        i = AFInAppEventParameterName.length;
        for (k = j; k < i; k++) {
          AFInAppEventParameterName[k] = 0L;
        }
        afErrorLog = 0.0D;
        afDebugLog = 0L;
      }
    }
    else if (!paramMap.containsKey(this))
    {
      paramMap.put(this, values());
    }
  }
}

/* Location:
 * Qualified Name:     com.appsflyer.internal.AFf1kSDK
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */