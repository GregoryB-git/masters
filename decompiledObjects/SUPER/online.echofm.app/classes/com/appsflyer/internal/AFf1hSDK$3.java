package com.appsflyer.internal;

import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import com.appsflyer.AFLogger;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

final class AFf1hSDK$3
  implements Runnable
{
  public AFf1hSDK$3(AFf1hSDK paramAFf1hSDK) {}
  
  public final void run()
  {
    for (;;)
    {
      try
      {
        Iterator localIterator = AFf1hSDK.values(valueOf).getSensorList(-1).iterator();
        if (!localIterator.hasNext()) {
          break label140;
        }
        Sensor localSensor1 = (Sensor)localIterator.next();
        if (!AFf1hSDK.AFInAppEventType(localSensor1.getType())) {
          continue;
        }
        localObject = new com/appsflyer/internal/AFf1kSDK;
        ((AFf1kSDK)localObject).<init>(localSensor1);
        if (!AFf1hSDK.valueOf(valueOf).containsKey(localObject)) {
          AFf1hSDK.valueOf(valueOf).put(localObject, localObject);
        }
      }
      finally
      {
        break;
      }
      Object localObject = (SensorEventListener)AFf1hSDK.valueOf(valueOf).get(localObject);
      AFf1hSDK.values(valueOf).registerListener((SensorEventListener)localObject, localSensor2, 0, valueOf.AFInAppEventParameterName);
    }
    AFLogger.afErrorLogForExcManagerOnly("registerListeners error", localSensor2);
    label140:
    AFf1hSDK.AFInAppEventType(valueOf, true);
  }
}

/* Location:
 * Qualified Name:     com.appsflyer.internal.AFf1hSDK.3
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */