package com.appsflyer;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import androidx.annotation.NonNull;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import com.appsflyer.deeplink.DeepLinkListener;
import com.appsflyer.internal.AFa1eSDK;
import com.appsflyer.internal.platform_extension.PluginInfo;
import java.net.URI;
import java.util.Map;

public abstract class AppsFlyerLib
{
  public static AppsFlyerLib getInstance()
  {
    return AFa1eSDK.valueOf();
  }
  
  public abstract void addPushNotificationDeepLinkPath(String... paramVarArgs);
  
  public abstract void anonymizeUser(boolean paramBoolean);
  
  public abstract void appendParametersToDeepLinkingURL(String paramString, Map<String, String> paramMap);
  
  public abstract void enableFacebookDeferredApplinks(boolean paramBoolean);
  
  public abstract String getAppsFlyerUID(@NonNull Context paramContext);
  
  public abstract String getAttributionId(Context paramContext);
  
  public abstract String getHostName();
  
  public abstract String getHostPrefix();
  
  public abstract String getOutOfStore(Context paramContext);
  
  public abstract String getSdkVersion();
  
  public abstract AppsFlyerLib init(@NonNull String paramString, AppsFlyerConversionListener paramAppsFlyerConversionListener, @NonNull Context paramContext);
  
  public abstract boolean isPreInstalledApp(Context paramContext);
  
  public abstract boolean isStopped();
  
  public abstract void logEvent(Context paramContext, String paramString, Map<String, Object> paramMap);
  
  public abstract void logEvent(@NonNull Context paramContext, String paramString, Map<String, Object> paramMap, AppsFlyerRequestListener paramAppsFlyerRequestListener);
  
  public abstract void logLocation(Context paramContext, double paramDouble1, double paramDouble2);
  
  public abstract void logSession(Context paramContext);
  
  public abstract void onPause(Context paramContext);
  
  @Deprecated
  public abstract void performOnAppAttribution(@NonNull Context paramContext, @NonNull URI paramURI);
  
  public abstract void performOnDeepLinking(@NonNull Intent paramIntent, @NonNull Context paramContext);
  
  public abstract void registerConversionListener(Context paramContext, AppsFlyerConversionListener paramAppsFlyerConversionListener);
  
  public abstract void registerValidatorListener(Context paramContext, AppsFlyerInAppPurchaseValidatorListener paramAppsFlyerInAppPurchaseValidatorListener);
  
  public abstract void sendAdImpression(Context paramContext, Map<String, Object> paramMap);
  
  public abstract void sendAdRevenue(Context paramContext, Map<String, Object> paramMap);
  
  public abstract void sendInAppPurchaseData(Context paramContext, Map<String, Object> paramMap, PurchaseHandler.PurchaseValidationCallback paramPurchaseValidationCallback);
  
  public abstract void sendPurchaseData(Context paramContext, Map<String, Object> paramMap, PurchaseHandler.PurchaseValidationCallback paramPurchaseValidationCallback);
  
  public abstract void sendPushNotificationData(Activity paramActivity);
  
  public abstract void setAdditionalData(Map<String, Object> paramMap);
  
  public abstract void setAndroidIdData(String paramString);
  
  public abstract void setAppId(String paramString);
  
  public abstract void setAppInviteOneLink(String paramString);
  
  public abstract void setCollectAndroidID(boolean paramBoolean);
  
  public abstract void setCollectIMEI(boolean paramBoolean);
  
  @Deprecated
  public abstract void setCollectOaid(boolean paramBoolean);
  
  public abstract void setCurrencyCode(String paramString);
  
  public abstract void setCustomerIdAndLogSession(String paramString, @NonNull Context paramContext);
  
  public abstract void setCustomerUserId(String paramString);
  
  public abstract void setDebugLog(boolean paramBoolean);
  
  public abstract void setDisableAdvertisingIdentifiers(boolean paramBoolean);
  
  public abstract void setDisableNetworkData(boolean paramBoolean);
  
  public abstract void setExtension(String paramString);
  
  public abstract void setHost(String paramString1, @NonNull String paramString2);
  
  public abstract void setImeiData(String paramString);
  
  public abstract void setIsUpdate(boolean paramBoolean);
  
  public abstract void setLogLevel(AFLogger.LogLevel paramLogLevel);
  
  public abstract void setMinTimeBetweenSessions(int paramInt);
  
  public abstract void setOaidData(String paramString);
  
  public abstract void setOneLinkCustomDomain(String... paramVarArgs);
  
  public abstract void setOutOfStore(String paramString);
  
  public abstract void setPartnerData(@NonNull String paramString, Map<String, Object> paramMap);
  
  public abstract void setPhoneNumber(String paramString);
  
  public abstract void setPluginInfo(@NonNull PluginInfo paramPluginInfo);
  
  public abstract void setPreinstallAttribution(String paramString1, String paramString2, String paramString3);
  
  public abstract void setResolveDeepLinkURLs(String... paramVarArgs);
  
  @Deprecated
  public abstract void setSharingFilter(@NonNull String... paramVarArgs);
  
  @Deprecated
  public abstract void setSharingFilterForAllPartners();
  
  public abstract void setSharingFilterForPartners(String... paramVarArgs);
  
  public abstract void setUserEmails(AppsFlyerProperties.EmailsCryptType paramEmailsCryptType, String... paramVarArgs);
  
  public abstract void setUserEmails(String... paramVarArgs);
  
  public abstract void start(@NonNull Context paramContext);
  
  public abstract void start(@NonNull Context paramContext, String paramString);
  
  public abstract void start(@NonNull Context paramContext, String paramString, AppsFlyerRequestListener paramAppsFlyerRequestListener);
  
  public abstract void stop(boolean paramBoolean, Context paramContext);
  
  public abstract void subscribeForDeepLink(DeepLinkListener paramDeepLinkListener);
  
  public abstract void subscribeForDeepLink(DeepLinkListener paramDeepLinkListener, long paramLong);
  
  public abstract void unregisterConversionListener();
  
  public abstract void updateServerUninstallToken(Context paramContext, String paramString);
  
  public abstract void validateAndLogInAppPurchase(Context paramContext, String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, Map<String, String> paramMap);
  
  public abstract void waitForCustomerUserId(boolean paramBoolean);
}

/* Location:
 * Qualified Name:     com.appsflyer.AppsFlyerLib
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */