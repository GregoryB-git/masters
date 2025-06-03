package com.appsflyer.internal;

import android.hardware.SensorManager;
import com.appsflyer.AFLogger;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

final class AFf1hSDK$5
  implements Runnable
{
  public AFf1hSDK$5(AFf1hSDK paramAFf1hSDK) {}
  
  public final void run()
  {
    try
    {
      if (!AFf1hSDK.valueOf(valueOf).isEmpty())
      {
        Iterator localIterator = AFf1hSDK.valueOf(valueOf).values().iterator();
        while (localIterator.hasNext())
        {
          AFf1kSDK localAFf1kSDK = (AFf1kSDK)localIterator.next();
          AFf1hSDK.values(valueOf).unregisterListener(localAFf1kSDK);
          localAFf1kSDK.valueOf(AFf1hSDK.AFInAppEventParameterName(valueOf), true);
        }
      }
      return;
    }
    finally
    {
      AFLogger.afErrorLogForExcManagerOnly("error while unregistering listeners", localThrowable);
      AFf1hSDK.AFKeystoreWrapper(valueOf, 0);
      AFf1hSDK.AFInAppEventType(valueOf, false);
    }
  }
}

/* Location:
 * Qualified Name:     com.appsflyer.internal.AFf1hSDK.5
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */