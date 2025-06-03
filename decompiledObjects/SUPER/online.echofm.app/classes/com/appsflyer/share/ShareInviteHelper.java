package com.appsflyer.share;

import android.content.Context;
import android.text.TextUtils;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.internal.AFa1eSDK;
import java.util.HashMap;
import java.util.Map;

public class ShareInviteHelper
{
  public static LinkGenerator generateInviteUrl(Context paramContext)
  {
    Object localObject1 = AppsFlyerLib.getInstance();
    String str1 = ((AppsFlyerLib)localObject1).getAppsFlyerUID(paramContext);
    String str2 = AppsFlyerProperties.getInstance().getString("oneLinkSlug");
    Object localObject2 = AppsFlyerProperties.getInstance().getString("onelinkDomain");
    localObject1 = (AFa1eSDK)localObject1;
    localObject1 = AFa1eSDK.AFInAppEventParameterName();
    localObject2 = new LinkGenerator("af_app_invites").setBaseURL(str2, (String)localObject2, paramContext.getPackageName()).setReferrerUID(str1).setReferrerCustomerId((String)localObject1).addParameter("af_siteid", paramContext.getPackageName());
    paramContext = AppsFlyerProperties.getInstance().getString("onelinkScheme");
    if ((paramContext != null) && (paramContext.length() > 3)) {
      ((LinkGenerator)localObject2).setBaseDeeplink(paramContext);
    }
    return (LinkGenerator)localObject2;
  }
  
  public static void logInvite(Context paramContext, String paramString, Map<String, String> paramMap)
  {
    if (TextUtils.isEmpty(paramString))
    {
      AFLogger.afWarnLog("[Invite] Cannot report App-Invite with null/empty channel");
      return;
    }
    if (AppsFlyerProperties.getInstance().getBoolean("waitForCustomerId", false))
    {
      AFLogger.afInfoLog("CustomerUserId not set, report Invite is disabled", true);
      return;
    }
    LinkGenerator localLinkGenerator = generateInviteUrl(paramContext);
    localLinkGenerator.addParameters(paramMap);
    AFLogger.afDebugLog("[Invite] Reporting App-Invite via channel: ".concat(String.valueOf(paramString)));
    paramMap = new StringBuilder("[Invite] Generated URL: ");
    paramMap.append(localLinkGenerator.generateLink());
    AFLogger.afDebugLog(paramMap.toString());
    Object localObject = localLinkGenerator.getMediaSource();
    if ("af_app_invites".equals(localObject))
    {
      paramMap = "af_invite";
    }
    else
    {
      paramMap = (Map<String, String>)localObject;
      if ("af_user_share".equals(localObject)) {
        paramMap = "af_share";
      }
    }
    localObject = new HashMap();
    if (localLinkGenerator.getUserParams() != null) {
      ((Map)localObject).putAll(localLinkGenerator.getUserParams());
    }
    ((Map)localObject).put("af_channel", paramString);
    AppsFlyerLib.getInstance().logEvent(paramContext, paramMap, (Map)localObject);
  }
}

/* Location:
 * Qualified Name:     com.appsflyer.share.ShareInviteHelper
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */