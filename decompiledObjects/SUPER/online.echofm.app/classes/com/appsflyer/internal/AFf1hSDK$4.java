package com.appsflyer.internal;

import android.os.Handler;

final class AFf1hSDK$4
  implements Runnable
{
  public AFf1hSDK$4(AFf1hSDK paramAFf1hSDK) {}
  
  public final void run()
  {
    synchronized (AFInAppEventParameterName.valueOf)
    {
      Object localObject2 = AFInAppEventParameterName;
      if (AFKeystoreWrapper)
      {
        AFInAppEventParameterName.removeCallbacks(values);
        localObject2 = AFInAppEventParameterName;
        AFInAppEventParameterName.removeCallbacks(AFInAppEventType);
        AFf1hSDK localAFf1hSDK = AFInAppEventParameterName;
        localObject2 = AFInAppEventParameterName;
        AFf1hSDK.5 local5 = new com/appsflyer/internal/AFf1hSDK$5;
        local5.<init>(localAFf1hSDK);
        ((Handler)localObject2).post(local5);
        AFInAppEventParameterName.AFKeystoreWrapper = false;
      }
    }
    return;
    throw ((Throwable)localObject3);
  }
}

/* Location:
 * Qualified Name:     com.appsflyer.internal.AFf1hSDK.4
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */