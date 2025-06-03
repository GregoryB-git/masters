package com.appsflyer.internal;

import androidx.annotation.NonNull;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

public final class AFd1fSDK
  extends AFd1hSDK
{
  @NonNull
  private final AFb1dSDK AFLogger$LogLevel;
  public Map<String, Object> AFVersionDeclaration;
  @NonNull
  private final AFe1mSDK afWarnLog;
  @NonNull
  private final AFf1oSDK getLevel;
  @NonNull
  private final AppsFlyerProperties onAppOpenAttributionNative;
  @NonNull
  private final AFb1wSDK onInstallConversionDataLoadedNative;
  
  public AFd1fSDK(@NonNull AFa1qSDK paramAFa1qSDK, @NonNull AFc1xSDK paramAFc1xSDK)
  {
    super(paramAFa1qSDK, paramAFc1xSDK);
    getLevel = paramAFc1xSDK.AFLogger$LogLevel();
    AFLogger$LogLevel = paramAFc1xSDK.values();
    afWarnLog = paramAFc1xSDK.afDebugLog();
    onInstallConversionDataLoadedNative = paramAFc1xSDK.afRDLog();
    onAppOpenAttributionNative = AppsFlyerProperties.getInstance();
    paramAFa1qSDK = AFd1vSDK.AFLogger;
    AFKeystoreWrapper.add(paramAFa1qSDK);
    paramAFa1qSDK = AFd1vSDK.afRDLog;
    AFKeystoreWrapper.add(paramAFa1qSDK);
  }
  
  public final void valueOf(AFa1qSDK paramAFa1qSDK)
  {
    super.valueOf(paramAFa1qSDK);
    int i = AFLogger;
    afWarnLog.AFKeystoreWrapper(i);
    Object localObject1 = (Map)paramAFa1qSDK.valueOf().get("meta");
    Object localObject2 = localObject1;
    if (localObject1 == null)
    {
      localObject2 = new HashMap();
      paramAFa1qSDK.valueOf().put("meta", localObject2);
    }
    Object localObject3 = onInstallConversionDataLoadedNative.AFKeystoreWrapper();
    Object localObject4;
    if (localObject3 != null)
    {
      localObject1 = new HashMap();
      ((Map)localObject1).put("cdn_token", AFInAppEventParameterName);
      localObject4 = AFInAppEventType;
      if (localObject4 != null) {
        ((Map)localObject1).put("c_ver", localObject4);
      }
      long l = AFKeystoreWrapper;
      if (l > 0L) {
        ((Map)localObject1).put("latency", Long.valueOf(l));
      }
      l = valueOf;
      if (l > 0L) {
        ((Map)localObject1).put("delay", Long.valueOf(l));
      }
      j = values;
      if (j > 0) {
        ((Map)localObject1).put("res_code", Integer.valueOf(j));
      }
      if (afDebugLog != null)
      {
        localObject4 = new StringBuilder();
        ((StringBuilder)localObject4).append(afDebugLog.getClass().getSimpleName());
        ((StringBuilder)localObject4).append(": ");
        ((StringBuilder)localObject4).append(afDebugLog.getMessage());
        ((Map)localObject1).put("error", localObject4.toString());
      }
      localObject4 = afInfoLog;
      if (localObject4 != null) {
        ((Map)localObject1).put("sig", localObject4.toString());
      }
      localObject3 = AFLogger;
      if (localObject3 != null) {
        ((Map)localObject1).put("cdn_cache_status", localObject3);
      }
      ((Map)localObject2).put("rc", localObject1);
    }
    int j = 0;
    if (i != 1)
    {
      if (i == 2)
      {
        localObject1 = new HashMap(afWarnLog.AFInAppEventParameterName);
        if (!((Map)localObject1).isEmpty()) {
          ((Map)localObject2).put("first_launch", localObject1);
        }
        afWarnLog.valueOf.AFInAppEventType("first_launch");
      }
    }
    else
    {
      if (onAppOpenAttributionNative.getBoolean("waitForCustomerId", false)) {
        paramAFa1qSDK.valueOf().put("wait_cid", Boolean.toString(true));
      }
      localObject1 = new HashMap(afWarnLog.AFInAppEventType);
      afWarnLog.valueOf.AFInAppEventType("ddl");
      if (!((Map)localObject1).isEmpty()) {
        ((Map)localObject2).put("ddl", localObject1);
      }
      localObject1 = new HashMap(afWarnLog.AFInAppEventParameterName);
      if (!((Map)localObject1).isEmpty()) {
        ((Map)localObject2).put("first_launch", localObject1);
      }
    }
    if (((Map)localObject2).isEmpty()) {
      paramAFa1qSDK.valueOf().remove("meta");
    }
    if (i <= 2)
    {
      localObject4 = new ArrayList();
      localObject3 = getLevel.valueOf();
      int k = localObject3.length;
      while (j < k)
      {
        localObject2 = localObject3[j];
        boolean bool = localObject2 instanceof AFf1qSDK;
        int m = 5.AFKeystoreWrapper[afDebugLog.ordinal()];
        if (m != 1)
        {
          if ((m == 2) && (i == 2) && (!bool))
          {
            localObject1 = new HashMap();
            ((Map)localObject1).put("source", AFKeystoreWrapper);
            ((Map)localObject1).put("response", "TIMEOUT");
            ((Map)localObject1).put("type", afRDLog);
            ((List)localObject4).add(localObject1);
          }
        }
        else
        {
          if (bool)
          {
            paramAFa1qSDK.AFKeystoreWrapper("rfr", valueOf);
            AFLogger$LogLevel.values("newGPReferrerSent", true);
          }
          ((List)localObject4).add(AFInAppEventParameterName);
        }
        j++;
      }
      if (!((List)localObject4).isEmpty()) {
        paramAFa1qSDK.AFKeystoreWrapper("referrers", localObject4);
      }
      localObject2 = AFVersionDeclaration;
      if (localObject2 != null) {
        paramAFa1qSDK.AFKeystoreWrapper("fb_ddl", localObject2);
      }
    }
  }
  
  public final void values()
  {
    super.values();
    AFe1mSDK localAFe1mSDK = afWarnLog;
    int i = afInfoLog.AFLogger;
    long l1 = System.currentTimeMillis();
    if (i == 1)
    {
      long l2 = AFLogger;
      if (l2 != 0L)
      {
        AFInAppEventParameterName.put("net", Long.valueOf(l1 - l2));
        JSONObject localJSONObject = new JSONObject(AFInAppEventParameterName);
        valueOf.AFInAppEventParameterName("first_launch", localJSONObject.toString());
        return;
      }
      AFLogger.afInfoLog("Metrics: launch start ts is missing");
    }
  }
}

/* Location:
 * Qualified Name:     com.appsflyer.internal.AFd1fSDK
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */