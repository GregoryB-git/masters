/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.net.Uri
 *  android.net.Uri$Builder
 *  android.os.Build
 *  android.os.Build$VERSION
 *  java.io.IOException
 *  java.lang.Boolean
 *  java.lang.Class
 *  java.lang.IllegalStateException
 *  java.lang.InterruptedException
 *  java.lang.Long
 *  java.lang.NoSuchFieldError
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 *  java.lang.Throwable
 *  java.net.HttpURLConnection
 *  java.text.SimpleDateFormat
 *  java.util.ArrayList
 *  java.util.Date
 *  java.util.HashMap
 *  java.util.Iterator
 *  java.util.List
 *  java.util.Locale
 *  java.util.Map
 *  java.util.Observable
 *  java.util.Observer
 *  java.util.TimeZone
 *  java.util.concurrent.Callable
 *  java.util.concurrent.CountDownLatch
 *  java.util.concurrent.ExecutionException
 *  java.util.concurrent.ExecutorService
 *  java.util.concurrent.FutureTask
 *  java.util.concurrent.TimeUnit
 *  java.util.concurrent.TimeoutException
 *  org.json.JSONObject
 */
package com.appsflyer.internal;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.deeplink.DeepLink;
import com.appsflyer.deeplink.DeepLinkResult;
import com.appsflyer.internal.AFa1cSDK;
import com.appsflyer.internal.AFa1eSDK;
import com.appsflyer.internal.AFa1qSDK;
import com.appsflyer.internal.AFa1uSDK;
import com.appsflyer.internal.AFb1bSDK;
import com.appsflyer.internal.AFb1dSDK;
import com.appsflyer.internal.AFb1gSDK;
import com.appsflyer.internal.AFb1sSDK;
import com.appsflyer.internal.AFb1tSDK;
import com.appsflyer.internal.AFb1zSDK;
import com.appsflyer.internal.AFc1nSDK;
import com.appsflyer.internal.AFc1uSDK;
import com.appsflyer.internal.AFc1xSDK;
import com.appsflyer.internal.AFd1vSDK;
import com.appsflyer.internal.AFe1jSDK;
import com.appsflyer.internal.AFe1mSDK;
import com.appsflyer.internal.AFe1wSDK;
import com.appsflyer.internal.AFf1oSDK;
import com.appsflyer.internal.AFf1pSDK;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Observable;
import java.util.Observer;
import java.util.TimeZone;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONObject;

public final class AFb1mSDK
extends AFe1jSDK {
    private static String AFLogger$LogLevel = "https://%sdlsdk.%s/v1.0/android/";
    private final AFe1mSDK AFVersionDeclaration;
    private final ExecutorService AppsFlyer2dXConversionCallback;
    private final CountDownLatch afWarnLog = new CountDownLatch(1);
    private final List<AFf1pSDK> getLevel = new ArrayList();
    private final AFe1wSDK init;
    private final AFb1tSDK onAppOpenAttributionNative;
    private int onAttributionFailureNative;
    private boolean onConversionDataSuccess;
    private final AFb1sSDK onDeepLinkingNative;
    private final AFb1gSDK onInstallConversionDataLoadedNative;
    private final AFf1oSDK onInstallConversionFailureNative;
    private int onResponseErrorNative;
    private int onResponseNative;

    public AFb1mSDK(AFc1xSDK aFc1xSDK) {
        super(null, AFLogger$LogLevel, Boolean.FALSE, Boolean.TRUE, null);
        this.AFVersionDeclaration = aFc1xSDK.afDebugLog();
        this.onInstallConversionDataLoadedNative = aFc1xSDK.AFInAppEventParameterName();
        this.init = aFc1xSDK.afWarnLog();
        this.onInstallConversionFailureNative = aFc1xSDK.AFLogger$LogLevel();
        this.AppsFlyer2dXConversionCallback = aFc1xSDK.AFInAppEventType();
        this.onAppOpenAttributionNative = aFc1xSDK.afErrorLogForExcManagerOnly();
        this.onDeepLinkingNative = aFc1xSDK.AppsFlyer2dXConversionCallback();
    }

    private static boolean AFInAppEventParameterName(AFf1pSDK aFf1pSDK) {
        aFf1pSDK = (Long)aFf1pSDK.AFInAppEventParameterName.get((Object)"click_ts");
        if (aFf1pSDK == null) {
            return false;
        }
        if (System.currentTimeMillis() - TimeUnit.SECONDS.toMillis(aFf1pSDK.longValue()) < TimeUnit.DAYS.toMillis(1L)) {
            return true;
        }
        return false;
    }

    public static /* synthetic */ DeepLinkResult AFInAppEventType(AFb1mSDK aFb1mSDK) {
        Object object;
        block16 : {
            do {
                long l8;
                AFe1mSDK aFe1mSDK;
                object = aFb1mSDK.AFVersionDeclaration;
                int n8 = aFb1mSDK.onResponseNative;
                if (n8 > 0 && n8 <= 2) {
                    object.afDebugLog[--n8] = System.currentTimeMillis();
                    if (n8 == 0) {
                        l8 = object.afErrorLog;
                        if (l8 != 0L) {
                            object.AFInAppEventType.put((Object)"from_fg", (Object)(object.afDebugLog[n8] - l8));
                            aFe1mSDK = new JSONObject(object.AFInAppEventType);
                            object.valueOf.AFInAppEventParameterName("ddl", aFe1mSDK.toString());
                        } else {
                            AFLogger.afInfoLog("Metrics: fg ts is missing");
                        }
                    }
                } else {
                    AFLogger.afErrorLogForExcManagerOnly("Unexpected ddl requestCount - start", (Throwable)new IllegalStateException("Metrics: Unexpected ddl requestCount = ".concat(String.valueOf((int)n8))));
                }
                object = new AFa1uSDK(aFb1mSDK, aFb1mSDK.onAppOpenAttributionNative).AFInAppEventParameterName(aFb1mSDK.init.AFInAppEventParameterName);
                aFe1mSDK = aFb1mSDK.AFVersionDeclaration;
                n8 = aFb1mSDK.onResponseNative;
                if (n8 > 0 && n8 <= 2) {
                    aFe1mSDK.afInfoLog[--n8] = System.currentTimeMillis();
                    l8 = aFe1mSDK.afDebugLog[n8];
                    if (l8 != 0L) {
                        JSONObject jSONObject = aFe1mSDK.afRDLog;
                        jSONObject[n8] = aFe1mSDK.afInfoLog[n8] - l8;
                        aFe1mSDK.AFInAppEventType.put((Object)"net", (Object)jSONObject);
                        jSONObject = new JSONObject(aFe1mSDK.AFInAppEventType);
                        aFe1mSDK.valueOf.AFInAppEventParameterName("ddl", jSONObject.toString());
                    } else {
                        aFe1mSDK = new StringBuilder("Metrics: ddlStart[");
                        aFe1mSDK.append(n8);
                        aFe1mSDK.append("] ts is missing");
                        AFLogger.afInfoLog(aFe1mSDK.toString());
                    }
                } else {
                    AFLogger.afErrorLogForExcManagerOnly("Unexpected ddl requestCount - end", (Throwable)new IllegalStateException("Metrics: Unexpected ddl requestCount = ".concat(String.valueOf((int)n8))));
                }
                if (object.getResponseCode() != 200) break block16;
                object = new JSONObject(AFa1eSDK.values((HttpURLConnection)object));
                aFb1mSDK.onConversionDataSuccess = object.optBoolean("is_second_ping", true);
                if (!object.optBoolean("found")) {
                    object = null;
                } else {
                    object = DeepLink.values(object.optJSONObject("click_event"));
                    object.valueOf.put("is_deferred", true);
                }
                if (object != null) {
                    return new DeepLinkResult((DeepLink)object, null);
                }
                if (aFb1mSDK.onResponseNative > 1 || !aFb1mSDK.afWarnLog() || !aFb1mSDK.onConversionDataSuccess) break;
                AFLogger.afDebugLog("[DDL] Waiting for referrers...");
                aFb1mSDK.afWarnLog.await();
                object = aFb1mSDK.AFVersionDeclaration;
                l8 = System.currentTimeMillis();
                long l9 = object.afInfoLog[0];
                if (l9 != 0L) {
                    object.AFInAppEventType.put((Object)"rfr_wait", (Object)(l8 - l9));
                    aFe1mSDK = new JSONObject(object.AFInAppEventType);
                    object.valueOf.AFInAppEventParameterName("ddl", aFe1mSDK.toString());
                } else {
                    AFLogger.afInfoLog("Metrics: ddlEnd[0] ts is missing");
                }
                if (aFb1mSDK.onResponseErrorNative == aFb1mSDK.onAttributionFailureNative) {
                    return new DeepLinkResult(null, null);
                }
                aFb1mSDK.AFLogger$LogLevel();
            } while (true);
            return new DeepLinkResult(null, null);
        }
        aFb1mSDK = new StringBuilder("[DDL] Error occurred. Server response code = ");
        aFb1mSDK.append(object.getResponseCode());
        AFLogger.afDebugLog(aFb1mSDK.toString());
        return new DeepLinkResult(null, DeepLinkResult.Error.HTTP_STATUS_CODE);
    }

    private void AFKeystoreWrapper(AFf1pSDK aFf1pSDK) {
        int n8;
        if (AFb1mSDK.AFInAppEventParameterName(aFf1pSDK)) {
            this.getLevel.add((Object)aFf1pSDK);
            this.afWarnLog.countDown();
            StringBuilder stringBuilder = new StringBuilder("[DDL] Added non-organic ");
            stringBuilder.append(aFf1pSDK.getClass().getSimpleName());
            AFLogger.afDebugLog(stringBuilder.toString());
            return;
        }
        this.onResponseErrorNative = n8 = this.onResponseErrorNative + 1;
        if (n8 == this.onAttributionFailureNative) {
            this.afWarnLog.countDown();
        }
    }

    private void AFLogger$LogLevel() {
        Map<String, Object> map;
        Map<String, String> map2;
        int n8 = this.onResponseNative;
        boolean bl = true;
        this.onResponseNative = n8 + 1;
        Map<String, Object> map3 = new StringBuilder("[DDL] Preparing request ");
        map3.append(this.onResponseNative);
        AFLogger.afDebugLog(map3.toString());
        if (this.onResponseNative == 1) {
            map3 = AFa1eSDK.valueOf();
            map = this.AFKeystoreWrapper;
            if (this.onInstallConversionDataLoadedNative.AFInAppEventType.values("appsFlyerCount", 0) != 0) {
                bl = false;
            }
            map.put((Object)"is_first", (Object)bl);
            map = this.AFKeystoreWrapper;
            map2 = new Map<String, String>();
            map2.append(Locale.getDefault().getLanguage());
            map2.append("-");
            map2.append(Locale.getDefault().getCountry());
            map.put((Object)"lang", (Object)map2.toString());
            this.AFKeystoreWrapper.put((Object)"os", (Object)Build.VERSION.RELEASE);
            this.AFKeystoreWrapper.put((Object)"type", (Object)Build.MODEL);
            map = this.AFKeystoreWrapper;
            map2 = this.onInstallConversionDataLoadedNative;
            map.put((Object)"request_id", (Object)AFb1zSDK.valueOf(map2.valueOf, map2.AFInAppEventType));
            map3 = map3.afInfoLog;
            if (map3 != null && (map3 = map3.AFInAppEventType) != null) {
                this.AFKeystoreWrapper.put((Object)"sharing_filter", (Object)map3);
            }
            map3 = this.values(AFa1cSDK.values(this.onInstallConversionDataLoadedNative.valueOf.AFInAppEventType, new HashMap()));
            map = this.values(AFa1cSDK.values(this.onInstallConversionDataLoadedNative.valueOf.AFInAppEventType));
            if (map3 != null) {
                this.AFKeystoreWrapper.put((Object)"gaid", map3);
            }
            if (map != null) {
                this.AFKeystoreWrapper.put((Object)"oaid", map);
            }
        }
        map3 = this.AFKeystoreWrapper;
        map = new Map<String, Object>("yyyy-MM-dd'T'HH:mm:ss.SSS", Locale.US);
        long l8 = System.currentTimeMillis();
        map.setTimeZone(TimeZone.getTimeZone((String)"UTC"));
        map3.put((Object)"timestamp", (Object)map.format(new Date(l8)));
        this.AFKeystoreWrapper.put((Object)"request_count", (Object)this.onResponseNative);
        map3 = new ArrayList();
        map = this.getLevel.iterator();
        while (map.hasNext()) {
            map2 = AFb1mSDK.valueOf((AFf1pSDK)((Object)map.next()));
            if (map2 == null) continue;
            map3.add(map2);
        }
        if (!map3.isEmpty()) {
            this.AFKeystoreWrapper.put((Object)"referrers", (Object)map3);
        }
        this.AFKeystoreWrapper(this.AppsFlyer2dXConversionCallback());
    }

    private String AppsFlyer2dXConversionCallback() {
        String string2 = this.init.AFInAppEventParameterName;
        String string3 = this.onInstallConversionDataLoadedNative.valueOf.AFInAppEventType.getPackageName();
        String string4 = this.onInstallConversionDataLoadedNative.values();
        string4 = string4 != null && !string4.trim().isEmpty() ? "-".concat(string4) : "";
        Uri.Builder builder = Uri.parse((String)String.format((String)AFLogger$LogLevel, (Object[])new Object[]{AppsFlyerLib.getInstance().getHostPrefix(), AFa1eSDK.valueOf().getHostName()})).buildUpon();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string3);
        stringBuilder.append(string4);
        string4 = builder.appendPath(stringBuilder.toString());
        string3 = new StringBuilder();
        string3.append(this.AFKeystoreWrapper.get((Object)"timestamp"));
        string3.append(string2);
        return string4.appendQueryParameter("af_sig", AFc1nSDK.valueOf(string3.toString(), string2)).appendQueryParameter("sdk_version", AFa1eSDK.AFKeystoreWrapper).build().toString();
    }

    private boolean afWarnLog() {
        List list = (List)this.AFKeystoreWrapper.get((Object)"referrers");
        int n8 = list != null ? list.size() : 0;
        if (n8 < this.onAttributionFailureNative && !this.AFKeystoreWrapper.containsKey((Object)"referrers")) {
            return true;
        }
        return false;
    }

    private static Map<String, String> valueOf(AFf1pSDK aFf1pSDK) {
        if (aFf1pSDK.afDebugLog == AFf1pSDK.AFa1zSDK.values) {
            HashMap hashMap = new HashMap();
            String string2 = (String)aFf1pSDK.AFInAppEventParameterName.get((Object)"referrer");
            if (string2 != null) {
                hashMap.put((Object)"source", (Object)((String)aFf1pSDK.AFInAppEventParameterName.get((Object)"source")));
                hashMap.put((Object)"value", (Object)string2);
                return hashMap;
            }
        }
        return null;
    }

    public static /* synthetic */ void valueOf(AFb1mSDK aFb1mSDK) {
        ArrayList arrayList = new ArrayList();
        for (AFf1pSDK aFf1pSDK : aFb1mSDK.onInstallConversionFailureNative.valueOf()) {
            if (aFf1pSDK == null || aFf1pSDK.afDebugLog == AFf1pSDK.AFa1zSDK.valueOf) continue;
            arrayList.add((Object)aFf1pSDK);
        }
        aFb1mSDK.onAttributionFailureNative = arrayList.size();
        for (Object object : arrayList) {
            AFf1pSDK aFf1pSDK;
            int n8 = .values[object.afDebugLog.ordinal()];
            if (n8 != 1) {
                if (n8 != 2) continue;
                object.addObserver(new Observer(aFb1mSDK, (AFf1pSDK)((Object)object)){
                    private /* synthetic */ AFf1pSDK AFInAppEventType;
                    private /* synthetic */ AFb1mSDK valueOf;
                    {
                        this.valueOf = aFb1mSDK;
                        this.AFInAppEventType = aFf1pSDK;
                    }

                    public final void update(Observable observable, Object object) {
                        object = new StringBuilder("[DDL] ");
                        object.append(this.AFInAppEventType.AFInAppEventParameterName.get((Object)"source"));
                        object.append(" referrer collected via observer");
                        AFLogger.afDebugLog(object.toString());
                        this.valueOf.AFKeystoreWrapper((AFf1pSDK)observable);
                    }
                });
                continue;
            }
            aFf1pSDK = new StringBuilder("[DDL] ");
            aFf1pSDK.append(object.AFInAppEventParameterName.get((Object)"source"));
            aFf1pSDK.append(" referrer collected earlier");
            AFLogger.afDebugLog(aFf1pSDK.toString());
            aFb1mSDK.AFKeystoreWrapper((AFf1pSDK)((Object)object));
        }
    }

    private Map<String, Object> values(AFc1uSDK.AFa1wSDK aFa1wSDK) {
        Boolean bl;
        if (!(aFa1wSDK == null || aFa1wSDK.valueOf == null || (bl = aFa1wSDK.AFInAppEventType) != null && bl.booleanValue())) {
            return new HashMap<String, Object>(this, aFa1wSDK){
                private /* synthetic */ AFb1mSDK AFInAppEventType;
                private /* synthetic */ AFc1uSDK.AFa1wSDK AFKeystoreWrapper;
                {
                    this.AFInAppEventType = aFb1mSDK;
                    this.AFKeystoreWrapper = aFa1wSDK;
                    this.put((Object)"type", (Object)"unhashed");
                    this.put((Object)"value", (Object)this.AFKeystoreWrapper.valueOf);
                }
            };
        }
        return null;
    }

    @Override
    public final AFd1vSDK AFInAppEventType() {
        return AFd1vSDK.afRDLog;
    }

    public final DeepLinkResult AFLogger() {
        Object object;
        block4 : {
            AFLogger.afDebugLog("[DDL] start");
            Object object2 = new FutureTask((Callable)new Callable<DeepLinkResult>(this){
                private /* synthetic */ AFb1mSDK valueOf;
                {
                    this.valueOf = aFb1mSDK;
                }

                public final /* synthetic */ Object call() {
                    AFb1mSDK.valueOf(this.valueOf);
                    this.valueOf.AFLogger$LogLevel();
                    return AFb1mSDK.AFInAppEventType(this.valueOf);
                }
            });
            this.AppsFlyer2dXConversionCallback.execute((Runnable)object2);
            try {
                object2 = (DeepLinkResult)object2.get(this.onDeepLinkingNative.afInfoLog, TimeUnit.MILLISECONDS);
                this.AFVersionDeclaration.values((DeepLinkResult)object2, this.onDeepLinkingNative.afInfoLog);
                this.onDeepLinkingNative.AFInAppEventType((DeepLinkResult)object2);
                return object2;
            }
            catch (TimeoutException timeoutException) {
            }
            catch (InterruptedException interruptedException) {
                break block4;
            }
            catch (ExecutionException executionException) {
                break block4;
            }
            AFLogger.afErrorLogForExcManagerOnly("[DDL] Timeout", (Throwable)timeoutException);
            Object object3 = new StringBuilder("[DDL] Timeout, didn't manage to find deferred deep link after ");
            object3.append(this.onResponseNative);
            object3.append(" attempt(s) within ");
            object3.append(this.onDeepLinkingNative.afInfoLog);
            object3.append(" milliseconds");
            AFLogger.afDebugLog(object3.toString());
            object3 = new DeepLinkResult(null, DeepLinkResult.Error.TIMEOUT);
            this.AFVersionDeclaration.values((DeepLinkResult)object3, this.onDeepLinkingNative.afInfoLog);
            this.onDeepLinkingNative.AFInAppEventType((DeepLinkResult)object3);
            return object3;
        }
        AFLogger.afErrorLog("[DDL] Error occurred", (Throwable)object, true);
        object = object.getCause() instanceof IOException ? DeepLinkResult.Error.NETWORK : DeepLinkResult.Error.UNEXPECTED;
        object = new DeepLinkResult(null, (DeepLinkResult.Error)((Object)object));
        this.AFVersionDeclaration.values((DeepLinkResult)object, this.onDeepLinkingNative.afInfoLog);
        this.onDeepLinkingNative.AFInAppEventType((DeepLinkResult)object);
        return object;
    }

}

