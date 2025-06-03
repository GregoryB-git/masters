package com.appsflyer.share;

import android.content.Context;
import androidx.annotation.NonNull;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.internal.AFa1eSDK;
import com.appsflyer.internal.AFc1bSDK;
import com.appsflyer.internal.AFc1bSDK.AnonymousClass4;
import com.appsflyer.internal.AFc1xSDK;
import com.appsflyer.internal.AFd1sSDK;
import com.appsflyer.internal.AFf1bSDK;
import com.appsflyer.internal.AFf1cSDK;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class CrossPromotionHelper {
    private static String AFInAppEventType = "https://%simpression.%s";

    @NonNull
    private static LinkGenerator AFInAppEventParameterName(@NonNull Context context, String str, String str2, Map<String, String> map, String str3) {
        LinkGenerator linkGenerator = new LinkGenerator("af_cross_promotion");
        linkGenerator.AFInAppEventParameterName = str3;
        linkGenerator.AFInAppEventType = str;
        linkGenerator.addParameter("af_siteid", context.getPackageName());
        if (str2 != null) {
            linkGenerator.setCampaign(str2);
        }
        if (map != null) {
            linkGenerator.addParameters(map);
        }
        String string = AppsFlyerProperties.getInstance().getString("advertiserId");
        if (string != null) {
            linkGenerator.addParameter("advertising_id", string);
        }
        return linkGenerator;
    }

    private static void AFInAppEventType(@NonNull String str, @NonNull Context context, AFf1cSDK aFf1cSDK) {
        AFa1eSDK valueOf = AFa1eSDK.valueOf();
        valueOf.AFKeystoreWrapper(context);
        AFc1xSDK AFInAppEventType2 = valueOf.AFInAppEventType();
        AFd1sSDK aFd1sSDK = new AFd1sSDK(AFInAppEventType2, str, aFf1cSDK);
        AFc1bSDK AFVersionDeclaration = AFInAppEventType2.AFVersionDeclaration();
        AFVersionDeclaration.AFKeystoreWrapper.execute(AFVersionDeclaration.new AnonymousClass4(aFd1sSDK));
    }

    public static void logAndOpenStore(@NonNull Context context, String str, String str2) {
        logAndOpenStore(context, str, str2, null);
    }

    public static void logCrossPromoteImpression(@NonNull Context context, String str, String str2) {
        logCrossPromoteImpression(context, str, str2, null);
    }

    public static void setUrl(Map<String, String> map) {
        char c7;
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String value = entry.getValue();
            String key = entry.getKey();
            int hashCode = key.hashCode();
            if (hashCode != 96801) {
                if (hashCode == 120623625 && key.equals("impression")) {
                    c7 = 1;
                }
                c7 = 65535;
            } else {
                if (key.equals("app")) {
                    c7 = 0;
                }
                c7 = 65535;
            }
            if (c7 == 0) {
                AFf1bSDK.valueOf = value;
            } else if (c7 == 1) {
                AFInAppEventType = value;
            }
        }
    }

    public static void logAndOpenStore(@NonNull Context context, String str, String str2, Map<String, String> map) {
        LinkGenerator AFInAppEventParameterName = AFInAppEventParameterName(context, str, str2, map, String.format(AFf1bSDK.valueOf, AppsFlyerLib.getInstance().getHostPrefix(), AFa1eSDK.valueOf().getHostName()));
        if (AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.AF_WAITFOR_CUSTOMERID, false)) {
            AFLogger.afInfoLog("CustomerUserId not set, track And Open Store is disabled", true);
            return;
        }
        if (AppsFlyerLib.getInstance().isStopped()) {
            AFLogger.afInfoLog("SDK is stopped, track And Open Store is disabled", true);
            return;
        }
        if (map == null) {
            map = new HashMap<>();
        }
        map.put("af_campaign", str2);
        AppsFlyerLib.getInstance().logEvent(context, "af_cross_promotion", map);
        AFInAppEventType(AFInAppEventParameterName.generateLink(), context, new AFf1cSDK(context));
    }

    public static void logCrossPromoteImpression(@NonNull Context context, String str, String str2, Map<String, String> map) {
        if (AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.AF_WAITFOR_CUSTOMERID, false)) {
            AFLogger.afInfoLog("CustomerUserId not set, Promote Impression is disabled", true);
        } else if (AppsFlyerLib.getInstance().isStopped()) {
            AFLogger.afInfoLog("SDK is stopped, Promote Impression is disabled", true);
        } else {
            AFInAppEventType(AFInAppEventParameterName(context, str, str2, map, String.format(AFInAppEventType, AppsFlyerLib.getInstance().getHostPrefix(), AFa1eSDK.valueOf().getHostName())).generateLink(), context, null);
        }
    }
}
