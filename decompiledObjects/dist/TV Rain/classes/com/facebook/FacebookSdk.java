package com.facebook;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.Signature;
import android.os.AsyncTask;
import android.os.BaseBundle;
import android.util.Base64;
import android.util.Log;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import com.facebook.appevents.AppEventsLogger;
import com.facebook.appevents.AppEventsManager;
import com.facebook.appevents.internal.ActivityLifecycleTracker;
import com.facebook.appevents.ondeviceprocessing.OnDeviceProcessingManager;
import com.facebook.internal.BoltsMeasurementEventListener;
import com.facebook.internal.FeatureManager;
import com.facebook.internal.FeatureManager.Callback;
import com.facebook.internal.FeatureManager.Feature;
import com.facebook.internal.FetchedAppSettingsManager;
import com.facebook.internal.LockOnGetVariable;
import com.facebook.internal.NativeProtocol;
import com.facebook.internal.ServerProtocol;
import com.facebook.internal.Utility;
import com.facebook.internal.Validate;
import com.facebook.internal.instrument.InstrumentManager;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import com.facebook.internal.logging.monitor.MonitorManager;
import java.io.File;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicLong;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class FacebookSdk
{
  public static final String ADVERTISER_ID_COLLECTION_ENABLED_PROPERTY = "com.facebook.sdk.AdvertiserIDCollectionEnabled";
  public static final String APPLICATION_ID_PROPERTY = "com.facebook.sdk.ApplicationId";
  public static final String APPLICATION_NAME_PROPERTY = "com.facebook.sdk.ApplicationName";
  public static final String APP_EVENT_PREFERENCES = "com.facebook.sdk.appEventPreferences";
  private static final String ATTRIBUTION_PREFERENCES = "com.facebook.sdk.attributionTracking";
  public static final String AUTO_INIT_ENABLED_PROPERTY = "com.facebook.sdk.AutoInitEnabled";
  public static final String AUTO_LOG_APP_EVENTS_ENABLED_PROPERTY = "com.facebook.sdk.AutoLogAppEventsEnabled";
  public static final String CALLBACK_OFFSET_CHANGED_AFTER_INIT = "The callback request code offset can't be updated once the SDK is initialized. Call FacebookSdk.setCallbackRequestCodeOffset inside your Application.onCreate method";
  public static final String CALLBACK_OFFSET_NEGATIVE = "The callback request code offset can't be negative.";
  public static final String CALLBACK_OFFSET_PROPERTY = "com.facebook.sdk.CallbackOffset";
  public static final String CLIENT_TOKEN_PROPERTY = "com.facebook.sdk.ClientToken";
  public static final String CODELESS_DEBUG_LOG_ENABLED_PROPERTY = "com.facebook.sdk.CodelessDebugLogEnabled";
  public static final String DATA_PROCESSING_OPTIONS_PREFERENCES = "com.facebook.sdk.DataProcessingOptions";
  public static final String DATA_PROCESSION_OPTIONS = "data_processing_options";
  public static final String DATA_PROCESSION_OPTIONS_COUNTRY = "data_processing_options_country";
  public static final String DATA_PROCESSION_OPTIONS_STATE = "data_processing_options_state";
  private static final int DEFAULT_CALLBACK_REQUEST_CODE_OFFSET = 64206;
  private static final String FACEBOOK_COM = "facebook.com";
  private static final String FB_GG = "fb.gg";
  private static final Object LOCK;
  private static final int MAX_REQUEST_CODE_RANGE = 100;
  public static final String MONITOR_ENABLED_PROPERTY = "com.facebook.sdk.MonitorEnabled";
  private static final String PUBLISH_ACTIVITY_PATH = "%s/activities";
  private static final String TAG = "com.facebook.FacebookSdk";
  public static final String WEB_DIALOG_THEME = "com.facebook.sdk.WebDialogTheme";
  private static volatile String appClientToken;
  private static Context applicationContext;
  private static volatile String applicationId;
  @Nullable
  private static volatile String applicationName;
  private static LockOnGetVariable<File> cacheDir;
  private static int callbackRequestCodeOffset;
  private static volatile Boolean codelessDebugLogEnabled;
  private static Executor executor;
  private static volatile String facebookDomain;
  private static String graphApiVersion;
  private static GraphRequestCreator graphRequestCreator = new GraphRequestCreator()
  {
    public GraphRequest createPostRequest(@Nullable AccessToken paramAnonymousAccessToken, String paramAnonymousString, JSONObject paramAnonymousJSONObject, @Nullable GraphRequest.Callback paramAnonymousCallback)
    {
      return GraphRequest.newPostRequest(paramAnonymousAccessToken, paramAnonymousString, paramAnonymousJSONObject, paramAnonymousCallback);
    }
  };
  public static boolean hasCustomTabsPrefetching;
  public static boolean ignoreAppSwitchToLoggedOut;
  private static volatile boolean isDebugEnabled;
  private static boolean isLegacyTokenUpgradeSupported;
  private static final HashSet<LoggingBehavior> loggingBehaviors = new HashSet(Arrays.asList(new LoggingBehavior[] { LoggingBehavior.DEVELOPER_ERRORS }));
  private static AtomicLong onProgressThreshold;
  private static Boolean sdkFullyInitialized;
  private static Boolean sdkInitialized;
  
  static
  {
    facebookDomain = "facebook.com";
    onProgressThreshold = new AtomicLong(65536L);
    isDebugEnabled = false;
    isLegacyTokenUpgradeSupported = false;
    callbackRequestCodeOffset = 64206;
    LOCK = new Object();
    graphApiVersion = ServerProtocol.getDefaultAPIVersion();
    hasCustomTabsPrefetching = false;
    ignoreAppSwitchToLoggedOut = false;
    Boolean localBoolean = Boolean.FALSE;
    sdkInitialized = localBoolean;
    sdkFullyInitialized = localBoolean;
  }
  
  public static void addLoggingBehavior(LoggingBehavior paramLoggingBehavior)
  {
    synchronized (loggingBehaviors)
    {
      ???.add(paramLoggingBehavior);
      updateGraphDebugBehavior();
      return;
    }
  }
  
  public static void clearLoggingBehaviors()
  {
    synchronized (loggingBehaviors)
    {
      ???.clear();
      return;
    }
  }
  
  public static void fullyInitialize()
  {
    sdkFullyInitialized = Boolean.TRUE;
  }
  
  public static boolean getAdvertiserIDCollectionEnabled()
  {
    return UserSettingsManager.getAdvertiserIDCollectionEnabled();
  }
  
  public static Context getApplicationContext()
  {
    Validate.sdkInitialized();
    return applicationContext;
  }
  
  public static String getApplicationId()
  {
    Validate.sdkInitialized();
    return applicationId;
  }
  
  @Nullable
  public static String getApplicationName()
  {
    Validate.sdkInitialized();
    return applicationName;
  }
  
  public static String getApplicationSignature(Context paramContext)
  {
    if (CrashShieldHandler.isObjectCrashing(FacebookSdk.class)) {
      return null;
    }
    for (;;)
    {
      try
      {
        Validate.sdkInitialized();
        if (paramContext == null) {
          return null;
        }
        localObject = paramContext.getPackageManager();
        if (localObject == null) {
          return null;
        }
        paramContext = paramContext.getPackageName();
      }
      finally
      {
        Object localObject;
        CrashShieldHandler.handleThrowable(paramContext, FacebookSdk.class);
        return null;
      }
      try
      {
        paramContext = ((PackageManager)localObject).getPackageInfo(paramContext, 64);
        localObject = signatures;
        if (localObject != null)
        {
          int i = localObject.length;
          if (i != 0)
          {
            localObject = MessageDigest.getInstance("SHA-1");
            ((MessageDigest)localObject).update(signatures[0].toByteArray());
            paramContext = Base64.encodeToString(((MessageDigest)localObject).digest(), 9);
            return paramContext;
          }
        }
      }
      catch (PackageManager.NameNotFoundException|NoSuchAlgorithmException paramContext) {}
    }
    return null;
  }
  
  public static boolean getAutoInitEnabled()
  {
    return UserSettingsManager.getAutoInitEnabled();
  }
  
  public static boolean getAutoLogAppEventsEnabled()
  {
    return UserSettingsManager.getAutoLogAppEventsEnabled();
  }
  
  public static File getCacheDir()
  {
    Validate.sdkInitialized();
    return (File)cacheDir.getValue();
  }
  
  public static int getCallbackRequestCodeOffset()
  {
    Validate.sdkInitialized();
    return callbackRequestCodeOffset;
  }
  
  public static String getClientToken()
  {
    Validate.sdkInitialized();
    return appClientToken;
  }
  
  public static boolean getCodelessDebugLogEnabled()
  {
    Validate.sdkInitialized();
    return codelessDebugLogEnabled.booleanValue();
  }
  
  public static boolean getCodelessSetupEnabled()
  {
    return UserSettingsManager.getCodelessSetupEnabled();
  }
  
  public static Executor getExecutor()
  {
    synchronized (LOCK)
    {
      if (executor == null) {
        executor = AsyncTask.THREAD_POOL_EXECUTOR;
      }
      return executor;
    }
  }
  
  public static String getFacebookDomain()
  {
    return facebookDomain;
  }
  
  public static String getGraphApiVersion()
  {
    Utility.logd(TAG, String.format("getGraphApiVersion: %s", new Object[] { graphApiVersion }));
    return graphApiVersion;
  }
  
  public static String getGraphDomain()
  {
    Object localObject = AccessToken.getCurrentAccessToken();
    if (localObject != null) {
      localObject = ((AccessToken)localObject).getGraphDomain();
    } else {
      localObject = null;
    }
    if (localObject == null) {
      localObject = facebookDomain;
    } else if (((String)localObject).equals("gaming")) {
      localObject = facebookDomain.replace("facebook.com", "fb.gg");
    } else {
      localObject = facebookDomain;
    }
    return (String)localObject;
  }
  
  public static boolean getLimitEventAndDataUsage(Context paramContext)
  {
    Validate.sdkInitialized();
    return paramContext.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).getBoolean("limitEventUsage", false);
  }
  
  public static Set<LoggingBehavior> getLoggingBehaviors()
  {
    synchronized (loggingBehaviors)
    {
      Object localObject1 = new java/util/HashSet;
      ((HashSet)localObject1).<init>(???);
      localObject1 = Collections.unmodifiableSet((Set)localObject1);
      return (Set<LoggingBehavior>)localObject1;
    }
  }
  
  public static boolean getMonitorEnabled()
  {
    return UserSettingsManager.getMonitorEnabled();
  }
  
  public static long getOnProgressThreshold()
  {
    Validate.sdkInitialized();
    return onProgressThreshold.get();
  }
  
  public static String getSdkVersion()
  {
    return "8.2.0";
  }
  
  public static boolean isDebugEnabled()
  {
    return isDebugEnabled;
  }
  
  public static boolean isFacebookRequestCode(int paramInt)
  {
    int i = callbackRequestCodeOffset;
    boolean bool;
    if ((paramInt >= i) && (paramInt < i + 100)) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
  public static boolean isFullyInitialized()
  {
    try
    {
      boolean bool = sdkFullyInitialized.booleanValue();
      return bool;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public static boolean isInitialized()
  {
    try
    {
      boolean bool = sdkInitialized.booleanValue();
      return bool;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public static boolean isLegacyTokenUpgradeSupported()
  {
    return isLegacyTokenUpgradeSupported;
  }
  
  public static boolean isLoggingBehaviorEnabled(LoggingBehavior paramLoggingBehavior)
  {
    synchronized (loggingBehaviors)
    {
      boolean bool;
      if ((isDebugEnabled()) && (???.contains(paramLoggingBehavior))) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
  }
  
  public static void loadDefaultsFromMetadata(Context paramContext)
  {
    if (paramContext == null) {
      return;
    }
    try
    {
      paramContext = paramContext.getPackageManager().getApplicationInfo(paramContext.getPackageName(), 128);
      if ((paramContext != null) && (metaData != null))
      {
        if (applicationId == null)
        {
          Object localObject = metaData.get("com.facebook.sdk.ApplicationId");
          if ((localObject instanceof String))
          {
            localObject = (String)localObject;
            if (((String)localObject).toLowerCase(Locale.ROOT).startsWith("fb")) {
              applicationId = ((String)localObject).substring(2);
            } else {
              applicationId = (String)localObject;
            }
          }
          else if ((localObject instanceof Number))
          {
            throw new FacebookException("App Ids cannot be directly placed in the manifest.They must be prefixed by 'fb' or be placed in the string resource file.");
          }
        }
        if (applicationName == null) {
          applicationName = metaData.getString("com.facebook.sdk.ApplicationName");
        }
        if (appClientToken == null) {
          appClientToken = metaData.getString("com.facebook.sdk.ClientToken");
        }
        if (callbackRequestCodeOffset == 64206) {
          callbackRequestCodeOffset = metaData.getInt("com.facebook.sdk.CallbackOffset", 64206);
        }
        if (codelessDebugLogEnabled == null) {
          codelessDebugLogEnabled = Boolean.valueOf(metaData.getBoolean("com.facebook.sdk.CodelessDebugLogEnabled", false));
        }
      }
      return;
    }
    catch (PackageManager.NameNotFoundException paramContext)
    {
      for (;;) {}
    }
  }
  
  /* Error */
  public static void publishInstallAndWaitForResponse(Context paramContext, String paramString)
  {
    // Byte code:
    //   0: ldc 2
    //   2: invokestatic 251	com/facebook/internal/instrument/crashshield/CrashShieldHandler:isObjectCrashing	(Ljava/lang/Object;)Z
    //   5: ifeq +4 -> 9
    //   8: return
    //   9: aload_0
    //   10: ifnull +168 -> 178
    //   13: aload_1
    //   14: ifnull +164 -> 178
    //   17: aload_0
    //   18: invokestatic 501	com/facebook/internal/AttributionIdentifiers:getAttributionIdentifiers	(Landroid/content/Context;)Lcom/facebook/internal/AttributionIdentifiers;
    //   21: astore_2
    //   22: aload_0
    //   23: ldc 44
    //   25: iconst_0
    //   26: invokevirtual 386	android/content/Context:getSharedPreferences	(Ljava/lang/String;I)Landroid/content/SharedPreferences;
    //   29: astore_3
    //   30: new 503	java/lang/StringBuilder
    //   33: astore 4
    //   35: aload 4
    //   37: invokespecial 504	java/lang/StringBuilder:<init>	()V
    //   40: aload 4
    //   42: aload_1
    //   43: invokevirtual 508	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   46: pop
    //   47: aload 4
    //   49: ldc_w 510
    //   52: invokevirtual 508	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   55: pop
    //   56: aload 4
    //   58: invokevirtual 513	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   61: astore 4
    //   63: aload_3
    //   64: aload 4
    //   66: lconst_0
    //   67: invokeinterface 517 4 0
    //   72: lstore 5
    //   74: getstatic 523	com/facebook/appevents/internal/AppEventsLoggerUtility$GraphAPIActivityType:MOBILE_INSTALL_EVENT	Lcom/facebook/appevents/internal/AppEventsLoggerUtility$GraphAPIActivityType;
    //   77: aload_2
    //   78: aload_0
    //   79: invokestatic 528	com/facebook/appevents/AppEventsLogger:getAnonymousAppDeviceGUID	(Landroid/content/Context;)Ljava/lang/String;
    //   82: aload_0
    //   83: invokestatic 530	com/facebook/FacebookSdk:getLimitEventAndDataUsage	(Landroid/content/Context;)Z
    //   86: aload_0
    //   87: invokestatic 536	com/facebook/appevents/internal/AppEventsLoggerUtility:getJSONObjectForGraphAPICall	(Lcom/facebook/appevents/internal/AppEventsLoggerUtility$GraphAPIActivityType;Lcom/facebook/internal/AttributionIdentifiers;Ljava/lang/String;ZLandroid/content/Context;)Lorg/json/JSONObject;
    //   90: astore_0
    //   91: ldc 96
    //   93: iconst_1
    //   94: anewarray 4	java/lang/Object
    //   97: dup
    //   98: iconst_0
    //   99: aload_1
    //   100: aastore
    //   101: invokestatic 356	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   104: astore_1
    //   105: getstatic 199	com/facebook/FacebookSdk:graphRequestCreator	Lcom/facebook/FacebookSdk$GraphRequestCreator;
    //   108: aconst_null
    //   109: aload_1
    //   110: aload_0
    //   111: aconst_null
    //   112: invokeinterface 540 5 0
    //   117: astore_0
    //   118: lload 5
    //   120: lconst_0
    //   121: lcmp
    //   122: ifne +81 -> 203
    //   125: aload_0
    //   126: invokevirtual 546	com/facebook/GraphRequest:executeAndWait	()Lcom/facebook/GraphResponse;
    //   129: invokevirtual 552	com/facebook/GraphResponse:getError	()Lcom/facebook/FacebookRequestError;
    //   132: ifnonnull +71 -> 203
    //   135: aload_3
    //   136: invokeinterface 556 1 0
    //   141: astore_0
    //   142: aload_0
    //   143: aload 4
    //   145: invokestatic 561	java/lang/System:currentTimeMillis	()J
    //   148: invokeinterface 567 4 0
    //   153: pop
    //   154: aload_0
    //   155: invokeinterface 570 1 0
    //   160: goto +43 -> 203
    //   163: astore_1
    //   164: new 471	com/facebook/FacebookException
    //   167: astore_0
    //   168: aload_0
    //   169: ldc_w 572
    //   172: aload_1
    //   173: invokespecial 575	com/facebook/FacebookException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   176: aload_0
    //   177: athrow
    //   178: new 577	java/lang/IllegalArgumentException
    //   181: astore_0
    //   182: aload_0
    //   183: ldc_w 579
    //   186: invokespecial 580	java/lang/IllegalArgumentException:<init>	(Ljava/lang/String;)V
    //   189: aload_0
    //   190: athrow
    //   191: astore_0
    //   192: goto +12 -> 204
    //   195: astore_0
    //   196: ldc_w 582
    //   199: aload_0
    //   200: invokestatic 585	com/facebook/internal/Utility:logd	(Ljava/lang/String;Ljava/lang/Exception;)V
    //   203: return
    //   204: aload_0
    //   205: ldc 2
    //   207: invokestatic 303	com/facebook/internal/instrument/crashshield/CrashShieldHandler:handleThrowable	(Ljava/lang/Throwable;Ljava/lang/Object;)V
    //   210: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	211	0	paramContext	Context
    //   0	211	1	paramString	String
    //   21	57	2	localAttributionIdentifiers	com.facebook.internal.AttributionIdentifiers
    //   29	107	3	localSharedPreferences	SharedPreferences
    //   33	111	4	localObject	Object
    //   72	47	5	l	long
    // Exception table:
    //   from	to	target	type
    //   74	91	163	org/json/JSONException
    //   17	74	191	finally
    //   74	91	191	finally
    //   91	118	191	finally
    //   125	160	191	finally
    //   164	178	191	finally
    //   178	191	191	finally
    //   196	203	191	finally
    //   17	74	195	java/lang/Exception
    //   74	91	195	java/lang/Exception
    //   91	118	195	java/lang/Exception
    //   125	160	195	java/lang/Exception
    //   164	178	195	java/lang/Exception
    //   178	191	195	java/lang/Exception
  }
  
  public static void publishInstallAsync(Context paramContext, String paramString)
  {
    if (CrashShieldHandler.isObjectCrashing(FacebookSdk.class)) {
      return;
    }
    try
    {
      Context localContext = paramContext.getApplicationContext();
      paramContext = getExecutor();
      Runnable local9 = new com/facebook/FacebookSdk$9;
      local9.<init>(localContext, paramString);
      paramContext.execute(local9);
      if ((FeatureManager.isEnabled(FeatureManager.Feature.OnDeviceEventProcessing)) && (OnDeviceProcessingManager.isOnDeviceProcessingEnabled())) {}
      return;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramContext, FacebookSdk.class);
    }
  }
  
  public static void removeLoggingBehavior(LoggingBehavior paramLoggingBehavior)
  {
    synchronized (loggingBehaviors)
    {
      ???.remove(paramLoggingBehavior);
      return;
    }
  }
  
  @Deprecated
  public static void sdkInitialize(Context paramContext)
  {
    try
    {
      sdkInitialize(paramContext, null);
      return;
    }
    finally
    {
      paramContext = finally;
      throw paramContext;
    }
  }
  
  @Deprecated
  public static void sdkInitialize(Context paramContext, int paramInt)
  {
    try
    {
      sdkInitialize(paramContext, paramInt, null);
      return;
    }
    finally
    {
      paramContext = finally;
      throw paramContext;
    }
  }
  
  @Deprecated
  public static void sdkInitialize(Context paramContext, int paramInt, InitializeCallback paramInitializeCallback)
  {
    try
    {
      if ((sdkInitialized.booleanValue()) && (paramInt != callbackRequestCodeOffset))
      {
        paramContext = new com/facebook/FacebookException;
        paramContext.<init>("The callback request code offset can't be updated once the SDK is initialized. Call FacebookSdk.setCallbackRequestCodeOffset inside your Application.onCreate method");
        throw paramContext;
      }
      if (paramInt >= 0)
      {
        callbackRequestCodeOffset = paramInt;
        sdkInitialize(paramContext, paramInitializeCallback);
        return;
      }
      paramContext = new com/facebook/FacebookException;
      paramContext.<init>("The callback request code offset can't be negative.");
      throw paramContext;
    }
    finally {}
  }
  
  @Deprecated
  public static void sdkInitialize(Context paramContext, InitializeCallback paramInitializeCallback)
  {
    try
    {
      if (sdkInitialized.booleanValue())
      {
        if (paramInitializeCallback != null) {
          paramInitializeCallback.onInitialized();
        }
        return;
      }
      Validate.notNull(paramContext, "applicationContext");
      Validate.hasFacebookActivity(paramContext, false);
      Validate.hasInternetPermissions(paramContext, false);
      applicationContext = paramContext.getApplicationContext();
      AppEventsLogger.getAnonymousAppDeviceGUID(paramContext);
      loadDefaultsFromMetadata(applicationContext);
      if (!Utility.isNullOrEmpty(applicationId))
      {
        sdkInitialized = Boolean.TRUE;
        if (getAutoInitEnabled()) {
          fullyInitialize();
        }
        if (((applicationContext instanceof Application)) && (UserSettingsManager.getAutoLogAppEventsEnabled())) {
          ActivityLifecycleTracker.startTracking((Application)applicationContext, applicationId);
        }
        FetchedAppSettingsManager.loadAppSettingsAsync();
        NativeProtocol.updateAllAvailableProtocolVersionsAsync();
        BoltsMeasurementEventListener.getInstance(applicationContext);
        Object localObject1 = new com/facebook/internal/LockOnGetVariable;
        Object localObject2 = new com/facebook/FacebookSdk$2;
        ((2)localObject2).<init>();
        ((LockOnGetVariable)localObject1).<init>((Callable)localObject2);
        cacheDir = (LockOnGetVariable)localObject1;
        localObject1 = FeatureManager.Feature.Instrument;
        localObject2 = new com/facebook/FacebookSdk$3;
        ((3)localObject2).<init>();
        FeatureManager.checkFeature((FeatureManager.Feature)localObject1, (FeatureManager.Callback)localObject2);
        localObject1 = FeatureManager.Feature.AppEvents;
        localObject2 = new com/facebook/FacebookSdk$4;
        ((4)localObject2).<init>();
        FeatureManager.checkFeature((FeatureManager.Feature)localObject1, (FeatureManager.Callback)localObject2);
        localObject1 = FeatureManager.Feature.ChromeCustomTabsPrefetching;
        localObject2 = new com/facebook/FacebookSdk$5;
        ((5)localObject2).<init>();
        FeatureManager.checkFeature((FeatureManager.Feature)localObject1, (FeatureManager.Callback)localObject2);
        localObject2 = FeatureManager.Feature.IgnoreAppSwitchToLoggedOut;
        localObject1 = new com/facebook/FacebookSdk$6;
        ((6)localObject1).<init>();
        FeatureManager.checkFeature((FeatureManager.Feature)localObject2, (FeatureManager.Callback)localObject1);
        localObject1 = FeatureManager.Feature.Monitoring;
        localObject2 = new com/facebook/FacebookSdk$7;
        ((7)localObject2).<init>();
        FeatureManager.checkFeature((FeatureManager.Feature)localObject1, (FeatureManager.Callback)localObject2);
        localObject1 = new java/util/concurrent/FutureTask;
        localObject2 = new com/facebook/FacebookSdk$8;
        ((8)localObject2).<init>(paramInitializeCallback, paramContext);
        ((FutureTask)localObject1).<init>((Callable)localObject2);
        getExecutor().execute((Runnable)localObject1);
        return;
      }
      paramContext = new com/facebook/FacebookException;
      paramContext.<init>("A valid Facebook app id must be set in the AndroidManifest.xml or set by calling FacebookSdk.setApplicationId before initializing the sdk.");
      throw paramContext;
    }
    finally {}
  }
  
  public static void setAdvertiserIDCollectionEnabled(boolean paramBoolean)
  {
    UserSettingsManager.setAdvertiserIDCollectionEnabled(paramBoolean);
  }
  
  public static void setApplicationId(String paramString)
  {
    applicationId = paramString;
  }
  
  public static void setApplicationName(String paramString)
  {
    applicationName = paramString;
  }
  
  public static void setAutoInitEnabled(boolean paramBoolean)
  {
    UserSettingsManager.setAutoInitEnabled(paramBoolean);
    if (paramBoolean) {
      fullyInitialize();
    }
  }
  
  public static void setAutoLogAppEventsEnabled(boolean paramBoolean)
  {
    UserSettingsManager.setAutoLogAppEventsEnabled(paramBoolean);
    if (paramBoolean) {
      ActivityLifecycleTracker.startTracking((Application)applicationContext, applicationId);
    }
  }
  
  public static void setCacheDir(File paramFile)
  {
    cacheDir = new LockOnGetVariable(paramFile);
  }
  
  public static void setClientToken(String paramString)
  {
    appClientToken = paramString;
  }
  
  public static void setCodelessDebugLogEnabled(boolean paramBoolean)
  {
    codelessDebugLogEnabled = Boolean.valueOf(paramBoolean);
  }
  
  public static void setDataProcessingOptions(String[] paramArrayOfString)
  {
    if (CrashShieldHandler.isObjectCrashing(FacebookSdk.class)) {
      return;
    }
    try
    {
      setDataProcessingOptions(paramArrayOfString, 0, 0);
      return;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramArrayOfString, FacebookSdk.class);
    }
  }
  
  public static void setDataProcessingOptions(String[] paramArrayOfString, int paramInt1, int paramInt2)
  {
    if (CrashShieldHandler.isObjectCrashing(FacebookSdk.class)) {
      return;
    }
    String[] arrayOfString = paramArrayOfString;
    if (paramArrayOfString == null) {}
    try
    {
      arrayOfString = new String[0];
      JSONArray localJSONArray;
      return;
    }
    finally
    {
      try
      {
        paramArrayOfString = new org/json/JSONObject;
        paramArrayOfString.<init>();
        localJSONArray = new org/json/JSONArray;
        localJSONArray.<init>(Arrays.asList(arrayOfString));
        paramArrayOfString.put("data_processing_options", localJSONArray);
        paramArrayOfString.put("data_processing_options_country", paramInt1);
        paramArrayOfString.put("data_processing_options_state", paramInt2);
        applicationContext.getSharedPreferences("com.facebook.sdk.DataProcessingOptions", 0).edit().putString("data_processing_options", paramArrayOfString.toString()).apply();
      }
      catch (JSONException paramArrayOfString)
      {
        for (;;) {}
      }
      paramArrayOfString = finally;
      CrashShieldHandler.handleThrowable(paramArrayOfString, FacebookSdk.class);
    }
  }
  
  public static void setExecutor(Executor paramExecutor)
  {
    Validate.notNull(paramExecutor, "executor");
    synchronized (LOCK)
    {
      executor = paramExecutor;
      return;
    }
  }
  
  public static void setFacebookDomain(String paramString)
  {
    Log.w(TAG, "WARNING: Calling setFacebookDomain from non-DEBUG code.");
    facebookDomain = paramString;
  }
  
  public static void setGraphApiVersion(String paramString)
  {
    Log.w(TAG, "WARNING: Calling setGraphApiVersion from non-DEBUG code.");
    if ((!Utility.isNullOrEmpty(paramString)) && (!graphApiVersion.equals(paramString))) {
      graphApiVersion = paramString;
    }
  }
  
  @VisibleForTesting
  public static void setGraphRequestCreator(GraphRequestCreator paramGraphRequestCreator)
  {
    graphRequestCreator = paramGraphRequestCreator;
  }
  
  public static void setIsDebugEnabled(boolean paramBoolean)
  {
    isDebugEnabled = paramBoolean;
  }
  
  public static void setLegacyTokenUpgradeSupported(boolean paramBoolean)
  {
    isLegacyTokenUpgradeSupported = paramBoolean;
  }
  
  public static void setLimitEventAndDataUsage(Context paramContext, boolean paramBoolean)
  {
    paramContext.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).edit().putBoolean("limitEventUsage", paramBoolean).apply();
  }
  
  public static void setMonitorEnabled(boolean paramBoolean)
  {
    UserSettingsManager.setMonitorEnabled(paramBoolean);
  }
  
  public static void setOnProgressThreshold(long paramLong)
  {
    onProgressThreshold.set(paramLong);
  }
  
  private static void updateGraphDebugBehavior()
  {
    HashSet localHashSet = loggingBehaviors;
    if (localHashSet.contains(LoggingBehavior.GRAPH_API_DEBUG_INFO))
    {
      LoggingBehavior localLoggingBehavior = LoggingBehavior.GRAPH_API_DEBUG_WARNING;
      if (!localHashSet.contains(localLoggingBehavior)) {
        localHashSet.add(localLoggingBehavior);
      }
    }
  }
  
  @VisibleForTesting
  public static abstract interface GraphRequestCreator
  {
    public abstract GraphRequest createPostRequest(@Nullable AccessToken paramAccessToken, String paramString, JSONObject paramJSONObject, @Nullable GraphRequest.Callback paramCallback);
  }
  
  public static abstract interface InitializeCallback
  {
    public abstract void onInitialized();
  }
}

/* Location:
 * Qualified Name:     com.facebook.FacebookSdk
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */