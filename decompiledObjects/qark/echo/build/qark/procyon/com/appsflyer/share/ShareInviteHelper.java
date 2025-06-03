// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.appsflyer.share;

import java.util.HashMap;
import com.appsflyer.AFLogger;
import android.text.TextUtils;
import java.util.Map;
import com.appsflyer.internal.AFa1eSDK;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.AppsFlyerLib;
import android.content.Context;

public class ShareInviteHelper
{
    public static LinkGenerator generateInviteUrl(final Context context) {
        final AppsFlyerLib instance = AppsFlyerLib.getInstance();
        final String appsFlyerUID = instance.getAppsFlyerUID(context);
        final String string = AppsFlyerProperties.getInstance().getString("oneLinkSlug");
        final String string2 = AppsFlyerProperties.getInstance().getString("onelinkDomain");
        final AFa1eSDK aFa1eSDK = (AFa1eSDK)instance;
        final LinkGenerator addParameter = new LinkGenerator("af_app_invites").setBaseURL(string, string2, context.getPackageName()).setReferrerUID(appsFlyerUID).setReferrerCustomerId(AFa1eSDK.AFInAppEventParameterName()).addParameter("af_siteid", context.getPackageName());
        final String string3 = AppsFlyerProperties.getInstance().getString("onelinkScheme");
        if (string3 != null && string3.length() > 3) {
            addParameter.setBaseDeeplink(string3);
        }
        return addParameter;
    }
    
    public static void logInvite(final Context context, final String obj, final Map<String, String> map) {
        if (TextUtils.isEmpty((CharSequence)obj)) {
            AFLogger.afWarnLog("[Invite] Cannot report App-Invite with null/empty channel");
            return;
        }
        if (AppsFlyerProperties.getInstance().getBoolean("waitForCustomerId", false)) {
            AFLogger.afInfoLog("CustomerUserId not set, report Invite is disabled", true);
            return;
        }
        final LinkGenerator generateInviteUrl = generateInviteUrl(context);
        generateInviteUrl.addParameters(map);
        AFLogger.afDebugLog("[Invite] Reporting App-Invite via channel: ".concat(String.valueOf(obj)));
        final StringBuilder sb = new StringBuilder("[Invite] Generated URL: ");
        sb.append(generateInviteUrl.generateLink());
        AFLogger.afDebugLog(sb.toString());
        final String mediaSource = generateInviteUrl.getMediaSource();
        String s;
        if ("af_app_invites".equals(mediaSource)) {
            s = "af_invite";
        }
        else {
            s = mediaSource;
            if ("af_user_share".equals(mediaSource)) {
                s = "af_share";
            }
        }
        final HashMap<String, Object> hashMap = new HashMap<String, Object>();
        if (generateInviteUrl.getUserParams() != null) {
            hashMap.putAll((Map<?, ?>)generateInviteUrl.getUserParams());
        }
        hashMap.put("af_channel", obj);
        AppsFlyerLib.getInstance().logEvent(context, s, hashMap);
    }
}
