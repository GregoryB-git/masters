package com.appsflyer.appsflyersdk;

import A5.a;
import B5.c;
import E5.d;
import E5.j;
import E5.k;
import E5.n;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerConversionListener;
import com.appsflyer.AppsFlyerInAppPurchaseValidatorListener;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.deeplink.DeepLinkListener;
import com.appsflyer.deeplink.DeepLinkResult;
import com.appsflyer.internal.platform_extension.Plugin;
import com.appsflyer.internal.platform_extension.PluginInfo;
import com.appsflyer.share.CrossPromotionHelper;
import com.appsflyer.share.LinkGenerator;
import com.appsflyer.share.ShareInviteHelper;
import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class AppsflyerSdkPlugin implements k.c, a, B5.a {
    private static DeepLinkResult cachedDeepLinkResult;
    private static Map<String, String> cachedOnAppOpenAttribution;
    private static String cachedOnAttributionFailure;
    private static String cachedOnConversionDataFail;
    private static Map<String, Object> cachedOnConversionDataSuccess;
    private static boolean saveCallbacks;
    private Activity activity;
    private final AppsFlyerConversionListener afConversionListener;
    private final DeepLinkListener afDeepLinkListener;
    private final k.c callbacksHandler;
    private Boolean gcdCallback;
    private Boolean isFacebookDeferredApplinksEnabled;
    private Boolean isSetDisableAdvertisingIdentifiersEnable;
    private Application mApplication;
    private k mCallbackChannel;
    private Map<String, Map<String, Object>> mCallbacks;
    private Context mContext;
    private d mEventChannel;
    private Intent mIntent;
    private k mMethodChannel;
    private Boolean oaoaCallback;
    n onNewIntentListener;
    private Boolean udlCallback;
    final Handler uiThreadHandler = new Handler(Looper.getMainLooper());
    private Boolean validatePurchaseCallback;

    public AppsflyerSdkPlugin() {
        Boolean bool = Boolean.FALSE;
        this.gcdCallback = bool;
        this.oaoaCallback = bool;
        this.udlCallback = bool;
        this.validatePurchaseCallback = bool;
        this.isFacebookDeferredApplinksEnabled = bool;
        this.isSetDisableAdvertisingIdentifiersEnable = bool;
        this.mCallbacks = new HashMap();
        this.onNewIntentListener = new n() { // from class: com.appsflyer.appsflyersdk.AppsflyerSdkPlugin.1
            @Override // E5.n
            public boolean onNewIntent(Intent intent) {
                AppsflyerSdkPlugin.this.activity.setIntent(intent);
                return false;
            }
        };
        this.afConversionListener = new AppsFlyerConversionListener() { // from class: com.appsflyer.appsflyersdk.AppsflyerSdkPlugin.2
            @Override // com.appsflyer.AppsFlyerConversionListener
            public void onAppOpenAttribution(Map<String, String> map) {
                if (AppsflyerSdkPlugin.saveCallbacks) {
                    Map unused = AppsflyerSdkPlugin.cachedOnAppOpenAttribution = map;
                } else if (AppsflyerSdkPlugin.this.oaoaCallback.booleanValue()) {
                    AppsflyerSdkPlugin.this.runOnUIThread(new JSONObject(AppsflyerSdkPlugin.this.replaceNullValues(map)), "onAppOpenAttribution", "success");
                }
            }

            @Override // com.appsflyer.AppsFlyerConversionListener
            public void onAttributionFailure(String str) {
                if (AppsflyerSdkPlugin.saveCallbacks) {
                    String unused = AppsflyerSdkPlugin.cachedOnAttributionFailure = str;
                } else if (AppsflyerSdkPlugin.this.oaoaCallback.booleanValue()) {
                    AppsflyerSdkPlugin.this.runOnUIThread(AppsflyerSdkPlugin.this.buildJsonResponse(str, "failure"), "onAppOpenAttribution", "failure");
                }
            }

            @Override // com.appsflyer.AppsFlyerConversionListener
            public void onConversionDataFail(String str) {
                if (AppsflyerSdkPlugin.saveCallbacks) {
                    String unused = AppsflyerSdkPlugin.cachedOnConversionDataFail = str;
                } else if (AppsflyerSdkPlugin.this.gcdCallback.booleanValue()) {
                    AppsflyerSdkPlugin.this.runOnUIThread(AppsflyerSdkPlugin.this.buildJsonResponse(str, "failure"), "onInstallConversionData", "failure");
                }
            }

            @Override // com.appsflyer.AppsFlyerConversionListener
            public void onConversionDataSuccess(Map<String, Object> map) {
                if (AppsflyerSdkPlugin.saveCallbacks) {
                    Map unused = AppsflyerSdkPlugin.cachedOnConversionDataSuccess = map;
                } else if (AppsflyerSdkPlugin.this.gcdCallback.booleanValue()) {
                    AppsflyerSdkPlugin.this.runOnUIThread(new JSONObject(AppsflyerSdkPlugin.this.replaceNullValues(map)), "onInstallConversionData", "success");
                }
            }
        };
        this.afDeepLinkListener = new DeepLinkListener() { // from class: com.appsflyer.appsflyersdk.AppsflyerSdkPlugin.3
            @Override // com.appsflyer.deeplink.DeepLinkListener
            public void onDeepLinking(DeepLinkResult deepLinkResult) {
                if (AppsflyerSdkPlugin.saveCallbacks) {
                    DeepLinkResult unused = AppsflyerSdkPlugin.cachedDeepLinkResult = deepLinkResult;
                } else if (AppsflyerSdkPlugin.this.udlCallback.booleanValue()) {
                    AppsflyerSdkPlugin.this.runOnUIThread(deepLinkResult, "onDeepLinking", "success");
                }
            }
        };
        this.callbacksHandler = new k.c() { // from class: com.appsflyer.appsflyersdk.AppsflyerSdkPlugin.4
            @Override // E5.k.c
            public void onMethodCall(j jVar, k.d dVar) {
                if ("startListening".equals(jVar.f1670a)) {
                    AppsflyerSdkPlugin.this.startListening(jVar.f1671b, dVar);
                } else {
                    dVar.c();
                }
            }
        };
    }

    private void addPushNotificationDeepLinkPath(j jVar, k.d dVar) {
        Object obj = jVar.f1671b;
        if (obj != null) {
            ArrayList arrayList = (ArrayList) obj;
            AppsFlyerLib.getInstance().addPushNotificationDeepLinkPath((String[]) arrayList.toArray(new String[arrayList.size()]));
        }
        dVar.a(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public JSONObject buildJsonResponse(Object obj, String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("status", str);
            jSONObject.put("data", obj.toString());
        } catch (JSONException e7) {
            e7.printStackTrace();
        }
        return jSONObject;
    }

    private void enableFacebookDeferredApplinks(j jVar, k.d dVar) {
        AppsFlyerLib appsFlyerLib;
        boolean z7;
        Boolean bool = (Boolean) jVar.a("isFacebookDeferredApplinksEnabled");
        bool.booleanValue();
        this.isFacebookDeferredApplinksEnabled = bool;
        if (bool.booleanValue()) {
            appsFlyerLib = AppsFlyerLib.getInstance();
            z7 = true;
        } else {
            appsFlyerLib = AppsFlyerLib.getInstance();
            z7 = false;
        }
        appsFlyerLib.enableFacebookDeferredApplinks(z7);
        dVar.a(null);
    }

    private void generateInviteLink(j jVar, k.d dVar) {
        String str = (String) jVar.a(AppsFlyerProperties.CHANNEL);
        String str2 = (String) jVar.a("customerID");
        String str3 = (String) jVar.a("campaign");
        String str4 = (String) jVar.a("referrerName");
        String str5 = (String) jVar.a("referrerImageUrl");
        String str6 = (String) jVar.a("baseDeeplink");
        String str7 = (String) jVar.a("brandDomain");
        Map<String, String> map = (Map) jVar.a("customParams");
        LinkGenerator generateInviteUrl = ShareInviteHelper.generateInviteUrl(this.mContext);
        if (str != null && !str.equals("")) {
            generateInviteUrl.setChannel(str);
        }
        if (str3 != null && !str3.equals("")) {
            generateInviteUrl.setCampaign(str3);
        }
        if (str4 != null && !str4.equals("")) {
            generateInviteUrl.setReferrerName(str4);
        }
        if (str5 != null && !str5.equals("")) {
            generateInviteUrl.setReferrerImageURL(str5);
        }
        if (str2 != null && !str2.equals("")) {
            generateInviteUrl.setReferrerCustomerId(str2);
        }
        if (str6 != null && !str6.equals("")) {
            generateInviteUrl.setBaseDeeplink(str6);
        }
        if (str7 != null && !str7.equals("")) {
            generateInviteUrl.setBrandDomain(str7);
        }
        if (map != null && !map.equals("")) {
            generateInviteUrl.addParameters(map);
        }
        generateInviteUrl.generateLink(this.mContext, new LinkGenerator.ResponseListener() { // from class: com.appsflyer.appsflyersdk.AppsflyerSdkPlugin.5
            final JSONObject obj = new JSONObject();

            @Override // com.appsflyer.share.LinkGenerator.ResponseListener
            public void onResponse(String str8) {
                if (AppsflyerSdkPlugin.this.mCallbacks.containsKey("generateInviteLinkSuccess")) {
                    try {
                        this.obj.put("userInviteURL", str8);
                        AppsflyerSdkPlugin.this.runOnUIThread(this.obj, "generateInviteLinkSuccess", "success");
                    } catch (JSONException e7) {
                        e7.printStackTrace();
                    }
                }
            }

            @Override // com.appsflyer.share.LinkGenerator.ResponseListener
            public void onResponseError(String str8) {
                if (AppsflyerSdkPlugin.this.mCallbacks.containsKey("generateInviteLinkFailure")) {
                    try {
                        this.obj.put("error", str8);
                        AppsflyerSdkPlugin.this.runOnUIThread(str8, "generateInviteLinkFailure", "failure");
                    } catch (JSONException e7) {
                        e7.printStackTrace();
                    }
                }
            }
        });
        dVar.a(null);
    }

    private void getAppsFlyerUID(k.d dVar) {
        dVar.a(AppsFlyerLib.getInstance().getAppsFlyerUID(this.mContext));
    }

    private void getHostName(k.d dVar) {
        dVar.a(AppsFlyerLib.getInstance().getHostName());
    }

    private void getHostPrefix(k.d dVar) {
        dVar.a(AppsFlyerLib.getInstance().getHostPrefix());
    }

    private void getOutOfStore(k.d dVar) {
        dVar.a(AppsFlyerLib.getInstance().getOutOfStore(this.mContext));
    }

    private void getSdkVersion(k.d dVar) {
        dVar.a(AppsFlyerLib.getInstance().getSdkVersion());
    }

    private void initSdk(j jVar, k.d dVar) {
        AppsFlyerLib appsFlyerLib = AppsFlyerLib.getInstance();
        String str = (String) jVar.a("afDevKey");
        if (str == null || str.equals("")) {
            dVar.b(null, "AF Dev Key is empty", "AF dev key cannot be empty");
        }
        if (((Boolean) jVar.a("disableAdvertisingIdentifier")).booleanValue()) {
            appsFlyerLib.setDisableAdvertisingIdentifiers(true);
        }
        AppsFlyerConversionListener appsFlyerConversionListener = ((Boolean) jVar.a("GCD")).booleanValue() ? this.afConversionListener : null;
        if (((Boolean) jVar.a("UDL")).booleanValue()) {
            appsFlyerLib.subscribeForDeepLink(this.afDeepLinkListener);
        }
        if (((Boolean) jVar.a("isDebug")).booleanValue()) {
            appsFlyerLib.setLogLevel(AFLogger.LogLevel.DEBUG);
            appsFlyerLib.setDebugLog(true);
        } else {
            appsFlyerLib.setDebugLog(false);
        }
        appsFlyerLib.setPluginInfo(new PluginInfo(Plugin.FLUTTER, "6.12.2"));
        appsFlyerLib.init(str, appsFlyerConversionListener, this.mContext);
        String str2 = (String) jVar.a("appInviteOneLink");
        if (str2 != null) {
            appsFlyerLib.setAppInviteOneLink(str2);
        }
        appsFlyerLib.start(this.activity);
        if (saveCallbacks) {
            saveCallbacks = false;
            sendCachedCallbacksToDart();
        }
        dVar.a("success");
    }

    private static Bundle jsonToBundle(JSONObject jSONObject) {
        Bundle bundle = new Bundle();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            bundle.putString(next, jSONObject.getString(next));
        }
        return bundle;
    }

    private void logCrossPromotionAndOpenStore(j jVar, k.d dVar) {
        String str = (String) jVar.a("appId");
        String str2 = (String) jVar.a("campaign");
        Map map = (Map) jVar.a("params");
        if (str != null && !str.equals("")) {
            CrossPromotionHelper.logAndOpenStore(this.mContext, str, str2, map);
        }
        dVar.a(null);
    }

    private void logCrossPromotionImpression(j jVar, k.d dVar) {
        String str = (String) jVar.a("appId");
        String str2 = (String) jVar.a("campaign");
        Map map = (Map) jVar.a("data");
        if (str != null && !str.equals("")) {
            CrossPromotionHelper.logCrossPromoteImpression(this.mContext, str, str2, map);
        }
        dVar.a(null);
    }

    private void logEvent(j jVar, k.d dVar) {
        AppsFlyerLib.getInstance().logEvent(this.mContext, (String) jVar.a("eventName"), (Map) jVar.a("eventValues"));
        dVar.a(Boolean.TRUE);
    }

    private void registerValidatorListener() {
        AppsFlyerLib.getInstance().registerValidatorListener(this.mContext, new AppsFlyerInAppPurchaseValidatorListener() { // from class: com.appsflyer.appsflyersdk.AppsflyerSdkPlugin.7
            @Override // com.appsflyer.AppsFlyerInAppPurchaseValidatorListener
            public void onValidateInApp() {
                if (AppsflyerSdkPlugin.this.validatePurchaseCallback.booleanValue()) {
                    AppsflyerSdkPlugin.this.runOnUIThread(new JSONObject(), "validatePurchase", "success");
                }
            }

            @Override // com.appsflyer.AppsFlyerInAppPurchaseValidatorListener
            public void onValidateInAppFailure(String str) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("error", str);
                    if (AppsflyerSdkPlugin.this.validatePurchaseCallback.booleanValue()) {
                        AppsflyerSdkPlugin.this.runOnUIThread(jSONObject, "validatePurchase", "failure");
                    }
                } catch (JSONException e7) {
                    e7.printStackTrace();
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, Object> replaceNullValues(Map<String, Object> map) {
        HashMap hashMap = new HashMap();
        Iterator<Map.Entry<String, Object>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, Object> next = it.next();
            hashMap.put(next.getKey(), next.getValue() == null ? JSONObject.NULL : next.getValue());
            it.remove();
        }
        return hashMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void runOnUIThread(final Object obj, final String str, final String str2) {
        this.uiThreadHandler.post(new Runnable() { // from class: com.appsflyer.appsflyersdk.AppsflyerSdkPlugin.6
            @Override // java.lang.Runnable
            public void run() {
                Log.d("Callbacks", "Calling invokeMethod with: " + obj);
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("id", str);
                    if (str.equals("onDeepLinking")) {
                        DeepLinkResult deepLinkResult = (DeepLinkResult) obj;
                        jSONObject.put("deepLinkStatus", deepLinkResult.getStatus().toString());
                        if (deepLinkResult.getError() != null) {
                            jSONObject.put("deepLinkError", deepLinkResult.getError().toString());
                        }
                        if (deepLinkResult.getStatus() == DeepLinkResult.Status.FOUND) {
                            jSONObject.put("deepLinkObj", deepLinkResult.getDeepLink().getClickEvent());
                        }
                    } else {
                        jSONObject.put("status", str2);
                        jSONObject.put("data", obj.toString());
                    }
                } catch (JSONException e7) {
                    e7.printStackTrace();
                }
                AppsflyerSdkPlugin.this.mCallbackChannel.c("callListener", jSONObject.toString());
            }
        });
    }

    private void sendCachedCallbacksToDart() {
        DeepLinkResult deepLinkResult = cachedDeepLinkResult;
        if (deepLinkResult != null) {
            this.afDeepLinkListener.onDeepLinking(deepLinkResult);
            cachedDeepLinkResult = null;
        }
        Map<String, Object> map = cachedOnConversionDataSuccess;
        if (map != null) {
            this.afConversionListener.onConversionDataSuccess(map);
            cachedOnConversionDataSuccess = null;
        }
        Map<String, String> map2 = cachedOnAppOpenAttribution;
        if (map2 != null) {
            this.afConversionListener.onAppOpenAttribution(map2);
            cachedOnAppOpenAttribution = null;
        }
        String str = cachedOnAttributionFailure;
        if (str != null) {
            this.afConversionListener.onAttributionFailure(str);
            cachedOnAttributionFailure = null;
        }
        String str2 = cachedOnConversionDataFail;
        if (str2 != null) {
            this.afConversionListener.onConversionDataFail(str2);
            cachedOnConversionDataFail = null;
        }
    }

    private void sendPushNotificationData(j jVar, k.d dVar) {
        String str;
        String str2;
        Map map = (Map) jVar.f1671b;
        if (map == null) {
            str = "Push payload is null";
        } else {
            try {
                Bundle jsonToBundle = jsonToBundle(new JSONObject(map));
                Activity activity = this.activity;
                if (activity != null) {
                    Intent intent = activity.getIntent();
                    if (intent != null) {
                        intent.putExtras(jsonToBundle);
                        this.activity.setIntent(intent);
                        AppsFlyerLib.getInstance().sendPushNotificationData(this.activity);
                        str2 = null;
                    } else {
                        str2 = "The intent is null. Push payload has not been sent!";
                    }
                } else {
                    str2 = "The activity is null. Push payload has not been sent!";
                }
                if (str2 != null) {
                    Log.d("AppsFlyer", str2);
                    return;
                } else {
                    dVar.a(null);
                    return;
                }
            } catch (JSONException unused) {
                str = "Can't parse pushPayload to bundle";
            }
        }
        Log.d("AppsFlyer", str);
    }

    private void setAdditionalData(j jVar, k.d dVar) {
        AppsFlyerLib.getInstance().setAdditionalData((HashMap) jVar.a("customData"));
        dVar.a(null);
    }

    private void setAndroidIdData(j jVar, k.d dVar) {
        AppsFlyerLib.getInstance().setAndroidIdData((String) jVar.a("androidId"));
        dVar.a(null);
    }

    private void setAppInivteOneLinkID(j jVar, k.d dVar) {
        String str = (String) jVar.a("oneLinkID");
        if (str == null || str.length() == 0) {
            dVar.a(null);
            return;
        }
        AppsFlyerLib.getInstance().setAppInviteOneLink(str);
        if (this.mCallbacks.containsKey("setAppInviteOneLinkIDCallback")) {
            runOnUIThread(buildJsonResponse("success", "success"), "setAppInviteOneLinkIDCallback", "success");
        }
    }

    private void setCollectAndroidId(j jVar, k.d dVar) {
        AppsFlyerLib.getInstance().setCollectAndroidID(((Boolean) jVar.a("isCollect")).booleanValue());
        dVar.a(null);
    }

    private void setCollectIMEI(j jVar, k.d dVar) {
        AppsFlyerLib.getInstance().setCollectIMEI(((Boolean) jVar.a("isCollect")).booleanValue());
        dVar.a(null);
    }

    private void setCurrencyCode(j jVar, k.d dVar) {
        AppsFlyerLib.getInstance().setCurrencyCode((String) jVar.a(AppsFlyerProperties.CURRENCY_CODE));
        dVar.a(null);
    }

    private void setCustomerIdAndLogSession(j jVar, k.d dVar) {
        AppsFlyerLib.getInstance().setCustomerIdAndLogSession((String) jVar.a("id"), this.mContext);
        dVar.a(null);
    }

    private void setCustomerUserId(j jVar, k.d dVar) {
        AppsFlyerLib.getInstance().setCustomerUserId((String) jVar.a("id"));
        dVar.a(null);
    }

    private void setDisableAdvertisingIdentifiers(j jVar, k.d dVar) {
        AppsFlyerLib appsFlyerLib;
        boolean z7;
        Boolean bool = (Boolean) jVar.f1671b;
        bool.booleanValue();
        this.isSetDisableAdvertisingIdentifiersEnable = bool;
        if (bool.booleanValue()) {
            appsFlyerLib = AppsFlyerLib.getInstance();
            z7 = true;
        } else {
            appsFlyerLib = AppsFlyerLib.getInstance();
            z7 = false;
        }
        appsFlyerLib.setDisableAdvertisingIdentifiers(z7);
        dVar.a(null);
    }

    private void setDisableNetworkData(j jVar, k.d dVar) {
        AppsFlyerLib.getInstance().setDisableNetworkData(((Boolean) jVar.f1671b).booleanValue());
        dVar.a(null);
    }

    private void setHost(j jVar, k.d dVar) {
        AppsFlyerLib.getInstance().setHost((String) jVar.a("hostPrefix"), (String) jVar.a("hostName"));
    }

    private void setImeiData(j jVar, k.d dVar) {
        AppsFlyerLib.getInstance().setImeiData((String) jVar.a("imei"));
        dVar.a(null);
    }

    private void setIsUpdate(j jVar, k.d dVar) {
        AppsFlyerLib.getInstance().setIsUpdate(((Boolean) jVar.a("isUpdate")).booleanValue());
        dVar.a(null);
    }

    private void setMinTimeBetweenSessions(j jVar, k.d dVar) {
        AppsFlyerLib.getInstance().setMinTimeBetweenSessions(((Integer) jVar.a("seconds")).intValue());
        dVar.a(null);
    }

    private void setOneLinkCustomDomain(j jVar, k.d dVar) {
        ArrayList arrayList = (ArrayList) jVar.f1671b;
        AppsFlyerLib.getInstance().setOneLinkCustomDomain((String[]) arrayList.toArray(new String[arrayList.size()]));
        dVar.a(null);
    }

    private void setOutOfStore(j jVar, k.d dVar) {
        String str = (String) jVar.f1671b;
        if (str != null) {
            AppsFlyerLib.getInstance().setOutOfStore(str);
        }
        dVar.a(null);
    }

    private void setPartnerData(j jVar, k.d dVar) {
        String str = (String) jVar.a("partnerId");
        HashMap hashMap = (HashMap) jVar.a("partnersData");
        if (hashMap != null) {
            AppsFlyerLib.getInstance().setPartnerData(str, hashMap);
        }
        dVar.a(null);
    }

    private void setPushNotification(j jVar, k.d dVar) {
        AppsFlyerLib.getInstance().sendPushNotificationData(this.activity);
        dVar.a(null);
    }

    private void setResolveDeepLinkURLs(j jVar, k.d dVar) {
        AppsFlyerLib.getInstance().setResolveDeepLinkURLs((String[]) ((ArrayList) jVar.f1671b).toArray(new String[0]));
        dVar.a(null);
    }

    private void setSharingFilter(j jVar, k.d dVar) {
        AppsFlyerLib.getInstance().setSharingFilter(new String[0]);
        dVar.a(null);
    }

    private void setSharingFilterForAllPartners(k.d dVar) {
        AppsFlyerLib.getInstance().setSharingFilterForAllPartners();
        dVar.a(null);
    }

    private void setSharingFilterForPartners(j jVar, k.d dVar) {
        Object obj = jVar.f1671b;
        if (obj != null) {
            ArrayList arrayList = (ArrayList) obj;
            AppsFlyerLib.getInstance().setSharingFilterForPartners((String[]) arrayList.toArray(new String[arrayList.size()]));
        }
        dVar.a(null);
    }

    private void setUserEmails(j jVar, k.d dVar) {
        AppsFlyerProperties.EmailsCryptType emailsCryptType;
        List list = (List) jVar.a("emails");
        int intValue = ((Integer) jVar.a("cryptType")).intValue();
        if (intValue == 0) {
            emailsCryptType = AppsFlyerProperties.EmailsCryptType.NONE;
        } else {
            if (intValue != 1) {
                throw new InvalidParameterException("You can use only NONE or SHA256 for EmailsCryptType on android");
            }
            emailsCryptType = AppsFlyerProperties.EmailsCryptType.SHA256;
        }
        if (list != null) {
            AppsFlyerLib.getInstance().setUserEmails(emailsCryptType, (String[]) list.toArray(new String[0]));
        }
        dVar.a(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startListening(Object obj, k.d dVar) {
        String str = (String) obj;
        if (str.equals("onInstallConversionData")) {
            this.gcdCallback = Boolean.TRUE;
        }
        if (str.equals("onAppOpenAttribution")) {
            this.oaoaCallback = Boolean.TRUE;
        }
        if (str.equals("onDeepLinking")) {
            this.udlCallback = Boolean.TRUE;
        }
        if (str.equals("validatePurchase")) {
            this.validatePurchaseCallback = Boolean.TRUE;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("id", str);
        this.mCallbacks.put(str, hashMap);
        dVar.a(null);
    }

    private void stop(j jVar, k.d dVar) {
        AppsFlyerLib.getInstance().stop(((Boolean) jVar.a("isStopped")).booleanValue(), this.mContext);
        dVar.a(null);
    }

    private void updateServerUninstallToken(j jVar, k.d dVar) {
        AppsFlyerLib.getInstance().updateServerUninstallToken(this.mContext, (String) jVar.a("token"));
        dVar.a(null);
    }

    private void validateAndLogInAppPurchase(j jVar, k.d dVar) {
        registerValidatorListener();
        AppsFlyerLib.getInstance().validateAndLogInAppPurchase(this.mContext, (String) jVar.a("publicKey"), (String) jVar.a("signature"), (String) jVar.a("purchaseData"), (String) jVar.a("price"), (String) jVar.a("currency"), (Map) jVar.a("additionalParameters"));
        dVar.a(null);
    }

    private void waitForCustomerUserId(j jVar, k.d dVar) {
        AppsFlyerLib.getInstance().waitForCustomerUserId(((Boolean) jVar.a("wait")).booleanValue());
        dVar.a(null);
    }

    @Override // B5.a
    public void onAttachedToActivity(c cVar) {
        this.activity = cVar.c();
        this.mIntent = cVar.c().getIntent();
        this.mApplication = cVar.c().getApplication();
        cVar.g(this.onNewIntentListener);
    }

    @Override // A5.a
    public void onAttachedToEngine(a.b bVar) {
        onAttachedToEngine(bVar.a(), bVar.b());
    }

    @Override // B5.a
    public void onDetachedFromActivity() {
        this.activity = null;
        saveCallbacks = true;
    }

    @Override // B5.a
    public void onDetachedFromActivityForConfigChanges() {
    }

    @Override // A5.a
    public void onDetachedFromEngine(a.b bVar) {
        this.mMethodChannel.e(null);
        this.mMethodChannel = null;
        this.mEventChannel.d(null);
        this.mEventChannel = null;
    }

    @Override // E5.k.c
    public void onMethodCall(j jVar, k.d dVar) {
        if (this.activity == null) {
            Log.d("AppsFlyer", "Activity isn't attached to the flutter engine");
        }
        String str = jVar.f1670a;
        str.hashCode();
        switch (str) {
            case "setAppInviteOneLinkID":
                setAppInivteOneLinkID(jVar, dVar);
                break;
            case "validateAndLogInAppAndroidPurchase":
                validateAndLogInAppPurchase(jVar, dVar);
                break;
            case "setSharingFilterForPartners":
                setSharingFilterForPartners(jVar, dVar);
                break;
            case "setPushNotification":
                setPushNotification(jVar, dVar);
                break;
            case "getHostPrefix":
                getHostPrefix(dVar);
                break;
            case "setPartnerData":
                setPartnerData(jVar, dVar);
                break;
            case "setOneLinkCustomDomain":
                setOneLinkCustomDomain(jVar, dVar);
                break;
            case "getOutOfStore":
                getOutOfStore(dVar);
                break;
            case "enableFacebookDeferredApplinks":
                enableFacebookDeferredApplinks(jVar, dVar);
                break;
            case "setCurrencyCode":
                setCurrencyCode(jVar, dVar);
                break;
            case "sendPushNotificationData":
                sendPushNotificationData(jVar, dVar);
                break;
            case "setCollectIMEI":
                setCollectIMEI(jVar, dVar);
                break;
            case "logCrossPromotionAndOpenStore":
                logCrossPromotionAndOpenStore(jVar, dVar);
                break;
            case "setOutOfStore":
                setOutOfStore(jVar, dVar);
                break;
            case "getSDKVersion":
                getSdkVersion(dVar);
                break;
            case "logCrossPromotionImpression":
                logCrossPromotionImpression(jVar, dVar);
                break;
            case "setDisableNetworkData":
                setDisableNetworkData(jVar, dVar);
                break;
            case "stop":
                stop(jVar, dVar);
                break;
            case "setDisableAdvertisingIdentifiers":
                setDisableAdvertisingIdentifiers(jVar, dVar);
                break;
            case "setAndroidIdData":
                setAndroidIdData(jVar, dVar);
                break;
            case "setSharingFilter":
                setSharingFilter(jVar, dVar);
                break;
            case "updateServerUninstallToken":
                updateServerUninstallToken(jVar, dVar);
                break;
            case "setMinTimeBetweenSessions":
                setMinTimeBetweenSessions(jVar, dVar);
                break;
            case "waitForCustomerUserId":
                waitForCustomerUserId(jVar, dVar);
                break;
            case "setSharingFilterForAllPartners":
                setSharingFilterForAllPartners(dVar);
                break;
            case "setCustomerIdAndLogSession":
                setCustomerIdAndLogSession(jVar, dVar);
                break;
            case "setCustomerUserId":
                setCustomerUserId(jVar, dVar);
                break;
            case "generateInviteLink":
                generateInviteLink(jVar, dVar);
                break;
            case "setResolveDeepLinkURLs":
                setResolveDeepLinkURLs(jVar, dVar);
                break;
            case "setImeiData":
                setImeiData(jVar, dVar);
                break;
            case "setUserEmails":
                setUserEmails(jVar, dVar);
                break;
            case "getHostName":
                getHostName(dVar);
                break;
            case "addPushNotificationDeepLinkPath":
                addPushNotificationDeepLinkPath(jVar, dVar);
                break;
            case "setIsUpdate":
                setIsUpdate(jVar, dVar);
                break;
            case "setCollectAndroidId":
                setCollectAndroidId(jVar, dVar);
                break;
            case "initSdk":
                initSdk(jVar, dVar);
                break;
            case "setHost":
                setHost(jVar, dVar);
                break;
            case "logEvent":
                logEvent(jVar, dVar);
                break;
            case "getAppsFlyerUID":
                getAppsFlyerUID(dVar);
                break;
            case "setAdditionalData":
                setAdditionalData(jVar, dVar);
                break;
            default:
                dVar.c();
                break;
        }
    }

    @Override // B5.a
    public void onReattachedToActivityForConfigChanges(c cVar) {
        sendCachedCallbacksToDart();
        cVar.g(this.onNewIntentListener);
    }

    private void onAttachedToEngine(Context context, E5.c cVar) {
        this.mContext = context;
        this.mEventChannel = new d(cVar, "af-events");
        k kVar = new k(cVar, "af-api");
        this.mMethodChannel = kVar;
        kVar.e(this);
        k kVar2 = new k(cVar, "callbacks");
        this.mCallbackChannel = kVar2;
        kVar2.e(this.callbacksHandler);
    }
}
