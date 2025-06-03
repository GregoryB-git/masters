package com.appsflyer.internal;

import androidx.annotation.NonNull;
import com.appsflyer.deeplink.DeepLinkResult;
import com.appsflyer.deeplink.DeepLinkResult.Error;

public final class AFd1mSDK
  extends AFd1zSDK<DeepLinkResult>
{
  private DeepLinkResult afDebugLog;
  private final AFb1mSDK afInfoLog;
  
  public AFd1mSDK(@NonNull AFb1mSDK paramAFb1mSDK)
  {
    super(AFd1vSDK.afRDLog, new AFd1vSDK[] { AFd1vSDK.values }, "DdlSdk");
    afInfoLog = paramAFb1mSDK;
  }
  
  public final boolean AFInAppEventParameterName()
  {
    return false;
  }
  
  public final long AFInAppEventType()
  {
    return 90000L;
  }
  
  @NonNull
  public final AFd1ySDK valueOf()
  {
    DeepLinkResult localDeepLinkResult = afInfoLog.AFLogger();
    afDebugLog = localDeepLinkResult;
    if (2.values[localDeepLinkResult.getStatus().ordinal()] != 1)
    {
      if (afDebugLog.getError() == DeepLinkResult.Error.TIMEOUT) {
        return AFd1ySDK.AFInAppEventType;
      }
      return AFd1ySDK.valueOf;
    }
    return AFd1ySDK.AFInAppEventParameterName;
  }
}

/* Location:
 * Qualified Name:     com.appsflyer.internal.AFd1mSDK
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */