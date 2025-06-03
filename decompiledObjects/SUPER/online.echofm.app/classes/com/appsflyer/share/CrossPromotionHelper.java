package com.appsflyer.share;

import android.content.Context;
import androidx.annotation.NonNull;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.internal.AFa1eSDK;
import com.appsflyer.internal.AFc1bSDK;
import com.appsflyer.internal.AFc1bSDK.4;
import com.appsflyer.internal.AFc1xSDK;
import com.appsflyer.internal.AFd1sSDK;
import com.appsflyer.internal.AFf1bSDK;
import com.appsflyer.internal.AFf1cSDK;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.Executor;

public class CrossPromotionHelper
{
  private static String AFInAppEventType = "https://%simpression.%s";
  
  @NonNull
  private static LinkGenerator AFInAppEventParameterName(@NonNull Context paramContext, String paramString1, String paramString2, Map<String, String> paramMap, String paramString3)
  {
    LinkGenerator localLinkGenerator = new LinkGenerator("af_cross_promotion");
    AFInAppEventParameterName = paramString3;
    AFInAppEventType = paramString1;
    localLinkGenerator.addParameter("af_siteid", paramContext.getPackageName());
    if (paramString2 != null) {
      localLinkGenerator.setCampaign(paramString2);
    }
    if (paramMap != null) {
      localLinkGenerator.addParameters(paramMap);
    }
    paramContext = AppsFlyerProperties.getInstance().getString("advertiserId");
    if (paramContext != null) {
      localLinkGenerator.addParameter("advertising_id", paramContext);
    }
    return localLinkGenerator;
  }
  
  private static void AFInAppEventType(@NonNull String paramString, @NonNull Context paramContext, AFf1cSDK paramAFf1cSDK)
  {
    AFa1eSDK localAFa1eSDK = AFa1eSDK.valueOf();
    localAFa1eSDK.AFKeystoreWrapper(paramContext);
    paramContext = localAFa1eSDK.AFInAppEventType();
    paramString = new AFd1sSDK(paramContext, paramString, paramAFf1cSDK);
    paramContext = paramContext.AFVersionDeclaration();
    AFKeystoreWrapper.execute(new AFc1bSDK.4(paramContext, paramString));
  }
  
  public static void logAndOpenStore(@NonNull Context paramContext, String paramString1, String paramString2)
  {
    logAndOpenStore(paramContext, paramString1, paramString2, null);
  }
  
  public static void logAndOpenStore(@NonNull Context paramContext, String paramString1, String paramString2, Map<String, String> paramMap)
  {
    LinkGenerator localLinkGenerator = AFInAppEventParameterName(paramContext, paramString1, paramString2, paramMap, String.format(AFf1bSDK.valueOf, new Object[] { AppsFlyerLib.getInstance().getHostPrefix(), AFa1eSDK.valueOf().getHostName() }));
    if (AppsFlyerProperties.getInstance().getBoolean("waitForCustomerId", false))
    {
      AFLogger.afInfoLog("CustomerUserId not set, track And Open Store is disabled", true);
      return;
    }
    if (AppsFlyerLib.getInstance().isStopped())
    {
      AFLogger.afInfoLog("SDK is stopped, track And Open Store is disabled", true);
      return;
    }
    paramString1 = paramMap;
    if (paramMap == null) {
      paramString1 = new HashMap();
    }
    paramString1.put("af_campaign", paramString2);
    AppsFlyerLib.getInstance().logEvent(paramContext, "af_cross_promotion", paramString1);
    AFInAppEventType(localLinkGenerator.generateLink(), paramContext, new AFf1cSDK(paramContext));
  }
  
  public static void logCrossPromoteImpression(@NonNull Context paramContext, String paramString1, String paramString2)
  {
    logCrossPromoteImpression(paramContext, paramString1, paramString2, null);
  }
  
  public static void logCrossPromoteImpression(@NonNull Context paramContext, String paramString1, String paramString2, Map<String, String> paramMap)
  {
    if (AppsFlyerProperties.getInstance().getBoolean("waitForCustomerId", false))
    {
      AFLogger.afInfoLog("CustomerUserId not set, Promote Impression is disabled", true);
      return;
    }
    if (AppsFlyerLib.getInstance().isStopped())
    {
      AFLogger.afInfoLog("SDK is stopped, Promote Impression is disabled", true);
      return;
    }
    AFInAppEventType(AFInAppEventParameterName(paramContext, paramString1, paramString2, paramMap, String.format(AFInAppEventType, new Object[] { AppsFlyerLib.getInstance().getHostPrefix(), AFa1eSDK.valueOf().getHostName() })).generateLink(), paramContext, null);
  }
  
  public static void setUrl(Map<String, String> paramMap)
  {
    Iterator localIterator = paramMap.entrySet().iterator();
    while (localIterator.hasNext())
    {
      Object localObject = (Map.Entry)localIterator.next();
      paramMap = (String)((Map.Entry)localObject).getValue();
      localObject = (String)((Map.Entry)localObject).getKey();
      int i = localObject.hashCode();
      if (i != 96801)
      {
        if ((i == 120623625) && (localObject.equals("impression")))
        {
          i = 1;
          break label101;
        }
      }
      else if (localObject.equals("app"))
      {
        i = 0;
        break label101;
      }
      i = -1;
      label101:
      if (i != 0)
      {
        if (i == 1) {
          AFInAppEventType = paramMap;
        }
      }
      else {
        AFf1bSDK.valueOf = paramMap;
      }
    }
  }
}

/* Location:
 * Qualified Name:     com.appsflyer.share.CrossPromotionHelper
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */