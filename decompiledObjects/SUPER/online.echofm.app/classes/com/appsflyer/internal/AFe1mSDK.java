package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import com.appsflyer.deeplink.DeepLinkResult;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

public final class AFe1mSDK
{
  public final Map<String, Object> AFInAppEventParameterName;
  public final Map<String, Object> AFInAppEventType;
  public final Map<String, Object> AFKeystoreWrapper;
  public long AFLogger;
  public long AFVersionDeclaration;
  public final long[] afDebugLog;
  public long afErrorLog;
  public final long[] afInfoLog;
  public final long[] afRDLog;
  public long afWarnLog;
  public final AFb1dSDK valueOf;
  public long values;
  
  public AFe1mSDK(AFb1dSDK paramAFb1dSDK)
  {
    ConcurrentHashMap localConcurrentHashMap1 = new ConcurrentHashMap();
    AFInAppEventParameterName = localConcurrentHashMap1;
    ConcurrentHashMap localConcurrentHashMap2 = new ConcurrentHashMap();
    AFInAppEventType = localConcurrentHashMap2;
    ConcurrentHashMap localConcurrentHashMap3 = new ConcurrentHashMap();
    AFKeystoreWrapper = localConcurrentHashMap3;
    values = 0L;
    afErrorLog = 0L;
    afDebugLog = new long[2];
    afInfoLog = new long[2];
    afRDLog = new long[2];
    AFLogger = 0L;
    AFVersionDeclaration = 0L;
    valueOf = paramAFb1dSDK;
    localConcurrentHashMap1.putAll(values("first_launch"));
    localConcurrentHashMap2.putAll(values("ddl"));
    localConcurrentHashMap3.putAll(values("gcd"));
    afWarnLog = paramAFb1dSDK.valueOf("prev_session_dur", 0L);
  }
  
  private Map<String, Object> values(String paramString)
  {
    Map localMap = Collections.emptyMap();
    String str = valueOf.values(paramString, null);
    paramString = localMap;
    if (str != null) {
      try
      {
        paramString = new org/json/JSONObject;
        paramString.<init>(str);
        paramString = AFa1rSDK.valueOf(paramString);
      }
      catch (Exception paramString)
      {
        AFLogger.afErrorLog("Error while parsing cached json data", paramString, true);
        paramString = localMap;
      }
    }
    return paramString;
  }
  
  public final void AFKeystoreWrapper(int paramInt)
  {
    long l1 = System.currentTimeMillis();
    AFLogger = l1;
    if (paramInt == 1)
    {
      long l2 = afErrorLog;
      if (l2 != 0L)
      {
        AFInAppEventParameterName.put("from_fg", Long.valueOf(l1 - l2));
        JSONObject localJSONObject = new JSONObject(AFInAppEventParameterName);
        valueOf.AFInAppEventParameterName("first_launch", localJSONObject.toString());
        return;
      }
      AFLogger.afInfoLog("Metrics: fg ts is missing");
    }
  }
  
  public final void AFKeystoreWrapper(AFe1tSDK paramAFe1tSDK)
  {
    if (valueOf())
    {
      AFInAppEventParameterName.put("start_with", paramAFe1tSDK.toString());
      paramAFe1tSDK = new JSONObject(AFInAppEventParameterName);
      valueOf.AFInAppEventParameterName("first_launch", paramAFe1tSDK.toString());
    }
  }
  
  public final boolean valueOf()
  {
    return valueOf.values("appsFlyerCount", 0) == 0;
  }
  
  public final void values()
  {
    afErrorLog = System.currentTimeMillis();
    if (valueOf())
    {
      long l = values;
      if (l != 0L)
      {
        AFInAppEventParameterName.put("init_to_fg", Long.valueOf(afErrorLog - l));
        JSONObject localJSONObject = new JSONObject(AFInAppEventParameterName);
        valueOf.AFInAppEventParameterName("first_launch", localJSONObject.toString());
        return;
      }
      AFLogger.afInfoLog("Metrics: init ts is missing");
    }
  }
  
  public final void values(int paramInt)
  {
    long l1 = System.currentTimeMillis();
    long l2 = AFVersionDeclaration;
    if (l2 != 0L) {
      AFKeystoreWrapper.put("net", Long.valueOf(l1 - l2));
    } else {
      AFLogger.afInfoLog("Metrics: gcdStart ts is missing");
    }
    AFKeystoreWrapper.put("retries", Integer.valueOf(paramInt));
    JSONObject localJSONObject = new JSONObject(AFKeystoreWrapper);
    valueOf.AFInAppEventParameterName("gcd", localJSONObject.toString());
  }
  
  public final void values(DeepLinkResult paramDeepLinkResult, long paramLong)
  {
    AFInAppEventType.put("status", paramDeepLinkResult.getStatus().toString());
    AFInAppEventType.put("timeout_value", Long.valueOf(paramLong));
    paramDeepLinkResult = new JSONObject(AFInAppEventType);
    valueOf.AFInAppEventParameterName("ddl", paramDeepLinkResult.toString());
  }
}

/* Location:
 * Qualified Name:     com.appsflyer.internal.AFe1mSDK
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */