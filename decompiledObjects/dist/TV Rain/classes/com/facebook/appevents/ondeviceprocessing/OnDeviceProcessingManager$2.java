package com.facebook.appevents.ondeviceprocessing;

import com.facebook.appevents.AppEvent;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import java.util.Arrays;

final class OnDeviceProcessingManager$2
  implements Runnable
{
  public OnDeviceProcessingManager$2(String paramString, AppEvent paramAppEvent) {}
  
  public void run()
  {
    if (CrashShieldHandler.isObjectCrashing(this)) {
      return;
    }
    try
    {
      RemoteServiceWrapper.sendCustomEvents(val$applicationId, Arrays.asList(new AppEvent[] { val$event }));
      return;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(localThrowable, this);
    }
  }
}

/* Location:
 * Qualified Name:     com.facebook.appevents.ondeviceprocessing.OnDeviceProcessingManager.2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */