package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Map;

final class AFa1eSDK$2
  implements AFa1uSDK.AFa1zSDK
{
  public AFa1eSDK$2(AFa1eSDK paramAFa1eSDK, long paramLong) {}
  
  public final void AFKeystoreWrapper(String paramString)
  {
    AFa1eSDK.values(valueOf).put("error", paramString);
  }
  
  public final void valueOf(String paramString1, String paramString2, String paramString3)
  {
    if (paramString1 != null)
    {
      AFLogger.afInfoLog("Facebook Deferred AppLink data received: ".concat(paramString1));
      AFa1eSDK.values(valueOf).put("link", paramString1);
      if (paramString2 != null) {
        AFa1eSDK.values(valueOf).put("target_url", paramString2);
      }
      if (paramString3 != null)
      {
        paramString2 = new HashMap();
        paramString1 = new HashMap();
        paramString1.put("promo_code", paramString3);
        paramString2.put("deeplink_context", paramString1);
        AFa1eSDK.values(valueOf).put("extras", paramString2);
      }
    }
    else
    {
      AFa1eSDK.values(valueOf).put("link", "");
    }
    long l1 = System.currentTimeMillis();
    long l2 = AFKeystoreWrapper;
    AFa1eSDK.values(valueOf).put("ttr", String.valueOf(l1 - l2));
  }
}

/* Location:
 * Qualified Name:     com.appsflyer.internal.AFa1eSDK.2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */