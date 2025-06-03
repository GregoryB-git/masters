package com.appsflyer.internal;

import android.content.Context;
import android.net.Uri;
import android.net.Uri.Builder;
import android.os.Build;
import android.os.Build.VERSION;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.deeplink.DeepLinkResult;
import com.appsflyer.deeplink.DeepLinkResult.Error;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Observable;
import java.util.Observer;
import java.util.TimeZone;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public final class AFb1mSDK
  extends AFe1jSDK
{
  private static String AFLogger$LogLevel = "https://%sdlsdk.%s/v1.0/android/";
  private final AFe1mSDK AFVersionDeclaration;
  private final ExecutorService AppsFlyer2dXConversionCallback;
  private final CountDownLatch afWarnLog = new CountDownLatch(1);
  private final List<AFf1pSDK> getLevel = new ArrayList();
  private final AFe1wSDK init;
  private final AFb1tSDK onAppOpenAttributionNative;
  private int onAttributionFailureNative;
  private boolean onConversionDataSuccess;
  private final AFb1sSDK onDeepLinkingNative;
  private final AFb1gSDK onInstallConversionDataLoadedNative;
  private final AFf1oSDK onInstallConversionFailureNative;
  private int onResponseErrorNative;
  private int onResponseNative;
  
  public AFb1mSDK(AFc1xSDK paramAFc1xSDK)
  {
    super(null, AFLogger$LogLevel, Boolean.FALSE, Boolean.TRUE, null);
    AFVersionDeclaration = paramAFc1xSDK.afDebugLog();
    onInstallConversionDataLoadedNative = paramAFc1xSDK.AFInAppEventParameterName();
    init = paramAFc1xSDK.afWarnLog();
    onInstallConversionFailureNative = paramAFc1xSDK.AFLogger$LogLevel();
    AppsFlyer2dXConversionCallback = paramAFc1xSDK.AFInAppEventType();
    onAppOpenAttributionNative = paramAFc1xSDK.afErrorLogForExcManagerOnly();
    onDeepLinkingNative = paramAFc1xSDK.AppsFlyer2dXConversionCallback();
  }
  
  private static boolean AFInAppEventParameterName(AFf1pSDK paramAFf1pSDK)
  {
    paramAFf1pSDK = (Long)AFInAppEventParameterName.get("click_ts");
    if (paramAFf1pSDK == null) {
      return false;
    }
    return System.currentTimeMillis() - TimeUnit.SECONDS.toMillis(paramAFf1pSDK.longValue()) < TimeUnit.DAYS.toMillis(1L);
  }
  
  private void AFKeystoreWrapper(AFf1pSDK paramAFf1pSDK)
  {
    if (AFInAppEventParameterName(paramAFf1pSDK))
    {
      getLevel.add(paramAFf1pSDK);
      afWarnLog.countDown();
      StringBuilder localStringBuilder = new StringBuilder("[DDL] Added non-organic ");
      localStringBuilder.append(paramAFf1pSDK.getClass().getSimpleName());
      AFLogger.afDebugLog(localStringBuilder.toString());
      return;
    }
    int i = onResponseErrorNative + 1;
    onResponseErrorNative = i;
    if (i == onAttributionFailureNative) {
      afWarnLog.countDown();
    }
  }
  
  private void AFLogger$LogLevel()
  {
    int i = onResponseNative;
    boolean bool = true;
    onResponseNative = (i + 1);
    Object localObject1 = new StringBuilder("[DDL] Preparing request ");
    ((StringBuilder)localObject1).append(onResponseNative);
    AFLogger.afDebugLog(localObject1.toString());
    if (onResponseNative == 1)
    {
      localObject1 = AFa1eSDK.valueOf();
      localObject2 = AFKeystoreWrapper;
      if (onInstallConversionDataLoadedNative.AFInAppEventType.values("appsFlyerCount", 0) != 0) {
        bool = false;
      }
      ((Map)localObject2).put("is_first", Boolean.valueOf(bool));
      localObject2 = AFKeystoreWrapper;
      localObject3 = new StringBuilder();
      ((StringBuilder)localObject3).append(Locale.getDefault().getLanguage());
      ((StringBuilder)localObject3).append("-");
      ((StringBuilder)localObject3).append(Locale.getDefault().getCountry());
      ((Map)localObject2).put("lang", localObject3.toString());
      AFKeystoreWrapper.put("os", Build.VERSION.RELEASE);
      AFKeystoreWrapper.put("type", Build.MODEL);
      localObject2 = AFKeystoreWrapper;
      localObject3 = onInstallConversionDataLoadedNative;
      ((Map)localObject2).put("request_id", AFb1zSDK.valueOf(valueOf, AFInAppEventType));
      localObject1 = afInfoLog;
      if (localObject1 != null)
      {
        localObject1 = AFInAppEventType;
        if (localObject1 != null) {
          AFKeystoreWrapper.put("sharing_filter", localObject1);
        }
      }
      localObject1 = values(AFa1cSDK.values(onInstallConversionDataLoadedNative.valueOf.AFInAppEventType, new HashMap()));
      localObject2 = values(AFa1cSDK.values(onInstallConversionDataLoadedNative.valueOf.AFInAppEventType));
      if (localObject1 != null) {
        AFKeystoreWrapper.put("gaid", localObject1);
      }
      if (localObject2 != null) {
        AFKeystoreWrapper.put("oaid", localObject2);
      }
    }
    localObject1 = AFKeystoreWrapper;
    Object localObject2 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS", Locale.US);
    long l = System.currentTimeMillis();
    ((DateFormat)localObject2).setTimeZone(TimeZone.getTimeZone("UTC"));
    ((Map)localObject1).put("timestamp", ((DateFormat)localObject2).format(new Date(l)));
    AFKeystoreWrapper.put("request_count", Integer.valueOf(onResponseNative));
    Object localObject3 = new ArrayList();
    localObject2 = getLevel.iterator();
    while (((Iterator)localObject2).hasNext())
    {
      localObject1 = valueOf((AFf1pSDK)((Iterator)localObject2).next());
      if (localObject1 != null) {
        ((List)localObject3).add(localObject1);
      }
    }
    if (!((List)localObject3).isEmpty()) {
      AFKeystoreWrapper.put("referrers", localObject3);
    }
    AFKeystoreWrapper(AppsFlyer2dXConversionCallback());
  }
  
  private String AppsFlyer2dXConversionCallback()
  {
    String str = init.AFInAppEventParameterName;
    Object localObject1 = onInstallConversionDataLoadedNative.valueOf.AFInAppEventType.getPackageName();
    Object localObject2 = onInstallConversionDataLoadedNative.values();
    if ((localObject2 != null) && (!((String)localObject2).trim().isEmpty())) {
      localObject2 = "-".concat((String)localObject2);
    } else {
      localObject2 = "";
    }
    Uri.Builder localBuilder = Uri.parse(String.format(AFLogger$LogLevel, new Object[] { AppsFlyerLib.getInstance().getHostPrefix(), AFa1eSDK.valueOf().getHostName() })).buildUpon();
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append((String)localObject1);
    localStringBuilder.append((String)localObject2);
    localObject2 = localBuilder.appendPath(localStringBuilder.toString());
    localObject1 = new StringBuilder();
    ((StringBuilder)localObject1).append(AFKeystoreWrapper.get("timestamp"));
    ((StringBuilder)localObject1).append(str);
    return ((Uri.Builder)localObject2).appendQueryParameter("af_sig", AFc1nSDK.valueOf(localObject1.toString(), str)).appendQueryParameter("sdk_version", AFa1eSDK.AFKeystoreWrapper).build().toString();
  }
  
  private boolean afWarnLog()
  {
    List localList = (List)AFKeystoreWrapper.get("referrers");
    int i;
    if (localList != null) {
      i = localList.size();
    } else {
      i = 0;
    }
    return (i < onAttributionFailureNative) && (!AFKeystoreWrapper.containsKey("referrers"));
  }
  
  private static Map<String, String> valueOf(AFf1pSDK paramAFf1pSDK)
  {
    if (afDebugLog == AFf1pSDK.AFa1zSDK.values)
    {
      HashMap localHashMap = new HashMap();
      String str = (String)AFInAppEventParameterName.get("referrer");
      if (str != null)
      {
        localHashMap.put("source", (String)AFInAppEventParameterName.get("source"));
        localHashMap.put("value", str);
        return localHashMap;
      }
    }
    return null;
  }
  
  private Map<String, Object> values(final AFc1uSDK.AFa1wSDK paramAFa1wSDK)
  {
    if ((paramAFa1wSDK != null) && (valueOf != null))
    {
      Boolean localBoolean = AFInAppEventType;
      if ((localBoolean == null) || (!localBoolean.booleanValue())) {
        new HashMap() {};
      }
    }
    return null;
  }
  
  public final AFd1vSDK AFInAppEventType()
  {
    return AFd1vSDK.afRDLog;
  }
  
  public final DeepLinkResult AFLogger()
  {
    AFLogger.afDebugLog("[DDL] start");
    Object localObject1 = new FutureTask(new Callable() {});
    AppsFlyer2dXConversionCallback.execute((Runnable)localObject1);
    try
    {
      localObject1 = (DeepLinkResult)((FutureTask)localObject1).get(onDeepLinkingNative.afInfoLog, TimeUnit.MILLISECONDS);
      AFVersionDeclaration.values((DeepLinkResult)localObject1, onDeepLinkingNative.afInfoLog);
      onDeepLinkingNative.AFInAppEventType((DeepLinkResult)localObject1);
      return (DeepLinkResult)localObject1;
    }
    catch (TimeoutException localTimeoutException) {}catch (InterruptedException localInterruptedException) {}catch (ExecutionException localExecutionException) {}
    AFLogger.afErrorLogForExcManagerOnly("[DDL] Timeout", localExecutionException);
    Object localObject2 = new StringBuilder("[DDL] Timeout, didn't manage to find deferred deep link after ");
    ((StringBuilder)localObject2).append(onResponseNative);
    ((StringBuilder)localObject2).append(" attempt(s) within ");
    ((StringBuilder)localObject2).append(onDeepLinkingNative.afInfoLog);
    ((StringBuilder)localObject2).append(" milliseconds");
    AFLogger.afDebugLog(localObject2.toString());
    localObject2 = new DeepLinkResult(null, DeepLinkResult.Error.TIMEOUT);
    AFVersionDeclaration.values((DeepLinkResult)localObject2, onDeepLinkingNative.afInfoLog);
    onDeepLinkingNative.AFInAppEventType((DeepLinkResult)localObject2);
    return (DeepLinkResult)localObject2;
    AFLogger.afErrorLog("[DDL] Error occurred", (Throwable)localObject2, true);
    if ((((Throwable)localObject2).getCause() instanceof IOException)) {
      localObject2 = DeepLinkResult.Error.NETWORK;
    } else {
      localObject2 = DeepLinkResult.Error.UNEXPECTED;
    }
    localObject2 = new DeepLinkResult(null, (DeepLinkResult.Error)localObject2);
    AFVersionDeclaration.values((DeepLinkResult)localObject2, onDeepLinkingNative.afInfoLog);
    onDeepLinkingNative.AFInAppEventType((DeepLinkResult)localObject2);
    return (DeepLinkResult)localObject2;
  }
}

/* Location:
 * Qualified Name:     com.appsflyer.internal.AFb1mSDK
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */