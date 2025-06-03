// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.appsflyer.internal;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import kotlin.Metadata;

@Metadata
public final class AFf1fSDK
{
    @NotNull
    public static final String AFInAppEventParameterName;
    @NotNull
    public static final String AFKeystoreWrapper;
    @NotNull
    public static final String AFLogger;
    @NotNull
    public static final String AFLogger$LogLevel;
    @NotNull
    public static final String AFVersionDeclaration;
    public static String AppsFlyer2dXConversionCallback;
    @NotNull
    public static final String afDebugLog;
    @NotNull
    public static final String afErrorLog;
    public static String afErrorLogForExcManagerOnly;
    @NotNull
    public static final String afInfoLog;
    @NotNull
    public static final String afRDLog;
    public static String afWarnLog;
    public static String getLevel;
    public static String init;
    public static String onAppOpenAttributionNative;
    public static String onAttributionFailureNative;
    public static String onInstallConversionDataLoadedNative;
    public static String onInstallConversionFailureNative;
    @NotNull
    private static final String onResponseErrorNative;
    public static String onResponseNative;
    @NotNull
    public static final String valueOf;
    @NotNull
    public final AFf1eSDK AFInAppEventType;
    @NotNull
    public final AFb1gSDK values;
    
    static {
        new AFa1ySDK((byte)0);
        final StringBuilder sb = new StringBuilder();
        sb.append(AFa1eSDK.AFKeystoreWrapper);
        sb.append("/androidevent?app_id=");
        final String s = onResponseErrorNative = sb.toString();
        final StringBuilder sb2 = new StringBuilder("https://%sattr.%s/api/v");
        sb2.append(s);
        AFKeystoreWrapper = sb2.toString();
        AFInAppEventParameterName = "https://%sadrevenue.%s/api/v2/generic/v6.12.2/android?app_id=";
        valueOf = "https://%sadrevenue.%s/api/v2/log/AdImpression/v6.12.2/android?app_id=";
        final StringBuilder sb3 = new StringBuilder("https://%sconversions.%s/api/v");
        sb3.append(s);
        afRDLog = sb3.toString();
        final StringBuilder sb4 = new StringBuilder("https://%slaunches.%s/api/v");
        sb4.append(s);
        afErrorLog = sb4.toString();
        final StringBuilder sb5 = new StringBuilder("https://%sinapps.%s/api/v");
        sb5.append(s);
        AFLogger = sb5.toString();
        afDebugLog = "https://%sars.%s/api/v2/android/validate_subscription?app_id=";
        afInfoLog = "https://%sviap.%s/api/v1/android/validate_purchase?app_id=";
        AFLogger$LogLevel = "https://%sars.%s/api/v2/android/validate_subscription_v2?app_id=";
        AFVersionDeclaration = "https://%sviap.%s/api/v1/android/validate_purchase_v2?app_id=";
    }
    
    public AFf1fSDK(@NotNull final AFb1gSDK aFb1gSDK) {
        Intrinsics.checkNotNullParameter(aFb1gSDK, "");
        this(aFb1gSDK, (byte)0);
    }
    
    private AFf1fSDK(@NotNull final AFb1gSDK values, @NotNull final AFf1eSDK afInAppEventType) {
        Intrinsics.checkNotNullParameter(values, "");
        Intrinsics.checkNotNullParameter(afInAppEventType, "");
        this.values = values;
        this.AFInAppEventType = afInAppEventType;
    }
    
    public static String AFInAppEventParameterName(String s, final boolean b) {
        final StringBuilder sb = new StringBuilder();
        sb.append(s);
        if (!b) {
            s = "&buildnumber=6.12.2";
        }
        else {
            s = "";
        }
        sb.append(s);
        return sb.toString();
    }
    
    public final String AFInAppEventParameterName(String s) {
        final StringBuilder sb = new StringBuilder();
        sb.append(s);
        s = this.values.values();
        if (s != null) {
            s = "&channel=".concat(s);
        }
        else {
            s = null;
        }
        String str = s;
        if (s == null) {
            str = "";
        }
        sb.append(str);
        return sb.toString();
    }
    
    @Metadata
    public static final class AFa1ySDK
    {
        private AFa1ySDK() {
        }
    }
}
