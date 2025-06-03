package com.appsflyer.appsflyersdk;

import A5.a.b;
import E5.d;
import E5.j;
import E5.k;
import E5.k.c;
import E5.k.d;
import E5.n;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.BaseBundle;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.appsflyer.AFLogger.LogLevel;
import com.appsflyer.AppsFlyerConversionListener;
import com.appsflyer.AppsFlyerInAppPurchaseValidatorListener;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.AppsFlyerProperties.EmailsCryptType;
import com.appsflyer.deeplink.DeepLink;
import com.appsflyer.deeplink.DeepLinkListener;
import com.appsflyer.deeplink.DeepLinkResult;
import com.appsflyer.deeplink.DeepLinkResult.Status;
import com.appsflyer.internal.platform_extension.Plugin;
import com.appsflyer.internal.platform_extension.PluginInfo;
import com.appsflyer.share.CrossPromotionHelper;
import com.appsflyer.share.LinkGenerator;
import com.appsflyer.share.LinkGenerator.ResponseListener;
import com.appsflyer.share.ShareInviteHelper;
import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

public class AppsflyerSdkPlugin
  implements k.c, A5.a, B5.a
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
  
  public AppsflyerSdkPlugin()
  {
    Boolean localBoolean = Boolean.FALSE;
    gcdCallback = localBoolean;
    oaoaCallback = localBoolean;
    udlCallback = localBoolean;
    validatePurchaseCallback = localBoolean;
    isFacebookDeferredApplinksEnabled = localBoolean;
    isSetDisableAdvertisingIdentifiersEnable = localBoolean;
    mCallbacks = new HashMap();
    onNewIntentListener = new n()
    {
      public boolean onNewIntent(Intent paramAnonymousIntent)
      {
        AppsflyerSdkPlugin.access$000(AppsflyerSdkPlugin.this).setIntent(paramAnonymousIntent);
        return false;
      }
    };
    afConversionListener = new AppsFlyerConversionListener()
    {
      public void onAppOpenAttribution(Map<String, String> paramAnonymousMap)
      {
        if (AppsflyerSdkPlugin.access$100())
        {
          AppsflyerSdkPlugin.access$802(paramAnonymousMap);
          return;
        }
        if (AppsflyerSdkPlugin.access$900(AppsflyerSdkPlugin.this).booleanValue())
        {
          paramAnonymousMap = new JSONObject(AppsflyerSdkPlugin.access$400(AppsflyerSdkPlugin.this, paramAnonymousMap));
          AppsflyerSdkPlugin.access$500(AppsflyerSdkPlugin.this, paramAnonymousMap, "onAppOpenAttribution", "success");
        }
      }
      
      public void onAttributionFailure(String paramAnonymousString)
      {
        if (AppsflyerSdkPlugin.access$100())
        {
          AppsflyerSdkPlugin.access$1002(paramAnonymousString);
          return;
        }
        if (AppsflyerSdkPlugin.access$900(AppsflyerSdkPlugin.this).booleanValue())
        {
          paramAnonymousString = AppsflyerSdkPlugin.access$700(AppsflyerSdkPlugin.this, paramAnonymousString, "failure");
          AppsflyerSdkPlugin.access$500(AppsflyerSdkPlugin.this, paramAnonymousString, "onAppOpenAttribution", "failure");
        }
      }
      
      public void onConversionDataFail(String paramAnonymousString)
      {
        if (AppsflyerSdkPlugin.access$100())
        {
          AppsflyerSdkPlugin.access$602(paramAnonymousString);
          return;
        }
        if (AppsflyerSdkPlugin.access$300(AppsflyerSdkPlugin.this).booleanValue())
        {
          paramAnonymousString = AppsflyerSdkPlugin.access$700(AppsflyerSdkPlugin.this, paramAnonymousString, "failure");
          AppsflyerSdkPlugin.access$500(AppsflyerSdkPlugin.this, paramAnonymousString, "onInstallConversionData", "failure");
        }
      }
      
      public void onConversionDataSuccess(Map<String, Object> paramAnonymousMap)
      {
        if (AppsflyerSdkPlugin.access$100())
        {
          AppsflyerSdkPlugin.access$202(paramAnonymousMap);
          return;
        }
        if (AppsflyerSdkPlugin.access$300(AppsflyerSdkPlugin.this).booleanValue())
        {
          paramAnonymousMap = new JSONObject(AppsflyerSdkPlugin.access$400(AppsflyerSdkPlugin.this, paramAnonymousMap));
          AppsflyerSdkPlugin.access$500(AppsflyerSdkPlugin.this, paramAnonymousMap, "onInstallConversionData", "success");
        }
      }
    };
    afDeepLinkListener = new DeepLinkListener()
    {
      public void onDeepLinking(DeepLinkResult paramAnonymousDeepLinkResult)
      {
        if (AppsflyerSdkPlugin.access$100())
        {
          AppsflyerSdkPlugin.access$1102(paramAnonymousDeepLinkResult);
          return;
        }
        if (AppsflyerSdkPlugin.access$1200(AppsflyerSdkPlugin.this).booleanValue()) {
          AppsflyerSdkPlugin.access$500(AppsflyerSdkPlugin.this, paramAnonymousDeepLinkResult, "onDeepLinking", "success");
        }
      }
    };
    callbacksHandler = new k.c()
    {
      public void onMethodCall(j paramAnonymousj, k.d paramAnonymousd)
      {
        if ("startListening".equals(a)) {
          AppsflyerSdkPlugin.access$1300(AppsflyerSdkPlugin.this, b, paramAnonymousd);
        } else {
          paramAnonymousd.c();
        }
      }
    };
  }
  
  private void addPushNotificationDeepLinkPath(j paramj, k.d paramd)
  {
    paramj = b;
    if (paramj != null)
    {
      paramj = (ArrayList)paramj;
      paramj = (String[])paramj.toArray(new String[paramj.size()]);
      AppsFlyerLib.getInstance().addPushNotificationDeepLinkPath(paramj);
    }
    paramd.a(null);
  }
  
  private JSONObject buildJsonResponse(Object paramObject, String paramString)
  {
    JSONObject localJSONObject = new JSONObject();
    try
    {
      localJSONObject.put("status", paramString);
      localJSONObject.put("data", paramObject.toString());
    }
    catch (JSONException paramObject)
    {
      ((Throwable)paramObject).printStackTrace();
    }
    return localJSONObject;
  }
  
  private void enableFacebookDeferredApplinks(j paramj, k.d paramd)
  {
    paramj = (Boolean)paramj.a("isFacebookDeferredApplinksEnabled");
    paramj.booleanValue();
    isFacebookDeferredApplinksEnabled = paramj;
    if (paramj.booleanValue()) {
      paramj = AppsFlyerLib.getInstance();
    }
    for (boolean bool = true;; bool = false)
    {
      paramj.enableFacebookDeferredApplinks(bool);
      break;
      paramj = AppsFlyerLib.getInstance();
    }
    paramd.a(null);
  }
  
  private void generateInviteLink(j paramj, k.d paramd)
  {
    String str1 = (String)paramj.a("channel");
    String str2 = (String)paramj.a("customerID");
    String str3 = (String)paramj.a("campaign");
    String str4 = (String)paramj.a("referrerName");
    String str5 = (String)paramj.a("referrerImageUrl");
    String str6 = (String)paramj.a("baseDeeplink");
    Object localObject = (String)paramj.a("brandDomain");
    Map localMap = (Map)paramj.a("customParams");
    paramj = ShareInviteHelper.generateInviteUrl(mContext);
    if ((str1 != null) && (!str1.equals(""))) {
      paramj.setChannel(str1);
    }
    if ((str3 != null) && (!str3.equals(""))) {
      paramj.setCampaign(str3);
    }
    if ((str4 != null) && (!str4.equals(""))) {
      paramj.setReferrerName(str4);
    }
    if ((str5 != null) && (!str5.equals(""))) {
      paramj.setReferrerImageURL(str5);
    }
    if ((str2 != null) && (!str2.equals(""))) {
      paramj.setReferrerCustomerId(str2);
    }
    if ((str6 != null) && (!str6.equals(""))) {
      paramj.setBaseDeeplink(str6);
    }
    if ((localObject != null) && (!((String)localObject).equals(""))) {
      paramj.setBrandDomain((String)localObject);
    }
    if ((localMap != null) && (!localMap.equals(""))) {
      paramj.addParameters(localMap);
    }
    localObject = new LinkGenerator.ResponseListener()
    {
      final JSONObject obj = new JSONObject();
      
      public void onResponse(String paramAnonymousString)
      {
        if (AppsflyerSdkPlugin.access$1400(AppsflyerSdkPlugin.this).containsKey("generateInviteLinkSuccess")) {
          try
          {
            obj.put("userInviteURL", paramAnonymousString);
            AppsflyerSdkPlugin.access$500(AppsflyerSdkPlugin.this, obj, "generateInviteLinkSuccess", "success");
          }
          catch (JSONException paramAnonymousString)
          {
            paramAnonymousString.printStackTrace();
          }
        }
      }
      
      public void onResponseError(String paramAnonymousString)
      {
        if (AppsflyerSdkPlugin.access$1400(AppsflyerSdkPlugin.this).containsKey("generateInviteLinkFailure")) {
          try
          {
            obj.put("error", paramAnonymousString);
            AppsflyerSdkPlugin.access$500(AppsflyerSdkPlugin.this, paramAnonymousString, "generateInviteLinkFailure", "failure");
          }
          catch (JSONException paramAnonymousString)
          {
            paramAnonymousString.printStackTrace();
          }
        }
      }
    };
    paramj.generateLink(mContext, (LinkGenerator.ResponseListener)localObject);
    paramd.a(null);
  }
  
  private void getAppsFlyerUID(k.d paramd)
  {
    paramd.a(AppsFlyerLib.getInstance().getAppsFlyerUID(mContext));
  }
  
  private void getHostName(k.d paramd)
  {
    paramd.a(AppsFlyerLib.getInstance().getHostName());
  }
  
  private void getHostPrefix(k.d paramd)
  {
    paramd.a(AppsFlyerLib.getInstance().getHostPrefix());
  }
  
  private void getOutOfStore(k.d paramd)
  {
    paramd.a(AppsFlyerLib.getInstance().getOutOfStore(mContext));
  }
  
  private void getSdkVersion(k.d paramd)
  {
    paramd.a(AppsFlyerLib.getInstance().getSdkVersion());
  }
  
  private void initSdk(j paramj, k.d paramd)
  {
    AppsFlyerLib localAppsFlyerLib = AppsFlyerLib.getInstance();
    String str = (String)paramj.a("afDevKey");
    AppsFlyerConversionListener localAppsFlyerConversionListener = null;
    if ((str == null) || (str.equals(""))) {
      paramd.b(null, "AF Dev Key is empty", "AF dev key cannot be empty");
    }
    if (((Boolean)paramj.a("disableAdvertisingIdentifier")).booleanValue()) {
      localAppsFlyerLib.setDisableAdvertisingIdentifiers(true);
    }
    if (((Boolean)paramj.a("GCD")).booleanValue()) {
      localAppsFlyerConversionListener = afConversionListener;
    }
    if (((Boolean)paramj.a("UDL")).booleanValue()) {
      localAppsFlyerLib.subscribeForDeepLink(afDeepLinkListener);
    }
    if (((Boolean)paramj.a("isDebug")).booleanValue())
    {
      localAppsFlyerLib.setLogLevel(AFLogger.LogLevel.DEBUG);
      localAppsFlyerLib.setDebugLog(true);
    }
    else
    {
      localAppsFlyerLib.setDebugLog(false);
    }
    localAppsFlyerLib.setPluginInfo(new PluginInfo(Plugin.FLUTTER, "6.12.2"));
    localAppsFlyerLib.init(str, localAppsFlyerConversionListener, mContext);
    paramj = (String)paramj.a("appInviteOneLink");
    if (paramj != null) {
      localAppsFlyerLib.setAppInviteOneLink(paramj);
    }
    localAppsFlyerLib.start(activity);
    if (saveCallbacks)
    {
      saveCallbacks = false;
      sendCachedCallbacksToDart();
    }
    paramd.a("success");
  }
  
  private static Bundle jsonToBundle(JSONObject paramJSONObject)
  {
    Bundle localBundle = new Bundle();
    Iterator localIterator = paramJSONObject.keys();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      localBundle.putString(str, paramJSONObject.getString(str));
    }
    return localBundle;
  }
  
  private void logCrossPromotionAndOpenStore(j paramj, k.d paramd)
  {
    String str1 = (String)paramj.a("appId");
    String str2 = (String)paramj.a("campaign");
    paramj = (Map)paramj.a("params");
    if ((str1 != null) && (!str1.equals(""))) {
      CrossPromotionHelper.logAndOpenStore(mContext, str1, str2, paramj);
    }
    paramd.a(null);
  }
  
  private void logCrossPromotionImpression(j paramj, k.d paramd)
  {
    String str1 = (String)paramj.a("appId");
    String str2 = (String)paramj.a("campaign");
    paramj = (Map)paramj.a("data");
    if ((str1 != null) && (!str1.equals(""))) {
      CrossPromotionHelper.logCrossPromoteImpression(mContext, str1, str2, paramj);
    }
    paramd.a(null);
  }
  
  private void logEvent(j paramj, k.d paramd)
  {
    AppsFlyerLib localAppsFlyerLib = AppsFlyerLib.getInstance();
    String str = (String)paramj.a("eventName");
    paramj = (Map)paramj.a("eventValues");
    localAppsFlyerLib.logEvent(mContext, str, paramj);
    paramd.a(Boolean.TRUE);
  }
  
  private void onAttachedToEngine(Context paramContext, E5.c paramc)
  {
    mContext = paramContext;
    mEventChannel = new d(paramc, "af-events");
    paramContext = new k(paramc, "af-api");
    mMethodChannel = paramContext;
    paramContext.e(this);
    paramContext = new k(paramc, "callbacks");
    mCallbackChannel = paramContext;
    paramContext.e(callbacksHandler);
  }
  
  private void registerValidatorListener()
  {
    AppsFlyerInAppPurchaseValidatorListener local7 = new AppsFlyerInAppPurchaseValidatorListener()
    {
      public void onValidateInApp()
      {
        if (AppsflyerSdkPlugin.access$1600(AppsflyerSdkPlugin.this).booleanValue()) {
          AppsflyerSdkPlugin.access$500(AppsflyerSdkPlugin.this, new JSONObject(), "validatePurchase", "success");
        }
      }
      
      public void onValidateInAppFailure(String paramAnonymousString)
      {
        try
        {
          JSONObject localJSONObject = new org/json/JSONObject;
          localJSONObject.<init>();
          localJSONObject.put("error", paramAnonymousString);
          if (AppsflyerSdkPlugin.access$1600(AppsflyerSdkPlugin.this).booleanValue()) {
            AppsflyerSdkPlugin.access$500(AppsflyerSdkPlugin.this, localJSONObject, "validatePurchase", "failure");
          }
        }
        catch (JSONException paramAnonymousString)
        {
          paramAnonymousString.printStackTrace();
        }
      }
    };
    AppsFlyerLib.getInstance().registerValidatorListener(mContext, local7);
  }
  
  private Map<String, Object> replaceNullValues(Map<String, Object> paramMap)
  {
    HashMap localHashMap = new HashMap();
    Iterator localIterator = paramMap.entrySet().iterator();
    while (localIterator.hasNext())
    {
      paramMap = (Map.Entry)localIterator.next();
      String str = (String)paramMap.getKey();
      if (paramMap.getValue() == null) {
        paramMap = JSONObject.NULL;
      } else {
        paramMap = paramMap.getValue();
      }
      localHashMap.put(str, paramMap);
      localIterator.remove();
    }
    return localHashMap;
  }
  
  private void runOnUIThread(final Object paramObject, final String paramString1, final String paramString2)
  {
    uiThreadHandler.post(new Runnable()
    {
      public void run()
      {
        Object localObject = new StringBuilder();
        ((StringBuilder)localObject).append("Calling invokeMethod with: ");
        ((StringBuilder)localObject).append(paramObject);
        Log.d("Callbacks", ((StringBuilder)localObject).toString());
        localObject = new JSONObject();
        try
        {
          ((JSONObject)localObject).put("id", paramString1);
          if (!paramString1.equals("onDeepLinking")) {
            break label142;
          }
          DeepLinkResult localDeepLinkResult = (DeepLinkResult)paramObject;
          ((JSONObject)localObject).put("deepLinkStatus", localDeepLinkResult.getStatus().toString());
          if (localDeepLinkResult.getError() != null) {
            ((JSONObject)localObject).put("deepLinkError", localDeepLinkResult.getError().toString());
          }
        }
        catch (JSONException localJSONException)
        {
          break label178;
        }
        if (localJSONException.getStatus() == DeepLinkResult.Status.FOUND)
        {
          ((JSONObject)localObject).put("deepLinkObj", localJSONException.getDeepLink().getClickEvent());
          break label182;
          label142:
          JSONObject localJSONObject = (JSONObject)paramObject;
          ((JSONObject)localObject).put("status", paramString2);
          ((JSONObject)localObject).put("data", paramObject.toString());
          break label182;
          label178:
          localJSONObject.printStackTrace();
        }
        label182:
        AppsflyerSdkPlugin.access$1500(this$0).c("callListener", ((JSONObject)localObject).toString());
      }
    });
  }
  
  private void sendCachedCallbacksToDart()
  {
    Object localObject = cachedDeepLinkResult;
    if (localObject != null)
    {
      afDeepLinkListener.onDeepLinking((DeepLinkResult)localObject);
      cachedDeepLinkResult = null;
    }
    localObject = cachedOnConversionDataSuccess;
    if (localObject != null)
    {
      afConversionListener.onConversionDataSuccess((Map)localObject);
      cachedOnConversionDataSuccess = null;
    }
    localObject = cachedOnAppOpenAttribution;
    if (localObject != null)
    {
      afConversionListener.onAppOpenAttribution((Map)localObject);
      cachedOnAppOpenAttribution = null;
    }
    localObject = cachedOnAttributionFailure;
    if (localObject != null)
    {
      afConversionListener.onAttributionFailure((String)localObject);
      cachedOnAttributionFailure = null;
    }
    localObject = cachedOnConversionDataFail;
    if (localObject != null)
    {
      afConversionListener.onConversionDataFail((String)localObject);
      cachedOnConversionDataFail = null;
    }
  }
  
  private void sendPushNotificationData(j paramj, k.d paramd)
  {
    Object localObject = (Map)b;
    if (localObject == null) {
      paramj = "Push payload is null";
    }
    for (;;)
    {
      Log.d("AppsFlyer", paramj);
      return;
      try
      {
        paramj = new org/json/JSONObject;
        paramj.<init>((Map)localObject);
        paramj = jsonToBundle(paramj);
        localObject = activity;
        if (localObject != null)
        {
          localObject = ((Activity)localObject).getIntent();
          if (localObject != null)
          {
            ((Intent)localObject).putExtras(paramj);
            activity.setIntent((Intent)localObject);
            AppsFlyerLib.getInstance().sendPushNotificationData(activity);
            paramj = null;
          }
          else
          {
            paramj = "The intent is null. Push payload has not been sent!";
          }
        }
        else
        {
          paramj = "The activity is null. Push payload has not been sent!";
        }
        if (paramj != null)
        {
          Log.d("AppsFlyer", paramj);
          return;
        }
        paramd.a(null);
        return;
      }
      catch (JSONException paramj)
      {
        paramj = "Can't parse pushPayload to bundle";
      }
    }
  }
  
  private void setAdditionalData(j paramj, k.d paramd)
  {
    paramj = (HashMap)paramj.a("customData");
    AppsFlyerLib.getInstance().setAdditionalData(paramj);
    paramd.a(null);
  }
  
  private void setAndroidIdData(j paramj, k.d paramd)
  {
    paramj = (String)paramj.a("androidId");
    AppsFlyerLib.getInstance().setAndroidIdData(paramj);
    paramd.a(null);
  }
  
  private void setAppInivteOneLinkID(j paramj, k.d paramd)
  {
    paramj = (String)paramj.a("oneLinkID");
    if ((paramj != null) && (paramj.length() != 0))
    {
      AppsFlyerLib.getInstance().setAppInviteOneLink(paramj);
      if (mCallbacks.containsKey("setAppInviteOneLinkIDCallback")) {
        runOnUIThread(buildJsonResponse("success", "success"), "setAppInviteOneLinkIDCallback", "success");
      }
    }
    else
    {
      paramd.a(null);
    }
  }
  
  private void setCollectAndroidId(j paramj, k.d paramd)
  {
    boolean bool = ((Boolean)paramj.a("isCollect")).booleanValue();
    AppsFlyerLib.getInstance().setCollectAndroidID(bool);
    paramd.a(null);
  }
  
  private void setCollectIMEI(j paramj, k.d paramd)
  {
    boolean bool = ((Boolean)paramj.a("isCollect")).booleanValue();
    AppsFlyerLib.getInstance().setCollectIMEI(bool);
    paramd.a(null);
  }
  
  private void setCurrencyCode(j paramj, k.d paramd)
  {
    paramj = (String)paramj.a("currencyCode");
    AppsFlyerLib.getInstance().setCurrencyCode(paramj);
    paramd.a(null);
  }
  
  private void setCustomerIdAndLogSession(j paramj, k.d paramd)
  {
    paramj = (String)paramj.a("id");
    AppsFlyerLib.getInstance().setCustomerIdAndLogSession(paramj, mContext);
    paramd.a(null);
  }
  
  private void setCustomerUserId(j paramj, k.d paramd)
  {
    paramj = (String)paramj.a("id");
    AppsFlyerLib.getInstance().setCustomerUserId(paramj);
    paramd.a(null);
  }
  
  private void setDisableAdvertisingIdentifiers(j paramj, k.d paramd)
  {
    paramj = (Boolean)b;
    paramj.booleanValue();
    isSetDisableAdvertisingIdentifiersEnable = paramj;
    if (paramj.booleanValue()) {
      paramj = AppsFlyerLib.getInstance();
    }
    for (boolean bool = true;; bool = false)
    {
      paramj.setDisableAdvertisingIdentifiers(bool);
      break;
      paramj = AppsFlyerLib.getInstance();
    }
    paramd.a(null);
  }
  
  private void setDisableNetworkData(j paramj, k.d paramd)
  {
    boolean bool = ((Boolean)b).booleanValue();
    AppsFlyerLib.getInstance().setDisableNetworkData(bool);
    paramd.a(null);
  }
  
  private void setHost(j paramj, k.d paramd)
  {
    paramd = (String)paramj.a("hostPrefix");
    paramj = (String)paramj.a("hostName");
    AppsFlyerLib.getInstance().setHost(paramd, paramj);
  }
  
  private void setImeiData(j paramj, k.d paramd)
  {
    paramj = (String)paramj.a("imei");
    AppsFlyerLib.getInstance().setImeiData(paramj);
    paramd.a(null);
  }
  
  private void setIsUpdate(j paramj, k.d paramd)
  {
    boolean bool = ((Boolean)paramj.a("isUpdate")).booleanValue();
    AppsFlyerLib.getInstance().setIsUpdate(bool);
    paramd.a(null);
  }
  
  private void setMinTimeBetweenSessions(j paramj, k.d paramd)
  {
    int i = ((Integer)paramj.a("seconds")).intValue();
    AppsFlyerLib.getInstance().setMinTimeBetweenSessions(i);
    paramd.a(null);
  }
  
  private void setOneLinkCustomDomain(j paramj, k.d paramd)
  {
    paramj = (ArrayList)b;
    paramj = (String[])paramj.toArray(new String[paramj.size()]);
    AppsFlyerLib.getInstance().setOneLinkCustomDomain(paramj);
    paramd.a(null);
  }
  
  private void setOutOfStore(j paramj, k.d paramd)
  {
    paramj = (String)b;
    if (paramj != null) {
      AppsFlyerLib.getInstance().setOutOfStore(paramj);
    }
    paramd.a(null);
  }
  
  private void setPartnerData(j paramj, k.d paramd)
  {
    String str = (String)paramj.a("partnerId");
    paramj = (HashMap)paramj.a("partnersData");
    if (paramj != null) {
      AppsFlyerLib.getInstance().setPartnerData(str, paramj);
    }
    paramd.a(null);
  }
  
  private void setPushNotification(j paramj, k.d paramd)
  {
    AppsFlyerLib.getInstance().sendPushNotificationData(activity);
    paramd.a(null);
  }
  
  private void setResolveDeepLinkURLs(j paramj, k.d paramd)
  {
    paramj = (String[])((ArrayList)b).toArray(new String[0]);
    AppsFlyerLib.getInstance().setResolveDeepLinkURLs(paramj);
    paramd.a(null);
  }
  
  private void setSharingFilter(j paramj, k.d paramd)
  {
    AppsFlyerLib.getInstance().setSharingFilter(new String[0]);
    paramd.a(null);
  }
  
  private void setSharingFilterForAllPartners(k.d paramd)
  {
    AppsFlyerLib.getInstance().setSharingFilterForAllPartners();
    paramd.a(null);
  }
  
  private void setSharingFilterForPartners(j paramj, k.d paramd)
  {
    paramj = b;
    if (paramj != null)
    {
      paramj = (ArrayList)paramj;
      paramj = (String[])paramj.toArray(new String[paramj.size()]);
      AppsFlyerLib.getInstance().setSharingFilterForPartners(paramj);
    }
    paramd.a(null);
  }
  
  private void setUserEmails(j paramj, k.d paramd)
  {
    List localList = (List)paramj.a("emails");
    int i = ((Integer)paramj.a("cryptType")).intValue();
    if (i == 0)
    {
      paramj = AppsFlyerProperties.EmailsCryptType.NONE;
    }
    else
    {
      if (i != 1) {
        break label80;
      }
      paramj = AppsFlyerProperties.EmailsCryptType.SHA256;
    }
    if (localList != null) {
      AppsFlyerLib.getInstance().setUserEmails(paramj, (String[])localList.toArray(new String[0]));
    }
    paramd.a(null);
    return;
    label80:
    throw new InvalidParameterException("You can use only NONE or SHA256 for EmailsCryptType on android");
  }
  
  private void startListening(Object paramObject, k.d paramd)
  {
    paramObject = (String)paramObject;
    if (((String)paramObject).equals("onInstallConversionData")) {
      gcdCallback = Boolean.TRUE;
    }
    if (((String)paramObject).equals("onAppOpenAttribution")) {
      oaoaCallback = Boolean.TRUE;
    }
    if (((String)paramObject).equals("onDeepLinking")) {
      udlCallback = Boolean.TRUE;
    }
    if (((String)paramObject).equals("validatePurchase")) {
      validatePurchaseCallback = Boolean.TRUE;
    }
    HashMap localHashMap = new HashMap();
    localHashMap.put("id", paramObject);
    mCallbacks.put(paramObject, localHashMap);
    paramd.a(null);
  }
  
  private void stop(j paramj, k.d paramd)
  {
    boolean bool = ((Boolean)paramj.a("isStopped")).booleanValue();
    AppsFlyerLib.getInstance().stop(bool, mContext);
    paramd.a(null);
  }
  
  private void updateServerUninstallToken(j paramj, k.d paramd)
  {
    paramj = (String)paramj.a("token");
    AppsFlyerLib.getInstance().updateServerUninstallToken(mContext, paramj);
    paramd.a(null);
  }
  
  private void validateAndLogInAppPurchase(j paramj, k.d paramd)
  {
    registerValidatorListener();
    String str1 = (String)paramj.a("publicKey");
    String str2 = (String)paramj.a("signature");
    String str3 = (String)paramj.a("purchaseData");
    String str4 = (String)paramj.a("price");
    String str5 = (String)paramj.a("currency");
    paramj = (Map)paramj.a("additionalParameters");
    AppsFlyerLib.getInstance().validateAndLogInAppPurchase(mContext, str1, str2, str3, str4, str5, paramj);
    paramd.a(null);
  }
  
  private void waitForCustomerUserId(j paramj, k.d paramd)
  {
    boolean bool = ((Boolean)paramj.a("wait")).booleanValue();
    AppsFlyerLib.getInstance().waitForCustomerUserId(bool);
    paramd.a(null);
  }
  
  public void onAttachedToActivity(B5.c paramc)
  {
    activity = paramc.c();
    mIntent = paramc.c().getIntent();
    mApplication = paramc.c().getApplication();
    paramc.g(onNewIntentListener);
  }
  
  public void onAttachedToEngine(a.b paramb)
  {
    onAttachedToEngine(paramb.a(), paramb.b());
  }
  
  public void onDetachedFromActivity()
  {
    activity = null;
    saveCallbacks = true;
  }
  
  public void onDetachedFromActivityForConfigChanges() {}
  
  public void onDetachedFromEngine(a.b paramb)
  {
    mMethodChannel.e(null);
    mMethodChannel = null;
    mEventChannel.d(null);
    mEventChannel = null;
  }
  
  public void onMethodCall(j paramj, k.d paramd)
  {
    if (activity == null)
    {
      Log.d("AppsFlyer", "Activity isn't attached to the flutter engine");
      return;
    }
    String str = a;
    str.hashCode();
    int i = str.hashCode();
    int j = -1;
    switch (i)
    {
    default: 
      break;
    case 2088314227: 
      if (str.equals("setAdditionalData")) {
        j = 39;
      }
      break;
    case 1998705368: 
      if (str.equals("getAppsFlyerUID")) {
        j = 38;
      }
      break;
    case 1989757366: 
      if (str.equals("logEvent")) {
        j = 37;
      }
      break;
    case 1984636202: 
      if (str.equals("setHost")) {
        j = 36;
      }
      break;
    case 1948321034: 
      if (str.equals("initSdk")) {
        j = 35;
      }
      break;
    case 1877854818: 
      if (str.equals("setCollectAndroidId")) {
        j = 34;
      }
      break;
    case 1824508181: 
      if (str.equals("setIsUpdate")) {
        j = 33;
      }
      break;
    case 1809410897: 
      if (str.equals("addPushNotificationDeepLinkPath")) {
        j = 32;
      }
      break;
    case 1777143241: 
      if (str.equals("getHostName")) {
        j = 31;
      }
      break;
    case 1660731908: 
      if (str.equals("setUserEmails")) {
        j = 30;
      }
      break;
    case 1245101844: 
      if (str.equals("setImeiData")) {
        j = 29;
      }
      break;
    case 1179298132: 
      if (str.equals("setResolveDeepLinkURLs")) {
        j = 28;
      }
      break;
    case 927926776: 
      if (str.equals("generateInviteLink")) {
        j = 27;
      }
      break;
    case 747368646: 
      if (str.equals("setCustomerUserId")) {
        j = 26;
      }
      break;
    case 725535758: 
      if (str.equals("setCustomerIdAndLogSession")) {
        j = 25;
      }
      break;
    case 668311477: 
      if (str.equals("setSharingFilterForAllPartners")) {
        j = 24;
      }
      break;
    case 655665144: 
      if (str.equals("waitForCustomerUserId")) {
        j = 23;
      }
      break;
    case 572656008: 
      if (str.equals("setMinTimeBetweenSessions")) {
        j = 22;
      }
      break;
    case 312972995: 
      if (str.equals("updateServerUninstallToken")) {
        j = 21;
      }
      break;
    case 24884786: 
      if (str.equals("setSharingFilter")) {
        j = 20;
      }
      break;
    case 23388530: 
      if (str.equals("setAndroidIdData")) {
        j = 19;
      }
      break;
    case 12497644: 
      if (str.equals("setDisableAdvertisingIdentifiers")) {
        j = 18;
      }
      break;
    case 3540994: 
      if (str.equals("stop")) {
        j = 17;
      }
      break;
    case -120258830: 
      if (str.equals("setDisableNetworkData")) {
        j = 16;
      }
      break;
    case -144228848: 
      if (str.equals("logCrossPromotionImpression")) {
        j = 15;
      }
      break;
    case -191766732: 
      if (str.equals("getSDKVersion")) {
        j = 14;
      }
      break;
    case -479280098: 
      if (str.equals("setOutOfStore")) {
        j = 13;
      }
      break;
    case -512438553: 
      if (str.equals("logCrossPromotionAndOpenStore")) {
        j = 12;
      }
      break;
    case -559100112: 
      if (str.equals("setCollectIMEI")) {
        j = 11;
      }
      break;
    case -717099497: 
      if (str.equals("sendPushNotificationData")) {
        j = 10;
      }
      break;
    case -752931040: 
      if (str.equals("setCurrencyCode")) {
        j = 9;
      }
      break;
    case -1191484736: 
      if (str.equals("enableFacebookDeferredApplinks")) {
        j = 8;
      }
      break;
    case -1253411310: 
      if (str.equals("getOutOfStore")) {
        j = 7;
      }
      break;
    case -1267985549: 
      if (str.equals("setOneLinkCustomDomain")) {
        j = 6;
      }
      break;
    case -1437772080: 
      if (str.equals("setPartnerData")) {
        j = 5;
      }
      break;
    case -1489605040: 
      if (str.equals("getHostPrefix")) {
        j = 4;
      }
      break;
    case -1777356377: 
      if (str.equals("setPushNotification")) {
        j = 3;
      }
      break;
    case -1820568830: 
      if (str.equals("setSharingFilterForPartners")) {
        j = 2;
      }
      break;
    case -1995722377: 
      if (str.equals("validateAndLogInAppAndroidPurchase")) {
        j = 1;
      }
      break;
    case -2012504269: 
      if (str.equals("setAppInviteOneLinkID")) {
        j = 0;
      }
      break;
    }
    switch (j)
    {
    default: 
      paramd.c();
      break;
    case 39: 
      setAdditionalData(paramj, paramd);
      break;
    case 38: 
      getAppsFlyerUID(paramd);
      break;
    case 37: 
      logEvent(paramj, paramd);
      break;
    case 36: 
      setHost(paramj, paramd);
      break;
    case 35: 
      initSdk(paramj, paramd);
      break;
    case 34: 
      setCollectAndroidId(paramj, paramd);
      break;
    case 33: 
      setIsUpdate(paramj, paramd);
      break;
    case 32: 
      addPushNotificationDeepLinkPath(paramj, paramd);
      break;
    case 31: 
      getHostName(paramd);
      break;
    case 30: 
      setUserEmails(paramj, paramd);
      break;
    case 29: 
      setImeiData(paramj, paramd);
      break;
    case 28: 
      setResolveDeepLinkURLs(paramj, paramd);
      break;
    case 27: 
      generateInviteLink(paramj, paramd);
      break;
    case 26: 
      setCustomerUserId(paramj, paramd);
      break;
    case 25: 
      setCustomerIdAndLogSession(paramj, paramd);
      break;
    case 24: 
      setSharingFilterForAllPartners(paramd);
      break;
    case 23: 
      waitForCustomerUserId(paramj, paramd);
      break;
    case 22: 
      setMinTimeBetweenSessions(paramj, paramd);
      break;
    case 21: 
      updateServerUninstallToken(paramj, paramd);
      break;
    case 20: 
      setSharingFilter(paramj, paramd);
      break;
    case 19: 
      setAndroidIdData(paramj, paramd);
      break;
    case 18: 
      setDisableAdvertisingIdentifiers(paramj, paramd);
      break;
    case 17: 
      stop(paramj, paramd);
      break;
    case 16: 
      setDisableNetworkData(paramj, paramd);
      break;
    case 15: 
      logCrossPromotionImpression(paramj, paramd);
      break;
    case 14: 
      getSdkVersion(paramd);
      break;
    case 13: 
      setOutOfStore(paramj, paramd);
      break;
    case 12: 
      logCrossPromotionAndOpenStore(paramj, paramd);
      break;
    case 11: 
      setCollectIMEI(paramj, paramd);
      break;
    case 10: 
      sendPushNotificationData(paramj, paramd);
      break;
    case 9: 
      setCurrencyCode(paramj, paramd);
      break;
    case 8: 
      enableFacebookDeferredApplinks(paramj, paramd);
      break;
    case 7: 
      getOutOfStore(paramd);
      break;
    case 6: 
      setOneLinkCustomDomain(paramj, paramd);
      break;
    case 5: 
      setPartnerData(paramj, paramd);
      break;
    case 4: 
      getHostPrefix(paramd);
      break;
    case 3: 
      setPushNotification(paramj, paramd);
      break;
    case 2: 
      setSharingFilterForPartners(paramj, paramd);
      break;
    case 1: 
      validateAndLogInAppPurchase(paramj, paramd);
      break;
    case 0: 
      setAppInivteOneLinkID(paramj, paramd);
    }
  }
  
  public void onReattachedToActivityForConfigChanges(B5.c paramc)
  {
    sendCachedCallbacksToDart();
    paramc.g(onNewIntentListener);
  }
}

/* Location:
 * Qualified Name:     com.appsflyer.appsflyersdk.AppsflyerSdkPlugin
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */