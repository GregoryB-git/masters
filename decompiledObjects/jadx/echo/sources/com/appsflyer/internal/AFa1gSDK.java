package com.appsflyer.internal;

import android.content.Context;
import android.content.Intent;
import androidx.annotation.NonNull;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerInAppPurchaseValidatorListener;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import com.appsflyer.internal.AFc1bSDK.AnonymousClass4;
import com.appsflyer.internal.components.network.http.ResponseNetwork;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class AFa1gSDK implements Runnable {
    private static String AFInAppEventType = "https://%ssdk-services.%s/validate-android-signature";
    private static String AFKeystoreWrapper;
    private final String AFInAppEventParameterName;
    private final String AFLogger;
    private final String afDebugLog;
    private final String afErrorLog;
    private final Map<String, String> afErrorLogForExcManagerOnly;
    private final String afInfoLog;
    private final String afRDLog;
    private final WeakReference<Context> valueOf;
    private final Intent values;

    static {
        StringBuilder sb = new StringBuilder("https://%svalidate.%s/api/v");
        sb.append(AFa1eSDK.AFKeystoreWrapper);
        sb.append("/androidevent?buildnumber=6.12.2&app_id=");
        AFKeystoreWrapper = sb.toString();
    }

    public AFa1gSDK(Context context, String str, String str2, String str3, String str4, String str5, String str6, Map<String, String> map, Intent intent) {
        this.valueOf = new WeakReference<>(context);
        this.AFInAppEventParameterName = str;
        this.afRDLog = str2;
        this.AFLogger = str4;
        this.afInfoLog = str5;
        this.afErrorLog = str6;
        this.afErrorLogForExcManagerOnly = map;
        this.afDebugLog = str3;
        this.values = intent;
    }

    private static AFd1hSDK values(Context context, @NonNull AFe1dSDK aFe1dSDK) {
        AFa1eSDK.valueOf().AFKeystoreWrapper(context);
        AFc1xSDK AFInAppEventType2 = AFa1eSDK.valueOf().AFInAppEventType();
        aFe1dSDK.AFInAppEventParameterName(AFInAppEventType2.AFInAppEventParameterName().AFInAppEventType.values("appsFlyerCount", 0));
        AFd1hSDK aFd1hSDK = new AFd1hSDK(aFe1dSDK, AFInAppEventType2);
        AFc1bSDK AFVersionDeclaration = AFInAppEventType2.AFVersionDeclaration();
        AFVersionDeclaration.AFKeystoreWrapper.execute(AFVersionDeclaration.new AnonymousClass4(aFd1hSDK));
        return aFd1hSDK;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str = this.AFInAppEventParameterName;
        if (str == null || str.length() == 0 || AppsFlyerLib.getInstance().isStopped()) {
            return;
        }
        try {
            Context context = this.valueOf.get();
            if (context == null) {
                return;
            }
            HashMap hashMap = new HashMap();
            hashMap.put("public-key", this.afRDLog);
            hashMap.put("sig-data", this.AFLogger);
            hashMap.put("signature", this.afDebugLog);
            Object hashMap2 = new HashMap(hashMap);
            Object obj = this.afErrorLogForExcManagerOnly;
            StringBuilder sb = new StringBuilder();
            sb.append(String.format(AFKeystoreWrapper, AppsFlyerLib.getInstance().getHostPrefix(), AFa1eSDK.valueOf().getHostName()));
            sb.append(context.getPackageName());
            String obj2 = sb.toString();
            String values = AFa1eSDK.valueOf().AFInAppEventType().values().values("referrer", "");
            AFa1qSDK aFe1cSDK = new AFe1cSDK();
            aFe1cSDK.afErrorLog = values;
            AFa1eSDK valueOf = AFa1eSDK.valueOf();
            Map<String, Object> AFInAppEventParameterName = valueOf.AFInAppEventParameterName(aFe1cSDK);
            AFInAppEventParameterName.put("price", this.afInfoLog);
            AFInAppEventParameterName.put("currency", this.afErrorLog);
            AFInAppEventParameterName.put("receipt_data", hashMap2);
            if (obj != null) {
                AFInAppEventParameterName.put("extra_prms", obj);
            }
            AFInAppEventParameterName.putAll(valueOf.AFInAppEventType().afWarnLog().valueOf());
            values(context, (AFe1cSDK) aFe1cSDK.values(AFInAppEventParameterName).AFKeystoreWrapper(obj2));
            hashMap.put("dev_key", this.AFInAppEventParameterName);
            hashMap.put("app_id", context.getPackageName());
            hashMap.put("uid", AppsFlyerLib.getInstance().getAppsFlyerUID(context));
            String string = AppsFlyerProperties.getInstance().getString("advertiserId");
            if (string != null) {
                hashMap.put("advertiserId", string);
            }
            AFe1eSDK aFe1eSDK = (AFe1eSDK) new AFe1eSDK().values(hashMap).AFKeystoreWrapper(String.format(AFInAppEventType, AppsFlyerLib.getInstance().getHostPrefix(), AFa1eSDK.valueOf().getHostName()));
            final AFd1hSDK values2 = values(context, aFe1eSDK);
            aFe1eSDK.AFInAppEventParameterName = new AppsFlyerRequestListener() { // from class: com.appsflyer.internal.AFa1gSDK.2
                @Override // com.appsflyer.attribution.AppsFlyerRequestListener
                public final void onError(int i7, @NonNull String str2) {
                    ResponseNetwork responseNetwork;
                    if (i7 == 50 && (responseNetwork = ((AFd1oSDK) values2).afErrorLog) != null) {
                        str2 = responseNetwork.toString();
                    }
                    AFa1gSDK.values(false, AFa1gSDK.this.AFLogger, AFa1gSDK.this.afInfoLog, AFa1gSDK.this.afErrorLog, str2);
                }

                @Override // com.appsflyer.attribution.AppsFlyerRequestListener
                public final void onSuccess() {
                    try {
                        JSONObject jSONObject = new JSONObject((String) ((AFd1oSDK) values2).afErrorLog.getBody());
                        AFLogger.afInfoLog("Validate response ok: ".concat(String.valueOf(jSONObject)));
                        AFa1gSDK.values(jSONObject.optBoolean("result"), AFa1gSDK.this.AFLogger, AFa1gSDK.this.afInfoLog, AFa1gSDK.this.afErrorLog, jSONObject.toString());
                    } catch (Exception e7) {
                        AFLogger.afErrorLog("Failed Validate request: ".concat(String.valueOf(e7)), e7);
                        AFa1gSDK.values(false, AFa1gSDK.this.AFLogger, AFa1gSDK.this.afInfoLog, AFa1gSDK.this.afErrorLog, e7.getMessage());
                    }
                }
            };
        } catch (Throwable th) {
            if (AFa1eSDK.valueOf != null) {
                AFLogger.afErrorLog("Failed Validate request + ex", th);
                values(false, this.AFLogger, this.afInfoLog, this.afErrorLog, th.getMessage());
            }
            AFLogger.afErrorLog(th.getMessage(), th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void values(boolean z7, String str, String str2, String str3, String str4) {
        if (AFa1eSDK.valueOf != null) {
            StringBuilder sb = new StringBuilder("Validate callback parameters: ");
            sb.append(str);
            sb.append(" ");
            sb.append(str2);
            sb.append(" ");
            sb.append(str3);
            AFLogger.afDebugLog(sb.toString());
            if (z7) {
                AFLogger.afDebugLog("Validate in app purchase success: ".concat(String.valueOf(str4)));
                AFa1eSDK.valueOf.onValidateInApp();
                return;
            }
            AFLogger.afDebugLog("Validate in app purchase failed: ".concat(String.valueOf(str4)));
            AppsFlyerInAppPurchaseValidatorListener appsFlyerInAppPurchaseValidatorListener = AFa1eSDK.valueOf;
            if (str4 == null) {
                str4 = "Failed validating";
            }
            appsFlyerInAppPurchaseValidatorListener.onValidateInAppFailure(str4);
        }
    }
}
