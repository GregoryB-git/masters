/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.app.Application
 *  android.content.Context
 *  android.content.Intent
 *  android.os.Bundle
 *  android.os.Handler
 *  android.os.Looper
 *  android.util.Log
 *  java.lang.Boolean
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.security.InvalidParameterException
 *  java.util.ArrayList
 *  java.util.HashMap
 *  java.util.Iterator
 *  java.util.List
 *  java.util.Map
 *  java.util.Map$Entry
 *  java.util.Set
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.appsflyer.appsflyersdk;

import A5.a;
import B5.a;
import E5.c;
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
import com.appsflyer.deeplink.DeepLink;
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
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

public class AppsflyerSdkPlugin
implements k.c,
A5.a,
a {
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
        Boolean bl;
        this.gcdCallback = bl = Boolean.FALSE;
        this.oaoaCallback = bl;
        this.udlCallback = bl;
        this.validatePurchaseCallback = bl;
        this.isFacebookDeferredApplinksEnabled = bl;
        this.isSetDisableAdvertisingIdentifiersEnable = bl;
        this.mCallbacks = new HashMap();
        this.onNewIntentListener = new n(){

            @Override
            public boolean onNewIntent(Intent intent) {
                AppsflyerSdkPlugin.this.activity.setIntent(intent);
                return false;
            }
        };
        this.afConversionListener = new AppsFlyerConversionListener(){

            @Override
            public void onAppOpenAttribution(Map<String, String> jSONObject) {
                if (saveCallbacks) {
                    cachedOnAppOpenAttribution = jSONObject;
                    return;
                }
                if (AppsflyerSdkPlugin.this.oaoaCallback.booleanValue()) {
                    jSONObject = new JSONObject(AppsflyerSdkPlugin.this.replaceNullValues(jSONObject));
                    AppsflyerSdkPlugin.this.runOnUIThread((Object)jSONObject, "onAppOpenAttribution", "success");
                }
            }

            @Override
            public void onAttributionFailure(String string2) {
                if (saveCallbacks) {
                    cachedOnAttributionFailure = string2;
                    return;
                }
                if (AppsflyerSdkPlugin.this.oaoaCallback.booleanValue()) {
                    string2 = AppsflyerSdkPlugin.this.buildJsonResponse(string2, "failure");
                    AppsflyerSdkPlugin.this.runOnUIThread(string2, "onAppOpenAttribution", "failure");
                }
            }

            @Override
            public void onConversionDataFail(String string2) {
                if (saveCallbacks) {
                    cachedOnConversionDataFail = string2;
                    return;
                }
                if (AppsflyerSdkPlugin.this.gcdCallback.booleanValue()) {
                    string2 = AppsflyerSdkPlugin.this.buildJsonResponse(string2, "failure");
                    AppsflyerSdkPlugin.this.runOnUIThread(string2, "onInstallConversionData", "failure");
                }
            }

            @Override
            public void onConversionDataSuccess(Map<String, Object> jSONObject) {
                if (saveCallbacks) {
                    cachedOnConversionDataSuccess = jSONObject;
                    return;
                }
                if (AppsflyerSdkPlugin.this.gcdCallback.booleanValue()) {
                    jSONObject = new JSONObject(AppsflyerSdkPlugin.this.replaceNullValues(jSONObject));
                    AppsflyerSdkPlugin.this.runOnUIThread((Object)jSONObject, "onInstallConversionData", "success");
                }
            }
        };
        this.afDeepLinkListener = new DeepLinkListener(){

            @Override
            public void onDeepLinking(DeepLinkResult deepLinkResult) {
                if (saveCallbacks) {
                    cachedDeepLinkResult = deepLinkResult;
                    return;
                }
                if (AppsflyerSdkPlugin.this.udlCallback.booleanValue()) {
                    AppsflyerSdkPlugin.this.runOnUIThread(deepLinkResult, "onDeepLinking", "success");
                }
            }
        };
        this.callbacksHandler = new k.c(){

            @Override
            public void onMethodCall(j j8, k.d d8) {
                if ("startListening".equals((Object)j8.a)) {
                    AppsflyerSdkPlugin.this.startListening(j8.b, d8);
                    return;
                }
                d8.c();
            }
        };
    }

    private void addPushNotificationDeepLinkPath(j object, k.d d8) {
        object = object.b;
        if (object != null) {
            object = (ArrayList)object;
            object = (String[])object.toArray((Object[])new String[object.size()]);
            AppsFlyerLib.getInstance().addPushNotificationDeepLinkPath((String[])object);
        }
        d8.a(null);
    }

    private JSONObject buildJsonResponse(Object object, String string2) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("status", (Object)string2);
            jSONObject.put("data", (Object)object.toString());
            return jSONObject;
        }
        catch (JSONException jSONException) {
            jSONException.printStackTrace();
            return jSONObject;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private void enableFacebookDeferredApplinks(j object, k.d d8) {
        boolean bl;
        object = (Boolean)object.a("isFacebookDeferredApplinksEnabled");
        object.booleanValue();
        this.isFacebookDeferredApplinksEnabled = object;
        if (object.booleanValue()) {
            object = AppsFlyerLib.getInstance();
            bl = true;
        } else {
            object = AppsFlyerLib.getInstance();
            bl = false;
        }
        object.enableFacebookDeferredApplinks(bl);
        d8.a(null);
    }

    private void generateInviteLink(j object, k.d d8) {
        Object object2 = (String)object.a("channel");
        String string2 = (String)object.a("customerID");
        String string3 = (String)object.a("campaign");
        String string4 = (String)object.a("referrerName");
        String string5 = (String)object.a("referrerImageUrl");
        String string6 = (String)object.a("baseDeeplink");
        String string7 = (String)object.a("brandDomain");
        Map map = (Map)object.a("customParams");
        object = ShareInviteHelper.generateInviteUrl(this.mContext);
        if (object2 != null && !object2.equals((Object)"")) {
            object.setChannel((String)object2);
        }
        if (string3 != null && !string3.equals((Object)"")) {
            object.setCampaign(string3);
        }
        if (string4 != null && !string4.equals((Object)"")) {
            object.setReferrerName(string4);
        }
        if (string5 != null && !string5.equals((Object)"")) {
            object.setReferrerImageURL(string5);
        }
        if (string2 != null && !string2.equals((Object)"")) {
            object.setReferrerCustomerId(string2);
        }
        if (string6 != null && !string6.equals((Object)"")) {
            object.setBaseDeeplink(string6);
        }
        if (string7 != null && !string7.equals((Object)"")) {
            object.setBrandDomain(string7);
        }
        if (map != null && !map.equals((Object)"")) {
            object.addParameters(map);
        }
        object2 = new LinkGenerator.ResponseListener(){
            final JSONObject obj;
            {
                this.obj = new JSONObject();
            }

            @Override
            public void onResponse(String string2) {
                if (AppsflyerSdkPlugin.this.mCallbacks.containsKey((Object)"generateInviteLinkSuccess")) {
                    try {
                        this.obj.put("userInviteURL", (Object)string2);
                        AppsflyerSdkPlugin.this.runOnUIThread((Object)this.obj, "generateInviteLinkSuccess", "success");
                        return;
                    }
                    catch (JSONException jSONException) {
                        jSONException.printStackTrace();
                    }
                }
            }

            @Override
            public void onResponseError(String string2) {
                if (AppsflyerSdkPlugin.this.mCallbacks.containsKey((Object)"generateInviteLinkFailure")) {
                    try {
                        this.obj.put("error", (Object)string2);
                        AppsflyerSdkPlugin.this.runOnUIThread(string2, "generateInviteLinkFailure", "failure");
                        return;
                    }
                    catch (JSONException jSONException) {
                        jSONException.printStackTrace();
                    }
                }
            }
        };
        object.generateLink(this.mContext, (LinkGenerator.ResponseListener)object2);
        d8.a(null);
    }

    private void getAppsFlyerUID(k.d d8) {
        d8.a(AppsFlyerLib.getInstance().getAppsFlyerUID(this.mContext));
    }

    private void getHostName(k.d d8) {
        d8.a(AppsFlyerLib.getInstance().getHostName());
    }

    private void getHostPrefix(k.d d8) {
        d8.a(AppsFlyerLib.getInstance().getHostPrefix());
    }

    private void getOutOfStore(k.d d8) {
        d8.a(AppsFlyerLib.getInstance().getOutOfStore(this.mContext));
    }

    private void getSdkVersion(k.d d8) {
        d8.a(AppsFlyerLib.getInstance().getSdkVersion());
    }

    private void initSdk(j object, k.d d8) {
        AppsFlyerLib appsFlyerLib = AppsFlyerLib.getInstance();
        String string2 = (String)object.a("afDevKey");
        AppsFlyerConversionListener appsFlyerConversionListener = null;
        if (string2 == null || string2.equals((Object)"")) {
            d8.b(null, "AF Dev Key is empty", "AF dev key cannot be empty");
        }
        if (((Boolean)object.a("disableAdvertisingIdentifier")).booleanValue()) {
            appsFlyerLib.setDisableAdvertisingIdentifiers(true);
        }
        if (((Boolean)object.a("GCD")).booleanValue()) {
            appsFlyerConversionListener = this.afConversionListener;
        }
        if (((Boolean)object.a("UDL")).booleanValue()) {
            appsFlyerLib.subscribeForDeepLink(this.afDeepLinkListener);
        }
        if (((Boolean)object.a("isDebug")).booleanValue()) {
            appsFlyerLib.setLogLevel(AFLogger.LogLevel.DEBUG);
            appsFlyerLib.setDebugLog(true);
        } else {
            appsFlyerLib.setDebugLog(false);
        }
        appsFlyerLib.setPluginInfo(new PluginInfo(Plugin.FLUTTER, "6.12.2"));
        appsFlyerLib.init(string2, appsFlyerConversionListener, this.mContext);
        object = (String)object.a("appInviteOneLink");
        if (object != null) {
            appsFlyerLib.setAppInviteOneLink((String)object);
        }
        appsFlyerLib.start((Context)this.activity);
        if (saveCallbacks) {
            saveCallbacks = false;
            this.sendCachedCallbacksToDart();
        }
        d8.a("success");
    }

    private static Bundle jsonToBundle(JSONObject jSONObject) {
        Bundle bundle = new Bundle();
        Iterator iterator = jSONObject.keys();
        while (iterator.hasNext()) {
            String string2 = (String)iterator.next();
            bundle.putString(string2, jSONObject.getString(string2));
        }
        return bundle;
    }

    private void logCrossPromotionAndOpenStore(j j8, k.d d8) {
        String string2 = (String)j8.a("appId");
        String string3 = (String)j8.a("campaign");
        j8 = (Map)j8.a("params");
        if (string2 != null && !string2.equals((Object)"")) {
            CrossPromotionHelper.logAndOpenStore(this.mContext, string2, string3, j8);
        }
        d8.a(null);
    }

    private void logCrossPromotionImpression(j j8, k.d d8) {
        String string2 = (String)j8.a("appId");
        String string3 = (String)j8.a("campaign");
        j8 = (Map)j8.a("data");
        if (string2 != null && !string2.equals((Object)"")) {
            CrossPromotionHelper.logCrossPromoteImpression(this.mContext, string2, string3, j8);
        }
        d8.a(null);
    }

    private void logEvent(j j8, k.d d8) {
        AppsFlyerLib appsFlyerLib = AppsFlyerLib.getInstance();
        String string2 = (String)j8.a("eventName");
        j8 = (Map)j8.a("eventValues");
        appsFlyerLib.logEvent(this.mContext, string2, (Map<String, Object>)j8);
        d8.a((Object)Boolean.TRUE);
    }

    private void onAttachedToEngine(Context object, c c8) {
        this.mContext = object;
        this.mEventChannel = new d(c8, "af-events");
        this.mMethodChannel = object = new k(c8, "af-api");
        object.e(this);
        this.mCallbackChannel = object = new k(c8, "callbacks");
        object.e(this.callbacksHandler);
    }

    private void registerValidatorListener() {
        AppsFlyerInAppPurchaseValidatorListener appsFlyerInAppPurchaseValidatorListener = new AppsFlyerInAppPurchaseValidatorListener(){

            @Override
            public void onValidateInApp() {
                if (AppsflyerSdkPlugin.this.validatePurchaseCallback.booleanValue()) {
                    AppsflyerSdkPlugin.this.runOnUIThread((Object)new JSONObject(), "validatePurchase", "success");
                }
            }

            @Override
            public void onValidateInAppFailure(String string2) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("error", (Object)string2);
                    if (AppsflyerSdkPlugin.this.validatePurchaseCallback.booleanValue()) {
                        AppsflyerSdkPlugin.this.runOnUIThread((Object)jSONObject, "validatePurchase", "failure");
                        return;
                    }
                }
                catch (JSONException jSONException) {
                    jSONException.printStackTrace();
                }
            }
        };
        AppsFlyerLib.getInstance().registerValidatorListener(this.mContext, appsFlyerInAppPurchaseValidatorListener);
    }

    private Map<String, Object> replaceNullValues(Map<String, Object> object) {
        HashMap hashMap = new HashMap();
        Iterator iterator = object.entrySet().iterator();
        while (iterator.hasNext()) {
            object = (Map.Entry)iterator.next();
            String string2 = (String)object.getKey();
            object = object.getValue() == null ? JSONObject.NULL : object.getValue();
            hashMap.put((Object)string2, object);
            iterator.remove();
        }
        return hashMap;
    }

    private void runOnUIThread(final Object object, final String string2, final String string3) {
        this.uiThreadHandler.post(new Runnable(this, object, string2, string3){

            /*
             * Enabled aggressive block sorting
             * Enabled unnecessary exception pruning
             * Enabled aggressive exception aggregation
             */
            public void run() {
                StringBuilder stringBuilder;
                block6 : {
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("Calling invokeMethod with: ");
                    stringBuilder.append(object);
                    Log.d((String)"Callbacks", (String)stringBuilder.toString());
                    stringBuilder = new JSONObject();
                    try {
                        stringBuilder.put("id", (Object)string2);
                        if (string2.equals((Object)"onDeepLinking")) {
                            DeepLinkResult deepLinkResult = (DeepLinkResult)object;
                            stringBuilder.put("deepLinkStatus", (Object)deepLinkResult.getStatus().toString());
                            if (deepLinkResult.getError() != null) {
                                stringBuilder.put("deepLinkError", (Object)deepLinkResult.getError().toString());
                            }
                            if (deepLinkResult.getStatus() == DeepLinkResult.Status.FOUND) {
                                stringBuilder.put("deepLinkObj", (Object)deepLinkResult.getDeepLink().getClickEvent());
                            }
                        } else {
                            JSONObject jSONObject = (JSONObject)object;
                            stringBuilder.put("status", (Object)string3);
                            stringBuilder.put("data", (Object)object.toString());
                        }
                        break block6;
                    }
                    catch (JSONException jSONException) {}
                    jSONException.printStackTrace();
                }
                this$0.mCallbackChannel.c("callListener", stringBuilder.toString());
            }
        });
    }

    private void sendCachedCallbacksToDart() {
        Map<String, Object> map = cachedDeepLinkResult;
        if (map != null) {
            this.afDeepLinkListener.onDeepLinking((DeepLinkResult)map);
            cachedDeepLinkResult = null;
        }
        if ((map = cachedOnConversionDataSuccess) != null) {
            this.afConversionListener.onConversionDataSuccess(map);
            cachedOnConversionDataSuccess = null;
        }
        if ((map = cachedOnAppOpenAttribution) != null) {
            this.afConversionListener.onAppOpenAttribution(map);
            cachedOnAppOpenAttribution = null;
        }
        if ((map = cachedOnAttributionFailure) != null) {
            this.afConversionListener.onAttributionFailure((String)map);
            cachedOnAttributionFailure = null;
        }
        if ((map = cachedOnConversionDataFail) != null) {
            this.afConversionListener.onConversionDataFail((String)map);
            cachedOnConversionDataFail = null;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void sendPushNotificationData(j object, k.d d8) {
        block7 : {
            block8 : {
                block5 : {
                    Activity activity;
                    block6 : {
                        object = (Map)object.b;
                        if (object != null) break block6;
                        object = "Push payload is null";
                        break block7;
                    }
                    try {
                        object = AppsflyerSdkPlugin.jsonToBundle(new JSONObject((Map)object));
                        activity = this.activity;
                        if (activity == null) break block5;
                    }
                    catch (JSONException jSONException) {}
                    if ((activity = activity.getIntent()) != null) {
                        activity.putExtras((Bundle)object);
                        this.activity.setIntent((Intent)activity);
                        AppsFlyerLib.getInstance().sendPushNotificationData(this.activity);
                        object = null;
                    } else {
                        object = "The intent is null. Push payload has not been sent!";
                    }
                    break block8;
                }
                object = "The activity is null. Push payload has not been sent!";
            }
            if (object != null) {
                Log.d((String)"AppsFlyer", (String)object);
                return;
            }
            d8.a(null);
            return;
            object = "Can't parse pushPayload to bundle";
        }
        Log.d((String)"AppsFlyer", (String)object);
    }

    private void setAdditionalData(j j8, k.d d8) {
        j8 = (HashMap)j8.a("customData");
        AppsFlyerLib.getInstance().setAdditionalData((Map<String, Object>)j8);
        d8.a(null);
    }

    private void setAndroidIdData(j object, k.d d8) {
        object = (String)object.a("androidId");
        AppsFlyerLib.getInstance().setAndroidIdData((String)object);
        d8.a(null);
    }

    private void setAppInivteOneLinkID(j object, k.d d8) {
        if ((object = (String)object.a("oneLinkID")) != null && object.length() != 0) {
            AppsFlyerLib.getInstance().setAppInviteOneLink((String)object);
            if (this.mCallbacks.containsKey((Object)"setAppInviteOneLinkIDCallback")) {
                this.runOnUIThread((Object)this.buildJsonResponse("success", "success"), "setAppInviteOneLinkIDCallback", "success");
                return;
            }
        } else {
            d8.a(null);
        }
    }

    private void setCollectAndroidId(j j8, k.d d8) {
        boolean bl = (Boolean)j8.a("isCollect");
        AppsFlyerLib.getInstance().setCollectAndroidID(bl);
        d8.a(null);
    }

    private void setCollectIMEI(j j8, k.d d8) {
        boolean bl = (Boolean)j8.a("isCollect");
        AppsFlyerLib.getInstance().setCollectIMEI(bl);
        d8.a(null);
    }

    private void setCurrencyCode(j object, k.d d8) {
        object = (String)object.a("currencyCode");
        AppsFlyerLib.getInstance().setCurrencyCode((String)object);
        d8.a(null);
    }

    private void setCustomerIdAndLogSession(j object, k.d d8) {
        object = (String)object.a("id");
        AppsFlyerLib.getInstance().setCustomerIdAndLogSession((String)object, this.mContext);
        d8.a(null);
    }

    private void setCustomerUserId(j object, k.d d8) {
        object = (String)object.a("id");
        AppsFlyerLib.getInstance().setCustomerUserId((String)object);
        d8.a(null);
    }

    /*
     * Enabled aggressive block sorting
     */
    private void setDisableAdvertisingIdentifiers(j object, k.d d8) {
        boolean bl;
        object = (Boolean)object.b;
        object.booleanValue();
        this.isSetDisableAdvertisingIdentifiersEnable = object;
        if (object.booleanValue()) {
            object = AppsFlyerLib.getInstance();
            bl = true;
        } else {
            object = AppsFlyerLib.getInstance();
            bl = false;
        }
        object.setDisableAdvertisingIdentifiers(bl);
        d8.a(null);
    }

    private void setDisableNetworkData(j j8, k.d d8) {
        boolean bl = (Boolean)j8.b;
        AppsFlyerLib.getInstance().setDisableNetworkData(bl);
        d8.a(null);
    }

    private void setHost(j object, k.d object2) {
        object2 = (String)object.a("hostPrefix");
        object = (String)object.a("hostName");
        AppsFlyerLib.getInstance().setHost((String)object2, (String)object);
    }

    private void setImeiData(j object, k.d d8) {
        object = (String)object.a("imei");
        AppsFlyerLib.getInstance().setImeiData((String)object);
        d8.a(null);
    }

    private void setIsUpdate(j j8, k.d d8) {
        boolean bl = (Boolean)j8.a("isUpdate");
        AppsFlyerLib.getInstance().setIsUpdate(bl);
        d8.a(null);
    }

    private void setMinTimeBetweenSessions(j j8, k.d d8) {
        int n8 = (Integer)j8.a("seconds");
        AppsFlyerLib.getInstance().setMinTimeBetweenSessions(n8);
        d8.a(null);
    }

    private void setOneLinkCustomDomain(j arrstring, k.d d8) {
        arrstring = (ArrayList)arrstring.b;
        arrstring = (String[])arrstring.toArray((Object[])new String[arrstring.size()]);
        AppsFlyerLib.getInstance().setOneLinkCustomDomain(arrstring);
        d8.a(null);
    }

    private void setOutOfStore(j object, k.d d8) {
        object = (String)object.b;
        if (object != null) {
            AppsFlyerLib.getInstance().setOutOfStore((String)object);
        }
        d8.a(null);
    }

    private void setPartnerData(j j8, k.d d8) {
        String string2 = (String)j8.a("partnerId");
        if ((j8 = (HashMap)j8.a("partnersData")) != null) {
            AppsFlyerLib.getInstance().setPartnerData(string2, (Map<String, Object>)j8);
        }
        d8.a(null);
    }

    private void setPushNotification(j j8, k.d d8) {
        AppsFlyerLib.getInstance().sendPushNotificationData(this.activity);
        d8.a(null);
    }

    private void setResolveDeepLinkURLs(j arrstring, k.d d8) {
        arrstring = (String[])((ArrayList)arrstring.b).toArray((Object[])new String[0]);
        AppsFlyerLib.getInstance().setResolveDeepLinkURLs(arrstring);
        d8.a(null);
    }

    private void setSharingFilter(j j8, k.d d8) {
        AppsFlyerLib.getInstance().setSharingFilter(new String[0]);
        d8.a(null);
    }

    private void setSharingFilterForAllPartners(k.d d8) {
        AppsFlyerLib.getInstance().setSharingFilterForAllPartners();
        d8.a(null);
    }

    private void setSharingFilterForPartners(j object, k.d d8) {
        object = object.b;
        if (object != null) {
            object = (ArrayList)object;
            object = (String[])object.toArray((Object[])new String[object.size()]);
            AppsFlyerLib.getInstance().setSharingFilterForPartners((String[])object);
        }
        d8.a(null);
    }

    private void setUserEmails(j object, k.d d8) {
        block6 : {
            List list;
            block5 : {
                int n8;
                block4 : {
                    list = (List)object.a("emails");
                    n8 = (Integer)object.a("cryptType");
                    if (n8 != 0) break block4;
                    object = AppsFlyerProperties.EmailsCryptType.NONE;
                    break block5;
                }
                if (n8 != 1) break block6;
                object = AppsFlyerProperties.EmailsCryptType.SHA256;
            }
            if (list != null) {
                AppsFlyerLib.getInstance().setUserEmails((AppsFlyerProperties.EmailsCryptType)((Object)object), (String[])list.toArray((Object[])new String[0]));
            }
            d8.a(null);
            return;
        }
        throw new InvalidParameterException("You can use only NONE or SHA256 for EmailsCryptType on android");
    }

    private void startListening(Object object, k.d d8) {
        if ((object = (String)object).equals((Object)"onInstallConversionData")) {
            this.gcdCallback = Boolean.TRUE;
        }
        if (object.equals((Object)"onAppOpenAttribution")) {
            this.oaoaCallback = Boolean.TRUE;
        }
        if (object.equals((Object)"onDeepLinking")) {
            this.udlCallback = Boolean.TRUE;
        }
        if (object.equals((Object)"validatePurchase")) {
            this.validatePurchaseCallback = Boolean.TRUE;
        }
        HashMap hashMap = new HashMap();
        hashMap.put((Object)"id", object);
        this.mCallbacks.put(object, (Object)hashMap);
        d8.a(null);
    }

    private void stop(j j8, k.d d8) {
        boolean bl = (Boolean)j8.a("isStopped");
        AppsFlyerLib.getInstance().stop(bl, this.mContext);
        d8.a(null);
    }

    private void updateServerUninstallToken(j object, k.d d8) {
        object = (String)object.a("token");
        AppsFlyerLib.getInstance().updateServerUninstallToken(this.mContext, (String)object);
        d8.a(null);
    }

    private void validateAndLogInAppPurchase(j j8, k.d d8) {
        this.registerValidatorListener();
        String string2 = (String)j8.a("publicKey");
        String string3 = (String)j8.a("signature");
        String string4 = (String)j8.a("purchaseData");
        String string5 = (String)j8.a("price");
        String string6 = (String)j8.a("currency");
        j8 = (Map)j8.a("additionalParameters");
        AppsFlyerLib.getInstance().validateAndLogInAppPurchase(this.mContext, string2, string3, string4, string5, string6, (Map<String, String>)j8);
        d8.a(null);
    }

    private void waitForCustomerUserId(j j8, k.d d8) {
        boolean bl = (Boolean)j8.a("wait");
        AppsFlyerLib.getInstance().waitForCustomerUserId(bl);
        d8.a(null);
    }

    @Override
    public void onAttachedToActivity(B5.c c8) {
        this.activity = c8.c();
        this.mIntent = c8.c().getIntent();
        this.mApplication = c8.c().getApplication();
        c8.g(this.onNewIntentListener);
    }

    @Override
    public void onAttachedToEngine(a.b b8) {
        this.onAttachedToEngine(b8.a(), b8.b());
    }

    @Override
    public void onDetachedFromActivity() {
        this.activity = null;
        saveCallbacks = true;
    }

    @Override
    public void onDetachedFromActivityForConfigChanges() {
    }

    @Override
    public void onDetachedFromEngine(a.b b8) {
        this.mMethodChannel.e(null);
        this.mMethodChannel = null;
        this.mEventChannel.d(null);
        this.mEventChannel = null;
    }

    @Override
    public void onMethodCall(j j8, k.d d8) {
        if (this.activity == null) {
            Log.d((String)"AppsFlyer", (String)"Activity isn't attached to the flutter engine");
            return;
        }
        String string2 = j8.a;
        string2.hashCode();
        int n8 = string2.hashCode();
        int n9 = -1;
        switch (n8) {
            default: {
                break;
            }
            case 2088314227: {
                if (!string2.equals((Object)"setAdditionalData")) break;
                n9 = 39;
                break;
            }
            case 1998705368: {
                if (!string2.equals((Object)"getAppsFlyerUID")) break;
                n9 = 38;
                break;
            }
            case 1989757366: {
                if (!string2.equals((Object)"logEvent")) break;
                n9 = 37;
                break;
            }
            case 1984636202: {
                if (!string2.equals((Object)"setHost")) break;
                n9 = 36;
                break;
            }
            case 1948321034: {
                if (!string2.equals((Object)"initSdk")) break;
                n9 = 35;
                break;
            }
            case 1877854818: {
                if (!string2.equals((Object)"setCollectAndroidId")) break;
                n9 = 34;
                break;
            }
            case 1824508181: {
                if (!string2.equals((Object)"setIsUpdate")) break;
                n9 = 33;
                break;
            }
            case 1809410897: {
                if (!string2.equals((Object)"addPushNotificationDeepLinkPath")) break;
                n9 = 32;
                break;
            }
            case 1777143241: {
                if (!string2.equals((Object)"getHostName")) break;
                n9 = 31;
                break;
            }
            case 1660731908: {
                if (!string2.equals((Object)"setUserEmails")) break;
                n9 = 30;
                break;
            }
            case 1245101844: {
                if (!string2.equals((Object)"setImeiData")) break;
                n9 = 29;
                break;
            }
            case 1179298132: {
                if (!string2.equals((Object)"setResolveDeepLinkURLs")) break;
                n9 = 28;
                break;
            }
            case 927926776: {
                if (!string2.equals((Object)"generateInviteLink")) break;
                n9 = 27;
                break;
            }
            case 747368646: {
                if (!string2.equals((Object)"setCustomerUserId")) break;
                n9 = 26;
                break;
            }
            case 725535758: {
                if (!string2.equals((Object)"setCustomerIdAndLogSession")) break;
                n9 = 25;
                break;
            }
            case 668311477: {
                if (!string2.equals((Object)"setSharingFilterForAllPartners")) break;
                n9 = 24;
                break;
            }
            case 655665144: {
                if (!string2.equals((Object)"waitForCustomerUserId")) break;
                n9 = 23;
                break;
            }
            case 572656008: {
                if (!string2.equals((Object)"setMinTimeBetweenSessions")) break;
                n9 = 22;
                break;
            }
            case 312972995: {
                if (!string2.equals((Object)"updateServerUninstallToken")) break;
                n9 = 21;
                break;
            }
            case 24884786: {
                if (!string2.equals((Object)"setSharingFilter")) break;
                n9 = 20;
                break;
            }
            case 23388530: {
                if (!string2.equals((Object)"setAndroidIdData")) break;
                n9 = 19;
                break;
            }
            case 12497644: {
                if (!string2.equals((Object)"setDisableAdvertisingIdentifiers")) break;
                n9 = 18;
                break;
            }
            case 3540994: {
                if (!string2.equals((Object)"stop")) break;
                n9 = 17;
                break;
            }
            case -120258830: {
                if (!string2.equals((Object)"setDisableNetworkData")) break;
                n9 = 16;
                break;
            }
            case -144228848: {
                if (!string2.equals((Object)"logCrossPromotionImpression")) break;
                n9 = 15;
                break;
            }
            case -191766732: {
                if (!string2.equals((Object)"getSDKVersion")) break;
                n9 = 14;
                break;
            }
            case -479280098: {
                if (!string2.equals((Object)"setOutOfStore")) break;
                n9 = 13;
                break;
            }
            case -512438553: {
                if (!string2.equals((Object)"logCrossPromotionAndOpenStore")) break;
                n9 = 12;
                break;
            }
            case -559100112: {
                if (!string2.equals((Object)"setCollectIMEI")) break;
                n9 = 11;
                break;
            }
            case -717099497: {
                if (!string2.equals((Object)"sendPushNotificationData")) break;
                n9 = 10;
                break;
            }
            case -752931040: {
                if (!string2.equals((Object)"setCurrencyCode")) break;
                n9 = 9;
                break;
            }
            case -1191484736: {
                if (!string2.equals((Object)"enableFacebookDeferredApplinks")) break;
                n9 = 8;
                break;
            }
            case -1253411310: {
                if (!string2.equals((Object)"getOutOfStore")) break;
                n9 = 7;
                break;
            }
            case -1267985549: {
                if (!string2.equals((Object)"setOneLinkCustomDomain")) break;
                n9 = 6;
                break;
            }
            case -1437772080: {
                if (!string2.equals((Object)"setPartnerData")) break;
                n9 = 5;
                break;
            }
            case -1489605040: {
                if (!string2.equals((Object)"getHostPrefix")) break;
                n9 = 4;
                break;
            }
            case -1777356377: {
                if (!string2.equals((Object)"setPushNotification")) break;
                n9 = 3;
                break;
            }
            case -1820568830: {
                if (!string2.equals((Object)"setSharingFilterForPartners")) break;
                n9 = 2;
                break;
            }
            case -1995722377: {
                if (!string2.equals((Object)"validateAndLogInAppAndroidPurchase")) break;
                n9 = 1;
                break;
            }
            case -2012504269: {
                if (!string2.equals((Object)"setAppInviteOneLinkID")) break;
                n9 = 0;
            }
        }
        switch (n9) {
            default: {
                d8.c();
                return;
            }
            case 39: {
                this.setAdditionalData(j8, d8);
                return;
            }
            case 38: {
                this.getAppsFlyerUID(d8);
                return;
            }
            case 37: {
                this.logEvent(j8, d8);
                return;
            }
            case 36: {
                this.setHost(j8, d8);
                return;
            }
            case 35: {
                this.initSdk(j8, d8);
                return;
            }
            case 34: {
                this.setCollectAndroidId(j8, d8);
                return;
            }
            case 33: {
                this.setIsUpdate(j8, d8);
                return;
            }
            case 32: {
                this.addPushNotificationDeepLinkPath(j8, d8);
                return;
            }
            case 31: {
                this.getHostName(d8);
                return;
            }
            case 30: {
                this.setUserEmails(j8, d8);
                return;
            }
            case 29: {
                this.setImeiData(j8, d8);
                return;
            }
            case 28: {
                this.setResolveDeepLinkURLs(j8, d8);
                return;
            }
            case 27: {
                this.generateInviteLink(j8, d8);
                return;
            }
            case 26: {
                this.setCustomerUserId(j8, d8);
                return;
            }
            case 25: {
                this.setCustomerIdAndLogSession(j8, d8);
                return;
            }
            case 24: {
                this.setSharingFilterForAllPartners(d8);
                return;
            }
            case 23: {
                this.waitForCustomerUserId(j8, d8);
                return;
            }
            case 22: {
                this.setMinTimeBetweenSessions(j8, d8);
                return;
            }
            case 21: {
                this.updateServerUninstallToken(j8, d8);
                return;
            }
            case 20: {
                this.setSharingFilter(j8, d8);
                return;
            }
            case 19: {
                this.setAndroidIdData(j8, d8);
                return;
            }
            case 18: {
                this.setDisableAdvertisingIdentifiers(j8, d8);
                return;
            }
            case 17: {
                this.stop(j8, d8);
                return;
            }
            case 16: {
                this.setDisableNetworkData(j8, d8);
                return;
            }
            case 15: {
                this.logCrossPromotionImpression(j8, d8);
                return;
            }
            case 14: {
                this.getSdkVersion(d8);
                return;
            }
            case 13: {
                this.setOutOfStore(j8, d8);
                return;
            }
            case 12: {
                this.logCrossPromotionAndOpenStore(j8, d8);
                return;
            }
            case 11: {
                this.setCollectIMEI(j8, d8);
                return;
            }
            case 10: {
                this.sendPushNotificationData(j8, d8);
                return;
            }
            case 9: {
                this.setCurrencyCode(j8, d8);
                return;
            }
            case 8: {
                this.enableFacebookDeferredApplinks(j8, d8);
                return;
            }
            case 7: {
                this.getOutOfStore(d8);
                return;
            }
            case 6: {
                this.setOneLinkCustomDomain(j8, d8);
                return;
            }
            case 5: {
                this.setPartnerData(j8, d8);
                return;
            }
            case 4: {
                this.getHostPrefix(d8);
                return;
            }
            case 3: {
                this.setPushNotification(j8, d8);
                return;
            }
            case 2: {
                this.setSharingFilterForPartners(j8, d8);
                return;
            }
            case 1: {
                this.validateAndLogInAppPurchase(j8, d8);
                return;
            }
            case 0: 
        }
        this.setAppInivteOneLinkID(j8, d8);
    }

    @Override
    public void onReattachedToActivityForConfigChanges(B5.c c8) {
        this.sendCachedCallbacksToDart();
        c8.g(this.onNewIntentListener);
    }

}

