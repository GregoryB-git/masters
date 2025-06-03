package com.appsflyer.internal;

import com.appsflyer.AFLogger;

public abstract class AFf1uSDK
  extends AFf1pSDK
{
  public AFf1uSDK(String paramString1, String paramString2, Runnable paramRunnable)
  {
    super(paramString1, paramString2, paramRunnable);
  }
  
  public static boolean valueOf()
  {
    AFb1dSDK localAFb1dSDK = AFa1eSDK.valueOf().AFInAppEventType().values();
    if (AFa1eSDK.valueOf().valueOf(localAFb1dSDK, false) > 0)
    {
      AFLogger.afRDLog("Install referrer will not load, the counter > 1, ");
      return false;
    }
    return true;
  }
}

/* Location:
 * Qualified Name:     com.appsflyer.internal.AFf1uSDK
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */