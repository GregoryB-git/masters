package com.appsflyer.internal;

import L1.a.a;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.Resources;
import android.net.Uri;
import android.net.Uri.Builder;
import android.os.BaseBundle;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MotionEvent;
import androidx.annotation.NonNull;
import com.appsflyer.AFKeystoreWrapper;
import com.appsflyer.AFLogger;
import com.appsflyer.AFLogger.LogLevel;
import com.appsflyer.AFVersionDeclaration;
import com.appsflyer.AppsFlyerConversionListener;
import com.appsflyer.AppsFlyerInAppPurchaseValidatorListener;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.AppsFlyerProperties.EmailsCryptType;
import com.appsflyer.PurchaseHandler;
import com.appsflyer.PurchaseHandler.PurchaseValidationCallback;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import com.appsflyer.deeplink.DeepLinkListener;
import com.appsflyer.deeplink.DeepLinkResult.Error;
import com.appsflyer.internal.platform_extension.PluginInfo;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.net.URI;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Set;
import java.util.TimeZone;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import x1.B;
import x2.j;

public final class AFa1eSDK
  extends AppsFlyerLib
{
  public static final String AFInAppEventType;
  public static final String AFKeystoreWrapper;
  private static String afErrorLog;
  private static AFa1eSDK afRDLog = new AFa1eSDK();
  private static int onAttributionFailure = (onDeepLinking + 93) % 128;
  private static int onDeepLinking = 1;
  private static int onResponse;
  static AppsFlyerInAppPurchaseValidatorListener valueOf;
  static final String values;
  public volatile AppsFlyerConversionListener AFInAppEventParameterName = null;
  String AFLogger;
  private Map<Long, String> AFLogger$LogLevel;
  private long AFVersionDeclaration = TimeUnit.SECONDS.toMillis(5L);
  private boolean AppsFlyer2dXConversionCallback = false;
  private long afDebugLog = -1L;
  private boolean afErrorLogForExcManagerOnly = false;
  public AFa1cSDK afInfoLog;
  private long afWarnLog = -1L;
  private String getLevel;
  private Application init;
  private final Executor onAppOpenAttribution = Executors.newSingleThreadExecutor();
  private boolean onAppOpenAttributionNative;
  private String onAttributionFailureNative;
  @NonNull
  private final AFc1ySDK onConversionDataFail;
  private SharedPreferences onConversionDataSuccess;
  private boolean onDeepLinkingNative = false;
  private final AFb1xSDK onInstallConversionDataLoadedNative = new AFb1xSDK();
  private boolean onInstallConversionFailureNative;
  private Map<String, Object> onResponseErrorNative;
  private AFb1lSDK onResponseNative;
  
  static
  {
    values();
    values = "262";
    AFKeystoreWrapper = "6.12";
    afErrorLog = "https://%sstats.%s/stats";
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("6.12");
    localStringBuilder.append("/androidevent?buildnumber=6.12.2&app_id=");
    AFInAppEventType = localStringBuilder.toString();
    valueOf = null;
  }
  
  public AFa1eSDK()
  {
    AFVersionDeclaration.init();
    onConversionDataFail = new AFc1ySDK();
    AFc1bSDK localAFc1bSDK = AFInAppEventType().AFVersionDeclaration();
    AFa1wSDK localAFa1wSDK = new AFa1wSDK((byte)0);
    values.add(localAFa1wSDK);
  }
  
  private int AFInAppEventParameterName(AFb1dSDK paramAFb1dSDK)
  {
    onAttributionFailure = (onDeepLinking + 119) % 128;
    int i = AFKeystoreWrapper(paramAFb1dSDK, "appsFlyerAdRevenueCount", true);
    onAttributionFailure = (onDeepLinking + 59) % 128;
    return i;
  }
  
  public static String AFInAppEventParameterName()
  {
    onAttributionFailure = (onDeepLinking + 3) % 128;
    String str = values("AppUserId");
    onDeepLinking = (onAttributionFailure + 99) % 128;
    return str;
  }
  
  private static String AFInAppEventParameterName(Activity paramActivity)
  {
    Object localObject1 = null;
    String str = null;
    Object localObject2 = localObject1;
    if (paramActivity != null)
    {
      Intent localIntent = paramActivity.getIntent();
      localObject2 = localObject1;
      if (localIntent != null)
      {
        int i = onAttributionFailure + 43;
        onDeepLinking = i % 128;
        if (i % 2 == 0)
        {
          localObject2 = str;
          try
          {
            paramActivity = localIntent.getExtras();
            localObject2 = str;
            throw new ArithmeticException("divide by zero");
          }
          finally
          {
            break label157;
          }
        }
        localObject2 = str;
        Bundle localBundle = localIntent.getExtras();
        localObject2 = localObject1;
        if (localBundle != null)
        {
          localObject2 = str;
          str = localBundle.getString("af");
          localObject2 = str;
          if (str != null)
          {
            localObject2 = str;
            AFLogger.afInfoLog("Push Notification received af payload = ".concat(String.valueOf(str)));
            localObject2 = str;
            localBundle.remove("af");
            localObject2 = str;
            paramActivity.setIntent(localIntent.putExtras(localBundle));
            onAttributionFailure = (onDeepLinking + 41) % 128;
            return str;
            label157:
            AFLogger.afErrorLog(paramActivity.getMessage(), paramActivity);
          }
        }
      }
    }
    return (String)localObject2;
  }
  
  private void AFInAppEventParameterName(Map<String, Object> paramMap)
  {
    if (!AppsFlyerProperties.getInstance().getBoolean("collectAndroidIdForceByUser", false))
    {
      onAttributionFailure = (onDeepLinking + 81) % 128;
      if (!AppsFlyerProperties.getInstance().getBoolean("collectIMEIForceByUser", false))
      {
        if (paramMap.get("advertiserId") == null) {
          return;
        }
        try
        {
          if (!AFb1uSDK.values(AFLogger)) {
            break label123;
          }
          Object localObject = paramMap.remove("android_id");
          if (localObject == null) {
            break label123;
          }
          int i = onAttributionFailure + 89;
          onDeepLinking = i % 128;
          if (i % 2 != 0) {
            AFLogger.afInfoLog("validateGaidAndIMEI :: removing: android_id");
          }
        }
        catch (Exception paramMap)
        {
          break label160;
        }
        AFLogger.afInfoLog("validateGaidAndIMEI :: removing: android_id");
        try
        {
          throw null;
        }
        finally {}
        label123:
        if ((AFb1uSDK.values(AFInAppEventTypeafWarnLogvalues)) && (paramMap.remove("imei") != null)) {
          AFLogger.afInfoLog("validateGaidAndIMEI :: removing: imei");
        }
        return;
        label160:
        AFLogger.afErrorLog("failed to remove IMEI or AndroidID key from params; ", paramMap);
        return;
      }
    }
    onAttributionFailure = (onDeepLinking + 9) % 128;
  }
  
  /* Error */
  private static void AFInAppEventParameterName(@NonNull ScheduledExecutorService paramScheduledExecutorService, Runnable paramRunnable, long paramLong, TimeUnit paramTimeUnit)
  {
    // Byte code:
    //   0: getstatic 113	com/appsflyer/internal/AFa1eSDK:onDeepLinking	I
    //   3: bipush 111
    //   5: iadd
    //   6: sipush 128
    //   9: irem
    //   10: putstatic 115	com/appsflyer/internal/AFa1eSDK:onAttributionFailure	I
    //   13: aload_0
    //   14: aload_1
    //   15: lload_2
    //   16: aload 4
    //   18: invokeinterface 339 5 0
    //   23: pop
    //   24: getstatic 113	com/appsflyer/internal/AFa1eSDK:onDeepLinking	I
    //   27: bipush 125
    //   29: iadd
    //   30: sipush 128
    //   33: irem
    //   34: putstatic 115	com/appsflyer/internal/AFa1eSDK:onAttributionFailure	I
    //   37: return
    //   38: astore_0
    //   39: ldc_w 341
    //   42: astore_1
    //   43: aload_1
    //   44: aload_0
    //   45: invokestatic 262	com/appsflyer/AFLogger:afErrorLog	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   48: return
    //   49: astore_0
    //   50: ldc_w 343
    //   53: astore_1
    //   54: goto -11 -> 43
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	57	0	paramScheduledExecutorService	ScheduledExecutorService
    //   0	57	1	paramRunnable	Runnable
    //   0	57	2	paramLong	long
    //   0	57	4	paramTimeUnit	TimeUnit
    // Exception table:
    //   from	to	target	type
    //   13	24	38	finally
    //   13	24	49	java/util/concurrent/RejectedExecutionException
  }
  
  public static boolean AFInAppEventParameterName(Context paramContext)
  {
    int i = onDeepLinking + 35;
    onAttributionFailure = i % 128;
    boolean bool = true;
    if (i % 2 != 0) {
      try
      {
        j.m().g(paramContext);
        throw new ArithmeticException("divide by zero");
      }
      finally
      {
        break label98;
      }
    }
    i = j.m().g(paramContext);
    if (i == 0)
    {
      i = onDeepLinking + 107;
      onAttributionFailure = i % 128;
      if (i % 2 != 0) {
        bool = false;
      }
      return bool;
    }
    onAttributionFailure = (onDeepLinking + 55) % 128;
    break label105;
    label98:
    AFLogger.afErrorLog("WARNING:  Google play services is unavailable. ", localThrowable);
    try
    {
      label105:
      paramContext.getPackageManager().getPackageInfo("com.google.android.gms", 0);
      return true;
    }
    catch (PackageManager.NameNotFoundException paramContext)
    {
      AFLogger.afErrorLog("WARNING:  Google Play Services is unavailable. ", paramContext);
    }
    return false;
  }
  
  private boolean AFInAppEventParameterName(AFa1qSDK paramAFa1qSDK, AFb1dSDK paramAFb1dSDK)
  {
    int i = valueOf(paramAFb1dSDK, false);
    int j;
    if ((i == 1) && (!(paramAFa1qSDK instanceof AFe1lSDK)))
    {
      onDeepLinking = (onAttributionFailure + 81) % 128;
      j = 1;
    }
    else
    {
      j = 0;
    }
    if (!paramAFb1dSDK.valueOf("newGPReferrerSent"))
    {
      int k = onDeepLinking;
      int m = k + 83;
      onAttributionFailure = m % 128;
      if (m % 2 != 0 ? i == 0 : i == 1)
      {
        i = k + 17;
        onAttributionFailure = i % 128;
        if (i % 2 != 0) {
          i = 0;
        } else {
          i = 1;
        }
        onAttributionFailure = (k + 67) % 128;
        if (i == 1) {
          break label163;
        }
      }
    }
    i = onDeepLinking + 97;
    onAttributionFailure = i % 128;
    if (i % 2 == 0) {
      label163:
      return j != 0;
    }
    throw null;
  }
  
  private int AFInAppEventType(AFb1dSDK paramAFb1dSDK)
  {
    int i = onAttributionFailure + 115;
    onDeepLinking = i % 128;
    i = AFKeystoreWrapper(paramAFb1dSDK, "appsFlyerAdImpressionCount", true);
    onDeepLinking = (onAttributionFailure + 83) % 128;
    return i;
  }
  
  public static String AFInAppEventType(AFb1dSDK paramAFb1dSDK, String paramString)
  {
    String str = paramAFb1dSDK.values("CACHED_CHANNEL", null);
    if (str != null)
    {
      int i = (onAttributionFailure + 97) % 128;
      onDeepLinking = i;
      onAttributionFailure = (i + 115) % 128;
      return str;
    }
    paramAFb1dSDK.AFInAppEventParameterName("CACHED_CHANNEL", paramString);
    return paramString;
  }
  
  private static String AFInAppEventType(String paramString)
  {
    int i = onDeepLinking + 77;
    int j = i % 128;
    onAttributionFailure = j;
    if (i % 2 != 0) {
      throw new ArithmeticException("divide by zero");
    }
    if (paramString == null)
    {
      onDeepLinking = (j + 29) % 128;
      return null;
    }
    if ((paramString.matches("fb\\d*?://authorize.*")) && (paramString.contains("access_token")))
    {
      onDeepLinking = (onAttributionFailure + 59) % 128;
      String str = valueOf(paramString);
      if (str.length() == 0) {
        return paramString;
      }
      Object localObject = new ArrayList();
      if (str.contains("&")) {
        localObject = new ArrayList(Arrays.asList(str.split("&")));
      } else {
        ((AbstractCollection)localObject).add(str);
      }
      StringBuilder localStringBuilder = new StringBuilder();
      Iterator localIterator = ((ArrayList)localObject).iterator();
      onDeepLinking = (onAttributionFailure + 7) % 128;
      for (;;)
      {
        if ((localIterator.hasNext() ^ true)) {
          return paramString.replace(str, localStringBuilder.toString());
        }
        onDeepLinking = (onAttributionFailure + 9) % 128;
        localObject = (String)localIterator.next();
        if (((String)localObject).contains("access_token"))
        {
          j = onAttributionFailure + 95;
          onDeepLinking = j % 128;
          localIterator.remove();
          if (j % 2 == 0) {
            throw new ArithmeticException("divide by zero");
          }
        }
        else
        {
          if (localStringBuilder.length() != 0)
          {
            j = onDeepLinking + 49;
            onAttributionFailure = j % 128;
            localStringBuilder.append("&");
            if (j % 2 != 0) {
              throw new ArithmeticException("divide by zero");
            }
          }
          else if (!((String)localObject).startsWith("?"))
          {
            j = onDeepLinking + 35;
            onAttributionFailure = j % 128;
            localStringBuilder.append("?");
            if (j % 2 != 0) {
              throw null;
            }
          }
          localStringBuilder.append((String)localObject);
        }
      }
    }
    onDeepLinking = (onAttributionFailure + 97) % 128;
    return paramString;
  }
  
  public static String AFInAppEventType(SimpleDateFormat paramSimpleDateFormat, long paramLong)
  {
    paramSimpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
    paramSimpleDateFormat = paramSimpleDateFormat.format(new Date(paramLong));
    onDeepLinking = (onAttributionFailure + 43) % 128;
    return paramSimpleDateFormat;
  }
  
  private void AFInAppEventType(Context paramContext)
  {
    onResponseErrorNative = new HashMap();
    AFa1uSDK.AFa1zSDK local2 = new AFa1uSDK.AFa1zSDK()
    {
      public final void AFKeystoreWrapper(String paramAnonymousString)
      {
        AFa1eSDK.values(AFa1eSDK.this).put("error", paramAnonymousString);
      }
      
      public final void valueOf(String paramAnonymousString1, String paramAnonymousString2, String paramAnonymousString3)
      {
        if (paramAnonymousString1 != null)
        {
          AFLogger.afInfoLog("Facebook Deferred AppLink data received: ".concat(paramAnonymousString1));
          AFa1eSDK.values(AFa1eSDK.this).put("link", paramAnonymousString1);
          if (paramAnonymousString2 != null) {
            AFa1eSDK.values(AFa1eSDK.this).put("target_url", paramAnonymousString2);
          }
          if (paramAnonymousString3 != null)
          {
            paramAnonymousString2 = new HashMap();
            paramAnonymousString1 = new HashMap();
            paramAnonymousString1.put("promo_code", paramAnonymousString3);
            paramAnonymousString2.put("deeplink_context", paramAnonymousString1);
            AFa1eSDK.values(AFa1eSDK.this).put("extras", paramAnonymousString2);
          }
        }
        else
        {
          AFa1eSDK.values(AFa1eSDK.this).put("link", "");
        }
        long l1 = System.currentTimeMillis();
        long l2 = AFKeystoreWrapper;
        AFa1eSDK.values(AFa1eSDK.this).put("ttr", String.valueOf(l1 - l2));
      }
    };
    try
    {
      Object localObject1 = B.a;
      B.class.getMethod("sdkInitialize", new Class[] { Context.class }).invoke(null, new Object[] { paramContext });
      int i = L1.a.a;
      localObject1 = L1.a.class.getMethod("fetchDeferredAppLinkData", new Class[] { Context.class, String.class, a.a.class });
      Object localObject2 = new com/appsflyer/internal/AFa1uSDK$3;
      ((AFa1uSDK.3)localObject2).<init>(L1.a.class, local2);
      Object localObject3 = Proxy.newProxyInstance(a.a.class.getClassLoader(), new Class[] { a.a.class }, (InvocationHandler)localObject2);
      localObject2 = paramContext.getString(paramContext.getResources().getIdentifier("facebook_app_id", "string", paramContext.getPackageName()));
      if ((TextUtils.isEmpty((CharSequence)localObject2) ^ true))
      {
        ((Method)localObject1).invoke(null, new Object[] { paramContext, localObject2, localObject3 });
        onDeepLinking = (onAttributionFailure + 3) % 128;
        return;
      }
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
      break label241;
    }
    catch (ClassNotFoundException localClassNotFoundException)
    {
      break label261;
    }
    catch (InvocationTargetException localInvocationTargetException)
    {
      break label268;
    }
    catch (NoSuchMethodException localNoSuchMethodException) {}
    onDeepLinking = (onAttributionFailure + 93) % 128;
    local2.AFKeystoreWrapper("Facebook app id not defined in resources");
    return;
    label241:
    paramContext = "FB illegal access";
    for (;;)
    {
      AFLogger.afErrorLogForExcManagerOnly(paramContext, localNoSuchMethodException);
      local2.AFKeystoreWrapper(localNoSuchMethodException.toString());
      return;
      label261:
      paramContext = "FB class missing error";
      continue;
      label268:
      paramContext = "FB invocation error";
      continue;
      paramContext = "FB method missing error";
    }
  }
  
  private void AFInAppEventType(Context paramContext, AFe1nSDK paramAFe1nSDK)
  {
    AFKeystoreWrapper(paramContext);
    AFe1mSDK localAFe1mSDK = AFInAppEventType().afDebugLog();
    paramContext = AFa1rSDK.AFInAppEventParameterName(paramContext);
    if (localAFe1mSDK.valueOf() == true)
    {
      onDeepLinking = (onAttributionFailure + 27) % 128;
      AFInAppEventParameterName.put("api_name", paramAFe1nSDK.toString());
      localAFe1mSDK.AFKeystoreWrapper(paramContext);
      onDeepLinking = (onAttributionFailure + 23) % 128;
    }
    localAFe1mSDK.values();
  }
  
  private void AFInAppEventType(Context paramContext, String paramString, Map<String, Object> paramMap)
  {
    AFe1iSDK localAFe1iSDK = new AFe1iSDK();
    afDebugLog = paramString;
    values = paramMap;
    if ((paramContext instanceof Activity))
    {
      onDeepLinking = (onAttributionFailure + 103) % 128;
      paramContext = (Activity)paramContext;
    }
    else
    {
      onAttributionFailure = (onDeepLinking + 125) % 128;
      paramContext = null;
    }
    values(localAFe1iSDK, paramContext);
    onAttributionFailure = (onDeepLinking + 9) % 128;
  }
  
  private void AFInAppEventType(AFa1qSDK paramAFa1qSDK)
  {
    onDeepLinking = (onAttributionFailure + 95) % 128;
    int i;
    if (afDebugLog == null) {
      i = 1;
    } else {
      i = 0;
    }
    if (AFKeystoreWrapper())
    {
      AFLogger.afInfoLog("CustomerUserId not set, reporting is disabled", true);
      return;
    }
    if (i != 0)
    {
      onDeepLinking = (onAttributionFailure + 23) % 128;
      if ((AppsFlyerProperties.getInstance().getBoolean("launchProtectEnabled", true) ^ true) != true)
      {
        if (afInfoLog())
        {
          i = onDeepLinking + 109;
          onAttributionFailure = i % 128;
          if (i % 2 == 0)
          {
            paramAFa1qSDK = AFInAppEventParameterName;
            if (paramAFa1qSDK != null) {
              paramAFa1qSDK.onError(10, "Event timeout. Check 'minTimeBetweenSessions' param");
            }
            return;
          }
          throw null;
        }
      }
      else {
        AFLogger.afInfoLog("Allowing multiple launches within a 5 second time window.");
      }
      afDebugLog = System.currentTimeMillis();
    }
    AFInAppEventParameterName(AFInAppEventType().valueOf(), new AFa1vSDK(paramAFa1qSDK, (byte)0), 0L, TimeUnit.MILLISECONDS);
    onDeepLinking = (onAttributionFailure + 59) % 128;
  }
  
  private void AFInAppEventType(@NonNull AFa1qSDK paramAFa1qSDK, Activity paramActivity)
  {
    onAttributionFailure = (onDeepLinking + 117) % 128;
    AFf1vSDK localAFf1vSDK = AFInAppEventType().onResponseErrorNative();
    valueOf = localAFf1vSDK.values(paramActivity);
    afInfoLog = localAFf1vSDK.valueOf(paramActivity);
    int i = onDeepLinking + 13;
    onAttributionFailure = i % 128;
    if (i % 2 == 0) {
      return;
    }
    throw null;
  }
  
  private static void AFInAppEventType(String paramString1, String paramString2)
  {
    int i = onDeepLinking + 43;
    onAttributionFailure = i % 128;
    if (i % 2 == 0)
    {
      AppsFlyerProperties.getInstance().set(paramString1, paramString2);
      return;
    }
    AppsFlyerProperties.getInstance().set(paramString1, paramString2);
    throw null;
  }
  
  private static void AFInAppEventType(String paramString, boolean paramBoolean)
  {
    int i = onDeepLinking + 39;
    onAttributionFailure = i % 128;
    if (i % 2 != 0)
    {
      AppsFlyerProperties.getInstance().set(paramString, paramBoolean);
      throw new ArithmeticException("divide by zero");
    }
    AppsFlyerProperties.getInstance().set(paramString, paramBoolean);
  }
  
  private int AFKeystoreWrapper(AFb1dSDK paramAFb1dSDK, String paramString, boolean paramBoolean)
  {
    int i = paramAFb1dSDK.values(paramString, 0);
    int j = i;
    if (paramBoolean)
    {
      j = onAttributionFailure + 15;
      onDeepLinking = j % 128;
      if (j % 2 == 0) {}
      for (j = i + 59;; j = i + 1)
      {
        paramAFb1dSDK.AFInAppEventType(paramString, j);
        break;
      }
    }
    if ((AFInAppEventType().afErrorLogForExcManagerOnly().afInfoLog() ^ true) != true)
    {
      i = onDeepLinking + 5;
      onAttributionFailure = i % 128;
      if (i % 2 == 0)
      {
        AFInAppEventType().afErrorLogForExcManagerOnly().AFInAppEventParameterName(String.valueOf(j));
      }
      else
      {
        AFInAppEventType().afErrorLogForExcManagerOnly().AFInAppEventParameterName(String.valueOf(j));
        throw null;
      }
    }
    return j;
  }
  
  private AFd1nSDK.AFa1xSDK AFKeystoreWrapper(final Map<String, String> paramMap)
  {
    paramMap = new AFd1nSDK.AFa1xSDK()
    {
      public final void AFKeystoreWrapper(String paramAnonymousString)
      {
        AFInAppEventType().AppsFlyer2dXConversionCallback().AFKeystoreWrapper(paramAnonymousString, DeepLinkResult.Error.NETWORK);
      }
      
      public final void values(Map<String, String> paramAnonymousMap)
      {
        Iterator localIterator = paramAnonymousMap.keySet().iterator();
        while (localIterator.hasNext())
        {
          String str = (String)localIterator.next();
          paramMap.put(str, (String)paramAnonymousMap.get(str));
        }
        AFInAppEventType().AppsFlyer2dXConversionCallback().AFInAppEventType(paramMap);
      }
    };
    int i = onDeepLinking + 25;
    onAttributionFailure = i % 128;
    if (i % 2 == 0) {
      return paramMap;
    }
    throw null;
  }
  
  private Runnable AFKeystoreWrapper(AFf1qSDK paramAFf1qSDK)
  {
    onDeepLinking = (onAttributionFailure + 81) % 128;
    paramAFf1qSDK = new e(this, paramAFf1qSDK);
    int i = onAttributionFailure + 13;
    onDeepLinking = i % 128;
    if (i % 2 != 0) {
      return paramAFf1qSDK;
    }
    throw null;
  }
  
  private void AFKeystoreWrapper(Context paramContext, String paramString)
  {
    AFa1qSDK localAFa1qSDK = new AFe1gSDK().AFInAppEventParameterName(AFInAppEventTypeAFInAppEventParameterNameAFInAppEventType.values("appsFlyerCount", 0));
    afErrorLog = paramString;
    if ((paramString != null) && (paramString.length() > 5) && (AFInAppEventParameterName(localAFa1qSDK, values(paramContext))))
    {
      AFInAppEventParameterName(AFInAppEventType().valueOf(), new AFa1vSDK(localAFa1qSDK, (byte)0), 5L, TimeUnit.MILLISECONDS);
      onDeepLinking = (onAttributionFailure + 63) % 128;
    }
    int i = onAttributionFailure + 61;
    onDeepLinking = i % 128;
    if (i % 2 == 0) {
      throw new ArithmeticException("divide by zero");
    }
  }
  
  private void AFKeystoreWrapper(Context paramContext, String paramString1, Map<String, Object> paramMap, String paramString2, String paramString3)
  {
    int i = onAttributionFailure;
    onDeepLinking = (i + 27) % 128;
    if (paramString1 != null)
    {
      i += 117;
      onDeepLinking = i % 128;
      if (i % 2 == 0)
      {
        paramString1.trim().isEmpty();
        throw new ArithmeticException("divide by zero");
      }
      if (!paramString1.trim().isEmpty())
      {
        localObject = new AFe1iSDK();
        break label92;
      }
    }
    Object localObject = new AFe1hSDK();
    label92:
    AFKeystoreWrapper(paramContext);
    afDebugLog = paramString1;
    values = paramMap;
    afErrorLog = paramString2;
    valueOf = paramString3;
    AFInAppEventType((AFa1qSDK)localObject);
  }
  
  private void AFKeystoreWrapper(Context paramContext, Map<String, Object> paramMap, AFa1qSDK paramAFa1qSDK)
  {
    int i = onAttributionFailure + 71;
    onDeepLinking = i % 128;
    AFKeystoreWrapper(paramContext);
    paramAFa1qSDK.values(paramMap);
    boolean bool = paramContext instanceof Activity;
    if (i % 2 == 0) {
      throw new ArithmeticException("divide by zero");
    }
    if (bool != true)
    {
      paramContext = null;
    }
    else
    {
      onDeepLinking = (onAttributionFailure + 77) % 128;
      paramContext = (Activity)paramContext;
    }
    values(paramAFa1qSDK, paramContext);
  }
  
  private void AFKeystoreWrapper(AppsFlyerConversionListener paramAppsFlyerConversionListener)
  {
    onAttributionFailure = (onDeepLinking + 99) % 128;
    if (paramAppsFlyerConversionListener == null) {
      return;
    }
    AFInAppEventParameterName = paramAppsFlyerConversionListener;
    onAttributionFailure = (onDeepLinking + 103) % 128;
  }
  
  private static void AFKeystoreWrapper(String paramString)
  {
    try
    {
      JSONObject localJSONObject = new org/json/JSONObject;
      localJSONObject.<init>(paramString);
      boolean bool = localJSONObject.has("pid");
      if (bool)
      {
        int i = onAttributionFailure + 21;
        onDeepLinking = i % 128;
        if (i % 2 == 0)
        {
          AFInAppEventType("preInstallName", paramString);
          try
          {
            throw new ArithmeticException("divide by zero");
          }
          finally {}
        }
      }
      label81:
      return;
    }
    catch (JSONException paramString)
    {
      break label81;
      AFInAppEventType("preInstallName", paramString);
      return;
      AFLogger.afWarnLog("Cannot set preinstall attribution data without a media source");
      return;
      AFLogger.afErrorLog("Error parsing JSON for preinstall", paramString);
    }
  }
  
  private long AFLogger(Context paramContext)
  {
    onDeepLinking = (onAttributionFailure + 115) % 128;
    paramContext = values(paramContext);
    long l1 = paramContext.valueOf("AppsFlyerTimePassedSincePrevLaunch", 0L);
    long l2 = System.currentTimeMillis();
    paramContext.AFInAppEventParameterName("AppsFlyerTimePassedSincePrevLaunch", l2);
    if (l1 > 0L)
    {
      int i = onAttributionFailure;
      j = i + 83;
      onDeepLinking = j % 128;
      if (j % 2 == 0) {
        l2 /= l1;
      } else {
        l2 -= l1;
      }
      l2 /= 1000L;
      j = i + 15;
      onDeepLinking = j % 128;
      if (j % 2 != 0) {
        return l2;
      }
      throw null;
    }
    int j = onDeepLinking + 65;
    onAttributionFailure = j % 128;
    if (j % 2 == 0) {
      return -1L;
    }
    throw null;
  }
  
  private boolean AFLogger()
  {
    int i = onAttributionFailure + 119;
    onDeepLinking = i % 128;
    if (i % 2 == 0)
    {
      bool = AFInAppEventType().AFInAppEventParameterName().AFKeystoreWrapper("AF_PREINSTALL_DISABLED");
      throw new ArithmeticException("divide by zero");
    }
    boolean bool = AFInAppEventType().AFInAppEventParameterName().AFKeystoreWrapper("AF_PREINSTALL_DISABLED");
    i = onAttributionFailure + 79;
    onDeepLinking = i % 128;
    if (i % 2 != 0) {
      return bool;
    }
    throw null;
  }
  
  private boolean AFLogger$LogLevel()
  {
    Map localMap = onResponseErrorNative;
    if (localMap != null)
    {
      onDeepLinking = (onAttributionFailure + 75) % 128;
      if (!localMap.isEmpty())
      {
        onAttributionFailure = (onDeepLinking + 5) % 128;
        return true;
      }
    }
    return false;
  }
  
  @NonNull
  private AFf1pSDK[] AFVersionDeclaration()
  {
    onDeepLinking = (onAttributionFailure + 73) % 128;
    AFf1pSDK[] arrayOfAFf1pSDK = AFInAppEventType().AFLogger$LogLevel().valueOf();
    onDeepLinking = (onAttributionFailure + 43) % 128;
    return arrayOfAFf1pSDK;
  }
  
  private void afDebugLog()
  {
    Object localObject = AFInAppEventType().AFLogger$LogLevel();
    AFf1qSDK localAFf1qSDK = afErrorLog();
    Runnable localRunnable = AFKeystoreWrapper(localAFf1qSDK);
    ((AFf1oSDK)localObject).AFKeystoreWrapper(localAFf1qSDK);
    ((AFf1oSDK)localObject).AFKeystoreWrapper(new AFf1jSDK(localRunnable));
    ((AFf1oSDK)localObject).AFKeystoreWrapper(new AFf1nSDK(localRunnable, AFInAppEventType()));
    ((AFf1oSDK)localObject).AFKeystoreWrapper(new AFf1mSDK(localRunnable, AFInAppEventType()));
    if (!AFLogger())
    {
      i = onAttributionFailure + 21;
      onDeepLinking = i % 128;
      if (i % 2 != 0)
      {
        ((AFf1oSDK)localObject).values(init, localRunnable, AFInAppEventType());
        onAttributionFailure = (onDeepLinking + 29) % 128;
      }
      else
      {
        ((AFf1oSDK)localObject).values(init, localRunnable, AFInAppEventType());
        throw null;
      }
    }
    localObject = ((AFf1oSDK)localObject).valueOf();
    int j = localObject.length;
    int i = 0;
    while (i < j)
    {
      int k = onDeepLinking + 1;
      onAttributionFailure = k % 128;
      if (k % 2 != 0)
      {
        localObject[i].valueOf(init);
        i += 12;
      }
      else
      {
        localObject[i].valueOf(init);
        i++;
      }
      onAttributionFailure = (onDeepLinking + 51) % 128;
    }
  }
  
  private AFf1qSDK afErrorLog()
  {
    AFf1qSDK localAFf1qSDK = new AFf1qSDK(new b(this), AFInAppEventType().AFInAppEventType());
    int i = onDeepLinking + 45;
    onAttributionFailure = i % 128;
    if (i % 2 == 0) {
      return localAFf1qSDK;
    }
    throw null;
  }
  
  private void afErrorLog(Context arg1)
  {
    int i;
    if (AFa1fSDK.valueOf())
    {
      AFLogger.afRDLog("OPPO device found");
      i = 23;
    }
    else
    {
      i = 18;
    }
    int j = Build.VERSION.SDK_INT;
    if ((j >= i) && (!valueOf("keyPropDisableAFKeystore", true)))
    {
      Object localObject1 = new StringBuilder("OS SDK is=");
      ((StringBuilder)localObject1).append(j);
      ((StringBuilder)localObject1).append("; use KeyStore");
      AFLogger.afRDLog(localObject1.toString());
      localObject1 = new AFKeystoreWrapper(???);
      if (!((AFKeystoreWrapper)localObject1).AFKeystoreWrapper())
      {
        AFKeystoreWrapper = AFb1zSDK.valueOf(AFInAppEventType().init(), AFInAppEventType().values());
        values = 0;
      }
      for (;;)
      {
        ((AFKeystoreWrapper)localObject1).AFKeystoreWrapper(((AFKeystoreWrapper)localObject1).AFInAppEventParameterName());
        break;
        String str = ((AFKeystoreWrapper)localObject1).AFInAppEventParameterName();
        synchronized (valueOf)
        {
          values += 1;
          AFLogger.afInfoLog("Deleting key with alias: ".concat(String.valueOf(str)));
        }
        try
        {
          synchronized (valueOf)
          {
            AFInAppEventType.deleteEntry(str);
          }
          localObject2 = finally;
        }
        catch (KeyStoreException localKeyStoreException)
        {
          ??? = new java/lang/StringBuilder;
          ((StringBuilder)???).<init>("Exception ");
          ((StringBuilder)???).append(localKeyStoreException.getMessage());
          ((StringBuilder)???).append(" occurred");
          AFLogger.afErrorLog(???.toString(), localKeyStoreException);
        }
      }
      AFInAppEventType("KSAppsFlyerId", ((AFKeystoreWrapper)localObject2).valueOf());
      AFInAppEventType("KSAppsFlyerRICounter", String.valueOf(((AFKeystoreWrapper)localObject2).AFInAppEventType()));
      return;
      throw ((Throwable)localObject2);
    }
    ??? = new StringBuilder("OS SDK is=");
    ???.append(j);
    ???.append("; no KeyStore usage");
    AFLogger.afRDLog(???.toString());
  }
  
  private static void afInfoLog(Context paramContext)
  {
    try
    {
      int i = getPackageManagergetPackageInfogetPackageName0applicationInfo.flags;
      if ((i & 0x8000) != 0)
      {
        i = onDeepLinking + 9;
        onAttributionFailure = i % 128;
        if (i % 2 != 0)
        {
          paramContext.getResources().getIdentifier("appsflyer_backup_rules", "xml", paramContext.getPackageName());
          try
          {
            throw new ArithmeticException("divide by zero");
          }
          finally {}
        }
      }
      label131:
      return;
    }
    catch (Exception paramContext)
    {
      break label131;
      if (paramContext.getResources().getIdentifier("appsflyer_backup_rules", "xml", paramContext.getPackageName()) != 0)
      {
        AFLogger.afInfoLog("appsflyer_backup_rules.xml detected, using AppsFlyer defined backup rules for AppsFlyer SDK data", true);
        onAttributionFailure = (onDeepLinking + 23) % 128;
        return;
      }
      AFLogger.AFKeystoreWrapper("'allowBackup' is set to true; appsflyer_backup_rules.xml not detected.\nAppsFlyer shared preferences should be excluded from auto backup by adding: <exclude domain=\"sharedpref\" path=\"appsflyer-data\"/> to the Application's <full-backup-content> rules");
      return;
      AFLogger.afErrorLogForExcManagerOnly("checkBackupRules Exception", paramContext);
      AFLogger.afRDLog("checkBackupRules Exception: ".concat(String.valueOf(paramContext)));
    }
  }
  
  private boolean afInfoLog()
  {
    onAttributionFailure = (onDeepLinking + 93) % 128;
    if (afDebugLog > 0L)
    {
      long l = System.currentTimeMillis() - afDebugLog;
      Locale localLocale = Locale.US;
      Object localObject = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss.SSS Z", localLocale);
      String str = AFInAppEventType((SimpleDateFormat)localObject, afDebugLog);
      localObject = AFInAppEventType((SimpleDateFormat)localObject, afWarnLog);
      if (l < AFVersionDeclaration)
      {
        onDeepLinking = (onAttributionFailure + 35) % 128;
        if (isStopped() != true)
        {
          onDeepLinking = (onAttributionFailure + 121) % 128;
          AFLogger.afInfoLog(String.format(localLocale, "Last Launch attempt: %s;\nLast successful Launch event: %s;\nThis launch is blocked: %s ms < %s ms", new Object[] { str, localObject, Long.valueOf(l), Long.valueOf(AFVersionDeclaration) }));
          return true;
        }
      }
      if (!isStopped()) {
        AFLogger.afInfoLog(String.format(localLocale, "Last Launch attempt: %s;\nLast successful Launch event: %s;\nSending launch (+%s ms)", new Object[] { str, localObject, Long.valueOf(l) }));
      }
    }
    else if (!isStopped())
    {
      i = onAttributionFailure + 11;
      onDeepLinking = i % 128;
      AFLogger.afInfoLog("Sending first launch for this session!");
      if (i % 2 == 0) {
        throw null;
      }
    }
    int i = onDeepLinking + 59;
    onAttributionFailure = i % 128;
    if (i % 2 == 0) {
      return false;
    }
    throw null;
  }
  
  private static String afRDLog()
  {
    int i = onAttributionFailure + 121;
    onDeepLinking = i % 128;
    if (i % 2 != 0) {
      return values("appid");
    }
    values("appid");
    throw null;
  }
  
  private void afWarnLog()
  {
    onAttributionFailure = (onDeepLinking + 21) % 128;
    if (AFd1lSDK.afInfoLog())
    {
      int i = onAttributionFailure + 83;
      onDeepLinking = i % 128;
      if (i % 2 != 0) {
        return;
      }
      throw null;
    }
    Object localObject = AFInAppEventType();
    AFc1bSDK localAFc1bSDK = ((AFc1xSDK)localObject).AFVersionDeclaration();
    localObject = new AFd1lSDK((AFc1xSDK)localObject);
    AFKeystoreWrapper.execute(new AFc1bSDK.4(localAFc1bSDK, (AFd1zSDK)localObject));
  }
  
  /* Error */
  public static SharedPreferences valueOf(Context paramContext)
  {
    // Byte code:
    //   0: ldc 2
    //   2: monitorenter
    //   3: getstatic 113	com/appsflyer/internal/AFa1eSDK:onDeepLinking	I
    //   6: bipush 119
    //   8: iadd
    //   9: sipush 128
    //   12: irem
    //   13: putstatic 115	com/appsflyer/internal/AFa1eSDK:onAttributionFailure	I
    //   16: invokestatic 1036	com/appsflyer/internal/AFa1eSDK:valueOf	()Lcom/appsflyer/internal/AFa1eSDK;
    //   19: getfield 1038	com/appsflyer/internal/AFa1eSDK:onConversionDataSuccess	Landroid/content/SharedPreferences;
    //   22: ifnonnull +55 -> 77
    //   25: getstatic 115	com/appsflyer/internal/AFa1eSDK:onAttributionFailure	I
    //   28: bipush 7
    //   30: iadd
    //   31: sipush 128
    //   34: irem
    //   35: putstatic 113	com/appsflyer/internal/AFa1eSDK:onDeepLinking	I
    //   38: invokestatic 1044	android/os/StrictMode:allowThreadDiskReads	()Landroid/os/StrictMode$ThreadPolicy;
    //   41: astore_1
    //   42: invokestatic 1036	com/appsflyer/internal/AFa1eSDK:valueOf	()Lcom/appsflyer/internal/AFa1eSDK;
    //   45: aload_0
    //   46: invokevirtual 1048	android/content/Context:getApplicationContext	()Landroid/content/Context;
    //   49: ldc_w 1050
    //   52: iconst_0
    //   53: invokevirtual 1054	android/content/Context:getSharedPreferences	(Ljava/lang/String;I)Landroid/content/SharedPreferences;
    //   56: putfield 1038	com/appsflyer/internal/AFa1eSDK:onConversionDataSuccess	Landroid/content/SharedPreferences;
    //   59: aload_1
    //   60: invokestatic 1058	android/os/StrictMode:setThreadPolicy	(Landroid/os/StrictMode$ThreadPolicy;)V
    //   63: goto +14 -> 77
    //   66: astore_0
    //   67: goto +22 -> 89
    //   70: astore_0
    //   71: aload_1
    //   72: invokestatic 1058	android/os/StrictMode:setThreadPolicy	(Landroid/os/StrictMode$ThreadPolicy;)V
    //   75: aload_0
    //   76: athrow
    //   77: invokestatic 1036	com/appsflyer/internal/AFa1eSDK:valueOf	()Lcom/appsflyer/internal/AFa1eSDK;
    //   80: getfield 1038	com/appsflyer/internal/AFa1eSDK:onConversionDataSuccess	Landroid/content/SharedPreferences;
    //   83: astore_0
    //   84: ldc 2
    //   86: monitorexit
    //   87: aload_0
    //   88: areturn
    //   89: ldc 2
    //   91: monitorexit
    //   92: aload_0
    //   93: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	94	0	paramContext	Context
    //   41	31	1	localThreadPolicy	android.os.StrictMode.ThreadPolicy
    // Exception table:
    //   from	to	target	type
    //   3	42	66	finally
    //   59	63	66	finally
    //   71	77	66	finally
    //   77	84	66	finally
    //   42	59	70	finally
  }
  
  public static AFa1eSDK valueOf()
  {
    int i = onDeepLinking + 33;
    int j = i % 128;
    onAttributionFailure = j;
    if (i % 2 != 0)
    {
      localAFa1eSDK = afRDLog;
      throw new ArithmeticException("divide by zero");
    }
    AFa1eSDK localAFa1eSDK = afRDLog;
    onDeepLinking = (j + 51) % 128;
    return localAFa1eSDK;
  }
  
  private static String valueOf(String paramString)
  {
    onDeepLinking = (onAttributionFailure + 117) % 128;
    int i = paramString.indexOf('?');
    if (i == -1)
    {
      i = onAttributionFailure + 45;
      onDeepLinking = i % 128;
      if (i % 2 != 0) {
        return "";
      }
      throw null;
    }
    paramString = paramString.substring(i);
    onDeepLinking = (onAttributionFailure + 93) % 128;
    return paramString;
  }
  
  private void valueOf(AFa1qSDK paramAFa1qSDK)
  {
    int i = onAttributionFailure + 45;
    onDeepLinking = i % 128;
    int j = 0;
    int k = 0;
    if (i % 2 == 0)
    {
      paramAFa1qSDK = AFInAppEventTypeinitAFInAppEventType;
      throw new ArithmeticException("divide by zero");
    }
    Object localObject1 = AFInAppEventTypeinitAFInAppEventType;
    Object localObject2 = localObject1;
    if (localObject1 == null)
    {
      AFLogger.afDebugLog("sendWithEvent - got null context. skipping event/launch.");
      return;
    }
    localObject1 = values((Context)localObject2);
    AppsFlyerProperties.getInstance().saveProperties((AFb1dSDK)localObject1);
    if (!AFInAppEventType().afWarnLog().AFKeystoreWrapper())
    {
      localObject3 = new StringBuilder("sendWithEvent from activity: ");
      ((StringBuilder)localObject3).append(localObject2.getClass().getName());
      AFLogger.afInfoLog(localObject3.toString());
    }
    boolean bool1 = paramAFa1qSDK.AFInAppEventParameterName();
    Object localObject3 = AFInAppEventParameterName(paramAFa1qSDK);
    localObject2 = (String)((Map)localObject3).get("appsflyerKey");
    if ((localObject2 != null) && (((String)localObject2).length() != 0))
    {
      if (!isStopped()) {
        AFLogger.afInfoLog("AppsFlyerLib.sendWithEvent");
      }
      i = valueOf((AFb1dSDK)localObject1, false);
      AFf1fSDK localAFf1fSDK = new AFf1fSDK(AFInAppEventType().AFInAppEventParameterName());
      Intrinsics.checkNotNullParameter(paramAFa1qSDK, "");
      boolean bool2 = paramAFa1qSDK.AFInAppEventParameterName();
      boolean bool3 = paramAFa1qSDK instanceof AFe1oSDK;
      boolean bool4 = paramAFa1qSDK instanceof AFe1kSDK;
      boolean bool5 = paramAFa1qSDK instanceof AFe1gSDK;
      int m;
      if ((!(paramAFa1qSDK instanceof AFe1lSDK)) && (!bool5)) {
        if (bool4)
        {
          localObject1 = AFf1fSDK.afErrorLogForExcManagerOnly;
          localObject2 = localObject1;
          if (localObject1 != null) {
            break label579;
          }
          localObject2 = AFInAppEventType;
          localObject1 = AFf1fSDK.valueOf;
        }
        else if (bool3)
        {
          localObject1 = AFf1fSDK.getLevel;
          localObject2 = localObject1;
          if (localObject1 != null) {
            break label579;
          }
          localObject2 = AFInAppEventType;
          localObject1 = AFf1fSDK.AFInAppEventParameterName;
        }
        else if (bool2)
        {
          if (i < 2)
          {
            onDeepLinking = (onAttributionFailure + 93) % 128;
            localObject1 = AFf1fSDK.AppsFlyer2dXConversionCallback;
            localObject2 = localObject1;
            if (localObject1 == null)
            {
              m = onAttributionFailure + 49;
              onDeepLinking = m % 128;
              if (m % 2 != 0)
              {
                localObject2 = AFInAppEventType;
                localObject1 = AFf1fSDK.afRDLog;
              }
              else
              {
                AFInAppEventType.valueOf(AFf1fSDK.afRDLog);
                throw null;
              }
            }
            else
            {
              break label579;
            }
          }
          else
          {
            localObject1 = AFf1fSDK.onAppOpenAttributionNative;
            localObject2 = localObject1;
            if (localObject1 != null) {
              break label579;
            }
            localObject2 = AFInAppEventType;
            localObject1 = AFf1fSDK.afErrorLog;
          }
        }
        else
        {
          localObject1 = AFf1fSDK.onInstallConversionDataLoadedNative;
          localObject2 = localObject1;
          if (localObject1 != null) {
            break label579;
          }
          localObject2 = AFInAppEventType;
        }
      }
      for (localObject1 = AFf1fSDK.AFLogger;; localObject1 = AFf1fSDK.AFKeystoreWrapper)
      {
        localObject2 = ((AFf1eSDK)localObject2).valueOf((String)localObject1);
        break;
        localObject1 = AFf1fSDK.afWarnLog;
        localObject2 = localObject1;
        if (localObject1 != null) {
          break;
        }
        m = onDeepLinking + 73;
        onAttributionFailure = m % 128;
        localObject2 = AFInAppEventType;
        if (m % 2 != 0)
        {
          paramAFa1qSDK = ((AFf1eSDK)localObject2).valueOf(AFf1fSDK.AFKeystoreWrapper);
          throw new ArithmeticException("divide by zero");
        }
      }
      label579:
      localObject1 = new StringBuilder();
      ((StringBuilder)localObject1).append((String)localObject2);
      ((StringBuilder)localObject1).append(values.valueOf.AFInAppEventType.getPackageName());
      localObject2 = localAFf1fSDK.AFInAppEventParameterName(AFf1fSDK.AFInAppEventParameterName(localObject1.toString(), bool3));
      AFInAppEventParameterName((Map)localObject3);
      paramAFa1qSDK = new AFa1ySDK(paramAFa1qSDK.AFKeystoreWrapper((String)localObject2).values((Map)localObject3).AFInAppEventParameterName(i), (byte)0);
      if (bool1)
      {
        onAttributionFailure = (onDeepLinking + 43) % 128;
        localObject3 = AFVersionDeclaration();
        i = localObject3.length;
        j = 0;
        while (k < i)
        {
          localObject1 = localObject3[k];
          if (afDebugLog == AFf1pSDK.AFa1zSDK.AFInAppEventType)
          {
            localObject2 = new StringBuilder("Failed to get ");
            ((StringBuilder)localObject2).append(AFKeystoreWrapper);
            ((StringBuilder)localObject2).append(" referrer, wait ...");
            AFLogger.afDebugLog(localObject2.toString());
            j = 1;
          }
          k++;
        }
        if (onDeepLinkingNative)
        {
          onAttributionFailure = (onDeepLinking + 27) % 128;
          if (!AFLogger$LogLevel())
          {
            AFLogger.afDebugLog("fetching Facebook deferred AppLink data, wait ...");
            j = 1;
          }
        }
        if (AFInAppEventType().afWarnLog().AFInAppEventType())
        {
          onDeepLinking = (onAttributionFailure + 123) % 128;
          j = 1;
        }
      }
      localObject2 = AFInAppEventType().valueOf();
      long l;
      if (j != 0) {
        l = 500L;
      } else {
        l = 0L;
      }
      AFInAppEventParameterName((ScheduledExecutorService)localObject2, paramAFa1qSDK, l, TimeUnit.MILLISECONDS);
      return;
    }
    AFLogger.afDebugLog("Not sending data yet, waiting for dev key");
    paramAFa1qSDK = AFInAppEventParameterName;
    if (paramAFa1qSDK != null) {
      paramAFa1qSDK.onError(41, "No dev key");
    }
  }
  
  private static void valueOf(JSONObject paramJSONObject)
  {
    ArrayList localArrayList = new ArrayList();
    Object localObject1 = paramJSONObject.keys();
    int i;
    Object localObject4;
    int j;
    for (;;)
    {
      boolean bool = ((Iterator)localObject1).hasNext();
      i = 0;
      if (!bool) {
        break;
      }
      String str1 = (String)((Iterator)localObject1).next();
      try
      {
        localObject4 = new org/json/JSONArray;
        ((JSONArray)localObject4).<init>((String)paramJSONObject.get(str1));
        for (;;)
        {
          j = ((JSONArray)localObject4).length();
          if (i >= j) {
            break;
          }
          j = onDeepLinking + 73;
          onAttributionFailure = j % 128;
          if (j % 2 == 0) {
            break label123;
          }
          localArrayList.add(Long.valueOf(((JSONArray)localObject4).getLong(i)));
          i += 107;
        }
      }
      catch (JSONException localJSONException2)
      {
        for (;;)
        {
          break;
          label123:
          localArrayList.add(Long.valueOf(((JSONArray)localObject4).getLong(i)));
          i++;
        }
        AFLogger.afErrorLogForExcManagerOnly("error at timeStampArr", localJSONException2);
      }
    }
    Collections.sort(localArrayList);
    Iterator localIterator = paramJSONObject.keys();
    label169:
    label511:
    label521:
    Object localObject2;
    for (localObject1 = null;; localObject2 = localObject4)
    {
      if ((!localIterator.hasNext()) || (localObject1 != null)) {
        break label534;
      }
      String str2 = (String)localIterator.next();
      localObject4 = localObject1;
      for (;;)
      {
        JSONArray localJSONArray;
        try
        {
          localJSONArray = new org/json/JSONArray;
          localObject4 = localObject1;
          localJSONArray.<init>((String)paramJSONObject.get(str2));
          i = 0;
          localObject3 = localObject1;
          localObject4 = localObject3;
          j = localJSONArray.length();
          localObject1 = localObject3;
          if (i >= j) {
            break label169;
          }
          j = onAttributionFailure + 13;
          onDeepLinking = j % 128;
          if (j % 2 == 0)
          {
            localObject4 = localObject3;
            if (localJSONArray.getLong(i) == ((Long)localArrayList.get(1)).longValue()) {
              break;
            }
          }
        }
        catch (JSONException localJSONException1)
        {
          break label521;
        }
        localObject4 = localObject3;
        long l1 = localJSONArray.getLong(i);
        localObject4 = localObject3;
        long l2 = ((Long)localArrayList.get(0)).longValue();
        if (l1 == l2) {
          break;
        }
        onAttributionFailure = (onDeepLinking + 61) % 128;
        localObject4 = localObject3;
        l2 = localJSONArray.getLong(i);
        localObject4 = localObject3;
        l1 = ((Long)localArrayList.get(1)).longValue();
        if (l2 == l1) {
          break;
        }
        j = onAttributionFailure + 61;
        onDeepLinking = j % 128;
        if (j % 2 == 0)
        {
          localObject4 = localObject3;
          if (localJSONArray.getLong(i) != ((Long)localArrayList.get(localArrayList.size() - 1)).longValue()) {
            break label511;
          }
          break;
        }
        localObject4 = localObject3;
        l2 = localJSONArray.getLong(i);
        localObject4 = localObject3;
        l1 = ((Long)localArrayList.get(localArrayList.size() - 1)).longValue();
        if (l2 == l1) {
          break;
        }
        i++;
        Object localObject3 = str2;
      }
      AFLogger.afErrorLogForExcManagerOnly("error at manageExtraReferrers", localJSONException1);
    }
    label534:
    if (localObject2 != null) {
      paramJSONObject.remove((String)localObject2);
    }
  }
  
  private static boolean valueOf(String paramString, boolean paramBoolean)
  {
    int i = onDeepLinking + 21;
    onAttributionFailure = i % 128;
    if (i % 2 == 0)
    {
      paramBoolean = AppsFlyerProperties.getInstance().getBoolean(paramString, paramBoolean);
      i = onAttributionFailure + 117;
      onDeepLinking = i % 128;
      if (i % 2 == 0) {
        throw new ArithmeticException("divide by zero");
      }
      return paramBoolean;
    }
    AppsFlyerProperties.getInstance().getBoolean(paramString, paramBoolean);
    throw null;
  }
  
  private int values(AFb1dSDK paramAFb1dSDK, boolean paramBoolean)
  {
    int i = onDeepLinking + 119;
    onAttributionFailure = i % 128;
    if (i % 2 == 0) {
      return AFKeystoreWrapper(paramAFb1dSDK, "appsFlyerInAppEventCount", paramBoolean);
    }
    AFKeystoreWrapper(paramAFb1dSDK, "appsFlyerInAppEventCount", paramBoolean);
    throw null;
  }
  
  private String values(Context paramContext, String paramString)
  {
    if (paramContext == null)
    {
      int i = onDeepLinking + 7;
      onAttributionFailure = i % 128;
      if (i % 2 == 0) {
        return null;
      }
      throw null;
    }
    AFKeystoreWrapper(paramContext);
    paramContext = AFInAppEventType().AFInAppEventParameterName().AFInAppEventType(paramString);
    onAttributionFailure = (onDeepLinking + 63) % 128;
    return paramContext;
  }
  
  private static String values(String paramString)
  {
    int i = onDeepLinking + 117;
    onAttributionFailure = i % 128;
    if (i % 2 == 0) {
      return AppsFlyerProperties.getInstance().getString(paramString);
    }
    AppsFlyerProperties.getInstance().getString(paramString);
    throw null;
  }
  
  /* Error */
  @Deprecated
  @NonNull
  public static String values(java.net.HttpURLConnection paramHttpURLConnection)
  {
    // Byte code:
    //   0: new 89	java/lang/StringBuilder
    //   3: dup
    //   4: invokespecial 92	java/lang/StringBuilder:<init>	()V
    //   7: astore_1
    //   8: aconst_null
    //   9: astore_2
    //   10: aload_0
    //   11: invokevirtual 1238	java/net/HttpURLConnection:getErrorStream	()Ljava/io/InputStream;
    //   14: astore_3
    //   15: aload_3
    //   16: astore 4
    //   18: aload_3
    //   19: ifnonnull +19 -> 38
    //   22: aload_0
    //   23: invokevirtual 1243	java/net/URLConnection:getInputStream	()Ljava/io/InputStream;
    //   26: astore 4
    //   28: goto +10 -> 38
    //   31: astore 4
    //   33: aconst_null
    //   34: astore_3
    //   35: goto +164 -> 199
    //   38: new 1245	java/io/InputStreamReader
    //   41: astore_3
    //   42: aload_3
    //   43: aload 4
    //   45: invokestatic 1251	java/nio/charset/Charset:defaultCharset	()Ljava/nio/charset/Charset;
    //   48: invokespecial 1254	java/io/InputStreamReader:<init>	(Ljava/io/InputStream;Ljava/nio/charset/Charset;)V
    //   51: new 1256	java/io/BufferedReader
    //   54: astore 5
    //   56: aload 5
    //   58: aload_3
    //   59: invokespecial 1259	java/io/BufferedReader:<init>	(Ljava/io/Reader;)V
    //   62: getstatic 115	com/appsflyer/internal/AFa1eSDK:onAttributionFailure	I
    //   65: bipush 99
    //   67: iadd
    //   68: sipush 128
    //   71: irem
    //   72: putstatic 113	com/appsflyer/internal/AFa1eSDK:onDeepLinking	I
    //   75: iconst_0
    //   76: istore 6
    //   78: aload 5
    //   80: invokevirtual 1262	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   83: astore_2
    //   84: aload_2
    //   85: ifnull +76 -> 161
    //   88: getstatic 115	com/appsflyer/internal/AFa1eSDK:onAttributionFailure	I
    //   91: bipush 111
    //   93: iadd
    //   94: istore 7
    //   96: iload 7
    //   98: sipush 128
    //   101: irem
    //   102: putstatic 113	com/appsflyer/internal/AFa1eSDK:onDeepLinking	I
    //   105: iload 7
    //   107: iconst_2
    //   108: irem
    //   109: ifeq +50 -> 159
    //   112: iload 6
    //   114: ifeq +21 -> 135
    //   117: bipush 10
    //   119: invokestatic 1267	java/lang/Character:valueOf	(C)Ljava/lang/Character;
    //   122: astore 4
    //   124: goto +16 -> 140
    //   127: astore 4
    //   129: aload 5
    //   131: astore_2
    //   132: goto +67 -> 199
    //   135: ldc_w 1064
    //   138: astore 4
    //   140: aload_1
    //   141: aload 4
    //   143: invokevirtual 1270	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   146: pop
    //   147: aload_1
    //   148: aload_2
    //   149: invokevirtual 96	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   152: pop
    //   153: iconst_1
    //   154: istore 6
    //   156: goto -78 -> 78
    //   159: aconst_null
    //   160: athrow
    //   161: aload 5
    //   163: invokevirtual 1275	java/io/Reader:close	()V
    //   166: aload_3
    //   167: invokevirtual 1275	java/io/Reader:close	()V
    //   170: getstatic 113	com/appsflyer/internal/AFa1eSDK:onDeepLinking	I
    //   173: bipush 97
    //   175: iadd
    //   176: sipush 128
    //   179: irem
    //   180: putstatic 115	com/appsflyer/internal/AFa1eSDK:onAttributionFailure	I
    //   183: goto +68 -> 251
    //   186: astore_0
    //   187: ldc_w 1277
    //   190: aload_0
    //   191: invokestatic 590	com/appsflyer/AFLogger:afErrorLogForExcManagerOnly	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   194: goto +57 -> 251
    //   197: astore 4
    //   199: new 89	java/lang/StringBuilder
    //   202: astore 5
    //   204: aload 5
    //   206: ldc_w 1279
    //   209: invokespecial 881	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   212: aload 5
    //   214: aload_0
    //   215: invokevirtual 1283	java/net/URLConnection:getURL	()Ljava/net/URL;
    //   218: invokevirtual 104	java/lang/Object:toString	()Ljava/lang/String;
    //   221: invokevirtual 96	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   224: pop
    //   225: aload 5
    //   227: invokevirtual 104	java/lang/Object:toString	()Ljava/lang/String;
    //   230: aload 4
    //   232: invokestatic 262	com/appsflyer/AFLogger:afErrorLog	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   235: aload_2
    //   236: ifnull +7 -> 243
    //   239: aload_2
    //   240: invokevirtual 1275	java/io/Reader:close	()V
    //   243: aload_3
    //   244: ifnull +7 -> 251
    //   247: aload_3
    //   248: invokevirtual 1275	java/io/Reader:close	()V
    //   251: aload_1
    //   252: invokevirtual 104	java/lang/Object:toString	()Ljava/lang/String;
    //   255: astore_0
    //   256: new 777	org/json/JSONObject
    //   259: dup
    //   260: aload_0
    //   261: invokespecial 778	org/json/JSONObject:<init>	(Ljava/lang/String;)V
    //   264: pop
    //   265: aload_0
    //   266: areturn
    //   267: astore 4
    //   269: ldc_w 1285
    //   272: aload 4
    //   274: invokestatic 590	com/appsflyer/AFLogger:afErrorLogForExcManagerOnly	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   277: new 777	org/json/JSONObject
    //   280: dup
    //   281: invokespecial 1286	org/json/JSONObject:<init>	()V
    //   284: astore 4
    //   286: aload 4
    //   288: ldc_w 1288
    //   291: aload_0
    //   292: invokevirtual 1291	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   295: pop
    //   296: aload 4
    //   298: invokevirtual 1292	org/json/JSONObject:toString	()Ljava/lang/String;
    //   301: astore_0
    //   302: aload_0
    //   303: areturn
    //   304: astore_0
    //   305: ldc_w 1294
    //   308: aload_0
    //   309: invokestatic 590	com/appsflyer/AFLogger:afErrorLogForExcManagerOnly	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   312: new 777	org/json/JSONObject
    //   315: dup
    //   316: invokespecial 1286	org/json/JSONObject:<init>	()V
    //   319: invokevirtual 1292	org/json/JSONObject:toString	()Ljava/lang/String;
    //   322: areturn
    //   323: astore_0
    //   324: aload_2
    //   325: ifnull +15 -> 340
    //   328: aload_2
    //   329: invokevirtual 1275	java/io/Reader:close	()V
    //   332: goto +8 -> 340
    //   335: astore 4
    //   337: goto +14 -> 351
    //   340: aload_3
    //   341: ifnull +18 -> 359
    //   344: aload_3
    //   345: invokevirtual 1275	java/io/Reader:close	()V
    //   348: goto +11 -> 359
    //   351: ldc_w 1277
    //   354: aload 4
    //   356: invokestatic 590	com/appsflyer/AFLogger:afErrorLogForExcManagerOnly	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   359: aload_0
    //   360: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	361	0	paramHttpURLConnection	java.net.HttpURLConnection
    //   7	245	1	localStringBuilder	StringBuilder
    //   9	320	2	localObject1	Object
    //   14	331	3	localObject2	Object
    //   16	11	4	localObject3	Object
    //   31	13	4	localInputStream	java.io.InputStream
    //   122	1	4	localCharacter	Character
    //   127	1	4	localObject4	Object
    //   138	4	4	str	String
    //   197	34	4	localThrowable1	Throwable
    //   267	6	4	localJSONException	JSONException
    //   284	13	4	localJSONObject	JSONObject
    //   335	20	4	localThrowable2	Throwable
    //   54	172	5	localObject5	Object
    //   76	79	6	i	int
    //   94	15	7	j	int
    // Exception table:
    //   from	to	target	type
    //   10	15	31	finally
    //   22	28	31	finally
    //   38	51	31	finally
    //   78	84	127	finally
    //   117	124	127	finally
    //   140	153	127	finally
    //   159	161	127	finally
    //   161	170	186	finally
    //   239	243	186	finally
    //   247	251	186	finally
    //   51	62	197	finally
    //   256	265	267	org/json/JSONException
    //   286	302	304	org/json/JSONException
    //   199	235	323	finally
    //   328	332	335	finally
    //   344	348	335	finally
  }
  
  public static Map<String, Object> values(Map<String, Object> paramMap)
  {
    onAttributionFailure = (onDeepLinking + 73) % 128;
    if (paramMap.containsKey("meta"))
    {
      int i = onDeepLinking + 13;
      onAttributionFailure = i % 128;
      paramMap = (Map)paramMap.get("meta");
      if (i % 2 != 0) {
        throw null;
      }
    }
    else
    {
      HashMap localHashMap = new HashMap();
      paramMap.put("meta", localHashMap);
      paramMap = localHashMap;
    }
    return paramMap;
  }
  
  public static void values()
  {
    onResponse = 139;
  }
  
  private static void values(int paramInt1, String paramString, int paramInt2, int paramInt3, boolean paramBoolean, Object[] paramArrayOfObject)
  {
    Object localObject1 = paramString;
    if (paramString != null) {
      localObject1 = paramString.toCharArray();
    }
    paramString = (char[])localObject1;
    synchronized (AFg1mSDK.AFKeystoreWrapper)
    {
      localObject1 = new char[paramInt3];
      AFg1mSDK.AFInAppEventParameterName = 0;
      int i = AFg1mSDK.AFInAppEventParameterName;
      if (i < paramInt3)
      {
        AFg1mSDK.values = paramString[i];
        localObject1[AFg1mSDK.AFInAppEventParameterName] = ((char)(char)(AFg1mSDK.values + paramInt2));
        i = AFg1mSDK.AFInAppEventParameterName;
        localObject1[i] = ((char)(char)(localObject1[i] - onResponse));
        AFg1mSDK.AFInAppEventParameterName = i + 1;
      }
    }
  }
  
  /* Error */
  public final Map<String, Object> AFInAppEventParameterName(AFa1qSDK paramAFa1qSDK)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual 170	com/appsflyer/internal/AFa1eSDK:AFInAppEventType	()Lcom/appsflyer/internal/AFc1xSDK;
    //   4: invokeinterface 894 1 0
    //   9: getfield 1073	com/appsflyer/internal/AFb1bSDK:AFInAppEventType	Landroid/content/Context;
    //   12: astore_2
    //   13: aload_0
    //   14: invokevirtual 170	com/appsflyer/internal/AFa1eSDK:AFInAppEventType	()Lcom/appsflyer/internal/AFc1xSDK;
    //   17: invokeinterface 319 1 0
    //   22: getfield 1356	com/appsflyer/internal/AFe1wSDK:AFInAppEventParameterName	Ljava/lang/String;
    //   25: astore_3
    //   26: aload_1
    //   27: getfield 631	com/appsflyer/internal/AFa1qSDK:afDebugLog	Ljava/lang/String;
    //   30: astore 4
    //   32: aload_1
    //   33: getfield 633	com/appsflyer/internal/AFa1qSDK:values	Ljava/util/Map;
    //   36: astore 5
    //   38: aload 5
    //   40: astore 6
    //   42: aload 5
    //   44: ifnonnull +12 -> 56
    //   47: new 500	java/util/HashMap
    //   50: dup
    //   51: invokespecial 501	java/util/HashMap:<init>	()V
    //   54: astore 6
    //   56: new 777	org/json/JSONObject
    //   59: dup
    //   60: aload 6
    //   62: invokespecial 1358	org/json/JSONObject:<init>	(Ljava/util/Map;)V
    //   65: invokevirtual 1292	org/json/JSONObject:toString	()Ljava/lang/String;
    //   68: astore 7
    //   70: aload_1
    //   71: getfield 753	com/appsflyer/internal/AFa1qSDK:afErrorLog	Ljava/lang/String;
    //   74: astore 8
    //   76: aload_0
    //   77: aload_2
    //   78: invokevirtual 690	com/appsflyer/internal/AFa1eSDK:values	(Landroid/content/Context;)Lcom/appsflyer/internal/AFb1dSDK;
    //   81: astore 5
    //   83: aload_1
    //   84: invokevirtual 1093	com/appsflyer/internal/AFa1qSDK:AFInAppEventParameterName	()Z
    //   87: istore 9
    //   89: aload_1
    //   90: getfield 1360	com/appsflyer/internal/AFa1qSDK:AFKeystoreWrapper	Ljava/util/Map;
    //   93: astore 10
    //   95: aload_2
    //   96: aload 10
    //   98: invokestatic 1365	com/appsflyer/internal/AFa1cSDK:values	(Landroid/content/Context;Ljava/util/Map;)Lcom/appsflyer/internal/AFc1uSDK$AFa1wSDK;
    //   101: pop
    //   102: getstatic 1368	com/appsflyer/internal/AFa1cSDK:valueOf	Ljava/lang/Boolean;
    //   105: astore 6
    //   107: aload 6
    //   109: ifnull +31 -> 140
    //   112: aload 6
    //   114: invokevirtual 1373	java/lang/Boolean:booleanValue	()Z
    //   117: ifne +23 -> 140
    //   120: aload 10
    //   122: invokestatic 1375	com/appsflyer/internal/AFa1eSDK:values	(Ljava/util/Map;)Ljava/util/Map;
    //   125: ldc_w 1377
    //   128: getstatic 1380	java/lang/Boolean:TRUE	Ljava/lang/Boolean;
    //   131: invokeinterface 619 3 0
    //   136: pop
    //   137: goto +3 -> 140
    //   140: new 482	java/util/Date
    //   143: dup
    //   144: invokespecial 1381	java/util/Date:<init>	()V
    //   147: invokevirtual 1384	java/util/Date:getTime	()J
    //   150: lstore 11
    //   152: invokestatic 1389	android/view/ViewConfiguration:getScrollBarFadeDuration	()I
    //   155: istore 13
    //   157: iconst_0
    //   158: invokestatic 1394	android/view/View$MeasureSpec:getSize	(I)I
    //   161: istore 14
    //   163: ldc_w 1064
    //   166: iconst_0
    //   167: invokestatic 1398	android/text/TextUtils:getOffsetAfter	(Ljava/lang/CharSequence;I)I
    //   170: istore 15
    //   172: iconst_1
    //   173: anewarray 100	java/lang/Object
    //   176: astore 6
    //   178: bipush 7
    //   180: iload 13
    //   182: bipush 16
    //   184: ishr
    //   185: isub
    //   186: ldc_w 1400
    //   189: iload 14
    //   191: sipush 245
    //   194: iadd
    //   195: iload 15
    //   197: bipush 12
    //   199: iadd
    //   200: iconst_0
    //   201: aload 6
    //   203: invokestatic 1402	com/appsflyer/internal/AFa1eSDK:values	(ILjava/lang/String;IIZ[Ljava/lang/Object;)V
    //   206: aload 10
    //   208: aload 6
    //   210: iconst_0
    //   211: aaload
    //   212: checkcast 231	java/lang/String
    //   215: invokevirtual 1405	java/lang/String:intern	()Ljava/lang/String;
    //   218: lload 11
    //   220: invokestatic 1408	java/lang/Long:toString	(J)Ljava/lang/String;
    //   223: invokeinterface 619 3 0
    //   228: pop
    //   229: aload_0
    //   230: invokevirtual 981	com/appsflyer/AppsFlyerLib:isStopped	()Z
    //   233: ifne +60 -> 293
    //   236: new 89	java/lang/StringBuilder
    //   239: astore 16
    //   241: aload 16
    //   243: ldc_w 1410
    //   246: invokespecial 881	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   249: iload 9
    //   251: ifeq +15 -> 266
    //   254: ldc_w 1412
    //   257: astore 6
    //   259: goto +11 -> 270
    //   262: astore_1
    //   263: goto +2850 -> 3113
    //   266: aload 4
    //   268: astore 6
    //   270: aload 16
    //   272: aload 6
    //   274: invokevirtual 96	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   277: pop
    //   278: aload 16
    //   280: invokevirtual 104	java/lang/Object:toString	()Ljava/lang/String;
    //   283: astore 6
    //   285: aload 6
    //   287: invokestatic 241	com/appsflyer/AFLogger:afInfoLog	(Ljava/lang/String;)V
    //   290: goto +11 -> 301
    //   293: ldc_w 1414
    //   296: astore 6
    //   298: goto -13 -> 285
    //   301: aload_0
    //   302: invokevirtual 170	com/appsflyer/internal/AFa1eSDK:AFInAppEventType	()Lcom/appsflyer/internal/AFc1xSDK;
    //   305: invokeinterface 1182 1 0
    //   310: invokeinterface 1416 1 0
    //   315: aload_2
    //   316: invokevirtual 365	android/content/Context:getPackageManager	()Landroid/content/pm/PackageManager;
    //   319: aload_2
    //   320: invokevirtual 566	android/content/Context:getPackageName	()Ljava/lang/String;
    //   323: sipush 4096
    //   326: invokevirtual 373	android/content/pm/PackageManager:getPackageInfo	(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
    //   329: getfield 1420	android/content/pm/PackageInfo:requestedPermissions	[Ljava/lang/String;
    //   332: invokestatic 433	java/util/Arrays:asList	([Ljava/lang/Object;)Ljava/util/List;
    //   335: astore 6
    //   337: aload 6
    //   339: ldc_w 1422
    //   342: invokeinterface 1424 2 0
    //   347: ifne +17 -> 364
    //   350: ldc_w 1426
    //   353: invokestatic 791	com/appsflyer/AFLogger:afWarnLog	(Ljava/lang/String;)V
    //   356: goto +8 -> 364
    //   359: astore 6
    //   361: goto +52 -> 413
    //   364: aload 6
    //   366: ldc_w 1428
    //   369: invokeinterface 1424 2 0
    //   374: ifne +9 -> 383
    //   377: ldc_w 1430
    //   380: invokestatic 791	com/appsflyer/AFLogger:afWarnLog	(Ljava/lang/String;)V
    //   383: getstatic 874	android/os/Build$VERSION:SDK_INT	I
    //   386: bipush 32
    //   388: if_icmple +33 -> 421
    //   391: aload 6
    //   393: ldc_w 1432
    //   396: invokeinterface 1424 2 0
    //   401: ifne +20 -> 421
    //   404: ldc_w 1434
    //   407: invokestatic 791	com/appsflyer/AFLogger:afWarnLog	(Ljava/lang/String;)V
    //   410: goto +11 -> 421
    //   413: ldc_w 1436
    //   416: aload 6
    //   418: invokestatic 262	com/appsflyer/AFLogger:afErrorLog	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   421: aload_0
    //   422: invokevirtual 170	com/appsflyer/internal/AFa1eSDK:AFInAppEventType	()Lcom/appsflyer/internal/AFc1xSDK;
    //   425: invokeinterface 1439 1 0
    //   430: astore 16
    //   432: aload 10
    //   434: ldc_w 1441
    //   437: ldc_w 1443
    //   440: invokeinterface 619 3 0
    //   445: pop
    //   446: invokestatic 1446	android/view/ViewConfiguration:getKeyRepeatDelay	()I
    //   449: istore 13
    //   451: iconst_0
    //   452: invokestatic 1451	android/widget/ExpandableListView:getPackedPositionForGroup	(I)J
    //   455: lstore 11
    //   457: ldc_w 1064
    //   460: bipush 48
    //   462: invokestatic 1455	android/text/TextUtils:lastIndexOf	(Ljava/lang/CharSequence;C)I
    //   465: istore 15
    //   467: iconst_1
    //   468: anewarray 100	java/lang/Object
    //   471: astore 6
    //   473: iload 13
    //   475: bipush 16
    //   477: ishr
    //   478: iconst_2
    //   479: iadd
    //   480: ldc_w 1457
    //   483: lload 11
    //   485: lconst_0
    //   486: lcmp
    //   487: sipush 242
    //   490: iadd
    //   491: iload 15
    //   493: bipush 6
    //   495: iadd
    //   496: iconst_0
    //   497: aload 6
    //   499: invokestatic 1402	com/appsflyer/internal/AFa1eSDK:values	(ILjava/lang/String;IIZ[Ljava/lang/Object;)V
    //   502: aload 10
    //   504: aload 6
    //   506: iconst_0
    //   507: aaload
    //   508: checkcast 231	java/lang/String
    //   511: invokevirtual 1405	java/lang/String:intern	()Ljava/lang/String;
    //   514: getstatic 1462	android/os/Build:BRAND	Ljava/lang/String;
    //   517: invokeinterface 619 3 0
    //   522: pop
    //   523: aload 10
    //   525: ldc_w 1464
    //   528: getstatic 1467	android/os/Build:DEVICE	Ljava/lang/String;
    //   531: invokeinterface 619 3 0
    //   536: pop
    //   537: aload 10
    //   539: ldc_w 1469
    //   542: getstatic 1472	android/os/Build:PRODUCT	Ljava/lang/String;
    //   545: invokeinterface 619 3 0
    //   550: pop
    //   551: aload 10
    //   553: ldc_w 1474
    //   556: getstatic 874	android/os/Build$VERSION:SDK_INT	I
    //   559: invokestatic 1478	java/lang/Integer:toString	(I)Ljava/lang/String;
    //   562: invokeinterface 619 3 0
    //   567: pop
    //   568: aload 10
    //   570: ldc_w 1480
    //   573: getstatic 1483	android/os/Build:MODEL	Ljava/lang/String;
    //   576: invokeinterface 619 3 0
    //   581: pop
    //   582: aload 10
    //   584: ldc_w 1485
    //   587: getstatic 1488	android/os/Build:TYPE	Ljava/lang/String;
    //   590: invokeinterface 619 3 0
    //   595: pop
    //   596: aload 16
    //   598: aload 10
    //   600: invokeinterface 1491 2 0
    //   605: invokestatic 287	com/appsflyer/AppsFlyerProperties:getInstance	()Lcom/appsflyer/AppsFlyerProperties;
    //   608: astore 17
    //   610: aload_0
    //   611: invokevirtual 170	com/appsflyer/internal/AFa1eSDK:AFInAppEventType	()Lcom/appsflyer/internal/AFc1xSDK;
    //   614: invokeinterface 602 1 0
    //   619: astore 6
    //   621: iload 9
    //   623: ifeq +418 -> 1041
    //   626: aload 16
    //   628: invokeinterface 1493 1 0
    //   633: ifeq +115 -> 748
    //   636: aload 17
    //   638: invokevirtual 1496	com/appsflyer/AppsFlyerProperties:isOtherSdkStringDisabled	()Z
    //   641: ifne +38 -> 679
    //   644: aload 10
    //   646: ldc_w 1498
    //   649: aload_0
    //   650: invokevirtual 170	com/appsflyer/internal/AFa1eSDK:AFInAppEventType	()Lcom/appsflyer/internal/AFc1xSDK;
    //   653: invokeinterface 1501 1 0
    //   658: aload_2
    //   659: invokeinterface 1506 2 0
    //   664: getfield 1511	com/appsflyer/internal/AFb1eSDK$AFa1ySDK:AFInAppEventParameterName	F
    //   667: invokestatic 1514	java/lang/String:valueOf	(F)Ljava/lang/String;
    //   670: invokeinterface 619 3 0
    //   675: pop
    //   676: goto +3 -> 679
    //   679: aload_0
    //   680: aload_2
    //   681: invokespecial 1516	com/appsflyer/internal/AFa1eSDK:afErrorLog	(Landroid/content/Context;)V
    //   684: aload_2
    //   685: ldc_w 1518
    //   688: invokevirtual 1522	android/content/Context:getSystemService	(Ljava/lang/Class;)Ljava/lang/Object;
    //   691: checkcast 1518	android/app/UiModeManager
    //   694: astore 18
    //   696: aload 18
    //   698: ifnull +26 -> 724
    //   701: aload 18
    //   703: invokevirtual 1525	android/app/UiModeManager:getCurrentModeType	()I
    //   706: iconst_4
    //   707: if_icmpne +17 -> 724
    //   710: aload 10
    //   712: ldc_w 1527
    //   715: getstatic 1380	java/lang/Boolean:TRUE	Ljava/lang/Boolean;
    //   718: invokeinterface 619 3 0
    //   723: pop
    //   724: aload_2
    //   725: invokestatic 1531	com/appsflyer/internal/AFe1qSDK:AFKeystoreWrapper	(Landroid/content/Context;)Z
    //   728: ifeq +20 -> 748
    //   731: aload 10
    //   733: ldc_w 1533
    //   736: getstatic 1380	java/lang/Boolean:TRUE	Ljava/lang/Boolean;
    //   739: invokeinterface 619 3 0
    //   744: pop
    //   745: goto +3 -> 748
    //   748: aload 10
    //   750: ldc_w 1535
    //   753: aload_0
    //   754: aload_2
    //   755: invokespecial 1537	com/appsflyer/internal/AFa1eSDK:AFLogger	(Landroid/content/Context;)J
    //   758: invokestatic 1408	java/lang/Long:toString	(J)Ljava/lang/String;
    //   761: invokeinterface 619 3 0
    //   766: pop
    //   767: aload 16
    //   769: aload 10
    //   771: invokeinterface 1539 2 0
    //   776: aload 16
    //   778: aload 10
    //   780: invokeinterface 1541 2 0
    //   785: aload_0
    //   786: getfield 1543	com/appsflyer/internal/AFa1eSDK:onAttributionFailureNative	Ljava/lang/String;
    //   789: astore 18
    //   791: aload 18
    //   793: ifnull +16 -> 809
    //   796: aload 10
    //   798: ldc_w 1545
    //   801: aload 18
    //   803: invokeinterface 619 3 0
    //   808: pop
    //   809: aload 8
    //   811: invokestatic 580	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   814: istore 19
    //   816: iload 19
    //   818: ifne +16 -> 834
    //   821: aload 10
    //   823: ldc_w 1547
    //   826: aload 8
    //   828: invokeinterface 619 3 0
    //   833: pop
    //   834: aload 5
    //   836: ldc_w 1549
    //   839: aconst_null
    //   840: invokeinterface 398 3 0
    //   845: astore 8
    //   847: aload 8
    //   849: ifnull +16 -> 865
    //   852: aload 10
    //   854: ldc_w 1549
    //   857: aload 8
    //   859: invokeinterface 619 3 0
    //   864: pop
    //   865: aload 17
    //   867: aload_0
    //   868: invokevirtual 170	com/appsflyer/internal/AFa1eSDK:AFInAppEventType	()Lcom/appsflyer/internal/AFc1xSDK;
    //   871: invokeinterface 897 1 0
    //   876: invokevirtual 1553	com/appsflyer/AppsFlyerProperties:getReferrer	(Lcom/appsflyer/internal/AFb1dSDK;)Ljava/lang/String;
    //   879: astore 8
    //   881: aload 8
    //   883: invokestatic 580	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   886: ifne +29 -> 915
    //   889: aload 10
    //   891: ldc_w 1547
    //   894: invokeinterface 303 2 0
    //   899: ifnonnull +16 -> 915
    //   902: aload 10
    //   904: ldc_w 1547
    //   907: aload 8
    //   909: invokeinterface 619 3 0
    //   914: pop
    //   915: aload 6
    //   917: getfield 1554	com/appsflyer/internal/AFe1mSDK:afWarnLog	J
    //   920: lstore 11
    //   922: lload 11
    //   924: lconst_0
    //   925: lcmp
    //   926: ifeq +19 -> 945
    //   929: aload 10
    //   931: ldc_w 1556
    //   934: lload 11
    //   936: invokestatic 988	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   939: invokeinterface 619 3 0
    //   944: pop
    //   945: aload_0
    //   946: getfield 1558	com/appsflyer/internal/AFa1eSDK:onResponseNative	Lcom/appsflyer/internal/AFb1lSDK;
    //   949: astore 8
    //   951: aload 8
    //   953: ifnull +99 -> 1052
    //   956: aload 8
    //   958: getfield 1561	com/appsflyer/internal/AFb1lSDK:values	Ljava/util/Map;
    //   961: invokeinterface 809 1 0
    //   966: istore 19
    //   968: iload 19
    //   970: ifne +19 -> 989
    //   973: aload 10
    //   975: ldc_w 1563
    //   978: aload 8
    //   980: getfield 1561	com/appsflyer/internal/AFb1lSDK:values	Ljava/util/Map;
    //   983: invokeinterface 619 3 0
    //   988: pop
    //   989: aload 8
    //   991: getfield 1564	com/appsflyer/internal/AFb1lSDK:AFInAppEventParameterName	Ljava/util/Map;
    //   994: invokeinterface 809 1 0
    //   999: ifne +53 -> 1052
    //   1002: aload 10
    //   1004: invokestatic 1375	com/appsflyer/internal/AFa1eSDK:values	(Ljava/util/Map;)Ljava/util/Map;
    //   1007: ldc_w 1563
    //   1010: aload 8
    //   1012: getfield 1564	com/appsflyer/internal/AFb1lSDK:AFInAppEventParameterName	Ljava/util/Map;
    //   1015: invokeinterface 619 3 0
    //   1020: pop
    //   1021: new 500	java/util/HashMap
    //   1024: astore 6
    //   1026: aload 6
    //   1028: invokespecial 501	java/util/HashMap:<init>	()V
    //   1031: aload 8
    //   1033: aload 6
    //   1035: putfield 1564	com/appsflyer/internal/AFb1lSDK:AFInAppEventParameterName	Ljava/util/Map;
    //   1038: goto +14 -> 1052
    //   1041: aload 16
    //   1043: aload 10
    //   1045: aload 4
    //   1047: invokeinterface 1567 3 0
    //   1052: ldc_w 927
    //   1055: invokestatic 200	com/appsflyer/internal/AFa1eSDK:values	(Ljava/lang/String;)Ljava/lang/String;
    //   1058: astore 8
    //   1060: ldc_w 931
    //   1063: invokestatic 200	com/appsflyer/internal/AFa1eSDK:values	(Ljava/lang/String;)Ljava/lang/String;
    //   1066: astore 6
    //   1068: aload 8
    //   1070: ifnull +42 -> 1112
    //   1073: aload 6
    //   1075: ifnull +37 -> 1112
    //   1078: aload 6
    //   1080: invokestatic 1571	java/lang/Integer:parseInt	(Ljava/lang/String;)I
    //   1083: ifle +29 -> 1112
    //   1086: aload 10
    //   1088: ldc_w 1573
    //   1091: aload 6
    //   1093: invokeinterface 619 3 0
    //   1098: pop
    //   1099: aload 10
    //   1101: ldc_w 1575
    //   1104: aload 8
    //   1106: invokeinterface 619 3 0
    //   1111: pop
    //   1112: ldc_w 1577
    //   1115: invokestatic 200	com/appsflyer/internal/AFa1eSDK:values	(Ljava/lang/String;)Ljava/lang/String;
    //   1118: astore 6
    //   1120: aload 6
    //   1122: ifnull +16 -> 1138
    //   1125: aload 10
    //   1127: ldc_w 1579
    //   1130: aload 6
    //   1132: invokeinterface 619 3 0
    //   1137: pop
    //   1138: aload 10
    //   1140: aload_0
    //   1141: getfield 167	com/appsflyer/internal/AFa1eSDK:onConversionDataFail	Lcom/appsflyer/internal/AFc1ySDK;
    //   1144: invokevirtual 1582	com/appsflyer/internal/AFc1ySDK:afInfoLog	()Lcom/appsflyer/internal/AFb1vSDK;
    //   1147: invokevirtual 1587	com/appsflyer/internal/AFb1vSDK:AFInAppEventParameterName	()Ljava/util/Map;
    //   1150: invokeinterface 1590 2 0
    //   1155: aload 17
    //   1157: ldc_w 1592
    //   1160: invokevirtual 1230	com/appsflyer/AppsFlyerProperties:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   1163: astore 6
    //   1165: aload 6
    //   1167: ifnull +24 -> 1191
    //   1170: aload 6
    //   1172: invokevirtual 418	java/lang/String:length	()I
    //   1175: ifle +16 -> 1191
    //   1178: aload 10
    //   1180: ldc_w 1592
    //   1183: aload 6
    //   1185: invokeinterface 619 3 0
    //   1190: pop
    //   1191: aload_0
    //   1192: invokevirtual 170	com/appsflyer/internal/AFa1eSDK:AFInAppEventType	()Lcom/appsflyer/internal/AFc1xSDK;
    //   1195: invokeinterface 693 1 0
    //   1200: invokevirtual 1594	com/appsflyer/internal/AFb1gSDK:values	()Ljava/lang/String;
    //   1203: astore 8
    //   1205: aload_0
    //   1206: aload_2
    //   1207: invokevirtual 690	com/appsflyer/internal/AFa1eSDK:values	(Landroid/content/Context;)Lcom/appsflyer/internal/AFb1dSDK;
    //   1210: aload 8
    //   1212: invokestatic 1596	com/appsflyer/internal/AFa1eSDK:AFInAppEventType	(Lcom/appsflyer/internal/AFb1dSDK;Ljava/lang/String;)Ljava/lang/String;
    //   1215: astore 6
    //   1217: aload 6
    //   1219: ifnull +13 -> 1232
    //   1222: aload 6
    //   1224: aload 8
    //   1226: invokevirtual 1339	java/lang/Object:equals	(Ljava/lang/Object;)Z
    //   1229: ifeq +13 -> 1242
    //   1232: aload 6
    //   1234: ifnonnull +21 -> 1255
    //   1237: aload 8
    //   1239: ifnull +16 -> 1255
    //   1242: aload 10
    //   1244: ldc_w 1598
    //   1247: aload 8
    //   1249: invokeinterface 619 3 0
    //   1254: pop
    //   1255: aload 16
    //   1257: invokeinterface 1600 1 0
    //   1262: astore 6
    //   1264: aload 6
    //   1266: ifnull +22 -> 1288
    //   1269: aload 10
    //   1271: ldc_w 1602
    //   1274: aload 6
    //   1276: invokestatic 1606	java/util/Locale:getDefault	()Ljava/util/Locale;
    //   1279: invokevirtual 1610	java/lang/String:toLowerCase	(Ljava/util/Locale;)Ljava/lang/String;
    //   1282: invokeinterface 619 3 0
    //   1287: pop
    //   1288: aload 16
    //   1290: invokeinterface 1612 1 0
    //   1295: astore 6
    //   1297: aload 6
    //   1299: ifnull +22 -> 1321
    //   1302: aload 10
    //   1304: ldc_w 1614
    //   1307: aload 6
    //   1309: invokestatic 1606	java/util/Locale:getDefault	()Ljava/util/Locale;
    //   1312: invokevirtual 1610	java/lang/String:toLowerCase	(Ljava/util/Locale;)Ljava/lang/String;
    //   1315: invokeinterface 619 3 0
    //   1320: pop
    //   1321: aload 16
    //   1323: invokeinterface 1616 1 0
    //   1328: astore 6
    //   1330: aload 6
    //   1332: ifnull +22 -> 1354
    //   1335: aload 10
    //   1337: ldc_w 1618
    //   1340: aload 6
    //   1342: invokestatic 1606	java/util/Locale:getDefault	()Ljava/util/Locale;
    //   1345: invokevirtual 1610	java/lang/String:toLowerCase	(Ljava/util/Locale;)Ljava/lang/String;
    //   1348: invokeinterface 619 3 0
    //   1353: pop
    //   1354: aload_3
    //   1355: ifnull +25 -> 1380
    //   1358: aload_3
    //   1359: invokevirtual 418	java/lang/String:length	()I
    //   1362: ifle +18 -> 1380
    //   1365: aload 10
    //   1367: ldc_w 1098
    //   1370: aload_3
    //   1371: invokeinterface 619 3 0
    //   1376: pop
    //   1377: goto +43 -> 1420
    //   1380: aload_0
    //   1381: invokevirtual 170	com/appsflyer/internal/AFa1eSDK:AFInAppEventType	()Lcom/appsflyer/internal/AFc1xSDK;
    //   1384: invokeinterface 319 1 0
    //   1389: getfield 1356	com/appsflyer/internal/AFe1wSDK:AFInAppEventParameterName	Ljava/lang/String;
    //   1392: astore 6
    //   1394: aload 6
    //   1396: ifnull +1703 -> 3099
    //   1399: aload 6
    //   1401: invokevirtual 418	java/lang/String:length	()I
    //   1404: ifle +1695 -> 3099
    //   1407: aload 10
    //   1409: ldc_w 1098
    //   1412: aload 6
    //   1414: invokeinterface 619 3 0
    //   1419: pop
    //   1420: invokestatic 1619	com/appsflyer/internal/AFa1eSDK:AFInAppEventParameterName	()Ljava/lang/String;
    //   1423: astore 6
    //   1425: aload 6
    //   1427: ifnull +16 -> 1443
    //   1430: aload 10
    //   1432: ldc_w 1621
    //   1435: aload 6
    //   1437: invokeinterface 619 3 0
    //   1442: pop
    //   1443: aload 17
    //   1445: ldc_w 1623
    //   1448: invokevirtual 1230	com/appsflyer/AppsFlyerProperties:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   1451: astore 6
    //   1453: aload 6
    //   1455: ifnull +16 -> 1471
    //   1458: aload 10
    //   1460: ldc_w 1625
    //   1463: aload 6
    //   1465: invokeinterface 619 3 0
    //   1470: pop
    //   1471: aload 4
    //   1473: ifnull +29 -> 1502
    //   1476: aload 10
    //   1478: ldc_w 1627
    //   1481: aload 4
    //   1483: invokeinterface 619 3 0
    //   1488: pop
    //   1489: aload 10
    //   1491: ldc_w 1629
    //   1494: aload 7
    //   1496: invokeinterface 619 3 0
    //   1501: pop
    //   1502: invokestatic 1631	com/appsflyer/internal/AFa1eSDK:afRDLog	()Ljava/lang/String;
    //   1505: ifnull +20 -> 1525
    //   1508: aload 10
    //   1510: ldc_w 997
    //   1513: ldc_w 997
    //   1516: invokestatic 200	com/appsflyer/internal/AFa1eSDK:values	(Ljava/lang/String;)Ljava/lang/String;
    //   1519: invokeinterface 619 3 0
    //   1524: pop
    //   1525: ldc_w 1633
    //   1528: invokestatic 200	com/appsflyer/internal/AFa1eSDK:values	(Ljava/lang/String;)Ljava/lang/String;
    //   1531: astore 6
    //   1533: aload 6
    //   1535: ifnull +63 -> 1598
    //   1538: aload 6
    //   1540: invokevirtual 418	java/lang/String:length	()I
    //   1543: iconst_3
    //   1544: if_icmpeq +41 -> 1585
    //   1547: new 89	java/lang/StringBuilder
    //   1550: astore 7
    //   1552: aload 7
    //   1554: ldc_w 1635
    //   1557: invokespecial 881	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   1560: aload 7
    //   1562: aload 6
    //   1564: invokevirtual 96	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1567: pop
    //   1568: aload 7
    //   1570: ldc_w 1637
    //   1573: invokevirtual 96	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1576: pop
    //   1577: aload 7
    //   1579: invokevirtual 104	java/lang/Object:toString	()Ljava/lang/String;
    //   1582: invokestatic 791	com/appsflyer/AFLogger:afWarnLog	(Ljava/lang/String;)V
    //   1585: aload 10
    //   1587: ldc_w 1639
    //   1590: aload 6
    //   1592: invokeinterface 619 3 0
    //   1597: pop
    //   1598: ldc_w 1641
    //   1601: invokestatic 200	com/appsflyer/internal/AFa1eSDK:values	(Ljava/lang/String;)Ljava/lang/String;
    //   1604: astore 6
    //   1606: aload 6
    //   1608: ifnull +16 -> 1624
    //   1611: aload 10
    //   1613: ldc_w 1643
    //   1616: aload 6
    //   1618: invokeinterface 619 3 0
    //   1623: pop
    //   1624: aload 10
    //   1626: ldc_w 1645
    //   1629: aload_0
    //   1630: aload_2
    //   1631: invokevirtual 1648	com/appsflyer/AppsFlyerLib:isPreInstalledApp	(Landroid/content/Context;)Z
    //   1634: invokestatic 1651	java/lang/Boolean:toString	(Z)Ljava/lang/String;
    //   1637: invokeinterface 619 3 0
    //   1642: pop
    //   1643: aload 17
    //   1645: ldc_w 1653
    //   1648: iconst_1
    //   1649: invokevirtual 293	com/appsflyer/AppsFlyerProperties:getBoolean	(Ljava/lang/String;Z)Z
    //   1652: istore 19
    //   1654: iload 19
    //   1656: ifeq +91 -> 1747
    //   1659: aload_2
    //   1660: invokevirtual 365	android/content/Context:getPackageManager	()Landroid/content/pm/PackageManager;
    //   1663: astore 6
    //   1665: aload 6
    //   1667: ldc_w 1655
    //   1670: iconst_0
    //   1671: invokevirtual 1659	android/content/pm/PackageManager:getApplicationInfo	(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;
    //   1674: pop
    //   1675: aload_0
    //   1676: aload_2
    //   1677: invokevirtual 1663	com/appsflyer/AppsFlyerLib:getAttributionId	(Landroid/content/Context;)Ljava/lang/String;
    //   1680: astore 6
    //   1682: goto +47 -> 1729
    //   1685: astore 6
    //   1687: goto +8 -> 1695
    //   1690: astore 6
    //   1692: goto +19 -> 1711
    //   1695: ldc_w 1665
    //   1698: aload 6
    //   1700: invokestatic 262	com/appsflyer/AFLogger:afErrorLog	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   1703: aconst_null
    //   1704: astore 6
    //   1706: goto +23 -> 1729
    //   1709: astore 6
    //   1711: ldc_w 1667
    //   1714: aload 6
    //   1716: iconst_1
    //   1717: invokestatic 1670	com/appsflyer/AFLogger:afErrorLogForExcManagerOnly	(Ljava/lang/String;Ljava/lang/Throwable;Z)V
    //   1720: ldc_w 1665
    //   1723: invokestatic 791	com/appsflyer/AFLogger:afWarnLog	(Ljava/lang/String;)V
    //   1726: goto -23 -> 1703
    //   1729: aload 6
    //   1731: ifnull +16 -> 1747
    //   1734: aload 10
    //   1736: ldc_w 1672
    //   1739: aload 6
    //   1741: invokeinterface 619 3 0
    //   1746: pop
    //   1747: aload 16
    //   1749: aload 10
    //   1751: aload_0
    //   1752: getfield 305	com/appsflyer/internal/AFa1eSDK:AFLogger	Ljava/lang/String;
    //   1755: invokeinterface 1674 3 0
    //   1760: aload_0
    //   1761: invokevirtual 170	com/appsflyer/internal/AFa1eSDK:AFInAppEventType	()Lcom/appsflyer/internal/AFc1xSDK;
    //   1764: invokeinterface 894 1 0
    //   1769: aload_0
    //   1770: invokevirtual 170	com/appsflyer/internal/AFa1eSDK:AFInAppEventType	()Lcom/appsflyer/internal/AFc1xSDK;
    //   1773: invokeinterface 897 1 0
    //   1778: invokestatic 902	com/appsflyer/internal/AFb1zSDK:valueOf	(Lcom/appsflyer/internal/AFb1bSDK;Lcom/appsflyer/internal/AFb1dSDK;)Ljava/lang/String;
    //   1781: astore 6
    //   1783: aload 6
    //   1785: ifnull +55 -> 1840
    //   1788: aload 10
    //   1790: ldc_w 1676
    //   1793: aload 6
    //   1795: invokeinterface 619 3 0
    //   1800: pop
    //   1801: goto +39 -> 1840
    //   1804: astore 6
    //   1806: new 89	java/lang/StringBuilder
    //   1809: astore 7
    //   1811: aload 7
    //   1813: ldc_w 1678
    //   1816: invokespecial 881	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   1819: aload 7
    //   1821: aload 6
    //   1823: invokevirtual 259	java/lang/Throwable:getMessage	()Ljava/lang/String;
    //   1826: invokevirtual 96	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1829: pop
    //   1830: aload 7
    //   1832: invokevirtual 104	java/lang/Object:toString	()Ljava/lang/String;
    //   1835: aload 6
    //   1837: invokestatic 262	com/appsflyer/AFLogger:afErrorLog	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   1840: aload 10
    //   1842: ldc_w 1680
    //   1845: invokestatic 1606	java/util/Locale:getDefault	()Ljava/util/Locale;
    //   1848: invokevirtual 1683	java/util/Locale:getDisplayLanguage	()Ljava/lang/String;
    //   1851: invokeinterface 619 3 0
    //   1856: pop
    //   1857: goto +13 -> 1870
    //   1860: astore 6
    //   1862: ldc_w 1685
    //   1865: aload 6
    //   1867: invokestatic 262	com/appsflyer/AFLogger:afErrorLog	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   1870: aload 10
    //   1872: ldc_w 1687
    //   1875: invokestatic 1606	java/util/Locale:getDefault	()Ljava/util/Locale;
    //   1878: invokevirtual 1690	java/util/Locale:getLanguage	()Ljava/lang/String;
    //   1881: invokeinterface 619 3 0
    //   1886: pop
    //   1887: goto +13 -> 1900
    //   1890: astore 6
    //   1892: ldc_w 1692
    //   1895: aload 6
    //   1897: invokestatic 262	com/appsflyer/AFLogger:afErrorLog	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   1900: aload 10
    //   1902: ldc_w 1694
    //   1905: invokestatic 1606	java/util/Locale:getDefault	()Ljava/util/Locale;
    //   1908: invokevirtual 1697	java/util/Locale:getCountry	()Ljava/lang/String;
    //   1911: invokeinterface 619 3 0
    //   1916: pop
    //   1917: goto +13 -> 1930
    //   1920: astore 6
    //   1922: ldc_w 1699
    //   1925: aload 6
    //   1927: invokestatic 262	com/appsflyer/AFLogger:afErrorLog	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   1930: aload 16
    //   1932: aload 10
    //   1934: iload 9
    //   1936: invokeinterface 1702 3 0
    //   1941: aload 16
    //   1943: aload 10
    //   1945: invokeinterface 1704 2 0
    //   1950: new 971	java/text/SimpleDateFormat
    //   1953: astore 6
    //   1955: aload 6
    //   1957: ldc_w 1706
    //   1960: getstatic 969	java/util/Locale:US	Ljava/util/Locale;
    //   1963: invokespecial 976	java/text/SimpleDateFormat:<init>	(Ljava/lang/String;Ljava/util/Locale;)V
    //   1966: aload 10
    //   1968: ldc_w 1708
    //   1971: aload 6
    //   1973: aload_2
    //   1974: invokevirtual 365	android/content/Context:getPackageManager	()Landroid/content/pm/PackageManager;
    //   1977: aload_2
    //   1978: invokevirtual 566	android/content/Context:getPackageName	()Ljava/lang/String;
    //   1981: iconst_0
    //   1982: invokevirtual 373	android/content/pm/PackageManager:getPackageInfo	(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
    //   1985: getfield 1711	android/content/pm/PackageInfo:firstInstallTime	J
    //   1988: invokestatic 978	com/appsflyer/internal/AFa1eSDK:AFInAppEventType	(Ljava/text/SimpleDateFormat;J)Ljava/lang/String;
    //   1991: invokeinterface 619 3 0
    //   1996: pop
    //   1997: goto +13 -> 2010
    //   2000: astore 7
    //   2002: ldc_w 1713
    //   2005: aload 7
    //   2007: invokestatic 262	com/appsflyer/AFLogger:afErrorLog	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   2010: aload_2
    //   2011: invokevirtual 365	android/content/Context:getPackageManager	()Landroid/content/pm/PackageManager;
    //   2014: astore_3
    //   2015: aload_2
    //   2016: invokevirtual 566	android/content/Context:getPackageName	()Ljava/lang/String;
    //   2019: astore 7
    //   2021: aload_3
    //   2022: aload 7
    //   2024: iconst_0
    //   2025: invokevirtual 373	android/content/pm/PackageManager:getPackageInfo	(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
    //   2028: astore 8
    //   2030: aload 5
    //   2032: ldc_w 1715
    //   2035: iconst_0
    //   2036: invokeinterface 703 3 0
    //   2041: istore 13
    //   2043: aload 8
    //   2045: getfield 1717	android/content/pm/PackageInfo:versionCode	I
    //   2048: iload 13
    //   2050: if_icmple +29 -> 2079
    //   2053: aload_0
    //   2054: aload_2
    //   2055: invokevirtual 690	com/appsflyer/internal/AFa1eSDK:values	(Landroid/content/Context;)Lcom/appsflyer/internal/AFb1dSDK;
    //   2058: ldc_w 1715
    //   2061: aload 8
    //   2063: getfield 1717	android/content/pm/PackageInfo:versionCode	I
    //   2066: invokeinterface 723 3 0
    //   2071: goto +8 -> 2079
    //   2074: astore 6
    //   2076: goto +318 -> 2394
    //   2079: aload_0
    //   2080: invokevirtual 170	com/appsflyer/internal/AFa1eSDK:AFInAppEventType	()Lcom/appsflyer/internal/AFc1xSDK;
    //   2083: invokeinterface 693 1 0
    //   2088: astore 7
    //   2090: aload 10
    //   2092: ldc_w 1719
    //   2095: aload 8
    //   2097: getfield 1717	android/content/pm/PackageInfo:versionCode	I
    //   2100: invokestatic 1478	java/lang/Integer:toString	(I)Ljava/lang/String;
    //   2103: invokeinterface 619 3 0
    //   2108: pop
    //   2109: aload 7
    //   2111: getfield 1147	com/appsflyer/internal/AFb1gSDK:valueOf	Lcom/appsflyer/internal/AFb1bSDK;
    //   2114: getfield 1073	com/appsflyer/internal/AFb1bSDK:AFInAppEventType	Landroid/content/Context;
    //   2117: astore_3
    //   2118: aload 10
    //   2120: ldc_w 1721
    //   2123: aload_3
    //   2124: aload_3
    //   2125: invokevirtual 566	android/content/Context:getPackageName	()Ljava/lang/String;
    //   2128: invokestatic 1723	com/appsflyer/internal/AFa1fSDK:AFKeystoreWrapper	(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;
    //   2131: invokeinterface 619 3 0
    //   2136: pop
    //   2137: aload 10
    //   2139: ldc_w 1725
    //   2142: aload 7
    //   2144: getfield 1147	com/appsflyer/internal/AFb1gSDK:valueOf	Lcom/appsflyer/internal/AFb1bSDK;
    //   2147: getfield 1073	com/appsflyer/internal/AFb1bSDK:AFInAppEventType	Landroid/content/Context;
    //   2150: invokevirtual 1728	android/content/Context:getApplicationInfo	()Landroid/content/pm/ApplicationInfo;
    //   2153: getfield 1731	android/content/pm/ApplicationInfo:targetSdkVersion	I
    //   2156: invokestatic 1734	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   2159: invokeinterface 619 3 0
    //   2164: pop
    //   2165: aload 8
    //   2167: getfield 1711	android/content/pm/PackageInfo:firstInstallTime	J
    //   2170: lstore 11
    //   2172: aload 8
    //   2174: getfield 1737	android/content/pm/PackageInfo:lastUpdateTime	J
    //   2177: lstore 20
    //   2179: new 971	java/text/SimpleDateFormat
    //   2182: astore 8
    //   2184: getstatic 969	java/util/Locale:US	Ljava/util/Locale;
    //   2187: astore 7
    //   2189: aload 8
    //   2191: ldc_w 1706
    //   2194: aload 7
    //   2196: invokespecial 976	java/text/SimpleDateFormat:<init>	(Ljava/lang/String;Ljava/util/Locale;)V
    //   2199: new 482	java/util/Date
    //   2202: astore_3
    //   2203: aload_3
    //   2204: lload 11
    //   2206: invokespecial 485	java/util/Date:<init>	(J)V
    //   2209: aload 10
    //   2211: ldc_w 1739
    //   2214: aload 8
    //   2216: aload_3
    //   2217: invokevirtual 489	java/text/DateFormat:format	(Ljava/util/Date;)Ljava/lang/String;
    //   2220: invokeinterface 619 3 0
    //   2225: pop
    //   2226: new 971	java/text/SimpleDateFormat
    //   2229: astore_3
    //   2230: aload_3
    //   2231: ldc_w 1706
    //   2234: aload 7
    //   2236: invokespecial 976	java/text/SimpleDateFormat:<init>	(Ljava/lang/String;Ljava/util/Locale;)V
    //   2239: new 482	java/util/Date
    //   2242: astore 7
    //   2244: aload 7
    //   2246: lload 20
    //   2248: invokespecial 485	java/util/Date:<init>	(J)V
    //   2251: aload 10
    //   2253: ldc_w 1741
    //   2256: aload_3
    //   2257: aload 7
    //   2259: invokevirtual 489	java/text/DateFormat:format	(Ljava/util/Date;)Ljava/lang/String;
    //   2262: invokeinterface 619 3 0
    //   2267: pop
    //   2268: aload 16
    //   2270: aload 6
    //   2272: invokeinterface 1744 2 0
    //   2277: astore 7
    //   2279: invokestatic 1749	android/os/Process:getElapsedCpuTime	()J
    //   2282: lstore 11
    //   2284: ldc_w 1064
    //   2287: invokestatic 1754	android/view/KeyEvent:keyCodeFromString	(Ljava/lang/String;)I
    //   2290: istore 15
    //   2292: ldc_w 1064
    //   2295: ldc_w 1064
    //   2298: iconst_0
    //   2299: invokestatic 1757	android/text/TextUtils:indexOf	(Ljava/lang/CharSequence;Ljava/lang/CharSequence;I)I
    //   2302: istore 13
    //   2304: iconst_1
    //   2305: anewarray 100	java/lang/Object
    //   2308: astore 6
    //   2310: lload 11
    //   2312: lconst_0
    //   2313: lcmp
    //   2314: iconst_3
    //   2315: iadd
    //   2316: ldc_w 1759
    //   2319: iload 15
    //   2321: sipush 241
    //   2324: iadd
    //   2325: bipush 15
    //   2327: iload 13
    //   2329: isub
    //   2330: iconst_1
    //   2331: aload 6
    //   2333: invokestatic 1402	com/appsflyer/internal/AFa1eSDK:values	(ILjava/lang/String;IIZ[Ljava/lang/Object;)V
    //   2336: aload 10
    //   2338: aload 6
    //   2340: iconst_0
    //   2341: aaload
    //   2342: checkcast 231	java/lang/String
    //   2345: invokevirtual 1405	java/lang/String:intern	()Ljava/lang/String;
    //   2348: aload 7
    //   2350: invokeinterface 619 3 0
    //   2355: pop
    //   2356: goto +47 -> 2403
    //   2359: astore 6
    //   2361: goto -285 -> 2076
    //   2364: astore 6
    //   2366: goto -290 -> 2076
    //   2369: astore 6
    //   2371: goto -295 -> 2076
    //   2374: astore 6
    //   2376: goto -300 -> 2076
    //   2379: astore 6
    //   2381: goto -5 -> 2376
    //   2384: astore 6
    //   2386: goto -310 -> 2076
    //   2389: astore 6
    //   2391: goto -315 -> 2076
    //   2394: ldc_w 1761
    //   2397: aload 6
    //   2399: iconst_1
    //   2400: invokestatic 1763	com/appsflyer/AFLogger:afErrorLog	(Ljava/lang/String;Ljava/lang/Throwable;Z)V
    //   2403: iconst_0
    //   2404: istore 22
    //   2406: aload_0
    //   2407: aload_2
    //   2408: invokestatic 1767	com/appsflyer/internal/AFe1ySDK:values	(Landroid/content/Context;)Z
    //   2411: putfield 1769	com/appsflyer/internal/AFa1eSDK:onInstallConversionFailureNative	Z
    //   2414: new 89	java/lang/StringBuilder
    //   2417: astore 6
    //   2419: aload 6
    //   2421: ldc_w 1771
    //   2424: invokespecial 881	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   2427: aload 6
    //   2429: aload_0
    //   2430: getfield 1769	com/appsflyer/internal/AFa1eSDK:onInstallConversionFailureNative	Z
    //   2433: invokevirtual 1774	java/lang/StringBuilder:append	(Z)Ljava/lang/StringBuilder;
    //   2436: pop
    //   2437: aload 6
    //   2439: invokevirtual 104	java/lang/Object:toString	()Ljava/lang/String;
    //   2442: invokestatic 1077	com/appsflyer/AFLogger:afDebugLog	(Ljava/lang/String;)V
    //   2445: aload_0
    //   2446: getfield 1769	com/appsflyer/internal/AFa1eSDK:onInstallConversionFailureNative	Z
    //   2449: ifne +17 -> 2466
    //   2452: aload 10
    //   2454: ldc_w 1776
    //   2457: getstatic 1779	java/lang/Boolean:FALSE	Ljava/lang/Boolean;
    //   2460: invokeinterface 619 3 0
    //   2465: pop
    //   2466: iload 9
    //   2468: ifeq +122 -> 2590
    //   2471: aload_0
    //   2472: getfield 1780	com/appsflyer/internal/AFa1eSDK:getLevel	Ljava/lang/String;
    //   2475: ifnull +22 -> 2497
    //   2478: aload 10
    //   2480: ldc_w 1782
    //   2483: invokeinterface 303 2 0
    //   2488: ifnull +12 -> 2500
    //   2491: ldc_w 1784
    //   2494: invokestatic 1077	com/appsflyer/AFLogger:afDebugLog	(Ljava/lang/String;)V
    //   2497: goto +48 -> 2545
    //   2500: new 777	org/json/JSONObject
    //   2503: astore 6
    //   2505: aload 6
    //   2507: aload_0
    //   2508: getfield 1780	com/appsflyer/internal/AFa1eSDK:getLevel	Ljava/lang/String;
    //   2511: invokespecial 778	org/json/JSONObject:<init>	(Ljava/lang/String;)V
    //   2514: aload 6
    //   2516: ldc_w 1786
    //   2519: ldc_w 1788
    //   2522: invokevirtual 1291	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   2525: pop
    //   2526: aload 10
    //   2528: ldc_w 1782
    //   2531: aload 6
    //   2533: invokevirtual 1292	org/json/JSONObject:toString	()Ljava/lang/String;
    //   2536: invokeinterface 619 3 0
    //   2541: pop
    //   2542: goto -45 -> 2497
    //   2545: aload_0
    //   2546: aconst_null
    //   2547: putfield 1780	com/appsflyer/internal/AFa1eSDK:getLevel	Ljava/lang/String;
    //   2550: aload 10
    //   2552: ldc_w 1790
    //   2555: aload_1
    //   2556: getfield 682	com/appsflyer/internal/AFa1qSDK:valueOf	Ljava/lang/String;
    //   2559: invokeinterface 619 3 0
    //   2564: pop
    //   2565: aload_1
    //   2566: getfield 686	com/appsflyer/internal/AFa1qSDK:afInfoLog	Ljava/lang/String;
    //   2569: invokestatic 1792	com/appsflyer/internal/AFb1uSDK:AFInAppEventType	(Ljava/lang/String;)Z
    //   2572: ifne +18 -> 2590
    //   2575: aload 10
    //   2577: ldc_w 1794
    //   2580: aload_1
    //   2581: getfield 686	com/appsflyer/internal/AFa1qSDK:afInfoLog	Ljava/lang/String;
    //   2584: invokeinterface 619 3 0
    //   2589: pop
    //   2590: iload 9
    //   2592: ifne +66 -> 2658
    //   2595: aload 10
    //   2597: aload_0
    //   2598: invokevirtual 170	com/appsflyer/internal/AFa1eSDK:AFInAppEventType	()Lcom/appsflyer/internal/AFc1xSDK;
    //   2601: invokeinterface 1797 1 0
    //   2606: invokeinterface 1801 1 0
    //   2611: invokeinterface 1590 2 0
    //   2616: goto +42 -> 2658
    //   2619: astore_1
    //   2620: ldc_w 1803
    //   2623: aload_1
    //   2624: invokestatic 590	com/appsflyer/AFLogger:afErrorLogForExcManagerOnly	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   2627: new 89	java/lang/StringBuilder
    //   2630: astore 6
    //   2632: aload 6
    //   2634: ldc_w 1805
    //   2637: invokespecial 881	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   2640: aload 6
    //   2642: aload_1
    //   2643: invokevirtual 259	java/lang/Throwable:getMessage	()Ljava/lang/String;
    //   2646: invokevirtual 96	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2649: pop
    //   2650: aload 6
    //   2652: invokevirtual 104	java/lang/Object:toString	()Ljava/lang/String;
    //   2655: invokestatic 869	com/appsflyer/AFLogger:afRDLog	(Ljava/lang/String;)V
    //   2658: ldc_w 297
    //   2661: invokestatic 200	com/appsflyer/internal/AFa1eSDK:values	(Ljava/lang/String;)Ljava/lang/String;
    //   2664: ifnonnull +44 -> 2708
    //   2667: aload_2
    //   2668: aload 10
    //   2670: invokestatic 1365	com/appsflyer/internal/AFa1cSDK:values	(Landroid/content/Context;Ljava/util/Map;)Lcom/appsflyer/internal/AFc1uSDK$AFa1wSDK;
    //   2673: pop
    //   2674: ldc_w 297
    //   2677: invokestatic 200	com/appsflyer/internal/AFa1eSDK:values	(Ljava/lang/String;)Ljava/lang/String;
    //   2680: ifnull +9 -> 2689
    //   2683: iconst_1
    //   2684: istore 19
    //   2686: goto +6 -> 2692
    //   2689: iconst_0
    //   2690: istore 19
    //   2692: aload 10
    //   2694: ldc_w 1807
    //   2697: iload 19
    //   2699: invokestatic 1809	java/lang/String:valueOf	(Z)Ljava/lang/String;
    //   2702: invokeinterface 619 3 0
    //   2707: pop
    //   2708: aload_2
    //   2709: invokevirtual 1813	android/content/Context:getContentResolver	()Landroid/content/ContentResolver;
    //   2712: invokestatic 1816	com/appsflyer/internal/AFa1cSDK:AFInAppEventParameterName	(Landroid/content/ContentResolver;)Lcom/appsflyer/internal/AFc1uSDK$AFa1wSDK;
    //   2715: astore_1
    //   2716: aload_1
    //   2717: ifnull +36 -> 2753
    //   2720: aload 10
    //   2722: ldc_w 1818
    //   2725: aload_1
    //   2726: getfield 1821	com/appsflyer/internal/AFc1uSDK$AFa1wSDK:valueOf	Ljava/lang/String;
    //   2729: invokeinterface 619 3 0
    //   2734: pop
    //   2735: aload 10
    //   2737: ldc_w 1823
    //   2740: aload_1
    //   2741: getfield 1825	com/appsflyer/internal/AFc1uSDK$AFa1wSDK:AFInAppEventType	Ljava/lang/Boolean;
    //   2744: invokestatic 234	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   2747: invokeinterface 619 3 0
    //   2752: pop
    //   2753: aload 10
    //   2755: ldc_w 1827
    //   2758: aload 5
    //   2760: invokestatic 1830	com/appsflyer/internal/AFe1ySDK:AFInAppEventType	(Lcom/appsflyer/internal/AFb1dSDK;)Z
    //   2763: invokestatic 1833	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   2766: invokeinterface 619 3 0
    //   2771: pop
    //   2772: aload_0
    //   2773: aload 5
    //   2775: iload 9
    //   2777: invokevirtual 379	com/appsflyer/internal/AFa1eSDK:valueOf	(Lcom/appsflyer/internal/AFb1dSDK;Z)I
    //   2780: istore 13
    //   2782: aload 10
    //   2784: ldc_w 1835
    //   2787: iload 13
    //   2789: invokestatic 1478	java/lang/Integer:toString	(I)Ljava/lang/String;
    //   2792: invokeinterface 619 3 0
    //   2797: pop
    //   2798: iload 22
    //   2800: istore 19
    //   2802: aload 4
    //   2804: ifnull +6 -> 2810
    //   2807: iconst_1
    //   2808: istore 19
    //   2810: aload 10
    //   2812: ldc_w 1837
    //   2815: aload_0
    //   2816: aload 5
    //   2818: iload 19
    //   2820: invokespecial 1839	com/appsflyer/internal/AFa1eSDK:values	(Lcom/appsflyer/internal/AFb1dSDK;Z)I
    //   2823: invokestatic 1478	java/lang/Integer:toString	(I)Ljava/lang/String;
    //   2826: invokeinterface 619 3 0
    //   2831: pop
    //   2832: iload 9
    //   2834: ifeq +15 -> 2849
    //   2837: iload 13
    //   2839: iconst_1
    //   2840: if_icmpne +9 -> 2849
    //   2843: aload 17
    //   2845: iconst_1
    //   2846: putfield 1841	com/appsflyer/AppsFlyerProperties:AFInAppEventParameterName	Z
    //   2849: aload 10
    //   2851: ldc_w 1843
    //   2854: aload 16
    //   2856: invokeinterface 1845 1 0
    //   2861: iconst_1
    //   2862: ixor
    //   2863: invokestatic 1651	java/lang/Boolean:toString	(Z)Ljava/lang/String;
    //   2866: invokeinterface 619 3 0
    //   2871: pop
    //   2872: aload 16
    //   2874: iload 9
    //   2876: aload 10
    //   2878: iload 13
    //   2880: invokeinterface 1848 4 0
    //   2885: aload 10
    //   2887: ldc_w 1850
    //   2890: aload 16
    //   2892: invokeinterface 1852 1 0
    //   2897: invokestatic 1833	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   2900: invokeinterface 619 3 0
    //   2905: pop
    //   2906: aload 5
    //   2908: ldc_w 1854
    //   2911: invokeinterface 1855 2 0
    //   2916: ifeq +27 -> 2943
    //   2919: aload 10
    //   2921: ldc_w 1857
    //   2924: aload 5
    //   2926: ldc_w 1854
    //   2929: invokeinterface 387 2 0
    //   2934: invokestatic 1809	java/lang/String:valueOf	(Z)Ljava/lang/String;
    //   2937: invokeinterface 619 3 0
    //   2942: pop
    //   2943: new 500	java/util/HashMap
    //   2946: astore_1
    //   2947: aload_1
    //   2948: invokespecial 501	java/util/HashMap:<init>	()V
    //   2951: aload_1
    //   2952: ldc_w 1859
    //   2955: aload_2
    //   2956: invokevirtual 559	android/content/Context:getResources	()Landroid/content/res/Resources;
    //   2959: invokevirtual 1863	android/content/res/Resources:getConfiguration	()Landroid/content/res/Configuration;
    //   2962: getfield 1867	android/content/res/Configuration:mcc	I
    //   2965: invokestatic 1734	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   2968: invokeinterface 619 3 0
    //   2973: pop
    //   2974: aload_1
    //   2975: ldc_w 1869
    //   2978: aload_2
    //   2979: invokevirtual 559	android/content/Context:getResources	()Landroid/content/res/Resources;
    //   2982: invokevirtual 1863	android/content/res/Resources:getConfiguration	()Landroid/content/res/Configuration;
    //   2985: getfield 1871	android/content/res/Configuration:mnc	I
    //   2988: invokestatic 1734	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   2991: invokeinterface 619 3 0
    //   2996: pop
    //   2997: aload 10
    //   2999: ldc_w 1873
    //   3002: aload_1
    //   3003: invokeinterface 619 3 0
    //   3008: pop
    //   3009: aload 10
    //   3011: ldc_w 1875
    //   3014: aload 16
    //   3016: invokeinterface 1877 1 0
    //   3021: invokeinterface 619 3 0
    //   3026: pop
    //   3027: aload 10
    //   3029: ldc_w 1879
    //   3032: aload 16
    //   3034: invokeinterface 1881 1 0
    //   3039: invokestatic 988	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   3042: invokeinterface 619 3 0
    //   3047: pop
    //   3048: aload 10
    //   3050: ldc_w 1883
    //   3053: aload 16
    //   3055: invokeinterface 1884 1 0
    //   3060: invokeinterface 619 3 0
    //   3065: pop
    //   3066: aload_0
    //   3067: getfield 1886	com/appsflyer/internal/AFa1eSDK:afInfoLog	Lcom/appsflyer/internal/AFa1cSDK;
    //   3070: astore_1
    //   3071: aload_1
    //   3072: ifnull +50 -> 3122
    //   3075: aload_1
    //   3076: getfield 1888	com/appsflyer/internal/AFa1cSDK:AFInAppEventType	[Ljava/lang/String;
    //   3079: astore_1
    //   3080: aload_1
    //   3081: ifnull +41 -> 3122
    //   3084: aload 10
    //   3086: ldc_w 1890
    //   3089: aload_1
    //   3090: invokeinterface 619 3 0
    //   3095: pop
    //   3096: goto +26 -> 3122
    //   3099: ldc_w 1892
    //   3102: invokestatic 241	com/appsflyer/AFLogger:afInfoLog	(Ljava/lang/String;)V
    //   3105: ldc_w 1894
    //   3108: invokestatic 241	com/appsflyer/AFLogger:afInfoLog	(Ljava/lang/String;)V
    //   3111: aconst_null
    //   3112: areturn
    //   3113: aload_1
    //   3114: invokevirtual 1897	java/lang/Throwable:getLocalizedMessage	()Ljava/lang/String;
    //   3117: aload_1
    //   3118: iconst_1
    //   3119: invokestatic 1763	com/appsflyer/AFLogger:afErrorLog	(Ljava/lang/String;Ljava/lang/Throwable;Z)V
    //   3122: aload 10
    //   3124: areturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	3125	0	this	AFa1eSDK
    //   0	3125	1	paramAFa1qSDK	AFa1qSDK
    //   12	2967	2	localContext	Context
    //   25	2232	3	localObject1	Object
    //   30	2773	4	str1	String
    //   36	2889	5	localObject2	Object
    //   40	298	6	localObject3	Object
    //   359	58	6	localException1	Exception
    //   471	1210	6	localObject4	Object
    //   1685	1	6	localObject5	Object
    //   1690	9	6	localNameNotFoundException1	PackageManager.NameNotFoundException
    //   1704	1	6	localObject6	Object
    //   1709	31	6	localNameNotFoundException2	PackageManager.NameNotFoundException
    //   1781	13	6	str2	String
    //   1804	32	6	localException2	Exception
    //   1860	6	6	localException3	Exception
    //   1890	6	6	localException4	Exception
    //   1920	6	6	localException5	Exception
    //   1953	19	6	localSimpleDateFormat1	SimpleDateFormat
    //   2074	197	6	localSimpleDateFormat2	SimpleDateFormat
    //   2308	31	6	arrayOfObject	Object[]
    //   2359	1	6	localObject7	Object
    //   2364	1	6	localObject8	Object
    //   2369	1	6	localObject9	Object
    //   2374	1	6	localObject10	Object
    //   2379	1	6	localObject11	Object
    //   2384	1	6	localObject12	Object
    //   2389	9	6	localThrowable	Throwable
    //   2417	234	6	localObject13	Object
    //   68	1763	7	localObject14	Object
    //   2000	6	7	localException6	Exception
    //   2019	330	7	localObject15	Object
    //   74	2141	8	localObject16	Object
    //   87	2788	9	bool1	boolean
    //   93	3030	10	localMap	Map
    //   150	2161	11	l1	long
    //   155	2724	13	i	int
    //   161	34	14	j	int
    //   170	2155	15	k	int
    //   239	2815	16	localObject17	Object
    //   608	2236	17	localAppsFlyerProperties	AppsFlyerProperties
    //   694	108	18	localObject18	Object
    //   814	2005	19	bool2	boolean
    //   2177	70	20	l2	long
    //   2404	395	22	bool3	boolean
    // Exception table:
    //   from	to	target	type
    //   229	249	262	finally
    //   270	285	262	finally
    //   285	290	262	finally
    //   301	315	262	finally
    //   315	356	262	finally
    //   364	383	262	finally
    //   383	410	262	finally
    //   413	421	262	finally
    //   421	621	262	finally
    //   626	676	262	finally
    //   679	696	262	finally
    //   701	724	262	finally
    //   724	745	262	finally
    //   748	791	262	finally
    //   796	809	262	finally
    //   809	816	262	finally
    //   821	834	262	finally
    //   834	847	262	finally
    //   852	865	262	finally
    //   865	915	262	finally
    //   915	922	262	finally
    //   929	945	262	finally
    //   945	951	262	finally
    //   956	968	262	finally
    //   973	989	262	finally
    //   989	1038	262	finally
    //   1041	1052	262	finally
    //   1052	1068	262	finally
    //   1078	1112	262	finally
    //   1112	1120	262	finally
    //   1125	1138	262	finally
    //   1138	1165	262	finally
    //   1170	1191	262	finally
    //   1191	1217	262	finally
    //   1222	1232	262	finally
    //   1242	1255	262	finally
    //   1255	1264	262	finally
    //   1269	1288	262	finally
    //   1288	1297	262	finally
    //   1302	1321	262	finally
    //   1321	1330	262	finally
    //   1335	1354	262	finally
    //   1358	1377	262	finally
    //   1380	1394	262	finally
    //   1399	1420	262	finally
    //   1420	1425	262	finally
    //   1430	1443	262	finally
    //   1443	1453	262	finally
    //   1458	1471	262	finally
    //   1476	1502	262	finally
    //   1502	1525	262	finally
    //   1525	1533	262	finally
    //   1538	1585	262	finally
    //   1585	1598	262	finally
    //   1598	1606	262	finally
    //   1611	1624	262	finally
    //   1624	1654	262	finally
    //   1695	1703	262	finally
    //   1711	1726	262	finally
    //   1734	1747	262	finally
    //   1747	1760	262	finally
    //   1760	1783	262	finally
    //   1788	1801	262	finally
    //   1806	1840	262	finally
    //   1840	1857	262	finally
    //   1862	1870	262	finally
    //   1870	1887	262	finally
    //   1892	1900	262	finally
    //   1900	1917	262	finally
    //   1922	1930	262	finally
    //   1930	1966	262	finally
    //   1966	1997	262	finally
    //   2002	2010	262	finally
    //   2394	2403	262	finally
    //   2406	2466	262	finally
    //   2471	2497	262	finally
    //   2500	2542	262	finally
    //   2545	2590	262	finally
    //   2595	2616	262	finally
    //   2620	2658	262	finally
    //   2658	2683	262	finally
    //   2692	2708	262	finally
    //   2708	2716	262	finally
    //   2720	2753	262	finally
    //   2753	2798	262	finally
    //   2810	2832	262	finally
    //   2843	2849	262	finally
    //   2849	2943	262	finally
    //   2943	3071	262	finally
    //   3075	3080	262	finally
    //   3084	3096	262	finally
    //   3099	3111	262	finally
    //   315	356	359	java/lang/Exception
    //   364	383	359	java/lang/Exception
    //   383	410	359	java/lang/Exception
    //   1659	1665	1685	finally
    //   1665	1682	1685	finally
    //   1665	1682	1690	android/content/pm/PackageManager$NameNotFoundException
    //   1659	1665	1709	android/content/pm/PackageManager$NameNotFoundException
    //   1760	1783	1804	java/lang/Exception
    //   1788	1801	1804	java/lang/Exception
    //   1840	1857	1860	java/lang/Exception
    //   1870	1887	1890	java/lang/Exception
    //   1900	1917	1920	java/lang/Exception
    //   1966	1997	2000	java/lang/Exception
    //   2010	2021	2074	finally
    //   2043	2071	2074	finally
    //   2079	2165	2074	finally
    //   2292	2304	2359	finally
    //   2336	2356	2359	finally
    //   2199	2292	2364	finally
    //   2304	2336	2364	finally
    //   2184	2199	2369	finally
    //   2179	2184	2374	finally
    //   2172	2179	2379	finally
    //   2165	2172	2384	finally
    //   2021	2043	2389	finally
    //   2595	2616	2619	java/lang/Exception
  }
  
  public final AFc1xSDK AFInAppEventType()
  {
    int i = onDeepLinking;
    AFc1ySDK localAFc1ySDK = onConversionDataFail;
    i += 5;
    onAttributionFailure = i % 128;
    if (i % 2 != 0) {
      throw new ArithmeticException("divide by zero");
    }
    return localAFc1ySDK;
  }
  
  public final void AFInAppEventType(Context paramContext, Intent paramIntent)
  {
    int i = onDeepLinking + 71;
    onAttributionFailure = i % 128;
    if (i % 2 == 0)
    {
      if (paramIntent.getStringExtra("appsflyer_preinstall") != null)
      {
        onDeepLinking = (onAttributionFailure + 23) % 128;
        AFKeystoreWrapper(paramIntent.getStringExtra("appsflyer_preinstall"));
        onAttributionFailure = (onDeepLinking + 59) % 128;
      }
      AFLogger.afInfoLog("****** onReceive called *******");
      AppsFlyerProperties.getInstance();
      String str = paramIntent.getStringExtra("referrer");
      AFLogger.afInfoLog("Play store referrer: ".concat(String.valueOf(str)));
      if (str != null)
      {
        values(paramContext).AFInAppEventParameterName("referrer", str);
        paramIntent = AppsFlyerProperties.getInstance();
        paramIntent.set("AF_REFERRER", str);
        AFKeystoreWrapper = str;
        if (AppsFlyerProperties.getInstance().AFInAppEventType())
        {
          AFLogger.afInfoLog("onReceive: isLaunchCalled");
          AFInAppEventType(paramContext, AFe1nSDK.AFInAppEventParameterName);
          AFKeystoreWrapper(paramContext, str);
        }
      }
      onAttributionFailure = (onDeepLinking + 29) % 128;
      return;
    }
    paramIntent.getStringExtra("appsflyer_preinstall");
    throw null;
  }
  
  /* Error */
  public final void AFInAppEventType(Context paramContext, String paramString)
  {
    // Byte code:
    //   0: ldc_w 1925
    //   3: aload_2
    //   4: invokestatic 234	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   7: invokevirtual 237	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   10: invokestatic 1077	com/appsflyer/AFLogger:afDebugLog	(Ljava/lang/String;)V
    //   13: invokestatic 509	java/lang/System:currentTimeMillis	()J
    //   16: lstore_3
    //   17: aload_0
    //   18: aload_1
    //   19: invokevirtual 690	com/appsflyer/internal/AFa1eSDK:values	(Landroid/content/Context;)Lcom/appsflyer/internal/AFb1dSDK;
    //   22: ldc_w 1549
    //   25: aconst_null
    //   26: invokeinterface 398 3 0
    //   31: astore 5
    //   33: aload 5
    //   35: ifnonnull +35 -> 70
    //   38: new 777	org/json/JSONObject
    //   41: astore 5
    //   43: aload 5
    //   45: invokespecial 1286	org/json/JSONObject:<init>	()V
    //   48: new 1191	org/json/JSONArray
    //   51: astore 6
    //   53: aload 6
    //   55: invokespecial 1926	org/json/JSONArray:<init>	()V
    //   58: goto +87 -> 145
    //   61: astore 5
    //   63: goto +180 -> 243
    //   66: astore_1
    //   67: goto +211 -> 278
    //   70: new 777	org/json/JSONObject
    //   73: astore 7
    //   75: aload 7
    //   77: aload 5
    //   79: invokespecial 778	org/json/JSONObject:<init>	(Ljava/lang/String;)V
    //   82: aload 7
    //   84: aload_2
    //   85: invokevirtual 783	org/json/JSONObject:has	(Ljava/lang/String;)Z
    //   88: ifeq +32 -> 120
    //   91: new 1191	org/json/JSONArray
    //   94: dup
    //   95: aload 7
    //   97: aload_2
    //   98: invokevirtual 1194	org/json/JSONObject:get	(Ljava/lang/String;)Ljava/lang/Object;
    //   101: checkcast 231	java/lang/String
    //   104: invokespecial 1195	org/json/JSONArray:<init>	(Ljava/lang/String;)V
    //   107: astore 5
    //   109: aload 5
    //   111: astore 6
    //   113: aload 7
    //   115: astore 5
    //   117: goto +28 -> 145
    //   120: new 1191	org/json/JSONArray
    //   123: dup
    //   124: invokespecial 1926	org/json/JSONArray:<init>	()V
    //   127: astore 5
    //   129: getstatic 113	com/appsflyer/internal/AFa1eSDK:onDeepLinking	I
    //   132: bipush 49
    //   134: iadd
    //   135: sipush 128
    //   138: irem
    //   139: putstatic 115	com/appsflyer/internal/AFa1eSDK:onAttributionFailure	I
    //   142: goto -33 -> 109
    //   145: aload 6
    //   147: invokevirtual 1196	org/json/JSONArray:length	()I
    //   150: i2l
    //   151: ldc2_w 132
    //   154: lcmp
    //   155: ifge +10 -> 165
    //   158: aload 6
    //   160: lload_3
    //   161: invokevirtual 1929	org/json/JSONArray:put	(J)Lorg/json/JSONArray;
    //   164: pop
    //   165: aload 5
    //   167: invokevirtual 1930	org/json/JSONObject:length	()I
    //   170: istore 8
    //   172: iload 8
    //   174: i2l
    //   175: ldc2_w 1931
    //   178: lcmp
    //   179: iflt +33 -> 212
    //   182: getstatic 115	com/appsflyer/internal/AFa1eSDK:onAttributionFailure	I
    //   185: bipush 53
    //   187: iadd
    //   188: sipush 128
    //   191: irem
    //   192: putstatic 113	com/appsflyer/internal/AFa1eSDK:onDeepLinking	I
    //   195: aload 5
    //   197: invokestatic 1934	com/appsflyer/internal/AFa1eSDK:valueOf	(Lorg/json/JSONObject;)V
    //   200: getstatic 113	com/appsflyer/internal/AFa1eSDK:onDeepLinking	I
    //   203: iconst_1
    //   204: iadd
    //   205: sipush 128
    //   208: irem
    //   209: putstatic 115	com/appsflyer/internal/AFa1eSDK:onAttributionFailure	I
    //   212: aload 5
    //   214: aload_2
    //   215: aload 6
    //   217: invokevirtual 1935	org/json/JSONArray:toString	()Ljava/lang/String;
    //   220: invokevirtual 1291	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   223: pop
    //   224: aload_0
    //   225: aload_1
    //   226: invokevirtual 690	com/appsflyer/internal/AFa1eSDK:values	(Landroid/content/Context;)Lcom/appsflyer/internal/AFb1dSDK;
    //   229: ldc_w 1549
    //   232: aload 5
    //   234: invokevirtual 1292	org/json/JSONObject:toString	()Ljava/lang/String;
    //   237: invokeinterface 401 3 0
    //   242: return
    //   243: new 89	java/lang/StringBuilder
    //   246: dup
    //   247: ldc_w 1937
    //   250: invokespecial 881	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   253: astore_1
    //   254: aload_1
    //   255: aload_2
    //   256: invokevirtual 96	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   259: pop
    //   260: aload_1
    //   261: ldc_w 1939
    //   264: invokevirtual 96	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   267: pop
    //   268: aload_1
    //   269: invokevirtual 104	java/lang/Object:toString	()Ljava/lang/String;
    //   272: aload 5
    //   274: invokestatic 262	com/appsflyer/AFLogger:afErrorLog	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   277: return
    //   278: ldc_w 1941
    //   281: aload_1
    //   282: invokestatic 590	com/appsflyer/AFLogger:afErrorLogForExcManagerOnly	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   285: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	286	0	this	AFa1eSDK
    //   0	286	1	paramContext	Context
    //   0	286	2	paramString	String
    //   16	145	3	l	long
    //   31	13	5	localObject1	Object
    //   61	17	5	str	String
    //   107	166	5	localObject2	Object
    //   51	165	6	localObject3	Object
    //   73	41	7	localJSONObject	JSONObject
    //   170	3	8	i	int
    // Exception table:
    //   from	to	target	type
    //   13	33	61	finally
    //   38	58	61	finally
    //   70	109	61	finally
    //   120	129	61	finally
    //   145	165	61	finally
    //   165	172	61	finally
    //   195	200	61	finally
    //   212	242	61	finally
    //   13	33	66	org/json/JSONException
    //   38	58	66	org/json/JSONException
    //   70	109	66	org/json/JSONException
    //   120	129	66	org/json/JSONException
    //   145	165	66	org/json/JSONException
    //   165	172	66	org/json/JSONException
    //   195	200	66	org/json/JSONException
    //   212	242	66	org/json/JSONException
  }
  
  public final void AFKeystoreWrapper(@NonNull Context paramContext)
  {
    int i = onAttributionFailure + 39;
    onDeepLinking = i % 128;
    if (i % 2 != 0)
    {
      Object localObject = onConversionDataFail;
      if (paramContext != null)
      {
        localObject = valueOf;
        if (paramContext != null)
        {
          AFInAppEventType = paramContext.getApplicationContext();
          onAttributionFailure = (onDeepLinking + 91) % 128;
        }
      }
      return;
    }
    throw null;
  }
  
  public final void AFKeystoreWrapper(WeakReference<Context> paramWeakReference)
  {
    onAttributionFailure = (onDeepLinking + 3) % 128;
    if (paramWeakReference.get() == null) {
      return;
    }
    AFLogger.afInfoLog("app went to background");
    AFb1dSDK localAFb1dSDK = values((Context)paramWeakReference.get());
    AppsFlyerProperties.getInstance().saveProperties(localAFb1dSDK);
    long l = AFInAppEventTypeafDebugLogafWarnLog;
    HashMap localHashMap = new HashMap();
    String str = AFInAppEventTypeafWarnLogAFInAppEventParameterName;
    if (str == null)
    {
      AFLogger.afWarnLog("[callStats] AppsFlyer's SDK cannot send any event without providing DevKey.");
      return;
    }
    Object localObject1 = values("KSAppsFlyerId");
    if (AppsFlyerProperties.getInstance().getBoolean("deviceTrackingDisabled", false))
    {
      localHashMap.put("deviceTrackingDisabled", "true");
      onAttributionFailure = (onDeepLinking + 57) % 128;
    }
    Object localObject2 = AFa1cSDK.AFInAppEventParameterName(((Context)paramWeakReference.get()).getContentResolver());
    if (localObject2 != null)
    {
      localHashMap.put("amazon_aid", valueOf);
      localHashMap.put("amazon_aid_limit", String.valueOf(AFInAppEventType));
    }
    localObject2 = AppsFlyerProperties.getInstance().getString("advertiserId");
    if (localObject2 != null)
    {
      localHashMap.put("advertiserId", localObject2);
      onDeepLinking = (onAttributionFailure + 105) % 128;
    }
    localHashMap.put("app_id", ((Context)paramWeakReference.get()).getPackageName());
    localHashMap.put("devkey", str);
    localHashMap.put("uid", AFb1zSDK.valueOf(AFInAppEventType().init(), AFInAppEventType().values()));
    localHashMap.put("time_in_app", String.valueOf(l));
    localHashMap.put("statType", "user_closed_app");
    localHashMap.put("platform", "Android");
    localHashMap.put("launch_counter", Integer.toString(valueOf(localAFb1dSDK, false)));
    localHashMap.put("channel", AFInAppEventType().AFInAppEventParameterName().values());
    if (localObject1 != null) {
      paramWeakReference = (WeakReference<Context>)localObject1;
    } else {
      paramWeakReference = "";
    }
    localHashMap.put("originalAppsflyerId", paramWeakReference);
    if (AppsFlyer2dXConversionCallback)
    {
      paramWeakReference = new AFe1bSDK();
      afErrorLogForExcManagerOnly = isStopped();
      localObject1 = new AFd1hSDK((AFe1bSDK)paramWeakReference.AFInAppEventParameterName(AFInAppEventTypeAFInAppEventParameterNameAFInAppEventType.values("appsFlyerCount", 0)).values(localHashMap).AFKeystoreWrapper(String.format(afErrorLog, new Object[] { AppsFlyerLib.getInstance().getHostPrefix(), valueOf().getHostName() })), AFInAppEventType());
      paramWeakReference = AFInAppEventType().AFVersionDeclaration();
      AFKeystoreWrapper.execute(new AFc1bSDK.4(paramWeakReference, (AFd1zSDK)localObject1));
      return;
    }
    AFLogger.afDebugLog("Stats call is disabled, ignore ...");
    int i = onDeepLinking + 99;
    onAttributionFailure = i % 128;
    if (i % 2 != 0) {
      throw new ArithmeticException("divide by zero");
    }
  }
  
  public final boolean AFKeystoreWrapper()
  {
    int i = onDeepLinking + 93;
    onAttributionFailure = i % 128;
    if (i % 2 != 0 ? valueOf("waitForCustomerId", false) : !(valueOf("waitForCustomerId", false) ^ true))
    {
      i = onAttributionFailure + 67;
      onDeepLinking = i % 128;
      if (i % 2 == 0)
      {
        AFInAppEventParameterName();
        throw new ArithmeticException("divide by zero");
      }
      if (AFInAppEventParameterName() == null) {
        return true;
      }
    }
    return false;
  }
  
  public final void addPushNotificationDeepLinkPath(String... paramVarArgs)
  {
    int i = onDeepLinking + 95;
    onAttributionFailure = i % 128;
    paramVarArgs = Arrays.asList(paramVarArgs);
    if (i % 2 == 0)
    {
      List localList = AFInAppEventTypeAppsFlyer2dXConversionCallbackAFInAppEventType;
      if (!localList.contains(paramVarArgs))
      {
        localList.add(paramVarArgs);
        onAttributionFailure = (onDeepLinking + 23) % 128;
      }
      return;
    }
    AFInAppEventTypeAppsFlyer2dXConversionCallbackAFInAppEventType.contains(paramVarArgs);
    throw null;
  }
  
  public final void anonymizeUser(boolean paramBoolean)
  {
    onAttributionFailure = (onDeepLinking + 99) % 128;
    AFInAppEventType().afErrorLogForExcManagerOnly().AFInAppEventParameterName("anonymizeUser", new String[] { String.valueOf(paramBoolean) });
    AppsFlyerProperties.getInstance().set("deviceTrackingDisabled", paramBoolean);
    int i = onDeepLinking + 5;
    onAttributionFailure = i % 128;
    if (i % 2 != 0) {
      throw new ArithmeticException("divide by zero");
    }
  }
  
  public final void appendParametersToDeepLinkingURL(String paramString, Map<String, String> paramMap)
  {
    int i = onDeepLinking + 1;
    onAttributionFailure = i % 128;
    if (i % 2 != 0)
    {
      localAFb1sSDK = AFInAppEventType().AppsFlyer2dXConversionCallback();
      AFKeystoreWrapper = paramString;
      values = paramMap;
      throw new ArithmeticException("divide by zero");
    }
    AFb1sSDK localAFb1sSDK = AFInAppEventType().AppsFlyer2dXConversionCallback();
    AFKeystoreWrapper = paramString;
    values = paramMap;
  }
  
  public final void enableFacebookDeferredApplinks(boolean paramBoolean)
  {
    int i = onAttributionFailure;
    onDeepLinkingNative = paramBoolean;
    onDeepLinking = (i + 33) % 128;
  }
  
  public final String getAppsFlyerUID(@NonNull Context paramContext)
  {
    int i = onAttributionFailure + 105;
    onDeepLinking = i % 128;
    if (i % 2 == 0)
    {
      AFInAppEventType().afErrorLogForExcManagerOnly().AFInAppEventParameterName("getAppsFlyerUID", new String[0]);
      if (paramContext != null) {
        break label99;
      }
    }
    else
    {
      AFInAppEventType().afErrorLogForExcManagerOnly().AFInAppEventParameterName("getAppsFlyerUID", new String[0]);
      if (paramContext != null) {
        break label99;
      }
    }
    i = onDeepLinking + 11;
    onAttributionFailure = i % 128;
    if (i % 2 == 0) {
      return null;
    }
    throw null;
    label99:
    AFKeystoreWrapper(paramContext);
    paramContext = AFInAppEventType().AFInAppEventParameterName();
    return AFb1zSDK.valueOf(valueOf, AFInAppEventType);
  }
  
  public final String getAttributionId(Context paramContext)
  {
    try
    {
      AFa1dSDK localAFa1dSDK = new com/appsflyer/internal/AFa1dSDK;
      localAFa1dSDK.<init>(paramContext, AFInAppEventType());
      paramContext = localAFa1dSDK.AFInAppEventType();
      onDeepLinking = (onAttributionFailure + 19) % 128;
      return paramContext;
    }
    finally
    {
      AFLogger.afErrorLog("Could not collect facebook attribution id. ", paramContext);
    }
    return null;
  }
  
  public final String getHostName()
  {
    onAttributionFailure = (onDeepLinking + 63) % 128;
    String str = AFInAppEventType().onInstallConversionFailureNative().AFInAppEventParameterName();
    int i = onAttributionFailure + 83;
    onDeepLinking = i % 128;
    if (i % 2 != 0) {
      return str;
    }
    throw null;
  }
  
  public final String getHostPrefix()
  {
    int i = onDeepLinking + 51;
    onAttributionFailure = i % 128;
    if (i % 2 != 0)
    {
      str = AFInAppEventType().onInstallConversionFailureNative().valueOf();
      throw new ArithmeticException("divide by zero");
    }
    String str = AFInAppEventType().onInstallConversionFailureNative().valueOf();
    i = onAttributionFailure + 119;
    onDeepLinking = i % 128;
    if (i % 2 != 0) {
      return str;
    }
    throw null;
  }
  
  public final String getOutOfStore(Context paramContext)
  {
    int i = onDeepLinking + 45;
    onAttributionFailure = i % 128;
    if (i % 2 != 0)
    {
      paramContext = AppsFlyerProperties.getInstance().getString("api_store_value");
      throw new ArithmeticException("divide by zero");
    }
    String str = AppsFlyerProperties.getInstance().getString("api_store_value");
    if (str != null)
    {
      onAttributionFailure = (onDeepLinking + 93) % 128;
      return str;
    }
    paramContext = values(paramContext, "AF_STORE");
    if (paramContext != null)
    {
      onDeepLinking = (onAttributionFailure + 55) % 128;
      return paramContext;
    }
    AFLogger.afInfoLog("No out-of-store value set");
    return null;
  }
  
  public final String getSdkVersion()
  {
    onAttributionFailure = (onDeepLinking + 91) % 128;
    Object localObject = AFInAppEventType();
    ((AFc1xSDK)localObject).afErrorLogForExcManagerOnly().AFInAppEventParameterName("getSdkVersion", new String[0]);
    ((AFc1xSDK)localObject).AFInAppEventParameterName();
    localObject = AFb1gSDK.valueOf();
    int i = onAttributionFailure + 1;
    onDeepLinking = i % 128;
    if (i % 2 == 0) {
      throw new ArithmeticException("divide by zero");
    }
    return (String)localObject;
  }
  
  public final AppsFlyerLib init(@NonNull String paramString, AppsFlyerConversionListener paramAppsFlyerConversionListener, @NonNull Context paramContext)
  {
    if (onAppOpenAttributionNative) {
      return this;
    }
    onAppOpenAttributionNative = true;
    AFInAppEventTypeafWarnLogAFInAppEventParameterName = paramString;
    AFa1aSDK.AFInAppEventType(paramString);
    if (paramContext != null)
    {
      init = ((Application)paramContext.getApplicationContext());
      AFKeystoreWrapper(paramContext);
      AFInAppEventTypeafDebugLogvalues = System.currentTimeMillis();
      AFInAppEventType().onConversionDataSuccess().values();
      paramContext = new c(this);
      AFInAppEventType().afRDLog().AFInAppEventParameterName(paramContext);
      afDebugLog();
      onConversionDataFail.afWarnLog().AFInAppEventParameterName();
      onDeepLinking = (onAttributionFailure + 85) % 128;
    }
    else
    {
      AFLogger.afWarnLog("context is null, Google Install Referrer will be not initialized");
    }
    AFb1tSDK localAFb1tSDK = AFInAppEventType().afErrorLogForExcManagerOnly();
    if (paramAppsFlyerConversionListener == null)
    {
      i = onDeepLinking + 47;
      onAttributionFailure = i % 128;
      if (i % 2 == 0) {
        paramContext = "null";
      } else {
        throw null;
      }
    }
    else
    {
      onDeepLinking = (onAttributionFailure + 69) % 128;
      paramContext = "conversionDataListener";
    }
    localAFb1tSDK.AFInAppEventParameterName("init", new String[] { paramString, paramContext });
    AFLogger.AFInAppEventType(String.format("Initializing AppsFlyer SDK: (v%s.%s)", new Object[] { "6.12.2", values }));
    AFInAppEventParameterName = paramAppsFlyerConversionListener;
    int i = onAttributionFailure + 125;
    onDeepLinking = i % 128;
    if (i % 2 == 0) {
      throw new ArithmeticException("divide by zero");
    }
    return this;
  }
  
  public final boolean isPreInstalledApp(Context paramContext)
  {
    onAttributionFailure = (onDeepLinking + 79) % 128;
    try
    {
      int i = getPackageManagergetApplicationInfogetPackageName0flags;
      if ((i & 0x1) != 0)
      {
        onAttributionFailure = (onDeepLinking + 1) % 128;
        return true;
      }
      onAttributionFailure = (onDeepLinking + 113) % 128;
    }
    catch (PackageManager.NameNotFoundException paramContext)
    {
      AFLogger.afErrorLog("Could not check if app is pre installed", paramContext);
    }
    return false;
  }
  
  @Deprecated
  public final boolean isStopped()
  {
    onAttributionFailure = (onDeepLinking + 49) % 128;
    boolean bool = AFInAppEventType().afWarnLog().AFKeystoreWrapper();
    onAttributionFailure = (onDeepLinking + 103) % 128;
    return bool;
  }
  
  public final void logEvent(Context paramContext, String paramString, Map<String, Object> paramMap)
  {
    int i = onDeepLinking + 15;
    onAttributionFailure = i % 128;
    logEvent(paramContext, paramString, paramMap, null);
    if (i % 2 != 0) {
      throw new ArithmeticException("divide by zero");
    }
    i = onDeepLinking + 103;
    onAttributionFailure = i % 128;
    if (i % 2 != 0) {
      throw new ArithmeticException("divide by zero");
    }
  }
  
  public final void logEvent(@NonNull Context paramContext, String paramString, Map<String, Object> paramMap, AppsFlyerRequestListener paramAppsFlyerRequestListener)
  {
    Object localObject1 = null;
    if (paramMap == null) {
      paramMap = null;
    } else {
      paramMap = new HashMap(paramMap);
    }
    AFKeystoreWrapper(paramContext);
    AFe1iSDK localAFe1iSDK = new AFe1iSDK();
    afDebugLog = paramString;
    AFInAppEventParameterName = paramAppsFlyerRequestListener;
    if ((paramMap != null) && (paramMap.containsKey("af_touch_obj")))
    {
      paramAppsFlyerRequestListener = new HashMap();
      localObject2 = paramMap.get("af_touch_obj");
      if ((localObject2 instanceof MotionEvent))
      {
        localObject2 = (MotionEvent)localObject2;
        HashMap localHashMap = new HashMap();
        localHashMap.put("x", Float.valueOf(((MotionEvent)localObject2).getX()));
        localHashMap.put("y", Float.valueOf(((MotionEvent)localObject2).getY()));
        paramAppsFlyerRequestListener.put("loc", localHashMap);
        paramAppsFlyerRequestListener.put("pf", Float.valueOf(((MotionEvent)localObject2).getPressure()));
        paramAppsFlyerRequestListener.put("rad", Float.valueOf(((MotionEvent)localObject2).getTouchMajor() / 2.0F));
      }
      else
      {
        paramAppsFlyerRequestListener.put("error", "Parsing failed due to invalid input in 'af_touch_obj'.");
        AFLogger.AFKeystoreWrapper("Parsing failed due to invalid input in 'af_touch_obj'.");
      }
      paramAppsFlyerRequestListener = Collections.singletonMap("tch_data", paramAppsFlyerRequestListener);
      paramMap.remove("af_touch_obj");
      localAFe1iSDK.values(paramAppsFlyerRequestListener);
    }
    values = paramMap;
    Object localObject2 = AFInAppEventType().afErrorLogForExcManagerOnly();
    paramAppsFlyerRequestListener = values;
    paramMap = paramAppsFlyerRequestListener;
    if (paramAppsFlyerRequestListener == null) {
      paramMap = new HashMap();
    }
    ((AFb1tSDK)localObject2).AFInAppEventParameterName("logEvent", new String[] { paramString, new JSONObject(paramMap).toString() });
    if (paramString == null) {
      AFInAppEventType(paramContext, AFe1nSDK.AFInAppEventType);
    }
    paramString = (String)localObject1;
    if ((paramContext instanceof Activity)) {
      paramString = (Activity)paramContext;
    }
    values(localAFe1iSDK, paramString);
  }
  
  public final void logLocation(Context paramContext, double paramDouble1, double paramDouble2)
  {
    AFInAppEventType().afErrorLogForExcManagerOnly().AFInAppEventParameterName("logLocation", new String[] { String.valueOf(paramDouble1), String.valueOf(paramDouble2) });
    HashMap localHashMap = new HashMap();
    localHashMap.put("af_long", Double.toString(paramDouble2));
    localHashMap.put("af_lat", Double.toString(paramDouble1));
    AFInAppEventType(paramContext, "af_location_coordinates", localHashMap);
    onAttributionFailure = (onDeepLinking + 115) % 128;
  }
  
  public final void logSession(Context paramContext)
  {
    onDeepLinking = (onAttributionFailure + 41) % 128;
    AFInAppEventType().afErrorLogForExcManagerOnly().AFInAppEventParameterName("logSession", new String[0]);
    AFInAppEventType().afErrorLogForExcManagerOnly().AFInAppEventParameterName();
    AFInAppEventType(paramContext, AFe1nSDK.values);
    AFInAppEventType(paramContext, null, null);
    int i = onDeepLinking + 47;
    onAttributionFailure = i % 128;
    if (i % 2 == 0) {
      return;
    }
    throw null;
  }
  
  public final void onPause(Context paramContext)
  {
    onDeepLinking = (onAttributionFailure + 5) % 128;
    AFInAppEventType().onResponseNative().AFInAppEventType(paramContext);
    onAttributionFailure = (onDeepLinking + 43) % 128;
  }
  
  @Deprecated
  public final void performOnAppAttribution(@NonNull Context paramContext, @NonNull URI paramURI)
  {
    int i = onDeepLinking + 121;
    onAttributionFailure = i % 128;
    if (i % 2 != 0) {
      throw new ArithmeticException("divide by zero");
    }
    if ((paramURI != null) && (!paramURI.toString().isEmpty()))
    {
      if (paramContext == null)
      {
        paramURI = AFInAppEventType().AppsFlyer2dXConversionCallback();
        localObject = new StringBuilder("Context is \"");
        ((StringBuilder)localObject).append(paramContext);
        ((StringBuilder)localObject).append("\"");
        paramURI.AFKeystoreWrapper(localObject.toString(), DeepLinkResult.Error.NETWORK);
        return;
      }
      AFInAppEventType().AppsFlyer2dXConversionCallback().valueOf(paramContext, new HashMap(), Uri.parse(paramURI.toString()));
      onDeepLinking = (onAttributionFailure + 119) % 128;
      return;
    }
    Object localObject = AFInAppEventType().AppsFlyer2dXConversionCallback();
    paramContext = new StringBuilder("Link is \"");
    paramContext.append(paramURI);
    paramContext.append("\"");
    ((AFb1sSDK)localObject).AFKeystoreWrapper(paramContext.toString(), DeepLinkResult.Error.NETWORK);
  }
  
  public final void performOnDeepLinking(@NonNull Intent paramIntent, @NonNull Context paramContext)
  {
    if (paramIntent == null)
    {
      AFInAppEventType().AppsFlyer2dXConversionCallback().AFKeystoreWrapper("performOnDeepLinking was called with null intent", DeepLinkResult.Error.DEVELOPER_ERROR);
      return;
    }
    if (paramContext == null)
    {
      int i = onAttributionFailure + 125;
      onDeepLinking = i % 128;
      if (i % 2 != 0)
      {
        AFInAppEventType().AppsFlyer2dXConversionCallback().AFKeystoreWrapper("performOnDeepLinking was called with null context", DeepLinkResult.Error.DEVELOPER_ERROR);
        onDeepLinking = (onAttributionFailure + 113) % 128;
        return;
      }
      AFInAppEventType().AppsFlyer2dXConversionCallback().AFKeystoreWrapper("performOnDeepLinking was called with null context", DeepLinkResult.Error.DEVELOPER_ERROR);
      throw null;
    }
    paramContext = paramContext.getApplicationContext();
    AFKeystoreWrapper(paramContext);
    AFInAppEventType().AFInAppEventType().execute(new d(this, paramContext, paramIntent));
  }
  
  public final void registerConversionListener(Context paramContext, AppsFlyerConversionListener paramAppsFlyerConversionListener)
  {
    onDeepLinking = (onAttributionFailure + 59) % 128;
    AFInAppEventType().afErrorLogForExcManagerOnly().AFInAppEventParameterName("registerConversionListener", new String[0]);
    AFKeystoreWrapper(paramAppsFlyerConversionListener);
    int i = onAttributionFailure + 93;
    onDeepLinking = i % 128;
    if (i % 2 != 0) {
      return;
    }
    throw null;
  }
  
  public final void registerValidatorListener(Context paramContext, AppsFlyerInAppPurchaseValidatorListener paramAppsFlyerInAppPurchaseValidatorListener)
  {
    AFInAppEventType().afErrorLogForExcManagerOnly().AFInAppEventParameterName("registerValidatorListener", new String[0]);
    AFLogger.afDebugLog("registerValidatorListener called");
    if (paramAppsFlyerInAppPurchaseValidatorListener == null)
    {
      onDeepLinking = (onAttributionFailure + 113) % 128;
      AFLogger.afDebugLog("registerValidatorListener null listener");
      int i = onDeepLinking + 3;
      onAttributionFailure = i % 128;
      if (i % 2 == 0) {
        return;
      }
      throw null;
    }
    valueOf = paramAppsFlyerInAppPurchaseValidatorListener;
  }
  
  public final void sendAdImpression(Context paramContext, Map<String, Object> paramMap)
  {
    int i = AFInAppEventType(values(paramContext));
    HashMap localHashMap = new HashMap();
    localHashMap.put("ad_network", paramMap);
    localHashMap.put("adimpression_counter", Integer.valueOf(i));
    AFKeystoreWrapper(paramContext, localHashMap, new AFe1kSDK());
    onAttributionFailure = (onDeepLinking + 17) % 128;
  }
  
  public final void sendAdRevenue(Context paramContext, Map<String, Object> paramMap)
  {
    int i = AFInAppEventParameterName(values(paramContext));
    HashMap localHashMap = new HashMap();
    localHashMap.put("ad_network", paramMap);
    localHashMap.put("adrevenue_counter", Integer.valueOf(i));
    AFKeystoreWrapper(paramContext, localHashMap, new AFe1oSDK());
    i = onDeepLinking + 59;
    onAttributionFailure = i % 128;
    if (i % 2 == 0) {
      return;
    }
    throw null;
  }
  
  public final void sendInAppPurchaseData(Context paramContext, Map<String, Object> paramMap, PurchaseHandler.PurchaseValidationCallback paramPurchaseValidationCallback)
  {
    onDeepLinking = (onAttributionFailure + 59) % 128;
    AFKeystoreWrapper(paramContext);
    paramContext = AFInAppEventType().afErrorLog();
    if (paramContext.AFInAppEventParameterName(paramMap, paramPurchaseValidationCallback, new String[] { "purchases" }))
    {
      paramMap = new AFd1qSDK(paramMap, paramPurchaseValidationCallback, values);
      paramContext = valueOf;
      AFKeystoreWrapper.execute(new AFc1bSDK.4(paramContext, paramMap));
    }
    int i = onDeepLinking + 25;
    onAttributionFailure = i % 128;
    if (i % 2 == 0) {
      return;
    }
    throw null;
  }
  
  public final void sendPurchaseData(Context paramContext, Map<String, Object> paramMap, PurchaseHandler.PurchaseValidationCallback paramPurchaseValidationCallback)
  {
    onAttributionFailure = (onDeepLinking + 63) % 128;
    AFKeystoreWrapper(paramContext);
    paramContext = AFInAppEventType().afErrorLog();
    if (paramContext.AFInAppEventParameterName(paramMap, paramPurchaseValidationCallback, new String[] { "subscriptions" }))
    {
      paramMap = new AFd1wSDK(paramMap, paramPurchaseValidationCallback, values);
      paramContext = valueOf;
      AFKeystoreWrapper.execute(new AFc1bSDK.4(paramContext, paramMap));
    }
    onAttributionFailure = (onDeepLinking + 35) % 128;
  }
  
  /* Error */
  public final void sendPushNotificationData(Activity paramActivity)
  {
    // Byte code:
    //   0: getstatic 115	com/appsflyer/internal/AFa1eSDK:onAttributionFailure	I
    //   3: bipush 85
    //   5: iadd
    //   6: istore_2
    //   7: iload_2
    //   8: sipush 128
    //   11: irem
    //   12: putstatic 113	com/appsflyer/internal/AFa1eSDK:onDeepLinking	I
    //   15: iload_2
    //   16: iconst_2
    //   17: irem
    //   18: ifeq +683 -> 701
    //   21: aload_1
    //   22: ifnull +80 -> 102
    //   25: aload_1
    //   26: invokevirtual 207	android/app/Activity:getIntent	()Landroid/content/Intent;
    //   29: ifnull +73 -> 102
    //   32: aload_0
    //   33: invokevirtual 170	com/appsflyer/internal/AFa1eSDK:AFInAppEventType	()Lcom/appsflyer/internal/AFc1xSDK;
    //   36: invokeinterface 726 1 0
    //   41: astore_3
    //   42: aload_1
    //   43: invokevirtual 2271	android/app/Activity:getLocalClassName	()Ljava/lang/String;
    //   46: astore 4
    //   48: new 89	java/lang/StringBuilder
    //   51: dup
    //   52: ldc_w 2273
    //   55: invokespecial 881	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   58: astore 5
    //   60: aload 5
    //   62: aload_1
    //   63: invokevirtual 207	android/app/Activity:getIntent	()Landroid/content/Intent;
    //   66: invokevirtual 104	java/lang/Object:toString	()Ljava/lang/String;
    //   69: invokevirtual 96	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   72: pop
    //   73: aload_3
    //   74: ldc_w 2274
    //   77: iconst_2
    //   78: anewarray 231	java/lang/String
    //   81: dup
    //   82: iconst_0
    //   83: aload 4
    //   85: aastore
    //   86: dup
    //   87: iconst_1
    //   88: aload 5
    //   90: invokevirtual 104	java/lang/Object:toString	()Ljava/lang/String;
    //   93: aastore
    //   94: invokeinterface 2011 3 0
    //   99: goto +83 -> 182
    //   102: aload_1
    //   103: ifnull +52 -> 155
    //   106: getstatic 115	com/appsflyer/internal/AFa1eSDK:onAttributionFailure	I
    //   109: iconst_3
    //   110: iadd
    //   111: sipush 128
    //   114: irem
    //   115: putstatic 113	com/appsflyer/internal/AFa1eSDK:onDeepLinking	I
    //   118: aload_0
    //   119: invokevirtual 170	com/appsflyer/internal/AFa1eSDK:AFInAppEventType	()Lcom/appsflyer/internal/AFc1xSDK;
    //   122: invokeinterface 726 1 0
    //   127: ldc_w 2274
    //   130: iconst_2
    //   131: anewarray 231	java/lang/String
    //   134: dup
    //   135: iconst_0
    //   136: aload_1
    //   137: invokevirtual 2271	android/app/Activity:getLocalClassName	()Ljava/lang/String;
    //   140: aastore
    //   141: dup
    //   142: iconst_1
    //   143: ldc_w 2276
    //   146: aastore
    //   147: invokeinterface 2011 3 0
    //   152: goto +30 -> 182
    //   155: aload_0
    //   156: invokevirtual 170	com/appsflyer/internal/AFa1eSDK:AFInAppEventType	()Lcom/appsflyer/internal/AFc1xSDK;
    //   159: invokeinterface 726 1 0
    //   164: ldc_w 2274
    //   167: iconst_1
    //   168: anewarray 231	java/lang/String
    //   171: dup
    //   172: iconst_0
    //   173: ldc_w 2278
    //   176: aastore
    //   177: invokeinterface 2011 3 0
    //   182: aload_1
    //   183: invokestatic 2280	com/appsflyer/internal/AFa1eSDK:AFInAppEventParameterName	(Landroid/app/Activity;)Ljava/lang/String;
    //   186: astore 4
    //   188: aload_0
    //   189: aload 4
    //   191: putfield 1780	com/appsflyer/internal/AFa1eSDK:getLevel	Ljava/lang/String;
    //   194: aload 4
    //   196: ifnull +504 -> 700
    //   199: invokestatic 509	java/lang/System:currentTimeMillis	()J
    //   202: lstore 6
    //   204: aload_0
    //   205: getfield 2282	com/appsflyer/internal/AFa1eSDK:AFLogger$LogLevel	Ljava/util/Map;
    //   208: ifnonnull +27 -> 235
    //   211: ldc_w 2284
    //   214: invokestatic 241	com/appsflyer/AFLogger:afInfoLog	(Ljava/lang/String;)V
    //   217: aload_0
    //   218: new 2286	java/util/concurrent/ConcurrentHashMap
    //   221: dup
    //   222: invokespecial 2287	java/util/concurrent/ConcurrentHashMap:<init>	()V
    //   225: putfield 2282	com/appsflyer/internal/AFa1eSDK:AFLogger$LogLevel	Ljava/util/Map;
    //   228: lload 6
    //   230: lstore 8
    //   232: goto +368 -> 600
    //   235: invokestatic 287	com/appsflyer/AppsFlyerProperties:getInstance	()Lcom/appsflyer/AppsFlyerProperties;
    //   238: ldc_w 2289
    //   241: ldc2_w 2290
    //   244: invokevirtual 2293	com/appsflyer/AppsFlyerProperties:getLong	(Ljava/lang/String;J)J
    //   247: lstore 10
    //   249: aload_0
    //   250: getfield 2282	com/appsflyer/internal/AFa1eSDK:AFLogger$LogLevel	Ljava/util/Map;
    //   253: invokeinterface 2297 1 0
    //   258: invokeinterface 2300 1 0
    //   263: astore_3
    //   264: lload 6
    //   266: lstore 12
    //   268: lload 12
    //   270: lstore 8
    //   272: aload_3
    //   273: invokeinterface 449 1 0
    //   278: ifeq +322 -> 600
    //   281: aload_3
    //   282: invokeinterface 457 1 0
    //   287: checkcast 985	java/lang/Long
    //   290: astore 14
    //   292: new 777	org/json/JSONObject
    //   295: astore 5
    //   297: aload 5
    //   299: aload_0
    //   300: getfield 1780	com/appsflyer/internal/AFa1eSDK:getLevel	Ljava/lang/String;
    //   303: invokespecial 778	org/json/JSONObject:<init>	(Ljava/lang/String;)V
    //   306: new 777	org/json/JSONObject
    //   309: astore 4
    //   311: aload 4
    //   313: aload_0
    //   314: getfield 2282	com/appsflyer/internal/AFa1eSDK:AFLogger$LogLevel	Ljava/util/Map;
    //   317: aload 14
    //   319: invokeinterface 303 2 0
    //   324: checkcast 231	java/lang/String
    //   327: invokespecial 778	org/json/JSONObject:<init>	(Ljava/lang/String;)V
    //   330: aload 5
    //   332: ldc_w 780
    //   335: invokevirtual 2303	org/json/JSONObject:opt	(Ljava/lang/String;)Ljava/lang/Object;
    //   338: aload 4
    //   340: ldc_w 780
    //   343: invokevirtual 2303	org/json/JSONObject:opt	(Ljava/lang/String;)Ljava/lang/Object;
    //   346: invokevirtual 1339	java/lang/Object:equals	(Ljava/lang/Object;)Z
    //   349: istore 15
    //   351: iload 15
    //   353: iconst_1
    //   354: ixor
    //   355: ifeq +6 -> 361
    //   358: goto +128 -> 486
    //   361: getstatic 113	com/appsflyer/internal/AFa1eSDK:onDeepLinking	I
    //   364: bipush 53
    //   366: iadd
    //   367: sipush 128
    //   370: irem
    //   371: putstatic 115	com/appsflyer/internal/AFa1eSDK:onAttributionFailure	I
    //   374: aload 5
    //   376: ldc_w 2304
    //   379: invokevirtual 2303	org/json/JSONObject:opt	(Ljava/lang/String;)Ljava/lang/Object;
    //   382: aload 4
    //   384: ldc_w 2304
    //   387: invokevirtual 2303	org/json/JSONObject:opt	(Ljava/lang/String;)Ljava/lang/Object;
    //   390: invokevirtual 1339	java/lang/Object:equals	(Ljava/lang/Object;)Z
    //   393: ifeq +93 -> 486
    //   396: new 89	java/lang/StringBuilder
    //   399: astore_3
    //   400: aload_3
    //   401: ldc_w 2306
    //   404: invokespecial 881	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   407: aload_3
    //   408: aload 4
    //   410: invokevirtual 1270	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   413: pop
    //   414: aload_3
    //   415: ldc_w 2308
    //   418: invokevirtual 96	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   421: pop
    //   422: aload_3
    //   423: aload 5
    //   425: invokevirtual 1270	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   428: pop
    //   429: aload_3
    //   430: ldc_w 2310
    //   433: invokevirtual 96	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   436: pop
    //   437: aload_3
    //   438: invokevirtual 104	java/lang/Object:toString	()Ljava/lang/String;
    //   441: invokestatic 241	com/appsflyer/AFLogger:afInfoLog	(Ljava/lang/String;)V
    //   444: aload_0
    //   445: aconst_null
    //   446: putfield 1780	com/appsflyer/internal/AFa1eSDK:getLevel	Ljava/lang/String;
    //   449: getstatic 115	com/appsflyer/internal/AFa1eSDK:onAttributionFailure	I
    //   452: bipush 73
    //   454: iadd
    //   455: istore_2
    //   456: iload_2
    //   457: sipush 128
    //   460: irem
    //   461: putstatic 113	com/appsflyer/internal/AFa1eSDK:onDeepLinking	I
    //   464: iload_2
    //   465: iconst_2
    //   466: irem
    //   467: ifne +13 -> 480
    //   470: new 215	java/lang/ArithmeticException
    //   473: dup
    //   474: ldc -39
    //   476: invokespecial 220	java/lang/ArithmeticException:<init>	(Ljava/lang/String;)V
    //   479: athrow
    //   480: return
    //   481: astore 4
    //   483: goto +77 -> 560
    //   486: lload 6
    //   488: aload 14
    //   490: invokevirtual 1216	java/lang/Number:longValue	()J
    //   493: lsub
    //   494: lload 10
    //   496: lcmp
    //   497: ifle +15 -> 512
    //   500: aload_0
    //   501: getfield 2282	com/appsflyer/internal/AFa1eSDK:AFLogger$LogLevel	Ljava/util/Map;
    //   504: aload 14
    //   506: invokeinterface 314 2 0
    //   511: pop
    //   512: lload 12
    //   514: lstore 8
    //   516: aload 14
    //   518: invokevirtual 1216	java/lang/Number:longValue	()J
    //   521: lload 12
    //   523: lcmp
    //   524: ifgt +23 -> 547
    //   527: aload 14
    //   529: invokevirtual 1216	java/lang/Number:longValue	()J
    //   532: lstore 8
    //   534: getstatic 115	com/appsflyer/internal/AFa1eSDK:onAttributionFailure	I
    //   537: bipush 113
    //   539: iadd
    //   540: sipush 128
    //   543: irem
    //   544: putstatic 113	com/appsflyer/internal/AFa1eSDK:onDeepLinking	I
    //   547: lload 8
    //   549: lstore 12
    //   551: goto -283 -> 268
    //   554: astore 4
    //   556: lload 6
    //   558: lstore 12
    //   560: new 89	java/lang/StringBuilder
    //   563: dup
    //   564: ldc_w 2312
    //   567: invokespecial 881	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   570: astore 5
    //   572: aload 5
    //   574: aload 4
    //   576: invokevirtual 1088	java/lang/Object:getClass	()Ljava/lang/Class;
    //   579: invokevirtual 2315	java/lang/Class:getSimpleName	()Ljava/lang/String;
    //   582: invokevirtual 96	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   585: pop
    //   586: aload 5
    //   588: invokevirtual 104	java/lang/Object:toString	()Ljava/lang/String;
    //   591: aload 4
    //   593: invokestatic 262	com/appsflyer/AFLogger:afErrorLog	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   596: lload 12
    //   598: lstore 8
    //   600: invokestatic 287	com/appsflyer/AppsFlyerProperties:getInstance	()Lcom/appsflyer/AppsFlyerProperties;
    //   603: ldc_w 2317
    //   606: iconst_2
    //   607: invokevirtual 2320	com/appsflyer/AppsFlyerProperties:getInt	(Ljava/lang/String;I)I
    //   610: istore_2
    //   611: aload_0
    //   612: getfield 2282	com/appsflyer/internal/AFa1eSDK:AFLogger$LogLevel	Ljava/util/Map;
    //   615: invokeinterface 2321 1 0
    //   620: iload_2
    //   621: if_icmpne +55 -> 676
    //   624: new 89	java/lang/StringBuilder
    //   627: dup
    //   628: ldc_w 2323
    //   631: invokespecial 881	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   634: astore 4
    //   636: aload 4
    //   638: lload 8
    //   640: invokevirtual 2326	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   643: pop
    //   644: aload 4
    //   646: ldc_w 2310
    //   649: invokevirtual 96	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   652: pop
    //   653: aload 4
    //   655: invokevirtual 104	java/lang/Object:toString	()Ljava/lang/String;
    //   658: invokestatic 241	com/appsflyer/AFLogger:afInfoLog	(Ljava/lang/String;)V
    //   661: aload_0
    //   662: getfield 2282	com/appsflyer/internal/AFa1eSDK:AFLogger$LogLevel	Ljava/util/Map;
    //   665: lload 8
    //   667: invokestatic 988	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   670: invokeinterface 314 2 0
    //   675: pop
    //   676: aload_0
    //   677: getfield 2282	com/appsflyer/internal/AFa1eSDK:AFLogger$LogLevel	Ljava/util/Map;
    //   680: lload 6
    //   682: invokestatic 988	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   685: aload_0
    //   686: getfield 1780	com/appsflyer/internal/AFa1eSDK:getLevel	Ljava/lang/String;
    //   689: invokeinterface 619 3 0
    //   694: pop
    //   695: aload_0
    //   696: aload_1
    //   697: invokevirtual 2329	com/appsflyer/AppsFlyerLib:start	(Landroid/content/Context;)V
    //   700: return
    //   701: aconst_null
    //   702: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	703	0	this	AFa1eSDK
    //   0	703	1	paramActivity	Activity
    //   6	616	2	i	int
    //   41	397	3	localObject1	Object
    //   46	363	4	localObject2	Object
    //   481	1	4	localObject3	Object
    //   554	38	4	localThrowable	Throwable
    //   634	20	4	localStringBuilder	StringBuilder
    //   58	529	5	localObject4	Object
    //   202	479	6	l1	long
    //   230	436	8	l2	long
    //   247	248	10	l3	long
    //   266	331	12	l4	long
    //   290	238	14	localLong	Long
    //   349	6	15	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   272	351	481	finally
    //   374	449	481	finally
    //   486	512	481	finally
    //   516	534	481	finally
    //   235	264	554	finally
  }
  
  public final void setAdditionalData(Map<String, Object> paramMap)
  {
    int i = onAttributionFailure + 29;
    onDeepLinking = i % 128;
    if (i % 2 != 0)
    {
      if (paramMap != null)
      {
        AFInAppEventType().afErrorLogForExcManagerOnly().AFInAppEventParameterName("setAdditionalData", new String[] { paramMap.toString() });
        paramMap = new JSONObject(paramMap);
        AppsFlyerProperties.getInstance().setCustomData(paramMap.toString());
      }
      onDeepLinking = (onAttributionFailure + 99) % 128;
      return;
    }
    throw null;
  }
  
  public final void setAndroidIdData(String paramString)
  {
    int i = onAttributionFailure + 23;
    onDeepLinking = i % 128;
    if (i % 2 == 0)
    {
      AFb1tSDK localAFb1tSDK = AFInAppEventType().afErrorLogForExcManagerOnly();
      String[] arrayOfString = new String[0];
      arrayOfString[0] = paramString;
      localAFb1tSDK.AFInAppEventParameterName("setAndroidIdData", arrayOfString);
    }
    for (;;)
    {
      AFLogger = paramString;
      break;
      AFInAppEventType().afErrorLogForExcManagerOnly().AFInAppEventParameterName("setAndroidIdData", new String[] { paramString });
    }
  }
  
  public final void setAppId(String paramString)
  {
    int i = onAttributionFailure + 83;
    onDeepLinking = i % 128;
    if (i % 2 == 0)
    {
      AFb1tSDK localAFb1tSDK = AFInAppEventType().afErrorLogForExcManagerOnly();
      String[] arrayOfString = new String[0];
      arrayOfString[1] = paramString;
      localAFb1tSDK.AFInAppEventParameterName("setAppId", arrayOfString);
    }
    for (;;)
    {
      AFInAppEventType("appid", paramString);
      break;
      AFInAppEventType().afErrorLogForExcManagerOnly().AFInAppEventParameterName("setAppId", new String[] { paramString });
    }
    onAttributionFailure = (onDeepLinking + 53) % 128;
  }
  
  public final void setAppInviteOneLink(String paramString)
  {
    onAttributionFailure = (onDeepLinking + 53) % 128;
    AFInAppEventType().afErrorLogForExcManagerOnly().AFInAppEventParameterName("setAppInviteOneLink", new String[] { paramString });
    AFLogger.afInfoLog("setAppInviteOneLink = ".concat(String.valueOf(paramString)));
    if (paramString != null)
    {
      int i = onAttributionFailure + 91;
      onDeepLinking = i % 128;
      if (i % 2 == 0)
      {
        paramString.equals(AppsFlyerProperties.getInstance().getString("oneLinkSlug"));
        throw new ArithmeticException("divide by zero");
      }
      if (!(paramString.equals(AppsFlyerProperties.getInstance().getString("oneLinkSlug")) ^ true)) {}
    }
    else
    {
      AppsFlyerProperties.getInstance().remove("onelinkDomain");
      AppsFlyerProperties.getInstance().remove("onelinkVersion");
      AppsFlyerProperties.getInstance().remove("onelinkScheme");
      onDeepLinking = (onAttributionFailure + 121) % 128;
    }
    AFInAppEventType("oneLinkSlug", paramString);
  }
  
  public final void setCollectAndroidID(boolean paramBoolean)
  {
    int i = onAttributionFailure + 107;
    onDeepLinking = i % 128;
    if (i % 2 == 0) {
      AFInAppEventType().afErrorLogForExcManagerOnly().AFInAppEventParameterName("setCollectAndroidID", new String[] { String.valueOf(paramBoolean) });
    }
    for (;;)
    {
      AFInAppEventType("collectAndroidId", Boolean.toString(paramBoolean));
      AFInAppEventType("collectAndroidIdForceByUser", Boolean.toString(paramBoolean));
      break;
      AFInAppEventType().afErrorLogForExcManagerOnly().AFInAppEventParameterName("setCollectAndroidID", new String[] { String.valueOf(paramBoolean) });
    }
  }
  
  public final void setCollectIMEI(boolean paramBoolean)
  {
    int i = onAttributionFailure + 79;
    onDeepLinking = i % 128;
    if (i % 2 == 0)
    {
      AFb1tSDK localAFb1tSDK = AFInAppEventType().afErrorLogForExcManagerOnly();
      String[] arrayOfString = new String[0];
      arrayOfString[0] = String.valueOf(paramBoolean);
      localAFb1tSDK.AFInAppEventParameterName("setCollectIMEI", arrayOfString);
    }
    for (;;)
    {
      AFInAppEventType("collectIMEI", Boolean.toString(paramBoolean));
      AFInAppEventType("collectIMEIForceByUser", Boolean.toString(paramBoolean));
      break;
      AFInAppEventType().afErrorLogForExcManagerOnly().AFInAppEventParameterName("setCollectIMEI", new String[] { String.valueOf(paramBoolean) });
    }
    onAttributionFailure = (onDeepLinking + 59) % 128;
  }
  
  @Deprecated
  public final void setCollectOaid(boolean paramBoolean)
  {
    int i = onDeepLinking + 29;
    onAttributionFailure = i % 128;
    if (i % 2 != 0)
    {
      AFb1tSDK localAFb1tSDK = AFInAppEventType().afErrorLogForExcManagerOnly();
      String[] arrayOfString = new String[0];
      arrayOfString[1] = String.valueOf(paramBoolean);
      localAFb1tSDK.AFInAppEventParameterName("setCollectOaid", arrayOfString);
    }
    for (;;)
    {
      AFInAppEventType("collectOAID", Boolean.toString(paramBoolean));
      break;
      AFInAppEventType().afErrorLogForExcManagerOnly().AFInAppEventParameterName("setCollectOaid", new String[] { String.valueOf(paramBoolean) });
    }
  }
  
  public final void setCurrencyCode(String paramString)
  {
    int i = onAttributionFailure + 125;
    onDeepLinking = i % 128;
    if (i % 2 == 0)
    {
      AFb1tSDK localAFb1tSDK = AFInAppEventType().afErrorLogForExcManagerOnly();
      String[] arrayOfString = new String[0];
      arrayOfString[1] = paramString;
      localAFb1tSDK.AFInAppEventParameterName("setCurrencyCode", arrayOfString);
    }
    for (;;)
    {
      AppsFlyerProperties.getInstance().set("currencyCode", paramString);
      break;
      AFInAppEventType().afErrorLogForExcManagerOnly().AFInAppEventParameterName("setCurrencyCode", new String[] { paramString });
    }
    onAttributionFailure = (onDeepLinking + 69) % 128;
  }
  
  public final void setCustomerIdAndLogSession(String paramString, @NonNull Context paramContext)
  {
    if (paramContext != null)
    {
      onAttributionFailure = (onDeepLinking + 63) % 128;
      boolean bool = AFKeystoreWrapper();
      setCustomerUserId(paramString);
      if (bool)
      {
        Object localObject = new StringBuilder("CustomerUserId set: ");
        ((StringBuilder)localObject).append(paramString);
        ((StringBuilder)localObject).append(" - Initializing AppsFlyer Tacking");
        AFLogger.afInfoLog(localObject.toString(), true);
        localObject = AppsFlyerProperties.getInstance().getReferrer(AFInAppEventType().values());
        AFInAppEventType(paramContext, AFe1nSDK.AFKeystoreWrapper);
        paramString = AFInAppEventTypeafWarnLogAFInAppEventParameterName;
        paramString = (String)localObject;
        if (localObject == null) {
          paramString = "";
        }
        if ((paramContext instanceof Activity))
        {
          int i = onAttributionFailure + 29;
          onDeepLinking = i % 128;
          if (i % 2 == 0)
          {
            ((Activity)paramContext).getIntent();
            throw new ArithmeticException("divide by zero");
          }
          ((Activity)paramContext).getIntent();
        }
        AFKeystoreWrapper(paramContext, null, null, paramString, null);
        return;
      }
      AFLogger.afInfoLog("waitForCustomerUserId is false; setting CustomerUserID: ".concat(String.valueOf(paramString)), true);
    }
  }
  
  public final void setCustomerUserId(String paramString)
  {
    onAttributionFailure = (onDeepLinking + 83) % 128;
    AFInAppEventType().afErrorLogForExcManagerOnly().AFInAppEventParameterName("setCustomerUserId", new String[] { paramString });
    AFLogger.afInfoLog("setCustomerUserId = ".concat(String.valueOf(paramString)));
    AFInAppEventType("AppUserId", paramString);
    AFInAppEventType("waitForCustomerId", false);
    onAttributionFailure = (onDeepLinking + 119) % 128;
  }
  
  public final void setDebugLog(boolean paramBoolean)
  {
    int i = onDeepLinking + 11;
    onAttributionFailure = i % 128;
    if (i % 2 != 0) {
      throw new ArithmeticException("divide by zero");
    }
    AFLogger.LogLevel localLogLevel;
    if (paramBoolean != true) {
      localLogLevel = AFLogger.LogLevel.NONE;
    } else {
      localLogLevel = AFLogger.LogLevel.DEBUG;
    }
    setLogLevel(localLogLevel);
    onAttributionFailure = (onDeepLinking + 103) % 128;
  }
  
  public final void setDisableAdvertisingIdentifiers(boolean paramBoolean)
  {
    int i = onAttributionFailure + 15;
    onDeepLinking = i % 128;
    if (i % 2 != 0)
    {
      AFLogger.afDebugLog("setDisableAdvertisingIdentifiers: ".concat(String.valueOf(paramBoolean)));
      if (!paramBoolean)
      {
        onAttributionFailure = (onDeepLinking + 29) % 128;
        paramBoolean = true;
      }
      else
      {
        onAttributionFailure = (onDeepLinking + 35) % 128;
        paramBoolean = false;
      }
      AFa1cSDK.valueOf = Boolean.valueOf(paramBoolean);
      AppsFlyerProperties.getInstance().remove("advertiserIdEnabled");
      AppsFlyerProperties.getInstance().remove("advertiserId");
      return;
    }
    AFLogger.afDebugLog("setDisableAdvertisingIdentifiers: ".concat(String.valueOf(paramBoolean)));
    throw null;
  }
  
  public final void setDisableNetworkData(boolean paramBoolean)
  {
    onDeepLinking = (onAttributionFailure + 15) % 128;
    AFLogger.afDebugLog("setDisableNetworkData: ".concat(String.valueOf(paramBoolean)));
    AFInAppEventType("disableCollectNetworkData", paramBoolean);
    int i = onDeepLinking + 93;
    onAttributionFailure = i % 128;
    if (i % 2 != 0) {
      throw new ArithmeticException("divide by zero");
    }
  }
  
  public final void setExtension(String paramString)
  {
    onAttributionFailure = (onDeepLinking + 81) % 128;
    AFInAppEventType().afErrorLogForExcManagerOnly().AFInAppEventParameterName("setExtension", new String[] { paramString });
    AppsFlyerProperties.getInstance().set("sdkExtension", paramString);
    int i = onAttributionFailure + 65;
    onDeepLinking = i % 128;
    if (i % 2 != 0) {
      return;
    }
    throw null;
  }
  
  public final void setHost(String paramString1, @NonNull String paramString2)
  {
    if ((AFb1uSDK.AFInAppEventType(paramString2) ^ true) != true)
    {
      AFLogger.afWarnLog("hostname was empty or null - call for setHost is skipped");
      return;
    }
    onDeepLinking = (onAttributionFailure + 29) % 128;
    if (paramString1 != null)
    {
      paramString1 = paramString1.trim();
      onAttributionFailure = (onDeepLinking + 95) % 128;
    }
    else
    {
      paramString1 = "";
    }
    AFc1dSDK.valueOf(new AFc1fSDK(paramString1, paramString2.trim()));
  }
  
  public final void setImeiData(String paramString)
  {
    int i = onDeepLinking + 27;
    onAttributionFailure = i % 128;
    if (i % 2 != 0)
    {
      AFb1tSDK localAFb1tSDK = AFInAppEventType().afErrorLogForExcManagerOnly();
      String[] arrayOfString = new String[0];
      arrayOfString[1] = paramString;
      localAFb1tSDK.AFInAppEventParameterName("setImeiData", arrayOfString);
    }
    for (;;)
    {
      AFInAppEventTypeafWarnLogvalues = paramString;
      break;
      AFInAppEventType().afErrorLogForExcManagerOnly().AFInAppEventParameterName("setImeiData", new String[] { paramString });
    }
  }
  
  public final void setIsUpdate(boolean paramBoolean)
  {
    onDeepLinking = (onAttributionFailure + 119) % 128;
    AFInAppEventType().afErrorLogForExcManagerOnly().AFInAppEventParameterName("setIsUpdate", new String[] { String.valueOf(paramBoolean) });
    AppsFlyerProperties.getInstance().set("IS_UPDATE", paramBoolean);
    int i = onAttributionFailure + 43;
    onDeepLinking = i % 128;
    if (i % 2 != 0) {
      return;
    }
    throw null;
  }
  
  public final void setLogLevel(@NonNull AFLogger.LogLevel paramLogLevel)
  {
    int i = paramLogLevel.getLevel();
    int j = AFLogger.LogLevel.NONE.getLevel();
    boolean bool1 = false;
    boolean bool2 = bool1;
    if (i > j)
    {
      i = onDeepLinking + 85;
      onAttributionFailure = i % 128;
      if (i % 2 != 0) {
        bool2 = bool1;
      } else {
        bool2 = true;
      }
    }
    AFInAppEventType().afErrorLogForExcManagerOnly().AFInAppEventParameterName("log", new String[] { String.valueOf(bool2) });
    AppsFlyerProperties.getInstance().set("logLevel", paramLogLevel.getLevel());
    onAttributionFailure = (onDeepLinking + 95) % 128;
  }
  
  public final void setMinTimeBetweenSessions(int paramInt)
  {
    int i = onAttributionFailure + 77;
    onDeepLinking = i % 128;
    if (i % 2 == 0)
    {
      AFVersionDeclaration = TimeUnit.SECONDS.toMillis(paramInt);
      throw new ArithmeticException("divide by zero");
    }
    AFVersionDeclaration = TimeUnit.SECONDS.toMillis(paramInt);
  }
  
  public final void setOaidData(String paramString)
  {
    onAttributionFailure = (onDeepLinking + 123) % 128;
    AFInAppEventType().afErrorLogForExcManagerOnly().AFInAppEventParameterName("setOaidData", new String[] { paramString });
    AFa1cSDK.values = paramString;
    int i = onAttributionFailure + 95;
    onDeepLinking = i % 128;
    if (i % 2 != 0) {
      return;
    }
    throw null;
  }
  
  public final void setOneLinkCustomDomain(String... paramVarArgs)
  {
    int i = onAttributionFailure + 77;
    onDeepLinking = i % 128;
    if (i % 2 == 0)
    {
      localObject = new Object[0];
      localObject[1] = Arrays.toString(paramVarArgs);
    }
    for (Object localObject = String.format("setOneLinkCustomDomain %s", (Object[])localObject);; localObject = String.format("setOneLinkCustomDomain %s", new Object[] { Arrays.toString(paramVarArgs) }))
    {
      AFLogger.afDebugLog((String)localObject);
      AFInAppEventTypeAppsFlyer2dXConversionCallbackafDebugLog = paramVarArgs;
      break;
    }
  }
  
  public final void setOutOfStore(String paramString)
  {
    int i = onDeepLinking + 27;
    onAttributionFailure = i % 128;
    if (i % 2 != 0) {
      throw new ArithmeticException("divide by zero");
    }
    if (paramString != null)
    {
      paramString = paramString.toLowerCase(Locale.getDefault());
      AppsFlyerProperties.getInstance().set("api_store_value", paramString);
      AFLogger.afInfoLog("Store API set with value: ".concat(String.valueOf(paramString)), true);
      return;
    }
    AFLogger.AFKeystoreWrapper("Cannot set setOutOfStore with null");
    i = onDeepLinking + 91;
    onAttributionFailure = i % 128;
    if (i % 2 == 0) {
      return;
    }
    throw null;
  }
  
  public final void setPartnerData(@NonNull String paramString, Map<String, Object> paramMap)
  {
    if (onResponseNative == null) {
      onResponseNative = new AFb1lSDK();
    }
    AFb1lSDK localAFb1lSDK = onResponseNative;
    if (paramString != null)
    {
      int i = onDeepLinking + 47;
      onAttributionFailure = i % 128;
      if (i % 2 != 0)
      {
        paramString.isEmpty();
        throw new ArithmeticException("divide by zero");
      }
      if ((paramString.isEmpty() ^ true) == true)
      {
        if (paramMap != null)
        {
          i = onDeepLinking + 27;
          onAttributionFailure = i % 128;
          if (i % 2 != 0)
          {
            paramMap.isEmpty();
            throw new ArithmeticException("divide by zero");
          }
          if (!paramMap.isEmpty())
          {
            StringBuilder localStringBuilder = new StringBuilder("Setting partner data for ");
            localStringBuilder.append(paramString);
            localStringBuilder.append(": ");
            localStringBuilder.append(paramMap);
            AFLogger.afDebugLog(localStringBuilder.toString());
            i = new JSONObject(paramMap).toString().length();
            if (i > 1000)
            {
              AFLogger.afWarnLog("Partner data 1000 characters limit exceeded");
              paramMap = new HashMap();
              paramMap.put("error", "limit exceeded: ".concat(String.valueOf(i)));
              AFInAppEventParameterName.put(paramString, paramMap);
              return;
            }
            values.put(paramString, paramMap);
            AFInAppEventParameterName.remove(paramString);
            onDeepLinking = (onAttributionFailure + 77) % 128;
            return;
          }
        }
        if (values.remove(paramString) == null) {
          paramString = "Partner data is missing or `null`";
        } else {
          paramString = "Cleared partner data for ".concat(paramString);
        }
        AFLogger.afWarnLog(paramString);
        return;
      }
    }
    AFLogger.afWarnLog("Partner ID is missing or `null`");
  }
  
  public final void setPhoneNumber(String paramString)
  {
    int i = onAttributionFailure + 35;
    onDeepLinking = i % 128;
    onAttributionFailureNative = AFc1nSDK.AFInAppEventType(paramString);
    if (i % 2 != 0)
    {
      onAttributionFailure = (onDeepLinking + 77) % 128;
      return;
    }
    throw null;
  }
  
  public final void setPluginInfo(@NonNull PluginInfo paramPluginInfo)
  {
    onDeepLinking = (onAttributionFailure + 93) % 128;
    Objects.requireNonNull(paramPluginInfo);
    AFInAppEventType().onInstallConversionDataLoadedNative().AFInAppEventParameterName(paramPluginInfo);
    onDeepLinking = (onAttributionFailure + 25) % 128;
  }
  
  public final void setPreinstallAttribution(String paramString1, String paramString2, String paramString3)
  {
    AFLogger.afDebugLog("setPreinstallAttribution API called");
    JSONObject localJSONObject = new JSONObject();
    if (paramString1 != null)
    {
      onDeepLinking = (onAttributionFailure + 93) % 128;
      try
      {
        localJSONObject.put("pid", paramString1);
        onDeepLinking = (onAttributionFailure + 17) % 128;
      }
      catch (JSONException paramString1)
      {
        break label129;
      }
    }
    if (paramString2 != null) {
      localJSONObject.put("c", paramString2);
    }
    int i;
    if (paramString3 != null)
    {
      i = onDeepLinking + 41;
      onAttributionFailure = i % 128;
      if (i % 2 == 0)
      {
        localJSONObject.put("af_siteid", paramString3);
      }
      else
      {
        localJSONObject.put("af_siteid", paramString3);
        throw null;
        label129:
        AFLogger.afErrorLog(paramString1.getMessage(), paramString1);
      }
    }
    if (localJSONObject.has("pid"))
    {
      i = onDeepLinking + 117;
      onAttributionFailure = i % 128;
      if (i % 2 == 0)
      {
        AFInAppEventType("preInstallName", localJSONObject.toString());
        return;
      }
      AFInAppEventType("preInstallName", localJSONObject.toString());
      throw null;
    }
    AFLogger.afWarnLog("Cannot set preinstall attribution data without a media source");
  }
  
  public final void setResolveDeepLinkURLs(String... paramVarArgs)
  {
    onDeepLinking = (onAttributionFailure + 87) % 128;
    AFLogger.afDebugLog(String.format("setResolveDeepLinkURLs %s", new Object[] { Arrays.toString(paramVarArgs) }));
    AFb1sSDK localAFb1sSDK = AFInAppEventType().AppsFlyer2dXConversionCallback();
    AFLogger.clear();
    AFLogger.addAll(Arrays.asList(paramVarArgs));
    onAttributionFailure = (onDeepLinking + 65) % 128;
  }
  
  @Deprecated
  public final void setSharingFilter(@NonNull String... paramVarArgs)
  {
    onAttributionFailure = (onDeepLinking + 69) % 128;
    setSharingFilterForPartners(paramVarArgs);
    onAttributionFailure = (onDeepLinking + 63) % 128;
  }
  
  @Deprecated
  public final void setSharingFilterForAllPartners()
  {
    int i = onDeepLinking + 47;
    onAttributionFailure = i % 128;
    if (i % 2 != 0)
    {
      String[] arrayOfString = new String[0];
      arrayOfString[1] = "all";
      setSharingFilterForPartners(arrayOfString);
    }
    else
    {
      setSharingFilterForPartners(new String[] { "all" });
    }
  }
  
  public final void setSharingFilterForPartners(String... paramVarArgs)
  {
    afInfoLog = new AFa1cSDK(paramVarArgs);
    onDeepLinking = (onAttributionFailure + 95) % 128;
  }
  
  public final void setUserEmails(AppsFlyerProperties.EmailsCryptType paramEmailsCryptType, String... paramVarArgs)
  {
    Object localObject = new ArrayList(paramVarArgs.length + 1);
    ((List)localObject).add(paramEmailsCryptType.toString());
    ((List)localObject).addAll(Arrays.asList(paramVarArgs));
    AFInAppEventType().afErrorLogForExcManagerOnly().AFInAppEventParameterName("setUserEmails", (String[])((List)localObject).toArray(new String[paramVarArgs.length + 1]));
    AppsFlyerProperties.getInstance().set("userEmailsCryptType", paramEmailsCryptType.getValue());
    HashMap localHashMap = new HashMap();
    ArrayList localArrayList = new ArrayList();
    int i = paramVarArgs.length;
    onDeepLinking = (onAttributionFailure + 93) % 128;
    localObject = null;
    for (int j = 0; j < i; j++)
    {
      onAttributionFailure = (onDeepLinking + 33) % 128;
      localObject = paramVarArgs[j];
      if (5.valueOf[paramEmailsCryptType.ordinal()] != 2)
      {
        localArrayList.add(AFc1nSDK.AFInAppEventType((String)localObject));
        localObject = "sha256_el_arr";
      }
      else
      {
        localArrayList.add(localObject);
        localObject = "plain_el_arr";
      }
    }
    localHashMap.put(localObject, localArrayList);
    paramEmailsCryptType = new JSONObject(localHashMap);
    AppsFlyerProperties.getInstance().setUserEmails(paramEmailsCryptType.toString());
  }
  
  public final void setUserEmails(String... paramVarArgs)
  {
    int i = onAttributionFailure + 43;
    onDeepLinking = i % 128;
    if (i % 2 == 0)
    {
      AFInAppEventType().afErrorLogForExcManagerOnly().AFInAppEventParameterName("setUserEmails", paramVarArgs);
      setUserEmails(AppsFlyerProperties.EmailsCryptType.NONE, paramVarArgs);
      throw new ArithmeticException("divide by zero");
    }
    AFInAppEventType().afErrorLogForExcManagerOnly().AFInAppEventParameterName("setUserEmails", paramVarArgs);
    setUserEmails(AppsFlyerProperties.EmailsCryptType.NONE, paramVarArgs);
  }
  
  public final void start(@NonNull Context paramContext)
  {
    onAttributionFailure = (onDeepLinking + 61) % 128;
    start(paramContext, null);
    int i = onAttributionFailure + 49;
    onDeepLinking = i % 128;
    if (i % 2 != 0) {
      return;
    }
    throw null;
  }
  
  public final void start(@NonNull Context paramContext, String paramString)
  {
    onDeepLinking = (onAttributionFailure + 39) % 128;
    start(paramContext, paramString, null);
    onAttributionFailure = (onDeepLinking + 37) % 128;
  }
  
  public final void start(@NonNull Context paramContext, String paramString, final AppsFlyerRequestListener paramAppsFlyerRequestListener)
  {
    int i = onDeepLinking + 57;
    onAttributionFailure = i % 128;
    if (i % 2 == 0)
    {
      if (AFInAppEventType().onResponseNative().AFInAppEventType()) {
        return;
      }
      if (!onAppOpenAttributionNative)
      {
        AFLogger.afWarnLog("ERROR: AppsFlyer SDK is not initialized! The API call 'start()' must be called after the 'init(String, AppsFlyerConversionListener)' API method, which should be called on the Application's onCreate.");
        if (paramString == null)
        {
          if (paramAppsFlyerRequestListener != null)
          {
            i = onAttributionFailure + 75;
            onDeepLinking = i % 128;
            if (i % 2 == 0) {
              paramAppsFlyerRequestListener.onError(7, "No dev key");
            } else {
              paramAppsFlyerRequestListener.onError(41, "No dev key");
            }
          }
          return;
        }
      }
      AFKeystoreWrapper(paramContext);
      final AFe1mSDK localAFe1mSDK = AFInAppEventType().afDebugLog();
      localAFe1mSDK.AFKeystoreWrapper(AFa1rSDK.AFInAppEventParameterName(paramContext));
      init = ((Application)paramContext.getApplicationContext());
      AFInAppEventType().afErrorLogForExcManagerOnly().AFInAppEventParameterName("start", new String[] { paramString });
      String str = values;
      AFLogger.afInfoLog(String.format("Starting AppsFlyer: (v%s.%s)", new Object[] { "6.12.2", str }));
      StringBuilder localStringBuilder = new StringBuilder("Build Number: ");
      localStringBuilder.append(str);
      AFLogger.afInfoLog(localStringBuilder.toString());
      AppsFlyerProperties.getInstance().loadProperties(AFInAppEventType().values());
      if (!TextUtils.isEmpty(paramString))
      {
        onDeepLinking = (onAttributionFailure + 17) % 128;
        AFInAppEventTypeafWarnLogAFInAppEventParameterName = paramString;
        AFa1aSDK.AFInAppEventType(paramString);
      }
      else
      {
        if (TextUtils.isEmpty(AFInAppEventTypeafWarnLogAFInAppEventParameterName) == true) {
          break label375;
        }
      }
      AFInAppEventType().afRDLog().AFInAppEventParameterName(null);
      afWarnLog();
      afInfoLog(init.getBaseContext());
      if (onDeepLinkingNative) {
        AFInAppEventType(init.getApplicationContext());
      }
      onConversionDataFail.onResponseNative().AFKeystoreWrapper(paramContext, new AFb1iSDK.AFa1wSDK()
      {
        public final void AFInAppEventType(@NonNull Context paramAnonymousContext)
        {
          AFLogger.afInfoLog("onBecameBackground");
          Object localObject = localAFe1mSDK;
          long l1 = System.currentTimeMillis();
          long l2 = afErrorLog;
          if (l2 != 0L)
          {
            l1 -= l2;
            l2 = l1;
            if (l1 > 0L)
            {
              l2 = l1;
              if (l1 < 1000L) {
                l2 = 1000L;
              }
            }
            l2 = TimeUnit.MILLISECONDS.toSeconds(l2);
            afWarnLog = l2;
            valueOf.AFInAppEventParameterName("prev_session_dur", l2);
          }
          else
          {
            AFLogger.afInfoLog("Metrics: fg ts is missing");
          }
          AFLogger.afInfoLog("callStatsBackground background call");
          AFKeystoreWrapper(new WeakReference(paramAnonymousContext));
          AFInAppEventType().onConversionDataSuccess().valueOf();
          localObject = AFInAppEventType().afErrorLogForExcManagerOnly();
          if (((AFb1tSDK)localObject).afInfoLog())
          {
            ((AFb1tSDK)localObject).values();
            if ((paramAnonymousContext != null) && (!AppsFlyerLib.getInstance().isStopped())) {
              ((AFb1tSDK)localObject).valueOf(paramAnonymousContext.getPackageName(), paramAnonymousContext.getPackageManager(), AFInAppEventType());
            }
            ((AFb1tSDK)localObject).valueOf();
          }
          else
          {
            AFLogger.afDebugLog("RD status is OFF");
          }
          AFInAppEventType().getLevel().AFInAppEventType();
        }
        
        public final void values(@NonNull Activity paramAnonymousActivity)
        {
          localAFe1mSDK.values();
          AFInAppEventType().afRDLog().AFInAppEventParameterName(null);
          AFa1eSDK.AFInAppEventParameterName(AFa1eSDK.this);
          Object localObject = AFa1eSDK.this;
          int i = ((AFa1eSDK)localObject).valueOf(((AFa1eSDK)localObject).values(paramAnonymousActivity), false);
          AFLogger.afInfoLog("onBecameForeground");
          if (i < 2) {
            AFInAppEventType().getLevel().AFInAppEventParameterName();
          }
          localObject = new AFe1hSDK();
          if (paramAnonymousActivity != null) {
            AFInAppEventType().AppsFlyer2dXConversionCallback().valueOf(((AFa1qSDK)localObject).valueOf(), paramAnonymousActivity.getIntent(), paramAnonymousActivity.getApplication());
          }
          AFa1eSDK localAFa1eSDK = AFa1eSDK.this;
          AFInAppEventParameterName = paramAppsFlyerRequestListener;
          localAFa1eSDK.values((AFa1qSDK)localObject, paramAnonymousActivity);
        }
      });
      return;
      label375:
      i = onAttributionFailure + 111;
      onDeepLinking = i % 128;
      AFLogger.afWarnLog("ERROR: AppsFlyer SDK is not initialized! You must provide AppsFlyer Dev-Key either in the 'init' API method (should be called on Application's onCreate),or in the start() API (should be called on Activity's onCreate).");
      if (i % 2 != 0)
      {
        if (paramAppsFlyerRequestListener != null) {
          paramAppsFlyerRequestListener.onError(41, "No dev key");
        }
        onDeepLinking = (onAttributionFailure + 31) % 128;
        return;
      }
      throw null;
    }
    AFInAppEventType().onResponseNative().AFInAppEventType();
    throw null;
  }
  
  public final void stop(boolean paramBoolean, Context paramContext)
  {
    onDeepLinking = (onAttributionFailure + 121) % 128;
    AFKeystoreWrapper(paramContext);
    paramContext = AFInAppEventType();
    afWarnLogAFInAppEventType = paramBoolean;
    paramContext.AFInAppEventType().submit(new a(paramContext));
    if (paramBoolean)
    {
      onAttributionFailure = (onDeepLinking + 69) % 128;
      paramContext.values().values("is_stop_tracking_used", true);
    }
    int i = onAttributionFailure + 37;
    onDeepLinking = i % 128;
    if (i % 2 == 0) {
      throw new ArithmeticException("divide by zero");
    }
  }
  
  public final void subscribeForDeepLink(@NonNull DeepLinkListener paramDeepLinkListener)
  {
    int i = onDeepLinking + 99;
    onAttributionFailure = i % 128;
    if (i % 2 != 0)
    {
      subscribeForDeepLink(paramDeepLinkListener, TimeUnit.SECONDS.toMillis(3L));
      throw new ArithmeticException("divide by zero");
    }
    subscribeForDeepLink(paramDeepLinkListener, TimeUnit.SECONDS.toMillis(3L));
  }
  
  public final void subscribeForDeepLink(@NonNull DeepLinkListener paramDeepLinkListener, long paramLong)
  {
    onAttributionFailure = (onDeepLinking + 83) % 128;
    AFInAppEventTypeAppsFlyer2dXConversionCallbackAFInAppEventParameterName = paramDeepLinkListener;
    AFInAppEventTypeAppsFlyer2dXConversionCallbackafInfoLog = paramLong;
    int i = onAttributionFailure + 45;
    onDeepLinking = i % 128;
    if (i % 2 == 0) {
      throw new ArithmeticException("divide by zero");
    }
  }
  
  public final void unregisterConversionListener()
  {
    onDeepLinking = (onAttributionFailure + 55) % 128;
    AFInAppEventType().afErrorLogForExcManagerOnly().AFInAppEventParameterName("unregisterConversionListener", new String[0]);
    AFInAppEventParameterName = null;
    onAttributionFailure = (onDeepLinking + 123) % 128;
  }
  
  public final void updateServerUninstallToken(Context paramContext, String paramString)
  {
    AFKeystoreWrapper(paramContext);
    paramContext = new AFe1ySDK(paramContext);
    if ((paramString != null) && (!paramString.trim().isEmpty()))
    {
      AFLogger.afInfoLog("[register] Firebase Refreshed Token = ".concat(paramString));
      AFb1uSDK localAFb1uSDK = paramContext.AFInAppEventParameterName();
      if ((localAFb1uSDK == null) || (!paramString.equals(valueOf)))
      {
        long l = System.currentTimeMillis();
        int i;
        if ((localAFb1uSDK != null) && (l - AFKeystoreWrapper <= TimeUnit.SECONDS.toMillis(2L))) {
          i = 0;
        } else {
          i = 1;
        }
        localAFb1uSDK = new AFb1uSDK(paramString, l, i ^ 0x1);
        values.AFInAppEventParameterName("afUninstallToken", valueOf);
        values.AFInAppEventParameterName("afUninstallToken_received_time", AFKeystoreWrapper);
        values.values("afUninstallToken_queued", localAFb1uSDK.AFKeystoreWrapper());
        if (i != 0) {
          AFe1ySDK.valueOf(paramString);
        }
      }
      return;
    }
    AFLogger.afWarnLog("[register] Firebase Token is either empty or null and was not registered.");
  }
  
  public final void validateAndLogInAppPurchase(Context paramContext, String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, Map<String, String> paramMap)
  {
    Object localObject1 = AFInAppEventType().afErrorLogForExcManagerOnly();
    Object localObject2;
    if (paramMap == null) {
      localObject2 = "";
    } else {
      localObject2 = paramMap.toString();
    }
    ((AFb1tSDK)localObject1).AFInAppEventParameterName("validateAndTrackInAppPurchase", new String[] { paramString1, paramString2, paramString3, paramString4, paramString5, localObject2 });
    if (!isStopped())
    {
      localObject2 = new StringBuilder("Validate in app called with parameters: ");
      ((StringBuilder)localObject2).append(paramString3);
      ((StringBuilder)localObject2).append(" ");
      ((StringBuilder)localObject2).append(paramString4);
      ((StringBuilder)localObject2).append(" ");
      ((StringBuilder)localObject2).append(paramString5);
      AFLogger.afInfoLog(localObject2.toString());
    }
    if ((paramString1 != null) && (paramString4 != null) && (paramString2 != null) && (paramString5 != null) && (paramString3 != null))
    {
      localObject1 = paramContext.getApplicationContext();
      localObject2 = AFInAppEventTypeafWarnLogAFInAppEventParameterName;
      if ((paramContext instanceof Activity)) {}
      for (paramContext = ((Activity)paramContext).getIntent();; paramContext = null) {
        break;
      }
      new Thread(new AFa1gSDK((Context)localObject1, (String)localObject2, paramString1, paramString2, paramString3, paramString4, paramString5, paramMap, paramContext)).start();
    }
    else
    {
      paramContext = valueOf;
      if (paramContext != null) {
        paramContext.onValidateInAppFailure("Please provide purchase parameters");
      }
    }
  }
  
  public final int valueOf(AFb1dSDK paramAFb1dSDK, boolean paramBoolean)
  {
    onAttributionFailure = (onDeepLinking + 9) % 128;
    int i = AFKeystoreWrapper(paramAFb1dSDK, "appsFlyerCount", paramBoolean);
    onAttributionFailure = (onDeepLinking + 13) % 128;
    return i;
  }
  
  public final void valueOf(Context paramContext, Map<String, Object> paramMap, Uri paramUri)
  {
    AFKeystoreWrapper(paramContext);
    if ((paramMap.containsKey("af_deeplink") ^ true))
    {
      int i = onAttributionFailure + 29;
      onDeepLinking = i % 128;
      if (i % 2 != 0)
      {
        localObject1 = AFInAppEventType(paramUri.toString());
        Object localObject2 = AFInAppEventType().AppsFlyer2dXConversionCallback();
        Object localObject3 = AFKeystoreWrapper;
        localObject4 = localObject1;
        if (localObject3 != null)
        {
          localObject4 = localObject1;
          if (values != null)
          {
            localObject4 = localObject1;
            if (((String)localObject1).contains((CharSequence)localObject3))
            {
              localObject4 = Uri.parse((String)localObject1).buildUpon();
              localObject1 = Uri.EMPTY.buildUpon();
              localObject3 = values.entrySet().iterator();
              for (i = onDeepLinking + 115;; i = onDeepLinking + 93)
              {
                onAttributionFailure = i % 128;
                if (!((Iterator)localObject3).hasNext()) {
                  break;
                }
                onAttributionFailure = (onDeepLinking + 23) % 128;
                localObject2 = (Map.Entry)((Iterator)localObject3).next();
                ((Uri.Builder)localObject4).appendQueryParameter((String)((Map.Entry)localObject2).getKey(), (String)((Map.Entry)localObject2).getValue());
                ((Uri.Builder)localObject1).appendQueryParameter((String)((Map.Entry)localObject2).getKey(), (String)((Map.Entry)localObject2).getValue());
              }
              localObject4 = ((Uri.Builder)localObject4).build().toString();
              paramMap.put("appended_query_params", ((Uri.Builder)localObject1).build().getEncodedQuery());
            }
          }
        }
        paramMap.put("af_deeplink", localObject4);
      }
      else
      {
        AFInAppEventType(paramUri.toString());
        paramContext = AFInAppEventTypeAppsFlyer2dXConversionCallbackAFKeystoreWrapper;
        throw null;
      }
    }
    Object localObject1 = new HashMap();
    ((Map)localObject1).put("link", paramUri.toString());
    Object localObject4 = new AFd1nSDK(AFInAppEventType(), UUID.randomUUID(), paramUri);
    if (((AFd1nSDK)localObject4).afWarnLog()) {
      paramMap.put("isBrandedDomain", Boolean.TRUE);
    }
    AFa1fSDK.AFInAppEventType(paramContext, (Map)localObject1, paramUri);
    if (((AFd1nSDK)localObject4).AFVersionDeclaration())
    {
      afInfoLog = AFKeystoreWrapper((Map)localObject1);
      paramContext = AFInAppEventType().AFVersionDeclaration();
      AFKeystoreWrapper.execute(new AFc1bSDK.4(paramContext, (AFd1zSDK)localObject4));
      return;
    }
    AFInAppEventType().AppsFlyer2dXConversionCallback().AFInAppEventType((Map)localObject1);
  }
  
  public final AFb1dSDK values(Context paramContext)
  {
    onAttributionFailure = (onDeepLinking + 19) % 128;
    AFKeystoreWrapper(paramContext);
    paramContext = AFInAppEventType().values();
    onAttributionFailure = (onDeepLinking + 33) % 128;
    return paramContext;
  }
  
  public final void values(@NonNull AFa1qSDK paramAFa1qSDK, Activity paramActivity)
  {
    AFInAppEventType(paramAFa1qSDK, paramActivity);
    if (AFInAppEventTypeafWarnLogAFInAppEventParameterName == null)
    {
      int i = onDeepLinking + 65;
      onAttributionFailure = i % 128;
      AFLogger.afWarnLog("[LogEvent/Launch] AppsFlyer's SDK cannot send any event without providing DevKey.");
      paramAFa1qSDK = AFInAppEventParameterName;
      if (i % 2 == 0)
      {
        if (paramAFa1qSDK != null) {
          paramAFa1qSDK.onError(41, "No dev key");
        }
        return;
      }
      throw null;
    }
    paramActivity = AppsFlyerProperties.getInstance().getReferrer(AFInAppEventType().values());
    if (paramActivity == null) {
      paramActivity = "";
    } else {
      onAttributionFailure = (onDeepLinking + 99) % 128;
    }
    afErrorLog = paramActivity;
    AFInAppEventType(paramAFa1qSDK);
    onAttributionFailure = (onDeepLinking + 95) % 128;
  }
  
  public final void waitForCustomerUserId(boolean paramBoolean)
  {
    onAttributionFailure = (onDeepLinking + 77) % 128;
    AFLogger.afInfoLog("initAfterCustomerUserID: ".concat(String.valueOf(paramBoolean)), true);
    AFInAppEventType("waitForCustomerId", paramBoolean);
    int i = onDeepLinking + 45;
    onAttributionFailure = i % 128;
    if (i % 2 == 0) {
      return;
    }
    throw null;
  }
  
  public final class AFa1vSDK
    implements Runnable
  {
    private final AFa1qSDK AFInAppEventParameterName;
    
    private AFa1vSDK(AFa1qSDK paramAFa1qSDK)
    {
      AFInAppEventParameterName = paramAFa1qSDK;
    }
    
    public final void run()
    {
      AFa1eSDK.valueOf(AFa1eSDK.this, AFInAppEventParameterName);
    }
  }
  
  public final class AFa1wSDK
    implements AFc1cSDK
  {
    private AFa1wSDK() {}
    
    private boolean values()
    {
      return AFInAppEventParameterName != null;
    }
    
    public final void AFInAppEventParameterName(AFd1zSDK<?> paramAFd1zSDK) {}
    
    public final void AFInAppEventType(AFd1zSDK<?> paramAFd1zSDK, AFd1ySDK paramAFd1ySDK)
    {
      if ((paramAFd1zSDK instanceof AFd1hSDK))
      {
        AFd1hSDK localAFd1hSDK = (AFd1hSDK)paramAFd1zSDK;
        boolean bool = paramAFd1zSDK instanceof AFd1fSDK;
        if ((bool) && (values()))
        {
          Object localObject = (AFd1fSDK)paramAFd1zSDK;
          if ((valueOf == AFd1ySDK.AFInAppEventParameterName) || (AFInAppEventType == 1))
          {
            AFe1pSDK localAFe1pSDK = new AFe1pSDK((AFd1fSDK)localObject, AFInAppEventType().values());
            localObject = AFInAppEventType().AFVersionDeclaration();
            AFKeystoreWrapper.execute(new AFc1bSDK.4((AFc1bSDK)localObject, localAFe1pSDK));
          }
        }
        if (paramAFd1ySDK == AFd1ySDK.AFInAppEventParameterName)
        {
          paramAFd1ySDK = AFa1eSDK.this;
          paramAFd1ySDK.values(AFa1eSDK.AFInAppEventType(paramAFd1ySDK)).AFInAppEventParameterName("sentSuccessfully", "true");
          if (!(paramAFd1zSDK instanceof AFd1eSDK))
          {
            paramAFd1zSDK = new AFe1ySDK(AFa1eSDK.AFInAppEventType(AFa1eSDK.this)).AFInAppEventParameterName();
            if ((paramAFd1zSDK != null) && (paramAFd1zSDK.AFKeystoreWrapper()))
            {
              paramAFd1zSDK = valueOf;
              AFLogger.afDebugLog("Resending Uninstall token to AF servers: ".concat(String.valueOf(paramAFd1zSDK)));
              AFe1ySDK.valueOf(paramAFd1zSDK);
            }
          }
          paramAFd1zSDK = afErrorLog;
          if (paramAFd1zSDK != null)
          {
            paramAFd1zSDK = AFb1vSDK.AFKeystoreWrapper((String)paramAFd1zSDK.getBody());
            if (paramAFd1zSDK != null) {
              AFa1eSDK.valueOf(AFa1eSDK.this, paramAFd1zSDK.optBoolean("send_background", false));
            }
          }
          if (bool) {
            AFa1eSDK.AFKeystoreWrapper(AFa1eSDK.this, System.currentTimeMillis());
          }
        }
        return;
      }
      if (((paramAFd1zSDK instanceof AFe1pSDK)) && (paramAFd1ySDK != AFd1ySDK.AFInAppEventParameterName))
      {
        paramAFd1zSDK = new AFe1rSDK(AFInAppEventType());
        paramAFd1ySDK = AFInAppEventType().AFVersionDeclaration();
        AFKeystoreWrapper.execute(new AFc1bSDK.4(paramAFd1ySDK, paramAFd1zSDK));
      }
    }
    
    public final void values(AFd1zSDK<?> paramAFd1zSDK)
    {
      if ((paramAFd1zSDK instanceof AFd1fSDK))
      {
        paramAFd1zSDK = (AFd1hSDK)paramAFd1zSDK;
        AFInAppEventType().afDebugLog().AFKeystoreWrapper(afInfoLog.AFLogger);
      }
    }
  }
  
  public final class AFa1ySDK
    implements Runnable
  {
    private final AFa1qSDK values;
    
    private AFa1ySDK(AFa1qSDK paramAFa1qSDK)
    {
      values = paramAFa1qSDK;
    }
    
    public final void run()
    {
      Object localObject;
      if (values.AFInAppEventParameterName())
      {
        localObject = new AFd1fSDK(values, AFInAppEventType());
        AFVersionDeclaration = AFa1eSDK.values(AFa1eSDK.this);
      }
      else
      {
        localObject = new AFd1hSDK(values, AFInAppEventType());
      }
      AFc1bSDK localAFc1bSDK = AFInAppEventType().AFVersionDeclaration();
      AFKeystoreWrapper.execute(new AFc1bSDK.4(localAFc1bSDK, (AFd1zSDK)localObject));
    }
  }
}

/* Location:
 * Qualified Name:     com.appsflyer.internal.AFa1eSDK
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */