package com.appsflyer.internal;

import android.content.Context;
import androidx.annotation.NonNull;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import com.appsflyer.internal.components.network.http.exceptions.ParsingException;
import com.appsflyer.share.LinkGenerator;
import com.appsflyer.share.LinkGenerator.ResponseListener;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public final class AFd1rSDK
  extends AFd1oSDK<String>
{
  private final String AFLogger$LogLevel;
  private final String AFVersionDeclaration;
  private final Map<String, String> afErrorLogForExcManagerOnly;
  private final AFb1gSDK afInfoLog;
  private final UUID afWarnLog;
  private final LinkGenerator.ResponseListener getLevel;
  
  public AFd1rSDK(@NonNull AFc1xSDK paramAFc1xSDK, @NonNull UUID paramUUID, @NonNull String paramString1, @NonNull Map<String, String> paramMap, String paramString2, LinkGenerator.ResponseListener paramResponseListener)
  {
    super(localAFd1vSDK1, new AFd1vSDK[] { localAFd1vSDK2 }, paramAFc1xSDK, str);
    afInfoLog = paramAFc1xSDK.AFInAppEventParameterName();
    afWarnLog = paramUUID;
    AFVersionDeclaration = paramString1;
    afErrorLogForExcManagerOnly = new HashMap(paramMap);
    getLevel = paramResponseListener;
    AFLogger$LogLevel = paramString2;
  }
  
  private String AFVersionDeclaration()
  {
    String str = AppsFlyerProperties.getInstance().getString("onelinkDomain");
    Object localObject = afInfoLog.valueOf.AFInAppEventType.getPackageName();
    localObject = new LinkGenerator("af_app_invites").setBaseURL(AFVersionDeclaration, str, (String)localObject).addParameter("af_siteid", (String)localObject).addParameters(afErrorLogForExcManagerOnly);
    AFa1eSDK.valueOf();
    str = AFa1eSDK.AFInAppEventParameterName();
    if (str != null) {
      ((LinkGenerator)localObject).setReferrerCustomerId(str);
    }
    return ((LinkGenerator)localObject).generateLink();
  }
  
  public final long AFInAppEventType()
  {
    return 3000L;
  }
  
  public final boolean afInfoLog()
  {
    return false;
  }
  
  public final AppsFlyerRequestListener afRDLog()
  {
    return null;
  }
  
  public final boolean getLevel()
  {
    return false;
  }
  
  public final AFc1qSDK<String> values(@NonNull String paramString)
  {
    return AFLogger.AFInAppEventType(AFVersionDeclaration, afErrorLogForExcManagerOnly, AFLogger$LogLevel, afWarnLog, paramString);
  }
  
  public final void values()
  {
    super.values();
    LinkGenerator.ResponseListener localResponseListener = getLevel;
    if (localResponseListener != null)
    {
      if (valueOf == AFd1ySDK.AFInAppEventParameterName)
      {
        localObject = afErrorLog;
        if (localObject != null)
        {
          localResponseListener.onResponse((String)((AFc1gSDK)localObject).getBody());
          return;
        }
      }
      Object localObject = afDebugLog();
      if ((localObject instanceof ParsingException))
      {
        if (((ParsingException)localObject).getRawResponse().isSuccessful())
        {
          localResponseListener.onResponseError("Can't parse one link data");
          return;
        }
        localResponseListener.onResponse(AFVersionDeclaration());
        return;
      }
      localResponseListener.onResponse(AFVersionDeclaration());
    }
  }
}

/* Location:
 * Qualified Name:     com.appsflyer.internal.AFd1rSDK
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */