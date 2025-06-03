package com.appsflyer.internal;

import androidx.annotation.NonNull;
import com.appsflyer.AFLogger;
import java.util.Map;
import org.json.JSONException;

public final class AFe1pSDK
  extends AFd1zSDK<Void>
{
  private final AFc1gSDK<String> afDebugLog;
  private final AFb1dSDK afErrorLog;
  private final Throwable afInfoLog;
  
  public AFe1pSDK(AFd1fSDK paramAFd1fSDK, AFb1dSDK paramAFb1dSDK)
  {
    super(AFd1vSDK.afDebugLog, new AFd1vSDK[] { AFd1vSDK.values }, "GCD-CHECK");
    afInfoLog = paramAFd1fSDK.afDebugLog();
    afDebugLog = afErrorLog;
    afErrorLog = paramAFb1dSDK;
  }
  
  private Map<String, Object> afRDLog()
  {
    Object localObject = afErrorLog.values("attributionId", null);
    if (localObject == null) {
      return null;
    }
    try
    {
      new AFc1rSDK();
      localObject = AFc1rSDK.AFKeystoreWrapper((String)localObject);
      return (Map<String, Object>)localObject;
    }
    catch (JSONException localJSONException)
    {
      localObject = new StringBuilder("[GCD] Failed to parse GCD response: ");
      ((StringBuilder)localObject).append(localJSONException.getMessage());
      AFLogger.afErrorLog(localObject.toString(), localJSONException);
    }
    return null;
  }
  
  public final boolean AFInAppEventParameterName()
  {
    return false;
  }
  
  public final long AFInAppEventType()
  {
    return 1000L;
  }
  
  @NonNull
  public final AFd1ySDK valueOf()
  {
    AFLogger.afDebugLog("[GCD-A01] Loading conversion data. Counter: ".concat(String.valueOf(afErrorLog.values("appsFlyerCount", 0))));
    long l = afErrorLog.valueOf("appsflyerConversionDataCacheExpiration", 0L);
    if ((l != 0L) && (System.currentTimeMillis() - l > 5184000000L))
    {
      AFLogger.afDebugLog("[GCD-E02] Cached conversion data expired");
      afErrorLog.values("sixtyDayConversionData", true);
      afErrorLog.AFInAppEventParameterName("attributionId", null);
      afErrorLog.AFInAppEventParameterName("appsflyerConversionDataCacheExpiration", 0L);
    }
    Map localMap = afRDLog();
    label141:
    StringBuilder localStringBuilder2;
    if (localMap != null)
    {
      try
      {
        if (!localMap.containsKey("is_first_launch")) {
          localMap.put("is_first_launch", Boolean.FALSE);
        }
      }
      catch (Exception localException1)
      {
        break label141;
      }
      AFe1sSDK.values(localException1);
      break label171;
      localStringBuilder2 = new StringBuilder("[GCD] Error executing conversion data callback: ");
      localStringBuilder2.append(localException1.getLocalizedMessage());
      AFLogger.afErrorLog(localStringBuilder2.toString(), localException1);
      label171:
      return AFd1ySDK.AFInAppEventParameterName;
    }
    try
    {
      if (afInfoLog != null)
      {
        StringBuilder localStringBuilder1 = new java/lang/StringBuilder;
        localStringBuilder1.<init>("Launch exception: ");
        localStringBuilder1.append(afInfoLog.getMessage());
        AFe1sSDK.AFInAppEventType(localStringBuilder1.toString());
        return AFd1ySDK.AFInAppEventParameterName;
      }
    }
    catch (Exception localException2)
    {
      break label270;
      Object localObject = afDebugLog;
      if ((localObject != null) && (!((AFc1gSDK)localObject).isSuccessful()))
      {
        localObject = new java/lang/StringBuilder;
        ((StringBuilder)localObject).<init>("Launch status code: ");
        ((StringBuilder)localObject).append(afDebugLog.getStatusCode());
        AFe1sSDK.AFInAppEventType(localObject.toString());
        localObject = AFd1ySDK.AFInAppEventParameterName;
        return (AFd1ySDK)localObject;
        label270:
        localStringBuilder2 = new StringBuilder("[GCD] Error executing conversion data callback: ");
        localStringBuilder2.append(((Throwable)localObject).getLocalizedMessage());
        AFLogger.afErrorLog(localStringBuilder2.toString(), (Throwable)localObject);
      }
    }
    return AFd1ySDK.valueOf;
  }
}

/* Location:
 * Qualified Name:     com.appsflyer.internal.AFe1pSDK
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */