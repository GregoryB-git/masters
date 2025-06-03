package com.appsflyer.share;

import android.content.Context;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.CreateOneLinkHttpTask.ResponseListener;
import com.appsflyer.internal.AFa1eSDK;
import com.appsflyer.internal.AFb1wSDK;
import com.appsflyer.internal.AFc1bSDK;
import com.appsflyer.internal.AFc1bSDK.4;
import com.appsflyer.internal.AFc1xSDK;
import com.appsflyer.internal.AFd1rSDK;
import com.appsflyer.internal.AFf1bSDK;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;

public class LinkGenerator
{
  String AFInAppEventParameterName;
  String AFInAppEventType;
  private final String AFKeystoreWrapper;
  private String AFLogger;
  private String AFLogger$LogLevel;
  private String AFVersionDeclaration;
  private String afDebugLog;
  private String afErrorLog;
  private String afInfoLog;
  private String afRDLog;
  private final Map<String, String> afWarnLog = new HashMap();
  private String valueOf;
  private String values;
  
  public LinkGenerator(String paramString)
  {
    AFKeystoreWrapper = paramString;
  }
  
  private Map<String, String> values()
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put("pid", AFKeystoreWrapper);
    Object localObject1 = afErrorLog;
    if (localObject1 != null) {
      localHashMap.put("af_referrer_uid", localObject1);
    }
    localObject1 = values;
    if (localObject1 != null) {
      localHashMap.put("af_channel", localObject1);
    }
    localObject1 = AFLogger;
    if (localObject1 != null) {
      localHashMap.put("af_referrer_customer_id", localObject1);
    }
    localObject1 = valueOf;
    if (localObject1 != null) {
      localHashMap.put("c", localObject1);
    }
    localObject1 = afRDLog;
    if (localObject1 != null) {
      localHashMap.put("af_referrer_name", localObject1);
    }
    localObject1 = afInfoLog;
    if (localObject1 != null) {
      localHashMap.put("af_referrer_image_url", localObject1);
    }
    if (AFVersionDeclaration != null)
    {
      localObject2 = new StringBuilder();
      ((StringBuilder)localObject2).append(AFVersionDeclaration);
      String str = afDebugLog;
      if (str != null)
      {
        localObject1 = "";
        afDebugLog = str.replaceFirst("^[/]", "");
        if (!AFVersionDeclaration.endsWith("/")) {
          localObject1 = "/";
        }
        ((StringBuilder)localObject2).append((String)localObject1);
        ((StringBuilder)localObject2).append(afDebugLog);
      }
      localHashMap.put("af_dp", localObject2.toString());
    }
    Object localObject2 = afWarnLog.entrySet().iterator();
    while (((Iterator)localObject2).hasNext())
    {
      localObject1 = (Map.Entry)((Iterator)localObject2).next();
      localHashMap.put((String)((Map.Entry)localObject1).getKey(), (String)((Map.Entry)localObject1).getValue());
    }
    return AFb1wSDK.AFKeystoreWrapper(localHashMap);
  }
  
  public LinkGenerator addParameter(String paramString1, String paramString2)
  {
    afWarnLog.put(paramString1, paramString2);
    return this;
  }
  
  public LinkGenerator addParameters(Map<String, String> paramMap)
  {
    if (paramMap != null) {
      afWarnLog.putAll(paramMap);
    }
    return this;
  }
  
  public String generateLink()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    Object localObject1 = AFInAppEventParameterName;
    if ((localObject1 != null) && (((String)localObject1).startsWith("http"))) {}
    for (localObject1 = AFInAppEventParameterName;; localObject1 = String.format(AFf1bSDK.valueOf, new Object[] { AppsFlyerLib.getInstance().getHostPrefix(), AFa1eSDK.valueOf().getHostName() }))
    {
      localStringBuilder.append((String)localObject1);
      break;
    }
    if (AFInAppEventType != null)
    {
      localStringBuilder.append('/');
      localStringBuilder.append(AFInAppEventType);
    }
    Object localObject2 = values();
    localObject1 = new StringBuilder();
    localObject2 = ((Map)localObject2).entrySet().iterator();
    while (((Iterator)localObject2).hasNext())
    {
      Map.Entry localEntry = (Map.Entry)((Iterator)localObject2).next();
      char c1;
      if (((StringBuilder)localObject1).length() == 0) {
        c1 = '?';
      }
      for (char c2 = c1;; c2 = c1)
      {
        ((StringBuilder)localObject1).append(c2);
        break;
        c1 = '&';
      }
      ((StringBuilder)localObject1).append((String)localEntry.getKey());
      ((StringBuilder)localObject1).append('=');
      ((StringBuilder)localObject1).append((String)localEntry.getValue());
    }
    localStringBuilder.append(localObject1.toString());
    return localStringBuilder.toString();
  }
  
  @Deprecated
  public void generateLink(Context paramContext, final CreateOneLinkHttpTask.ResponseListener paramResponseListener)
  {
    generateLink(paramContext, new ResponseListener()
    {
      public final void onResponse(String paramAnonymousString)
      {
        paramResponseListener.onResponse(paramAnonymousString);
      }
      
      public final void onResponseError(String paramAnonymousString)
      {
        paramResponseListener.onResponseError(paramAnonymousString);
      }
    });
  }
  
  public void generateLink(Context paramContext, ResponseListener paramResponseListener)
  {
    String str1 = AppsFlyerProperties.getInstance().getString("oneLinkSlug");
    String str2 = AFLogger$LogLevel;
    Map localMap = values();
    if (AppsFlyerProperties.getInstance().getBoolean("waitForCustomerId", false))
    {
      AFLogger.afInfoLog("CustomerUserId not set, generate User Invite Link is disabled", true);
      return;
    }
    AFa1eSDK.valueOf().AFKeystoreWrapper(paramContext);
    paramContext = AFa1eSDK.valueOf().AFInAppEventType();
    paramResponseListener = new AFd1rSDK(paramContext, UUID.randomUUID(), str1, localMap, str2, paramResponseListener);
    paramContext = paramContext.AFVersionDeclaration();
    AFKeystoreWrapper.execute(new AFc1bSDK.4(paramContext, paramResponseListener));
  }
  
  public String getBrandDomain()
  {
    return AFLogger$LogLevel;
  }
  
  public String getCampaign()
  {
    return valueOf;
  }
  
  public String getChannel()
  {
    return values;
  }
  
  public String getMediaSource()
  {
    return AFKeystoreWrapper;
  }
  
  public Map<String, String> getUserParams()
  {
    return new HashMap(afWarnLog);
  }
  
  public LinkGenerator setBaseDeeplink(String paramString)
  {
    AFVersionDeclaration = paramString;
    return this;
  }
  
  public LinkGenerator setBaseURL(String paramString1, String paramString2, String paramString3)
  {
    if ((paramString1 != null) && (paramString1.length() > 0)) {
      if (paramString2 != null)
      {
        paramString3 = paramString2;
        if (paramString2.length() >= 5) {}
      }
      else
      {
        paramString3 = "go.onelink.me";
      }
    }
    for (paramString1 = String.format("https://%s/%s", new Object[] { paramString3, paramString1 });; paramString1 = String.format("https://%s/%s", new Object[] { String.format("%sapp.%s", new Object[] { AppsFlyerLib.getInstance().getHostPrefix(), AFa1eSDK.valueOf().getHostName() }), paramString3 }))
    {
      AFInAppEventParameterName = paramString1;
      break;
    }
    return this;
  }
  
  public LinkGenerator setBrandDomain(String paramString)
  {
    AFLogger$LogLevel = paramString;
    return this;
  }
  
  public LinkGenerator setCampaign(String paramString)
  {
    valueOf = paramString;
    return this;
  }
  
  public LinkGenerator setChannel(String paramString)
  {
    values = paramString;
    return this;
  }
  
  public LinkGenerator setDeeplinkPath(String paramString)
  {
    afDebugLog = paramString;
    return this;
  }
  
  public LinkGenerator setReferrerCustomerId(String paramString)
  {
    AFLogger = paramString;
    return this;
  }
  
  public LinkGenerator setReferrerImageURL(String paramString)
  {
    afInfoLog = paramString;
    return this;
  }
  
  public LinkGenerator setReferrerName(String paramString)
  {
    afRDLog = paramString;
    return this;
  }
  
  public LinkGenerator setReferrerUID(String paramString)
  {
    afErrorLog = paramString;
    return this;
  }
  
  public static abstract interface ResponseListener
  {
    public abstract void onResponse(String paramString);
    
    public abstract void onResponseError(String paramString);
  }
}

/* Location:
 * Qualified Name:     com.appsflyer.share.LinkGenerator
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */