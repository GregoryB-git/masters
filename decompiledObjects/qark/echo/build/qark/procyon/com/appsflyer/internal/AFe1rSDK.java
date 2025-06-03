// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.appsflyer.internal;

import java.util.Locale;
import org.json.JSONObject;
import com.appsflyer.AFLogger;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import androidx.annotation.NonNull;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public final class AFe1rSDK extends AFd1oSDK<Map<String, Object>>
{
    private static final List<String> afInfoLog;
    private Map<String, Object> AFLogger$LogLevel;
    private final AFe1mSDK AFVersionDeclaration;
    private String AppsFlyer2dXConversionCallback;
    private final AFb1gSDK afErrorLogForExcManagerOnly;
    private final AFb1dSDK afWarnLog;
    private final AFc1oSDK getLevel;
    
    static {
        afInfoLog = Arrays.asList("googleplay", "playstore", "googleplaystore");
    }
    
    public AFe1rSDK(@NonNull final AFc1xSDK aFc1xSDK) {
        super(AFd1vSDK.afDebugLog, new AFd1vSDK[] { AFd1vSDK.values }, aFc1xSDK, "GCD-FETCH");
        this.getLevel = aFc1xSDK.AFKeystoreWrapper();
        this.afWarnLog = aFc1xSDK.values();
        this.AFVersionDeclaration = aFc1xSDK.afDebugLog();
        this.afErrorLogForExcManagerOnly = aFc1xSDK.AFInAppEventParameterName();
        super.AFKeystoreWrapper.add(AFd1vSDK.AFInAppEventParameterName);
        super.AFKeystoreWrapper.add(AFd1vSDK.afWarnLog);
    }
    
    @Override
    public final boolean AFInAppEventParameterName() {
        return false;
    }
    
    @Override
    public final boolean afInfoLog() {
        return false;
    }
    
    @Override
    public final AppsFlyerRequestListener afRDLog() {
        return null;
    }
    
    @NonNull
    @Override
    public final AFd1ySDK valueOf() {
        if (!super.afDebugLog.AFKeystoreWrapper()) {
            AFd1ySDK aFd1ySDK = AFd1ySDK.valueOf;
            for (int i = 0; i <= 2; ++i) {
                Block_2: {
                    break Block_2;
                Label_0583:
                    while (true) {
                        boolean b;
                        int statusCode;
                        do {
                        Label_0505:
                            while (true) {
                                Label_0578: {
                                    Label_0573: {
                                        Label_0109: {
                                            break Label_0109;
                                            b = (i >= 2);
                                            this.AFVersionDeclaration.AFVersionDeclaration = System.currentTimeMillis();
                                            AFc1gSDK<Result> afErrorLog = null;
                                            int statusCode2;
                                            AFd1ySDK aFd1ySDK2;
                                            StringBuilder sb;
                                            Map<K, Boolean> afLogger$LogLevel = null;
                                            String s = null;
                                            StringBuilder sb2;
                                            Boolean b2;
                                            Label_0267_Outer:Block_16_Outer:Block_18_Outer:
                                            while (true) {
                                                try {
                                                    try {
                                                        super.valueOf();
                                                        afErrorLog = (AFc1gSDK<Result>)super.afErrorLog;
                                                        if (afErrorLog == null) {
                                                            break;
                                                        }
                                                        statusCode2 = afErrorLog.getStatusCode();
                                                        if (statusCode2 != 403 && statusCode2 < 500) {
                                                            break Label_0573;
                                                        }
                                                        break Label_0578;
                                                        // iftrue(Label_0159:, afErrorLog.isSuccessful() || statusCode2 == 404)
                                                        continue Label_0583;
                                                        this.AppsFlyer2dXConversionCallback = "Error connection to server: ".concat(String.valueOf(statusCode2));
                                                        aFd1ySDK2 = AFd1ySDK.valueOf;
                                                        this.AFVersionDeclaration.values(i);
                                                        com.appsflyer.AFLogger.afDebugLog("[GCD-A03] Server retrieving attempt finished");
                                                        return aFd1ySDK2;
                                                    }
                                                    finally {}
                                                }
                                                catch (Exception ex) {
                                                    sb = new StringBuilder("[GCD] Error: ");
                                                    sb.append(ex.getMessage());
                                                    com.appsflyer.AFLogger.afErrorLog(sb.toString(), ex);
                                                    aFd1ySDK = AFd1ySDK.valueOf;
                                                    if (b) {
                                                        break Label_0505;
                                                    }
                                                    Label_0332: {
                                                        s = String.format("[CrossPromotion] App was installed via %s's Cross Promotion", afLogger$LogLevel.get("af_siteid"));
                                                    }
                                                    // iftrue(Label_0358:, !afLogger$LogLevel.containsKey((Object)"af_siteid"))
                                                    // iftrue(Label_0426:, this.afWarnLog.valueOf("sixtyDayConversionData"))
                                                    // iftrue(Label_0332:, !afLogger$LogLevel.containsKey((Object)"af_channel"))
                                                    // iftrue(Label_0240:, statusCode != 404)
                                                    while (true) {
                                                    Label_0240:
                                                        while (true) {
                                                        Label_0358_Outer:
                                                            while (true) {
                                                                while (true) {
                                                                    Block_19: {
                                                                        while (true) {
                                                                            Label_0324: {
                                                                                break Label_0324;
                                                                                break Block_19;
                                                                                Label_0426: {
                                                                                    while (true) {
                                                                                        afLogger$LogLevel.put("is_first_launch", Boolean.TRUE);
                                                                                        break Label_0426;
                                                                                        afLogger$LogLevel.put("is_first_launch", Boolean.FALSE);
                                                                                        this.afWarnLog.AFInAppEventParameterName("attributionId", new JSONObject((Map)afLogger$LogLevel).toString());
                                                                                        continue Label_0358_Outer;
                                                                                    }
                                                                                    afLogger$LogLevel.remove("error_reason");
                                                                                    afLogger$LogLevel.remove("status_code");
                                                                                    afLogger$LogLevel.put("af_status", (Boolean)"Organic");
                                                                                    afLogger$LogLevel.put("af_message", (Boolean)"organic install");
                                                                                    break Label_0240;
                                                                                    sb2 = new StringBuilder("[Invite] Detected App-Invite via channel: ");
                                                                                    sb2.append(afLogger$LogLevel.get("af_channel"));
                                                                                    s = sb2.toString();
                                                                                    break Label_0324;
                                                                                }
                                                                                this.AFLogger$LogLevel = (Map<String, Object>)afLogger$LogLevel;
                                                                                aFd1ySDK2 = AFd1ySDK.AFInAppEventParameterName;
                                                                                continue Label_0267_Outer;
                                                                            }
                                                                            com.appsflyer.AFLogger.afDebugLog(s);
                                                                            continue Block_16_Outer;
                                                                        }
                                                                    }
                                                                    continue Block_18_Outer;
                                                                }
                                                                this.afWarnLog.AFInAppEventParameterName("appsflyerConversionDataCacheExpiration", System.currentTimeMillis());
                                                                continue Block_16_Outer;
                                                            }
                                                            Label_0159:
                                                            afLogger$LogLevel = (Map<K, Boolean>)afErrorLog.getBody();
                                                            statusCode = afErrorLog.getStatusCode();
                                                            b2 = afLogger$LogLevel.get("iscache");
                                                            continue Block_18_Outer;
                                                        }
                                                        continue;
                                                    }
                                                }
                                                // iftrue(Label_0267:, b2 == null || b2.booleanValue())
                                                catch (AFd1tSDK aFd1tSDK2) {}
                                                break;
                                            }
                                        }
                                        break;
                                    }
                                    statusCode = 0;
                                    continue;
                                }
                                statusCode = 1;
                                continue;
                            }
                            final Exception ex;
                            this.AppsFlyer2dXConversionCallback = ex.getMessage();
                            throw ex;
                            this.AFVersionDeclaration.values(i);
                            com.appsflyer.AFLogger.afDebugLog("[GCD-A03] Server retrieving attempt finished");
                            throw aFd1ySDK;
                        } while (b || statusCode == 0);
                        break;
                    }
                }
                this.AFVersionDeclaration.values(i);
                com.appsflyer.AFLogger.afDebugLog("[GCD-A03] Server retrieving attempt finished");
            }
            return aFd1ySDK;
        }
        com.appsflyer.AFLogger.afDebugLog("[GCD-E03] 'isStopTracking' enabled");
        this.AppsFlyer2dXConversionCallback = "'isStopTracking' enabled";
        throw new AFd1xSDK();
        com.appsflyer.AFLogger.afDebugLog("[GCD-E05] AppsFlyer dev key is missing");
        this.AppsFlyer2dXConversionCallback = "AppsFlyer dev key is missing";
        throw;
    }
    
    @Override
    public final AFc1qSDK<Map<String, Object>> values(@NonNull final String s) {
        final String afInAppEventType = AFa1eSDK.AFInAppEventType(this.afWarnLog, this.afErrorLogForExcManagerOnly.values());
        String concat = null;
        Label_0079: {
            if (afInAppEventType != null && !afInAppEventType.trim().isEmpty()) {
                if (!AFe1rSDK.afInfoLog.contains(afInAppEventType.toLowerCase(Locale.getDefault()))) {
                    concat = "-".concat(afInAppEventType);
                    break Label_0079;
                }
                com.appsflyer.AFLogger.afWarnLog(String.format("[GCD] AF detected using redundant Google-Play channel for attribution - %s. Using without channel postfix.", afInAppEventType));
            }
            concat = "";
        }
        final AFc1qSDK<Map<String, Object>> values = this.getLevel.values(concat, s);
        final StringBuilder sb = new StringBuilder("[GCD-B01] URL: ");
        sb.append(values.valueOf.valueOf);
        AFa1aSDK.values(sb.toString());
        return values;
    }
    
    @Override
    public final void values() {
        super.values();
        final Map<String, Object> afLogger$LogLevel = this.AFLogger$LogLevel;
        final String appsFlyer2dXConversionCallback = this.AppsFlyer2dXConversionCallback;
        if (afLogger$LogLevel != null) {
            AFe1sSDK.values(afLogger$LogLevel);
            return;
        }
        if (appsFlyer2dXConversionCallback != null && !appsFlyer2dXConversionCallback.isEmpty()) {
            AFe1sSDK.AFInAppEventType(appsFlyer2dXConversionCallback);
            return;
        }
        AFe1sSDK.AFInAppEventType("Unknown error");
    }
}
