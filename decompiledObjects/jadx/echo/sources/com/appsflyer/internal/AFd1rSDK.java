package com.appsflyer.internal;

import androidx.annotation.NonNull;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import com.appsflyer.internal.components.network.http.ResponseNetwork;
import com.appsflyer.internal.components.network.http.exceptions.ParsingException;
import com.appsflyer.share.LinkGenerator;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/* loaded from: classes.dex */
public final class AFd1rSDK extends AFd1oSDK<String> {
    private final String AFLogger$LogLevel;
    private final String AFVersionDeclaration;
    private final Map<String, String> afErrorLogForExcManagerOnly;
    private final AFb1gSDK afInfoLog;
    private final UUID afWarnLog;
    private final LinkGenerator.ResponseListener getLevel;

    public AFd1rSDK(@NonNull AFc1xSDK aFc1xSDK, @NonNull UUID uuid, @NonNull String str, @NonNull Map<String, String> map, String str2, LinkGenerator.ResponseListener responseListener) {
        super(AFd1vSDK.ONELINK, new AFd1vSDK[]{AFd1vSDK.RC_CDN}, aFc1xSDK, uuid.toString());
        this.afInfoLog = aFc1xSDK.AFInAppEventParameterName();
        this.afWarnLog = uuid;
        this.AFVersionDeclaration = str;
        this.afErrorLogForExcManagerOnly = new HashMap(map);
        this.getLevel = responseListener;
        this.AFLogger$LogLevel = str2;
    }

    private String AFVersionDeclaration() {
        String string = AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.ONELINK_DOMAIN);
        String packageName = this.afInfoLog.valueOf.AFInAppEventType.getPackageName();
        LinkGenerator addParameters = new LinkGenerator("af_app_invites").setBaseURL(this.AFVersionDeclaration, string, packageName).addParameter("af_siteid", packageName).addParameters(this.afErrorLogForExcManagerOnly);
        AFa1eSDK.valueOf();
        String AFInAppEventParameterName = AFa1eSDK.AFInAppEventParameterName();
        if (AFInAppEventParameterName != null) {
            addParameters.setReferrerCustomerId(AFInAppEventParameterName);
        }
        return addParameters.generateLink();
    }

    @Override // com.appsflyer.internal.AFd1oSDK, com.appsflyer.internal.AFd1zSDK
    public final long AFInAppEventType() {
        return 3000L;
    }

    @Override // com.appsflyer.internal.AFd1oSDK
    public final boolean afInfoLog() {
        return false;
    }

    @Override // com.appsflyer.internal.AFd1oSDK
    public final AppsFlyerRequestListener afRDLog() {
        return null;
    }

    @Override // com.appsflyer.internal.AFd1oSDK
    public final boolean getLevel() {
        return false;
    }

    @Override // com.appsflyer.internal.AFd1oSDK
    public final AFc1qSDK<String> values(@NonNull String str) {
        return ((AFd1oSDK) this).AFLogger.AFInAppEventType(this.AFVersionDeclaration, this.afErrorLogForExcManagerOnly, this.AFLogger$LogLevel, this.afWarnLog, str);
    }

    @Override // com.appsflyer.internal.AFd1oSDK, com.appsflyer.internal.AFd1zSDK
    public final void values() {
        ResponseNetwork responseNetwork;
        super.values();
        LinkGenerator.ResponseListener responseListener = this.getLevel;
        if (responseListener != null) {
            if (this.valueOf == AFd1ySDK.SUCCESS && (responseNetwork = ((AFd1oSDK) this).afErrorLog) != null) {
                responseListener.onResponse((String) responseNetwork.getBody());
                return;
            }
            Throwable afDebugLog = afDebugLog();
            if (!(afDebugLog instanceof ParsingException)) {
                responseListener.onResponse(AFVersionDeclaration());
            } else if (((ParsingException) afDebugLog).getRawResponse().isSuccessful()) {
                responseListener.onResponseError("Can't parse one link data");
            } else {
                responseListener.onResponse(AFVersionDeclaration());
            }
        }
    }
}
