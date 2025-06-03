package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import java.util.concurrent.TimeUnit;

public final class AFe1zSDK
{
  private static final long AFKeystoreWrapper = TimeUnit.HOURS.toSeconds(24L);
  private final AFb1gSDK AFInAppEventParameterName;
  private final AFb1ySDK values;
  
  public AFe1zSDK(AFb1gSDK paramAFb1gSDK, AFb1ySDK paramAFb1ySDK)
  {
    AFInAppEventParameterName = paramAFb1gSDK;
    values = paramAFb1ySDK;
  }
  
  public final boolean AFInAppEventParameterName()
  {
    if (values.AFInAppEventParameterName == null)
    {
      AFLogger.afInfoLog("CFG: active config is missing - fetching from CDN");
      return true;
    }
    long l = System.currentTimeMillis();
    AFb1ySDK localAFb1ySDK = values;
    return l - valueOf > TimeUnit.SECONDS.toMillis(AFInAppEventType);
  }
  
  public final long AFKeystoreWrapper()
  {
    Object localObject = AFInAppEventParameterName.AFInAppEventType("com.appsflyer.rc.cache.max-age-fallback");
    if (localObject != null) {
      try
      {
        long l = Long.parseLong((String)localObject);
        return l;
      }
      catch (NumberFormatException localNumberFormatException)
      {
        localObject = new StringBuilder("Can't read maxAgeFallback from Manifest: ");
        ((StringBuilder)localObject).append(localNumberFormatException.getMessage());
        AFLogger.afErrorLog(localObject.toString(), localNumberFormatException);
        return AFKeystoreWrapper;
      }
    }
    return AFKeystoreWrapper;
  }
  
  public final boolean valueOf()
  {
    return Boolean.parseBoolean(AFInAppEventParameterName.AFInAppEventType("com.appsflyer.rc.staging"));
  }
  
  public final boolean values()
  {
    return Boolean.parseBoolean(AFInAppEventParameterName.AFInAppEventType("com.appsflyer.rc.sandbox"));
  }
}

/* Location:
 * Qualified Name:     com.appsflyer.internal.AFe1zSDK
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */