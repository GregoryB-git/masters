/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.ClassNotFoundException
 *  java.lang.Deprecated
 *  java.lang.Enum
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 */
package com.appsflyer.internal;

import com.appsflyer.AFLogger;

@Deprecated
public final class AFb1xSDK
implements AFa1wSDK {
    private final AFa1wSDK AFInAppEventType;

    public AFb1xSDK() {
        this.AFInAppEventType = this;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    private boolean values(String var1_1) {
        try {
            this.AFInAppEventType.AFInAppEventParameterName(var1_1);
            var2_3 = new StringBuilder("Class: ");
            var2_3.append(var1_1);
            var2_3.append(" is found.");
            AFLogger.afRDLog(var2_3.toString());
            return true;
        }
        catch (ClassNotFoundException var2_4) {}
        ** finally { 
lbl10: // 1 sources:
        AFLogger.afErrorLog(var1_2.getMessage(), var1_2);
        return false;
    }

    @Override
    public final Class<?> AFInAppEventParameterName(String string2) {
        return Class.forName((String)string2);
    }

    public final String AFInAppEventParameterName() {
        for (AFa1zSDK aFa1zSDK : AFa1zSDK.values()) {
            if (!this.values(aFa1zSDK.init)) continue;
            return aFa1zSDK.afErrorLogForExcManagerOnly;
        }
        return AFa1zSDK.AFInAppEventType.afErrorLogForExcManagerOnly;
    }

    public static interface AFa1wSDK {
        public Class<?> AFInAppEventParameterName(String var1);
    }

    public static final class AFa1zSDK
    extends Enum<AFa1zSDK> {
        private static /* enum */ AFa1zSDK AFInAppEventParameterName;
        public static final /* enum */ AFa1zSDK AFInAppEventType;
        private static /* enum */ AFa1zSDK AFKeystoreWrapper;
        private static /* enum */ AFa1zSDK AFLogger;
        private static /* enum */ AFa1zSDK AFLogger$LogLevel;
        private static /* enum */ AFa1zSDK AFVersionDeclaration;
        private static /* enum */ AFa1zSDK afDebugLog;
        private static /* enum */ AFa1zSDK afErrorLog;
        private static /* enum */ AFa1zSDK afInfoLog;
        private static /* enum */ AFa1zSDK afRDLog;
        private static /* enum */ AFa1zSDK afWarnLog;
        private static /* enum */ AFa1zSDK getLevel;
        private static final /* synthetic */ AFa1zSDK[] onInstallConversionDataLoadedNative;
        private static /* enum */ AFa1zSDK valueOf;
        private static /* enum */ AFa1zSDK values;
        private final String afErrorLogForExcManagerOnly;
        private final String init;

        static {
            AFa1zSDK aFa1zSDK;
            AFa1zSDK aFa1zSDK2;
            values = new AFa1zSDK("android_adobe_air", "com.appsflyer.adobeair.AppsFlyerExtension");
            AFKeystoreWrapper = new AFa1zSDK("android_adobe_mobile", "com.appsflyer.adobeextension.AppsFlyerAdobeExtension");
            AFInAppEventParameterName = new AFa1zSDK("android_cocos2dx", "org.cocos2dx.lib.Cocos2dxActivity");
            valueOf = new AFa1zSDK("android_cordova", "com.appsflyer.cordova.plugin.AppsFlyerPlugin");
            AFInAppEventType = aFa1zSDK2 = new AFa1zSDK("android_native", "android_native");
            afRDLog = new AFa1zSDK("android_flutter", "com.appsflyer.appsflyersdk.AppsflyerSdkPlugin");
            afDebugLog = new AFa1zSDK("android_mparticle", "com.mparticle.kits.AppsFlyerKit");
            afInfoLog = new AFa1zSDK("android_native_script", "com.tns.NativeScriptActivity");
            afErrorLog = new AFa1zSDK("android_expo", "expo.modules.devmenu.react.DevMenuAwareReactActivity");
            AFLogger = new AFa1zSDK("android_reactNative", "com.appsflyer.reactnative.RNAppsFlyerModule");
            afWarnLog = new AFa1zSDK("android_unity", "com.appsflyer.unity.AppsFlyerAndroidWrapper");
            AFVersionDeclaration = new AFa1zSDK("android_unreal", "com.epicgames.ue4.GameActivity");
            getLevel = new AFa1zSDK("android_xamarin", "mono.android.Runtime");
            AFLogger$LogLevel = aFa1zSDK = new AFa1zSDK("android_capacitor", "capacitor.plugin.appsflyer.sdk.AppsFlyerPlugin");
            onInstallConversionDataLoadedNative = new AFa1zSDK[]{values, AFKeystoreWrapper, AFInAppEventParameterName, valueOf, aFa1zSDK2, afRDLog, afDebugLog, afInfoLog, afErrorLog, AFLogger, afWarnLog, AFVersionDeclaration, getLevel, aFa1zSDK};
        }

        private AFa1zSDK(String string3, String string4) {
            this.afErrorLogForExcManagerOnly = string3;
            this.init = string4;
        }

        public static AFa1zSDK valueOf(String string2) {
            return (AFa1zSDK)Enum.valueOf(AFa1zSDK.class, (String)string2);
        }

        public static AFa1zSDK[] values() {
            return (AFa1zSDK[])onInstallConversionDataLoadedNative.clone();
        }
    }

}

