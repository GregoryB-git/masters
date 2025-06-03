/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.lang.ref.WeakReference
 *  java.util.HashMap
 *  java.util.Map
 *  java.util.concurrent.Executor
 *  org.json.JSONObject
 */
package com.appsflyer.internal;

import android.content.Context;
import android.content.Intent;
import androidx.annotation.NonNull;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerInAppPurchaseValidatorListener;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import com.appsflyer.internal.AFa1eSDK;
import com.appsflyer.internal.AFa1qSDK;
import com.appsflyer.internal.AFb1dSDK;
import com.appsflyer.internal.AFb1gSDK;
import com.appsflyer.internal.AFc1bSDK;
import com.appsflyer.internal.AFc1gSDK;
import com.appsflyer.internal.AFc1xSDK;
import com.appsflyer.internal.AFd1hSDK;
import com.appsflyer.internal.AFd1oSDK;
import com.appsflyer.internal.AFd1zSDK;
import com.appsflyer.internal.AFe1cSDK;
import com.appsflyer.internal.AFe1dSDK;
import com.appsflyer.internal.AFe1eSDK;
import com.appsflyer.internal.AFe1wSDK;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import org.json.JSONObject;

public final class AFa1gSDK
implements Runnable {
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
        StringBuilder stringBuilder = new StringBuilder("https://%svalidate.%s/api/v");
        stringBuilder.append(AFa1eSDK.AFKeystoreWrapper);
        stringBuilder.append("/androidevent?buildnumber=6.12.2&app_id=");
        AFKeystoreWrapper = stringBuilder.toString();
    }

    public AFa1gSDK(Context context, String string2, String string3, String string4, String string5, String string6, String string7, Map<String, String> map, Intent intent) {
        this.valueOf = new WeakReference((Object)context);
        this.AFInAppEventParameterName = string2;
        this.afRDLog = string3;
        this.AFLogger = string5;
        this.afInfoLog = string6;
        this.afErrorLog = string7;
        this.afErrorLogForExcManagerOnly = map;
        this.afDebugLog = string4;
        this.values = intent;
    }

    private static AFd1hSDK values(Context object, @NonNull AFe1dSDK object2) {
        AFa1eSDK.valueOf().AFKeystoreWrapper((Context)object);
        object = AFa1eSDK.valueOf().AFInAppEventType();
        object2.AFInAppEventParameterName(object.AFInAppEventParameterName().AFInAppEventType.values("appsFlyerCount", 0));
        object2 = new AFd1hSDK((AFa1qSDK)object2, (AFc1xSDK)object);
        object = object.AFVersionDeclaration();
        object.AFKeystoreWrapper.execute(new Runnable((AFc1bSDK)object, (AFd1zSDK)object2){
            private /* synthetic */ AFd1zSDK AFInAppEventType;
            private /* synthetic */ AFc1bSDK AFKeystoreWrapper;
            {
                this.AFKeystoreWrapper = aFc1bSDK;
                this.AFInAppEventType = aFd1zSDK;
            }

            /*
             * Enabled aggressive block sorting
             * Enabled unnecessary exception pruning
             * Enabled aggressive exception aggregation
             * Converted monitor instructions to comments
             * Lifted jumps to return sites
             */
            public final void run() {
                java.util.NavigableSet<AFd1zSDK<?>> navigableSet;
                int n8;
                Object object;
                block20 : {
                    block21 : {
                        boolean bl;
                        navigableSet = this.AFKeystoreWrapper.AFLogger;
                        // MONITORENTER : navigableSet
                        if (this.AFKeystoreWrapper.afErrorLog.contains((Object)this.AFInAppEventType)) {
                            StringBuilder stringBuilder = new StringBuilder("QUEUE: tried to add already running task: ");
                            stringBuilder.append((Object)this.AFInAppEventType);
                            AFLogger.afDebugLog(stringBuilder.toString());
                            // MONITOREXIT : navigableSet
                            return;
                        }
                        if (this.AFKeystoreWrapper.AFLogger.contains((Object)this.AFInAppEventType) || this.AFKeystoreWrapper.afInfoLog.contains((Object)this.AFInAppEventType)) break block20;
                        java.util.NavigableSet<AFd1zSDK<?>> navigableSet22 = this.AFKeystoreWrapper;
                        object = this.AFInAppEventType;
                        for (com.appsflyer.internal.AFd1vSDK aFd1vSDK : object.AFKeystoreWrapper) {
                            if (!navigableSet22.valueOf.contains((Object)((Object)aFd1vSDK))) continue;
                            object.AFInAppEventParameterName.add((Object)((Object)aFd1vSDK));
                        }
                        if (AFc1bSDK.values(this.AFKeystoreWrapper, this.AFInAppEventType)) {
                            bl = this.AFKeystoreWrapper.AFLogger.add((Object)this.AFInAppEventType);
                        } else {
                            boolean bl2;
                            bl = bl2 = this.AFKeystoreWrapper.afInfoLog.add((Object)this.AFInAppEventType);
                            if (bl2) {
                                navigableSet22 = new StringBuilder("QUEUE: new task was blocked: ");
                                navigableSet22.append((Object)this.AFInAppEventType);
                                AFLogger.afDebugLog(navigableSet22.toString());
                                this.AFInAppEventType.AFKeystoreWrapper();
                                bl = bl2;
                            }
                        }
                        if (bl) {
                            navigableSet22 = this.AFKeystoreWrapper;
                            navigableSet22.AFLogger.addAll(navigableSet22.afDebugLog);
                            this.AFKeystoreWrapper.afDebugLog.clear();
                        } else {
                            navigableSet22 = new StringBuilder("QUEUE: task not added, it's already in the queue: ");
                            navigableSet22.append((Object)this.AFInAppEventType);
                            AFLogger.afDebugLog(navigableSet22.toString());
                        }
                        // MONITOREXIT : navigableSet
                        if (!bl) break block21;
                        this.AFKeystoreWrapper.valueOf.add((Object)((Object)this.AFInAppEventType.values));
                        navigableSet = new StringBuilder("QUEUE: new task added: ");
                        navigableSet.append((Object)this.AFInAppEventType);
                        AFLogger.afDebugLog(navigableSet.toString());
                        for (java.util.NavigableSet<AFd1zSDK<?>> navigableSet22 : this.AFKeystoreWrapper.values) {
                        }
                        navigableSet = this.AFKeystoreWrapper;
                        navigableSet.AFInAppEventParameterName.submit((Runnable)navigableSet);
                        object = this.AFKeystoreWrapper;
                        navigableSet22 = object.AFLogger;
                        // MONITORENTER : navigableSet22
                        n8 = object.AFLogger.size() + object.afInfoLog.size() - 40;
                    }
                    navigableSet = new StringBuilder("QUEUE: tried to add already pending task: ");
                    navigableSet.append((Object)this.AFInAppEventType);
                    AFLogger.afWarnLog(navigableSet.toString());
                    return;
                }
                StringBuilder stringBuilder = new StringBuilder("QUEUE: tried to add already scheduled task: ");
                stringBuilder.append((Object)this.AFInAppEventType);
                AFLogger.afDebugLog(stringBuilder.toString());
                // MONITOREXIT : navigableSet
                return;
                do {
                    block25 : {
                        block23 : {
                            boolean bl;
                            block24 : {
                                boolean bl3;
                                block22 : {
                                    if (n8 <= 0) {
                                        // MONITOREXIT : navigableSet22
                                        return;
                                    }
                                    bl = object.afInfoLog.isEmpty() ^ true;
                                    bl3 = object.AFLogger.isEmpty() ^ true;
                                    if (!bl3 || !bl) break block22;
                                    navigableSet = ((AFd1zSDK)object.AFLogger.first()).AFKeystoreWrapper((AFd1zSDK)object.afInfoLog.first()) > 0 ? object.AFLogger : object.afInfoLog;
                                    break block23;
                                }
                                if (!bl3) break block24;
                                navigableSet = object.AFLogger;
                                break block23;
                            }
                            if (!bl) break block25;
                            navigableSet = object.afInfoLog;
                        }
                        object.AFInAppEventParameterName(navigableSet);
                    }
                    --n8;
                } while (true);
            }
        });
        return object2;
    }

    private static void values(boolean bl, String string2, String object, String string3, String string4) {
        if (AFa1eSDK.valueOf != null) {
            StringBuilder stringBuilder = new StringBuilder("Validate callback parameters: ");
            stringBuilder.append(string2);
            stringBuilder.append(" ");
            stringBuilder.append((String)object);
            stringBuilder.append(" ");
            stringBuilder.append(string3);
            AFLogger.afDebugLog(stringBuilder.toString());
            if (bl) {
                AFLogger.afDebugLog("Validate in app purchase success: ".concat(String.valueOf((Object)string4)));
                AFa1eSDK.valueOf.onValidateInApp();
                return;
            }
            AFLogger.afDebugLog("Validate in app purchase failed: ".concat(String.valueOf((Object)string4)));
            object = AFa1eSDK.valueOf;
            string2 = string4;
            if (string4 == null) {
                string2 = "Failed validating";
            }
            object.onValidateInAppFailure(string2);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void run() {
        String string2 = this.AFInAppEventParameterName;
        if (string2 != null) {
            if (string2.length() == 0) {
                return;
            }
            if (AppsFlyerLib.getInstance().isStopped()) {
                return;
            }
            try {
                string2 = (Context)this.valueOf.get();
                if (string2 == null) {
                    return;
                }
                Object object = new HashMap();
                object.put((Object)"public-key", (Object)this.afRDLog);
                object.put((Object)"sig-data", (Object)this.AFLogger);
                object.put((Object)"signature", (Object)this.afDebugLog);
                Object object2 = new HashMap((Map)object);
                Map<String, String> map = this.afErrorLogForExcManagerOnly;
                Object object3 = new StringBuilder();
                object3.append(String.format((String)AFKeystoreWrapper, (Object[])new Object[]{AppsFlyerLib.getInstance().getHostPrefix(), AFa1eSDK.valueOf().getHostName()}));
                object3.append(string2.getPackageName());
                object3 = object3.toString();
                Object object4 = AFa1eSDK.valueOf().AFInAppEventType().values().values("referrer", "");
                AFe1cSDK aFe1cSDK = new AFe1cSDK();
                aFe1cSDK.afErrorLog = object4;
                object4 = AFa1eSDK.valueOf();
                Map<String, Object> map2 = object4.AFInAppEventParameterName(aFe1cSDK);
                map2.put((Object)"price", (Object)this.afInfoLog);
                map2.put((Object)"currency", (Object)this.afErrorLog);
                map2.put((Object)"receipt_data", object2);
                if (map != null) {
                    map2.put((Object)"extra_prms", map);
                }
                map2.putAll(object4.AFInAppEventType().afWarnLog().valueOf());
                AFa1gSDK.values((Context)string2, (AFe1cSDK)aFe1cSDK.values(map2).AFKeystoreWrapper((String)object3));
                object.put((Object)"dev_key", (Object)this.AFInAppEventParameterName);
                object.put((Object)"app_id", (Object)string2.getPackageName());
                object.put((Object)"uid", (Object)AppsFlyerLib.getInstance().getAppsFlyerUID((Context)string2));
                object2 = AppsFlyerProperties.getInstance().getString("advertiserId");
                if (object2 != null) {
                    object.put((Object)"advertiserId", object2);
                }
                object2 = String.format((String)AFInAppEventType, (Object[])new Object[]{AppsFlyerLib.getInstance().getHostPrefix(), AFa1eSDK.valueOf().getHostName()});
                object = (AFe1eSDK)new AFe1eSDK().values(object).AFKeystoreWrapper((String)object2);
                object.AFInAppEventParameterName = new AppsFlyerRequestListener(this, AFa1gSDK.values((Context)string2, (AFe1dSDK)object)){
                    private /* synthetic */ AFd1hSDK AFInAppEventParameterName;
                    private /* synthetic */ AFa1gSDK AFKeystoreWrapper;
                    {
                        this.AFKeystoreWrapper = aFa1gSDK;
                        this.AFInAppEventParameterName = aFd1hSDK;
                    }

                    @Override
                    public final void onError(int n8, @NonNull String string2) {
                        String string3 = string2;
                        if (n8 == 50) {
                            AFc1gSDK aFc1gSDK = this.AFInAppEventParameterName.afErrorLog;
                            string3 = string2;
                            if (aFc1gSDK != null) {
                                string3 = aFc1gSDK.toString();
                            }
                        }
                        AFa1gSDK.values(false, this.AFKeystoreWrapper.AFLogger, this.AFKeystoreWrapper.afInfoLog, this.AFKeystoreWrapper.afErrorLog, string3);
                    }

                    @Override
                    public final void onSuccess() {
                        JSONObject jSONObject = this.AFInAppEventParameterName.afErrorLog;
                        try {
                            jSONObject = new JSONObject((String)jSONObject.getBody());
                            AFLogger.afInfoLog("Validate response ok: ".concat(String.valueOf((Object)jSONObject)));
                            AFa1gSDK.values(jSONObject.optBoolean("result"), this.AFKeystoreWrapper.AFLogger, this.AFKeystoreWrapper.afInfoLog, this.AFKeystoreWrapper.afErrorLog, jSONObject.toString());
                            return;
                        }
                        catch (Exception exception) {
                            AFLogger.afErrorLog("Failed Validate request: ".concat(String.valueOf((Object)exception)), (Throwable)exception);
                            AFa1gSDK.values(false, this.AFKeystoreWrapper.AFLogger, this.AFKeystoreWrapper.afInfoLog, this.AFKeystoreWrapper.afErrorLog, exception.getMessage());
                            return;
                        }
                    }
                };
                return;
            }
            catch (Throwable throwable) {}
            if (AFa1eSDK.valueOf != null) {
                AFLogger.afErrorLog("Failed Validate request + ex", throwable);
                AFa1gSDK.values(false, this.AFLogger, this.afInfoLog, this.afErrorLog, throwable.getMessage());
            }
            AFLogger.afErrorLog(throwable.getMessage(), throwable);
        }
    }

}

