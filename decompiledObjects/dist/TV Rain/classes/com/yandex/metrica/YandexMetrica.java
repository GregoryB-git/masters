package com.yandex.metrica;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.location.Location;
import android.webkit.WebView;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.metrica.ecommerce.ECommerceEvent;
import com.yandex.metrica.impl.ob.Jf;
import com.yandex.metrica.impl.ob.Kf;
import com.yandex.metrica.impl.ob.W2;
import com.yandex.metrica.plugins.YandexMetricaPlugins;
import com.yandex.metrica.profile.UserProfile;
import java.util.Map;

public final class YandexMetrica
{
  public static void activate(@NonNull Context paramContext, @NonNull YandexMetricaConfig paramYandexMetricaConfig)
  {
    Kf.a().a(paramContext, paramYandexMetricaConfig);
  }
  
  public static void activateReporter(@NonNull Context paramContext, @NonNull ReporterConfig paramReporterConfig)
  {
    Kf.a().a(paramContext, paramReporterConfig);
  }
  
  public static void enableActivityAutoTracking(@NonNull Application paramApplication)
  {
    Kf.a().a(paramApplication);
  }
  
  public static int getLibraryApiLevel()
  {
    return 105;
  }
  
  @NonNull
  public static String getLibraryVersion()
  {
    return "5.2.0";
  }
  
  @NonNull
  public static YandexMetricaPlugins getPluginExtension()
  {
    return W2.a();
  }
  
  @NonNull
  public static IReporter getReporter(@NonNull Context paramContext, @NonNull String paramString)
  {
    return Kf.a().a(paramContext, paramString);
  }
  
  @MainThread
  public static void initWebViewReporting(@NonNull WebView paramWebView)
  {
    Kf.a().a(paramWebView);
  }
  
  public static void pauseSession(@Nullable Activity paramActivity)
  {
    Kf.a().a(paramActivity);
  }
  
  public static void putErrorEnvironmentValue(@NonNull String paramString1, @Nullable String paramString2)
  {
    Kf.a().a(paramString1, paramString2);
  }
  
  public static void reportAdRevenue(@NonNull AdRevenue paramAdRevenue)
  {
    Kf.a().a(paramAdRevenue);
  }
  
  public static void reportAppOpen(@NonNull Activity paramActivity)
  {
    Kf.a().b(paramActivity);
  }
  
  public static void reportAppOpen(@NonNull Intent paramIntent)
  {
    Kf.a().a(paramIntent);
  }
  
  public static void reportAppOpen(@NonNull String paramString)
  {
    Kf.a().a(paramString);
  }
  
  public static void reportECommerce(@NonNull ECommerceEvent paramECommerceEvent)
  {
    Kf.a().a(paramECommerceEvent);
  }
  
  public static void reportError(@NonNull String paramString1, @Nullable String paramString2)
  {
    Kf.a().a(paramString1, paramString2, null);
  }
  
  public static void reportError(@NonNull String paramString1, @Nullable String paramString2, @Nullable Throwable paramThrowable)
  {
    Kf.a().a(paramString1, paramString2, paramThrowable);
  }
  
  public static void reportError(@NonNull String paramString, @Nullable Throwable paramThrowable)
  {
    Kf.a().a(paramString, paramThrowable);
  }
  
  public static void reportEvent(@NonNull String paramString)
  {
    Kf.a().b(paramString);
  }
  
  public static void reportEvent(@NonNull String paramString1, @Nullable String paramString2)
  {
    Kf.a().b(paramString1, paramString2);
  }
  
  public static void reportEvent(@NonNull String paramString, @Nullable Map<String, Object> paramMap)
  {
    Kf.a().a(paramString, paramMap);
  }
  
  @Deprecated
  public static void reportNativeCrash(@NonNull String paramString)
  {
    Kf.a().d(paramString);
  }
  
  public static void reportReferralUrl(@NonNull String paramString)
  {
    Kf.a().e(paramString);
  }
  
  public static void reportRevenue(@NonNull Revenue paramRevenue)
  {
    Kf.a().a(paramRevenue);
  }
  
  public static void reportUnhandledException(@NonNull Throwable paramThrowable)
  {
    Kf.a().a(paramThrowable);
  }
  
  public static void reportUserProfile(@NonNull UserProfile paramUserProfile)
  {
    Kf.a().a(paramUserProfile);
  }
  
  public static void requestAppMetricaDeviceID(@NonNull AppMetricaDeviceIDListener paramAppMetricaDeviceIDListener)
  {
    Kf.a().a(paramAppMetricaDeviceIDListener);
  }
  
  public static void requestDeferredDeeplink(@NonNull DeferredDeeplinkListener paramDeferredDeeplinkListener)
  {
    Kf.a().a(paramDeferredDeeplinkListener);
  }
  
  public static void requestDeferredDeeplinkParameters(@NonNull DeferredDeeplinkParametersListener paramDeferredDeeplinkParametersListener)
  {
    Kf.a().a(paramDeferredDeeplinkParametersListener);
  }
  
  public static void resumeSession(@Nullable Activity paramActivity)
  {
    Kf.a().c(paramActivity);
  }
  
  public static void sendEventsBuffer()
  {
    Kf.a().i();
  }
  
  public static void setLocation(@Nullable Location paramLocation)
  {
    Kf.a().a(paramLocation);
  }
  
  public static void setLocationTracking(@NonNull Context paramContext, boolean paramBoolean)
  {
    Kf.a().a(paramContext, paramBoolean);
  }
  
  public static void setLocationTracking(boolean paramBoolean)
  {
    Kf.a().a(paramBoolean);
  }
  
  public static void setStatisticsSending(@NonNull Context paramContext, boolean paramBoolean)
  {
    Kf.a().b(paramContext, paramBoolean);
  }
  
  public static void setUserProfileID(@Nullable String paramString)
  {
    Kf.a().f(paramString);
  }
}

/* Location:
 * Qualified Name:     com.yandex.metrica.YandexMetrica
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */