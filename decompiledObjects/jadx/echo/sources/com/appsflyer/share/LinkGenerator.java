package com.appsflyer.share;

import android.content.Context;
import com.appsflyer.AFInAppEventParameterName;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.CreateOneLinkHttpTask;
import com.appsflyer.internal.AFa1eSDK;
import com.appsflyer.internal.AFb1wSDK;
import com.appsflyer.internal.AFc1bSDK;
import com.appsflyer.internal.AFc1bSDK.AnonymousClass4;
import com.appsflyer.internal.AFc1xSDK;
import com.appsflyer.internal.AFd1rSDK;
import com.appsflyer.internal.AFf1bSDK;
import j3.C1373c;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/* loaded from: classes.dex */
public class LinkGenerator {
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

    public interface ResponseListener {
        void onResponse(String str);

        void onResponseError(String str);
    }

    public LinkGenerator(String str) {
        this.AFKeystoreWrapper = str;
    }

    private Map<String, String> values() {
        HashMap hashMap = new HashMap();
        hashMap.put("pid", this.AFKeystoreWrapper);
        String str = this.afErrorLog;
        if (str != null) {
            hashMap.put("af_referrer_uid", str);
        }
        String str2 = this.values;
        if (str2 != null) {
            hashMap.put(AFInAppEventParameterName.AF_CHANNEL, str2);
        }
        String str3 = this.AFLogger;
        if (str3 != null) {
            hashMap.put("af_referrer_customer_id", str3);
        }
        String str4 = this.valueOf;
        if (str4 != null) {
            hashMap.put(C1373c.f15449d, str4);
        }
        String str5 = this.afRDLog;
        if (str5 != null) {
            hashMap.put("af_referrer_name", str5);
        }
        String str6 = this.afInfoLog;
        if (str6 != null) {
            hashMap.put("af_referrer_image_url", str6);
        }
        if (this.AFVersionDeclaration != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.AFVersionDeclaration);
            String str7 = this.afDebugLog;
            if (str7 != null) {
                this.afDebugLog = str7.replaceFirst("^[/]", "");
                sb.append(this.AFVersionDeclaration.endsWith("/") ? "" : "/");
                sb.append(this.afDebugLog);
            }
            hashMap.put("af_dp", sb.toString());
        }
        for (Map.Entry<String, String> entry : this.afWarnLog.entrySet()) {
            hashMap.put(entry.getKey(), entry.getValue());
        }
        return AFb1wSDK.AFKeystoreWrapper(hashMap);
    }

    public LinkGenerator addParameter(String str, String str2) {
        this.afWarnLog.put(str, str2);
        return this;
    }

    public LinkGenerator addParameters(Map<String, String> map) {
        if (map != null) {
            this.afWarnLog.putAll(map);
        }
        return this;
    }

    public String generateLink() {
        StringBuilder sb = new StringBuilder();
        String str = this.AFInAppEventParameterName;
        sb.append((str == null || !str.startsWith("http")) ? String.format(AFf1bSDK.valueOf, AppsFlyerLib.getInstance().getHostPrefix(), AFa1eSDK.valueOf().getHostName()) : this.AFInAppEventParameterName);
        if (this.AFInAppEventType != null) {
            sb.append('/');
            sb.append(this.AFInAppEventType);
        }
        Map<String, String> values = values();
        StringBuilder sb2 = new StringBuilder();
        for (Map.Entry<String, String> entry : values.entrySet()) {
            sb2.append(sb2.length() == 0 ? '?' : '&');
            sb2.append(entry.getKey());
            sb2.append('=');
            sb2.append(entry.getValue());
        }
        sb.append(sb2.toString());
        return sb.toString();
    }

    public String getBrandDomain() {
        return this.AFLogger$LogLevel;
    }

    public String getCampaign() {
        return this.valueOf;
    }

    public String getChannel() {
        return this.values;
    }

    public String getMediaSource() {
        return this.AFKeystoreWrapper;
    }

    public Map<String, String> getUserParams() {
        return new HashMap(this.afWarnLog);
    }

    public LinkGenerator setBaseDeeplink(String str) {
        this.AFVersionDeclaration = str;
        return this;
    }

    public LinkGenerator setBaseURL(String str, String str2, String str3) {
        String format;
        if (str == null || str.length() <= 0) {
            format = String.format("https://%s/%s", String.format("%sapp.%s", AppsFlyerLib.getInstance().getHostPrefix(), AFa1eSDK.valueOf().getHostName()), str3);
        } else {
            if (str2 == null || str2.length() < 5) {
                str2 = "go.onelink.me";
            }
            format = String.format("https://%s/%s", str2, str);
        }
        this.AFInAppEventParameterName = format;
        return this;
    }

    public LinkGenerator setBrandDomain(String str) {
        this.AFLogger$LogLevel = str;
        return this;
    }

    public LinkGenerator setCampaign(String str) {
        this.valueOf = str;
        return this;
    }

    public LinkGenerator setChannel(String str) {
        this.values = str;
        return this;
    }

    public LinkGenerator setDeeplinkPath(String str) {
        this.afDebugLog = str;
        return this;
    }

    public LinkGenerator setReferrerCustomerId(String str) {
        this.AFLogger = str;
        return this;
    }

    public LinkGenerator setReferrerImageURL(String str) {
        this.afInfoLog = str;
        return this;
    }

    public LinkGenerator setReferrerName(String str) {
        this.afRDLog = str;
        return this;
    }

    public LinkGenerator setReferrerUID(String str) {
        this.afErrorLog = str;
        return this;
    }

    @Deprecated
    public void generateLink(Context context, final CreateOneLinkHttpTask.ResponseListener responseListener) {
        generateLink(context, new ResponseListener() { // from class: com.appsflyer.share.LinkGenerator.3
            @Override // com.appsflyer.share.LinkGenerator.ResponseListener
            public final void onResponse(String str) {
                responseListener.onResponse(str);
            }

            @Override // com.appsflyer.share.LinkGenerator.ResponseListener
            public final void onResponseError(String str) {
                responseListener.onResponseError(str);
            }
        });
    }

    public void generateLink(Context context, ResponseListener responseListener) {
        String string = AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.ONELINK_ID);
        String str = this.AFLogger$LogLevel;
        Map<String, String> values = values();
        if (AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.AF_WAITFOR_CUSTOMERID, false)) {
            AFLogger.afInfoLog("CustomerUserId not set, generate User Invite Link is disabled", true);
            return;
        }
        AFa1eSDK.valueOf().AFKeystoreWrapper(context);
        AFc1xSDK AFInAppEventType = AFa1eSDK.valueOf().AFInAppEventType();
        AFd1rSDK aFd1rSDK = new AFd1rSDK(AFInAppEventType, UUID.randomUUID(), string, values, str, responseListener);
        AFc1bSDK AFVersionDeclaration = AFInAppEventType.AFVersionDeclaration();
        AFVersionDeclaration.AFKeystoreWrapper.execute(AFVersionDeclaration.new AnonymousClass4(aFd1rSDK));
    }
}
