// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.appsflyer.internal;

import com.appsflyer.internal.components.network.http.exceptions.ParsingException;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import com.appsflyer.AppsFlyerProperties;
import java.util.HashMap;
import androidx.annotation.NonNull;
import com.appsflyer.share.LinkGenerator;
import java.util.UUID;
import java.util.Map;

public final class AFd1rSDK extends AFd1oSDK<String>
{
    private final String AFLogger$LogLevel;
    private final String AFVersionDeclaration;
    private final Map<String, String> afErrorLogForExcManagerOnly;
    private final AFb1gSDK afInfoLog;
    private final UUID afWarnLog;
    private final LinkGenerator.ResponseListener getLevel;
    
    public AFd1rSDK(@NonNull final AFc1xSDK aFc1xSDK, @NonNull final UUID afWarnLog, @NonNull final String afVersionDeclaration, @NonNull final Map<String, String> m, final String afLogger$LogLevel, final LinkGenerator.ResponseListener getLevel) {
        super(AFd1vSDK.valueOf, new AFd1vSDK[] { AFd1vSDK.values }, aFc1xSDK, afWarnLog.toString());
        this.afInfoLog = aFc1xSDK.AFInAppEventParameterName();
        this.afWarnLog = afWarnLog;
        this.AFVersionDeclaration = afVersionDeclaration;
        this.afErrorLogForExcManagerOnly = new HashMap<String, String>(m);
        this.getLevel = getLevel;
        this.AFLogger$LogLevel = afLogger$LogLevel;
    }
    
    private String AFVersionDeclaration() {
        final String string = AppsFlyerProperties.getInstance().getString("onelinkDomain");
        final String packageName = this.afInfoLog.valueOf.AFInAppEventType.getPackageName();
        final LinkGenerator addParameters = new LinkGenerator("af_app_invites").setBaseURL(this.AFVersionDeclaration, string, packageName).addParameter("af_siteid", packageName).addParameters(this.afErrorLogForExcManagerOnly);
        AFa1eSDK.valueOf();
        final String afInAppEventParameterName = AFa1eSDK.AFInAppEventParameterName();
        if (afInAppEventParameterName != null) {
            addParameters.setReferrerCustomerId(afInAppEventParameterName);
        }
        return addParameters.generateLink();
    }
    
    @Override
    public final long AFInAppEventType() {
        return 3000L;
    }
    
    @Override
    public final boolean afInfoLog() {
        return false;
    }
    
    @Override
    public final AppsFlyerRequestListener afRDLog() {
        return null;
    }
    
    @Override
    public final boolean getLevel() {
        return false;
    }
    
    @Override
    public final AFc1qSDK<String> values(@NonNull final String s) {
        return super.AFLogger.AFInAppEventType(this.AFVersionDeclaration, this.afErrorLogForExcManagerOnly, this.AFLogger$LogLevel, this.afWarnLog, s);
    }
    
    @Override
    public final void values() {
        super.values();
        final LinkGenerator.ResponseListener getLevel = this.getLevel;
        if (getLevel != null) {
            if (super.valueOf == AFd1ySDK.AFInAppEventParameterName) {
                final AFc1gSDK<Result> afErrorLog = (AFc1gSDK<Result>)super.afErrorLog;
                if (afErrorLog != null) {
                    getLevel.onResponse((String)afErrorLog.getBody());
                    return;
                }
            }
            final Throwable afDebugLog = this.afDebugLog();
            if (afDebugLog instanceof ParsingException) {
                if (((ParsingException)afDebugLog).getRawResponse().isSuccessful()) {
                    getLevel.onResponseError("Can't parse one link data");
                    return;
                }
                getLevel.onResponse(this.AFVersionDeclaration());
            }
            else {
                getLevel.onResponse(this.AFVersionDeclaration());
            }
        }
    }
}
