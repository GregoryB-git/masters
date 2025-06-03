package com.appsflyer.internal;

import java.util.Map;
import java.util.Observable;
import java.util.concurrent.Executor;

public abstract class AFf1rSDK
  extends AFf1pSDK
{
  public AFf1rSDK(String paramString1, String paramString2, Runnable paramRunnable)
  {
    super(paramString1, paramString2, paramRunnable);
  }
  
  public final void AFInAppEventType(AFb1dSDK paramAFb1dSDK, AFb1hSDK<Map<String, Object>> paramAFb1hSDK)
  {
    if ((AFa1eSDK.valueOf().valueOf(paramAFb1dSDK, false) <= 0) && (paramAFb1hSDK.AFKeystoreWrapper()))
    {
      AFInAppEventType.AFInAppEventType().execute(values);
      afInfoLog = System.currentTimeMillis();
      afDebugLog = AFf1pSDK.AFa1zSDK.AFInAppEventType;
      addObserver(new AFf1pSDK.1(this));
    }
  }
}

/* Location:
 * Qualified Name:     com.appsflyer.internal.AFf1rSDK
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */