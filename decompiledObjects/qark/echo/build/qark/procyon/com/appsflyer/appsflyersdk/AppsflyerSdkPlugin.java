// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.appsflyer.appsflyersdk;

import android.os.BaseBundle;
import java.security.InvalidParameterException;
import com.appsflyer.AppsFlyerProperties;
import java.util.List;
import android.util.Log;
import com.appsflyer.AppsFlyerInAppPurchaseValidatorListener;
import E5.c;
import com.appsflyer.share.CrossPromotionHelper;
import java.util.Iterator;
import android.os.Bundle;
import com.appsflyer.internal.platform_extension.PluginInfo;
import com.appsflyer.internal.platform_extension.Plugin;
import com.appsflyer.AFLogger;
import com.appsflyer.share.LinkGenerator;
import com.appsflyer.share.ShareInviteHelper;
import org.json.JSONException;
import com.appsflyer.AppsFlyerLib;
import java.util.ArrayList;
import E5.j;
import org.json.JSONObject;
import java.util.HashMap;
import android.os.Looper;
import android.os.Handler;
import E5.n;
import android.content.Intent;
import E5.d;
import android.content.Context;
import android.app.Application;
import com.appsflyer.deeplink.DeepLinkListener;
import com.appsflyer.AppsFlyerConversionListener;
import android.app.Activity;
import java.util.Map;
import com.appsflyer.deeplink.DeepLinkResult;
import A5.a;
import E5.k;

public class AppsflyerSdkPlugin implements c, a, B5.a
{
    private static DeepLinkResult cachedDeepLinkResult;
    private static Map<String, String> cachedOnAppOpenAttribution;
    private static String cachedOnAttributionFailure;
    private static String cachedOnConversionDataFail;
    private static Map<String, Object> cachedOnConversionDataSuccess;
    private static boolean saveCallbacks;
    private Activity activity;
    private final AppsFlyerConversionListener afConversionListener;
    private final DeepLinkListener afDeepLinkListener;
    private final c callbacksHandler;
    private Boolean gcdCallback;
    private Boolean isFacebookDeferredApplinksEnabled;
    private Boolean isSetDisableAdvertisingIdentifiersEnable;
    private Application mApplication;
    private k mCallbackChannel;
    private Map<String, Map<String, Object>> mCallbacks;
    private Context mContext;
    private E5.d mEventChannel;
    private Intent mIntent;
    private k mMethodChannel;
    private Boolean oaoaCallback;
    n onNewIntentListener;
    private Boolean udlCallback;
    final Handler uiThreadHandler;
    private Boolean validatePurchaseCallback;
    
    public AppsflyerSdkPlugin() {
        this.uiThreadHandler = new Handler(Looper.getMainLooper());
        final Boolean false = Boolean.FALSE;
        this.gcdCallback = false;
        this.oaoaCallback = false;
        this.udlCallback = false;
        this.validatePurchaseCallback = false;
        this.isFacebookDeferredApplinksEnabled = false;
        this.isSetDisableAdvertisingIdentifiersEnable = false;
        this.mCallbacks = new HashMap<String, Map<String, Object>>();
        this.onNewIntentListener = new n() {
            @Override
            public boolean onNewIntent(final Intent intent) {
                AppsflyerSdkPlugin.access$000(AppsflyerSdkPlugin.this).setIntent(intent);
                return false;
            }
        };
        this.afConversionListener = new AppsFlyerConversionListener() {
            @Override
            public void onAppOpenAttribution(final Map<String, String> map) {
                if (AppsflyerSdkPlugin.access$100()) {
                    AppsflyerSdkPlugin.access$802(map);
                    return;
                }
                if (AppsflyerSdkPlugin.access$900(AppsflyerSdkPlugin.this)) {
                    AppsflyerSdkPlugin.this.runOnUIThread(new JSONObject(AppsflyerSdkPlugin.this.replaceNullValues(map)), "onAppOpenAttribution", "success");
                }
            }
            
            @Override
            public void onAttributionFailure(final String s) {
                if (AppsflyerSdkPlugin.access$100()) {
                    AppsflyerSdkPlugin.access$1002(s);
                    return;
                }
                if (AppsflyerSdkPlugin.access$900(AppsflyerSdkPlugin.this)) {
                    AppsflyerSdkPlugin.this.runOnUIThread(AppsflyerSdkPlugin.this.buildJsonResponse(s, "failure"), "onAppOpenAttribution", "failure");
                }
            }
            
            @Override
            public void onConversionDataFail(final String s) {
                if (AppsflyerSdkPlugin.access$100()) {
                    AppsflyerSdkPlugin.access$602(s);
                    return;
                }
                if (AppsflyerSdkPlugin.access$300(AppsflyerSdkPlugin.this)) {
                    AppsflyerSdkPlugin.this.runOnUIThread(AppsflyerSdkPlugin.this.buildJsonResponse(s, "failure"), "onInstallConversionData", "failure");
                }
            }
            
            @Override
            public void onConversionDataSuccess(final Map<String, Object> map) {
                if (AppsflyerSdkPlugin.access$100()) {
                    AppsflyerSdkPlugin.access$202(map);
                    return;
                }
                if (AppsflyerSdkPlugin.access$300(AppsflyerSdkPlugin.this)) {
                    AppsflyerSdkPlugin.this.runOnUIThread(new JSONObject(AppsflyerSdkPlugin.this.replaceNullValues(map)), "onInstallConversionData", "success");
                }
            }
        };
        this.afDeepLinkListener = new DeepLinkListener() {
            @Override
            public void onDeepLinking(final DeepLinkResult deepLinkResult) {
                if (AppsflyerSdkPlugin.access$100()) {
                    AppsflyerSdkPlugin.access$1102(deepLinkResult);
                    return;
                }
                if (AppsflyerSdkPlugin.access$1200(AppsflyerSdkPlugin.this)) {
                    AppsflyerSdkPlugin.this.runOnUIThread(deepLinkResult, "onDeepLinking", "success");
                }
            }
        };
        this.callbacksHandler = new c() {
            @Override
            public void onMethodCall(final j j, final d d) {
                if ("startListening".equals(j.a)) {
                    AppsflyerSdkPlugin.this.startListening(j.b, d);
                    return;
                }
                d.c();
            }
        };
    }
    
    public static /* synthetic */ Activity access$000(final AppsflyerSdkPlugin appsflyerSdkPlugin) {
        return appsflyerSdkPlugin.activity;
    }
    
    public static /* synthetic */ boolean access$100() {
        return AppsflyerSdkPlugin.saveCallbacks;
    }
    
    public static /* synthetic */ String access$1002(final String cachedOnAttributionFailure) {
        return AppsflyerSdkPlugin.cachedOnAttributionFailure = cachedOnAttributionFailure;
    }
    
    public static /* synthetic */ DeepLinkResult access$1102(final DeepLinkResult cachedDeepLinkResult) {
        return AppsflyerSdkPlugin.cachedDeepLinkResult = cachedDeepLinkResult;
    }
    
    public static /* synthetic */ Boolean access$1200(final AppsflyerSdkPlugin appsflyerSdkPlugin) {
        return appsflyerSdkPlugin.udlCallback;
    }
    
    public static /* synthetic */ Map access$1400(final AppsflyerSdkPlugin appsflyerSdkPlugin) {
        return appsflyerSdkPlugin.mCallbacks;
    }
    
    public static /* synthetic */ k access$1500(final AppsflyerSdkPlugin appsflyerSdkPlugin) {
        return appsflyerSdkPlugin.mCallbackChannel;
    }
    
    public static /* synthetic */ Boolean access$1600(final AppsflyerSdkPlugin appsflyerSdkPlugin) {
        return appsflyerSdkPlugin.validatePurchaseCallback;
    }
    
    public static /* synthetic */ Map access$202(final Map cachedOnConversionDataSuccess) {
        return AppsflyerSdkPlugin.cachedOnConversionDataSuccess = (Map<String, Object>)cachedOnConversionDataSuccess;
    }
    
    public static /* synthetic */ Boolean access$300(final AppsflyerSdkPlugin appsflyerSdkPlugin) {
        return appsflyerSdkPlugin.gcdCallback;
    }
    
    public static /* synthetic */ String access$602(final String cachedOnConversionDataFail) {
        return AppsflyerSdkPlugin.cachedOnConversionDataFail = cachedOnConversionDataFail;
    }
    
    public static /* synthetic */ Map access$802(final Map cachedOnAppOpenAttribution) {
        return AppsflyerSdkPlugin.cachedOnAppOpenAttribution = (Map<String, String>)cachedOnAppOpenAttribution;
    }
    
    public static /* synthetic */ Boolean access$900(final AppsflyerSdkPlugin appsflyerSdkPlugin) {
        return appsflyerSdkPlugin.oaoaCallback;
    }
    
    private void addPushNotificationDeepLinkPath(final j j, final d d) {
        final Object b = j.b;
        if (b != null) {
            final ArrayList list = (ArrayList)b;
            AppsFlyerLib.getInstance().addPushNotificationDeepLinkPath((String[])list.toArray(new String[list.size()]));
        }
        d.a(null);
    }
    
    private JSONObject buildJsonResponse(final Object o, final String s) {
        final JSONObject jsonObject = new JSONObject();
        try {
            jsonObject.put("status", (Object)s);
            jsonObject.put("data", (Object)o.toString());
            return jsonObject;
        }
        catch (JSONException ex) {
            ((Throwable)ex).printStackTrace();
            return jsonObject;
        }
    }
    
    private void enableFacebookDeferredApplinks(final j j, final d d) {
        final Boolean isFacebookDeferredApplinksEnabled = (Boolean)j.a("isFacebookDeferredApplinksEnabled");
        isFacebookDeferredApplinksEnabled;
        this.isFacebookDeferredApplinksEnabled = isFacebookDeferredApplinksEnabled;
        AppsFlyerLib appsFlyerLib;
        boolean b;
        if (isFacebookDeferredApplinksEnabled) {
            appsFlyerLib = AppsFlyerLib.getInstance();
            b = true;
        }
        else {
            appsFlyerLib = AppsFlyerLib.getInstance();
            b = false;
        }
        appsFlyerLib.enableFacebookDeferredApplinks(b);
        d.a(null);
    }
    
    private void generateInviteLink(final j j, final d d) {
        final String channel = (String)j.a("channel");
        final String referrerCustomerId = (String)j.a("customerID");
        final String campaign = (String)j.a("campaign");
        final String referrerName = (String)j.a("referrerName");
        final String referrerImageURL = (String)j.a("referrerImageUrl");
        final String baseDeeplink = (String)j.a("baseDeeplink");
        final String brandDomain = (String)j.a("brandDomain");
        final Map map = (Map)j.a("customParams");
        final LinkGenerator generateInviteUrl = ShareInviteHelper.generateInviteUrl(this.mContext);
        if (channel != null && !channel.equals("")) {
            generateInviteUrl.setChannel(channel);
        }
        if (campaign != null && !campaign.equals("")) {
            generateInviteUrl.setCampaign(campaign);
        }
        if (referrerName != null && !referrerName.equals("")) {
            generateInviteUrl.setReferrerName(referrerName);
        }
        if (referrerImageURL != null && !referrerImageURL.equals("")) {
            generateInviteUrl.setReferrerImageURL(referrerImageURL);
        }
        if (referrerCustomerId != null && !referrerCustomerId.equals("")) {
            generateInviteUrl.setReferrerCustomerId(referrerCustomerId);
        }
        if (baseDeeplink != null && !baseDeeplink.equals("")) {
            generateInviteUrl.setBaseDeeplink(baseDeeplink);
        }
        if (brandDomain != null && !brandDomain.equals("")) {
            generateInviteUrl.setBrandDomain(brandDomain);
        }
        if (map != null && !map.equals("")) {
            generateInviteUrl.addParameters(map);
        }
        generateInviteUrl.generateLink(this.mContext, (LinkGenerator.ResponseListener)new LinkGenerator.ResponseListener() {
            final JSONObject obj = new JSONObject();
            
            @Override
            public void onResponse(final String s) {
                if (AppsflyerSdkPlugin.access$1400(AppsflyerSdkPlugin.this).containsKey("generateInviteLinkSuccess")) {
                    try {
                        this.obj.put("userInviteURL", (Object)s);
                        AppsflyerSdkPlugin.this.runOnUIThread(this.obj, "generateInviteLinkSuccess", "success");
                    }
                    catch (JSONException ex) {
                        ((Throwable)ex).printStackTrace();
                    }
                }
            }
            
            @Override
            public void onResponseError(final String s) {
                if (AppsflyerSdkPlugin.access$1400(AppsflyerSdkPlugin.this).containsKey("generateInviteLinkFailure")) {
                    try {
                        this.obj.put("error", (Object)s);
                        AppsflyerSdkPlugin.this.runOnUIThread(s, "generateInviteLinkFailure", "failure");
                    }
                    catch (JSONException ex) {
                        ((Throwable)ex).printStackTrace();
                    }
                }
            }
        });
        d.a(null);
    }
    
    private void getAppsFlyerUID(final d d) {
        d.a(AppsFlyerLib.getInstance().getAppsFlyerUID(this.mContext));
    }
    
    private void getHostName(final d d) {
        d.a(AppsFlyerLib.getInstance().getHostName());
    }
    
    private void getHostPrefix(final d d) {
        d.a(AppsFlyerLib.getInstance().getHostPrefix());
    }
    
    private void getOutOfStore(final d d) {
        d.a(AppsFlyerLib.getInstance().getOutOfStore(this.mContext));
    }
    
    private void getSdkVersion(final d d) {
        d.a(AppsFlyerLib.getInstance().getSdkVersion());
    }
    
    private void initSdk(final j j, final d d) {
        final AppsFlyerLib instance = AppsFlyerLib.getInstance();
        final String s = (String)j.a("afDevKey");
        AppsFlyerConversionListener afConversionListener = null;
        if (s == null || s.equals("")) {
            d.b(null, "AF Dev Key is empty", "AF dev key cannot be empty");
        }
        if (j.a("disableAdvertisingIdentifier")) {
            instance.setDisableAdvertisingIdentifiers(true);
        }
        if (j.a("GCD")) {
            afConversionListener = this.afConversionListener;
        }
        if (j.a("UDL")) {
            instance.subscribeForDeepLink(this.afDeepLinkListener);
        }
        if (j.a("isDebug")) {
            instance.setLogLevel(AFLogger.LogLevel.DEBUG);
            instance.setDebugLog(true);
        }
        else {
            instance.setDebugLog(false);
        }
        instance.setPluginInfo(new PluginInfo(Plugin.FLUTTER, "6.12.2"));
        instance.init(s, afConversionListener, this.mContext);
        final String appInviteOneLink = (String)j.a("appInviteOneLink");
        if (appInviteOneLink != null) {
            instance.setAppInviteOneLink(appInviteOneLink);
        }
        instance.start((Context)this.activity);
        if (AppsflyerSdkPlugin.saveCallbacks) {
            AppsflyerSdkPlugin.saveCallbacks = false;
            this.sendCachedCallbacksToDart();
        }
        d.a("success");
    }
    
    private static Bundle jsonToBundle(final JSONObject jsonObject) {
        final Bundle bundle = new Bundle();
        final Iterator keys = jsonObject.keys();
        while (keys.hasNext()) {
            final String s = keys.next();
            ((BaseBundle)bundle).putString(s, jsonObject.getString(s));
        }
        return bundle;
    }
    
    private void logCrossPromotionAndOpenStore(final j j, final d d) {
        final String s = (String)j.a("appId");
        final String s2 = (String)j.a("campaign");
        final Map map = (Map)j.a("params");
        if (s != null && !s.equals("")) {
            CrossPromotionHelper.logAndOpenStore(this.mContext, s, s2, map);
        }
        d.a(null);
    }
    
    private void logCrossPromotionImpression(final j j, final d d) {
        final String s = (String)j.a("appId");
        final String s2 = (String)j.a("campaign");
        final Map map = (Map)j.a("data");
        if (s != null && !s.equals("")) {
            CrossPromotionHelper.logCrossPromoteImpression(this.mContext, s, s2, map);
        }
        d.a(null);
    }
    
    private void logEvent(final j j, final d d) {
        AppsFlyerLib.getInstance().logEvent(this.mContext, (String)j.a("eventName"), (Map<String, Object>)j.a("eventValues"));
        d.a(Boolean.TRUE);
    }
    
    private void onAttachedToEngine(final Context mContext, final E5.c c) {
        this.mContext = mContext;
        this.mEventChannel = new E5.d(c, "af-events");
        (this.mMethodChannel = new k(c, "af-api")).e((k.c)this);
        (this.mCallbackChannel = new k(c, "callbacks")).e(this.callbacksHandler);
    }
    
    private void registerValidatorListener() {
        AppsFlyerLib.getInstance().registerValidatorListener(this.mContext, new AppsFlyerInAppPurchaseValidatorListener() {
            @Override
            public void onValidateInApp() {
                if (AppsflyerSdkPlugin.access$1600(AppsflyerSdkPlugin.this)) {
                    AppsflyerSdkPlugin.this.runOnUIThread(new JSONObject(), "validatePurchase", "success");
                }
            }
            
            @Override
            public void onValidateInAppFailure(final String s) {
                try {
                    final JSONObject jsonObject = new JSONObject();
                    jsonObject.put("error", (Object)s);
                    if (AppsflyerSdkPlugin.access$1600(AppsflyerSdkPlugin.this)) {
                        AppsflyerSdkPlugin.this.runOnUIThread(jsonObject, "validatePurchase", "failure");
                    }
                }
                catch (JSONException ex) {
                    ((Throwable)ex).printStackTrace();
                }
            }
        });
    }
    
    private Map<String, Object> replaceNullValues(final Map<String, Object> map) {
        final HashMap<String, Object> hashMap = new HashMap<String, Object>();
        final Iterator<Map.Entry<String, Object>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            final Map.Entry<String, Object> entry = iterator.next();
            final String s = entry.getKey();
            Object o;
            if (entry.getValue() == null) {
                o = JSONObject.NULL;
            }
            else {
                o = entry.getValue();
            }
            hashMap.put(s, o);
            iterator.remove();
        }
        return hashMap;
    }
    
    private void runOnUIThread(final Object o, final String s, final String s2) {
        this.uiThreadHandler.post((Runnable)new Runnable() {
            @Override
            public void run() {
                final StringBuilder sb = new StringBuilder();
                sb.append("Calling invokeMethod with: ");
                sb.append(o);
                Log.d("Callbacks", sb.toString());
                final JSONObject jsonObject = new JSONObject();
                while (true) {
                    try {
                        jsonObject.put("id", (Object)s);
                        if (s.equals("onDeepLinking")) {
                            final DeepLinkResult deepLinkResult = (DeepLinkResult)o;
                            jsonObject.put("deepLinkStatus", (Object)deepLinkResult.getStatus().toString());
                            if (deepLinkResult.getError() != null) {
                                jsonObject.put("deepLinkError", (Object)deepLinkResult.getError().toString());
                            }
                            if (deepLinkResult.getStatus() == DeepLinkResult.Status.FOUND) {
                                jsonObject.put("deepLinkObj", (Object)deepLinkResult.getDeepLink().getClickEvent());
                            }
                        }
                        else {
                            final JSONObject jsonObject2 = (JSONObject)o;
                            jsonObject.put("status", (Object)s2);
                            jsonObject.put("data", (Object)o.toString());
                        }
                        while (true) {
                            AppsflyerSdkPlugin.access$1500(AppsflyerSdkPlugin.this).c("callListener", jsonObject.toString());
                            return;
                            final Throwable t;
                            t.printStackTrace();
                            continue;
                        }
                    }
                    catch (JSONException ex) {}
                    final JSONException ex;
                    final Throwable t = (Throwable)ex;
                    continue;
                }
            }
        });
    }
    
    private void sendCachedCallbacksToDart() {
        final DeepLinkResult cachedDeepLinkResult = AppsflyerSdkPlugin.cachedDeepLinkResult;
        if (cachedDeepLinkResult != null) {
            this.afDeepLinkListener.onDeepLinking(cachedDeepLinkResult);
            AppsflyerSdkPlugin.cachedDeepLinkResult = null;
        }
        final Map<String, Object> cachedOnConversionDataSuccess = AppsflyerSdkPlugin.cachedOnConversionDataSuccess;
        if (cachedOnConversionDataSuccess != null) {
            this.afConversionListener.onConversionDataSuccess(cachedOnConversionDataSuccess);
            AppsflyerSdkPlugin.cachedOnConversionDataSuccess = null;
        }
        final Map<String, String> cachedOnAppOpenAttribution = AppsflyerSdkPlugin.cachedOnAppOpenAttribution;
        if (cachedOnAppOpenAttribution != null) {
            this.afConversionListener.onAppOpenAttribution(cachedOnAppOpenAttribution);
            AppsflyerSdkPlugin.cachedOnAppOpenAttribution = null;
        }
        final String cachedOnAttributionFailure = AppsflyerSdkPlugin.cachedOnAttributionFailure;
        if (cachedOnAttributionFailure != null) {
            this.afConversionListener.onAttributionFailure(cachedOnAttributionFailure);
            AppsflyerSdkPlugin.cachedOnAttributionFailure = null;
        }
        final String cachedOnConversionDataFail = AppsflyerSdkPlugin.cachedOnConversionDataFail;
        if (cachedOnConversionDataFail != null) {
            this.afConversionListener.onConversionDataFail(cachedOnConversionDataFail);
            AppsflyerSdkPlugin.cachedOnConversionDataFail = null;
        }
    }
    
    private void sendPushNotificationData(final j j, final d d) {
        final Map map = (Map)j.b;
        String s;
        if (map == null) {
            s = "Push payload is null";
        }
        else {
            while (true) {
                try {
                    final Bundle jsonToBundle = jsonToBundle(new JSONObject(map));
                    final Activity activity = this.activity;
                    String s2;
                    if (activity != null) {
                        final Intent intent = activity.getIntent();
                        if (intent != null) {
                            intent.putExtras(jsonToBundle);
                            this.activity.setIntent(intent);
                            AppsFlyerLib.getInstance().sendPushNotificationData(this.activity);
                            s2 = null;
                        }
                        else {
                            s2 = "The intent is null. Push payload has not been sent!";
                        }
                    }
                    else {
                        s2 = "The activity is null. Push payload has not been sent!";
                    }
                    if (s2 != null) {
                        Log.d("AppsFlyer", s2);
                        return;
                    }
                    d.a(null);
                    return;
                    s = "Can't parse pushPayload to bundle";
                }
                catch (JSONException ex) {
                    continue;
                }
                break;
            }
        }
        Log.d("AppsFlyer", s);
    }
    
    private void setAdditionalData(final j j, final d d) {
        AppsFlyerLib.getInstance().setAdditionalData((Map<String, Object>)j.a("customData"));
        d.a(null);
    }
    
    private void setAndroidIdData(final j j, final d d) {
        AppsFlyerLib.getInstance().setAndroidIdData((String)j.a("androidId"));
        d.a(null);
    }
    
    private void setAppInivteOneLinkID(final j j, final d d) {
        final String appInviteOneLink = (String)j.a("oneLinkID");
        if (appInviteOneLink != null && appInviteOneLink.length() != 0) {
            AppsFlyerLib.getInstance().setAppInviteOneLink(appInviteOneLink);
            if (this.mCallbacks.containsKey("setAppInviteOneLinkIDCallback")) {
                this.runOnUIThread(this.buildJsonResponse("success", "success"), "setAppInviteOneLinkIDCallback", "success");
            }
        }
        else {
            d.a(null);
        }
    }
    
    private void setCollectAndroidId(final j j, final d d) {
        AppsFlyerLib.getInstance().setCollectAndroidID((boolean)j.a("isCollect"));
        d.a(null);
    }
    
    private void setCollectIMEI(final j j, final d d) {
        AppsFlyerLib.getInstance().setCollectIMEI((boolean)j.a("isCollect"));
        d.a(null);
    }
    
    private void setCurrencyCode(final j j, final d d) {
        AppsFlyerLib.getInstance().setCurrencyCode((String)j.a("currencyCode"));
        d.a(null);
    }
    
    private void setCustomerIdAndLogSession(final j j, final d d) {
        AppsFlyerLib.getInstance().setCustomerIdAndLogSession((String)j.a("id"), this.mContext);
        d.a(null);
    }
    
    private void setCustomerUserId(final j j, final d d) {
        AppsFlyerLib.getInstance().setCustomerUserId((String)j.a("id"));
        d.a(null);
    }
    
    private void setDisableAdvertisingIdentifiers(final j j, final d d) {
        final Boolean isSetDisableAdvertisingIdentifiersEnable = (Boolean)j.b;
        isSetDisableAdvertisingIdentifiersEnable;
        this.isSetDisableAdvertisingIdentifiersEnable = isSetDisableAdvertisingIdentifiersEnable;
        AppsFlyerLib appsFlyerLib;
        boolean disableAdvertisingIdentifiers;
        if (isSetDisableAdvertisingIdentifiersEnable) {
            appsFlyerLib = AppsFlyerLib.getInstance();
            disableAdvertisingIdentifiers = true;
        }
        else {
            appsFlyerLib = AppsFlyerLib.getInstance();
            disableAdvertisingIdentifiers = false;
        }
        appsFlyerLib.setDisableAdvertisingIdentifiers(disableAdvertisingIdentifiers);
        d.a(null);
    }
    
    private void setDisableNetworkData(final j j, final d d) {
        AppsFlyerLib.getInstance().setDisableNetworkData((boolean)j.b);
        d.a(null);
    }
    
    private void setHost(final j j, final d d) {
        AppsFlyerLib.getInstance().setHost((String)j.a("hostPrefix"), (String)j.a("hostName"));
    }
    
    private void setImeiData(final j j, final d d) {
        AppsFlyerLib.getInstance().setImeiData((String)j.a("imei"));
        d.a(null);
    }
    
    private void setIsUpdate(final j j, final d d) {
        AppsFlyerLib.getInstance().setIsUpdate((boolean)j.a("isUpdate"));
        d.a(null);
    }
    
    private void setMinTimeBetweenSessions(final j j, final d d) {
        AppsFlyerLib.getInstance().setMinTimeBetweenSessions((int)j.a("seconds"));
        d.a(null);
    }
    
    private void setOneLinkCustomDomain(final j j, final d d) {
        final ArrayList list = (ArrayList)j.b;
        AppsFlyerLib.getInstance().setOneLinkCustomDomain((String[])list.toArray(new String[list.size()]));
        d.a(null);
    }
    
    private void setOutOfStore(final j j, final d d) {
        final String outOfStore = (String)j.b;
        if (outOfStore != null) {
            AppsFlyerLib.getInstance().setOutOfStore(outOfStore);
        }
        d.a(null);
    }
    
    private void setPartnerData(final j j, final d d) {
        final String s = (String)j.a("partnerId");
        final HashMap hashMap = (HashMap)j.a("partnersData");
        if (hashMap != null) {
            AppsFlyerLib.getInstance().setPartnerData(s, hashMap);
        }
        d.a(null);
    }
    
    private void setPushNotification(final j j, final d d) {
        AppsFlyerLib.getInstance().sendPushNotificationData(this.activity);
        d.a(null);
    }
    
    private void setResolveDeepLinkURLs(final j j, final d d) {
        AppsFlyerLib.getInstance().setResolveDeepLinkURLs((String[])((ArrayList)j.b).toArray(new String[0]));
        d.a(null);
    }
    
    private void setSharingFilter(final j j, final d d) {
        AppsFlyerLib.getInstance().setSharingFilter(new String[0]);
        d.a(null);
    }
    
    private void setSharingFilterForAllPartners(final d d) {
        AppsFlyerLib.getInstance().setSharingFilterForAllPartners();
        d.a(null);
    }
    
    private void setSharingFilterForPartners(final j j, final d d) {
        final Object b = j.b;
        if (b != null) {
            final ArrayList list = (ArrayList)b;
            AppsFlyerLib.getInstance().setSharingFilterForPartners((String[])list.toArray(new String[list.size()]));
        }
        d.a(null);
    }
    
    private void setUserEmails(final j j, final d d) {
        final List list = (List)j.a("emails");
        final int intValue = (int)j.a("cryptType");
        AppsFlyerProperties.EmailsCryptType emailsCryptType;
        if (intValue == 0) {
            emailsCryptType = AppsFlyerProperties.EmailsCryptType.NONE;
        }
        else {
            if (intValue != 1) {
                throw new InvalidParameterException("You can use only NONE or SHA256 for EmailsCryptType on android");
            }
            emailsCryptType = AppsFlyerProperties.EmailsCryptType.SHA256;
        }
        if (list != null) {
            AppsFlyerLib.getInstance().setUserEmails(emailsCryptType, (String[])list.toArray(new String[0]));
        }
        d.a(null);
    }
    
    private void startListening(final Object o, final d d) {
        final String s = (String)o;
        if (s.equals("onInstallConversionData")) {
            this.gcdCallback = Boolean.TRUE;
        }
        if (s.equals("onAppOpenAttribution")) {
            this.oaoaCallback = Boolean.TRUE;
        }
        if (s.equals("onDeepLinking")) {
            this.udlCallback = Boolean.TRUE;
        }
        if (s.equals("validatePurchase")) {
            this.validatePurchaseCallback = Boolean.TRUE;
        }
        final HashMap<String, String> hashMap = new HashMap<String, String>();
        hashMap.put("id", s);
        this.mCallbacks.put(s, (Map<String, Object>)hashMap);
        d.a(null);
    }
    
    private void stop(final j j, final d d) {
        AppsFlyerLib.getInstance().stop((boolean)j.a("isStopped"), this.mContext);
        d.a(null);
    }
    
    private void updateServerUninstallToken(final j j, final d d) {
        AppsFlyerLib.getInstance().updateServerUninstallToken(this.mContext, (String)j.a("token"));
        d.a(null);
    }
    
    private void validateAndLogInAppPurchase(final j j, final d d) {
        this.registerValidatorListener();
        AppsFlyerLib.getInstance().validateAndLogInAppPurchase(this.mContext, (String)j.a("publicKey"), (String)j.a("signature"), (String)j.a("purchaseData"), (String)j.a("price"), (String)j.a("currency"), (Map<String, String>)j.a("additionalParameters"));
        d.a(null);
    }
    
    private void waitForCustomerUserId(final j j, final d d) {
        AppsFlyerLib.getInstance().waitForCustomerUserId((boolean)j.a("wait"));
        d.a(null);
    }
    
    @Override
    public void onAttachedToActivity(final B5.c c) {
        this.activity = c.c();
        this.mIntent = c.c().getIntent();
        this.mApplication = c.c().getApplication();
        c.g(this.onNewIntentListener);
    }
    
    @Override
    public void onAttachedToEngine(final b b) {
        this.onAttachedToEngine(b.a(), b.b());
    }
    
    @Override
    public void onDetachedFromActivity() {
        this.activity = null;
        AppsflyerSdkPlugin.saveCallbacks = true;
    }
    
    @Override
    public void onDetachedFromActivityForConfigChanges() {
    }
    
    @Override
    public void onDetachedFromEngine(final b b) {
        this.mMethodChannel.e(null);
        this.mMethodChannel = null;
        this.mEventChannel.d(null);
        this.mEventChannel = null;
    }
    
    @Override
    public void onMethodCall(final j j, final d sharingFilterForAllPartners) {
        if (this.activity == null) {
            Log.d("AppsFlyer", "Activity isn't attached to the flutter engine");
            return;
        }
        final String a = j.a;
        a.hashCode();
        final int hashCode = a.hashCode();
        int n = -1;
        switch (hashCode) {
            case 2088314227: {
                if (!a.equals("setAdditionalData")) {
                    break;
                }
                n = 39;
                break;
            }
            case 1998705368: {
                if (!a.equals("getAppsFlyerUID")) {
                    break;
                }
                n = 38;
                break;
            }
            case 1989757366: {
                if (!a.equals("logEvent")) {
                    break;
                }
                n = 37;
                break;
            }
            case 1984636202: {
                if (!a.equals("setHost")) {
                    break;
                }
                n = 36;
                break;
            }
            case 1948321034: {
                if (!a.equals("initSdk")) {
                    break;
                }
                n = 35;
                break;
            }
            case 1877854818: {
                if (!a.equals("setCollectAndroidId")) {
                    break;
                }
                n = 34;
                break;
            }
            case 1824508181: {
                if (!a.equals("setIsUpdate")) {
                    break;
                }
                n = 33;
                break;
            }
            case 1809410897: {
                if (!a.equals("addPushNotificationDeepLinkPath")) {
                    break;
                }
                n = 32;
                break;
            }
            case 1777143241: {
                if (!a.equals("getHostName")) {
                    break;
                }
                n = 31;
                break;
            }
            case 1660731908: {
                if (!a.equals("setUserEmails")) {
                    break;
                }
                n = 30;
                break;
            }
            case 1245101844: {
                if (!a.equals("setImeiData")) {
                    break;
                }
                n = 29;
                break;
            }
            case 1179298132: {
                if (!a.equals("setResolveDeepLinkURLs")) {
                    break;
                }
                n = 28;
                break;
            }
            case 927926776: {
                if (!a.equals("generateInviteLink")) {
                    break;
                }
                n = 27;
                break;
            }
            case 747368646: {
                if (!a.equals("setCustomerUserId")) {
                    break;
                }
                n = 26;
                break;
            }
            case 725535758: {
                if (!a.equals("setCustomerIdAndLogSession")) {
                    break;
                }
                n = 25;
                break;
            }
            case 668311477: {
                if (!a.equals("setSharingFilterForAllPartners")) {
                    break;
                }
                n = 24;
                break;
            }
            case 655665144: {
                if (!a.equals("waitForCustomerUserId")) {
                    break;
                }
                n = 23;
                break;
            }
            case 572656008: {
                if (!a.equals("setMinTimeBetweenSessions")) {
                    break;
                }
                n = 22;
                break;
            }
            case 312972995: {
                if (!a.equals("updateServerUninstallToken")) {
                    break;
                }
                n = 21;
                break;
            }
            case 24884786: {
                if (!a.equals("setSharingFilter")) {
                    break;
                }
                n = 20;
                break;
            }
            case 23388530: {
                if (!a.equals("setAndroidIdData")) {
                    break;
                }
                n = 19;
                break;
            }
            case 12497644: {
                if (!a.equals("setDisableAdvertisingIdentifiers")) {
                    break;
                }
                n = 18;
                break;
            }
            case 3540994: {
                if (!a.equals("stop")) {
                    break;
                }
                n = 17;
                break;
            }
            case -120258830: {
                if (!a.equals("setDisableNetworkData")) {
                    break;
                }
                n = 16;
                break;
            }
            case -144228848: {
                if (!a.equals("logCrossPromotionImpression")) {
                    break;
                }
                n = 15;
                break;
            }
            case -191766732: {
                if (!a.equals("getSDKVersion")) {
                    break;
                }
                n = 14;
                break;
            }
            case -479280098: {
                if (!a.equals("setOutOfStore")) {
                    break;
                }
                n = 13;
                break;
            }
            case -512438553: {
                if (!a.equals("logCrossPromotionAndOpenStore")) {
                    break;
                }
                n = 12;
                break;
            }
            case -559100112: {
                if (!a.equals("setCollectIMEI")) {
                    break;
                }
                n = 11;
                break;
            }
            case -717099497: {
                if (!a.equals("sendPushNotificationData")) {
                    break;
                }
                n = 10;
                break;
            }
            case -752931040: {
                if (!a.equals("setCurrencyCode")) {
                    break;
                }
                n = 9;
                break;
            }
            case -1191484736: {
                if (!a.equals("enableFacebookDeferredApplinks")) {
                    break;
                }
                n = 8;
                break;
            }
            case -1253411310: {
                if (!a.equals("getOutOfStore")) {
                    break;
                }
                n = 7;
                break;
            }
            case -1267985549: {
                if (!a.equals("setOneLinkCustomDomain")) {
                    break;
                }
                n = 6;
                break;
            }
            case -1437772080: {
                if (!a.equals("setPartnerData")) {
                    break;
                }
                n = 5;
                break;
            }
            case -1489605040: {
                if (!a.equals("getHostPrefix")) {
                    break;
                }
                n = 4;
                break;
            }
            case -1777356377: {
                if (!a.equals("setPushNotification")) {
                    break;
                }
                n = 3;
                break;
            }
            case -1820568830: {
                if (!a.equals("setSharingFilterForPartners")) {
                    break;
                }
                n = 2;
                break;
            }
            case -1995722377: {
                if (!a.equals("validateAndLogInAppAndroidPurchase")) {
                    break;
                }
                n = 1;
                break;
            }
            case -2012504269: {
                if (!a.equals("setAppInviteOneLinkID")) {
                    break;
                }
                n = 0;
                break;
            }
        }
        switch (n) {
            default: {
                sharingFilterForAllPartners.c();
            }
            case 39: {
                this.setAdditionalData(j, sharingFilterForAllPartners);
            }
            case 38: {
                this.getAppsFlyerUID(sharingFilterForAllPartners);
            }
            case 37: {
                this.logEvent(j, sharingFilterForAllPartners);
            }
            case 36: {
                this.setHost(j, sharingFilterForAllPartners);
            }
            case 35: {
                this.initSdk(j, sharingFilterForAllPartners);
            }
            case 34: {
                this.setCollectAndroidId(j, sharingFilterForAllPartners);
            }
            case 33: {
                this.setIsUpdate(j, sharingFilterForAllPartners);
            }
            case 32: {
                this.addPushNotificationDeepLinkPath(j, sharingFilterForAllPartners);
            }
            case 31: {
                this.getHostName(sharingFilterForAllPartners);
            }
            case 30: {
                this.setUserEmails(j, sharingFilterForAllPartners);
            }
            case 29: {
                this.setImeiData(j, sharingFilterForAllPartners);
            }
            case 28: {
                this.setResolveDeepLinkURLs(j, sharingFilterForAllPartners);
            }
            case 27: {
                this.generateInviteLink(j, sharingFilterForAllPartners);
            }
            case 26: {
                this.setCustomerUserId(j, sharingFilterForAllPartners);
            }
            case 25: {
                this.setCustomerIdAndLogSession(j, sharingFilterForAllPartners);
            }
            case 24: {
                this.setSharingFilterForAllPartners(sharingFilterForAllPartners);
            }
            case 23: {
                this.waitForCustomerUserId(j, sharingFilterForAllPartners);
            }
            case 22: {
                this.setMinTimeBetweenSessions(j, sharingFilterForAllPartners);
            }
            case 21: {
                this.updateServerUninstallToken(j, sharingFilterForAllPartners);
            }
            case 20: {
                this.setSharingFilter(j, sharingFilterForAllPartners);
            }
            case 19: {
                this.setAndroidIdData(j, sharingFilterForAllPartners);
            }
            case 18: {
                this.setDisableAdvertisingIdentifiers(j, sharingFilterForAllPartners);
            }
            case 17: {
                this.stop(j, sharingFilterForAllPartners);
            }
            case 16: {
                this.setDisableNetworkData(j, sharingFilterForAllPartners);
            }
            case 15: {
                this.logCrossPromotionImpression(j, sharingFilterForAllPartners);
            }
            case 14: {
                this.getSdkVersion(sharingFilterForAllPartners);
            }
            case 13: {
                this.setOutOfStore(j, sharingFilterForAllPartners);
            }
            case 12: {
                this.logCrossPromotionAndOpenStore(j, sharingFilterForAllPartners);
            }
            case 11: {
                this.setCollectIMEI(j, sharingFilterForAllPartners);
            }
            case 10: {
                this.sendPushNotificationData(j, sharingFilterForAllPartners);
            }
            case 9: {
                this.setCurrencyCode(j, sharingFilterForAllPartners);
            }
            case 8: {
                this.enableFacebookDeferredApplinks(j, sharingFilterForAllPartners);
            }
            case 7: {
                this.getOutOfStore(sharingFilterForAllPartners);
            }
            case 6: {
                this.setOneLinkCustomDomain(j, sharingFilterForAllPartners);
            }
            case 5: {
                this.setPartnerData(j, sharingFilterForAllPartners);
            }
            case 4: {
                this.getHostPrefix(sharingFilterForAllPartners);
            }
            case 3: {
                this.setPushNotification(j, sharingFilterForAllPartners);
            }
            case 2: {
                this.setSharingFilterForPartners(j, sharingFilterForAllPartners);
            }
            case 1: {
                this.validateAndLogInAppPurchase(j, sharingFilterForAllPartners);
            }
            case 0: {
                this.setAppInivteOneLinkID(j, sharingFilterForAllPartners);
            }
        }
    }
    
    @Override
    public void onReattachedToActivityForConfigChanges(final B5.c c) {
        this.sendCachedCallbacksToDart();
        c.g(this.onNewIntentListener);
    }
}
