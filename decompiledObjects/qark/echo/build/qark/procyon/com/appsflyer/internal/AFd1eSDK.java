// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.appsflyer.internal;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.Context;
import android.os.Build$VERSION;
import com.appsflyer.AppsFlyerProperties;
import android.graphics.drawable.Drawable;
import android.os.Build;
import java.text.SimpleDateFormat;
import java.util.Locale;
import com.appsflyer.AFLogger;
import androidx.annotation.NonNull;

public final class AFd1eSDK extends AFd1hSDK
{
    private static char[] AppsFlyer2dXConversionCallback;
    private static boolean init = false;
    private static boolean onAppOpenAttributionNative = true;
    private static int onInstallConversionDataLoadedNative = 0;
    private static int onInstallConversionFailureNative = 0;
    private static int onResponseNative = 1;
    private final AFb1bSDK AFLogger$LogLevel;
    private final AFe1vSDK AFVersionDeclaration;
    private final String afWarnLog;
    private final AFb1gSDK getLevel;
    
    static {
        AFd1eSDK.AppsFlyer2dXConversionCallback = new char[] { '¬', '¼', '«', '¸', '®' };
        AFd1eSDK.init = true;
        AFd1eSDK.onInstallConversionDataLoadedNative = 74;
    }
    
    public AFd1eSDK(@NonNull final String afWarnLog, @NonNull final AFc1xSDK aFc1xSDK) {
        super(new AFe1uSDK(aFc1xSDK.init().AFInAppEventType), aFc1xSDK, afWarnLog);
        this.getLevel = aFc1xSDK.AFInAppEventParameterName();
        this.AFLogger$LogLevel = aFc1xSDK.init();
        this.afWarnLog = afWarnLog;
        this.AFVersionDeclaration = aFc1xSDK.AFLogger();
    }
    
    private static void AFInAppEventParameterName(String afKeystoreWrapper, String bytes, final int[] array, final int n, final Object[] array2) {
        Object charArray = bytes;
        if (bytes != null) {
            charArray = ((String)bytes).toCharArray();
        }
        final char[] array3 = (char[])charArray;
        if ((bytes = afKeystoreWrapper) != null) {
            bytes = afKeystoreWrapper.getBytes("ISO-8859-1");
        }
        final byte[] array4 = (byte[])bytes;
        afKeystoreWrapper = (String)AFg1tSDK.AFKeystoreWrapper;
        // monitorenter(afKeystoreWrapper)
        while (true) {
            try {
                final char[] appsFlyer2dXConversionCallback = AFd1eSDK.AppsFlyer2dXConversionCallback;
                final int onInstallConversionDataLoadedNative = AFd1eSDK.onInstallConversionDataLoadedNative;
                if (AFd1eSDK.init) {
                    final char[] value = new char[AFg1tSDK.values = array4.length];
                    AFg1tSDK.valueOf = 0;
                    while (AFg1tSDK.valueOf < AFg1tSDK.values) {
                        final int valueOf = AFg1tSDK.valueOf;
                        final int values = AFg1tSDK.values;
                        final int valueOf2 = AFg1tSDK.valueOf;
                        value[valueOf] = (char)(appsFlyer2dXConversionCallback[array4[values - 1 - valueOf2] + n] - onInstallConversionDataLoadedNative);
                        AFg1tSDK.valueOf = valueOf2 + 1;
                    }
                    final String s = new String(value);
                    // monitorexit(afKeystoreWrapper)
                    array2[0] = s;
                    return;
                }
                if (AFd1eSDK.onAppOpenAttributionNative) {
                    final char[] value2 = new char[AFg1tSDK.values = array3.length];
                    AFg1tSDK.valueOf = 0;
                    while (AFg1tSDK.valueOf < AFg1tSDK.values) {
                        final int valueOf3 = AFg1tSDK.valueOf;
                        final int values2 = AFg1tSDK.values;
                        final int valueOf4 = AFg1tSDK.valueOf;
                        value2[valueOf3] = (char)(appsFlyer2dXConversionCallback[array3[values2 - 1 - valueOf4] - n] - onInstallConversionDataLoadedNative);
                        AFg1tSDK.valueOf = valueOf4 + 1;
                    }
                    final String s2 = new String(value2);
                    // monitorexit(afKeystoreWrapper)
                    array2[0] = s2;
                    return;
                }
                final char[] value3 = new char[AFg1tSDK.values = array.length];
                AFg1tSDK.valueOf = 0;
                while (AFg1tSDK.valueOf < AFg1tSDK.values) {
                    final int valueOf5 = AFg1tSDK.valueOf;
                    final int values3 = AFg1tSDK.values;
                    final int valueOf6 = AFg1tSDK.valueOf;
                    value3[valueOf5] = (char)(appsFlyer2dXConversionCallback[array[values3 - 1 - valueOf6] - n] - onInstallConversionDataLoadedNative);
                    AFg1tSDK.valueOf = valueOf6 + 1;
                }
                final String s3 = new String(value3);
                // monitorexit(afKeystoreWrapper)
                array2[0] = s3;
                return;
                // monitorexit(afKeystoreWrapper)
                throw;
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    private void AFVersionDeclaration() {
        AFd1eSDK.onResponseNative = (AFd1eSDK.onInstallConversionFailureNative + 27) % 128;
        super.afErrorLogForExcManagerOnly.values("sentRegisterRequestToAF", true);
        com.appsflyer.AFLogger.afDebugLog("[register] Successfully registered for Uninstall Tracking");
        AFd1eSDK.onResponseNative = (AFd1eSDK.onInstallConversionFailureNative + 29) % 128;
    }
    
    @Override
    public final boolean afInfoLog() {
        final int onInstallConversionFailureNative = AFd1eSDK.onInstallConversionFailureNative;
        boolean b = true;
        final int n = onInstallConversionFailureNative + 1;
        final int n2 = AFd1eSDK.onResponseNative = n % 128;
        if (n % 2 != 0) {
            b = false;
        }
        final int n3 = n2 + 115;
        AFd1eSDK.onInstallConversionFailureNative = n3 % 128;
        if (n3 % 2 == 0) {
            return b;
        }
        throw null;
    }
    
    @Override
    public final void valueOf(final AFa1qSDK aFa1qSDK) {
        super.valueOf(aFa1qSDK);
        final Context afInAppEventType = this.AFLogger$LogLevel.AFInAppEventType;
        final AFa1eSDK value = AFa1eSDK.valueOf();
        if (afInAppEventType == null) {
            throw new IllegalStateException("Context is not provided, can't send register request");
        }
        if (value.AFKeystoreWrapper()) {
            com.appsflyer.AFLogger.afInfoLog("CustomerUserId not set, Tracking is disabled", true);
            throw new IllegalStateException("CustomerUserId not set, register is not sent");
        }
        final PackageManager packageManager = afInAppEventType.getPackageManager();
        final String packageName = afInAppEventType.getPackageName();
        try {
            final PackageInfo packageInfo = packageManager.getPackageInfo(packageName, 0);
            aFa1qSDK.AFKeystoreWrapper("app_version_code", Integer.toString(packageInfo.versionCode));
            aFa1qSDK.AFKeystoreWrapper("app_version_name", packageInfo.versionName);
            aFa1qSDK.AFKeystoreWrapper("app_name", packageManager.getApplicationLabel(packageInfo.applicationInfo).toString());
            aFa1qSDK.AFKeystoreWrapper("installDate", AFa1eSDK.AFInAppEventType(new SimpleDateFormat("yyyy-MM-dd_HHmmssZ", Locale.US), packageInfo.firstInstallTime));
            AFd1eSDK.onResponseNative = (AFd1eSDK.onInstallConversionFailureNative + 85) % 128;
        }
        finally {
            final Throwable t;
            com.appsflyer.AFLogger.afErrorLog("Exception while collecting application version info.", t);
        }
        this.AFVersionDeclaration.AFInAppEventType(aFa1qSDK.valueOf());
        final String afInAppEventParameterName = AFa1eSDK.AFInAppEventParameterName();
        if (afInAppEventParameterName != null) {
            AFd1eSDK.onInstallConversionFailureNative = (AFd1eSDK.onResponseNative + 5) % 128;
            aFa1qSDK.AFKeystoreWrapper("appUserId", afInAppEventParameterName);
        }
        try {
            aFa1qSDK.AFKeystoreWrapper("model", Build.MODEL);
            final int resolveOpacity = Drawable.resolveOpacity(0, 0);
            final Object[] array = { null };
            AFInAppEventParameterName("\u0085\u0084\u0083\u0082\u0081", null, null, 127 - resolveOpacity, array);
            aFa1qSDK.AFKeystoreWrapper(((String)array[0]).intern(), Build.BRAND);
        }
        finally {
            final Throwable t2;
            com.appsflyer.AFLogger.afErrorLog("Exception while collecting device brand and model.", t2);
        }
        if (!(true ^ AppsFlyerProperties.getInstance().getBoolean("deviceTrackingDisabled", false))) {
            aFa1qSDK.AFKeystoreWrapper("deviceTrackingDisabled", "true");
        }
        final AFc1uSDK.AFa1wSDK afInAppEventParameterName2 = AFa1cSDK.AFInAppEventParameterName(afInAppEventType.getContentResolver());
        if (afInAppEventParameterName2 != null) {
            aFa1qSDK.AFKeystoreWrapper("amazon_aid", afInAppEventParameterName2.valueOf);
            aFa1qSDK.AFKeystoreWrapper("amazon_aid_limit", String.valueOf(afInAppEventParameterName2.AFInAppEventType));
        }
        final String string = AppsFlyerProperties.getInstance().getString("advertiserId");
        if (string != null) {
            final int n = AFd1eSDK.onInstallConversionFailureNative + 27;
            AFd1eSDK.onResponseNative = n % 128;
            aFa1qSDK.AFKeystoreWrapper("advertiserId", string);
            if (n % 2 == 0) {
                throw null;
            }
        }
        aFa1qSDK.AFKeystoreWrapper("devkey", super.afDebugLog.AFInAppEventParameterName);
        aFa1qSDK.AFKeystoreWrapper("uid", AFb1zSDK.valueOf(this.AFLogger$LogLevel, super.afErrorLogForExcManagerOnly));
        aFa1qSDK.AFKeystoreWrapper("af_gcm_token", this.afWarnLog);
        aFa1qSDK.AFKeystoreWrapper("launch_counter", Integer.toString(super.afErrorLogForExcManagerOnly.values("appsFlyerCount", 0)));
        aFa1qSDK.AFKeystoreWrapper("sdk", Integer.toString(Build$VERSION.SDK_INT));
        final String values = this.getLevel.values();
        if (values != null) {
            aFa1qSDK.AFKeystoreWrapper("channel", values);
        }
        final int n2 = AFd1eSDK.onResponseNative + 101;
        AFd1eSDK.onInstallConversionFailureNative = n2 % 128;
        if (n2 % 2 == 0) {
            return;
        }
        throw null;
    }
    
    @Override
    public final void values() {
        AFd1eSDK.onResponseNative = (AFd1eSDK.onInstallConversionFailureNative + 97) % 128;
        super.values();
        final AFc1gSDK<Result> afErrorLog = (AFc1gSDK<Result>)super.afErrorLog;
        if (afErrorLog != null) {
            AFd1eSDK.onResponseNative = (AFd1eSDK.onInstallConversionFailureNative + 111) % 128;
            if (afErrorLog.isSuccessful()) {
                AFd1eSDK.onResponseNative = (AFd1eSDK.onInstallConversionFailureNative + 91) % 128;
                this.AFVersionDeclaration();
            }
        }
    }
}
