package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.Executor;

public final class AFb1wSDK
  implements AFc1cSDK
{
  private final AFd1cSDK AFInAppEventParameterName;
  public final AFb1ySDK AFInAppEventType;
  private final AFb1gSDK AFKeystoreWrapper;
  private final AFc1oSDK AFLogger;
  private final AFe1zSDK afDebugLog;
  private AFd1dSDK afErrorLog;
  private final AFc1bSDK afInfoLog;
  private AFf1zSDK afRDLog;
  private final AFe1wSDK valueOf;
  private final Object values;
  
  public AFb1wSDK() {}
  
  public AFb1wSDK(AFd1cSDK paramAFd1cSDK, AFb1gSDK paramAFb1gSDK, AFe1wSDK paramAFe1wSDK, AFb1ySDK paramAFb1ySDK, AFc1oSDK paramAFc1oSDK, AFe1zSDK paramAFe1zSDK, AFc1bSDK paramAFc1bSDK)
  {
    values = new Object();
    AFInAppEventParameterName = paramAFd1cSDK;
    AFKeystoreWrapper = paramAFb1gSDK;
    valueOf = paramAFe1wSDK;
    AFInAppEventType = paramAFb1ySDK;
    AFLogger = paramAFc1oSDK;
    afDebugLog = paramAFe1zSDK;
    afInfoLog = paramAFc1bSDK;
    values.add(this);
  }
  
  public static Map<String, String> AFKeystoreWrapper(Map<String, String> paramMap)
  {
    HashMap localHashMap = new HashMap();
    paramMap = paramMap.entrySet().iterator();
    while (paramMap.hasNext())
    {
      Object localObject = (Map.Entry)paramMap.next();
      String str = (String)((Map.Entry)localObject).getKey();
      localObject = (String)((Map.Entry)localObject).getValue();
      try
      {
        localHashMap.put(URLEncoder.encode(str, "utf-8"), URLEncoder.encode((String)localObject, "utf-8"));
      }
      catch (UnsupportedEncodingException localUnsupportedEncodingException)
      {
        AFLogger.afErrorLogForExcManagerOnly("failed to encode map", localUnsupportedEncodingException);
      }
    }
    return localHashMap;
  }
  
  private void AFKeystoreWrapper(AFd1dSDK paramAFd1dSDK, AFd1bSDK paramAFd1bSDK)
  {
    synchronized (values)
    {
      afErrorLog = paramAFd1dSDK;
      if (paramAFd1bSDK != null) {
        paramAFd1bSDK.onRemoteConfigUpdateFinished(paramAFd1dSDK);
      }
      return;
    }
  }
  
  public final void AFInAppEventParameterName(AFd1bSDK paramAFd1bSDK)
  {
    paramAFd1bSDK = new AFd1gSDK(AFInAppEventParameterName, AFKeystoreWrapper, valueOf, AFInAppEventType, AFLogger, afDebugLog, "v1", paramAFd1bSDK);
    AFc1bSDK localAFc1bSDK = afInfoLog;
    AFKeystoreWrapper.execute(new AFc1bSDK.4(localAFc1bSDK, paramAFd1bSDK));
  }
  
  public final void AFInAppEventParameterName(AFd1zSDK<?> arg1)
  {
    if ((??? instanceof AFd1gSDK))
    {
      AFd1gSDK localAFd1gSDK = (AFd1gSDK)???;
      synchronized (values)
      {
        afRDLog = null;
        AFKeystoreWrapper(AFd1dSDK.AFInAppEventParameterName, afInfoLog);
      }
    }
  }
  
  public final void AFInAppEventType(AFd1zSDK<?> paramAFd1zSDK, AFd1ySDK arg2)
  {
    if ((paramAFd1zSDK instanceof AFd1gSDK))
    {
      AFd1gSDK localAFd1gSDK = (AFd1gSDK)paramAFd1zSDK;
      ??? = AFLogger;
      paramAFd1zSDK = ???;
      if (??? == null)
      {
        AFLogger.afWarnLog("CFG: update RC returned null result, something went wrong!");
        paramAFd1zSDK = AFd1dSDK.AFInAppEventParameterName;
      }
      if (paramAFd1zSDK != AFd1dSDK.AFKeystoreWrapper)
      {
        AFf1zSDK localAFf1zSDK = afRDLog;
        synchronized (values)
        {
          afRDLog = localAFf1zSDK;
        }
      }
      AFKeystoreWrapper(paramAFd1zSDK, afInfoLog);
    }
  }
  
  public final AFf1zSDK AFKeystoreWrapper()
  {
    synchronized (values)
    {
      AFf1zSDK localAFf1zSDK = afRDLog;
      afRDLog = null;
      return localAFf1zSDK;
    }
  }
  
  public final void values(AFd1zSDK<?> paramAFd1zSDK) {}
}

/* Location:
 * Qualified Name:     com.appsflyer.internal.AFb1wSDK
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */