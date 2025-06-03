// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.appsflyer.internal;

import com.appsflyer.internal.components.network.http.ResponseNetwork;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import org.json.JSONObject;
import android.content.Context;
import android.os.Build$VERSION;
import com.appsflyer.AppsFlyerProperties;
import java.util.HashMap;
import com.appsflyer.PurchaseHandler;
import androidx.annotation.NonNull;
import java.util.Map;

public abstract class AFd1pSDK extends AFd1oSDK<String>
{
    private final String AFLogger$LogLevel;
    private final AFe1vSDK AFVersionDeclaration;
    @NonNull
    private final Map<String, Object> afErrorLogForExcManagerOnly;
    private final AFb1gSDK afInfoLog;
    private final AFb1dSDK afWarnLog;
    private final PurchaseHandler.PurchaseValidationCallback getLevel;
    private final String onInstallConversionDataLoadedNative;
    
    public AFd1pSDK(@NonNull final AFd1vSDK aFd1vSDK, @NonNull final AFd1vSDK[] array, @NonNull final AFc1xSDK aFc1xSDK, final String s, final Map<String, Object> m, final PurchaseHandler.PurchaseValidationCallback getLevel) {
        super(aFd1vSDK, array, aFc1xSDK, s);
        final AFb1gSDK afInAppEventParameterName = aFc1xSDK.AFInAppEventParameterName();
        this.afInfoLog = afInAppEventParameterName;
        final AFb1dSDK values = aFc1xSDK.values();
        this.afWarnLog = values;
        final AFe1vSDK afLogger = aFc1xSDK.AFLogger();
        this.AFVersionDeclaration = afLogger;
        final boolean containsKey = m.containsKey("billing_library_version");
        final String s2 = null;
        String afLogger$LogLevel;
        if (containsKey) {
            afLogger$LogLevel = (String)m.remove("billing_library_version");
        }
        else {
            afLogger$LogLevel = null;
        }
        this.AFLogger$LogLevel = afLogger$LogLevel;
        String onInstallConversionDataLoadedNative;
        if (m.containsKey("connector_version")) {
            onInstallConversionDataLoadedNative = (String)m.remove("connector_version");
        }
        else {
            onInstallConversionDataLoadedNative = null;
        }
        this.onInstallConversionDataLoadedNative = onInstallConversionDataLoadedNative;
        final HashMap<String, Long> afErrorLogForExcManagerOnly = new HashMap<String, Long>(new HashMap<String, Long>((Map<? extends String, ? extends Long>)m));
        afErrorLogForExcManagerOnly.put("app_id", afInAppEventParameterName.valueOf.AFInAppEventType.getPackageName());
        afErrorLogForExcManagerOnly.put("event_timestamp", afLogger.valueOf());
        final String afKeystoreWrapper = AFb1gSDK.AFKeystoreWrapper();
        if (afKeystoreWrapper != null) {
            afErrorLogForExcManagerOnly.put("cuid", (Long)afKeystoreWrapper);
        }
        final Context afInAppEventType = afInAppEventParameterName.valueOf.AFInAppEventType;
        afErrorLogForExcManagerOnly.put("app_version_name", AFa1fSDK.AFKeystoreWrapper(afInAppEventType, afInAppEventType.getPackageName()));
        final HashMap<String, String> hashMap = new HashMap<String, String>();
        final AFc1uSDK.AFa1wSDK values2 = AFa1cSDK.values(afInAppEventParameterName.valueOf.AFInAppEventType, new HashMap<String, Object>());
        String valueOf;
        if (values2 != null) {
            valueOf = values2.valueOf;
        }
        else {
            valueOf = null;
        }
        if (!AFb1uSDK.values(valueOf)) {
            hashMap.put("advertising_id", valueOf);
        }
        final AFc1uSDK.AFa1wSDK afInAppEventParameterName2 = AFa1cSDK.AFInAppEventParameterName(afInAppEventParameterName.valueOf.AFInAppEventType.getContentResolver());
        String valueOf2;
        if (afInAppEventParameterName2 != null) {
            valueOf2 = afInAppEventParameterName2.valueOf;
        }
        else {
            valueOf2 = null;
        }
        if (!AFb1uSDK.values(valueOf2)) {
            hashMap.put("oaid", valueOf2);
        }
        final AFc1uSDK.AFa1wSDK afInAppEventParameterName3 = AFa1cSDK.AFInAppEventParameterName(afInAppEventParameterName.valueOf.AFInAppEventType.getContentResolver());
        String valueOf3 = s2;
        if (afInAppEventParameterName3 != null) {
            valueOf3 = afInAppEventParameterName3.valueOf;
        }
        if (!AFb1uSDK.values(valueOf3)) {
            hashMap.put("amazon_aid", valueOf3);
        }
        if (!AppsFlyerProperties.getInstance().getBoolean("deviceTrackingDisabled", false)) {
            final String value = super.afDebugLog.valueOf(values);
            if (!AFb1uSDK.values(value)) {
                hashMap.put("imei", value);
            }
        }
        hashMap.put("appsflyer_id", AFb1zSDK.valueOf(afInAppEventParameterName.valueOf, afInAppEventParameterName.AFInAppEventType));
        final StringBuilder sb = new StringBuilder();
        sb.append(Build$VERSION.SDK_INT);
        hashMap.put("os_version", sb.toString());
        hashMap.put("sdk_version", "6.12.2");
        if (!AFb1uSDK.values(onInstallConversionDataLoadedNative)) {
            hashMap.put("sdk_connector_version", onInstallConversionDataLoadedNative);
        }
        afErrorLogForExcManagerOnly.put("device_data", (Long)hashMap);
        if (!AFb1uSDK.values(afLogger$LogLevel)) {
            afErrorLogForExcManagerOnly.put("billing_lib_version", (Long)afLogger$LogLevel);
        }
        this.afErrorLogForExcManagerOnly = (Map<String, Object>)afErrorLogForExcManagerOnly;
        this.getLevel = getLevel;
    }
    
    @Override
    public boolean AFInAppEventParameterName() {
        final AFc1gSDK<Result> afErrorLog = (AFc1gSDK<Result>)super.afErrorLog;
        return (afErrorLog != null && afErrorLog.getStatusCode() == 503) || super.AFInAppEventParameterName();
    }
    
    public final void AFInAppEventType(final String s) {
        final String string = new JSONObject((Map)this.afErrorLogForExcManagerOnly).toString();
        final StringBuilder sb = new StringBuilder();
        sb.append(this);
        sb.append(": preparing data: ");
        sb.append(string);
        AFa1aSDK.values(sb.toString());
        super.afRDLog.valueOf(s, string);
    }
    
    public final String afErrorLogForExcManagerOnly() {
        return this.AFLogger$LogLevel;
    }
    
    @Override
    public final boolean afInfoLog() {
        return true;
    }
    
    @Override
    public final AppsFlyerRequestListener afRDLog() {
        return null;
    }
    
    @NonNull
    public final Map<String, Object> afWarnLog() {
        return this.afErrorLogForExcManagerOnly;
    }
    
    @Override
    public final void values() {
        super.values();
        final Throwable afDebugLog = this.afDebugLog();
        if (afDebugLog != null) {
            final PurchaseHandler.PurchaseValidationCallback getLevel = this.getLevel;
            if (getLevel != null) {
                getLevel.onFailure(afDebugLog);
            }
        }
        final AFc1gSDK<Result> afErrorLog = (AFc1gSDK<Result>)super.afErrorLog;
        if (afErrorLog != null) {
            final PurchaseHandler.PurchaseValidationCallback getLevel2 = this.getLevel;
            if (getLevel2 != null) {
                getLevel2.onResponse((ResponseNetwork<String>)afErrorLog);
            }
        }
    }
}
