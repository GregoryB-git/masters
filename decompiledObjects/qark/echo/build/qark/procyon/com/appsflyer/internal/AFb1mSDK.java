// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.appsflyer.internal;

import java.util.AbstractMap;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.Callable;
import java.util.Observable;
import java.util.Observer;
import android.net.Uri$Builder;
import android.net.Uri;
import com.appsflyer.AppsFlyerLib;
import java.util.Iterator;
import java.util.Date;
import java.util.TimeZone;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import android.os.Build;
import android.os.Build$VERSION;
import java.util.Locale;
import java.net.HttpURLConnection;
import com.appsflyer.deeplink.DeepLink;
import com.appsflyer.AFLogger;
import java.util.Map;
import org.json.JSONObject;
import com.appsflyer.deeplink.DeepLinkResult;
import java.util.concurrent.TimeUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;

public final class AFb1mSDK extends AFe1jSDK
{
    private static String AFLogger$LogLevel = "https://%sdlsdk.%s/v1.0/android/";
    private final AFe1mSDK AFVersionDeclaration;
    private final ExecutorService AppsFlyer2dXConversionCallback;
    private final CountDownLatch afWarnLog;
    private final List<AFf1pSDK> getLevel;
    private final AFe1wSDK init;
    private final AFb1tSDK onAppOpenAttributionNative;
    private int onAttributionFailureNative;
    private boolean onConversionDataSuccess;
    private final AFb1sSDK onDeepLinkingNative;
    private final AFb1gSDK onInstallConversionDataLoadedNative;
    private final AFf1oSDK onInstallConversionFailureNative;
    private int onResponseErrorNative;
    private int onResponseNative;
    
    public AFb1mSDK(final AFc1xSDK aFc1xSDK) {
        super(null, AFb1mSDK.AFLogger$LogLevel, Boolean.FALSE, Boolean.TRUE, null);
        this.getLevel = new ArrayList<AFf1pSDK>();
        this.afWarnLog = new CountDownLatch(1);
        this.AFVersionDeclaration = aFc1xSDK.afDebugLog();
        this.onInstallConversionDataLoadedNative = aFc1xSDK.AFInAppEventParameterName();
        this.init = aFc1xSDK.afWarnLog();
        this.onInstallConversionFailureNative = aFc1xSDK.AFLogger$LogLevel();
        this.AppsFlyer2dXConversionCallback = aFc1xSDK.AFInAppEventType();
        this.onAppOpenAttributionNative = aFc1xSDK.afErrorLogForExcManagerOnly();
        this.onDeepLinkingNative = aFc1xSDK.AppsFlyer2dXConversionCallback();
    }
    
    private static boolean AFInAppEventParameterName(final AFf1pSDK aFf1pSDK) {
        final Long n = aFf1pSDK.AFInAppEventParameterName.get("click_ts");
        return n != null && System.currentTimeMillis() - TimeUnit.SECONDS.toMillis(n.longValue()) < TimeUnit.DAYS.toMillis(1L);
    }
    
    private void AFKeystoreWrapper(final AFf1pSDK aFf1pSDK) {
        if (AFInAppEventParameterName(aFf1pSDK)) {
            this.getLevel.add(aFf1pSDK);
            this.afWarnLog.countDown();
            final StringBuilder sb = new StringBuilder("[DDL] Added non-organic ");
            sb.append(aFf1pSDK.getClass().getSimpleName());
            com.appsflyer.AFLogger.afDebugLog(sb.toString());
            return;
        }
        if (++this.onResponseErrorNative == this.onAttributionFailureNative) {
            this.afWarnLog.countDown();
        }
    }
    
    private void AFLogger$LogLevel() {
        final int onResponseNative = this.onResponseNative;
        boolean b = true;
        this.onResponseNative = onResponseNative + 1;
        final StringBuilder sb = new StringBuilder("[DDL] Preparing request ");
        sb.append(this.onResponseNative);
        com.appsflyer.AFLogger.afDebugLog(sb.toString());
        if (this.onResponseNative == 1) {
            final AFa1eSDK value = AFa1eSDK.valueOf();
            final Map<String, Object> afKeystoreWrapper = (Map<String, Object>)super.AFKeystoreWrapper;
            if (this.onInstallConversionDataLoadedNative.AFInAppEventType.values("appsFlyerCount", 0) != 0) {
                b = false;
            }
            afKeystoreWrapper.put("is_first", b);
            final Map<String, Object> afKeystoreWrapper2 = (Map<String, Object>)super.AFKeystoreWrapper;
            final StringBuilder sb2 = new StringBuilder();
            sb2.append(Locale.getDefault().getLanguage());
            sb2.append("-");
            sb2.append(Locale.getDefault().getCountry());
            afKeystoreWrapper2.put("lang", sb2.toString());
            super.AFKeystoreWrapper.put("os", Build$VERSION.RELEASE);
            super.AFKeystoreWrapper.put("type", Build.MODEL);
            final Map<String, Object> afKeystoreWrapper3 = (Map<String, Object>)super.AFKeystoreWrapper;
            final AFb1gSDK onInstallConversionDataLoadedNative = this.onInstallConversionDataLoadedNative;
            afKeystoreWrapper3.put("request_id", AFb1zSDK.valueOf(onInstallConversionDataLoadedNative.valueOf, onInstallConversionDataLoadedNative.AFInAppEventType));
            final AFa1cSDK afInfoLog = value.afInfoLog;
            if (afInfoLog != null) {
                final String[] afInAppEventType = afInfoLog.AFInAppEventType;
                if (afInAppEventType != null) {
                    super.AFKeystoreWrapper.put("sharing_filter", afInAppEventType);
                }
            }
            final Map<String, Object> values = this.values(AFa1cSDK.values(this.onInstallConversionDataLoadedNative.valueOf.AFInAppEventType, new HashMap<String, Object>()));
            final Map<String, Object> values2 = this.values(AFa1cSDK.values(this.onInstallConversionDataLoadedNative.valueOf.AFInAppEventType));
            if (values != null) {
                super.AFKeystoreWrapper.put("gaid", values);
            }
            if (values2 != null) {
                super.AFKeystoreWrapper.put("oaid", values2);
            }
        }
        final Map<String, Object> afKeystoreWrapper4 = (Map<String, Object>)super.AFKeystoreWrapper;
        final SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS", Locale.US);
        final long currentTimeMillis = System.currentTimeMillis();
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        afKeystoreWrapper4.put("timestamp", simpleDateFormat.format(new Date(currentTimeMillis)));
        super.AFKeystoreWrapper.put("request_count", this.onResponseNative);
        final ArrayList<Map<String, String>> list = new ArrayList<Map<String, String>>();
        final Iterator<AFf1pSDK> iterator = this.getLevel.iterator();
        while (iterator.hasNext()) {
            final Map<String, String> value2 = valueOf(iterator.next());
            if (value2 != null) {
                list.add(value2);
            }
        }
        if (!list.isEmpty()) {
            super.AFKeystoreWrapper.put("referrers", list);
        }
        this.AFKeystoreWrapper(this.AppsFlyer2dXConversionCallback());
    }
    
    private String AppsFlyer2dXConversionCallback() {
        final String afInAppEventParameterName = this.init.AFInAppEventParameterName;
        final String packageName = this.onInstallConversionDataLoadedNative.valueOf.AFInAppEventType.getPackageName();
        final String values = this.onInstallConversionDataLoadedNative.values();
        String concat;
        if (values != null && !values.trim().isEmpty()) {
            concat = "-".concat(values);
        }
        else {
            concat = "";
        }
        final Uri$Builder buildUpon = Uri.parse(String.format(AFb1mSDK.AFLogger$LogLevel, AppsFlyerLib.getInstance().getHostPrefix(), AFa1eSDK.valueOf().getHostName())).buildUpon();
        final StringBuilder sb = new StringBuilder();
        sb.append(packageName);
        sb.append(concat);
        final Uri$Builder appendPath = buildUpon.appendPath(sb.toString());
        final StringBuilder sb2 = new StringBuilder();
        sb2.append(super.AFKeystoreWrapper.get("timestamp"));
        sb2.append(afInAppEventParameterName);
        return appendPath.appendQueryParameter("af_sig", AFc1nSDK.valueOf(sb2.toString(), afInAppEventParameterName)).appendQueryParameter("sdk_version", AFa1eSDK.AFKeystoreWrapper).build().toString();
    }
    
    private boolean afWarnLog() {
        final List list = super.AFKeystoreWrapper.get("referrers");
        int size;
        if (list != null) {
            size = list.size();
        }
        else {
            size = 0;
        }
        return size < this.onAttributionFailureNative && !super.AFKeystoreWrapper.containsKey("referrers");
    }
    
    private static Map<String, String> valueOf(final AFf1pSDK aFf1pSDK) {
        if (aFf1pSDK.afDebugLog == AFf1pSDK.AFa1zSDK.values) {
            final HashMap<String, String> hashMap = new HashMap<String, String>();
            final String s = aFf1pSDK.AFInAppEventParameterName.get("referrer");
            if (s != null) {
                hashMap.put("source", aFf1pSDK.AFInAppEventParameterName.get("source"));
                hashMap.put("value", s);
                return hashMap;
            }
        }
        return null;
    }
    
    private Map<String, Object> values(final AFc1uSDK.AFa1wSDK aFa1wSDK) {
        if (aFa1wSDK != null && aFa1wSDK.valueOf != null) {
            final Boolean afInAppEventType = aFa1wSDK.AFInAppEventType;
            if (afInAppEventType == null || !afInAppEventType) {
                return new HashMap<String, Object>() {
                    {
                        ((AbstractMap<String, String>)this).put("type", "unhashed");
                        ((AbstractMap<String, String>)this).put("value", aFa1wSDK.valueOf);
                    }
                };
            }
        }
        return null;
    }
    
    @Override
    public final AFd1vSDK AFInAppEventType() {
        return AFd1vSDK.afRDLog;
    }
    
    public final DeepLinkResult AFLogger() {
        com.appsflyer.AFLogger.afDebugLog("[DDL] start");
        final FutureTask<DeepLinkResult> futureTask = new FutureTask<DeepLinkResult>(new Callable<DeepLinkResult>() {});
        this.AppsFlyer2dXConversionCallback.execute(futureTask);
        Label_0186: {
            try {
                final DeepLinkResult deepLinkResult = futureTask.get(this.onDeepLinkingNative.afInfoLog, TimeUnit.MILLISECONDS);
                this.AFVersionDeclaration.values(deepLinkResult, this.onDeepLinkingNative.afInfoLog);
                this.onDeepLinkingNative.AFInAppEventType(deepLinkResult);
                return deepLinkResult;
            }
            catch (TimeoutException ex) {}
            catch (InterruptedException ex2) {
                break Label_0186;
            }
            catch (ExecutionException ex2) {
                break Label_0186;
            }
            final TimeoutException ex;
            com.appsflyer.AFLogger.afErrorLogForExcManagerOnly("[DDL] Timeout", ex);
            final StringBuilder sb = new StringBuilder("[DDL] Timeout, didn't manage to find deferred deep link after ");
            sb.append(this.onResponseNative);
            sb.append(" attempt(s) within ");
            sb.append(this.onDeepLinkingNative.afInfoLog);
            sb.append(" milliseconds");
            com.appsflyer.AFLogger.afDebugLog(sb.toString());
            final DeepLinkResult deepLinkResult2 = new DeepLinkResult(null, DeepLinkResult.Error.TIMEOUT);
            this.AFVersionDeclaration.values(deepLinkResult2, this.onDeepLinkingNative.afInfoLog);
            this.onDeepLinkingNative.AFInAppEventType(deepLinkResult2);
            return deepLinkResult2;
        }
        final InterruptedException ex2;
        com.appsflyer.AFLogger.afErrorLog("[DDL] Error occurred", ex2, true);
        DeepLinkResult.Error error;
        if (ex2.getCause() instanceof IOException) {
            error = DeepLinkResult.Error.NETWORK;
        }
        else {
            error = DeepLinkResult.Error.UNEXPECTED;
        }
        final DeepLinkResult deepLinkResult3 = new DeepLinkResult(null, error);
        this.AFVersionDeclaration.values(deepLinkResult3, this.onDeepLinkingNative.afInfoLog);
        this.onDeepLinkingNative.AFInAppEventType(deepLinkResult3);
        return deepLinkResult3;
    }
}
