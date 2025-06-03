package com.appsflyer.internal;

import com.appsflyer.deeplink.DeepLinkResult.Error;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

final class AFa1eSDK$4
  implements AFd1nSDK.AFa1xSDK
{
  public AFa1eSDK$4(AFa1eSDK paramAFa1eSDK, Map paramMap) {}
  
  public final void AFKeystoreWrapper(String paramString)
  {
    AFInAppEventParameterName.AFInAppEventType().AppsFlyer2dXConversionCallback().AFKeystoreWrapper(paramString, DeepLinkResult.Error.NETWORK);
  }
  
  public final void values(Map<String, String> paramMap)
  {
    Iterator localIterator = paramMap.keySet().iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      valueOf.put(str, (String)paramMap.get(str));
    }
    AFInAppEventParameterName.AFInAppEventType().AppsFlyer2dXConversionCallback().AFInAppEventType(valueOf);
  }
}

/* Location:
 * Qualified Name:     com.appsflyer.internal.AFa1eSDK.4
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */