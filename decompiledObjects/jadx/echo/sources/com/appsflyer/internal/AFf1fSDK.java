package com.appsflyer.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes.dex */
public final class AFf1fSDK {

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

    @Metadata
    public static final class AFa1ySDK {
        private AFa1ySDK() {
        }

        public /* synthetic */ AFa1ySDK(byte b7) {
            this();
        }
    }

    static {
        new AFa1ySDK((byte) 0);
        StringBuilder sb = new StringBuilder();
        sb.append(AFa1eSDK.AFKeystoreWrapper);
        sb.append("/androidevent?app_id=");
        String obj = sb.toString();
        onResponseErrorNative = obj;
        StringBuilder sb2 = new StringBuilder("https://%sattr.%s/api/v");
        sb2.append(obj);
        AFKeystoreWrapper = sb2.toString();
        AFInAppEventParameterName = "https://%sadrevenue.%s/api/v2/generic/v6.12.2/android?app_id=";
        valueOf = "https://%sadrevenue.%s/api/v2/log/AdImpression/v6.12.2/android?app_id=";
        StringBuilder sb3 = new StringBuilder("https://%sconversions.%s/api/v");
        sb3.append(obj);
        afRDLog = sb3.toString();
        StringBuilder sb4 = new StringBuilder("https://%slaunches.%s/api/v");
        sb4.append(obj);
        afErrorLog = sb4.toString();
        StringBuilder sb5 = new StringBuilder("https://%sinapps.%s/api/v");
        sb5.append(obj);
        AFLogger = sb5.toString();
        afDebugLog = "https://%sars.%s/api/v2/android/validate_subscription?app_id=";
        afInfoLog = "https://%sviap.%s/api/v1/android/validate_purchase?app_id=";
        AFLogger$LogLevel = "https://%sars.%s/api/v2/android/validate_subscription_v2?app_id=";
        AFVersionDeclaration = "https://%sviap.%s/api/v1/android/validate_purchase_v2?app_id=";
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AFf1fSDK(@NotNull AFb1gSDK aFb1gSDK) {
        this(aFb1gSDK, (byte) 0);
        Intrinsics.checkNotNullParameter(aFb1gSDK, "");
    }

    public final String AFInAppEventParameterName(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        String values = this.values.values();
        String concat = values != null ? "&channel=".concat(values) : null;
        if (concat == null) {
            concat = "";
        }
        sb.append(concat);
        return sb.toString();
    }

    private /* synthetic */ AFf1fSDK(AFb1gSDK aFb1gSDK, byte b7) {
        this(aFb1gSDK, new AFf1dSDK());
    }

    public static String AFInAppEventParameterName(String str, boolean z7) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(!z7 ? "&buildnumber=6.12.2" : "");
        return sb.toString();
    }

    private AFf1fSDK(@NotNull AFb1gSDK aFb1gSDK, @NotNull AFf1eSDK aFf1eSDK) {
        Intrinsics.checkNotNullParameter(aFb1gSDK, "");
        Intrinsics.checkNotNullParameter(aFf1eSDK, "");
        this.values = aFb1gSDK;
        this.AFInAppEventType = aFf1eSDK;
    }
}
