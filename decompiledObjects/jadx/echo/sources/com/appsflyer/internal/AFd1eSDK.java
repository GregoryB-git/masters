package com.appsflyer.internal;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.drawable.Drawable;
import android.os.Build;
import androidx.annotation.NonNull;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.internal.AFc1uSDK;
import com.appsflyer.internal.components.network.http.ResponseNetwork;
import java.text.SimpleDateFormat;
import java.util.Locale;

/* loaded from: classes.dex */
public final class AFd1eSDK extends AFd1hSDK {
    private static boolean onAppOpenAttributionNative = true;
    private static int onInstallConversionFailureNative = 0;
    private static int onResponseNative = 1;
    private final AFb1bSDK AFLogger$LogLevel;
    private final AFe1vSDK AFVersionDeclaration;
    private final String afWarnLog;
    private final AFb1gSDK getLevel;
    private static char[] AppsFlyer2dXConversionCallback = {172, 188, 171, 184, 174};
    private static boolean init = true;
    private static int onInstallConversionDataLoadedNative = 74;

    public AFd1eSDK(@NonNull String str, @NonNull AFc1xSDK aFc1xSDK) {
        super(new AFe1uSDK(aFc1xSDK.init().AFInAppEventType), aFc1xSDK, str);
        this.getLevel = aFc1xSDK.AFInAppEventParameterName();
        this.AFLogger$LogLevel = aFc1xSDK.init();
        this.afWarnLog = str;
        this.AFVersionDeclaration = aFc1xSDK.AFLogger();
    }

    private static void AFInAppEventParameterName(String str, String str2, int[] iArr, int i7, Object[] objArr) {
        char[] cArr = str2;
        if (str2 != null) {
            cArr = str2.toCharArray();
        }
        char[] cArr2 = cArr;
        byte[] bArr = str;
        if (str != null) {
            bArr = str.getBytes("ISO-8859-1");
        }
        byte[] bArr2 = bArr;
        synchronized (AFg1tSDK.AFKeystoreWrapper) {
            try {
                char[] cArr3 = AppsFlyer2dXConversionCallback;
                int i8 = onInstallConversionDataLoadedNative;
                if (init) {
                    int length = bArr2.length;
                    AFg1tSDK.values = length;
                    char[] cArr4 = new char[length];
                    AFg1tSDK.valueOf = 0;
                    while (AFg1tSDK.valueOf < AFg1tSDK.values) {
                        int i9 = AFg1tSDK.valueOf;
                        int i10 = AFg1tSDK.values - 1;
                        int i11 = AFg1tSDK.valueOf;
                        cArr4[i9] = (char) (cArr3[bArr2[i10 - i11] + i7] - i8);
                        AFg1tSDK.valueOf = i11 + 1;
                    }
                    objArr[0] = new String(cArr4);
                    return;
                }
                if (onAppOpenAttributionNative) {
                    int length2 = cArr2.length;
                    AFg1tSDK.values = length2;
                    char[] cArr5 = new char[length2];
                    AFg1tSDK.valueOf = 0;
                    while (AFg1tSDK.valueOf < AFg1tSDK.values) {
                        int i12 = AFg1tSDK.valueOf;
                        int i13 = AFg1tSDK.values - 1;
                        int i14 = AFg1tSDK.valueOf;
                        cArr5[i12] = (char) (cArr3[cArr2[i13 - i14] - i7] - i8);
                        AFg1tSDK.valueOf = i14 + 1;
                    }
                    objArr[0] = new String(cArr5);
                    return;
                }
                int length3 = iArr.length;
                AFg1tSDK.values = length3;
                char[] cArr6 = new char[length3];
                AFg1tSDK.valueOf = 0;
                while (AFg1tSDK.valueOf < AFg1tSDK.values) {
                    int i15 = AFg1tSDK.valueOf;
                    int i16 = AFg1tSDK.values - 1;
                    int i17 = AFg1tSDK.valueOf;
                    cArr6[i15] = (char) (cArr3[iArr[i16 - i17] - i7] - i8);
                    AFg1tSDK.valueOf = i17 + 1;
                }
                objArr[0] = new String(cArr6);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void AFVersionDeclaration() {
        onResponseNative = (onInstallConversionFailureNative + 27) % 128;
        this.afErrorLogForExcManagerOnly.values("sentRegisterRequestToAF", true);
        AFLogger.afDebugLog("[register] Successfully registered for Uninstall Tracking");
        onResponseNative = (onInstallConversionFailureNative + 29) % 128;
    }

    @Override // com.appsflyer.internal.AFd1hSDK, com.appsflyer.internal.AFd1oSDK
    public final boolean afInfoLog() {
        int i7 = onInstallConversionFailureNative + 1;
        int i8 = i7 % 128;
        onResponseNative = i8;
        boolean z7 = i7 % 2 == 0;
        int i9 = i8 + 115;
        onInstallConversionFailureNative = i9 % 128;
        if (i9 % 2 == 0) {
            return z7;
        }
        throw null;
    }

    @Override // com.appsflyer.internal.AFd1hSDK
    public final void valueOf(AFa1qSDK aFa1qSDK) {
        super.valueOf(aFa1qSDK);
        Context context = this.AFLogger$LogLevel.AFInAppEventType;
        AFa1eSDK valueOf = AFa1eSDK.valueOf();
        if (context == null) {
            throw new IllegalStateException("Context is not provided, can't send register request");
        }
        if (valueOf.AFKeystoreWrapper()) {
            AFLogger.afInfoLog("CustomerUserId not set, Tracking is disabled", true);
            throw new IllegalStateException("CustomerUserId not set, register is not sent");
        }
        PackageManager packageManager = context.getPackageManager();
        try {
            PackageInfo packageInfo = packageManager.getPackageInfo(context.getPackageName(), 0);
            aFa1qSDK.AFKeystoreWrapper("app_version_code", Integer.toString(packageInfo.versionCode));
            aFa1qSDK.AFKeystoreWrapper("app_version_name", packageInfo.versionName);
            aFa1qSDK.AFKeystoreWrapper("app_name", packageManager.getApplicationLabel(packageInfo.applicationInfo).toString());
            aFa1qSDK.AFKeystoreWrapper("installDate", AFa1eSDK.AFInAppEventType(new SimpleDateFormat("yyyy-MM-dd_HHmmssZ", Locale.US), packageInfo.firstInstallTime));
            onResponseNative = (onInstallConversionFailureNative + 85) % 128;
        } catch (Throwable th) {
            AFLogger.afErrorLog("Exception while collecting application version info.", th);
        }
        this.AFVersionDeclaration.AFInAppEventType(aFa1qSDK.valueOf());
        String AFInAppEventParameterName = AFa1eSDK.AFInAppEventParameterName();
        if (AFInAppEventParameterName != null) {
            onInstallConversionFailureNative = (onResponseNative + 5) % 128;
            aFa1qSDK.AFKeystoreWrapper("appUserId", AFInAppEventParameterName);
        }
        try {
            aFa1qSDK.AFKeystoreWrapper("model", Build.MODEL);
            Object[] objArr = new Object[1];
            AFInAppEventParameterName("\u0085\u0084\u0083\u0082\u0081", null, null, 127 - Drawable.resolveOpacity(0, 0), objArr);
            aFa1qSDK.AFKeystoreWrapper(((String) objArr[0]).intern(), Build.BRAND);
        } catch (Throwable th2) {
            AFLogger.afErrorLog("Exception while collecting device brand and model.", th2);
        }
        if (!(true ^ AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.DEVICE_TRACKING_DISABLED, false))) {
            aFa1qSDK.AFKeystoreWrapper(AppsFlyerProperties.DEVICE_TRACKING_DISABLED, "true");
        }
        AFc1uSDK.AFa1wSDK AFInAppEventParameterName2 = AFa1cSDK.AFInAppEventParameterName(context.getContentResolver());
        if (AFInAppEventParameterName2 != null) {
            aFa1qSDK.AFKeystoreWrapper("amazon_aid", AFInAppEventParameterName2.valueOf);
            aFa1qSDK.AFKeystoreWrapper("amazon_aid_limit", String.valueOf(AFInAppEventParameterName2.AFInAppEventType));
        }
        String string = AppsFlyerProperties.getInstance().getString("advertiserId");
        if (string != null) {
            int i7 = onInstallConversionFailureNative + 27;
            onResponseNative = i7 % 128;
            int i8 = i7 % 2;
            aFa1qSDK.AFKeystoreWrapper("advertiserId", string);
            if (i8 == 0) {
                throw null;
            }
        }
        aFa1qSDK.AFKeystoreWrapper("devkey", ((AFd1oSDK) this).afDebugLog.AFInAppEventParameterName);
        aFa1qSDK.AFKeystoreWrapper("uid", AFb1zSDK.valueOf(this.AFLogger$LogLevel, this.afErrorLogForExcManagerOnly));
        aFa1qSDK.AFKeystoreWrapper("af_gcm_token", this.afWarnLog);
        aFa1qSDK.AFKeystoreWrapper("launch_counter", Integer.toString(this.afErrorLogForExcManagerOnly.values("appsFlyerCount", 0)));
        aFa1qSDK.AFKeystoreWrapper("sdk", Integer.toString(Build.VERSION.SDK_INT));
        String values = this.getLevel.values();
        if (values != null) {
            aFa1qSDK.AFKeystoreWrapper(AppsFlyerProperties.CHANNEL, values);
        }
        int i9 = onResponseNative + 101;
        onInstallConversionFailureNative = i9 % 128;
        if (i9 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.internal.AFd1oSDK, com.appsflyer.internal.AFd1zSDK
    public final void values() {
        onResponseNative = (onInstallConversionFailureNative + 97) % 128;
        super.values();
        ResponseNetwork responseNetwork = ((AFd1oSDK) this).afErrorLog;
        if (responseNetwork != null) {
            onResponseNative = (onInstallConversionFailureNative + 111) % 128;
            if (responseNetwork.isSuccessful()) {
                onResponseNative = (onInstallConversionFailureNative + 91) % 128;
                AFVersionDeclaration();
            }
        }
    }
}
