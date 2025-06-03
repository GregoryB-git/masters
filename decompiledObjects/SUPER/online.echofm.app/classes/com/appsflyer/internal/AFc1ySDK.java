package com.appsflyer.internal;

import android.content.Context;
import androidx.annotation.NonNull;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.PurchaseHandler;
import java.util.AbstractCollection;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public final class AFc1ySDK
  implements AFc1xSDK
{
  private static final int AFKeystoreWrapper = (int)TimeUnit.SECONDS.toMillis(30L);
  private ExecutorService AFInAppEventParameterName;
  private ExecutorService AFInAppEventType;
  private AFc1nSDK AFLogger;
  private AFb1tSDK AFLogger$LogLevel;
  private AFe1vSDK AFVersionDeclaration;
  private AFe1wSDK AppsFlyer2dXConversionCallback;
  private AFb1wSDK afDebugLog;
  private AFb1gSDK afErrorLog;
  private AFc1bSDK afErrorLogForExcManagerOnly;
  private AFe1mSDK afInfoLog;
  private PurchaseHandler afRDLog;
  private AFf1iSDK afWarnLog;
  private AFf1oSDK getLevel;
  private AFc1dSDK init;
  private AFb1vSDK onAppOpenAttribution;
  private AFa1bSDK onAppOpenAttributionNative;
  private AFb1iSDK onAttributionFailureNative;
  private AFa1iSDK onConversionDataSuccess;
  private AFa1kSDK onDeepLinkingNative;
  private AFc1sSDK onInstallConversionDataLoadedNative;
  private AFf1tSDK onInstallConversionFailureNative;
  private AFf1vSDK onResponse;
  private AFb1eSDK onResponseErrorNative;
  private AFb1sSDK onResponseNative;
  public final AFb1bSDK valueOf = new AFb1bSDK();
  private ScheduledExecutorService values;
  
  @NonNull
  private ExecutorService onAppOpenAttribution()
  {
    try
    {
      if (AFInAppEventParameterName == null) {
        AFInAppEventParameterName = Executors.newSingleThreadExecutor();
      }
    }
    finally
    {
      break label32;
    }
    ExecutorService localExecutorService = AFInAppEventParameterName;
    return localExecutorService;
    label32:
    throw localExecutorService;
  }
  
  @NonNull
  private AFc1nSDK onAttributionFailureNative()
  {
    try
    {
      if (AFLogger == null)
      {
        AFc1nSDK localAFc1nSDK1 = new com/appsflyer/internal/AFc1nSDK;
        AFc1lSDK localAFc1lSDK = new com/appsflyer/internal/AFc1lSDK;
        localAFc1lSDK.<init>(AFKeystoreWrapper);
        localAFc1nSDK1.<init>(localAFc1lSDK, AFInAppEventType());
        AFLogger = localAFc1nSDK1;
      }
    }
    finally
    {
      break label54;
    }
    AFc1nSDK localAFc1nSDK2 = AFLogger;
    return localAFc1nSDK2;
    label54:
    throw localAFc1nSDK2;
  }
  
  @NonNull
  private AFc1sSDK onDeepLinking()
  {
    try
    {
      if (onInstallConversionDataLoadedNative == null)
      {
        AFc1sSDK localAFc1sSDK1 = new com/appsflyer/internal/AFc1sSDK;
        localAFc1sSDK1.<init>(this);
        onInstallConversionDataLoadedNative = localAFc1sSDK1;
      }
    }
    finally
    {
      break label39;
    }
    AFc1sSDK localAFc1sSDK2 = onInstallConversionDataLoadedNative;
    return localAFc1sSDK2;
    label39:
    throw localAFc1sSDK2;
  }
  
  @NonNull
  public final AFb1gSDK AFInAppEventParameterName()
  {
    try
    {
      if (afErrorLog != null) {
        break label75;
      }
      AFb1gSDK localAFb1gSDK = new com/appsflyer/internal/AFb1gSDK;
      AFb1bSDK localAFb1bSDK = init();
      AFb1cSDK localAFb1cSDK = new com/appsflyer/internal/AFb1cSDK;
      Context localContext = valueOf.AFInAppEventType;
      if (localContext != null)
      {
        localAFb1cSDK.<init>(AFa1eSDK.valueOf(localContext));
        localAFb1gSDK.<init>(localAFb1bSDK, localAFb1cSDK);
        afErrorLog = localAFb1gSDK;
      }
    }
    finally
    {
      break label84;
    }
    Object localObject2 = new java/lang/IllegalStateException;
    ((IllegalStateException)localObject2).<init>("Context must be set via setContext method before calling this dependency.");
    throw ((Throwable)localObject2);
    label75:
    localObject2 = afErrorLog;
    return (AFb1gSDK)localObject2;
    label84:
    throw ((Throwable)localObject2);
  }
  
  @NonNull
  public final ExecutorService AFInAppEventType()
  {
    try
    {
      if (AFInAppEventType == null) {
        AFInAppEventType = Executors.newCachedThreadPool();
      }
    }
    finally
    {
      break label32;
    }
    ExecutorService localExecutorService = AFInAppEventType;
    return localExecutorService;
    label32:
    throw localExecutorService;
  }
  
  @NonNull
  public final AFc1oSDK AFKeystoreWrapper()
  {
    return new AFc1oSDK(onAttributionFailureNative(), AFInAppEventParameterName(), AppsFlyerProperties.getInstance(), onInstallConversionFailureNative());
  }
  
  @NonNull
  public final AFe1vSDK AFLogger()
  {
    if (AFVersionDeclaration == null)
    {
      Context localContext = valueOf.AFInAppEventType;
      if (localContext != null)
      {
        if (onInstallConversionFailureNative == null) {
          onInstallConversionFailureNative = new AFf1sSDK();
        }
        AFf1tSDK localAFf1tSDK = onInstallConversionFailureNative;
        if (onResponseErrorNative == null) {
          onResponseErrorNative = new AFa1wSDK();
        }
        AFb1eSDK localAFb1eSDK = onResponseErrorNative;
        if (afWarnLog == null)
        {
          localObject = valueOf.AFInAppEventType;
          if (localObject != null) {
            afWarnLog = new AFf1hSDK((Context)localObject);
          } else {
            throw new IllegalStateException("Context must be set via setContext method before calling this dependency.");
          }
        }
        AFf1iSDK localAFf1iSDK = afWarnLog;
        if (onConversionDataSuccess == null) {
          onConversionDataSuccess = new AFa1jSDK();
        }
        Object localObject = onConversionDataSuccess;
        AFe1mSDK localAFe1mSDK = afDebugLog();
        AFb1dSDK localAFb1dSDK = values();
        AFb1gSDK localAFb1gSDK = AFInAppEventParameterName();
        if (onDeepLinkingNative == null) {
          onDeepLinkingNative = new AFa1kSDK();
        }
        AFVersionDeclaration = new AFb1nSDK(localContext, localAFf1tSDK, localAFb1eSDK, localAFf1iSDK, (AFa1iSDK)localObject, localAFe1mSDK, localAFb1dSDK, localAFb1gSDK, onDeepLinkingNative, afWarnLog(), new AFb1xSDK());
      }
      else
      {
        throw new IllegalStateException("Context must be set via setContext method before calling this dependency.");
      }
    }
    return AFVersionDeclaration;
  }
  
  @NonNull
  public final AFf1oSDK AFLogger$LogLevel()
  {
    try
    {
      if (getLevel == null)
      {
        AFf1oSDK localAFf1oSDK1 = new com/appsflyer/internal/AFf1oSDK;
        localAFf1oSDK1.<init>();
        getLevel = localAFf1oSDK1;
      }
    }
    finally
    {
      break label38;
    }
    AFf1oSDK localAFf1oSDK2 = getLevel;
    return localAFf1oSDK2;
    label38:
    throw localAFf1oSDK2;
  }
  
  @NonNull
  public final AFc1bSDK AFVersionDeclaration()
  {
    try
    {
      if (afErrorLogForExcManagerOnly == null)
      {
        ThreadPoolExecutor localThreadPoolExecutor = new java/util/concurrent/ThreadPoolExecutor;
        Object localObject2 = TimeUnit.SECONDS;
        LinkedBlockingQueue local4 = new com/appsflyer/internal/AFc1ySDK$4;
        local4.<init>();
        AFa1wSDK localAFa1wSDK = new com/appsflyer/internal/AFc1ySDK$AFa1wSDK;
        localAFa1wSDK.<init>();
        localThreadPoolExecutor.<init>(2, 6, 300L, (TimeUnit)localObject2, local4, localAFa1wSDK);
        localObject2 = new com/appsflyer/internal/s;
        ((s)localObject2).<init>();
        localThreadPoolExecutor.setRejectedExecutionHandler((RejectedExecutionHandler)localObject2);
        localObject2 = new com/appsflyer/internal/AFc1bSDK;
        ((AFc1bSDK)localObject2).<init>(localThreadPoolExecutor);
        afErrorLogForExcManagerOnly = ((AFc1bSDK)localObject2);
      }
    }
    finally
    {
      break label92;
    }
    AFc1bSDK localAFc1bSDK = afErrorLogForExcManagerOnly;
    return localAFc1bSDK;
    label92:
    throw localAFc1bSDK;
  }
  
  @NonNull
  public final AFb1sSDK AppsFlyer2dXConversionCallback()
  {
    try
    {
      if (onResponseNative == null)
      {
        AFb1sSDK localAFb1sSDK1 = new com/appsflyer/internal/AFb1sSDK;
        localAFb1sSDK1.<init>(this);
        onResponseNative = localAFb1sSDK1;
      }
    }
    finally
    {
      break label39;
    }
    AFb1sSDK localAFb1sSDK2 = onResponseNative;
    return localAFb1sSDK2;
    label39:
    throw localAFb1sSDK2;
  }
  
  @NonNull
  public final AFe1mSDK afDebugLog()
  {
    try
    {
      if (afInfoLog == null)
      {
        AFe1mSDK localAFe1mSDK1 = new com/appsflyer/internal/AFe1mSDK;
        localAFe1mSDK1.<init>(values());
        afInfoLog = localAFe1mSDK1;
      }
    }
    finally
    {
      break label42;
    }
    AFe1mSDK localAFe1mSDK2 = afInfoLog;
    return localAFe1mSDK2;
    label42:
    throw localAFe1mSDK2;
  }
  
  @NonNull
  public final PurchaseHandler afErrorLog()
  {
    try
    {
      if (afRDLog == null)
      {
        PurchaseHandler localPurchaseHandler1 = new com/appsflyer/PurchaseHandler;
        localPurchaseHandler1.<init>(this);
        afRDLog = localPurchaseHandler1;
      }
    }
    finally
    {
      break label39;
    }
    PurchaseHandler localPurchaseHandler2 = afRDLog;
    return localPurchaseHandler2;
    label39:
    throw localPurchaseHandler2;
  }
  
  @NonNull
  public final AFb1tSDK afErrorLogForExcManagerOnly()
  {
    try
    {
      if (AFLogger$LogLevel == null)
      {
        AFb1rSDK localAFb1rSDK = new com/appsflyer/internal/AFb1rSDK;
        localAFb1rSDK.<init>();
        AFLogger$LogLevel = localAFb1rSDK;
      }
    }
    finally
    {
      break label38;
    }
    AFb1tSDK localAFb1tSDK = AFLogger$LogLevel;
    return localAFb1tSDK;
    label38:
    throw localAFb1tSDK;
  }
  
  @NonNull
  public final AFb1vSDK afInfoLog()
  {
    try
    {
      if (onAppOpenAttribution == null)
      {
        AFb1vSDK localAFb1vSDK1 = new com/appsflyer/internal/AFb1vSDK;
        localAFb1vSDK1.<init>(init(), AFInAppEventParameterName());
        onAppOpenAttribution = localAFb1vSDK1;
      }
    }
    finally
    {
      break label46;
    }
    AFb1vSDK localAFb1vSDK2 = onAppOpenAttribution;
    return localAFb1vSDK2;
    label46:
    throw localAFb1vSDK2;
  }
  
  @NonNull
  public final AFb1wSDK afRDLog()
  {
    try
    {
      if (afDebugLog == null)
      {
        AFb1ySDK localAFb1ySDK = new com/appsflyer/internal/AFb1ySDK;
        localAFb1ySDK.<init>(values());
        AFe1zSDK localAFe1zSDK = new com/appsflyer/internal/AFe1zSDK;
        localAFe1zSDK.<init>(AFInAppEventParameterName(), localAFb1ySDK);
        AFb1wSDK localAFb1wSDK2 = new com/appsflyer/internal/AFb1wSDK;
        AFd1cSDK localAFd1cSDK = new com/appsflyer/internal/AFd1cSDK;
        localAFd1cSDK.<init>();
        AFb1gSDK localAFb1gSDK = AFInAppEventParameterName();
        AFe1wSDK localAFe1wSDK = afWarnLog();
        AFc1oSDK localAFc1oSDK = new com/appsflyer/internal/AFc1oSDK;
        localAFc1oSDK.<init>(onAttributionFailureNative(), AFInAppEventParameterName(), AppsFlyerProperties.getInstance(), onInstallConversionFailureNative());
        localAFb1wSDK2.<init>(localAFd1cSDK, localAFb1gSDK, localAFe1wSDK, localAFb1ySDK, localAFc1oSDK, localAFe1zSDK, AFVersionDeclaration());
        afDebugLog = localAFb1wSDK2;
      }
    }
    finally
    {
      break label124;
    }
    AFb1wSDK localAFb1wSDK1 = afDebugLog;
    return localAFb1wSDK1;
    label124:
    throw localAFb1wSDK1;
  }
  
  @NonNull
  public final AFe1wSDK afWarnLog()
  {
    try
    {
      if (AppsFlyer2dXConversionCallback == null)
      {
        AFe1wSDK localAFe1wSDK1 = new com/appsflyer/internal/AFe1wSDK;
        AFb1bSDK localAFb1bSDK = init();
        AFe1xSDK localAFe1xSDK = new com/appsflyer/internal/AFe1xSDK;
        localAFe1xSDK.<init>();
        localAFe1wSDK1.<init>(localAFb1bSDK, localAFe1xSDK);
        AppsFlyer2dXConversionCallback = localAFe1wSDK1;
      }
    }
    finally
    {
      break label53;
    }
    AFe1wSDK localAFe1wSDK2 = AppsFlyer2dXConversionCallback;
    return localAFe1wSDK2;
    label53:
    throw localAFe1wSDK2;
  }
  
  @NonNull
  public final AFf1iSDK getLevel()
  {
    if (afWarnLog == null)
    {
      Context localContext = valueOf.AFInAppEventType;
      if (localContext != null) {
        afWarnLog = new AFf1hSDK(localContext);
      } else {
        throw new IllegalStateException("Context must be set via setContext method before calling this dependency.");
      }
    }
    return afWarnLog;
  }
  
  @NonNull
  public final AFb1bSDK init()
  {
    try
    {
      AFb1bSDK localAFb1bSDK = valueOf;
      return localAFb1bSDK;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  @NonNull
  public final AFa1bSDK onAppOpenAttributionNative()
  {
    try
    {
      if (onAppOpenAttributionNative == null)
      {
        AFa1hSDK localAFa1hSDK = new com/appsflyer/internal/AFa1hSDK;
        localAFa1hSDK.<init>(init());
        onAppOpenAttributionNative = localAFa1hSDK;
      }
    }
    finally
    {
      break label42;
    }
    AFa1bSDK localAFa1bSDK = onAppOpenAttributionNative;
    return localAFa1bSDK;
    label42:
    throw localAFa1bSDK;
  }
  
  @NonNull
  public final AFb1eSDK onDeepLinkingNative()
  {
    if (onResponseErrorNative == null) {
      onResponseErrorNative = new AFa1wSDK();
    }
    return onResponseErrorNative;
  }
  
  @NonNull
  public final AFf1tSDK onInstallConversionDataLoadedNative()
  {
    if (onInstallConversionFailureNative == null) {
      onInstallConversionFailureNative = new AFf1sSDK();
    }
    return onInstallConversionFailureNative;
  }
  
  @NonNull
  public final AFc1dSDK onInstallConversionFailureNative()
  {
    try
    {
      if (init == null)
      {
        AFc1dSDK localAFc1dSDK1 = new com/appsflyer/internal/AFc1dSDK;
        localAFc1dSDK1.<init>(AFInAppEventParameterName(), values());
        init = localAFc1dSDK1;
      }
    }
    finally
    {
      break label46;
    }
    AFc1dSDK localAFc1dSDK2 = init;
    return localAFc1dSDK2;
    label46:
    throw localAFc1dSDK2;
  }
  
  @NonNull
  public final AFf1vSDK onResponseErrorNative()
  {
    if (onResponse == null) {
      onResponse = new AFf1ySDK();
    }
    return onResponse;
  }
  
  @NonNull
  public final AFb1iSDK onResponseNative()
  {
    if (onAttributionFailureNative == null)
    {
      ExecutorService localExecutorService = onAppOpenAttribution();
      AFb1sSDK localAFb1sSDK = AppsFlyer2dXConversionCallback();
      if (onResponse == null) {
        onResponse = new AFf1ySDK();
      }
      onAttributionFailureNative = new AFb1kSDK(localExecutorService, localAFb1sSDK, onResponse);
    }
    return onAttributionFailureNative;
  }
  
  @NonNull
  public final ScheduledExecutorService valueOf()
  {
    try
    {
      if (values == null) {
        values = Executors.newScheduledThreadPool(2);
      }
    }
    finally
    {
      break label33;
    }
    ScheduledExecutorService localScheduledExecutorService = values;
    return localScheduledExecutorService;
    label33:
    throw localScheduledExecutorService;
  }
  
  @NonNull
  public final AFb1dSDK values()
  {
    Context localContext = valueOf.AFInAppEventType;
    if (localContext != null) {
      return new AFb1cSDK(AFa1eSDK.valueOf(localContext));
    }
    throw new IllegalStateException("Context must be set via setContext method before calling this dependency.");
  }
  
  public static final class AFa1wSDK
    implements ThreadFactory
  {
    private static final AtomicInteger AFInAppEventParameterName = new AtomicInteger();
    private final AtomicInteger valueOf = new AtomicInteger();
    
    public AFa1wSDK()
    {
      AFInAppEventParameterName.incrementAndGet();
    }
    
    public final Thread newThread(Runnable paramRunnable)
    {
      int i = AFInAppEventParameterName.get();
      int j = valueOf.incrementAndGet();
      StringBuilder localStringBuilder = new StringBuilder("queue-");
      localStringBuilder.append(i);
      localStringBuilder.append("-");
      localStringBuilder.append(j);
      return new Thread(paramRunnable, localStringBuilder.toString());
    }
  }
}

/* Location:
 * Qualified Name:     com.appsflyer.internal.AFc1ySDK
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */