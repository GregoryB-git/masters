package com.appsflyer.internal;

import android.os.Handler;

final class AFf1hSDK$1
  implements Runnable
{
  public AFf1hSDK$1(AFf1hSDK paramAFf1hSDK) {}
  
  public final void run()
  {
    synchronized (AFInAppEventType.valueOf)
    {
      if (AFf1hSDK.AFInAppEventType(AFInAppEventType) == 0) {
        AFf1hSDK.AFKeystoreWrapper(AFInAppEventType, 1);
      }
    }
    localAFf1hSDK = AFInAppEventType;
    AFInAppEventParameterName.postDelayed(AFInAppEventType, AFf1hSDK.AFInAppEventType(localAFf1hSDK) * 500L);
  }
}

/* Location:
 * Qualified Name:     com.appsflyer.internal.AFf1hSDK.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */