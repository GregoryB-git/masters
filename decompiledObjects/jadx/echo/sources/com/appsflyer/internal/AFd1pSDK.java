package com.appsflyer.internal;

import android.content.Context;
import android.os.Build;
import androidx.annotation.NonNull;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.PurchaseHandler;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import com.appsflyer.internal.AFc1uSDK;
import com.appsflyer.internal.components.network.http.ResponseNetwork;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class AFd1pSDK extends AFd1oSDK<String> {
    private final String AFLogger$LogLevel;
    private final AFe1vSDK AFVersionDeclaration;

    @NonNull
    private final Map<String, Object> afErrorLogForExcManagerOnly;
    private final AFb1gSDK afInfoLog;
    private final AFb1dSDK afWarnLog;
    private final PurchaseHandler.PurchaseValidationCallback getLevel;
    private final String onInstallConversionDataLoadedNative;

    public AFd1pSDK(@NonNull AFd1vSDK aFd1vSDK, @NonNull AFd1vSDK[] aFd1vSDKArr, @NonNull AFc1xSDK aFc1xSDK, String str, Map<String, Object> map, PurchaseHandler.PurchaseValidationCallback purchaseValidationCallback) {
        super(aFd1vSDK, aFd1vSDKArr, aFc1xSDK, str);
        AFb1gSDK AFInAppEventParameterName = aFc1xSDK.AFInAppEventParameterName();
        this.afInfoLog = AFInAppEventParameterName;
        AFb1dSDK values = aFc1xSDK.values();
        this.afWarnLog = values;
        AFe1vSDK AFLogger = aFc1xSDK.AFLogger();
        this.AFVersionDeclaration = AFLogger;
        String str2 = map.containsKey("billing_library_version") ? (String) map.remove("billing_library_version") : null;
        this.AFLogger$LogLevel = str2;
        String str3 = map.containsKey("connector_version") ? (String) map.remove("connector_version") : null;
        this.onInstallConversionDataLoadedNative = str3;
        HashMap hashMap = new HashMap(new HashMap(map));
        hashMap.put("app_id", AFInAppEventParameterName.valueOf.AFInAppEventType.getPackageName());
        hashMap.put("event_timestamp", Long.valueOf(AFLogger.valueOf()));
        String AFKeystoreWrapper = AFb1gSDK.AFKeystoreWrapper();
        if (AFKeystoreWrapper != null) {
            hashMap.put("cuid", AFKeystoreWrapper);
        }
        Context context = AFInAppEventParameterName.valueOf.AFInAppEventType;
        hashMap.put("app_version_name", AFa1fSDK.AFKeystoreWrapper(context, context.getPackageName()));
        HashMap hashMap2 = new HashMap();
        AFc1uSDK.AFa1wSDK values2 = AFa1cSDK.values(AFInAppEventParameterName.valueOf.AFInAppEventType, new HashMap());
        String str4 = values2 != null ? values2.valueOf : null;
        if (!AFb1uSDK.values(str4)) {
            hashMap2.put("advertising_id", str4);
        }
        AFc1uSDK.AFa1wSDK AFInAppEventParameterName2 = AFa1cSDK.AFInAppEventParameterName(AFInAppEventParameterName.valueOf.AFInAppEventType.getContentResolver());
        String str5 = AFInAppEventParameterName2 != null ? AFInAppEventParameterName2.valueOf : null;
        if (!AFb1uSDK.values(str5)) {
            hashMap2.put("oaid", str5);
        }
        AFc1uSDK.AFa1wSDK AFInAppEventParameterName3 = AFa1cSDK.AFInAppEventParameterName(AFInAppEventParameterName.valueOf.AFInAppEventType.getContentResolver());
        String str6 = AFInAppEventParameterName3 != null ? AFInAppEventParameterName3.valueOf : null;
        if (!AFb1uSDK.values(str6)) {
            hashMap2.put("amazon_aid", str6);
        }
        if (!AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.DEVICE_TRACKING_DISABLED, false)) {
            String valueOf = ((AFd1oSDK) this).afDebugLog.valueOf(values);
            if (!AFb1uSDK.values(valueOf)) {
                hashMap2.put("imei", valueOf);
            }
        }
        hashMap2.put("appsflyer_id", AFb1zSDK.valueOf(AFInAppEventParameterName.valueOf, AFInAppEventParameterName.AFInAppEventType));
        StringBuilder sb = new StringBuilder();
        sb.append(Build.VERSION.SDK_INT);
        hashMap2.put("os_version", sb.toString());
        hashMap2.put("sdk_version", "6.12.2");
        if (!AFb1uSDK.values(str3)) {
            hashMap2.put("sdk_connector_version", str3);
        }
        hashMap.put("device_data", hashMap2);
        if (!AFb1uSDK.values(str2)) {
            hashMap.put("billing_lib_version", str2);
        }
        this.afErrorLogForExcManagerOnly = hashMap;
        this.getLevel = purchaseValidationCallback;
    }

    @Override // com.appsflyer.internal.AFd1oSDK, com.appsflyer.internal.AFd1zSDK
    public boolean AFInAppEventParameterName() {
        ResponseNetwork responseNetwork = ((AFd1oSDK) this).afErrorLog;
        if (responseNetwork == null || responseNetwork.getStatusCode() != 503) {
            return super.AFInAppEventParameterName();
        }
        return true;
    }

    public final void AFInAppEventType(String str) {
        String jSONObject = new JSONObject(this.afErrorLogForExcManagerOnly).toString();
        StringBuilder sb = new StringBuilder();
        sb.append(this);
        sb.append(": preparing data: ");
        sb.append(jSONObject);
        AFa1aSDK.values(sb.toString());
        this.afRDLog.valueOf(str, jSONObject);
    }

    public final String afErrorLogForExcManagerOnly() {
        return this.AFLogger$LogLevel;
    }

    @Override // com.appsflyer.internal.AFd1oSDK
    public final boolean afInfoLog() {
        return true;
    }

    @Override // com.appsflyer.internal.AFd1oSDK
    public final AppsFlyerRequestListener afRDLog() {
        return null;
    }

    @NonNull
    public final Map<String, Object> afWarnLog() {
        return this.afErrorLogForExcManagerOnly;
    }

    @Override // com.appsflyer.internal.AFd1oSDK, com.appsflyer.internal.AFd1zSDK
    public final void values() {
        PurchaseHandler.PurchaseValidationCallback purchaseValidationCallback;
        PurchaseHandler.PurchaseValidationCallback purchaseValidationCallback2;
        super.values();
        Throwable afDebugLog = afDebugLog();
        if (afDebugLog != null && (purchaseValidationCallback2 = this.getLevel) != null) {
            purchaseValidationCallback2.onFailure(afDebugLog);
        }
        ResponseNetwork<String> responseNetwork = ((AFd1oSDK) this).afErrorLog;
        if (responseNetwork == null || (purchaseValidationCallback = this.getLevel) == null) {
            return;
        }
        purchaseValidationCallback.onResponse(responseNetwork);
    }
}
