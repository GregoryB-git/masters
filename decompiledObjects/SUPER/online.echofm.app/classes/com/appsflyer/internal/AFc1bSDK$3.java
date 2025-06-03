package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

final class AFc1bSDK$3
  implements Runnable
{
  public AFc1bSDK$3(AFc1bSDK paramAFc1bSDK, AFd1zSDK paramAFd1zSDK, AFd1ySDK paramAFd1ySDK) {}
  
  public final void run()
  {
    ??? = new StringBuilder("QUEUE: execution finished for ");
    ((StringBuilder)???).append(valueOf);
    ((StringBuilder)???).append(", result: ");
    ((StringBuilder)???).append(AFInAppEventParameterName);
    AFLogger.afDebugLog(???.toString());
    values.afErrorLog.remove(valueOf);
    ??? = values.values.iterator();
    while (((Iterator)???).hasNext()) {
      ((AFc1cSDK)((Iterator)???).next()).AFInAppEventType(valueOf, AFInAppEventParameterName);
    }
    if (AFInAppEventParameterName == AFd1ySDK.AFInAppEventParameterName)
    {
      values.AFInAppEventType.add(valueOf.values);
      AFc1bSDK.AFInAppEventParameterName(values);
      return;
    }
    if (valueOf.AFInAppEventParameterName())
    {
      if (AFc1bSDK.valueOf(valueOf)) {
        synchronized (values.AFLogger)
        {
          values.afDebugLog.add(valueOf);
          Iterator localIterator = values.values.iterator();
          if (localIterator.hasNext()) {
            AFc1cSDK localAFc1cSDK = (AFc1cSDK)localIterator.next();
          }
        }
      }
    }
    else
    {
      values.AFInAppEventType.add(valueOf.values);
      AFc1bSDK.AFInAppEventParameterName(values);
    }
  }
}

/* Location:
 * Qualified Name:     com.appsflyer.internal.AFc1bSDK.3
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */