package com.appsflyer.internal;

import androidx.annotation.NonNull;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import java.util.HashMap;
import java.util.Map;

public final class AFd1iSDK
  extends AFd1oSDK<String>
{
  private final Map<String, Object> afInfoLog;
  
  public AFd1iSDK(@NonNull Map<String, Object> paramMap, @NonNull AFc1xSDK paramAFc1xSDK)
  {
    super(localAFd1vSDK1, new AFd1vSDK[] { localAFd1vSDK2 }, paramAFc1xSDK, String.valueOf(i));
    afInfoLog = new HashMap(paramMap);
  }
  
  public final boolean afInfoLog()
  {
    return false;
  }
  
  public final AppsFlyerRequestListener afRDLog()
  {
    return null;
  }
  
  public final AFc1qSDK<String> values(@NonNull String paramString)
  {
    return AFLogger.valueOf(afInfoLog);
  }
}

/* Location:
 * Qualified Name:     com.appsflyer.internal.AFd1iSDK
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */