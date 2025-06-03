package com.facebook.internal.logging.monitor;

import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import org.json.JSONObject;

final class Monitor$1
  implements Runnable
{
  public void run()
  {
    if (CrashShieldHandler.isObjectCrashing(this)) {
      return;
    }
    try
    {
      JSONObject localJSONObject = Monitor.fetchSamplingRate();
      if (localJSONObject != null) {
        Monitor.updateSamplingRateMap(localJSONObject);
      }
      return;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(localThrowable, this);
    }
  }
}

/* Location:
 * Qualified Name:     com.facebook.internal.logging.monitor.Monitor.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */