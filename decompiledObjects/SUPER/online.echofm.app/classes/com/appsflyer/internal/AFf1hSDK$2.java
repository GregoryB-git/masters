package com.appsflyer.internal;

import android.os.Handler;

final class AFf1hSDK$2
  implements Runnable
{
  public AFf1hSDK$2(AFf1hSDK paramAFf1hSDK) {}
  
  public final void run()
  {
    synchronized (AFKeystoreWrapper.valueOf)
    {
      AFf1hSDK localAFf1hSDK = AFKeystoreWrapper;
      Handler localHandler = AFInAppEventParameterName;
      Object localObject2 = new com/appsflyer/internal/AFf1hSDK$3;
      ((AFf1hSDK.3)localObject2).<init>(localAFf1hSDK);
      localHandler.post((Runnable)localObject2);
      localObject2 = AFKeystoreWrapper;
      AFInAppEventParameterName.postDelayed(AFf1hSDK.AFKeystoreWrapper((AFf1hSDK)localObject2), 100L);
      AFKeystoreWrapper.AFKeystoreWrapper = true;
      return;
    }
  }
}

/* Location:
 * Qualified Name:     com.appsflyer.internal.AFf1hSDK.2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */