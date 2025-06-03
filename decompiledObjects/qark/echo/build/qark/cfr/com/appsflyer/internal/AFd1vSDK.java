/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Enum
 *  java.lang.Object
 *  java.lang.String
 */
package com.appsflyer.internal;

public final class AFd1vSDK
extends Enum<AFd1vSDK> {
    public static final /* enum */ AFd1vSDK AFInAppEventParameterName;
    public static final /* enum */ AFd1vSDK AFInAppEventType;
    public static final /* enum */ AFd1vSDK AFKeystoreWrapper;
    public static final /* enum */ AFd1vSDK AFLogger;
    public static final /* enum */ AFd1vSDK AFLogger$LogLevel;
    public static final /* enum */ AFd1vSDK AFVersionDeclaration;
    public static final /* enum */ AFd1vSDK AppsFlyer2dXConversionCallback;
    public static final /* enum */ AFd1vSDK afDebugLog;
    public static final /* enum */ AFd1vSDK afErrorLog;
    public static final /* enum */ AFd1vSDK afErrorLogForExcManagerOnly;
    public static final /* enum */ AFd1vSDK afInfoLog;
    public static final /* enum */ AFd1vSDK afRDLog;
    public static final /* enum */ AFd1vSDK afWarnLog;
    public static final /* enum */ AFd1vSDK getLevel;
    public static final /* enum */ AFd1vSDK init;
    public static final /* enum */ AFd1vSDK onAppOpenAttributionNative;
    private static final /* synthetic */ AFd1vSDK[] onAttributionFailureNative;
    public static final /* enum */ AFd1vSDK onInstallConversionDataLoadedNative;
    public static final /* enum */ AFd1vSDK onInstallConversionFailureNative;
    public static final /* enum */ AFd1vSDK valueOf;
    public static final /* enum */ AFd1vSDK values;
    public final int onDeepLinkingNative;

    static {
        AFd1vSDK aFd1vSDK;
        AFd1vSDK aFd1vSDK2;
        AFd1vSDK aFd1vSDK3;
        AFd1vSDK aFd1vSDK4;
        AFd1vSDK aFd1vSDK5;
        AFd1vSDK aFd1vSDK6;
        AFd1vSDK aFd1vSDK7;
        AFd1vSDK aFd1vSDK8;
        AFd1vSDK aFd1vSDK9;
        AFd1vSDK aFd1vSDK10;
        AFd1vSDK aFd1vSDK11;
        AFd1vSDK aFd1vSDK12;
        AFd1vSDK aFd1vSDK13;
        AFd1vSDK aFd1vSDK14;
        AFd1vSDK aFd1vSDK15;
        AFd1vSDK aFd1vSDK16;
        AFd1vSDK aFd1vSDK17;
        AFd1vSDK aFd1vSDK18;
        AFd1vSDK aFd1vSDK19;
        AFd1vSDK aFd1vSDK20;
        values = aFd1vSDK18 = new AFd1vSDK(1);
        AFInAppEventType = aFd1vSDK4 = new AFd1vSDK(2);
        AFKeystoreWrapper = aFd1vSDK16 = new AFd1vSDK(2);
        AFInAppEventParameterName = aFd1vSDK11 = new AFd1vSDK(2);
        valueOf = aFd1vSDK2 = new AFd1vSDK(2);
        afRDLog = aFd1vSDK19 = new AFd1vSDK(2);
        AFLogger = aFd1vSDK12 = new AFd1vSDK(2);
        afInfoLog = aFd1vSDK3 = new AFd1vSDK(2);
        afDebugLog = aFd1vSDK10 = new AFd1vSDK(3);
        afErrorLog = aFd1vSDK15 = new AFd1vSDK(4);
        afWarnLog = aFd1vSDK = new AFd1vSDK(4);
        AFVersionDeclaration = aFd1vSDK6 = new AFd1vSDK(4);
        getLevel = aFd1vSDK8 = new AFd1vSDK(4);
        AFLogger$LogLevel = aFd1vSDK13 = new AFd1vSDK(4);
        afErrorLogForExcManagerOnly = aFd1vSDK20 = new AFd1vSDK(4);
        onAppOpenAttributionNative = aFd1vSDK14 = new AFd1vSDK(4);
        onInstallConversionFailureNative = aFd1vSDK9 = new AFd1vSDK(4);
        AppsFlyer2dXConversionCallback = aFd1vSDK7 = new AFd1vSDK(4);
        onInstallConversionDataLoadedNative = aFd1vSDK5 = new AFd1vSDK(4);
        init = aFd1vSDK17 = new AFd1vSDK(4);
        onAttributionFailureNative = new AFd1vSDK[]{aFd1vSDK18, aFd1vSDK4, aFd1vSDK16, aFd1vSDK11, aFd1vSDK2, aFd1vSDK19, aFd1vSDK12, aFd1vSDK3, aFd1vSDK10, aFd1vSDK15, aFd1vSDK, aFd1vSDK6, aFd1vSDK8, aFd1vSDK13, aFd1vSDK20, aFd1vSDK14, aFd1vSDK9, aFd1vSDK7, aFd1vSDK5, aFd1vSDK17};
    }

    private AFd1vSDK(int n9) {
        this.onDeepLinkingNative = n9;
    }

    public static AFd1vSDK valueOf(String string2) {
        return (AFd1vSDK)Enum.valueOf(AFd1vSDK.class, (String)string2);
    }

    public static AFd1vSDK[] values() {
        return (AFd1vSDK[])onAttributionFailureNative.clone();
    }
}

