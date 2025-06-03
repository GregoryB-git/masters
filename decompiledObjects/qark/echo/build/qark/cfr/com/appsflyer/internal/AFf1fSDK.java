/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package com.appsflyer.internal;

import com.appsflyer.internal.AFa1eSDK;
import com.appsflyer.internal.AFb1gSDK;
import com.appsflyer.internal.AFf1dSDK;
import com.appsflyer.internal.AFf1eSDK;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
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

    static {
        new AFa1ySDK(0);
        Object object = new StringBuilder();
        object.append(AFa1eSDK.AFKeystoreWrapper);
        object.append("/androidevent?app_id=");
        onResponseErrorNative = object = object.toString();
        StringBuilder stringBuilder = new StringBuilder("https://%sattr.%s/api/v");
        stringBuilder.append((String)object);
        AFKeystoreWrapper = stringBuilder.toString();
        AFInAppEventParameterName = "https://%sadrevenue.%s/api/v2/generic/v6.12.2/android?app_id=";
        valueOf = "https://%sadrevenue.%s/api/v2/log/AdImpression/v6.12.2/android?app_id=";
        stringBuilder = new StringBuilder("https://%sconversions.%s/api/v");
        stringBuilder.append((String)object);
        afRDLog = stringBuilder.toString();
        stringBuilder = new StringBuilder("https://%slaunches.%s/api/v");
        stringBuilder.append((String)object);
        afErrorLog = stringBuilder.toString();
        stringBuilder = new StringBuilder("https://%sinapps.%s/api/v");
        stringBuilder.append((String)object);
        AFLogger = stringBuilder.toString();
        afDebugLog = "https://%sars.%s/api/v2/android/validate_subscription?app_id=";
        afInfoLog = "https://%sviap.%s/api/v1/android/validate_purchase?app_id=";
        AFLogger$LogLevel = "https://%sars.%s/api/v2/android/validate_subscription_v2?app_id=";
        AFVersionDeclaration = "https://%sviap.%s/api/v1/android/validate_purchase_v2?app_id=";
    }

    public AFf1fSDK(@NotNull AFb1gSDK aFb1gSDK) {
        Intrinsics.checkNotNullParameter(aFb1gSDK, "");
        this(aFb1gSDK, 0);
    }

    private /* synthetic */ AFf1fSDK(AFb1gSDK aFb1gSDK, byte by) {
        this(aFb1gSDK, new AFf1dSDK());
    }

    private AFf1fSDK(@NotNull AFb1gSDK aFb1gSDK, @NotNull AFf1eSDK aFf1eSDK) {
        Intrinsics.checkNotNullParameter(aFb1gSDK, "");
        Intrinsics.checkNotNullParameter(aFf1eSDK, "");
        this.values = aFb1gSDK;
        this.AFInAppEventType = aFf1eSDK;
    }

    public static String AFInAppEventParameterName(String string2, boolean bl) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string2);
        string2 = !bl ? "&buildnumber=6.12.2" : "";
        stringBuilder.append(string2);
        return stringBuilder.toString();
    }

    public final String AFInAppEventParameterName(String string2) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string2);
        string2 = this.values.values();
        string2 = string2 != null ? "&channel=".concat(string2) : null;
        String string3 = string2;
        if (string2 == null) {
            string3 = "";
        }
        stringBuilder.append(string3);
        return stringBuilder.toString();
    }

    @Metadata
    public static final class AFa1ySDK {
        private AFa1ySDK() {
        }

        public /* synthetic */ AFa1ySDK(byte by) {
            this();
        }
    }

}

