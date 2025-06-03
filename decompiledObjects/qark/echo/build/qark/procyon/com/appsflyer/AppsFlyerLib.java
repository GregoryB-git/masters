// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.appsflyer;

import com.appsflyer.deeplink.DeepLinkListener;
import com.appsflyer.internal.platform_extension.PluginInfo;
import android.app.Activity;
import android.content.Intent;
import java.net.URI;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import androidx.annotation.NonNull;
import android.content.Context;
import java.util.Map;
import com.appsflyer.internal.AFa1eSDK;

public abstract class AppsFlyerLib
{
    public static AppsFlyerLib getInstance() {
        return AFa1eSDK.valueOf();
    }
    
    public abstract void addPushNotificationDeepLinkPath(final String... p0);
    
    public abstract void anonymizeUser(final boolean p0);
    
    public abstract void appendParametersToDeepLinkingURL(final String p0, final Map<String, String> p1);
    
    public abstract void enableFacebookDeferredApplinks(final boolean p0);
    
    public abstract String getAppsFlyerUID(@NonNull final Context p0);
    
    public abstract String getAttributionId(final Context p0);
    
    public abstract String getHostName();
    
    public abstract String getHostPrefix();
    
    public abstract String getOutOfStore(final Context p0);
    
    public abstract String getSdkVersion();
    
    public abstract AppsFlyerLib init(@NonNull final String p0, final AppsFlyerConversionListener p1, @NonNull final Context p2);
    
    public abstract boolean isPreInstalledApp(final Context p0);
    
    public abstract boolean isStopped();
    
    public abstract void logEvent(final Context p0, final String p1, final Map<String, Object> p2);
    
    public abstract void logEvent(@NonNull final Context p0, final String p1, final Map<String, Object> p2, final AppsFlyerRequestListener p3);
    
    public abstract void logLocation(final Context p0, final double p1, final double p2);
    
    public abstract void logSession(final Context p0);
    
    public abstract void onPause(final Context p0);
    
    @Deprecated
    public abstract void performOnAppAttribution(@NonNull final Context p0, @NonNull final URI p1);
    
    public abstract void performOnDeepLinking(@NonNull final Intent p0, @NonNull final Context p1);
    
    public abstract void registerConversionListener(final Context p0, final AppsFlyerConversionListener p1);
    
    public abstract void registerValidatorListener(final Context p0, final AppsFlyerInAppPurchaseValidatorListener p1);
    
    public abstract void sendAdImpression(final Context p0, final Map<String, Object> p1);
    
    public abstract void sendAdRevenue(final Context p0, final Map<String, Object> p1);
    
    public abstract void sendInAppPurchaseData(final Context p0, final Map<String, Object> p1, final PurchaseHandler.PurchaseValidationCallback p2);
    
    public abstract void sendPurchaseData(final Context p0, final Map<String, Object> p1, final PurchaseHandler.PurchaseValidationCallback p2);
    
    public abstract void sendPushNotificationData(final Activity p0);
    
    public abstract void setAdditionalData(final Map<String, Object> p0);
    
    public abstract void setAndroidIdData(final String p0);
    
    public abstract void setAppId(final String p0);
    
    public abstract void setAppInviteOneLink(final String p0);
    
    public abstract void setCollectAndroidID(final boolean p0);
    
    public abstract void setCollectIMEI(final boolean p0);
    
    @Deprecated
    public abstract void setCollectOaid(final boolean p0);
    
    public abstract void setCurrencyCode(final String p0);
    
    public abstract void setCustomerIdAndLogSession(final String p0, @NonNull final Context p1);
    
    public abstract void setCustomerUserId(final String p0);
    
    public abstract void setDebugLog(final boolean p0);
    
    public abstract void setDisableAdvertisingIdentifiers(final boolean p0);
    
    public abstract void setDisableNetworkData(final boolean p0);
    
    public abstract void setExtension(final String p0);
    
    public abstract void setHost(final String p0, @NonNull final String p1);
    
    public abstract void setImeiData(final String p0);
    
    public abstract void setIsUpdate(final boolean p0);
    
    public abstract void setLogLevel(final AFLogger.LogLevel p0);
    
    public abstract void setMinTimeBetweenSessions(final int p0);
    
    public abstract void setOaidData(final String p0);
    
    public abstract void setOneLinkCustomDomain(final String... p0);
    
    public abstract void setOutOfStore(final String p0);
    
    public abstract void setPartnerData(@NonNull final String p0, final Map<String, Object> p1);
    
    public abstract void setPhoneNumber(final String p0);
    
    public abstract void setPluginInfo(@NonNull final PluginInfo p0);
    
    public abstract void setPreinstallAttribution(final String p0, final String p1, final String p2);
    
    public abstract void setResolveDeepLinkURLs(final String... p0);
    
    @Deprecated
    public abstract void setSharingFilter(@NonNull final String... p0);
    
    @Deprecated
    public abstract void setSharingFilterForAllPartners();
    
    public abstract void setSharingFilterForPartners(final String... p0);
    
    public abstract void setUserEmails(final AppsFlyerProperties.EmailsCryptType p0, final String... p1);
    
    public abstract void setUserEmails(final String... p0);
    
    public abstract void start(@NonNull final Context p0);
    
    public abstract void start(@NonNull final Context p0, final String p1);
    
    public abstract void start(@NonNull final Context p0, final String p1, final AppsFlyerRequestListener p2);
    
    public abstract void stop(final boolean p0, final Context p1);
    
    public abstract void subscribeForDeepLink(final DeepLinkListener p0);
    
    public abstract void subscribeForDeepLink(final DeepLinkListener p0, final long p1);
    
    public abstract void unregisterConversionListener();
    
    public abstract void updateServerUninstallToken(final Context p0, final String p1);
    
    public abstract void validateAndLogInAppPurchase(final Context p0, final String p1, final String p2, final String p3, final String p4, final String p5, final Map<String, String> p6);
    
    public abstract void waitForCustomerUserId(final boolean p0);
}
