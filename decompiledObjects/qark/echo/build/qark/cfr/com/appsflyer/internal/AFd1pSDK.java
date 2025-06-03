/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.ContentResolver
 *  android.content.Context
 *  android.os.Build
 *  android.os.Build$VERSION
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.util.HashMap
 *  java.util.Map
 *  org.json.JSONObject
 */
package com.appsflyer.internal;

import android.content.ContentResolver;
import android.content.Context;
import android.os.Build;
import androidx.annotation.NonNull;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.PurchaseHandler;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import com.appsflyer.internal.AFa1aSDK;
import com.appsflyer.internal.AFa1cSDK;
import com.appsflyer.internal.AFa1fSDK;
import com.appsflyer.internal.AFb1bSDK;
import com.appsflyer.internal.AFb1dSDK;
import com.appsflyer.internal.AFb1gSDK;
import com.appsflyer.internal.AFb1tSDK;
import com.appsflyer.internal.AFb1uSDK;
import com.appsflyer.internal.AFb1zSDK;
import com.appsflyer.internal.AFc1gSDK;
import com.appsflyer.internal.AFc1uSDK;
import com.appsflyer.internal.AFc1xSDK;
import com.appsflyer.internal.AFd1oSDK;
import com.appsflyer.internal.AFd1vSDK;
import com.appsflyer.internal.AFe1vSDK;
import com.appsflyer.internal.AFe1wSDK;
import com.appsflyer.internal.components.network.http.ResponseNetwork;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public abstract class AFd1pSDK
extends AFd1oSDK<String> {
    private final String AFLogger$LogLevel;
    private final AFe1vSDK AFVersionDeclaration;
    @NonNull
    private final Map<String, Object> afErrorLogForExcManagerOnly;
    private final AFb1gSDK afInfoLog;
    private final AFb1dSDK afWarnLog;
    private final PurchaseHandler.PurchaseValidationCallback getLevel;
    private final String onInstallConversionDataLoadedNative;

    public AFd1pSDK(@NonNull AFd1vSDK object, @NonNull AFd1vSDK[] object2, @NonNull AFc1xSDK object3, String string2, Map<String, Object> hashMap, PurchaseHandler.PurchaseValidationCallback purchaseValidationCallback) {
        AFb1dSDK aFb1dSDK;
        AFb1gSDK aFb1gSDK;
        super((AFd1vSDK)((Object)object), (AFd1vSDK[])object2, (AFc1xSDK)object3, string2);
        this.afInfoLog = aFb1gSDK = object3.AFInAppEventParameterName();
        this.afWarnLog = aFb1dSDK = object3.values();
        this.AFVersionDeclaration = object3 = object3.AFLogger();
        boolean bl = hashMap.containsKey((Object)"billing_library_version");
        string2 = null;
        object = bl ? (String)hashMap.remove((Object)"billing_library_version") : null;
        this.AFLogger$LogLevel = object;
        object2 = hashMap.containsKey((Object)"connector_version") ? (String)hashMap.remove((Object)"connector_version") : null;
        this.onInstallConversionDataLoadedNative = object2;
        hashMap = new HashMap((Map)new HashMap(hashMap));
        hashMap.put((Object)"app_id", (Object)aFb1gSDK.valueOf.AFInAppEventType.getPackageName());
        hashMap.put((Object)"event_timestamp", (Object)object3.valueOf());
        object3 = AFb1gSDK.AFKeystoreWrapper();
        if (object3 != null) {
            hashMap.put((Object)"cuid", object3);
        }
        object3 = aFb1gSDK.valueOf.AFInAppEventType;
        hashMap.put((Object)"app_version_name", (Object)AFa1fSDK.AFKeystoreWrapper((Context)object3, object3.getPackageName()));
        HashMap hashMap2 = new HashMap();
        object3 = AFa1cSDK.values(aFb1gSDK.valueOf.AFInAppEventType, new HashMap());
        object3 = object3 != null ? object3.valueOf : null;
        if (!AFb1uSDK.values((String)object3)) {
            hashMap2.put((Object)"advertising_id", object3);
        }
        object3 = (object3 = AFa1cSDK.AFInAppEventParameterName(aFb1gSDK.valueOf.AFInAppEventType.getContentResolver())) != null ? object3.valueOf : null;
        if (!AFb1uSDK.values((String)object3)) {
            hashMap2.put((Object)"oaid", object3);
        }
        AFc1uSDK.AFa1wSDK aFa1wSDK = AFa1cSDK.AFInAppEventParameterName(aFb1gSDK.valueOf.AFInAppEventType.getContentResolver());
        object3 = string2;
        if (aFa1wSDK != null) {
            object3 = aFa1wSDK.valueOf;
        }
        if (!AFb1uSDK.values((String)object3)) {
            hashMap2.put((Object)"amazon_aid", object3);
        }
        if (!AppsFlyerProperties.getInstance().getBoolean("deviceTrackingDisabled", false) && !AFb1uSDK.values((String)(object3 = this.afDebugLog.valueOf(aFb1dSDK)))) {
            hashMap2.put((Object)"imei", object3);
        }
        hashMap2.put((Object)"appsflyer_id", (Object)AFb1zSDK.valueOf(aFb1gSDK.valueOf, aFb1gSDK.AFInAppEventType));
        object3 = new StringBuilder();
        object3.append(Build.VERSION.SDK_INT);
        hashMap2.put((Object)"os_version", (Object)object3.toString());
        hashMap2.put((Object)"sdk_version", (Object)"6.12.2");
        if (!AFb1uSDK.values((String)object2)) {
            hashMap2.put((Object)"sdk_connector_version", object2);
        }
        hashMap.put((Object)"device_data", (Object)hashMap2);
        if (!AFb1uSDK.values((String)object)) {
            hashMap.put((Object)"billing_lib_version", object);
        }
        this.afErrorLogForExcManagerOnly = hashMap;
        this.getLevel = purchaseValidationCallback;
    }

    @Override
    public boolean AFInAppEventParameterName() {
        AFc1gSDK aFc1gSDK = this.afErrorLog;
        if (aFc1gSDK != null && aFc1gSDK.getStatusCode() == 503) {
            return true;
        }
        return super.AFInAppEventParameterName();
    }

    public final void AFInAppEventType(String string2) {
        String string3 = new JSONObject(this.afErrorLogForExcManagerOnly).toString();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append((Object)this);
        stringBuilder.append(": preparing data: ");
        stringBuilder.append(string3);
        AFa1aSDK.values(stringBuilder.toString());
        this.afRDLog.valueOf(string2, string3);
    }

    public final String afErrorLogForExcManagerOnly() {
        return this.AFLogger$LogLevel;
    }

    @Override
    public final boolean afInfoLog() {
        return true;
    }

    @Override
    public final AppsFlyerRequestListener afRDLog() {
        return null;
    }

    @NonNull
    public final Map<String, Object> afWarnLog() {
        return this.afErrorLogForExcManagerOnly;
    }

    @Override
    public final void values() {
        PurchaseHandler.PurchaseValidationCallback purchaseValidationCallback;
        super.values();
        Object object = this.afDebugLog();
        if (object != null && (purchaseValidationCallback = this.getLevel) != null) {
            purchaseValidationCallback.onFailure((Throwable)object);
        }
        if ((object = this.afErrorLog) != null && (purchaseValidationCallback = this.getLevel) != null) {
            purchaseValidationCallback.onResponse((ResponseNetwork<String>)object);
        }
    }
}

