/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.text.TextUtils
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.HashMap
 *  java.util.Map
 */
package com.appsflyer.share;

import android.content.Context;
import android.text.TextUtils;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.internal.AFa1eSDK;
import com.appsflyer.share.LinkGenerator;
import java.util.HashMap;
import java.util.Map;

public class ShareInviteHelper {
    public static LinkGenerator generateInviteUrl(Context object) {
        Object object2 = AppsFlyerLib.getInstance();
        String string2 = object2.getAppsFlyerUID((Context)object);
        String string3 = AppsFlyerProperties.getInstance().getString("oneLinkSlug");
        String string4 = AppsFlyerProperties.getInstance().getString("onelinkDomain");
        object2 = (AFa1eSDK)object2;
        object2 = AFa1eSDK.AFInAppEventParameterName();
        object = new LinkGenerator("af_app_invites").setBaseURL(string3, string4, object.getPackageName()).setReferrerUID(string2).setReferrerCustomerId((String)object2).addParameter("af_siteid", object.getPackageName());
        string2 = AppsFlyerProperties.getInstance().getString("onelinkScheme");
        if (string2 != null && string2.length() > 3) {
            object.setBaseDeeplink(string2);
        }
        return object;
    }

    public static void logInvite(Context context, String string2, Map<String, String> object) {
        if (TextUtils.isEmpty((CharSequence)string2)) {
            AFLogger.afWarnLog("[Invite] Cannot report App-Invite with null/empty channel");
            return;
        }
        if (AppsFlyerProperties.getInstance().getBoolean("waitForCustomerId", false)) {
            AFLogger.afInfoLog("CustomerUserId not set, report Invite is disabled", true);
            return;
        }
        LinkGenerator linkGenerator = ShareInviteHelper.generateInviteUrl(context);
        linkGenerator.addParameters((Map<String, String>)object);
        AFLogger.afDebugLog("[Invite] Reporting App-Invite via channel: ".concat(String.valueOf((Object)string2)));
        object = new StringBuilder("[Invite] Generated URL: ");
        object.append(linkGenerator.generateLink());
        AFLogger.afDebugLog(object.toString());
        String string3 = linkGenerator.getMediaSource();
        if ("af_app_invites".equals((Object)string3)) {
            object = "af_invite";
        } else {
            object = string3;
            if ("af_user_share".equals((Object)string3)) {
                object = "af_share";
            }
        }
        string3 = new HashMap();
        if (linkGenerator.getUserParams() != null) {
            string3.putAll(linkGenerator.getUserParams());
        }
        string3.put((Object)"af_channel", (Object)string2);
        AppsFlyerLib.getInstance().logEvent(context, (String)object, (Map<String, Object>)string3);
    }
}

