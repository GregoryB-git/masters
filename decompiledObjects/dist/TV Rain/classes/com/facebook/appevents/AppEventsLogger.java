package com.facebook.appevents;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.webkit.WebView;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import com.facebook.AccessToken;
import com.facebook.GraphRequest.Callback;
import com.facebook.appevents.internal.AutomaticAnalyticsLogger;
import java.math.BigDecimal;
import java.util.Currency;

public class AppEventsLogger
{
  public static final String ACTION_APP_EVENTS_FLUSHED = "com.facebook.sdk.APP_EVENTS_FLUSHED";
  public static final String APP_EVENTS_EXTRA_FLUSH_RESULT = "com.facebook.sdk.APP_EVENTS_FLUSH_RESULT";
  public static final String APP_EVENTS_EXTRA_NUM_EVENTS_FLUSHED = "com.facebook.sdk.APP_EVENTS_NUM_EVENTS_FLUSHED";
  private static final String TAG = "com.facebook.appevents.AppEventsLogger";
  private AppEventsLoggerImpl loggerImpl;
  
  private AppEventsLogger(Context paramContext, String paramString, AccessToken paramAccessToken)
  {
    loggerImpl = new AppEventsLoggerImpl(paramContext, paramString, paramAccessToken);
  }
  
  public static void activateApp(Application paramApplication)
  {
    AppEventsLoggerImpl.activateApp(paramApplication, null);
  }
  
  public static void activateApp(Application paramApplication, String paramString)
  {
    AppEventsLoggerImpl.activateApp(paramApplication, paramString);
  }
  
  @Deprecated
  public static void activateApp(Context paramContext)
  {
    activateApp(null, null);
  }
  
  @Deprecated
  public static void activateApp(Context paramContext, String paramString)
  {
    AppEventsLoggerImpl.functionDEPRECATED("Please use activateApp(Application) or activateApp(Application, String)");
  }
  
  public static void augmentWebView(WebView paramWebView, Context paramContext)
  {
    AppEventsLoggerImpl.augmentWebView(paramWebView, paramContext);
  }
  
  public static void clearUserData() {}
  
  public static void clearUserID()
  {
    AnalyticsUserIDStore.setUserID(null);
  }
  
  @Deprecated
  public static void deactivateApp(Context paramContext)
  {
    deactivateApp(null, null);
  }
  
  @Deprecated
  public static void deactivateApp(Context paramContext, String paramString)
  {
    AppEventsLoggerImpl.functionDEPRECATED("deactivate app will be logged automatically");
  }
  
  public static String getAnonymousAppDeviceGUID(Context paramContext)
  {
    return AppEventsLoggerImpl.getAnonymousAppDeviceGUID(paramContext);
  }
  
  public static FlushBehavior getFlushBehavior()
  {
    return AppEventsLoggerImpl.getFlushBehavior();
  }
  
  public static String getUserData()
  {
    return UserDataStore.getHashedUserData();
  }
  
  public static String getUserID()
  {
    return AnalyticsUserIDStore.getUserID();
  }
  
  public static void initializeLib(Context paramContext, String paramString)
  {
    AppEventsLoggerImpl.initializeLib(paramContext, paramString);
  }
  
  public static AppEventsLogger newLogger(Context paramContext)
  {
    return new AppEventsLogger(paramContext, null, null);
  }
  
  public static AppEventsLogger newLogger(Context paramContext, AccessToken paramAccessToken)
  {
    return new AppEventsLogger(paramContext, null, paramAccessToken);
  }
  
  public static AppEventsLogger newLogger(Context paramContext, String paramString)
  {
    return new AppEventsLogger(paramContext, paramString, null);
  }
  
  public static AppEventsLogger newLogger(Context paramContext, String paramString, AccessToken paramAccessToken)
  {
    return new AppEventsLogger(paramContext, paramString, paramAccessToken);
  }
  
  public static void onContextStop() {}
  
  public static void setFlushBehavior(FlushBehavior paramFlushBehavior)
  {
    AppEventsLoggerImpl.setFlushBehavior(paramFlushBehavior);
  }
  
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
  public static void setInstallReferrer(String paramString)
  {
    AppEventsLoggerImpl.setInstallReferrer(paramString);
  }
  
  public static void setPushNotificationsRegistrationId(String paramString)
  {
    AppEventsLoggerImpl.setPushNotificationsRegistrationId(paramString);
  }
  
  @Deprecated
  public static void setUserData(Bundle paramBundle)
  {
    UserDataStore.setUserDataAndHash(paramBundle);
  }
  
  public static void setUserData(@Nullable String paramString1, @Nullable String paramString2, @Nullable String paramString3, @Nullable String paramString4, @Nullable String paramString5, @Nullable String paramString6, @Nullable String paramString7, @Nullable String paramString8, @Nullable String paramString9, @Nullable String paramString10)
  {
    UserDataStore.setUserDataAndHash(paramString1, paramString2, paramString3, paramString4, paramString5, paramString6, paramString7, paramString8, paramString9, paramString10);
  }
  
  public static void setUserID(String paramString)
  {
    AnalyticsUserIDStore.setUserID(paramString);
  }
  
  @Deprecated
  public static void updateUserProperties(Bundle paramBundle, GraphRequest.Callback paramCallback) {}
  
  @Deprecated
  public static void updateUserProperties(Bundle paramBundle, String paramString, GraphRequest.Callback paramCallback) {}
  
  public void flush()
  {
    loggerImpl.flush();
  }
  
  public String getApplicationId()
  {
    return loggerImpl.getApplicationId();
  }
  
  public boolean isValidForAccessToken(AccessToken paramAccessToken)
  {
    return loggerImpl.isValidForAccessToken(paramAccessToken);
  }
  
  public void logEvent(String paramString)
  {
    loggerImpl.logEvent(paramString);
  }
  
  public void logEvent(String paramString, double paramDouble)
  {
    loggerImpl.logEvent(paramString, paramDouble);
  }
  
  public void logEvent(String paramString, double paramDouble, Bundle paramBundle)
  {
    loggerImpl.logEvent(paramString, paramDouble, paramBundle);
  }
  
  public void logEvent(String paramString, Bundle paramBundle)
  {
    loggerImpl.logEvent(paramString, paramBundle);
  }
  
  public void logProductItem(String paramString1, ProductAvailability paramProductAvailability, ProductCondition paramProductCondition, String paramString2, String paramString3, String paramString4, String paramString5, BigDecimal paramBigDecimal, Currency paramCurrency, String paramString6, String paramString7, String paramString8, Bundle paramBundle)
  {
    loggerImpl.logProductItem(paramString1, paramProductAvailability, paramProductCondition, paramString2, paramString3, paramString4, paramString5, paramBigDecimal, paramCurrency, paramString6, paramString7, paramString8, paramBundle);
  }
  
  public void logPurchase(BigDecimal paramBigDecimal, Currency paramCurrency)
  {
    loggerImpl.logPurchase(paramBigDecimal, paramCurrency);
  }
  
  public void logPurchase(BigDecimal paramBigDecimal, Currency paramCurrency, Bundle paramBundle)
  {
    loggerImpl.logPurchase(paramBigDecimal, paramCurrency, paramBundle);
  }
  
  @Deprecated
  public void logPurchaseImplicitly(BigDecimal paramBigDecimal, Currency paramCurrency, Bundle paramBundle)
  {
    if (AutomaticAnalyticsLogger.isImplicitPurchaseLoggingEnabled()) {
      paramBigDecimal = "Function logPurchaseImplicitly() is deprecated and your purchase events cannot be logged with this function. Auto-logging of in-app purchase has been enabled in the SDK, so you don't have to manually log purchases";
    } else {
      paramBigDecimal = "Function logPurchaseImplicitly() is deprecated and your purchase events cannot be logged with this function. Please use logPurchase() function instead.";
    }
    Log.e(TAG, paramBigDecimal);
  }
  
  public void logPushNotificationOpen(Bundle paramBundle)
  {
    loggerImpl.logPushNotificationOpen(paramBundle, null);
  }
  
  public void logPushNotificationOpen(Bundle paramBundle, String paramString)
  {
    loggerImpl.logPushNotificationOpen(paramBundle, paramString);
  }
  
  @Deprecated
  public void logSdkEvent(String paramString, Double paramDouble, Bundle paramBundle)
  {
    loggerImpl.logSdkEvent(paramString, paramDouble, paramBundle);
  }
  
  public static enum FlushBehavior
  {
    static
    {
      FlushBehavior localFlushBehavior1 = new FlushBehavior("AUTO", 0);
      AUTO = localFlushBehavior1;
      FlushBehavior localFlushBehavior2 = new FlushBehavior("EXPLICIT_ONLY", 1);
      EXPLICIT_ONLY = localFlushBehavior2;
      $VALUES = new FlushBehavior[] { localFlushBehavior1, localFlushBehavior2 };
    }
    
    private FlushBehavior() {}
  }
  
  public static enum ProductAvailability
  {
    static
    {
      ProductAvailability localProductAvailability1 = new ProductAvailability("IN_STOCK", 0);
      IN_STOCK = localProductAvailability1;
      ProductAvailability localProductAvailability2 = new ProductAvailability("OUT_OF_STOCK", 1);
      OUT_OF_STOCK = localProductAvailability2;
      ProductAvailability localProductAvailability3 = new ProductAvailability("PREORDER", 2);
      PREORDER = localProductAvailability3;
      ProductAvailability localProductAvailability4 = new ProductAvailability("AVALIABLE_FOR_ORDER", 3);
      AVALIABLE_FOR_ORDER = localProductAvailability4;
      ProductAvailability localProductAvailability5 = new ProductAvailability("DISCONTINUED", 4);
      DISCONTINUED = localProductAvailability5;
      $VALUES = new ProductAvailability[] { localProductAvailability1, localProductAvailability2, localProductAvailability3, localProductAvailability4, localProductAvailability5 };
    }
    
    private ProductAvailability() {}
  }
  
  public static enum ProductCondition
  {
    static
    {
      ProductCondition localProductCondition1 = new ProductCondition("NEW", 0);
      NEW = localProductCondition1;
      ProductCondition localProductCondition2 = new ProductCondition("REFURBISHED", 1);
      REFURBISHED = localProductCondition2;
      ProductCondition localProductCondition3 = new ProductCondition("USED", 2);
      USED = localProductCondition3;
      $VALUES = new ProductCondition[] { localProductCondition1, localProductCondition2, localProductCondition3 };
    }
    
    private ProductCondition() {}
  }
}

/* Location:
 * Qualified Name:     com.facebook.appevents.AppEventsLogger
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */